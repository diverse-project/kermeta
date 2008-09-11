/**
 * <copyright>
 * </copyright>
 *
 * $Id: Trace.java,v 1.2 2008-09-11 12:34:42 cfaucher Exp $
 */
package traceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.Trace#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.Trace#getSourceReferences <em>Source References</em>}</li>
 *   <li>{@link traceability.Trace#getDescription <em>Description</em>}</li>
 *   <li>{@link traceability.Trace#getTargetReferences <em>Target References</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getTrace()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace element\r\n \052/'"
 * @generated
 */
public interface Trace extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link traceability.TraceModel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TraceModel)
	 * @see traceability.TraceabilityPackage#getTrace_TraceMdl()
	 * @see traceability.TraceModel#getTraces
	 * @model opposite="traces" required="true" transient="false"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TraceModel getTraceMdl();

	/**
	 * Sets the value of the '{@link traceability.Trace#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TraceModel value);

	/**
	 * Returns the value of the '<em><b>Source References</b></em>' reference list.
	 * The list contents are of type {@link traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link traceability.Reference#getTargetTraces <em>Target Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source References</em>' reference list.
	 * @see traceability.TraceabilityPackage#getTrace_SourceReferences()
	 * @see traceability.Reference#getTargetTraces
	 * @model opposite="targetTraces"
	 *        annotation="kermeta documentation='/** Link to the references to the trace incoming elements \052/'"
	 * @generated
	 */
	EList<Reference> getSourceReferences();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference list.
	 * The list contents are of type {@link traceability.Message}.
	 * It is bidirectional and its opposite is '{@link traceability.Message#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference list.
	 * @see traceability.TraceabilityPackage#getTrace_Description()
	 * @see traceability.Message#getTraces
	 * @model opposite="traces"
	 *        annotation="kermeta documentation='/** Link to the messages describing the trace \052/'"
	 * @generated
	 */
	EList<Message> getDescription();

	/**
	 * Returns the value of the '<em><b>Target References</b></em>' reference list.
	 * The list contents are of type {@link traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link traceability.Reference#getSourceTraces <em>Source Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target References</em>' reference list.
	 * @see traceability.TraceabilityPackage#getTrace_TargetReferences()
	 * @see traceability.Reference#getSourceTraces
	 * @model opposite="sourceTraces"
	 *        annotation="kermeta documentation='/** Link to the references to the trace outgoing elements \052/'"
	 * @generated
	 */
	EList<Reference> getTargetReferences();

} // Trace
