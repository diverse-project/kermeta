/**
 * <copyright>
 * </copyright>
 *
 * $Id: Right.java,v 1.1 2007-05-30 13:23:34 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.Right#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getRight()
 * @model
 * @generated
 */
public interface Right extends Primitive {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Expression)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getRight_Angle()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAngle();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.Right#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Expression value);

} // Right