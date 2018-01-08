/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getMessageExchanges <em>Message Exchanges</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getCorrelationSets <em>Correlation Sets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getFaultHandlers <em>Fault Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getTerminationHandler <em>Termination Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends Activity {
	/**
	 * Returns the value of the '<em><b>Message Exchanges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Exchanges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchanges</em>' containment reference.
	 * @see #setMessageExchanges(MessageExchanges)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_MessageExchanges()
	 * @model containment="true"
	 * @generated
	 */
	MessageExchanges getMessageExchanges();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getMessageExchanges <em>Message Exchanges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchanges</em>' containment reference.
	 * @see #getMessageExchanges()
	 * @generated
	 */
	void setMessageExchanges(MessageExchanges value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference.
	 * @see #setVariables(Variables)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_Variables()
	 * @model containment="true"
	 * @generated
	 */
	Variables getVariables();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getVariables <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' containment reference.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(Variables value);

	/**
	 * Returns the value of the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Sets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Sets</em>' containment reference.
	 * @see #setCorrelationSets(CorrelationSets)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_CorrelationSets()
	 * @model containment="true"
	 * @generated
	 */
	CorrelationSets getCorrelationSets();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getCorrelationSets <em>Correlation Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Sets</em>' containment reference.
	 * @see #getCorrelationSets()
	 * @generated
	 */
	void setCorrelationSets(CorrelationSets value);

	/**
	 * Returns the value of the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Handlers</em>' containment reference.
	 * @see #setFaultHandlers(FaultHandlers)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_FaultHandlers()
	 * @model containment="true"
	 * @generated
	 */
	FaultHandlers getFaultHandlers();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getFaultHandlers <em>Fault Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Handlers</em>' containment reference.
	 * @see #getFaultHandlers()
	 * @generated
	 */
	void setFaultHandlers(FaultHandlers value);

	/**
	 * Returns the value of the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #setCompensationHandler(ActivityContainer)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_CompensationHandler()
	 * @model containment="true"
	 * @generated
	 */
	ActivityContainer getCompensationHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getCompensationHandler <em>Compensation Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Handler</em>' containment reference.
	 * @see #getCompensationHandler()
	 * @generated
	 */
	void setCompensationHandler(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Handler</em>' containment reference.
	 * @see #setTerminationHandler(ActivityContainer)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_TerminationHandler()
	 * @model containment="true"
	 * @generated
	 */
	ActivityContainer getTerminationHandler();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getTerminationHandler <em>Termination Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Handler</em>' containment reference.
	 * @see #getTerminationHandler()
	 * @generated
	 */
	void setTerminationHandler(ActivityContainer value);

	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference.
	 * @see #setEventHandlers(EventHandlers)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_EventHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EventHandlers getEventHandlers();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getEventHandlers <em>Event Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Handlers</em>' containment reference.
	 * @see #getEventHandlers()
	 * @generated
	 */
	void setEventHandlers(EventHandlers value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setIsolated(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_Isolated()
	 * @model default="no"
	 * @generated
	 */
	Boolean getIsolated();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getIsolated <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolated</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getIsolated()
	 * @generated
	 */
	void setIsolated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.bpel4chor.model.pbd.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit On Standard Fault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #setExitOnStandardFault(Boolean)
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getScope_ExitOnStandardFault()
	 * @model
	 * @generated
	 */
	Boolean getExitOnStandardFault();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel4chor.model.pbd.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit On Standard Fault</em>' attribute.
	 * @see org.eclipse.bpel4chor.model.pbd.Boolean
	 * @see #getExitOnStandardFault()
	 * @generated
	 */
	void setExitOnStandardFault(Boolean value);

} // Scope
