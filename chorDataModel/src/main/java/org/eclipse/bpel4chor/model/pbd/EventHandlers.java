/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpel4chor.model.pbd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handlers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnEvent <em>On Event</em>}</li>
 *   <li>{@link org.eclipse.bpel4chor.model.pbd.EventHandlers#getOnAlarm <em>On Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getEventHandlers()
 * @model
 * @generated
 */
public interface EventHandlers extends ExtensibleElements {
	/**
	 * Returns the value of the '<em><b>On Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.OnEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Event</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getEventHandlers_OnEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnEvent> getOnEvent();

	/**
	 * Returns the value of the '<em><b>On Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel4chor.model.pbd.OnAlarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Alarm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Alarm</em>' containment reference list.
	 * @see org.eclipse.bpel4chor.model.pbd.PbdPackage#getEventHandlers_OnAlarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnAlarm> getOnAlarm();

} // EventHandlers
