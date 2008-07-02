/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariableBinding.java,v 1.1 2008-07-02 09:43:44 ftanguy Exp $
 */
package kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypeVariableBinding#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.structure.TypeVariableBinding#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypeVariableBinding()
 * @model annotation="kermeta documentation='Definition of a binding between a TypeVariable and a Type'"
 * @generated
 */
public interface TypeVariableBinding extends TypeContainer {
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
	 * @see kermeta.language.structure.StructurePackage#getTypeVariableBinding_Type()
	 * @model required="true"
	 *        annotation="kermeta documentation='Assigned Type'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.TypeVariableBinding#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(TypeVariable)
	 * @see kermeta.language.structure.StructurePackage#getTypeVariableBinding_Variable()
	 * @model required="true"
	 *        annotation="kermeta documentation='TypeVariable'"
	 * @generated
	 */
	TypeVariable getVariable();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.TypeVariableBinding#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TypeVariable value);

} // TypeVariableBinding
