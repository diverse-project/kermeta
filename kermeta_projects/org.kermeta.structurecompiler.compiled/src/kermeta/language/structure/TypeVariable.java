/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariable.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypeVariable()
 * @model abstract="true"
 *        annotation="kermeta documentation='Definition of a type variable for generic types :  \nin class definition <pre>class AClass<X,Y> {}</pre>, X and Y are type variables.'"
 * @generated
 */
public interface TypeVariable extends TypeContainer, Type, NamedElement {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(Type)
	 * @see kermeta.language.structure.StructurePackage#getTypeVariable_Supertype()
	 * @model annotation="kermeta documentation='Reference to the supertype, if any'"
	 * @generated
	 */
	Type getSupertype();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(Type value);

} // TypeVariable
