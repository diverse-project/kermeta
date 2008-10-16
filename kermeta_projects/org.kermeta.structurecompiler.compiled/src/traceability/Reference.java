/**
 * <copyright>
 * </copyright>
 *
 * $Id: Reference.java,v 1.5 2008-10-16 13:18:12 cfaucher Exp $
 */
package traceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.Reference#getTargetTraces <em>Target Traces</em>}</li>
 *   <li>{@link traceability.Reference#getTraceMdl <em>Trace Mdl</em>}</li>
 *   <li>{@link traceability.Reference#getSourceTraces <em>Source Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getReference()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This abstract class represents a reference to a concrete object\r\n \052/'"
 * @generated
 */
public interface Reference extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Target Traces</b></em>' reference list.
	 * The list contents are of type {@link traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link traceability.Trace#getSourceReferences <em>Source References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Traces</em>' reference list.
	 * @see traceability.TraceabilityPackage#getReference_TargetTraces()
	 * @see traceability.Trace#getSourceReferences
	 * @model opposite="sourceReferences"
	 *        annotation="kermeta documentation='/** Link to the reference target traces \052/'"
	 * @generated
	 */
	EList<Trace> getTargetTraces();

	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link traceability.TraceModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TraceModel)
	 * @see traceability.TraceabilityPackage#getReference_TraceMdl()
	 * @see traceability.TraceModel#getReferences
	 * @model opposite="references" required="true" transient="false"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TraceModel getTraceMdl();

	/**
	 * Sets the value of the '{@link traceability.Reference#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TraceModel value);

	/**
	 * Returns the value of the '<em><b>Source Traces</b></em>' reference list.
	 * The list contents are of type {@link traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link traceability.Trace#getTargetReferences <em>Target References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Traces</em>' reference list.
	 * @see traceability.TraceabilityPackage#getReference_SourceTraces()
	 * @see traceability.Trace#getTargetReferences
	 * @model opposite="targetReferences"
	 *        annotation="kermeta documentation='/** Link to the reference source traces \052/'"
	 * @generated
	 */
	EList<Trace> getSourceTraces();

} // Reference
