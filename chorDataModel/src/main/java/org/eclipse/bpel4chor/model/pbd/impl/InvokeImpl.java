/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.pbd.ActivityContainer;
import org.eclipse.bpel4chor.model.pbd.CLinkable;
import org.eclipse.bpel4chor.model.pbd.Catch;
import org.eclipse.bpel4chor.model.pbd.CatchAll;
import org.eclipse.bpel4chor.model.pbd.Correlations;
import org.eclipse.bpel4chor.model.pbd.DanglingMessageLink;
import org.eclipse.bpel4chor.model.pbd.FromParts;
import org.eclipse.bpel4chor.model.pbd.Invoke;
import org.eclipse.bpel4chor.model.pbd.PbdPackage;
import org.eclipse.bpel4chor.model.pbd.ToParts;

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
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getDanglingMessageLink <em>Dangling Message Link</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getCatchAll <em>Catch All</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getCompensationHandler <em>Compensation Handler</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getToParts <em>To Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getFromParts <em>From Parts</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getInputVariable <em>Input Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.impl.InvokeImpl#getOutputVariable <em>Output Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends ActivityImpl implements Invoke {
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
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
	protected Correlations correlations;

	/**
	 * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Catch> catch_;

	/**
	 * The cached value of the '{@link #getCatchAll() <em>Catch All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchAll()
	 * @generated
	 * @ordered
	 */
	protected CatchAll catchAll;

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
	 * The cached value of the '{@link #getToParts() <em>To Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToParts()
	 * @generated
	 * @ordered
	 */
	protected ToParts toParts;

	/**
	 * The cached value of the '{@link #getFromParts() <em>From Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromParts()
	 * @generated
	 * @ordered
	 */
	protected FromParts fromParts;

	/**
	 * The default value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputVariable() <em>Input Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariable()
	 * @generated
	 * @ordered
	 */
	protected String inputVariable = INPUT_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputVariable() <em>Output Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariable()
	 * @generated
	 * @ordered
	 */
	protected String outputVariable = OUTPUT_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PbdPackage.Literals.INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DanglingMessageLink> getDanglingMessageLink() {
		if (danglingMessageLink == null) {
			danglingMessageLink = new EObjectContainmentEList<DanglingMessageLink>(DanglingMessageLink.class, this, PbdPackage.INVOKE__DANGLING_MESSAGE_LINK);
		}
		return danglingMessageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlations getCorrelations() {
		return correlations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelations(Correlations newCorrelations, NotificationChain msgs) {
		Correlations oldCorrelations = correlations;
		correlations = newCorrelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__CORRELATIONS, oldCorrelations, newCorrelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelations(Correlations newCorrelations) {
		if (newCorrelations != correlations) {
			NotificationChain msgs = null;
			if (correlations != null)
				msgs = ((InternalEObject)correlations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__CORRELATIONS, null, msgs);
			if (newCorrelations != null)
				msgs = ((InternalEObject)newCorrelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__CORRELATIONS, null, msgs);
			msgs = basicSetCorrelations(newCorrelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__CORRELATIONS, newCorrelations, newCorrelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catch> getCatch() {
		if (catch_ == null) {
			catch_ = new EObjectContainmentEList<Catch>(Catch.class, this, PbdPackage.INVOKE__CATCH);
		}
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchAll getCatchAll() {
		return catchAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchAll(CatchAll newCatchAll, NotificationChain msgs) {
		CatchAll oldCatchAll = catchAll;
		catchAll = newCatchAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__CATCH_ALL, oldCatchAll, newCatchAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchAll(CatchAll newCatchAll) {
		if (newCatchAll != catchAll) {
			NotificationChain msgs = null;
			if (catchAll != null)
				msgs = ((InternalEObject)catchAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__CATCH_ALL, null, msgs);
			if (newCatchAll != null)
				msgs = ((InternalEObject)newCatchAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__CATCH_ALL, null, msgs);
			msgs = basicSetCatchAll(newCatchAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__CATCH_ALL, newCatchAll, newCatchAll));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__COMPENSATION_HANDLER, oldCompensationHandler, newCompensationHandler);
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
				msgs = ((InternalEObject)compensationHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__COMPENSATION_HANDLER, null, msgs);
			if (newCompensationHandler != null)
				msgs = ((InternalEObject)newCompensationHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__COMPENSATION_HANDLER, null, msgs);
			msgs = basicSetCompensationHandler(newCompensationHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__COMPENSATION_HANDLER, newCompensationHandler, newCompensationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToParts getToParts() {
		return toParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToParts(ToParts newToParts, NotificationChain msgs) {
		ToParts oldToParts = toParts;
		toParts = newToParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__TO_PARTS, oldToParts, newToParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParts(ToParts newToParts) {
		if (newToParts != toParts) {
			NotificationChain msgs = null;
			if (toParts != null)
				msgs = ((InternalEObject)toParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__TO_PARTS, null, msgs);
			if (newToParts != null)
				msgs = ((InternalEObject)newToParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__TO_PARTS, null, msgs);
			msgs = basicSetToParts(newToParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__TO_PARTS, newToParts, newToParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromParts getFromParts() {
		return fromParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromParts(FromParts newFromParts, NotificationChain msgs) {
		FromParts oldFromParts = fromParts;
		fromParts = newFromParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__FROM_PARTS, oldFromParts, newFromParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromParts(FromParts newFromParts) {
		if (newFromParts != fromParts) {
			NotificationChain msgs = null;
			if (fromParts != null)
				msgs = ((InternalEObject)fromParts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__FROM_PARTS, null, msgs);
			if (newFromParts != null)
				msgs = ((InternalEObject)newFromParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PbdPackage.INVOKE__FROM_PARTS, null, msgs);
			msgs = basicSetFromParts(newFromParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__FROM_PARTS, newFromParts, newFromParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputVariable() {
		return inputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVariable(String newInputVariable) {
		String oldInputVariable = inputVariable;
		inputVariable = newInputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__INPUT_VARIABLE, oldInputVariable, inputVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputVariable() {
		return outputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVariable(String newOutputVariable) {
		String oldOutputVariable = outputVariable;
		outputVariable = newOutputVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PbdPackage.INVOKE__OUTPUT_VARIABLE, oldOutputVariable, outputVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK:
				return ((InternalEList<?>)getDanglingMessageLink()).basicRemove(otherEnd, msgs);
			case PbdPackage.INVOKE__CORRELATIONS:
				return basicSetCorrelations(null, msgs);
			case PbdPackage.INVOKE__CATCH:
				return ((InternalEList<?>)getCatch()).basicRemove(otherEnd, msgs);
			case PbdPackage.INVOKE__CATCH_ALL:
				return basicSetCatchAll(null, msgs);
			case PbdPackage.INVOKE__COMPENSATION_HANDLER:
				return basicSetCompensationHandler(null, msgs);
			case PbdPackage.INVOKE__TO_PARTS:
				return basicSetToParts(null, msgs);
			case PbdPackage.INVOKE__FROM_PARTS:
				return basicSetFromParts(null, msgs);
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
			case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK:
				return getDanglingMessageLink();
			case PbdPackage.INVOKE__CORRELATIONS:
				return getCorrelations();
			case PbdPackage.INVOKE__CATCH:
				return getCatch();
			case PbdPackage.INVOKE__CATCH_ALL:
				return getCatchAll();
			case PbdPackage.INVOKE__COMPENSATION_HANDLER:
				return getCompensationHandler();
			case PbdPackage.INVOKE__TO_PARTS:
				return getToParts();
			case PbdPackage.INVOKE__FROM_PARTS:
				return getFromParts();
			case PbdPackage.INVOKE__INPUT_VARIABLE:
				return getInputVariable();
			case PbdPackage.INVOKE__OUTPUT_VARIABLE:
				return getOutputVariable();
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
			case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				getDanglingMessageLink().addAll((Collection<? extends DanglingMessageLink>)newValue);
				return;
			case PbdPackage.INVOKE__CORRELATIONS:
				setCorrelations((Correlations)newValue);
				return;
			case PbdPackage.INVOKE__CATCH:
				getCatch().clear();
				getCatch().addAll((Collection<? extends Catch>)newValue);
				return;
			case PbdPackage.INVOKE__CATCH_ALL:
				setCatchAll((CatchAll)newValue);
				return;
			case PbdPackage.INVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)newValue);
				return;
			case PbdPackage.INVOKE__TO_PARTS:
				setToParts((ToParts)newValue);
				return;
			case PbdPackage.INVOKE__FROM_PARTS:
				setFromParts((FromParts)newValue);
				return;
			case PbdPackage.INVOKE__INPUT_VARIABLE:
				setInputVariable((String)newValue);
				return;
			case PbdPackage.INVOKE__OUTPUT_VARIABLE:
				setOutputVariable((String)newValue);
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
			case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK:
				getDanglingMessageLink().clear();
				return;
			case PbdPackage.INVOKE__CORRELATIONS:
				setCorrelations((Correlations)null);
				return;
			case PbdPackage.INVOKE__CATCH:
				getCatch().clear();
				return;
			case PbdPackage.INVOKE__CATCH_ALL:
				setCatchAll((CatchAll)null);
				return;
			case PbdPackage.INVOKE__COMPENSATION_HANDLER:
				setCompensationHandler((ActivityContainer)null);
				return;
			case PbdPackage.INVOKE__TO_PARTS:
				setToParts((ToParts)null);
				return;
			case PbdPackage.INVOKE__FROM_PARTS:
				setFromParts((FromParts)null);
				return;
			case PbdPackage.INVOKE__INPUT_VARIABLE:
				setInputVariable(INPUT_VARIABLE_EDEFAULT);
				return;
			case PbdPackage.INVOKE__OUTPUT_VARIABLE:
				setOutputVariable(OUTPUT_VARIABLE_EDEFAULT);
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
			case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK:
				return danglingMessageLink != null && !danglingMessageLink.isEmpty();
			case PbdPackage.INVOKE__CORRELATIONS:
				return correlations != null;
			case PbdPackage.INVOKE__CATCH:
				return catch_ != null && !catch_.isEmpty();
			case PbdPackage.INVOKE__CATCH_ALL:
				return catchAll != null;
			case PbdPackage.INVOKE__COMPENSATION_HANDLER:
				return compensationHandler != null;
			case PbdPackage.INVOKE__TO_PARTS:
				return toParts != null;
			case PbdPackage.INVOKE__FROM_PARTS:
				return fromParts != null;
			case PbdPackage.INVOKE__INPUT_VARIABLE:
				return INPUT_VARIABLE_EDEFAULT == null ? inputVariable != null : !INPUT_VARIABLE_EDEFAULT.equals(inputVariable);
			case PbdPackage.INVOKE__OUTPUT_VARIABLE:
				return OUTPUT_VARIABLE_EDEFAULT == null ? outputVariable != null : !OUTPUT_VARIABLE_EDEFAULT.equals(outputVariable);
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
				case PbdPackage.INVOKE__DANGLING_MESSAGE_LINK: return PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK;
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
				case PbdPackage.CLINKABLE__DANGLING_MESSAGE_LINK: return PbdPackage.INVOKE__DANGLING_MESSAGE_LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (inputVariable: ");
		result.append(inputVariable);
		result.append(", outputVariable: ");
		result.append(outputVariable);
		result.append(')');
		return result.toString();
	}

} //InvokeImpl
