/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterizedType.java,v 1.5 2008-10-16 13:17:59 cfaucher Exp $
 */
package kermeta.language.structure;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ParameterizedType#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.ParameterizedType#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getParameterizedType()
 * @model annotation="kermeta documentation='Abstraction for Parameterized types, namely, Class and ModelType'"
 * @generated
 */
public interface ParameterizedType extends Type {
	/**
	 * Returns the value of the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Param Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Param Binding</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getParameterizedType_TypeParamBinding()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Bindings between type variables and provided types '"
	 * @generated
	 */
	EList<TypeVariableBinding> getTypeParamBinding();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(GenericTypeDefinition)
	 * @see kermeta.language.structure.StructurePackage#getParameterizedType_TypeDefinition()
	 * @model required="true"
	 *        annotation="kermeta documentation='Definition of the Type'"
	 * @generated
	 */
	GenericTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(GenericTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Virtual Type Binding</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Type Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Type Binding</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getParameterizedType_VirtualTypeBinding()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<TypeVariableBinding> getVirtualTypeBinding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_298 = false;\n\tidIfCond_298 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getTypeDefinition().getEMFInstanceClassName(), \"\");\n\n\tif( idIfCond_298 ) {\n\n\tresult = this.getTypeDefinition().getEMFInstanceClassName();\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(this.getTypeQName(), \"::\", \".\");\n}\n\n\n\tjava.lang.String str_tpb = \"\";\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_299 = false;\n\twhile( !idLoopCond_299 ) {\n\tidLoopCond_299 = it_ft83.isOff();\n\tif ( idLoopCond_299 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp83 = it_ft83.next();\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation());\n\n\tif( idIfCond_300 ) {\n\n\tjava.lang.Boolean idIfCond_301 = false;\n\tidIfCond_301 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, 1);\n\n\tif( idIfCond_301 ) {\n\n\tstr_tpb = kermeta.standard.helper.StringWrapper.plus(str_tpb, \", \");\n}\n\n\n\tjava.lang.Boolean idIfCond_302 = false;\n\tidIfCond_302 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(tpb_lbdExp83.getType()));\n\n\tif( idIfCond_302 ) {\n\n\tstr_tpb = kermeta.standard.helper.StringWrapper.plus(str_tpb, tpb_lbdExp83.getType().createBehaviorJava(context));\n}\n else {\n}\n\n}\n else {\n\n\tkermeta.language.structure.Type type_from_map = context.getFtMapTypeStack().peek().getValue(tpb_lbdExp83.getType());\n\n\tjava.lang.Boolean idIfCond_303 = false;\n\tidIfCond_303 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(type_from_map));\n\n\tif( idIfCond_303 ) {\n\n\tcontext.setFtSuffixActivation(false);\n\n\tstr_tpb = kermeta.standard.helper.StringWrapper.plus(str_tpb, type_from_map.createBehaviorJava(context));\n\n\tcontext.setFtSuffixActivation(true);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_304 = false;\n\tidIfCond_304 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(context.getFtProductTypeStack().peek().getTypeByIndex(i), this);\n\n\tif( idIfCond_304 ) {\n\n\tresult = \"\";\n}\n\n\n\tcontext.setFtSuffixActivation(false);\n\n\tstr_tpb = kermeta.standard.helper.StringWrapper.plus(str_tpb, context.getFtProductTypeStack().peek().getTypeByIndex(i).createBehaviorJava(context));\n\n\tcontext.setFtSuffixActivation(true);\n}\n\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tjava.lang.Boolean idIfCond_305 = false;\n\tidIfCond_305 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(str_tpb, \"\");\n\n\tif( idIfCond_305 ) {\n\n\tjava.lang.Boolean idIfCond_306 = false;\n\tidIfCond_306 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result, \"\");\n\n\tif( idIfCond_306 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"<\"), str_tpb), \">\");\n}\n else {\n\n\tresult = str_tpb;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_307 = false;\n\tidIfCond_307 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_307 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getClassDefinitionAsTyped();

} // ParameterizedType
