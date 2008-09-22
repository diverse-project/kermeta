/**
 * <copyright>
 * </copyright>
 *
 * $Id: TraceModel.java,v 1.3 2008-09-22 14:48:58 cfaucher Exp $
 */
package traceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.TraceModel#getFiles <em>Files</em>}</li>
 *   <li>{@link traceability.TraceModel#getReferences <em>References</em>}</li>
 *   <li>{@link traceability.TraceModel#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.TraceModel#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getTraceModel()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace model.\r\n * This is a set of traces, references and messages.\r\n \052/'"
 * @generated
 */
public interface TraceModel extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getTraceModel_Files()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link traceability.Reference#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getTraceModel_References()
	 * @see traceability.Reference#getTraceMdl
	 * @model opposite="traceMdl" containment="true" resolveProxies="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of references to the traced objects of the trace model \052/'"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link traceability.Trace#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getTraceModel_Traces()
	 * @see traceability.Trace#getTraceMdl
	 * @model opposite="traceMdl" containment="true" resolveProxies="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of traces contained by the trace model \052/'"
	 * @generated
	 */
	EList<Trace> getTraces();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.Message}.
	 * It is bidirectional and its opposite is '{@link traceability.Message#getTraceMdl <em>Trace Mdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getTraceModel_Messages()
	 * @see traceability.Message#getTraceMdl
	 * @model opposite="traceMdl" containment="true" resolveProxies="true" ordered="false"
	 *        annotation="kermeta documentation='/** Set of messages contained by the trace model \052/'"
	 * @generated
	 */
	EList<Message> getMessages();

} // TraceModel
