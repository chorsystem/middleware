/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.CorrelationSets;
import org.eclipse.bpel4chor.model.pbd.EventHandlers;
import org.eclipse.bpel4chor.model.pbd.Extensions;
import org.eclipse.bpel4chor.model.pbd.FaultHandlers;
import org.eclipse.bpel4chor.model.pbd.Import;
import org.eclipse.bpel4chor.model.pbd.MessageExchanges;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Variables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getSuppressJoinFailure <em>Suppress Join Failure</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ProcessImpl#getAbstractProcessProfile <em>Abstract Process Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ExtensibleElementsImpl implements org.eclipse.bpel4chor.model.pbd.Process {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected Extensions extensions;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

	/**
	 * The cached value of the '{@link #getMessageExchanges() <em>Message Exchanges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchanges()
	 * @generated
	 * @ordered
	 */
	protected MessageExchanges messageExchanges;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected Variables variables;

	/**
	 * The cached value of the '{@link #getCorrelationSets() <em>Correlation Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSets()
	 * @generated
	 * @ordered
	 */
	protected CorrelationSets correlationSets;

	/**
	 * The cached value of the '{@link #getFaultHandlers() <em>Fault Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultHandlers()
	 * @generated
	 * @ordered
	 */
	protected FaultHandlers faultHandlers;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EventHandlers eventHandlers;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_LANGUAGE_EDEFAULT = "urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0";

	/**
	 * The cached value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected String queryLanguage = QUERY_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0";

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressJoinFailure() <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressJoinFailure()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean SUPPRESS_JOIN_FAILURE_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getSuppressJoinFailure() <em>Suppress Join Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressJoinFailure()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean suppressJoinFailure = SUPPRESS_JOIN_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExitOnStandardFault() <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOnStandardFault()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean EXIT_ON_STANDARD_FAULT_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getExitOnStandardFault() <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitOnStandardFault()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean exitOnStandardFault = EXIT_ON_STANDARD_FAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractProcessProfile() <em>Abstract Process Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractProcessProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_PROCESS_PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractProcessProfile() <em>Abstract Process Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractProcessProfile()
	 * @generated
	 * @ordered
	 */
	protected String abstractProcessProfile = ABSTRACT_PROCESS_PROFILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensions getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(Extensions newExtensions, NotificationChain msgs) {
		Extensions oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(Extensions newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, PbdPackage.PROCESS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchanges getMessageExchanges() {
		return messageExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageExchanges(MessageExchanges newMessageExchanges, NotificationChain msgs) {
		MessageExchanges oldMessageExchanges = messageExchanges;
		messageExchanges = newMessageExchanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__MESSAGE_EXCHANGES, oldMessageExchanges, newMessageExchanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchanges(MessageExchanges newMessageExchanges) {
		if (newMessageExchanges != messageExchanges) {
			NotificationChain msgs = null;
			if (messageExchanges != null)
				msgs = ((InternalEObject)messageExchanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__MESSAGE_EXCHANGES, null, msgs);
			if (newMessageExchanges != null)
				msgs = ((InternalEObject)newMessageExchanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__MESSAGE_EXCHANGES, null, msgs);
			msgs = basicSetMessageExchanges(newMessageExchanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__MESSAGE_EXCHANGES, newMessageExchanges, newMessageExchanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variables getVariables() {
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariables(Variables newVariables, NotificationChain msgs) {
		Variables oldVariables = variables;
		variables = newVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__VARIABLES, oldVariables, newVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariables(Variables newVariables) {
		if (newVariables != variables) {
			NotificationChain msgs = null;
			if (variables != null)
				msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__VARIABLES, null, msgs);
			if (newVariables != null)
				msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__VARIABLES, null, msgs);
			msgs = basicSetVariables(newVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__VARIABLES, newVariables, newVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSets getCorrelationSets() {
		return correlationSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSets(CorrelationSets newCorrelationSets, NotificationChain msgs) {
		CorrelationSets oldCorrelationSets = correlationSets;
		correlationSets = newCorrelationSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__CORRELATION_SETS, oldCorrelationSets, newCorrelationSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationSets(CorrelationSets newCorrelationSets) {
		if (newCorrelationSets != correlationSets) {
			NotificationChain msgs = null;
			if (correlationSets != null)
				msgs = ((InternalEObject)correlationSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__CORRELATION_SETS, null, msgs);
			if (newCorrelationSets != null)
				msgs = ((InternalEObject)newCorrelationSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__CORRELATION_SETS, null, msgs);
			msgs = basicSetCorrelationSets(newCorrelationSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__CORRELATION_SETS, newCorrelationSets, newCorrelationSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandlers getFaultHandlers() {
		return faultHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultHandlers(FaultHandlers newFaultHandlers, NotificationChain msgs) {
		FaultHandlers oldFaultHandlers = faultHandlers;
		faultHandlers = newFaultHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__FAULT_HANDLERS, oldFaultHandlers, newFaultHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultHandlers(FaultHandlers newFaultHandlers) {
		if (newFaultHandlers != faultHandlers) {
			NotificationChain msgs = null;
			if (faultHandlers != null)
				msgs = ((InternalEObject)faultHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__FAULT_HANDLERS, null, msgs);
			if (newFaultHandlers != null)
				msgs = ((InternalEObject)newFaultHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__FAULT_HANDLERS, null, msgs);
			msgs = basicSetFaultHandlers(newFaultHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__FAULT_HANDLERS, newFaultHandlers, newFaultHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlers getEventHandlers() {
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHandlers(EventHandlers newEventHandlers, NotificationChain msgs) {
		EventHandlers oldEventHandlers = eventHandlers;
		eventHandlers = newEventHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EVENT_HANDLERS, oldEventHandlers, newEventHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandlers(EventHandlers newEventHandlers) {
		if (newEventHandlers != eventHandlers) {
			NotificationChain msgs = null;
			if (eventHandlers != null)
				msgs = ((InternalEObject)eventHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__EVENT_HANDLERS, null, msgs);
			if (newEventHandlers != null)
				msgs = ((InternalEObject)newEventHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__EVENT_HANDLERS, null, msgs);
			msgs = basicSetEventHandlers(newEventHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EVENT_HANDLERS, newEventHandlers, newEventHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.PROCESS__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryLanguage() {
		return queryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLanguage(String newQueryLanguage) {
		String oldQueryLanguage = queryLanguage;
		queryLanguage = newQueryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getSuppressJoinFailure() {
		return suppressJoinFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressJoinFailure(org.eclipse.bpel4chor.model.pbd.Boolean newSuppressJoinFailure) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldSuppressJoinFailure = suppressJoinFailure;
		suppressJoinFailure = newSuppressJoinFailure == null ? SUPPRESS_JOIN_FAILURE_EDEFAULT : newSuppressJoinFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__SUPPRESS_JOIN_FAILURE, oldSuppressJoinFailure, suppressJoinFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getExitOnStandardFault() {
		return exitOnStandardFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitOnStandardFault(org.eclipse.bpel4chor.model.pbd.Boolean newExitOnStandardFault) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldExitOnStandardFault = exitOnStandardFault;
		exitOnStandardFault = newExitOnStandardFault == null ? EXIT_ON_STANDARD_FAULT_EDEFAULT : newExitOnStandardFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, exitOnStandardFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractProcessProfile() {
		return abstractProcessProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractProcessProfile(String newAbstractProcessProfile) {
		String oldAbstractProcessProfile = abstractProcessProfile;
		abstractProcessProfile = newAbstractProcessProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.PROCESS__ABSTRACT_PROCESS_PROFILE, oldAbstractProcessProfile, abstractProcessProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.PROCESS__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case PbdPackage.PROCESS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case PbdPackage.PROCESS__MESSAGE_EXCHANGES:
				return basicSetMessageExchanges(null, msgs);
			case PbdPackage.PROCESS__VARIABLES:
				return basicSetVariables(null, msgs);
			case PbdPackage.PROCESS__CORRELATION_SETS:
				return basicSetCorrelationSets(null, msgs);
			case PbdPackage.PROCESS__FAULT_HANDLERS:
				return basicSetFaultHandlers(null, msgs);
			case PbdPackage.PROCESS__EVENT_HANDLERS:
				return basicSetEventHandlers(null, msgs);
			case PbdPackage.PROCESS__ACTIVITY:
				return basicSetActivity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PbdPackage.PROCESS__EXTENSIONS:
				return getExtensions();
			case PbdPackage.PROCESS__IMPORT:
				return getImport();
			case PbdPackage.PROCESS__MESSAGE_EXCHANGES:
				return getMessageExchanges();
			case PbdPackage.PROCESS__VARIABLES:
				return getVariables();
			case PbdPackage.PROCESS__CORRELATION_SETS:
				return getCorrelationSets();
			case PbdPackage.PROCESS__FAULT_HANDLERS:
				return getFaultHandlers();
			case PbdPackage.PROCESS__EVENT_HANDLERS:
				return getEventHandlers();
			case PbdPackage.PROCESS__ACTIVITY:
				return getActivity();
			case PbdPackage.PROCESS__NAME:
				return getName();
			case PbdPackage.PROCESS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case PbdPackage.PROCESS__QUERY_LANGUAGE:
				return getQueryLanguage();
			case PbdPackage.PROCESS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case PbdPackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				return getSuppressJoinFailure();
			case PbdPackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				return getExitOnStandardFault();
			case PbdPackage.PROCESS__ABSTRACT_PROCESS_PROFILE:
				return getAbstractProcessProfile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PbdPackage.PROCESS__EXTENSIONS:
				setExtensions((Extensions)newValue);
				return;
			case PbdPackage.PROCESS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case PbdPackage.PROCESS__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)newValue);
				return;
			case PbdPackage.PROCESS__VARIABLES:
				setVariables((Variables)newValue);
				return;
			case PbdPackage.PROCESS__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)newValue);
				return;
			case PbdPackage.PROCESS__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)newValue);
				return;
			case PbdPackage.PROCESS__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)newValue);
				return;
			case PbdPackage.PROCESS__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case PbdPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case PbdPackage.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case PbdPackage.PROCESS__QUERY_LANGUAGE:
				setQueryLanguage((String)newValue);
				return;
			case PbdPackage.PROCESS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case PbdPackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.PROCESS__ABSTRACT_PROCESS_PROFILE:
				setAbstractProcessProfile((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PbdPackage.PROCESS__EXTENSIONS:
				setExtensions((Extensions)null);
				return;
			case PbdPackage.PROCESS__IMPORT:
				getImport().clear();
				return;
			case PbdPackage.PROCESS__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)null);
				return;
			case PbdPackage.PROCESS__VARIABLES:
				setVariables((Variables)null);
				return;
			case PbdPackage.PROCESS__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)null);
				return;
			case PbdPackage.PROCESS__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)null);
				return;
			case PbdPackage.PROCESS__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)null);
				return;
			case PbdPackage.PROCESS__ACTIVITY:
				setActivity((Activity)null);
				return;
			case PbdPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PbdPackage.PROCESS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case PbdPackage.PROCESS__QUERY_LANGUAGE:
				setQueryLanguage(QUERY_LANGUAGE_EDEFAULT);
				return;
			case PbdPackage.PROCESS__EXPRESSION_LANGUAGE:
				setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
				return;
			case PbdPackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				setSuppressJoinFailure(SUPPRESS_JOIN_FAILURE_EDEFAULT);
				return;
			case PbdPackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault(EXIT_ON_STANDARD_FAULT_EDEFAULT);
				return;
			case PbdPackage.PROCESS__ABSTRACT_PROCESS_PROFILE:
				setAbstractProcessProfile(ABSTRACT_PROCESS_PROFILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PbdPackage.PROCESS__EXTENSIONS:
				return extensions != null;
			case PbdPackage.PROCESS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case PbdPackage.PROCESS__MESSAGE_EXCHANGES:
				return messageExchanges != null;
			case PbdPackage.PROCESS__VARIABLES:
				return variables != null;
			case PbdPackage.PROCESS__CORRELATION_SETS:
				return correlationSets != null;
			case PbdPackage.PROCESS__FAULT_HANDLERS:
				return faultHandlers != null;
			case PbdPackage.PROCESS__EVENT_HANDLERS:
				return eventHandlers != null;
			case PbdPackage.PROCESS__ACTIVITY:
				return activity != null;
			case PbdPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PbdPackage.PROCESS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case PbdPackage.PROCESS__QUERY_LANGUAGE:
				return QUERY_LANGUAGE_EDEFAULT == null ? queryLanguage != null : !QUERY_LANGUAGE_EDEFAULT.equals(queryLanguage);
			case PbdPackage.PROCESS__EXPRESSION_LANGUAGE:
				return EXPRESSION_LANGUAGE_EDEFAULT == null ? expressionLanguage != null : !EXPRESSION_LANGUAGE_EDEFAULT.equals(expressionLanguage);
			case PbdPackage.PROCESS__SUPPRESS_JOIN_FAILURE:
				return suppressJoinFailure != SUPPRESS_JOIN_FAILURE_EDEFAULT;
			case PbdPackage.PROCESS__EXIT_ON_STANDARD_FAULT:
				return exitOnStandardFault != EXIT_ON_STANDARD_FAULT_EDEFAULT;
			case PbdPackage.PROCESS__ABSTRACT_PROCESS_PROFILE:
				return ABSTRACT_PROCESS_PROFILE_EDEFAULT == null ? abstractProcessProfile != null : !ABSTRACT_PROCESS_PROFILE_EDEFAULT.equals(abstractProcessProfile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", queryLanguage: ");
		result.append(queryLanguage);
		result.append(", expressionLanguage: ");
		result.append(expressionLanguage);
		result.append(", suppressJoinFailure: ");
		result.append(suppressJoinFailure);
		result.append(", exitOnStandardFault: ");
		result.append(exitOnStandardFault);
		result.append(", abstractProcessProfile: ");
		result.append(abstractProcessProfile);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
