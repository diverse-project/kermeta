/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceModel.java,v 1.2 2007-07-31 12:34:31 dtouzet Exp $
 */
package fr.irisa.triskell.traceability;

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
 *   <li>{@link fr.irisa.triskell.traceability.TraceModel#getTraces <em>Traces</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.TraceModel#getReferences <em>References</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.TraceModel#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTraceModel()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace model.\r\n * This is a set of traces, references and messages.\r\n \052/'"
 * @generated
 */
public interface TraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Trace#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTraceModel_Traces()
	 * @see fr.irisa.triskell.traceability.Trace#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of traces contained by the trace model \052/'"
	 * @generated
	 */
	EList<Trace> getTraces();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTraceModel_References()
	 * @see fr.irisa.triskell.traceability.Reference#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of references to the traced objects of the trace model \052/'"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Message}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Message#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTraceModel_Messages()
	 * @see fr.irisa.triskell.traceability.Message#getTraceMdl
	 * @model opposite="traceMdl" containment="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of messages contained by the trace model \052/'"
	 * @generated
	 */
	EList<Message> getMessages();

} // TraceModel
