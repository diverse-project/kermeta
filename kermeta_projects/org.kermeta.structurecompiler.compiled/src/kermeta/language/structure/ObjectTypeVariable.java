/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectTypeVariable.java,v 1.3 2008-09-22 14:47:40 cfaucher Exp $
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
 * @model annotation="kermeta documentation='To be written'"
 *        annotation="kermeta documentation='/**\n *\n \052/'"
 * @generated
 */
public interface ObjectTypeVariable extends Traceability<ETypeParameter>,
		TypeVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getName();\n\n\tjava.lang.Boolean idIfCond_735 = false;\n\tidIfCond_735 = context.getFtSuffixActivation();\n\n\tif( idIfCond_735 ) {\n\n\tkermeta.language.structure.Type type_from_map = context.getFtMapTypeStack().peek().getValue(this);\n\n\tjava.lang.Boolean idIfCond_736 = false;\n\tidIfCond_736 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(type_from_map));\n\n\tif( idIfCond_736 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"++++++++++======== \", org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this)));\n\n\tcontext.setFtSuffixActivation(false);\n\n\tresult = type_from_map.createBehaviorJava(context);\n\n\tcontext.setFtSuffixActivation(true);\n}\n else {\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.structure.Object obj = null;\n//BIft:detect\n\nkermeta.language.structure.TypeVariable result_ft154 = null;\n\n\tkermeta.language.structure.TypeVariable elem_ft154 = null;\n\n\tresult_ft154 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_737 = false;\n\twhile( !idLoopCond_737 ) {\n\tidLoopCond_737 = kermeta.standard.helper.BooleanWrapper.or(it_ft154.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft154, null));\n\tif ( idLoopCond_737 ) {\n\t} else {\n\n\telem_ft154 = it_ft154.next();\n\n\tjava.lang.Boolean idIfCond_738 = false;\n//BIle:detector\nkermeta.language.structure.TypeVariable otv_lbdExp154 = elem_ft154;\n\n\tjava.lang.Boolean idIfCond_739 = false;\n\tidIfCond_739 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(otv_lbdExp154, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_739 ) {\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_738 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, otv_lbdExp154);\n}\n\n//EIle:detector\n\n\n\tif( idIfCond_738 ) {\n\n\tresult_ft154 = elem_ft154;\n}\n\n}\n\t}\n}\n\n\n//CE\nobj = result_ft154;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_740 = false;\n\tidIfCond_740 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(obj)), kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, 0));\n\n\tif( idIfCond_740 ) {\n\n\tjava.lang.Boolean idIfCond_741 = false;\n\tidIfCond_741 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(context.getFtProductTypeStack().peek().getTypeByIndex(i), this);\n\n\tif( idIfCond_741 ) {\n\n\tresult = context.getFtProductTypeStack().peek().getTypeByIndex(i).createBehaviorJava(context);\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.ETypeParameter ecoreTypeParameter = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Object container = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\n\tjava.lang.Boolean idIfCond_742 = false;\n\tidIfCond_742 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_742 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_743 = false;\n\tidIfCond_743 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_743 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(container, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getEcoreModelElement().getETypeParameters()).add(ecoreTypeParameter);\n}\n\n}\n\n\n\tthis.setEcoreModelElement(ecoreTypeParameter);\n'"
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
