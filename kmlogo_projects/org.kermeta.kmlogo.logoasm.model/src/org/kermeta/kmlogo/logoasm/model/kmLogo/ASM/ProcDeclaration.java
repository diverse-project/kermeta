/*$Id : ProcDeclaration.java v 1.3 May 8, 2010 9:38:30 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model
* File : 	ProcDeclaration.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.ASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getArgs <em>Args</em>}</li>
 *   <li>{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getProcCall <em>Proc Call</em>}</li>
 *   <li>{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage#getProcDeclaration()
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
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage#getProcDeclaration_Name()
	 * @model dataType="org.kermeta.kmlogo.logoasm.model.kmLogo.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage#getProcDeclaration_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getArgs();

	/**
	 * Returns the value of the '<em><b>Proc Call</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc Call</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc Call</em>' reference list.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage#getProcDeclaration_ProcCall()
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall#getDeclaration
	 * @model opposite="declaration"
	 * @generated
	 */
	EList<ProcCall> getProcCall();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage#getProcDeclaration_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // ProcDeclaration
