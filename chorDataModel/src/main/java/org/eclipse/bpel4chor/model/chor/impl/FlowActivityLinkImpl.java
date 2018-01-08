/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.ElementInstance;
import org.eclipse.bpel4chor.model.chor.common.impl.EStringToElementInstanceMapImpl;
import org.eclipse.bpel4chor.model.pbd.Activity;
import org.eclipse.bpel4chor.model.pbd.TransitionCondition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Activity Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getSourceActivity <em>Source Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getTargetActivity <em>Target Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getTransitionCondition <em>Transition Condition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.FlowActivityLinkImpl#getInstanceBuffer <em>Instance Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowActivityLinkImpl extends EObjectImpl implements FlowActivityLink
{
        /**
	 * The cached value of the '{@link #getSourceActivity() <em>Source Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getSourceActivity()
	 * @generated
	 * @ordered
	 */
        protected Activity sourceActivity;

        /**
	 * The cached value of the '{@link #getTargetActivity() <em>Target Activity</em>}' reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTargetActivity()
	 * @generated
	 * @ordered
	 */
        protected Activity targetActivity;

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
	 * The cached value of the '{@link #getTransitionCondition() <em>Transition Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getTransitionCondition()
	 * @generated
	 * @ordered
	 */
        protected TransitionCondition transitionCondition;

        /**
	 * The default value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean CHANGED_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

								/**
	 * The cached value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean changed = CHANGED_EDEFAULT;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

								/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getInstanceBuffer() <em>Instance Buffer</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceBuffer()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ElementInstance> instanceBuffer;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected FlowActivityLinkImpl()
        {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass()
        {
		return ChorPackage.Literals.FLOW_ACTIVITY_LINK;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Activity getSourceActivity()
        {
		if (sourceActivity != null && sourceActivity.eIsProxy()) {
			InternalEObject oldSourceActivity = (InternalEObject)sourceActivity;
			sourceActivity = (Activity)eResolveProxy(oldSourceActivity);
			if (sourceActivity != oldSourceActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY, oldSourceActivity, sourceActivity));
			}
		}
		return sourceActivity;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Activity basicGetSourceActivity()
        {
		return sourceActivity;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setSourceActivity(Activity newSourceActivity)
        {
		Activity oldSourceActivity = sourceActivity;
		sourceActivity = newSourceActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY, oldSourceActivity, sourceActivity));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Activity getTargetActivity()
        {
		if (targetActivity != null && targetActivity.eIsProxy()) {
			InternalEObject oldTargetActivity = (InternalEObject)targetActivity;
			targetActivity = (Activity)eResolveProxy(oldTargetActivity);
			if (targetActivity != oldTargetActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY, oldTargetActivity, targetActivity));
			}
		}
		return targetActivity;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public Activity basicGetTargetActivity()
        {
		return targetActivity;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTargetActivity(Activity newTargetActivity)
        {
		Activity oldTargetActivity = targetActivity;
		targetActivity = newTargetActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY, oldTargetActivity, targetActivity));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getName()
        {
		return name;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setName(String newName)
        {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__NAME, oldName, name));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public TransitionCondition getTransitionCondition()
        {
		return transitionCondition;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetTransitionCondition(TransitionCondition newTransitionCondition, NotificationChain msgs)
        {
		TransitionCondition oldTransitionCondition = transitionCondition;
		transitionCondition = newTransitionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION, oldTransitionCondition, newTransitionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTransitionCondition(TransitionCondition newTransitionCondition)
        {
		if (newTransitionCondition != transitionCondition) {
			NotificationChain msgs = null;
			if (transitionCondition != null)
				msgs = ((InternalEObject)transitionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION, null, msgs);
			if (newTransitionCondition != null)
				msgs = ((InternalEObject)newTransitionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION, null, msgs);
			msgs = basicSetTransitionCondition(newTransitionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION, newTransitionCondition, newTransitionCondition));
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getChanged() {
		return changed;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(org.eclipse.bpel4chor.model.pbd.Boolean newChanged) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldChanged = changed;
		changed = newChanged == null ? CHANGED_EDEFAULT : newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__CHANGED, oldChanged, changed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__STATE, oldState, state));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__ID, oldId, id));
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ElementInstance> getInstanceBuffer() {
		if (instanceBuffer == null) {
			instanceBuffer = new EcoreEMap<String,ElementInstance>(CommonPackage.Literals.ESTRING_TO_ELEMENT_INSTANCE_MAP, EStringToElementInstanceMapImpl.class, this, ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER);
		}
		return instanceBuffer;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_ID, oldInstanceID, instanceID));
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
        {
		switch (featureID) {
			case ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION:
				return basicSetTransitionCondition(null, msgs);
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER:
				return ((InternalEList<?>)getInstanceBuffer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType)
        {
		switch (featureID) {
			case ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY:
				if (resolve) return getSourceActivity();
				return basicGetSourceActivity();
			case ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY:
				if (resolve) return getTargetActivity();
				return basicGetTargetActivity();
			case ChorPackage.FLOW_ACTIVITY_LINK__NAME:
				return getName();
			case ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION:
				return getTransitionCondition();
			case ChorPackage.FLOW_ACTIVITY_LINK__CHANGED:
				return getChanged();
			case ChorPackage.FLOW_ACTIVITY_LINK__STATE:
				return getState();
			case ChorPackage.FLOW_ACTIVITY_LINK__ID:
				return getId();
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_ID:
				return getInstanceID();
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER:
				if (coreType) return getInstanceBuffer();
				else return getInstanceBuffer().map();
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
        public void eSet(int featureID, Object newValue)
        {
		switch (featureID) {
			case ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY:
				setSourceActivity((Activity)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY:
				setTargetActivity((Activity)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__NAME:
				setName((String)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION:
				setTransitionCondition((TransitionCondition)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__CHANGED:
				setChanged((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__STATE:
				setState((String)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__ID:
				setId((String)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER:
				((EStructuralFeature.Setting)getInstanceBuffer()).set(newValue);
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
        public void eUnset(int featureID)
        {
		switch (featureID) {
			case ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY:
				setSourceActivity((Activity)null);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY:
				setTargetActivity((Activity)null);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION:
				setTransitionCondition((TransitionCondition)null);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER:
				getInstanceBuffer().clear();
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
        public boolean eIsSet(int featureID)
        {
		switch (featureID) {
			case ChorPackage.FLOW_ACTIVITY_LINK__SOURCE_ACTIVITY:
				return sourceActivity != null;
			case ChorPackage.FLOW_ACTIVITY_LINK__TARGET_ACTIVITY:
				return targetActivity != null;
			case ChorPackage.FLOW_ACTIVITY_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChorPackage.FLOW_ACTIVITY_LINK__TRANSITION_CONDITION:
				return transitionCondition != null;
			case ChorPackage.FLOW_ACTIVITY_LINK__CHANGED:
				return changed != CHANGED_EDEFAULT;
			case ChorPackage.FLOW_ACTIVITY_LINK__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ChorPackage.FLOW_ACTIVITY_LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case ChorPackage.FLOW_ACTIVITY_LINK__INSTANCE_BUFFER:
				return instanceBuffer != null && !instanceBuffer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String toString()
        {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", changed: ");
		result.append(changed);
		result.append(", state: ");
		result.append(state);
		result.append(", id: ");
		result.append(id);
		result.append(", instanceID: ");
		result.append(instanceID);
		result.append(')');
		return result.toString();
	}

} //FlowActivityLinkImpl
