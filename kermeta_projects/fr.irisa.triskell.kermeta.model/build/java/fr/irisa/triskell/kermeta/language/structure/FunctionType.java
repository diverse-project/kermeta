/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctionType.java,v 1.5 2008-02-14 07:13:02 uid21732 Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @model annotation="GenModel documentation='/**\n * Parameters of the function (a ProductType for multiple parameters)\n \052/'"
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
	 * @model annotation="GenModel documentation='/**\n * Result type of the function\n \052/'"
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