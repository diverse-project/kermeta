/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getReference()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This abstract class represents a reference to a concrete object\r\n \052/'"
 * @generated
 */
public interface Reference extends Traceable {
	/**
	 * Returns the value of the '<em><b>Trace Mdl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.traceability.TracePackage#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Mdl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Mdl</em>' container reference.
	 * @see #setTraceMdl(TracePackage)
	 * @see org.kermeta.traceability.TraceabilityPackage#getReference_TraceMdl()
	 * @see org.kermeta.traceability.TracePackage#getReferences
	 * @model opposite="references" required="true" transient="false"
	 *        annotation="kermeta documentation='/** Link to the containing trace model \052/'"
	 * @generated
	 */
	TracePackage getTraceMdl();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.Reference#getTraceMdl <em>Trace Mdl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Mdl</em>' container reference.
	 * @see #getTraceMdl()
	 * @generated
	 */
	void setTraceMdl(TracePackage value);

} // Reference
