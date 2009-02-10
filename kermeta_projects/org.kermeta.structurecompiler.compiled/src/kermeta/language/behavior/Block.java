/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Block.java,v 1.11 2009-02-10 17:51:43 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tkermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getStringBuffer()));\n\n\tjava.lang.Boolean idIfCond_280 = false;\n\tidIfCond_280 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"))));\n\n\tif( idIfCond_280 ) {\n\n\tjavaCode.append(\"{\\n\");\n}\n\n\n\tjava.lang.Boolean idIfCond_281 = false;\n\tidIfCond_281 = this.containsRescue();\n\n\tif( idIfCond_281 ) {\n\n\tjavaCode.append(\"try {\");\n}\n\n\n\tjava.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).size();\n\n\tjava.lang.Integer i_stm = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft32 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).iterator();\n\tjava.lang.Boolean idLoopCond_282 = false;\n\twhile( !idLoopCond_282 ) {\n\tidLoopCond_282 = it_ft32.isOff();\n\tif ( idLoopCond_282 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression stm_lbdExp32 = it_ft32.next();\n\n\tjava.lang.Boolean idIfCond_283 = false;\n\tidIfCond_283 = kermeta.standard.helper.IntegerWrapper.equals(i_stm, kermeta.standard.helper.IntegerWrapper.minus(nbrStm, 1));\n\n\tif( idIfCond_283 ) {\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm_lbdExp32, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setIsLastExpression(true);\n}\n\n\n\tjavaCode = stm_lbdExp32.createExpression(context, javaCode);\n\n\tjavaCode.append(\"\\n\");\n\n\ti_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_284 = false;\n\tidIfCond_284 = this.containsRescue();\n\n\tif( idIfCond_284 ) {\n\n\tcontext.pushKRErrorStack();\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"} catch( \", context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \" \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \" ) {\\n\"));\n\n\tjava.lang.String caught_str = kermeta.standard.helper.StringWrapper.plus(\"caught_\", context.getKRErrorStack().peek());\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"boolean \", caught_str), \" = false;\\n\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft33 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).iterator();\n\tjava.lang.Boolean idLoopCond_285 = false;\n\twhile( !idLoopCond_285 ) {\n\tidLoopCond_285 = it_ft33.isOff();\n\tif ( idLoopCond_285 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Rescue e_lbdExp33 = it_ft33.next();\n\n\tjavaCode.append(e_lbdExp33.createBehaviorJava(context));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjavaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\nif( !\", caught_str), \" ) { throw \"), context.getVARIABLE_EXCEPTION_SWITCHER()), \"_\"), context.getKRErrorStack().peek()), \"; }\\n\"));\n\n\tjavaCode.append(\"\\n}\\n\");\n\n\tcontext.getKRErrorStack().pop();\n}\n\n\n\tjava.lang.Boolean idIfCond_286 = false;\n\tidIfCond_286 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"))));\n\n\tif( idIfCond_286 ) {\n\n\tjavaCode.append(\"}\");\n}\n\n\n\tresult = javaCode.toString();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_287 = false;\n\tidIfCond_287 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).size(), 0));\n\n\tif( idIfCond_287 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean containsRescue();

} // Block
