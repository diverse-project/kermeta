/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringLiteral.java,v 1.5 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getStringLiteral()
 * @model annotation="GenModel documentation='/**\n * This expression is a literal representing a String value, typically : \"my string\"\n \052/'"
 * @generated
 */
public interface StringLiteral extends Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getStringLiteral_Value()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 *        annotation="GenModel documentation='/**\n * The concrete value represented by this literal\n \052/'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringLiteral