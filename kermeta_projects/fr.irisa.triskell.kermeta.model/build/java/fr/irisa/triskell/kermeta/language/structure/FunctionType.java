/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionType.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.FunctionType#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.FunctionType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends TypeContainer, Type {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Type)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getFunctionType_Left()
	 * @model
	 * @generated
	 */
	Type getLeft();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.FunctionType#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Type value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Type)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getFunctionType_Right()
	 * @model
	 * @generated
	 */
	Type getRight();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.FunctionType#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Type value);

} // FunctionType
