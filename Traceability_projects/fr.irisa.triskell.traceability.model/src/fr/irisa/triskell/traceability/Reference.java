/**
 * <copyright>
 * </copyright>
 *
 * $Id: Reference.java,v 1.1 2007-05-04 15:58:26 dtouzet Exp $
 */
package fr.irisa.triskell.traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.traceability.Reference#getTargetTraces <em>Target Traces</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.Reference#getSourceTraces <em>Source Traces</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getReference()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This abstract class represents a reference to a concrete object\r\n \052/'"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Traces</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Trace#getSourceReferences <em>Source References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Traces</em>' reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getReference_TargetTraces()
	 * @see fr.irisa.triskell.traceability.Trace#getSourceReferences
	 * @model type="fr.irisa.triskell.traceability.Trace" opposite="sourceReferences"
	 *        annotation="kermeta documentation='/** Link to the reference target traces \052/'"
	 * @generated
	 */
	EList getTargetTraces();

	/**
	 * Returns the value of the '<em><b>Source Traces</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Trace}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Trace#getTargetReferences <em>Target References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Traces</em>' reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getReference_SourceTraces()
	 * @see fr.irisa.triskell.traceability.Trace#getTargetReferences
	 * @model type="fr.irisa.triskell.traceability.Trace" opposite="targetReferences"
	 *        annotation="kermeta documentation='/** Link to the reference source traces \052/'"
	 * @generated
	 */
	EList getSourceTraces();

	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.TraceModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TraceModel)
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getReference_TraceMdl()
	 * @see fr.irisa.triskell.traceability.TraceModel#getReferences
	 * @model opposite="references" required="true"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TraceModel getTraceMdl();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TraceModel value);

} // Reference