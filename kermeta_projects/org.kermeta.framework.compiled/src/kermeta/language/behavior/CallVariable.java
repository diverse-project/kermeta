/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariable.java,v 1.2 2008-08-19 13:22:59 cfaucher Exp $
 */
package kermeta.language.behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallVariable()
 * @model annotation="kermeta documentation='We call \"CallVariable\" the use of a variable in a statement.\nin <code>i := j + 1</code>, i and j are 2 CallVariables.'"
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
	 * @see #setIsAtpre(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallVariable_IsAtpre()
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Tells whether this CallVariable represents a call to @pre in a postcondition'"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

} // CallVariable
