/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package simk;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMTypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMTypedElement()
 * @model abstract="true"
 *        annotation="kermeta ecore='true'"
 * @generated
 */
public interface SMTypedElement extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see simk.SimkPackage#getSMTypedElement_Type()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link simk.SMTypedElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SMTypedElement
