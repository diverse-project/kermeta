/**
 * <copyright>
 * </copyright>
 *
 * $Id: Block.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Block#getStatement <em>Statement</em>}</li>
 *   <li>{@link kermeta.language.behavior.Block#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getBlock()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='Block is the model-element representation for the <code>do...end</code> block.'"
 * @generated
 */
public interface Block extends Expression {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getBlock_Statement()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='List of statements composing the block'"
	 * @generated
	 */
	EList<Expression> getStatement();

	/**
	 * Returns the value of the '<em><b>Rescue Block</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.behavior.Rescue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rescue Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescue Block</em>' containment reference list.
	 * @see kermeta.language.behavior.BehaviorPackage#getBlock_RescueBlock()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='List of rescues defined for the block'"
	 * @generated
	 */
	EList<Rescue> getRescueBlock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.StringBuffer\"));\n\n\tjava.lang.Boolean idIfCond_282 = false;\n\tidIfCond_282 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"))));\n\n\tif( idIfCond_282 ) {\n\n\tjavaCode.append(\"{\\n\");\n}\n\n\n\tjava.lang.Boolean idIfCond_283 = false;\n\tidIfCond_283 = this.containsRescue();\n\n\tif( idIfCond_283 ) {\n\n\tjavaCode.append(\"try {\");\n}\n\n\n\tjava.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).size();\n\n\tjava.lang.Integer i_stm = 0;\n\n\t//Beginning of the Inlining of the function type: eachOwnedElement\n\n\t\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).iterator();\n\tjava.lang.Boolean idLoopCond_284 = false;\n\twhile( !idLoopCond_284 ) {\n\tidLoopCond_284 = it_ft82.isOff();\n\tif ( idLoopCond_284 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.Expression s = it_ft82.next();\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.Expression stm = s_ft82;\n\n\tjava.lang.String str_statement = kermeta.standard.helper.StringWrapper.replace(kermeta.standard.helper.StringWrapper.replace(stm.createBehaviorJava(context), \" == null\", \" == null\"), \";\", \";\");\n\n\tkermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());\n\n\tjava.lang.Boolean idIfCond_285 = false;\n\tidIfCond_285 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);\n\n\tif( idIfCond_285 ) {\n\n\tjava.lang.String s1 = str_statement_splitted.one();\n\n\tjava.lang.String s2 = str_statement_splitted.last();\n\n\tjava.lang.Boolean idIfCond_286 = false;\n\tidIfCond_286 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());\n\n\tif( idIfCond_286 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);\n}\n\n}\n\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), \"//\"), \"//\");\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getkermeta.standard.helper.StringWrapper.plus((), \"result\"), \"result\");\n\n\tjavaCode.append(context.getBeforeLambdaExpressionResult());\n\n\tcontext.setBeforeLambdaExpressionResult(\"\");\n\n\tjavaCode.append(\"\\n\\t\");\n\n\tjava.lang.Boolean idIfCond_287 = false;\n\tidIfCond_287 = kermeta.standard.helper.IntegerWrapper.equals(i_stm, kermeta.standard.helper.IntegerWrapper.minus(nbrStm, 1));\n\n\tif( idIfCond_287 ) {\n\n\tjava.lang.Boolean idIfCond_288 = false;\n\tidIfCond_288 = kermeta.standard.helper.IntegerWrapper.isGreater(context.getLastStatementStack().size(), 0);\n\n\tif( idIfCond_288 ) {\n\n\tjavaCode.append(context.getLastStatementStack().pop());\n}\n\n\n\tjava.lang.Boolean idIfCond_289 = false;\n\tidIfCond_289 = stm.mustBeAssigned();\n\n\tif( idIfCond_289 ) {\n\n\tjava.lang.Boolean idIfCond_290 = false;\n\tidIfCond_290 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_290 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_291 = false;\n\tidIfCond_291 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().getTypeName());\n\n\tif( idIfCond_291 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_292 = false;\n\tidIfCond_292 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\")), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_292 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_293 = false;\n\tidIfCond_293 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_293 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_294 = false;\n\tidIfCond_294 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_294 ) {\n\n\tjava.lang.Boolean idIfCond_295 = false;\n\tidIfCond_295 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_295 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_296 = false;\n\tidIfCond_296 = stm.mustBeAssigned();\n\n\tif( idIfCond_296 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n\n}\n\n\n\tjavaCode.append(str_statement);\n\n\tjavaCode.append(\"\\n\");\n\n\ti_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm, 1);\n//End of the Inlining of the lambda expression: func\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n//End of the Inlining of the function type: eachOwnedElement\n\n\n\tjava.lang.Boolean idIfCond_297 = false;\n\tidIfCond_297 = this.containsRescue();\n\n\tif( idIfCond_297 ) {\n\n\tcontext.pushKRErrorStack();\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"} catch( \", context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \" \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \" ) {\\n\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).iterator();\n\tjava.lang.Boolean idLoopCond_298 = false;\n\twhile( !idLoopCond_298 ) {\n\tidLoopCond_298 = it_ft83.isOff();\n\tif ( idLoopCond_298 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.Rescue e = it_ft83.next();\n\n\tjavaCode.append(e.createBehaviorJava(context));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tjavaCode.append(\"\\n}\\n\");\n\n\tcontext.getKRErrorStack().pop();\n}\n else {\n}\n\n\n\tjava.lang.Boolean idIfCond_299 = false;\n\tidIfCond_299 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"))));\n\n\tif( idIfCond_299 ) {\n\n\tjavaCode.append(\"}\");\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).size(), 0));\n\n\tif( idIfCond_300 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsRescue();

} // Block
