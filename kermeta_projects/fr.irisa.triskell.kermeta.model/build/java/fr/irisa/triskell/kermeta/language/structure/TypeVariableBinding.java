/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeVariableBinding.java,v 1.5 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariableBinding()
 * @model
 * @generated
 */
public interface TypeVariableBinding extends TypeContainer, fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariableBinding_Variable()
	 * @model required="true"
	 *        annotation="GenModel documentation='/**\n * TypeVariable\n \052/'"
	 * @generated
	 */
	TypeVariable getVariable();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TypeVariable value);

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeVariableBinding_Type()
	 * @model required="true"
	 *        annotation="GenModel documentation='/**\n * Assigned Type\n \052/'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypeVariableBinding