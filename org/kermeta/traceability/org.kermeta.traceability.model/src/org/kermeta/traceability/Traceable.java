/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.Traceable#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.traceability.Traceable#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getTraceable()
 * @model
 * @generated
 */
public interface Traceable extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Trace#getSourceElem <em>Source Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTraceable_Target()
	 * @see org.kermeta.traceability.Trace#getSourceElem
	 * @model opposite="sourceElem" containment="true"
	 * @generated
	 */
	EList<Trace> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Trace#getTargetElem <em>Target Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTraceable_Source()
	 * @see org.kermeta.traceability.Trace#getTargetElem
	 * @model opposite="targetElem"
	 * @generated
	 */
	EList<Trace> getSource();

} // Traceable
