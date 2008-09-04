/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelfExpression.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.behavior.BehaviorPackage#getSelfExpression()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='Refers to <code>self</code> use'"
 * @generated
 */
public interface SelfExpression extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"this\";\n\n\tjava.lang.Boolean idIfCond_446 = false;\n\tidIfCond_446 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode());\n\n\tif( idIfCond_446 ) {\n\n\tresult = \"self\";\n}\n\n\n\tjava.lang.Boolean idIfCond_447 = false;\n\tidIfCond_447 = context.getFtSuffixActivation();\n\n\tif( idIfCond_447 ) {\n\n\tresult = context.getFtContextualSelf();\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // SelfExpression
