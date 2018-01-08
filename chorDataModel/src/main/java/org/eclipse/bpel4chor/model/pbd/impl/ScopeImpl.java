/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.ActivityContainer;
import org.eclipse.bpel4chor.model.pbd.CorrelationSets;
import org.eclipse.bpel4chor.model.pbd.EventHandlers;
import org.eclipse.bpel4chor.model.pbd.FaultHandlers;
import org.eclipse.bpel4chor.model.pbd.MessageExchanges;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.Variables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ScopeImpl#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends ActivityImpl implements Scope {
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
	 * The cached value of the '{@link #getCompensationHandler() <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationHandler()
	 * @generated
	 * @ordered
	 */
	protected ActivityContainer compensationHandler;

	/**
	 * The cached value of the '{@link #getTerminationHandler() <em>Termination Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationHandler()
	 * @generated
	 * @ordered
	 */
	protected ActivityContainer terminationHandler;

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
	 * The default value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean ISOLATED_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean isolated = ISOLATED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.SCOPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__MESSAGE_EXCHANGES, oldMessageExchanges, newMessageExchanges);
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
				msgs = ((InternalEObject)messageExchanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__MESSAGE_EXCHANGES, null, msgs);
			if (newMessageExchanges != null)
				msgs = ((InternalEObject)newMessageExchanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__MESSAGE_EXCHANGES, null, msgs);
			msgs = basicSetMessageExchanges(newMessageExchanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__MESSAGE_EXCHANGES, newMessageExchanges, newMessageExchanges));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__VARIABLES, oldVariables, newVariables);
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
				msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__VARIABLES, null, msgs);
			if (newVariables != null)
				msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__VARIABLES, null, msgs);
			msgs = basicSetVariables(newVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__VARIABLES, newVariables, newVariables));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__CORRELATION_SETS, oldCorrelationSets, newCorrelationSets);
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
				msgs = ((InternalEObject)correlationSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__CORRELATION_SETS, null, msgs);
			if (newCorrelationSets != null)
				msgs = ((InternalEObject)newCorrelationSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__CORRELATION_SETS, null, msgs);
			msgs = basicSetCorrelationSets(newCorrelationSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__CORRELATION_SETS, newCorrelationSets, newCorrelationSets));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__FAULT_HANDLERS, oldFaultHandlers, newFaultHandlers);
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
				msgs = ((InternalEObject)faultHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__FAULT_HANDLERS, null, msgs);
			if (newFaultHandlers != null)
				msgs = ((InternalEObject)newFaultHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__FAULT_HANDLERS, null, msgs);
			msgs = basicSetFaultHandlers(newFaultHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__FAULT_HANDLERS, newFaultHandlers, newFaultHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getCompensationHandler() {
		return compensationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationHandler(ActivityContainer newCompensationHandler, NotificationChain msgs) {
		ActivityContainer oldCompensationHandler = compensationHandler;
		compensationHandler = newCompensationHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__COMPENSATION_HANDLER, oldCompensationHandler, newCompensationHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationHandler(ActivityContainer newCompensationHandler) {
		if (newCompensationHandler != compensationHandler) {
			NotificationChain msgs = null;
			if (compensationHandler != null)
				msgs = ((InternalEObject)compensationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__COMPENSATION_HANDLER, null, msgs);
			if (newCompensationHandler != null)
				msgs = ((InternalEObject)newCompensationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__COMPENSATION_HANDLER, null, msgs);
			msgs = basicSetCompensationHandler(newCompensationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__COMPENSATION_HANDLER, newCompensationHandler, newCompensationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContainer getTerminationHandler() {
		return terminationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminationHandler(ActivityContainer newTerminationHandler, NotificationChain msgs) {
		ActivityContainer oldTerminationHandler = terminationHandler;
		terminationHandler = newTerminationHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__TERMINATION_HANDLER, oldTerminationHandler, newTerminationHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationHandler(ActivityContainer newTerminationHandler) {
		if (newTerminationHandler != terminationHandler) {
			NotificationChain msgs = null;
			if (terminationHandler != null)
				msgs = ((InternalEObject)terminationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__TERMINATION_HANDLER, null, msgs);
			if (newTerminationHandler != null)
				msgs = ((InternalEObject)newTerminationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__TERMINATION_HANDLER, null, msgs);
			msgs = basicSetTerminationHandler(newTerminationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__TERMINATION_HANDLER, newTerminationHandler, newTerminationHandler));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__EVENT_HANDLERS, oldEventHandlers, newEventHandlers);
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
				msgs = ((InternalEObject)eventHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__EVENT_HANDLERS, null, msgs);
			if (newEventHandlers != null)
				msgs = ((InternalEObject)newEventHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__EVENT_HANDLERS, null, msgs);
			msgs = basicSetEventHandlers(newEventHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__EVENT_HANDLERS, newEventHandlers, newEventHandlers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__ACTIVITY, oldActivity, newActivity);
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
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.SCOPE__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getIsolated() {
		return isolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated(org.eclipse.bpel4chor.model.pbd.Boolean newIsolated) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldIsolated = isolated;
		isolated = newIsolated == null ? ISOLATED_EDEFAULT : newIsolated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__ISOLATED, oldIsolated, isolated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.SCOPE__EXIT_ON_STANDARD_FAULT, oldExitOnStandardFault, exitOnStandardFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.SCOPE__MESSAGE_EXCHANGES:
				return basicSetMessageExchanges(null, msgs);
			case PbdPackage.SCOPE__VARIABLES:
				return basicSetVariables(null, msgs);
			case PbdPackage.SCOPE__CORRELATION_SETS:
				return basicSetCorrelationSets(null, msgs);
			case PbdPackage.SCOPE__FAULT_HANDLERS:
				return basicSetFaultHandlers(null, msgs);
			case PbdPackage.SCOPE__COMPENSATION_HANDLER:
				return basicSetCompensationHandler(null, msgs);
			case PbdPackage.SCOPE__TERMINATION_HANDLER:
				return basicSetTerminationHandler(null, msgs);
			case PbdPackage.SCOPE__EVENT_HANDLERS:
				return basicSetEventHandlers(null, msgs);
			case PbdPackage.SCOPE__ACTIVITY:
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
			case PbdPackage.SCOPE__MESSAGE_EXCHANGES:
				return getMessageExchanges();
			case PbdPackage.SCOPE__VARIABLES:
				return getVariables();
			case PbdPackage.SCOPE__CORRELATION_SETS:
				return getCorrelationSets();
			case PbdPackage.SCOPE__FAULT_HANDLERS:
				return getFaultHandlers();
			case PbdPackage.SCOPE__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case PbdPackage.SCOPE__TERMINATION_HANDLER:
				return getTerminationHandler();
			case PbdPackage.SCOPE__EVENT_HANDLERS:
				return getEventHandlers();
			case PbdPackage.SCOPE__ACTIVITY:
				return getActivity();
			case PbdPackage.SCOPE__ISOLATED:
				return getIsolated();
			case PbdPackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				return getExitOnStandardFault();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PbdPackage.SCOPE__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)newValue);
				return;
			case PbdPackage.SCOPE__VARIABLES:
				setVariables((Variables)newValue);
				return;
			case PbdPackage.SCOPE__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)newValue);
				return;
			case PbdPackage.SCOPE__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)newValue);
				return;
			case PbdPackage.SCOPE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)newValue);
				return;
			case PbdPackage.SCOPE__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)newValue);
				return;
			case PbdPackage.SCOPE__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)newValue);
				return;
			case PbdPackage.SCOPE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case PbdPackage.SCOPE__ISOLATED:
				setIsolated((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
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
			case PbdPackage.SCOPE__MESSAGE_EXCHANGES:
				setMessageExchanges((MessageExchanges)null);
				return;
			case PbdPackage.SCOPE__VARIABLES:
				setVariables((Variables)null);
				return;
			case PbdPackage.SCOPE__CORRELATION_SETS:
				setCorrelationSets((CorrelationSets)null);
				return;
			case PbdPackage.SCOPE__FAULT_HANDLERS:
				setFaultHandlers((FaultHandlers)null);
				return;
			case PbdPackage.SCOPE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)null);
				return;
			case PbdPackage.SCOPE__TERMINATION_HANDLER:
				setTerminationHandler((ActivityContainer)null);
				return;
			case PbdPackage.SCOPE__EVENT_HANDLERS:
				setEventHandlers((EventHandlers)null);
				return;
			case PbdPackage.SCOPE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case PbdPackage.SCOPE__ISOLATED:
				setIsolated(ISOLATED_EDEFAULT);
				return;
			case PbdPackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				setExitOnStandardFault(EXIT_ON_STANDARD_FAULT_EDEFAULT);
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
			case PbdPackage.SCOPE__MESSAGE_EXCHANGES:
				return messageExchanges != null;
			case PbdPackage.SCOPE__VARIABLES:
				return variables != null;
			case PbdPackage.SCOPE__CORRELATION_SETS:
				return correlationSets != null;
			case PbdPackage.SCOPE__FAULT_HANDLERS:
				return faultHandlers != null;
			case PbdPackage.SCOPE__COMPENSATION_HANDLER:
				return compensationHandler != null;
			case PbdPackage.SCOPE__TERMINATION_HANDLER:
				return terminationHandler != null;
			case PbdPackage.SCOPE__EVENT_HANDLERS:
				return eventHandlers != null;
			case PbdPackage.SCOPE__ACTIVITY:
				return activity != null;
			case PbdPackage.SCOPE__ISOLATED:
				return isolated != ISOLATED_EDEFAULT;
			case PbdPackage.SCOPE__EXIT_ON_STANDARD_FAULT:
				return exitOnStandardFault != EXIT_ON_STANDARD_FAULT_EDEFAULT;
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
		result.append(" (isolated: ");
		result.append(isolated);
		result.append(", exitOnStandardFault: ");
		result.append(exitOnStandardFault);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
