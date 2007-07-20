/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeLiteral.java,v 1.5 2007-07-20 15:09:00 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getTypeLiteral()
 * @model
 * @generated
 */
public interface TypeLiteral extends Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Typeref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeref</em>' containment reference.
	 * @see #setTyperef(TypeReference)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getTypeLiteral_Typeref()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	TypeReference getTyperef();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeref</em>' containment reference.
	 * @see #getTyperef()
	 * @generated
	 */
	void setTyperef(TypeReference value);

} // TypeLiteral