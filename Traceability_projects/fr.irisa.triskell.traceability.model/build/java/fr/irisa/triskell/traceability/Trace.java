/**
 * <copyright>
 * </copyright>
 *
 * $Id: Trace.java,v 1.1 2007-05-03 07:40:05 dvojtise Exp $
 */
package fr.irisa.triskell.traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.traceability.Trace#getSourceReferences <em>Source References</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.Trace#getTargetReferences <em>Target References</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.Trace#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.irisa.triskell.traceability.Trace#getTraceMdl <em>Trace Mdl</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTrace()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a trace element\r\n \052/'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Source References</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Reference#getTargetTraces <em>Target Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source References</em>' reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTrace_SourceReferences()
	 * @see fr.irisa.triskell.traceability.Reference#getTargetTraces
	 * @model type="fr.irisa.triskell.traceability.Reference" opposite="targetTraces"
	 *        annotation="kermeta documentation='/** Link to the references to the trace incoming elements \052/'"
	 * @generated
	 */
	EList getSourceReferences();

	/**
	 * Returns the value of the '<em><b>Target References</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Reference}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Reference#getSourceTraces <em>Source Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target References</em>' reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTrace_TargetReferences()
	 * @see fr.irisa.triskell.traceability.Reference#getSourceTraces
	 * @model type="fr.irisa.triskell.traceability.Reference" opposite="sourceTraces"
	 *        annotation="kermeta documentation='/** Link to the references to the trace outgoing elements \052/'"
	 * @generated
	 */
	EList getTargetReferences();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.traceability.Message}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.Message#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference list.
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTrace_Description()
	 * @see fr.irisa.triskell.traceability.Message#getTraces
	 * @model type="fr.irisa.triskell.traceability.Message" opposite="traces"
	 *        annotation="kermeta documentation='/** Link to the messages describing the trace \052/'"
	 * @generated
	 */
	EList getDescription();

	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.traceability.TraceModel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TraceModel)
	 * @see fr.irisa.triskell.traceability.TraceabilityPackage#getTrace_TraceMdl()
	 * @see fr.irisa.triskell.traceability.TraceModel#getTraces
	 * @model opposite="traces" required="true"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TraceModel getTraceMdl();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.traceability.Trace#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TraceModel value);

} // Trace