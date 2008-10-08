/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariable.java,v 1.4 2008-10-08 14:37:43 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='To be written'"
 * @generated
 */
public interface ObjectTypeVariable extends Traceability<ETypeParameter>,
		TypeVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_396 = false;\n\tidIfCond_396 = context.getFtSuffixActivation();\n\n\tif( idIfCond_396 ) {\n\n\tkermeta.language.structure.Type type_from_map = context.getFtMapTypeStack().peek().getValue(this);\n\n\tjava.lang.Boolean idIfCond_397 = false;\n\tidIfCond_397 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(type_from_map));\n\n\tif( idIfCond_397 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"Please contact the Kermeta Development team, if you are in this case [ObjectTypeVariable::createBehaviorJava - not type_from_map.isVoid()] \", org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this)));\n\n\tcontext.setFtSuffixActivation(false);\n\n\tresult = type_from_map.createBehaviorJava(context);\n\n\tcontext.setFtSuffixActivation(true);\n}\n else {\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.structure.Object obj = null;\n//BIft:detect\n\nkermeta.language.structure.TypeVariable result_ft135 = null;\n\n\tkermeta.language.structure.TypeVariable elem_ft135 = null;\n\n\tresult_ft135 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft135 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_398 = false;\n\twhile( !idLoopCond_398 ) {\n\tidLoopCond_398 = kermeta.standard.helper.BooleanWrapper.or(it_ft135.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft135, null));\n\tif ( idLoopCond_398 ) {\n\t} else {\n\n\telem_ft135 = it_ft135.next();\n\n\tjava.lang.Boolean idIfCond_399 = false;\n//BIle:detector\nkermeta.language.structure.TypeVariable otv_lbdExp135 = elem_ft135;\n\n\tjava.lang.Boolean idIfCond_400 = false;\n\tidIfCond_400 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(otv_lbdExp135, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_400 ) {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_399 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, otv_lbdExp135);\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_399 ) {\n\n\tresult_ft135 = elem_ft135;\n}\n\n}\n\t}\n}\n\n\n//CE\nobj = result_ft135;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_401 = false;\n\tidIfCond_401 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(obj)), kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, 0));\n\n\tif( idIfCond_401 ) {\n\n\tjava.lang.Boolean idIfCond_402 = false;\n\tidIfCond_402 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(context.getFtProductTypeStack().peek().getTypeByIndex(i), this);\n\n\tif( idIfCond_402 ) {\n\n\tresult = context.getFtProductTypeStack().peek().getTypeByIndex(i).createBehaviorJava(context);\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.ETypeParameter ecoreTypeParameter = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\n\tjava.lang.Boolean idIfCond_403 = false;\n\tidIfCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_403 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_404 = false;\n\tidIfCond_404 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_404 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n\n}\n\n\n\tthis.setEcoreModelElement(ecoreTypeParameter);\n'"
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
