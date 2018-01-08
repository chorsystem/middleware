/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.bpel.model.resource;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;

import org.apache.xerces.parsers.DOMParser;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel4chor.model.pbd.Boolean;
import org.eclipse.bpel4chor.model.pbd.Elseif;
import org.eclipse.bpel4chor.model.pbd.ExtensibleElements;
import org.eclipse.bpel4chor.model.pbd.For;
import org.eclipse.bpel4chor.model.pbd.OpaqueBoolean;
import org.eclipse.bpel4chor.model.pbd.PbdFactory;
import org.eclipse.bpel4chor.model.pbd.RepeatEvery;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Until;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;

/**
 * BPELReader is invoked from BPELResourceImpl to parse the BPEL file and create
 * a Process object.
 */

@SuppressWarnings("nls")
public class BPELReader2 implements ErrorHandler {

	// The process we are reading
	private org.eclipse.bpel4chor.model.pbd.Process process = null;
	// Bugzilla 324165
	// The resource we are reading from
	private Resource fCurrentResource = null;
	// The successfully loaded resource
	private Resource fResource = null;
	// The document builder controls various DOM characteristics
	private DocumentBuilder docBuilder = null;
	// Registry for extensibility element serializers and deserializers
	

	private DOMParser fDOMParser;

	/** The XML Error handler */
	ErrorHandler fErrorHandler = null;

	/**
	 * The WS-BPEL Specification says how to resolve variables, taking into
	 * account scopes, etc. Technically, no one should override this behavior,
	 * but replacing this field with another implementation could allow you to
	 * optimize the search or provide different behavior.
	 */
	//public static VariableResolver VARIABLE_RESOLVER = new BPELVariableResolver();

	/**
	 * The WS-BPEL Specification says how to resolve links, taking into account
	 * scopes, etc. Technically, no one should override this behavior, but
	 * replacing this field with another implementation could allow you to
	 * optimize the search or provide different behavior.
	 */

	public static LinkResolver2 LINK_RESOLVER = new BPELLinkResolver2();

	List<Runnable> fPass2Runnables = new ArrayList<Runnable>();

	/**
	 * Construct a new BPELReader using the given DocumentBuilder to determine
	 * how the DOM tree is constructed.
	 * 
	 * @param builder
	 *            the document builder to use when parsing the file
	 * @throws IOException
	 *             if no document builder is specified
	 */
	public BPELReader2(DocumentBuilder builder) throws IOException {
		if (builder == null) {
//			throw new IOException(
//					BPELPlugin.INSTANCE
//							.getString("%BPELReader.missing_doc_builder"));
		}
		this.docBuilder = builder;
	}

	/**
	 * @param parser
	 */
	public BPELReader2(DOMParser parser) {
		this.fDOMParser = parser;
	}

	/**
	 * Read from the given Document into the given resource.
	 * 
	 * @param resource
	 *            the EMF resource to construct
	 * @param Document
	 *            the document to read the BPEL from
	 */
	public void read(Resource resource, Document doc) {
		this.fResource = resource;
		// Pass 1 and 2 are inside the try so they don't occur if
		// an error happens during parsing.
		// In pass 1 we parse and create the structural elements and attributes.
		pass1(doc);
		// In pass 2, we run any postLoadRunnables which need to happen after
		// pass 1 (for example, establishing object links to variables).
		//pass2();
	}

	/**
	 * 
	 */

	public BPELReader2() {
		this.fDOMParser = new LineCapturingDOMParser();

		// domParser.setProperty("http://xml.org/sax/features/namespaces",true);
		try {
			fDOMParser.setFeature(
					"http://apache.org/xml/features/dom/defer-node-expansion",
					false);
			fDOMParser.setFeature("http://apache.org/xml/features/xinclude",
					false);
		} catch (SAXNotRecognizedException e) {
			//BPELPlugin.log("Not Recognized DOM Parser Feature", e);
			System.out.println("Not Recognized DOM Parser Feature");
		} catch (SAXNotSupportedException e) {
			//BPELPlugin.log("Not Supported DOM Parser Feature", e);
			System.out.println("Not Supported DOM Parser Feature");
		}
	}

	/**
	 * Set the error handler
	 * 
	 * @param errorHandler
	 */

	public void setErrorHandler(ErrorHandler errorHandler) {
		fErrorHandler = errorHandler;
	}

	void armErrorHandler() {

		assert (docBuilder != null || fDOMParser != null);

		if (docBuilder != null) {
			docBuilder.setErrorHandler(fErrorHandler != null ? fErrorHandler
					: this);
		} else {
			fDOMParser.setErrorHandler(fErrorHandler != null ? fErrorHandler
					: this);
		}
	}

	Document read(InputSource inputSource) throws IOException, SAXException {
		assert (docBuilder != null || fDOMParser != null) : "No document builder/parser set";

		if (docBuilder != null) {
			return docBuilder.parse(inputSource);
		}
		fDOMParser.parse(inputSource);
		return fDOMParser.getDocument();
	}

	
	/**
	 * Return the resource that was used to read in this BPEL process.
	 * 
	 * @return the resource that was used to read in this BPEL process.
	 */

	public Resource getResource() {
		return fResource;
	}

	/**
	 * @param xmlSource
	 *            the XML source
	 * @param sourceDesciption
	 *            some textual description of the source (for example
	 *            Clipboard).
	 * @return a list of objects
	 */

	public List<EObject> fromXML(String xmlSource, String sourceDescription,
			Resource resource) {

		armErrorHandler();

		if (sourceDescription == null) {
			sourceDescription = "String";
		}

		Document doc = null;
		try {
			InputSource inputSource = new InputSource(new StringReader ( xmlSource ));
			inputSource.setPublicId( sourceDescription );
			// Bugzilla 324165
			// set the resource currently being loaded so the error handler can
			// attach diagnostics to it
			fCurrentResource = resource;
			doc = read (inputSource);
			
		} catch (SAXException sax) {
			// done by the handler.
		} catch (IOException ioe) {
			//BPELPlugin.log("I/O Error Reading BPEL XML", ioe);
			System.out.println("I/O Error Reading BPEL XML");
		} finally {

		}

		if (doc == null) {
			fCurrentResource = null;
			return Collections.emptyList();		
		}

		fResource = resource;

		// Pass 1 and 2 are inside the try so they don't occur if
		// an error happens during parsing.
		// In pass 1 we parse and create the structural elements and attributes.
		List<EObject> result = parseDocument(doc);
		// In pass 2, we run any postLoadRunnables which need to happen after
		// pass 1 (for example, establishing object links to variables).
		pass2();
		
		fCurrentResource = null;
		return result;		
	}

	/**
	 * In pass 1, we parse and create the structural elements and attributes,
	 * and add the process to the EMF resource's contents
	 * 
	 * @param document
	 *            the DOM document to parse
	 */
	protected void pass1(Document document) {
		org.eclipse.bpel4chor.model.pbd.Process p = xml2Resource(document);
		if (p != null) {
			fResource.getContents().add(p);
		}
	}

