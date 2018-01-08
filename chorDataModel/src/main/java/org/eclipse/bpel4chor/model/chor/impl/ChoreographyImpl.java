/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.chor.impl;

import java.util.Collection;

import org.eclipse.bpel4chor.model.chor.AbstractConnectorLink;
import org.eclipse.bpel4chor.model.chor.CGrounding;
import org.eclipse.bpel4chor.model.chor.CMessageLink;
import org.eclipse.bpel4chor.model.chor.CParticipant;
import org.eclipse.bpel4chor.model.chor.CParticipantRef;
import org.eclipse.bpel4chor.model.chor.CParticipantSet;
import org.eclipse.bpel4chor.model.chor.ChorPackage;
import org.eclipse.bpel4chor.model.chor.Choreography;
import org.eclipse.bpel4chor.model.chor.FlowActivityLink;
import org.eclipse.bpel4chor.model.chor.ForEachIterationSpec;

import org.eclipse.bpel4chor.model.globalDataModel.GlobalDataModel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getParticipantSets <em>Participant Sets</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getMessageLinks <em>Message Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getFlowActivityLinks <em>Flow Activity Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getGroundings <em>Groundings</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getForEachIterationSpecs <em>For Each Iteration Specs</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getAbstractConnectorLinks <em>Abstract Connector Links</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.chor.impl.ChoreographyImpl#getGlobalDataModel <em>Global Data Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographyImpl extends EObjectImpl implements Choreography
{
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
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipant> participants;

        /**
	 * The cached value of the '{@link #getParticipantSets() <em>Participant Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipantSets()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipantSet> participantSets;

        /**
	 * The cached value of the '{@link #getMessageLinks() <em>Message Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMessageLinks()
	 * @generated
	 * @ordered
	 */
        protected EList<CMessageLink> messageLinks;

        /**
	 * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getParticipantRefs()
	 * @generated
	 * @ordered
	 */
        protected EList<CParticipantRef> participantRefs;

        /**
	 * The cached value of the '{@link #getFlowActivityLinks() <em>Flow Activity Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getFlowActivityLinks()
	 * @generated
	 * @ordered
	 */
        protected EList<FlowActivityLink> flowActivityLinks;

        /**
	 * The cached value of the '{@link #getGroundings() <em>Groundings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getGroundings()
	 * @generated
	 * @ordered
	 */
        protected EList<CGrounding> groundings;

        /**
	 * The cached value of the '{@link #getForEachIterationSpecs() <em>For Each Iteration Specs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getForEachIterationSpecs()
	 * @generated
	 * @ordered
	 */
        protected EList<ForEachIterationSpec> forEachIterationSpecs;

        /**
	 * The cached value of the '{@link #getAbstractConnectorLinks() <em>Abstract Connector Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractConnectorLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConnectorLink> abstractConnectorLinks;

								/**
	 * The cached value of the '{@link #getGlobalDataModel() <em>Global Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalDataModel()
	 * @generated
	 * @ordered
	 */
	protected GlobalDataModel globalDataModel;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected ChoreographyImpl()
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
		return ChorPackage.Literals.CHOREOGRAPHY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CHOREOGRAPHY__NAME, oldName, name));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public String getTargetNamespace()
        {
		return targetNamespace;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setTargetNamespace(String newTargetNamespace)
        {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CHOREOGRAPHY__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipant> getParticipants()
        {
		if (participants == null) {
			participants = new EObjectContainmentEList<CParticipant>(CParticipant.class, this, ChorPackage.CHOREOGRAPHY__PARTICIPANTS);
		}
		return participants;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipantSet> getParticipantSets()
        {
		if (participantSets == null) {
			participantSets = new EObjectContainmentEList<CParticipantSet>(CParticipantSet.class, this, ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS);
		}
		return participantSets;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CMessageLink> getMessageLinks()
        {
		if (messageLinks == null) {
			messageLinks = new EObjectContainmentEList<CMessageLink>(CMessageLink.class, this, ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS);
		}
		return messageLinks;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CParticipantRef> getParticipantRefs()
        {
		if (participantRefs == null) {
			participantRefs = new EObjectContainmentEList<CParticipantRef>(CParticipantRef.class, this, ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS);
		}
		return participantRefs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<FlowActivityLink> getFlowActivityLinks()
        {
		if (flowActivityLinks == null) {
			flowActivityLinks = new EObjectContainmentEList<FlowActivityLink>(FlowActivityLink.class, this, ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS);
		}
		return flowActivityLinks;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<CGrounding> getGroundings()
        {
		if (groundings == null) {
			groundings = new EObjectContainmentEList<CGrounding>(CGrounding.class, this, ChorPackage.CHOREOGRAPHY__GROUNDINGS);
		}
		return groundings;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<ForEachIterationSpec> getForEachIterationSpecs()
        {
		if (forEachIterationSpecs == null) {
			forEachIterationSpecs = new EObjectContainmentEList<ForEachIterationSpec>(ForEachIterationSpec.class, this, ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS);
		}
		return forEachIterationSpecs;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConnectorLink> getAbstractConnectorLinks() {
		if (abstractConnectorLinks == null) {
			abstractConnectorLinks = new EObjectContainmentEList<AbstractConnectorLink>(AbstractConnectorLink.class, this, ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS);
		}
		return abstractConnectorLinks;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDataModel getGlobalDataModel() {
		return globalDataModel;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalDataModel(GlobalDataModel newGlobalDataModel, NotificationChain msgs) {
		GlobalDataModel oldGlobalDataModel = globalDataModel;
		globalDataModel = newGlobalDataModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL, oldGlobalDataModel, newGlobalDataModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalDataModel(GlobalDataModel newGlobalDataModel) {
		if (newGlobalDataModel != globalDataModel) {
			NotificationChain msgs = null;
			if (globalDataModel != null)
				msgs = ((InternalEObject)globalDataModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL, null, msgs);
			if (newGlobalDataModel != null)
				msgs = ((InternalEObject)newGlobalDataModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL, null, msgs);
			msgs = basicSetGlobalDataModel(newGlobalDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL, newGlobalDataModel, newGlobalDataModel));
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
			case ChorPackage.CHOREOGRAPHY__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS:
				return ((InternalEList<?>)getParticipantSets()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS:
				return ((InternalEList<?>)getMessageLinks()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS:
				return ((InternalEList<?>)getParticipantRefs()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS:
				return ((InternalEList<?>)getFlowActivityLinks()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__GROUNDINGS:
				return ((InternalEList<?>)getGroundings()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS:
				return ((InternalEList<?>)getForEachIterationSpecs()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS:
				return ((InternalEList<?>)getAbstractConnectorLinks()).basicRemove(otherEnd, msgs);
			case ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL:
				return basicSetGlobalDataModel(null, msgs);
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
			case ChorPackage.CHOREOGRAPHY__NAME:
				return getName();
			case ChorPackage.CHOREOGRAPHY__TARGET_NAMESPACE:
				return getTargetNamespace();
			case ChorPackage.CHOREOGRAPHY__PARTICIPANTS:
				return getParticipants();
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS:
				return getParticipantSets();
			case ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS:
				return getMessageLinks();
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS:
				return getParticipantRefs();
			case ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS:
				return getFlowActivityLinks();
			case ChorPackage.CHOREOGRAPHY__GROUNDINGS:
				return getGroundings();
			case ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS:
				return getForEachIterationSpecs();
			case ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS:
				return getAbstractConnectorLinks();
			case ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL:
				return getGlobalDataModel();
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
			case ChorPackage.CHOREOGRAPHY__NAME:
				setName((String)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends CParticipant>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS:
				getParticipantSets().clear();
				getParticipantSets().addAll((Collection<? extends CParticipantSet>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS:
				getMessageLinks().clear();
				getMessageLinks().addAll((Collection<? extends CMessageLink>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				getParticipantRefs().addAll((Collection<? extends CParticipantRef>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS:
				getFlowActivityLinks().clear();
				getFlowActivityLinks().addAll((Collection<? extends FlowActivityLink>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__GROUNDINGS:
				getGroundings().clear();
				getGroundings().addAll((Collection<? extends CGrounding>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS:
				getForEachIterationSpecs().clear();
				getForEachIterationSpecs().addAll((Collection<? extends ForEachIterationSpec>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS:
				getAbstractConnectorLinks().clear();
				getAbstractConnectorLinks().addAll((Collection<? extends AbstractConnectorLink>)newValue);
				return;
			case ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL:
				setGlobalDataModel((GlobalDataModel)newValue);
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
			case ChorPackage.CHOREOGRAPHY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChorPackage.CHOREOGRAPHY__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANTS:
				getParticipants().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS:
				getParticipantSets().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS:
				getMessageLinks().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS:
				getFlowActivityLinks().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__GROUNDINGS:
				getGroundings().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS:
				getForEachIterationSpecs().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS:
				getAbstractConnectorLinks().clear();
				return;
			case ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL:
				setGlobalDataModel((GlobalDataModel)null);
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
			case ChorPackage.CHOREOGRAPHY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChorPackage.CHOREOGRAPHY__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case ChorPackage.CHOREOGRAPHY__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_SETS:
				return participantSets != null && !participantSets.isEmpty();
			case ChorPackage.CHOREOGRAPHY__MESSAGE_LINKS:
				return messageLinks != null && !messageLinks.isEmpty();
			case ChorPackage.CHOREOGRAPHY__PARTICIPANT_REFS:
				return participantRefs != null && !participantRefs.isEmpty();
			case ChorPackage.CHOREOGRAPHY__FLOW_ACTIVITY_LINKS:
				return flowActivityLinks != null && !flowActivityLinks.isEmpty();
			case ChorPackage.CHOREOGRAPHY__GROUNDINGS:
				return groundings != null && !groundings.isEmpty();
			case ChorPackage.CHOREOGRAPHY__FOR_EACH_ITERATION_SPECS:
				return forEachIterationSpecs != null && !forEachIterationSpecs.isEmpty();
			case ChorPackage.CHOREOGRAPHY__ABSTRACT_CONNECTOR_LINKS:
				return abstractConnectorLinks != null && !abstractConnectorLinks.isEmpty();
			case ChorPackage.CHOREOGRAPHY__GLOBAL_DATA_MODEL:
				return globalDataModel != null;
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
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //ChoreographyImpl
