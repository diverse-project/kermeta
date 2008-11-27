/**
 * <copyright>
 * </copyright>
 *
 * $Id: VoidLiteral.java,v 1.9 2008-11-27 15:49:47 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getVoidLiteral()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='This class is used to represent the special expression void'"
 * @generated
 */
public interface VoidLiteral extends Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Literal'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"null\";\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // VoidLiteral
