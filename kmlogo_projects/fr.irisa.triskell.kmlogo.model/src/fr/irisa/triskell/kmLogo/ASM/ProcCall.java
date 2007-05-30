/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcCall.java,v 1.1 2007-05-30 13:23:34 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcCall#getActualArgs <em>Actual Args</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.ProcCall#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcCall()
 * @model
 * @generated
 */
public interface ProcCall extends Instruction {
	/**
	 * Returns the value of the '<em><b>Actual Args</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kmLogo.ASM.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Args</em>' containment reference list.
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcCall_ActualArgs()
	 * @model type="fr.irisa.triskell.kmLogo.ASM.Expression" containment="true"
	 * @generated
	 */
	EList getActualArgs();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(ProcDeclaration)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getProcCall_Declaration()
	 * @see fr.irisa.triskell.kmLogo.ASM.ProcDeclaration#getProcCall
	 * @model opposite="procCall" required="true"
	 * @generated
	 */
	ProcDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.ProcCall#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(ProcDeclaration value);

} // ProcCall