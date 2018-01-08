/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractContainer;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage;

import org.eclipse.bpel4chor.model.pbd.Activity;

import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.DanglingMessageLink;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl#getDanglingMessageLink <em>Dangling Message Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractContainerImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractContainerImpl extends ExtensionActivityImpl implements AbstractContainer {
	/**
	 * The cached value of the '{@link #getDanglingMessageLink() <em>Dangling Message Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDanglingMessageLink()
	 * @generated
	 * @ordered
	 */
	protected EList<DanglingMessageLink> danglingMessageLink;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractconstructsPackage.Literals.ABSTRACT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DanglingMessageLink> getDanglingMessageLink() {
		if (danglingMessageLink == null) {
			danglingMessageLink = new EObjectContainmentEList<DanglingMessageLink>(DanglingMessageLink.class, this, AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK);
		}
		return danglingMessageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Activity>(Activity.class, this, AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK:
				return ((InternalEList<?>)getDanglingMessageLink()).basicRemove(otherEnd, msgs);
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK:
				return getDanglingMessageLink();
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT:
				return getContent();
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
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				getDanglingMessageLink().addAll((Collection<? extends DanglingMessageLink>)newValue);
				return;
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Activity>)newValue);
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
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				return;
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT:
				getContent().clear();
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
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK:
				return danglingMessageLink != null && !danglingMessageLink.isEmpty();
			case AbstractconstructsPackage.ABSTRACT_CONTAINER__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CLinkable.class) {
			switch (derivedFeatureID) {
				case AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK: return PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CLinkable.class) {
			switch (baseFeatureID) {
				case PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK: return AbstractconstructsPackage.ABSTRACT_CONTAINER__DANGLING_MESSAGE_LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractContainerImpl
