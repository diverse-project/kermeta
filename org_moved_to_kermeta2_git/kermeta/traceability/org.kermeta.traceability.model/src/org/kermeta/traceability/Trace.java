/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.Trace#getSourceElem <em>Source Elem</em>}</li>
 *   <li>{@link org.kermeta.traceability.Trace#getTargetElem <em>Target Elem</em>}</li>
 *   <li>{@link org.kermeta.traceability.Trace#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getTrace()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace element\r\n \052/'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Elem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Traceable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elem</em>' container reference.
	 * @see #setSourceElem(Traceable)
	 * @see org.kermeta.traceability.TraceabilityPackage#getTrace_SourceElem()
	 * @see org.kermeta.traceability.Traceable#getTarget
	 * @model opposite="target" transient="false"
	 * @generated
	 */
	Traceable getSourceElem();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.Trace#getSourceElem <em>Source Elem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Elem</em>' container reference.
	 * @see #getSourceElem()
	 * @generated
	 */
	void setSourceElem(Traceable value);

	/**
	 * Returns the value of the '<em><b>Target Elem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Traceable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elem</em>' reference.
	 * @see #setTargetElem(Traceable)
	 * @see org.kermeta.traceability.TraceabilityPackage#getTrace_TargetElem()
	 * @see org.kermeta.traceability.Traceable#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Traceable getTargetElem();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.Trace#getTargetElem <em>Target Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Elem</em>' reference.
	 * @see #getTargetElem()
	 * @generated
	 */
	void setTargetElem(Traceable value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EObject)
	 * @see org.kermeta.traceability.TraceabilityPackage#getTrace_Context()
	 * @model
	 * @generated
	 */
	EObject getContext();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.Trace#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EObject value);

} // Trace
