/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeLiteral.java,v 1.10 2009-01-21 09:15:49 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getTypeLiteral()
 * @model annotation="kermeta documentation='This expression is a literal representing a Type.\nfor example, in \n   Integer.new\nInteger is a type literal representing the type kermeta::standard::Integer'"
 * @generated
 */
public interface TypeLiteral extends Literal {
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
	 * @see kermeta.language.behavior.BehaviorPackage#getTypeLiteral_Typeref()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='The type refered by this literal'"
	 * @generated
	 */
	TypeReference getTyperef();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.TypeLiteral#getTyperef <em>Typeref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeref</em>' containment reference.
	 * @see #getTyperef()
	 * @generated
	 */
	void setTyperef(TypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Literal'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = this.getTyperef().createBehaviorJava(context);\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // TypeLiteral
