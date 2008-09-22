/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallValue.java,v 1.3 2008-09-22 14:46:28 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallValue()
 * @model annotation="kermeta documentation='CallValue refers to the use of the <code>value</code> reserved keyword. This keyword is\nonly used in the body of the <code>setter</code> part of derived properties.'"
 * @generated
 */
public interface CallValue extends CallExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::CallExpression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"value\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // CallValue
