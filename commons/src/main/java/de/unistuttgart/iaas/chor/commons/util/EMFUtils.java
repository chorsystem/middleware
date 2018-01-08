package de.unistuttgart.iaas.chor.commons.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.bpel.model.resource.BPELReader2;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.grounding.GroundingPackage;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Process;
import org.eclipse.bpel4chor.model.topology.TopologyPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.wst.wsdl.internal.util.WSDLResourceFactoryImpl;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import de.unistuttgart.iaas.chor.messages.ChorDeploymentMessage;

public class EMFUtils {

	public static synchronized Choreography getChoreographyModel(byte[] choreographyModelFile) {

		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);
		resSet.getPackageRegistry().put("http://docs.oasis-open.org/wsbpel/2.0/process/abstract", PbdPackage.eINSTANCE);
//
//		File file = IOUtils.writeFileFromByteArray(choreographyModelFile, "temp.chor");
//
//		// Load a file with an instance of the model
//		Resource resource = resSet.getResource(URI.createURI(file.getAbsolutePath()), true);

		
		Resource resource = resSet.createResource(URI.createURI("temp.chor"));
//		Resource resource = new XMLResourceImpl(URI.createURI("temp.chor"));
//		resSet.getResources().add(resource);
		
		ByteArrayInputStream in = new ByteArrayInputStream(choreographyModelFile);
		
		try {
			resource.load(in, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Parse the resource content into its object oriented representation
		Choreography chor = (Choreography) resource.getContents().get(0);

		return chor;
	}

	public static Choreography getChoreographyModel(ChorDeploymentMessage chorDeploymentMessage) {

		List<String> fileEndings = new ArrayList<String>();
		fileEndings.add(".chor");

		File folder = ZipUtils.unzipArchive(chorDeploymentMessage.getChoreographyBundle().getChoreographyFolderZip(), new ArrayList<String>(), fileEndings);
		String[] fileNames = folder.list();
		String fileName = fileNames[0];

		Choreography choreography = loadChoreographyModelFromFile(folder.getAbsolutePath() + "\\" + fileName);

		return choreography;
	}

	/**
	 * Initializes EMF and loads a model instance from file.
	 * 
	 * @param file
	 *            full path to input file from which to read the model
	 * @return the model instance parsed into its object-oriented representation
	 */
	private static synchronized Choreography loadChoreographyModelFromFile(String file) {

		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);

		// Load a file with an instance of the model
		Resource resource = resSet.getResource(URI.createFileURI(file), true);

		// Parse the resource content into its object oriented representation
		Choreography chor = (Choreography) resource.getContents().get(0);

		return chor;
	}

	/**
	 * Initializes EMF.
	 */
	private static void initializeEMF() {
		// Register Packages we are going to use. Order matters!
		EcorePackage.eINSTANCE.eClass();
		PbdPackage.eINSTANCE.eClass();
		GroundingPackage.eINSTANCE.eClass();
		TopologyPackage.eINSTANCE.eClass();
		ChorPackage.eINSTANCE.eClass();
		WSDLPackage.eINSTANCE.eClass();

		// Register Resource Factories for all the file extensions that we are
		// going to use
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("chor", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("bpel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wsdl", new WSDLResourceFactoryImpl());
	}
	
	//TODO: Could be dangerous to use the pbd Process instead of the bpel model process
	//maybe details are lost --> has to be investigated
	public static synchronized Process getProcessModel(byte[] processModelFile) {

		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);
		resSet.getPackageRegistry().put("http://docs.oasis-open.org/wsbpel/2.0/process/abstract", PbdPackage.eINSTANCE);
		//File file = IOUtils.writeFileFromByteArray(processModelFile, "temp.bpel");
		
		Resource resource = resSet.createResource(URI.createURI("temp.bpel"));
		
		ByteArrayInputStream in = new ByteArrayInputStream(processModelFile);
		
		try {
			resource.load(in, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Load a file with an instance of the model
		//Resource resource = resSet.getResource(URI.createURI(file.getAbsolutePath()), true);

		// Parse the resource content into its object oriented representation
		Process process = (Process) resource.getContents().get(0);

	
		return process;

	}
	
	public static synchronized Process getRefinedProcess(byte[] processModelFile) {

		initializeEMF();
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);
		resSet.getPackageRegistry().put("http://docs.oasis-open.org/wsbpel/2.0/process/abstract", PbdPackage.eINSTANCE);
		//File file = IOUtils.writeFileFromByteArray(processModelFile, "temp.bpel");
		
		Resource resource = resSet.createResource(URI.createURI("temp.bpel"));
		
		
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		fac.setNamespaceAware(true);
		DocumentBuilder builder;
		
		EObject eObj = null;
		ByteArrayInputStream in = new ByteArrayInputStream(processModelFile);
		
		
		try {
			
			builder = fac.newDocumentBuilder();

			// use BPELReader for deserializing the documents
			BPELReader2 reader = new BPELReader2(builder);
			//BPELResource res = new BPELResourceImpl(URI.createFileURI("tempDir"));
			
			
			Document doc = builder.parse(in);
			reader.read(resource, doc);
			eObj = reader.getResource().getContents().get(0);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//File file = IOUtils.writeFileFromByteArray(processModelFile, "temp.bpel");
		
	
		
		
		

		// Load a file with an instance of the model
		//Resource resource = resSet.getResource(URI.createURI(file.getAbsolutePath()), true);

		// Parse the resource content into its object oriented representation
		

	
		return (Process)eObj;

	}
	
	public static synchronized byte[] processModelToByteArray(Process process){
		
		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);

		Resource resource = resSet.getResource(URI.createURI(process.getName() + ".bpel"), true);
			
		resource.getContents().add(process);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		try {
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return out.toByteArray();
	}
	

	public static synchronized byte[] choreographyModelToByteArray(Choreography choreography){
		
		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put("urn:HPI_IAAS:choreography:schemas:choreography:2006/12", ChorPackage.eINSTANCE);
		resSet.getPackageRegistry().put("http://docs.oasis-open.org/wsbpel/2.0/process/abstract", PbdPackage.eINSTANCE);
		Resource resource = resSet.createResource(URI.createURI("temp.chor"));
		
		
			
		resource.getContents().add(choreography);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		try {
			resource.save(out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return out.toByteArray();
	}
	
	public static synchronized Definition getDefinition(byte[] wsdlFile){
		
		initializeEMF();

		// Create a new ResourceSet and register our ResourceFactoryRegistry and
		// our model package
		ResourceSet resSet = new ResourceSetImpl();
		resSet.setResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
		resSet.getPackageRegistry().put(WSDLPackage.eNS_URI, WSDLPackage.eINSTANCE);
		
		Resource resource = resSet.createResource(URI.createURI("temp.wsdl"));

		ByteArrayInputStream in = new ByteArrayInputStream(wsdlFile);
		
		try {
			resource.load(in, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Parse the resource content into its object oriented representation
		Definition definition = (Definition) resource.getContents().get(0);
		
		return definition;
		
		
	}
	

	
}
