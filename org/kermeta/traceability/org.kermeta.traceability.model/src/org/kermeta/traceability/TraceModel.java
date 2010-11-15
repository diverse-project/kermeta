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
 * A representation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.TraceModel#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.kermeta.traceability.TraceModel#getReferences <em>References</em>}</li>
 *   <li>{@link org.kermeta.traceability.TraceModel#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getTraceModel()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace model.\r\n * This is a set of traces, references and messages.\r\n \052/'"
 * @generated
 */
public interface TraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Trace#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTraceModel_Traces()
	 * @see org.kermeta.traceability.Trace#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of traces contained by the trace model \052/'"
	 * @generated
	 */
	EList<Trace> getTraces();

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
	 * @see org.kermeta.traceability.TraceabilityPackage#getTraceModel_References()
	 * @see org.kermeta.traceability.Reference#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of references to the traced objects of the trace model \052/'"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.traceability.Message}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.Message#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.kermeta.traceability.TraceabilityPackage#getTraceModel_Messages()
	 * @see org.kermeta.traceability.Message#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of messages contained by the trace model \052/'"
	 * @generated
	 */
	EList<Message> getMessages();

} // TraceModel
