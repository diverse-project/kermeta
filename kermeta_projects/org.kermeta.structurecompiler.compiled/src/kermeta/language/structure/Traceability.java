/**
 * <copyright>
 * </copyright>
 *
 * $Id: Traceability.java,v 1.9 2008-11-27 15:49:58 cfaucher Exp $
 */
package kermeta.language.structure;

import java.lang.Object;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Traceability#getEcoreModelElement <em>Ecore Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTraceability()
 * @model
 * @generated
 */
public interface Traceability<X> extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Ecore Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Model Element</em>' reference.
	 * @see #setEcoreModelElement(Object)
	 * @see kermeta.language.structure.StructurePackage#getTraceability_EcoreModelElement()
	 * @model kind="reference"
	 * @generated
	 */
	X getEcoreModelElement();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Traceability#getEcoreModelElement <em>Ecore Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Model Element</em>' reference.
	 * @see #getEcoreModelElement()
	 * @generated
	 */
	void setEcoreModelElement(X value);

} // Traceability
