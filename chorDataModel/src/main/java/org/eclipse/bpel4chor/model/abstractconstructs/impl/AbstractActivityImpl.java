/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.abstractconstructs.impl;

import org.eclipse.bpel4chor.model.abstractconstructs.AbstractActivity;
import org.eclipse.bpel4chor.model.abstractconstructs.AbstractconstructsPackage;
import org.eclipse.bpel4chor.model.abstractconstructs.RefinementPhases;

import org.eclipse.bpel4chor.model.pbd.impl.ExtensionActivityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl#getRefinementStartPhase <em>Refinement Start Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl#getRefinementEndPhase <em>Refinement End Phase</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl#getFailureHandlingStrategy <em>Failure Handling Strategy</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl#getPluginType <em>Plugin Type</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.abstractconstructs.impl.AbstractActivityImpl#getTypeSpecificContent <em>Type Specific Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractActivityImpl extends ExtensionActivityImpl implements AbstractActivity {
	/**
	 * The default value of the '{@link #getRefinementStartPhase() <em>Refinement Start Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementStartPhase()
	 * @generated
	 * @ordered
	 */
	protected static final RefinementPhases REFINEMENT_START_PHASE_EDEFAULT = RefinementPhases.CHOREOGRAPHY_MODELING;

	/**
	 * The cached value of the '{@link #getRefinementStartPhase() <em>Refinement Start Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementStartPhase()
	 * @generated
	 * @ordered
	 */
	protected RefinementPhases refinementStartPhase = REFINEMENT_START_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefinementEndPhase() <em>Refinement End Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementEndPhase()
	 * @generated
	 * @ordered
	 */
	protected static final RefinementPhases REFINEMENT_END_PHASE_EDEFAULT = RefinementPhases.CHOREOGRAPHY_MODELING;

	/**
	 * The cached value of the '{@link #getRefinementEndPhase() <em>Refinement End Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementEndPhase()
	 * @generated
	 * @ordered
	 */
	protected RefinementPhases refinementEndPhase = REFINEMENT_END_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureHandlingStrategy() <em>Failure Handling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureHandlingStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_HANDLING_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureHandlingStrategy() <em>Failure Handling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureHandlingStrategy()
	 * @generated
	 * @ordered
	 */
	protected String failureHandlingStrategy = FAILURE_HANDLING_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginType() <em>Plugin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginType()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginType() <em>Plugin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginType()
	 * @generated
	 * @ordered
	 */
	protected String pluginType = PLUGIN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeSpecificContent() <em>Type Specific Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpecificContent()
	 * @generated
	 * @ordered
	 */
	protected EObject typeSpecificContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractconstructsPackage.Literals.ABSTRACT_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementPhases getRefinementStartPhase() {
		return refinementStartPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinementStartPhase(RefinementPhases newRefinementStartPhase) {
		RefinementPhases oldRefinementStartPhase = refinementStartPhase;
		refinementStartPhase = newRefinementStartPhase == null ? REFINEMENT_START_PHASE_EDEFAULT : newRefinementStartPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE, oldRefinementStartPhase, refinementStartPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementPhases getRefinementEndPhase() {
		return refinementEndPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinementEndPhase(RefinementPhases newRefinementEndPhase) {
		RefinementPhases oldRefinementEndPhase = refinementEndPhase;
		refinementEndPhase = newRefinementEndPhase == null ? REFINEMENT_END_PHASE_EDEFAULT : newRefinementEndPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE, oldRefinementEndPhase, refinementEndPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailureHandlingStrategy() {
		return failureHandlingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureHandlingStrategy(String newFailureHandlingStrategy) {
		String oldFailureHandlingStrategy = failureHandlingStrategy;
		failureHandlingStrategy = newFailureHandlingStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractconstructsPackage.ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY, oldFailureHandlingStrategy, failureHandlingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginType() {
		return pluginType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginType(String newPluginType) {
		String oldPluginType = pluginType;
		pluginType = newPluginType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractconstructsPackage.ABSTRACT_ACTIVITY__PLUGIN_TYPE, oldPluginType, pluginType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTypeSpecificContent() {
		if (typeSpecificContent != null && typeSpecificContent.eIsProxy()) {
			InternalEObject oldTypeSpecificContent = (InternalEObject)typeSpecificContent;
			typeSpecificContent = eResolveProxy(oldTypeSpecificContent);
			if (typeSpecificContent != oldTypeSpecificContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT, oldTypeSpecificContent, typeSpecificContent));
			}
		}
		return typeSpecificContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTypeSpecificContent() {
		return typeSpecificContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSpecificContent(EObject newTypeSpecificContent) {
		EObject oldTypeSpecificContent = typeSpecificContent;
		typeSpecificContent = newTypeSpecificContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT, oldTypeSpecificContent, typeSpecificContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE:
				return getRefinementStartPhase();
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE:
				return getRefinementEndPhase();
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY:
				return getFailureHandlingStrategy();
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__PLUGIN_TYPE:
				return getPluginType();
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT:
				if (resolve) return getTypeSpecificContent();
				return basicGetTypeSpecificContent();
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
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE:
				setRefinementStartPhase((RefinementPhases)newValue);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE:
				setRefinementEndPhase((RefinementPhases)newValue);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY:
				setFailureHandlingStrategy((String)newValue);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__PLUGIN_TYPE:
				setPluginType((String)newValue);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT:
				setTypeSpecificContent((EObject)newValue);
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
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE:
				setRefinementStartPhase(REFINEMENT_START_PHASE_EDEFAULT);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE:
				setRefinementEndPhase(REFINEMENT_END_PHASE_EDEFAULT);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY:
				setFailureHandlingStrategy(FAILURE_HANDLING_STRATEGY_EDEFAULT);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__PLUGIN_TYPE:
				setPluginType(PLUGIN_TYPE_EDEFAULT);
				return;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT:
				setTypeSpecificContent((EObject)null);
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
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_START_PHASE:
				return refinementStartPhase != REFINEMENT_START_PHASE_EDEFAULT;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__REFINEMENT_END_PHASE:
				return refinementEndPhase != REFINEMENT_END_PHASE_EDEFAULT;
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__FAILURE_HANDLING_STRATEGY:
				return FAILURE_HANDLING_STRATEGY_EDEFAULT == null ? failureHandlingStrategy != null : !FAILURE_HANDLING_STRATEGY_EDEFAULT.equals(failureHandlingStrategy);
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__PLUGIN_TYPE:
				return PLUGIN_TYPE_EDEFAULT == null ? pluginType != null : !PLUGIN_TYPE_EDEFAULT.equals(pluginType);
			case AbstractconstructsPackage.ABSTRACT_ACTIVITY__TYPE_SPECIFIC_CONTENT:
				return typeSpecificContent != null;
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
		result.append(" (refinementStartPhase: ");
		result.append(refinementStartPhase);
		result.append(", refinementEndPhase: ");
		result.append(refinementEndPhase);
		result.append(", failureHandlingStrategy: ");
		result.append(failureHandlingStrategy);
		result.append(", pluginType: ");
		result.append(pluginType);
		result.append(')');
		return result.toString();
	}

} //AbstractActivityImpl
