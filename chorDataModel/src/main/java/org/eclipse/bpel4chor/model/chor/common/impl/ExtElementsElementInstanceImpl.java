/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.common.impl;

import org.eclipse.bpel4chor.model.chor.common.CommonPackage;
import org.eclipse.bpel4chor.model.chor.common.ExtElementsElementInstance;

import org.eclipse.bpel4chor.model.chor.common.LoopElementInstance;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Elements Element Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl#getLoopIteration <em>Loop Iteration</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.common.impl.ExtElementsElementInstanceImpl#getParentLoopInstance <em>Parent Loop Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtElementsElementInstanceImpl extends ElementInstanceImpl implements ExtElementsElementInstance {
	/**
	 * The default value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected String xpath = XPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopIteration() <em>Loop Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopIteration()
	 * @generated
	 * @ordered
	 */
	protected static final long LOOP_ITERATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLoopIteration() <em>Loop Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopIteration()
	 * @generated
	 * @ordered
	 */
	protected long loopIteration = LOOP_ITERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentLoopInstance() <em>Parent Loop Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentLoopInstance()
	 * @generated
	 * @ordered
	 */
	protected LoopElementInstance parentLoopInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtElementsElementInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EXT_ELEMENTS_ELEMENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(String newXpath) {
		String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH, oldXpath, xpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLoopIteration() {
		return loopIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopIteration(long newLoopIteration) {
		long oldLoopIteration = loopIteration;
		loopIteration = newLoopIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION, oldLoopIteration, loopIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopElementInstance getParentLoopInstance() {
		if (parentLoopInstance != null && parentLoopInstance.eIsProxy()) {
			InternalEObject oldParentLoopInstance = (InternalEObject)parentLoopInstance;
			parentLoopInstance = (LoopElementInstance)eResolveProxy(oldParentLoopInstance);
			if (parentLoopInstance != oldParentLoopInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE, oldParentLoopInstance, parentLoopInstance));
			}
		}
		return parentLoopInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopElementInstance basicGetParentLoopInstance() {
		return parentLoopInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentLoopInstance(LoopElementInstance newParentLoopInstance) {
		LoopElementInstance oldParentLoopInstance = parentLoopInstance;
		parentLoopInstance = newParentLoopInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE, oldParentLoopInstance, parentLoopInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH:
				return getXpath();
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION:
				return getLoopIteration();
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE:
				if (resolve) return getParentLoopInstance();
				return basicGetParentLoopInstance();
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
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH:
				setXpath((String)newValue);
				return;
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION:
				setLoopIteration((Long)newValue);
				return;
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE:
				setParentLoopInstance((LoopElementInstance)newValue);
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
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH:
				setXpath(XPATH_EDEFAULT);
				return;
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION:
				setLoopIteration(LOOP_ITERATION_EDEFAULT);
				return;
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE:
				setParentLoopInstance((LoopElementInstance)null);
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
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__XPATH:
				return XPATH_EDEFAULT == null ? xpath != null : !XPATH_EDEFAULT.equals(xpath);
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__LOOP_ITERATION:
				return loopIteration != LOOP_ITERATION_EDEFAULT;
			case CommonPackage.EXT_ELEMENTS_ELEMENT_INSTANCE__PARENT_LOOP_INSTANCE:
				return parentLoopInstance != null;
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
		result.append(" (xpath: ");
		result.append(xpath);
		result.append(", loopIteration: ");
		result.append(loopIteration);
		result.append(')');
		return result.toString();
	}

} //ExtElementsElementInstanceImpl