	/**
	 * In pass 2, we run any post load runnables which were queued during pass
	 * 1.
	 */
	protected void pass2() {
		try {
			//@hahnml: Changed to a while loop to avoid a ConcurrentModificationException if a ExtensionActivity adds new runnables during the execution of its own runnable
			int i = 0;
			while (i < fPass2Runnables.size()) {
				Runnable r = fPass2Runnables.get(i);
				r.run();
				i++;
			}
		} finally {
			fPass2Runnables.clear();
		}
	}

	/**
	 * Returns a list of child nodes of <code>parentElement</code> that are
	 * {@link Element}s. Returns an empty list if no elements are found.
	 * 
	 * @param parentElement
	 *            the element to find the children of
	 * @return a node list of the children of parentElement
	 */
	protected List<Element> getChildElements(Element parentElement) {
		List<Element> list = new ArrayList<Element>();
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeType() == Node.ELEMENT_NODE)
				list.add((Element) children.item(i));
		}
		return list;
	}

	/**
	 * Returns a list of child nodes of <code>parentElement</code> that are
	 * {@link Element}s with a BPEL namespace that have the given
	 * <code>localName</code>. Returns an empty list if no matching elements are
	 * found.
	 * 
	 * @param parentElement
	 *            the element to find the children of
	 * @param localName
	 *            the localName to match against
	 * @return a node list of the matching children of parentElement
	 */
	public List<Element> getBPELChildElementsByLocalName(Element parentElement,
			String localName) {
		List<Element> list = new ArrayList<Element>();
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			if (localName.equals(node.getLocalName())
					&& isBPELElement(node)) {
				list.add((Element) node);
			}
		}
		return list;
	}

	/**
	 * Returns the first child node of <code>parentElement</code> that is an
	 * {@link Element} with a BPEL namespace and the given
	 * <code>localName</code>, or <code>null</code> if a matching element is not
	 * found.
	 * 
	 * @param parentElement
	 *            the element to find the children of
	 * @param localName
	 *            the localName to match against
	 * @return the first matching element, or null if no element was found
	 */
	public Element getBPELChildElementByLocalName(Element parentElement,
			String localName) {
		NodeList children = parentElement.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			if (localName.equals(node.getLocalName())
					&& isBPELElement(node)) {
				return (Element) node;
			}
		}
		return null;
	}

	

	

	/**
	 * Given a DOM Element, find the child element which is a BPEL activity (of
	 * some type), parse it, and return the Activity.
	 * 
	 * @param element
	 *            the element in which to find an activity
	 * @return the activity, or null if no activity could be found
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity getChildActivity(Element element) {
		NodeList activityElements = element.getChildNodes();
		for (int i = 0; i < activityElements.getLength(); i++) {
			if (activityElements.item(i).getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}

			Element activityElement = (Element) activityElements.item(i);
			org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);

			if (activity != null) {
				return activity;
			}
		}
		return null;
	}
	
	/**
	 * Sets the standard attributes (name, joinCondition, and
	 * suppressJoinFailure).
	 */
	// @hahnml: Changed visibility to public
	public void setStandardAttributes(Element activityElement, org.eclipse.bpel4chor.model.pbd.Activity activity) {

		// Set name
		Attr name = activityElement.getAttributeNode("name");

		/*
		 * @sonntamo Replace "if" condition. Otherwise the condition always
		 * evaluates to false although name attribute is given.
		 */
		// if (name != null && name.getSpecified())
		if (name != null)
			activity.setName(name.getValue());


		
	}

	
	
	

	/**
	 * 
	 */
	protected List<EObject> parseDocument(Document document) {

		Element element = (document != null) ? document.getDocumentElement()
				: null;
		List<EObject> list = new ArrayList<EObject>();
		if (element == null) {
			return list;
		}

		if (element.getLocalName().equals("bag")) {

			for (Node n = element.getFirstChild(); n != null; n = n
					.getNextSibling()) {
				if (n instanceof Element == false) {
					continue;
				}
				EObject next = parseElement((Element) n);
				if (next != null) {
					list.add(next);
				}
			}

		} else {
			EObject next = parseElement(element);
			if (next != null) {
				list.add(next);
			}
		}
		return list;
	}

	EObject parseElement(Element element) {

		Method parseMethod = getParseMethod(element);
		if (parseMethod == null) {
			return null;
		}
		try {
			return (EObject) parseMethod.invoke(this, element);
		} catch (Throwable t) {
			t.printStackTrace();
			//
		}
		return null;
	}

	Method getParseMethod(Element element) {
		if (isBPELElement(element) == false) {
			return null;
		}

		String methodName = element.getLocalName();
		methodName = "xml2" + Character.toUpperCase(methodName.charAt(0))
				+ methodName.substring(1);

		return lookupMethod(getClass(), methodName, Element.class);
	}

	Method lookupMethod(Class<?> target, String methodName, Class<?>... args) {
		if (target == null || target == Object.class) {
			return null;
		}

		for (Method m : target.getDeclaredMethods()) {
			if (methodName.equals(m.getName()) == false
					|| m.getParameterTypes().length != args.length) {
				continue;
			}
			Class<?> argTypes[] = m.getParameterTypes();
			for (int i = 0; i < args.length; i++) {
				if (argTypes[i].isAssignableFrom(args[i]) == false) {
					continue;
				}
			}
			return m;
		}
		return lookupMethod(target.getSuperclass(), methodName, args);

	}

	/**
	 * Converts an XML document to a BPEL Resource object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Process xml2Resource(Document document) {
		Element processElement = (document != null) ? document
				.getDocumentElement() : null;
		if (processElement == null) {
			return null;
		}
		return xml2Process(processElement);
	}

	/**
	 * Converts an XML process to a BPEL Process object.
	 */
	@SuppressWarnings("nls")
	protected org.eclipse.bpel4chor.model.pbd.Process xml2Process(Element processElement) {
		if (!processElement.getLocalName().equals("process")) {
			return null;
		}
		
		process = PbdFactory.eINSTANCE.createProcess();

		// Save all the references to external namespaces
		//saveNamespacePrefix(process, processElement);

		// weissas:
		// Necessary, as PBD from BPEL4Chor may contain no elements that
		// allow the determination of the process (e.g. import)
		// The XPathMap is initialized with this statement
		//XPathMapProvider.getInstance().getXPathMap(process);
		
		// Handle Process element
		if (processElement.hasAttribute("name"))
			process.setName(processElement.getAttribute("name"));

		if (processElement.hasAttribute("targetNamespace"))
			process.setTargetNamespace(processElement
					.getAttribute("targetNamespace"));

		if (processElement.hasAttribute("queryLanguage"))
			process.setQueryLanguage(processElement
					.getAttribute("queryLanguage"));

		if (processElement.hasAttribute("expressionLanguage"))
			process.setExpressionLanguage(processElement
					.getAttribute("expressionLanguage"));
		
//		if (processElement.hasAttribute("wsu:Id")){
//			process.setExtensionAttribute(new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id", "wsu"),  processElement.getAttributeNode("wsu:Id"));
//		}
		
		setWSUID(processElement, process);
		
	

		// Handle CorrelationSets Element
		Element correlationSetsElement = getBPELChildElementByLocalName(
				processElement, "correlationSets");
		if (correlationSetsElement != null)
			process.setCorrelationSets(xml2CorrelationSets(correlationSetsElement));

		// Handle MessageExchanges Element
		Element messageExchangesElements = getBPELChildElementByLocalName(
				processElement, "messageExchanges");
		if (messageExchangesElements != null)
			process.setMessageExchanges(xml2MessageExchanges(messageExchangesElements));

		// Handle Activity elements
		org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(processElement);
		process.setActivity(activity);

		//@weissas
		//setWSUID(processElement, process);
		
		return process;
	}


	

	public org.eclipse.bpel4chor.model.pbd.CorrelationSets xml2CorrelationSets(Element correlationSetsElement) {
		if (!correlationSetsElement.getLocalName().equals("correlationSets"))
			return null;

		org.eclipse.bpel4chor.model.pbd.CorrelationSets correlationSets = PbdFactory.eINSTANCE
				.createCorrelationSets();
		

		for (Element e : getBPELChildElementsByLocalName(
				correlationSetsElement, "correlationSet")) {
			correlationSets.getCorrelationSet().add(xml2CorrelationSet(e));
		}

		//xml2ExtensibleElement(correlationSets, correlationSetsElement);

		return correlationSets;
	}



	public org.eclipse.bpel4chor.model.pbd.MessageExchanges xml2MessageExchanges(Element messageExchangesElement) {
		if (!messageExchangesElement.getLocalName().equals("messageExchanges"))
			return null;

		org.eclipse.bpel4chor.model.pbd.MessageExchanges messageExchanges = PbdFactory.eINSTANCE
				.createMessageExchanges();
		

		for (Element e : getBPELChildElementsByLocalName(
				messageExchangesElement, "messageExchange")) {
			messageExchanges.getMessageExchange().add(xml2MessageExchange(e));
		}

		//xml2ExtensibleElement(messageExchanges, messageExchangesElement);

		return messageExchanges;
	}

	

	/**
	 * Converts an XML correlationSet element to a BPEL CorrelationSet object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.CorrelationSet xml2CorrelationSet(Element correlationSetElement) {
		org.eclipse.bpel4chor.model.pbd.CorrelationSet correlationSet = PbdFactory.eINSTANCE
				.createCorrelationSet();


		if (correlationSetElement == null)
			return correlationSet;

		// Set name
		Attr name = correlationSetElement.getAttributeNode("name");

		if (name != null && name.getSpecified())
			correlationSet.setName(name.getValue());

		//setProperties(correlationSetElement, correlationSet, "properties");

		//xml2ExtensibleElement(correlationSet, correlationSetElement);

		return correlationSet;
	}

	/**
	 * Converts an XML messageExchange element to a BPEL MessageExchange object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.MessageExchange xml2MessageExchange(Element messageExchangeElement) {
		if (!messageExchangeElement.getLocalName().equals("messageExchange"))
			return null;

		org.eclipse.bpel4chor.model.pbd.MessageExchange messageExchange = PbdFactory.eINSTANCE
				.createMessageExchange();
		
		// Set name
		if (messageExchangeElement.hasAttribute("name"))
			messageExchange
					.setName(messageExchangeElement.getAttribute("name"));

		//xml2ExtensibleElement(messageExchange, messageExchangeElement);

		return messageExchange;
	}

	


	

	/**
	 * Converts an XML activity element to a BPEL Activity object.
	 */
	public org.eclipse.bpel4chor.model.pbd.Activity xml2Activity(Element activityElement) {
		org.eclipse.bpel4chor.model.pbd.Activity activity = null;
	
		String localName = activityElement.getLocalName();
		if (localName.equals("process")) {
			activity = getChildActivity(activityElement);
		} else if (localName.equals("receive")) {
			activity = xml2Receive(activityElement);
		} else if (localName.equals("reply")) {
			activity = xml2Reply(activityElement);
		} else if (localName.equals("invoke")) {
			activity = xml2Invoke(activityElement);
		} else if (localName.equals("assign")) {
			activity = xml2Assign(activityElement);
		} 
			else if (localName.equals("throw")) {
			activity = xml2Throw(activityElement);
		} else if (localName.equals("wait")) {
			activity = xml2Wait(activityElement);
		} else if (localName.equals("empty")) {
			activity = xml2Empty(activityElement);
		} else if (localName.equals("sequence")) {
			activity = xml2Sequence(activityElement);
		} else if (localName.equals("if")) {
			activity = xml2If(activityElement);
		} else if (localName.equals("while")) {
			activity = xml2While(activityElement);
		} else if (localName.equals("pick")) {
			activity = xml2Pick(activityElement);
		} else if (localName.equals("flow")) {
			activity = xml2Flow(activityElement);
		} else if (localName.equals("scope")) {
			activity = xml2Scope(activityElement);
		} else if (localName.equals("compensate")) {
			activity = xml2Compensate(activityElement);
		} else if (localName.equals("compensateScope")) {
			activity = xml2CompensateScope(activityElement);
		} else if (localName.equals("rethrow")) {
			activity = xml2Rethrow(activityElement);
		
		} else if (localName.equals("opaqueActivity")) {
			activity = xml2OpaqueActivity(activityElement);
		} else if (localName.equals("forEach")) {
			activity = xml2ForEach(activityElement);
		} else if (localName.equals("repeatUntil")) {
			activity = xml2RepeatUntil(activityElement);
		} else if (localName.equals("validate")) {
			activity = xml2Validate(activityElement);
		} 
		else {
			return null;
		}

		setStandardElements(activityElement, activity);

		if(!localName.equals("process")){
			//weissas: set wsu:id
			setWSUID(activityElement, activity);
		}
		
		

		return activity;
	}

	protected void setStandardElements(Element activityElement,
			org.eclipse.bpel4chor.model.pbd.Activity activity) {
		// Handle targets
		Element targetsElement = getBPELChildElementByLocalName(
				activityElement, "targets");
		if (targetsElement != null) {
			activity.setTargets(xml2Targets(targetsElement));
		}

		// Handle sources
		Element sourcesElement = getBPELChildElementByLocalName(
				activityElement, "sources");
		if (sourcesElement != null) {
			activity.setSources(xml2Sources(sourcesElement));
		}
	}

	protected org.eclipse.bpel4chor.model.pbd.Targets xml2Targets(Element targetsElement) {
		org.eclipse.bpel4chor.model.pbd.Targets targets = PbdFactory.eINSTANCE.createTargets();
		
		for (Element e : getBPELChildElementsByLocalName(targetsElement,
				"target")) {
			targets.getTarget().add(xml2Target(e));
		}
		// Join condition
		Element joinConditionElement = getBPELChildElementByLocalName(
				targetsElement, "joinCondition");
		if (joinConditionElement != null) {
			//targets.setJoinCondition(xml2Condition(joinConditionElement));
		}
		//xml2ExtensibleElement(targets, targetsElement);

		return targets;
	}

	protected org.eclipse.bpel4chor.model.pbd.Target xml2Target(Element targetElement) {

		final org.eclipse.bpel4chor.model.pbd.Target target = PbdFactory.eINSTANCE.createTarget();
		

		// Save all the references to external namespaces
		//saveNamespacePrefix(target, targetElement);

		//xml2ExtensibleElement(target, targetElement);

		if (targetElement.hasAttribute("linkName")) {
			final String linkName = targetElement.getAttribute("linkName");
			
//			
//			fPass2Runnables.add(new Runnable() {
//				public void run() {
//					org.eclipse.bpel4chor.model.pbd.Link link = getLink(target.g, linkName);
//					if (link != null)
//						target.setLink(link);
//					else
//						target.setLink(new LinkProxy(getResource().getURI(),
//								linkName));
//				}
//			});
		}
			
		return target;
	}

	protected org.eclipse.bpel4chor.model.pbd.Sources xml2Sources(Element sourcesElement) {
		org.eclipse.bpel4chor.model.pbd.Sources sources = PbdFactory.eINSTANCE.createSources();
		
		for (Element e : getBPELChildElementsByLocalName(sourcesElement,
				"source")) {
			sources.getSource().add(xml2Source(e));
		}
		//xml2ExtensibleElement(sources, sourcesElement);

		return sources;
	}

	protected org.eclipse.bpel4chor.model.pbd.Source xml2Source(Element sourceElement) {
		final String linkName = sourceElement.getAttribute("linkName");
		final org.eclipse.bpel4chor.model.pbd.Source source = PbdFactory.eINSTANCE.createSource();
		

		// Save all the references to external namespaces
		//saveNamespacePrefix(source, sourceElement);

		// Read transitionCondition element
		Element transitionConditionElement = getBPELChildElementByLocalName(
				sourceElement, "transitionCondition");
		if (transitionConditionElement != null) {
//			Condition transitionCondition = xml2Condition(transitionConditionElement);
//			source.setTransitionCondition(transitionCondition);
		}

		//xml2ExtensibleElement(source, sourceElement);

//		fPass2Runnables.add(new Runnable() {
//			public void run() {
//				Link link = getLink(source.getActivity(), linkName);
//				if (link != null)
//					source.setLink(link);
//				else
//					source.setLink(new LinkProxy(getResource().getURI(),
//							linkName));
//			}
//		});
		return source;
	}

	/**
	 * Converts an XML scope element to a BPEL Scope object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Scope(Element scopeElement) {

		org.eclipse.bpel4chor.model.pbd.Scope scope = PbdFactory.eINSTANCE.createScope();
		
		// if (scopeElement == null) {
		// return scope;
		// }

		Attr name = scopeElement.getAttributeNode("name");

		if (name != null && name.getSpecified()) {
			scope.setName(name.getValue());
		}

		Attr isolated = scopeElement.getAttributeNode("isolated");

		if (isolated != null && isolated.getSpecified()){
			
			if(isolated.equals("yes")){
				scope.setIsolated(Boolean.YES);
			}
			else{
				scope.setIsolated(Boolean.NO);
			}
		}
			
		// Handle attribute exitOnStandardFault
		Attr exitOnStandardFault = scopeElement
				.getAttributeNode("exitOnStandardFault");
		if (exitOnStandardFault != null && exitOnStandardFault.getSpecified()){
			
			
			if(exitOnStandardFault.equals("yes")){
				scope.setExitOnStandardFault(Boolean.YES);
			}
			else{
				scope.setExitOnStandardFault(Boolean.NO);
			}			
		}


		// Handle CorrelationSet element
		Element correlationSetsElement = getBPELChildElementByLocalName(
				scopeElement, "correlationSets");
		if (correlationSetsElement != null) {
			org.eclipse.bpel4chor.model.pbd.CorrelationSets correlationSets = xml2CorrelationSets(correlationSetsElement);
			scope.setCorrelationSets(correlationSets);
		}


		// MessageExchanges element
		Element messageExchangesElement = getBPELChildElementByLocalName(
				scopeElement, "messageExchanges");
		if (messageExchangesElement != null) {
			org.eclipse.bpel4chor.model.pbd.MessageExchanges messageExchanges = xml2MessageExchanges(messageExchangesElement);
			scope.setMessageExchanges(messageExchanges);
		}


		setStandardAttributes(scopeElement, scope);

		// Handle activities
		NodeList scopeElements = scopeElement.getChildNodes();

		Element activityElement = null;

		if (scopeElements != null && scopeElements.getLength() > 0) {

			for (int i = 0; i < scopeElements.getLength(); i++) {
				if (scopeElements.item(i).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}

				activityElement = (Element) scopeElements.item(i);

				if (activityElement.getLocalName().equals("faultHandlers")
						|| activityElement.getLocalName().equals(
								"compensationHandler")) {
					continue;
				}

				org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);
				if (activity != null) {
					scope.setActivity(activity);
					break;
				}
			}
		}

		return scope;
	}

	/**
	 * Converts an XML flow element to a BPEL Flow object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Flow(Element flowElement) {

		org.eclipse.bpel4chor.model.pbd.Flow flow = PbdFactory.eINSTANCE.createFlow();

		// if (flowElement == null) {
		// return flow;
		// }

		Attr name = flowElement.getAttributeNode("name");

		if (name != null && name.getSpecified())
			flow.setName(name.getValue());

		Element linksElement = getBPELChildElementByLocalName(flowElement,
				"links");
		if (linksElement != null) {
			org.eclipse.bpel4chor.model.pbd.Links links = xml2Links(linksElement);
			flow.setLinks(links);
		}

//		Element completionConditionElement = getBPELChildElementByLocalName(
//				flowElement, "completionCondition");
//		if (completionConditionElement != null) {
//			org.eclipse.bpel4chor.model.pbd.CompletionCondition completionCondition = xml2CompletionCondition(completionConditionElement);
//			flow.set(completionCondition);
//		}

		setStandardAttributes(flowElement, flow);

		NodeList flowElements = flowElement.getChildNodes();

		Element activityElement = null;

		if (flowElements != null && flowElements.getLength() > 0) {

			for (int i = 0; i < flowElements.getLength(); i++) {
				if ((flowElements.item(i).getNodeType() != Node.ELEMENT_NODE)
						|| ((Element) flowElements.item(i)).getLocalName()
								.equals("links"))
					continue;

				activityElement = (Element) flowElements.item(i);
				org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);
				if (activity != null) {
					flow.getActivity().add(activity);
				}
			}
		}

		return flow;
	}

	protected org.eclipse.bpel4chor.model.pbd.Links xml2Links(Element linksElement) {
		if (!linksElement.getLocalName().equals("links"))
			return null;

		org.eclipse.bpel4chor.model.pbd.Links links = PbdFactory.eINSTANCE.createLinks();

		for (Element e : getBPELChildElementsByLocalName(linksElement, "link")) {
			links.getLink().add(xml2Link(e));
		}

		// extensibility elements
		//xml2ExtensibleElement(links, linksElement);

		return links;
	}

	/**
	 * Converts an XML link element to a BPEL Link object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Link xml2Link(Element linkElement) {
		org.eclipse.bpel4chor.model.pbd.Link link = PbdFactory.eINSTANCE.createLink();

		Attr name = linkElement.getAttributeNode("name");

		if (name != null && name.getSpecified())
			link.setName(name.getValue());

		//xml2ExtensibleElement(link, linkElement);
		
		//@weissas
		setWSUID(linkElement, link);
		
		return link;
	}

	/**
	 * Converts an XML pick element to a BPEL Pick object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Pick(Element pickElement) {
		org.eclipse.bpel4chor.model.pbd.Pick pick = PbdFactory.eINSTANCE.createPick();
		
		// Set name
		Attr name = pickElement.getAttributeNode("name");

		if (name != null && name.getSpecified())
			pick.setName(name.getValue());

		// Set createInstance
		Attr createInstance = pickElement.getAttributeNode("createInstance");

		if (createInstance != null && createInstance.getSpecified()){
			
			if(createInstance.equals("yes")){
				pick.setCreateInstance(Boolean.YES);
			}
			else{
				pick.setCreateInstance(Boolean.NO);
			}
		}
			
		NodeList pickElements = pickElement.getChildNodes();

		Element pickInstanceElement = null;

		if (pickElements != null && pickElements.getLength() > 0) {

			for (int i = 0; i < pickElements.getLength(); i++) {
				if (pickElements.item(i).getNodeType() != Node.ELEMENT_NODE)
					continue;

				pickInstanceElement = (Element) pickElements.item(i);

				if (pickInstanceElement.getLocalName().equals("onAlarm")) {
					org.eclipse.bpel4chor.model.pbd.OnAlarm onAlarm = xml2OnAlarm(pickInstanceElement);

					pick.getOnAlarm().add(onAlarm);
				} else if (pickInstanceElement.getLocalName().equals(
						"onMessage")) {
					org.eclipse.bpel4chor.model.pbd.OnMessage onMessage = xml2OnMessage(pickInstanceElement);

					pick.getOnMessage().add(onMessage);
				}
			}
		}

		setStandardAttributes(pickElement, pick);

		return pick;
	}

	

	/**
	 * Converts an XML onMessage element to a BPEL OnMessage object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.OnMessage xml2OnMessage(Element onMessageElement) {
		org.eclipse.bpel4chor.model.pbd.OnMessage onMessage = PbdFactory.eINSTANCE.createOnMessage();

		// Set activity
		onMessage.setActivity(getChildActivity(onMessageElement));


		// Set messageExchange
		setMessageExchange(onMessageElement, onMessage);

		//xml2ExtensibleElement(onMessage, onMessageElement);

		// weissas: set wsu:id for choreographed workflows
		setWSUID(onMessageElement, onMessage);
		
		return onMessage;
	}

	

	/**
	 * Converts an XML onAlarm element to a BPEL OnAlarm object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.OnAlarm xml2OnAlarm(Element onAlarmElement) {
		org.eclipse.bpel4chor.model.pbd.OnAlarm onAlarm = PbdFactory.eINSTANCE.createOnAlarm();
	
		// Save all the references to external namespaces
		//saveNamespacePrefix(onAlarm, onAlarmElement);

		// Set for element
		Element forElement = getBPELChildElementByLocalName(onAlarmElement,
				"for");
		if (forElement != null) {
			org.eclipse.bpel4chor.model.pbd.Expression expression = xml2Expression(forElement);
			For _for = PbdFactory.eINSTANCE.createFor();
			_for.setBody(expression.getBody());
			_for.setExpressionLanguage(expression.getExpressionLanguage());
			_for.setId(expression.getId());
			_for.setOpaque(expression.getOpaque());
			onAlarm.setFor(_for);
		}

		// Set until element
		Element untilElement = getBPELChildElementByLocalName(onAlarmElement,
				"until");
		if (untilElement != null) {
			org.eclipse.bpel4chor.model.pbd.Expression expression = xml2Expression(untilElement);
			
			Until _until = PbdFactory.eINSTANCE.createUntil();
			_until.setBody(expression.getBody());
			_until.setExpressionLanguage(expression.getExpressionLanguage());
			_until.setId(expression.getId());
			_until.setOpaque(expression.getOpaque());
			onAlarm.setUntil(_until);
			
		}

		// Set repeatEvery element
		Element repeatEveryElement = getBPELChildElementByLocalName(
				onAlarmElement, "repeatEvery");
		if (repeatEveryElement != null) {
			org.eclipse.bpel4chor.model.pbd.Expression expression = xml2Expression(repeatEveryElement);
			
			
			RepeatEvery _repeatEvery = PbdFactory.eINSTANCE.createRepeatEvery();
			_repeatEvery.setBody(expression.getBody());
			_repeatEvery.setExpressionLanguage(expression.getExpressionLanguage());
			_repeatEvery.setId(expression.getId());
			_repeatEvery.setOpaque(expression.getOpaque());
		
			onAlarm.setRepeatEvery(_repeatEvery);
		}

		// Set activity
		onAlarm.setActivity(getChildActivity(onAlarmElement));

		//xml2ExtensibleElement(onAlarm, onAlarmElement);

		return onAlarm;
	}

	/**
	 * Converts an XML while element to a BPEL While object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2While(Element whileElement) {
		org.eclipse.bpel4chor.model.pbd.While _while = PbdFactory.eINSTANCE.createWhile();
		

		// Handle condition element
		Element conditionElement = getBPELChildElementByLocalName(whileElement,
				"condition");
		if (conditionElement != null) {
			org.eclipse.bpel4chor.model.pbd.Condition condition = xml2Condition(conditionElement);
			_while.setCondition(condition);
		}

		NodeList whileElements = whileElement.getChildNodes();

		Element activityElement = null;

		if (whileElements != null && whileElements.getLength() > 0) {

			for (int i = 0; i < whileElements.getLength(); i++) {
				if (whileElements.item(i).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}

				activityElement = (Element) whileElements.item(i);
				org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);
				if (activity != null) {
					_while.setActivity(activity);
					// only the first one
					break;
				}

			}
		}

		setStandardAttributes(whileElement, _while);

		return _while;
	}


	/**
	 * Converts an XML if element to a BPEL If object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2If(Element ifElement) {
		org.eclipse.bpel4chor.model.pbd.If _if = PbdFactory.eINSTANCE.createIf();
		
		// Set activity
		org.eclipse.bpel4chor.model.pbd.Activity activity = getChildActivity(ifElement);
		if (activity != null) {
			_if.setActivity(activity);
		}

		// Handle condition element
		Element conditionElement = getBPELChildElementByLocalName(ifElement,
				"condition");
		if (conditionElement != null) {
			org.eclipse.bpel4chor.model.pbd.Condition condition = xml2Condition(conditionElement);
			_if.setCondition(condition);
		}

		// Handle elseif
		for (Element e : getBPELChildElementsByLocalName(ifElement, "elseif")) {
			_if.getElseif().add(xml2ElseIf(e));
		}

		// Handle else
		Element elseElement = getBPELChildElementByLocalName(ifElement, "else");
		if (elseElement != null) {
			org.eclipse.bpel4chor.model.pbd.Else _else = xml2Else(elseElement);
			_if.setElse(_else);
		}

		setStandardAttributes(ifElement, _if);

		return _if;
	}

	/**
	 * Converts an XML elseIf element to a BPEL ElseIf object.
	 */
	protected Elseif xml2ElseIf(Element elseIfElement) {
		Elseif elseIf = PbdFactory.eINSTANCE.createElseif();
		
		// Save all the references to external namespaces
		//saveNamespacePrefix(elseIf, elseIfElement);

		// Handle condition element
		Element conditionElement = getBPELChildElementByLocalName(
				elseIfElement, "condition");
		if (conditionElement != null) {
			org.eclipse.bpel4chor.model.pbd.Condition condition = xml2Condition(conditionElement);
			elseIf.setCondition(condition);
		}

		//@weissas
		setWSUID(elseIfElement, elseIf);
		
		// Set activity
		org.eclipse.bpel4chor.model.pbd.Activity activity = getChildActivity(elseIfElement);
		if (activity != null) {
			elseIf.setActivity(activity);
		}

		return elseIf;
	}

	/**
	 * Converts an XML condition element to a BPEL Condition object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Condition xml2Condition(Element conditionElement) {
		org.eclipse.bpel4chor.model.pbd.Condition condition = PbdFactory.eINSTANCE.createCondition();
		xml2Expression(conditionElement, condition);
		return condition;
	}

	/**
	 * Converts an XML expression element to a BPEL Expression object.
	 * 
	 * Accept a pre-constructed argument. This is good for sub-types of
	 * expression.
	 * 
	 * Returns the second argument as a convenience.
	 * 
	 */
	protected org.eclipse.bpel4chor.model.pbd.Expression xml2Expression(Element expressionElement,
			org.eclipse.bpel4chor.model.pbd.Expression expression) {

		if (expressionElement == null) {
			return expression;
		}

		// Set expressionLanguage
		if (expressionElement.hasAttribute("expressionLanguage")) {
			expression.setExpressionLanguage(expressionElement
					.getAttribute("expressionLanguage"));
		}

		// Set opaque
		if (expressionElement.hasAttribute("opaque")) {
			
			if(expressionElement.getAttribute("opaque").equals("yes")){
				expression.setOpaque(OpaqueBoolean.YES);
			}
			else{
				expression.setOpaque(OpaqueBoolean.NO);
			}
			
		}

		String data = getText(expressionElement);
		if (data != null) {
			expression.setBody(data);
		}

		return expression;
	}

	/**
	 * Converts an XML expression element to a BPEL Expression object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Expression xml2Expression(Element expressionElement) {
		org.eclipse.bpel4chor.model.pbd.Expression expression = PbdFactory.eINSTANCE.createExpression();


		return xml2Expression(expressionElement, expression);
	}

	protected org.eclipse.bpel4chor.model.pbd.Else xml2Else(Element elseElement) {
		org.eclipse.bpel4chor.model.pbd.Else _else = PbdFactory.eINSTANCE.createElse();
		

		// Save all the references to external namespaces
		//saveNamespacePrefix(_else, elseElement);

		//@weissas
		setWSUID(elseElement, _else);
		
		org.eclipse.bpel4chor.model.pbd.Activity activity = getChildActivity(elseElement);
		_else.setActivity(activity);

		return _else;
	}

	/**
	 * Converts an XML sequence element to a BPEL Sequence object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Sequence(Element sequenceElement) {
		org.eclipse.bpel4chor.model.pbd.Sequence sequence = PbdFactory.eINSTANCE.createSequence();

		// Set name
		Attr name = sequenceElement.getAttributeNode("name");

		if (name != null && name.getSpecified()) {
			sequence.setName(name.getValue());
		}

		NodeList sequenceElements = sequenceElement.getChildNodes();

		Element activityElement = null;

		if (sequenceElements != null && sequenceElements.getLength() > 0) {

			for (int i = 0; i < sequenceElements.getLength(); i++) {
				if (sequenceElements.item(i).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}

				activityElement = (Element) sequenceElements.item(i);
				org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);
				if (activity != null) {
					sequence.getActivity().add(activity);
				}
			}
		}

		setStandardAttributes(sequenceElement, sequence);

		return sequence;
	}

	/**
	 * Converts an XML empty element to a BPEL Empty object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Empty(Element emptyElement) {
		org.eclipse.bpel4chor.model.pbd.Empty empty = PbdFactory.eINSTANCE.createEmpty();

		setStandardAttributes(emptyElement, empty);

		return empty;
	}

	/**
	 * Converts an XML opaqueActivity element to a BPEL OpaqueActivity object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2OpaqueActivity(Element opaqueActivityElement) {
		org.eclipse.bpel4chor.model.pbd.OpaqueActivity opaqueActivity = PbdFactory.eINSTANCE
				.createOpaqueActivity();
		
		setStandardAttributes(opaqueActivityElement, opaqueActivity);

		return opaqueActivity;
	}

	/**
	 * Converts an XML valdateXML element to a BPEL ValidateXML object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Validate(Element validateElement) {
		final org.eclipse.bpel4chor.model.pbd.Validate validate = PbdFactory.eINSTANCE.createValidate();
		

		setStandardAttributes(validateElement, validate);
		if (validateElement.hasAttribute("variables")) {
			String variables = validateElement.getAttribute("variables");
			StringTokenizer st = new StringTokenizer(variables);
//
//			while (st.hasMoreTokens()) {
//				final String variableName = st.nextToken();
//				// We must do this as a post load runnable because the variable
//				// might not
//				// exist yet.
//				fPass2Runnables.add(new Runnable() {
//					public void run() {
//						Variable targetVariable = getVariable(validate,
//								variableName);
//						if (targetVariable == null) {
//							targetVariable = new VariableProxy(getResource()
//									.getURI(), variableName);
//						}
//						validate.getVariables().add(targetVariable);
//					}
//				});
//			}
		}
		return validate;
	}

	/**
	 * Converts an XML rethrow element to a BPEL Rethrow object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Rethrow(Element rethrowElement) {
		org.eclipse.bpel4chor.model.pbd.Rethrow rethrow = PbdFactory.eINSTANCE.createRethrow();
	

		setStandardAttributes(rethrowElement, rethrow);

		return rethrow;
	}

	
	/**
	 * Converts an XML wait element to a BPEL Wait object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Wait(Element waitElement) {
		org.eclipse.bpel4chor.model.pbd.Wait wait = PbdFactory.eINSTANCE.createWait();
		

		// Set name
		Attr name = waitElement.getAttributeNode("name");

		if (name != null && name.getSpecified())
			wait.setName(name.getValue());

		// Set for element
		Element forElement = getBPELChildElementByLocalName(waitElement, "for");
		if (forElement != null) {
			org.eclipse.bpel4chor.model.pbd.Expression expression = xml2Expression(forElement);
			wait.setFor(expression);
		}

		// Set until element
		Element untilElement = getBPELChildElementByLocalName(waitElement,
				"until");
		if (untilElement != null) {
			org.eclipse.bpel4chor.model.pbd.Expression expression = xml2Expression(untilElement);
			wait.setUntil(expression);
		}

		setStandardAttributes(waitElement, wait);

		return wait;
	}

	
	/**
	 * Converts an XML throw element to a BPEL Throw object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Throw(Element throwElement) {
		org.eclipse.bpel4chor.model.pbd.Throw _throw = PbdFactory.eINSTANCE.createThrow();
		
		if (throwElement.hasAttribute("name")) {
			_throw.setName(throwElement.getAttribute("name"));
		}
		if (throwElement.hasAttribute("faultName")) {
			
			throwElement.getAttribute("faultName");
			_throw.setFaultName(throwElement.getAttribute("faultName"));
		}

//		// Set fault variable name
//		setVariable(throwElement, _throw, "faultVariable",
//				BPELPackage.eINSTANCE.getThrow_FaultVariable());

		setStandardAttributes(throwElement, _throw);

		return _throw;
	}

	/**
	 * Converts an XML assign element to a BPEL Assign object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Assign(Element assignElement) {
		org.eclipse.bpel4chor.model.pbd.Assign assign = PbdFactory.eINSTANCE.createAssign();

		setStandardAttributes(assignElement, assign);

		return assign;
	}

	

	

	/**
	 * Converts an XML invoke element to a BPEL Invoke object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Invoke(Element invokeElement) {
		org.eclipse.bpel4chor.model.pbd.Invoke invoke = PbdFactory.eINSTANCE.createInvoke();
		

		// Set several parms
		setStandardAttributes(invokeElement, invoke);
		
	
		return invoke;
	}

	/**
	 * Converts an XML reply element to a BPEL Reply object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Reply(Element replyElement) {
		org.eclipse.bpel4chor.model.pbd.Reply reply = PbdFactory.eINSTANCE.createReply();
		
		// Set several parms
		setStandardAttributes(replyElement, reply);
		
		// Set messageExchange
		setMessageExchange(replyElement, reply);

		return reply;
	}

	/**
	 * Converts an XML receive element to a BPEL Receive object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2Receive(Element receiveElement) {
		org.eclipse.bpel4chor.model.pbd.Receive receive = PbdFactory.eINSTANCE.createReceive();

		// Set several parms
		setStandardAttributes(receiveElement, receive);
		
		// Set createInstance
		if (receiveElement.hasAttribute("createInstance")) {		           
			String createInstance = receiveElement.getAttribute("createInstance");
			
			if(createInstance.equals("yes")){
				receive.setCreateInstance( Boolean.YES);
			}
			else{
				receive.setCreateInstance( Boolean.NO);
			}

		}

		// Set messageExchange
		setMessageExchange(receiveElement, receive);

		return receive;
	}

	/**
	 * Sets a MessageExchange element for a given EObject. The given activity
	 * element must contain an attribute named "messageExchange".
	 * 
	 * @param activityElement
	 *            the DOM element of the activity
	 * @param eObject
	 *            the EObject in which to set the partner link
	 */
	// @hahnml: Changed visibility to public
	public void setMessageExchange(Element activityElement, EObject eObject) {
		if (!activityElement.hasAttribute("messageExchange")) {
			return;
		}
		final String messageExchangeName = activityElement
				.getAttribute("messageExchange");
		
		if(eObject instanceof org.eclipse.bpel4chor.model.pbd.Receive){
			org.eclipse.bpel4chor.model.pbd.Receive receive = (org.eclipse.bpel4chor.model.pbd.Receive)eObject;
			receive.setMessageExchange(messageExchangeName);
		}
		else if(eObject instanceof org.eclipse.bpel4chor.model.pbd.Reply){
			org.eclipse.bpel4chor.model.pbd.Reply reply = (org.eclipse.bpel4chor.model.pbd.Reply)eObject;
			reply.setMessageExchange(messageExchangeName);
		}
		else if(eObject instanceof org.eclipse.bpel4chor.model.pbd.OnMessage){
			org.eclipse.bpel4chor.model.pbd.OnMessage onMessage = (org.eclipse.bpel4chor.model.pbd.OnMessage)eObject;
			onMessage.setMessageExchange(messageExchangeName);
		}
		
	}

	/**
	 * Converts an XML forEach element to a BPEL ForEach object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2ForEach(Element forEachElement) {
		org.eclipse.bpel4chor.model.pbd.ForEach forEach = PbdFactory.eINSTANCE.createForEach();
	

		// Set several parms
		setStandardAttributes(forEachElement, forEach);

		if (forEachElement.hasAttribute("parallel")) {
			if(forEachElement.getAttribute("parallel").equals("yes")){
				forEach.setParallel(Boolean.YES);
			}
			else{
				forEach.setParallel(Boolean.NO);
			}
		}

		// Set counterName variable
//		if (forEachElement.hasAttribute("counterName")) {
//			Variable variable = BPELFactory.eINSTANCE.createVariable();
//			// TODO: How to facade this ?
//			variable.setName(forEachElement.getAttribute("counterName"));
//			QName qName = new QName(XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001,
//					"unsignedInt");
//			XSDTypeDefinition type = new XSDTypeDefinitionProxy(getResource()
//					.getURI(), qName);
//			variable.setType(type);
//			forEach.setCounterName(variable);
//		}
//
//		// Set startCounterValue element
//		Element startCounterValueElement = getBPELChildElementByLocalName(
//				forEachElement, "startCounterValue");
//		if (startCounterValueElement != null) {
//			Expression expression = xml2Expression(startCounterValueElement);
//			forEach.setStartCounterValue(expression);
//		}

//		// Set finalCounterValue element
//		Element finalCounterValueElement = getBPELChildElementByLocalName(
//				forEachElement, "finalCounterValue");
//		if (finalCounterValueElement != null) {
//			Expression expression = xml2Expression(finalCounterValueElement);
//			forEach.setFinalCounterValue(expression);
//		}
//
//		// Set completionCondition element
//		Element completionConditionElement = getBPELChildElementByLocalName(
//				forEachElement, "completionCondition");
//		if (completionConditionElement != null) {
//			CompletionCondition completionCondition = xml2CompletionCondition(completionConditionElement);
//			forEach.setCompletionCondition(completionCondition);
//		}

		// Set activity
		org.eclipse.bpel4chor.model.pbd.Activity activity = getChildActivity(forEachElement);
		if (activity instanceof Scope) {
			forEach.setScope((org.eclipse.bpel4chor.model.pbd.Scope) activity);
		}

		return forEach;
	}

	

	

	
	/**
	 * Converts an XML repeatUntil element to a BPEL RepeatUntil object.
	 */
	protected org.eclipse.bpel4chor.model.pbd.Activity xml2RepeatUntil(Element repeatUntilElement) {
		org.eclipse.bpel4chor.model.pbd.RepeatUntil repeatUntil = PbdFactory.eINSTANCE.createRepeatUntil();
		

		// Set several parms
		setStandardAttributes(repeatUntilElement, repeatUntil);

		// Handle condition element
		Element conditionElement = getBPELChildElementByLocalName(
				repeatUntilElement, "condition");
		if (conditionElement != null) {
			org.eclipse.bpel4chor.model.pbd.Condition condition = xml2Condition(conditionElement);
			repeatUntil.setCondition(condition);
		}

		NodeList repeatUntilElements = repeatUntilElement.getChildNodes();

		Element activityElement = null;

		if (repeatUntilElements != null && repeatUntilElements.getLength() > 0) {
			for (int i = 0; i < repeatUntilElements.getLength(); i++) {

				if (repeatUntilElements.item(i).getNodeType() != Node.ELEMENT_NODE) {
					continue;
				}

				activityElement = (Element) repeatUntilElements.item(i);
				org.eclipse.bpel4chor.model.pbd.Activity activity = xml2Activity(activityElement);
				if (activity != null) {
					repeatUntil.setActivity(activity);
					break;
				}
			}
		}

		return repeatUntil;
	}

	
	

	protected org.eclipse.bpel4chor.model.pbd.Compensate xml2Compensate(Element compensateElement) {
		final org.eclipse.bpel4chor.model.pbd.Compensate compensate = PbdFactory.eINSTANCE.createCompensate();
		
		setStandardAttributes(compensateElement, compensate);
		return compensate;
	}

	protected org.eclipse.bpel4chor.model.pbd.CompensateScope xml2CompensateScope(Element compensateScopeElement) {

		final org.eclipse.bpel4chor.model.pbd.CompensateScope compensateScope = PbdFactory.eINSTANCE
				.createCompensateScope();
		

		final String target = compensateScopeElement.getAttribute("target");

//		if (target != null && target.length() > 0) {
//			fPass2Runnables.add(new Runnable() {
//				public void run() {
//					compensateScope.setTarget(target);
//				}
//			});
//		}

		setStandardAttributes(compensateScopeElement, compensateScope);

		return compensateScope;
	}

	/**
	 * Converts an XML extensible element to a BPEL extensible element
	 */


	/**
	 * returns abstract process profile
	 * 
	 * @param processElement
	 * @return namespace of abstract process profile
	 */
	public String getProfileNamespace(Element processElement) {
		if (processElement.getAttribute(BPELConstants.AT_ABSTRACT_PROFILES) != null) {

			return processElement
					.getAttribute(BPELConstants.AT_ABSTRACT_PROFILES);
		}
		return null;
	}

	/**
	 * Returns true if the string is either null or contains just whitespace.
	 * 
	 * @param value
	 * @return true if empty or whitespace, false otherwise.
     */
		
   static public boolean isEmptyOrWhitespace( String value )
   {
       if( value == null || value.length() == 0) {
           return true;
       }               
       for( int i = 0, j = value.length(); i < j; i++ )
       {
           if( ! Character.isWhitespace( value.charAt(i) ) ) {
               return false;
           }
       }
       return true;
   }
	
	
	/**
	 * Returns the text of the given node. If the node is an element node, its
	 * children text value is returned. Otherwise, the node is assumed to be the
	 * first child node and the siblings sequence is scanned.
	 * 
	 * 
	 */

	String getText(Node node) {

		StringBuilder sb = new StringBuilder(128);

		if (node instanceof Element) {
			node = ((Element) node).getFirstChild();
		}

		boolean bCData = false;

		while (node != null) {
			switch (node.getNodeType()) {
			case Node.TEXT_NODE:
				if (bCData) {
					break;
				}
				Text text = (Text) node;
				sb.append(text.getData());
				break;
			case Node.CDATA_SECTION_NODE:
				if (bCData == false) {
					sb.setLength(0);
					bCData = true;
				}
				CDATASection cdata = (CDATASection) node;
				sb.append(cdata.getData());
				break;
			}
			node = node.getNextSibling();
		}
		String data = sb.toString();
		if (isEmptyOrWhitespace(data)) {
			return null;
		}
		return data;
	}

	

	/**
	 * @param activity
	 * @param linkName
	 * @return the resolved link
	 */
	public static org.eclipse.bpel4chor.model.pbd.Link getLink(org.eclipse.bpel4chor.model.pbd.Activity activity, String linkName) {
		return LINK_RESOLVER.getLink(activity, linkName);
	}

	/**
	 * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException)
	 */
	@SuppressWarnings("boxing")
	public void error(SAXParseException exception) {

		String message = java.text.MessageFormat.format(
				"Error in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		//BPELPlugin.logMessage(message, exception, IStatus.ERROR);	
		System.out.println(message);
		// Bugzilla 324165
		// add the error to resource
//		if (fCurrentResource!=null)
//			fCurrentResource.getErrors().add(new SAXParseDiagnostic(exception, SAXParseDiagnostic.ERROR));
	}

	/**
	 * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException)
	 */
	@SuppressWarnings("boxing")
	public void fatalError(SAXParseException exception)  {
		String message = java.text.MessageFormat.format(
				"Fatal Error in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		//BPELPlugin.logMessage(message, exception, IStatus.ERROR);
		System.out.println(message);
		
		// Bugzilla 324165
		// add the error to resource
//		if (fCurrentResource!=null)
//			fCurrentResource.getErrors().add(new SAXParseDiagnostic(exception, SAXParseDiagnostic.FATAL_ERROR));
	}

	/**
	 * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException)
	 */
	@SuppressWarnings("boxing")
	public void warning(SAXParseException exception) {
		String message = java.text.MessageFormat.format(
				"Warning in {0} [{2}:{3}] {4}",				
				exception.getPublicId(),
				exception.getSystemId(),
				exception.getLineNumber(), 
				exception.getColumnNumber(),
				exception.getLocalizedMessage()
		);			
		//BPELPlugin.logMessage(message, exception, IStatus.WARNING);		
		System.out.println(message);

		// Bugzilla 324165
		// add the error to resource
//		if (fCurrentResource!=null)
//			fCurrentResource.getErrors().add(new SAXParseDiagnostic(exception, SAXParseDiagnostic.WARNING));
	}

	// SIMPL-Methods

	
	
	/**
	 * New method to read and set the wsu:id in activities for choreographed bpel processes 
	 * @param Element
	 * @param BPELExtensibleElement
	 */
	protected void setWSUID(Element element, ExtensibleElements ExtensibleElement){
		
		Attr id = element.getAttributeNode("wsu:Id");
		
		if(id != null){
			ExtensibleElement.setId(id.getValue());
		}
		else{

			id = element.getAttributeNode("id");
			if(id != null){
				ExtensibleElement.setId(id.getValue());
			}
			
		}
		
	}
	
	public  boolean isBPELElement(Node node) {
		return node != null && node.getNodeType() == Node.ELEMENT_NODE
				&& BPELConstants.isBPELNamespace(node.getNamespaceURI());
	}
	
//	protected void setWSUID(Element onMessageElement, OnMessage onMessage){
//		
//		Attr id = onMessageElement.getAttributeNode("wsu:Id");
//		
//		if(id != null){
//			onMessage.setId(id.getValue());
//		}	
//	}
	
	
}
