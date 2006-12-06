/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariable.java,v 1.2 2006-12-06 16:22:58 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariable()
 * @model abstract="true"
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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariable_Supertype()
	 * @model
	 * @generated
	 */
	Type getSupertype();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.TypeVariable#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(Type value);

} // TypeVariable
