/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Traceability.java,v 1.11 2009-02-10 17:51:52 cfaucher Exp $
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
