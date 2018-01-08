/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.CompletionCondition;
import org.eclipse.bpel4chor.model.pbd.FinalCounterValue;
import org.eclipse.bpel4chor.model.pbd.ForEach;
import org.eclipse.bpel4chor.model.pbd.LoopIteration;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.Scope;
import org.eclipse.bpel4chor.model.pbd.StartCounterValue;

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
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getStartCounterValue <em>Start Counter Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getFinalCounterValue <em>Final Counter Value</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getCounterName <em>Counter Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.ForEachImpl#getStateBuffer <em>State Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachImpl extends ActivityImpl implements ForEach {
	/**
	 * The cached value of the '{@link #getStartCounterValue() <em>Start Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCounterValue()
	 * @generated
	 * @ordered
	 */
	protected StartCounterValue startCounterValue;

	/**
	 * The cached value of the '{@link #getFinalCounterValue() <em>Final Counter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCounterValue()
	 * @generated
	 * @ordered
	 */
	protected FinalCounterValue finalCounterValue;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected CompletionCondition completionCondition;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The default value of the '{@link #getCounterName() <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterName()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterName() <em>Counter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterName()
	 * @generated
	 * @ordered
	 */
	protected String counterName = COUNTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.bpel4chor.model.pbd.Boolean PARALLEL_EDEFAULT = org.eclipse.bpel4chor.model.pbd.Boolean.NO;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.bpel4chor.model.pbd.Boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateBuffer() <em>State Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopIteration> stateBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForEachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.FOR_EACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartCounterValue getStartCounterValue() {
		return startCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCounterValue(StartCounterValue newStartCounterValue, NotificationChain msgs) {
		StartCounterValue oldStartCounterValue = startCounterValue;
		startCounterValue = newStartCounterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__START_COUNTER_VALUE, oldStartCounterValue, newStartCounterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCounterValue(StartCounterValue newStartCounterValue) {
		if (newStartCounterValue != startCounterValue) {
			NotificationChain msgs = null;
			if (startCounterValue != null)
				msgs = ((InternalEObject)startCounterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__START_COUNTER_VALUE, null, msgs);
			if (newStartCounterValue != null)
				msgs = ((InternalEObject)newStartCounterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__START_COUNTER_VALUE, null, msgs);
			msgs = basicSetStartCounterValue(newStartCounterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__START_COUNTER_VALUE, newStartCounterValue, newStartCounterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalCounterValue getFinalCounterValue() {
		return finalCounterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalCounterValue(FinalCounterValue newFinalCounterValue, NotificationChain msgs) {
		FinalCounterValue oldFinalCounterValue = finalCounterValue;
		finalCounterValue = newFinalCounterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE, oldFinalCounterValue, newFinalCounterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalCounterValue(FinalCounterValue newFinalCounterValue) {
		if (newFinalCounterValue != finalCounterValue) {
			NotificationChain msgs = null;
			if (finalCounterValue != null)
				msgs = ((InternalEObject)finalCounterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE, null, msgs);
			if (newFinalCounterValue != null)
				msgs = ((InternalEObject)newFinalCounterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE, null, msgs);
			msgs = basicSetFinalCounterValue(newFinalCounterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE, newFinalCounterValue, newFinalCounterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionCondition getCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(CompletionCondition newCompletionCondition, NotificationChain msgs) {
		CompletionCondition oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(CompletionCondition newCompletionCondition) {
		if (newCompletionCondition != completionCondition) {
			NotificationChain msgs = null;
			if (completionCondition != null)
				msgs = ((InternalEObject)completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__COMPLETION_CONDITION, null, msgs);
			if (newCompletionCondition != null)
				msgs = ((InternalEObject)newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__COMPLETION_CONDITION, null, msgs);
			msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.FOR_EACH__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterName() {
		return counterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterName(String newCounterName) {
		String oldCounterName = counterName;
		counterName = newCounterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__COUNTER_NAME, oldCounterName, counterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.bpel4chor.model.pbd.Boolean getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(org.eclipse.bpel4chor.model.pbd.Boolean newParallel) {
		org.eclipse.bpel4chor.model.pbd.Boolean oldParallel = parallel;
		parallel = newParallel == null ? PARALLEL_EDEFAULT : newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.FOR_EACH__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopIteration> getStateBuffer() {
		if (stateBuffer == null) {
			stateBuffer = new EObjectContainmentEList<LoopIteration>(LoopIteration.class, this, PbdPackage.FOR_EACH__STATE_BUFFER);
		}
		return stateBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.FOR_EACH__START_COUNTER_VALUE:
				return basicSetStartCounterValue(null, msgs);
			case PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return basicSetFinalCounterValue(null, msgs);
			case PbdPackage.FOR_EACH__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
			case PbdPackage.FOR_EACH__SCOPE:
				return basicSetScope(null, msgs);
			case PbdPackage.FOR_EACH__STATE_BUFFER:
				return ((InternalEList<?>)getStateBuffer()).basicRemove(otherEnd, msgs);
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
			case PbdPackage.FOR_EACH__START_COUNTER_VALUE:
				return getStartCounterValue();
			case PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return getFinalCounterValue();
			case PbdPackage.FOR_EACH__COMPLETION_CONDITION:
				return getCompletionCondition();
			case PbdPackage.FOR_EACH__SCOPE:
				return getScope();
			case PbdPackage.FOR_EACH__COUNTER_NAME:
				return getCounterName();
			case PbdPackage.FOR_EACH__PARALLEL:
				return getParallel();
			case PbdPackage.FOR_EACH__VARIABLE:
				return getVariable();
			case PbdPackage.FOR_EACH__STATE_BUFFER:
				return getStateBuffer();
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
			case PbdPackage.FOR_EACH__START_COUNTER_VALUE:
				setStartCounterValue((StartCounterValue)newValue);
				return;
			case PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE:
				setFinalCounterValue((FinalCounterValue)newValue);
				return;
			case PbdPackage.FOR_EACH__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)newValue);
				return;
			case PbdPackage.FOR_EACH__SCOPE:
				setScope((Scope)newValue);
				return;
			case PbdPackage.FOR_EACH__COUNTER_NAME:
				setCounterName((String)newValue);
				return;
			case PbdPackage.FOR_EACH__PARALLEL:
				setParallel((org.eclipse.bpel4chor.model.pbd.Boolean)newValue);
				return;
			case PbdPackage.FOR_EACH__VARIABLE:
				setVariable((String)newValue);
				return;
			case PbdPackage.FOR_EACH__STATE_BUFFER:
				getStateBuffer().clear();
				getStateBuffer().addAll((Collection<? extends LoopIteration>)newValue);
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
			case PbdPackage.FOR_EACH__START_COUNTER_VALUE:
				setStartCounterValue((StartCounterValue)null);
				return;
			case PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE:
				setFinalCounterValue((FinalCounterValue)null);
				return;
			case PbdPackage.FOR_EACH__COMPLETION_CONDITION:
				setCompletionCondition((CompletionCondition)null);
				return;
			case PbdPackage.FOR_EACH__SCOPE:
				setScope((Scope)null);
				return;
			case PbdPackage.FOR_EACH__COUNTER_NAME:
				setCounterName(COUNTER_NAME_EDEFAULT);
				return;
			case PbdPackage.FOR_EACH__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case PbdPackage.FOR_EACH__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case PbdPackage.FOR_EACH__STATE_BUFFER:
				getStateBuffer().clear();
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
			case PbdPackage.FOR_EACH__START_COUNTER_VALUE:
				return startCounterValue != null;
			case PbdPackage.FOR_EACH__FINAL_COUNTER_VALUE:
				return finalCounterValue != null;
			case PbdPackage.FOR_EACH__COMPLETION_CONDITION:
				return completionCondition != null;
			case PbdPackage.FOR_EACH__SCOPE:
				return scope != null;
			case PbdPackage.FOR_EACH__COUNTER_NAME:
				return COUNTER_NAME_EDEFAULT == null ? counterName != null : !COUNTER_NAME_EDEFAULT.equals(counterName);
			case PbdPackage.FOR_EACH__PARALLEL:
				return parallel != PARALLEL_EDEFAULT;
			case PbdPackage.FOR_EACH__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case PbdPackage.FOR_EACH__STATE_BUFFER:
				return stateBuffer != null && !stateBuffer.isEmpty();
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
		result.append(" (counterName: ");
		result.append(counterName);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(", variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //ForEachImpl
