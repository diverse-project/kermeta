/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariable.java,v 1.3 2007-06-27 15:31:10 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.CallVariable#isIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallVariable()
 * @model
 * @generated
 */
public interface CallVariable extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atpre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(boolean)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getCallVariable_IsAtpre()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.Boolean"
	 * @generated
	 */
	boolean isIsAtpre();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.CallVariable#isIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #isIsAtpre()
	 * @generated
	 */
	void setIsAtpre(boolean value);

} // CallVariable