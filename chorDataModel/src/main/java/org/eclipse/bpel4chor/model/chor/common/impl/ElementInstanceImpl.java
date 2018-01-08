/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl#getProcessInstanceID <em>Process Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ElementInstanceImpl#isVisited <em>Visited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementInstanceImpl extends EObjectImpl implements ElementInstance {
	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessInstanceID() <em>Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessInstanceID() <em>Process Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String processInstanceID = PROCESS_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisited() <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisited() <em>Visited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisited()
	 * @generated
	 * @ordered
	 */
	protected boolean visited = VISITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ELEMENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELEMENT_INSTANCE__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessInstanceID() {
		return processInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessInstanceID(String newProcessInstanceID) {
		String oldProcessInstanceID = processInstanceID;
		processInstanceID = newProcessInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELEMENT_INSTANCE__PROCESS_INSTANCE_ID, oldProcessInstanceID, processInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELEMENT_INSTANCE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELEMENT_INSTANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisited(boolean newVisited) {
		boolean oldVisited = visited;
		visited = newVisited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ELEMENT_INSTANCE__VISITED, oldVisited, visited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ELEMENT_INSTANCE__INSTANCE_ID:
				return getInstanceID();
			case CommonPackage.ELEMENT_INSTANCE__PROCESS_INSTANCE_ID:
				return getProcessInstanceID();
			case CommonPackage.ELEMENT_INSTANCE__TIMESTAMP:
				return getTimestamp();
			case CommonPackage.ELEMENT_INSTANCE__STATE:
				return getState();
			case CommonPackage.ELEMENT_INSTANCE__VISITED:
				return isVisited();
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
			case CommonPackage.ELEMENT_INSTANCE__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case CommonPackage.ELEMENT_INSTANCE__PROCESS_INSTANCE_ID:
				setProcessInstanceID((String)newValue);
				return;
			case CommonPackage.ELEMENT_INSTANCE__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case CommonPackage.ELEMENT_INSTANCE__STATE:
				setState((String)newValue);
				return;
			case CommonPackage.ELEMENT_INSTANCE__VISITED:
				setVisited((Boolean)newValue);
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
			case CommonPackage.ELEMENT_INSTANCE__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case CommonPackage.ELEMENT_INSTANCE__PROCESS_INSTANCE_ID:
				setProcessInstanceID(PROCESS_INSTANCE_ID_EDEFAULT);
				return;
			case CommonPackage.ELEMENT_INSTANCE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CommonPackage.ELEMENT_INSTANCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CommonPackage.ELEMENT_INSTANCE__VISITED:
				setVisited(VISITED_EDEFAULT);
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
			case CommonPackage.ELEMENT_INSTANCE__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case CommonPackage.ELEMENT_INSTANCE__PROCESS_INSTANCE_ID:
				return PROCESS_INSTANCE_ID_EDEFAULT == null ? processInstanceID != null : !PROCESS_INSTANCE_ID_EDEFAULT.equals(processInstanceID);
			case CommonPackage.ELEMENT_INSTANCE__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case CommonPackage.ELEMENT_INSTANCE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CommonPackage.ELEMENT_INSTANCE__VISITED:
				return visited != VISITED_EDEFAULT;
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
		result.append(" (instanceID: ");
		result.append(instanceID);
		result.append(", processInstanceID: ");
		result.append(processInstanceID);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", state: ");
		result.append(state);
		result.append(", visited: ");
		result.append(visited);
		result.append(')');
		return result.toString();
	}

} //ElementInstanceImpl
