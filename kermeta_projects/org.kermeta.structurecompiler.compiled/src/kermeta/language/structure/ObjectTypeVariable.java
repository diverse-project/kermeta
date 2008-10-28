/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariable.java,v 1.7 2008-10-28 13:18:19 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.ETypeParameter;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.structure.StructurePackage#getObjectTypeVariable()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='To be written'"
 * @generated
 */
public interface ObjectTypeVariable extends TypeVariable,
		Traceability<ETypeParameter> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_292 = false;\n\tidIfCond_292 = context.getFtSuffixActivation();\n\n\tif( idIfCond_292 ) {\n\n\tkermeta.language.structure.Type type_from_map = context.getFtMapTypeStack().peek().getValue(this);\n\n\tjava.lang.Boolean idIfCond_293 = false;\n\tidIfCond_293 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(type_from_map));\n\n\tif( idIfCond_293 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"Please contact the Kermeta Development team, if you are in this case [ObjectTypeVariable::createBehaviorJava - not type_from_map.isVoid()] \", org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\tcontext.setFtSuffixActivation(false);\n\n\tresult = type_from_map.createBehaviorJava(context);\n\n\tcontext.setFtSuffixActivation(true);\n}\n else {\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.structure.Object obj = null;\n//BIft:detect\n\nkermeta.language.structure.TypeVariable result_ft111 = null;\n\n\tkermeta.language.structure.TypeVariable elem_ft111 = null;\n\n\tresult_ft111 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft111 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_294 = false;\n\twhile( !idLoopCond_294 ) {\n\tidLoopCond_294 = kermeta.standard.helper.BooleanWrapper.or(it_ft111.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft111, null));\n\tif ( idLoopCond_294 ) {\n\t} else {\n\n\telem_ft111 = it_ft111.next();\n\n\tjava.lang.Boolean idIfCond_295 = false;\n//BIle:detector\nkermeta.language.structure.TypeVariable otv_lbdExp111 = elem_ft111;\n\n\tjava.lang.Boolean idIfCond_296 = false;\n\tidIfCond_296 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(otv_lbdExp111, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_296 ) {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_295 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this, otv_lbdExp111);\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_295 ) {\n\n\tresult_ft111 = elem_ft111;\n}\n\n}\n\t}\n}\n\n\n//CE\nobj = result_ft111;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_297 = false;\n\tidIfCond_297 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(obj)), kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, 0));\n\n\tif( idIfCond_297 ) {\n\n\tjava.lang.Boolean idIfCond_298 = false;\n\tidIfCond_298 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(context.getFtProductTypeStack().peek().getTypeByIndex(i), this);\n\n\tif( idIfCond_298 ) {\n\n\tresult = context.getFtProductTypeStack().peek().getTypeByIndex(i).createBehaviorJava(context);\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.ETypeParameter ecoreTypeParameter = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this);\n\n\tjava.lang.Boolean idIfCond_299 = false;\n\tidIfCond_299 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_299 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_300 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n\n}\n\n\n\tthis.setEcoreModelElement(ecoreTypeParameter);\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.ETypeParameter result = null;\n\n\tecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.ETypeParameter\"));\n\n\tecoreTypeParameter.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tresult = ecoreTypeParameter;\n\nreturn result;\n'"
	 * @generated
	 */
	ETypeParameter createEcoreModelElement(KM2EcoreContext context);

} // ObjectTypeVariable
