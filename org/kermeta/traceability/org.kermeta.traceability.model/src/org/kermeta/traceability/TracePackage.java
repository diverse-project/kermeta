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
 * A representation of the model object '<em><b>Trace Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.TracePackage#getReferences <em>References</em>}</li>
 *   <li>{@link org.kermeta.traceability.TracePackage#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link org.kermeta.traceability.TracePackage#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getTracePackage()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace model.\r\n * This is a set of traces, references and messages.\r\n \052/'"
 * @generated
 */
public interface TracePackage extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTracePackage_References()
	 * @see org.kermeta.traceability.Reference#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of references to the traced objects of the trace model \052/'"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Subpackage</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.traceability.TracePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTracePackage_Subpackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TracePackage> getSubpackage();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTracePackage_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void convertReferences();

} // TracePackage
