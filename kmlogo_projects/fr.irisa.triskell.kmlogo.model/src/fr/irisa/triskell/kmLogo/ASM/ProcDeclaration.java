/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcDeclaration.java,v 1.1 2007-05-30 13:23:34 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getArgs <em>Args</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getBlock <em>Block</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getProcCall <em>Proc Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcDeclaration()
 * @model
 * @generated
 */
public interface ProcDeclaration extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcDeclaration_Name()
	 * @model dataType="fr.irisa.triskell.kmLogo.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kmLogo.ASM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcDeclaration_Args()
	 * @model type="fr.irisa.triskell.kmLogo.ASM.Parameter" containment="true"
	 * @generated
	 */
	EList getArgs();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcDeclaration_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Proc Call</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kmLogo.ASM.ProcCall}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kmLogo.ASM.ProcCall#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc Call</em>' reference list.
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcDeclaration_ProcCall()
	 * @see fr.irisa.triskell.kmLogo.ASM.ProcCall#getDeclaration
	 * @model type="fr.irisa.triskell.kmLogo.ASM.ProcCall" opposite="declaration"
	 * @generated
	 */
	EList getProcCall();

} // ProcDeclaration