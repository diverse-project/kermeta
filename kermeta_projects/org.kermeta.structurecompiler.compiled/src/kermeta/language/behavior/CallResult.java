/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallResult.java,v 1.8 2008-11-07 08:52:22 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Result</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallResult()
 * @model annotation="kermeta documentation='This class represents a call to the special internal variable \"result\" that is used to store the return value of any operation '"
 * @generated
 */
public interface CallResult extends CallVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::CallVariable'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"result\";\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, context.printFtSuffix());\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // CallResult
