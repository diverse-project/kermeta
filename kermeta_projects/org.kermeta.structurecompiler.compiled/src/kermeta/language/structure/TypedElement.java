/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TypedElement.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypedElement()
 * @model abstract="true"
 *        annotation="kermeta documentation='Abstraction of the notion of typed element : each element \nthat is typed inherits this class.'"
 * @generated
 */
public interface TypedElement extends TypeContainer, NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see kermeta.language.structure.StructurePackage#getTypedElement_Type()
	 * @model annotation="kermeta documentation='Type of the model element'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypedElement
