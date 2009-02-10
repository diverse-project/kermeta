/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Class.java,v 1.11 2009-02-10 17:51:52 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EGenericType;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.structure.StructurePackage#getClass_()
 * @model annotation="kermeta documentation='Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class.'"
 * @generated
 */
public interface Class extends Traceability<EGenericType>, ParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.cloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Instantiates a new occurence for this Class\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(this.getTypeDefinition().qualifiedName().replace(\"::\", \".\"));\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft66 = null;\n\n\tkermeta.language.structure.Property elem_ft66 = null;\n\n\tresult_ft66 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_424 = false;\n\twhile( !idLoopCond_424 ) {\n\tidLoopCond_424 = it_ft66.isOff();\n\tif ( idLoopCond_424 ) {\n\t} else {\n\n\telem_ft66 = it_ft66.next();\n\n\tjava.lang.Boolean idIfCond_425 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp66 = elem_ft66;\n\n\tidIfCond_425 = p_lbdExp66.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_425 ) {\n\n\tresult_ft66.add(elem_ft66);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft66);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft67 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_426 = false;\n\twhile( !idLoopCond_426 ) {\n\tidLoopCond_426 = it_ft67.isOff();\n\tif ( idLoopCond_426 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp67 = it_ft67.next();\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft68 = null;\n\n\tkermeta.language.structure.Property elem_ft68 = null;\n\n\tresult_ft68 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(s_lbdExp67.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_427 = false;\n\twhile( !idLoopCond_427 ) {\n\tidLoopCond_427 = it_ft68.isOff();\n\tif ( idLoopCond_427 ) {\n\t} else {\n\n\telem_ft68 = it_ft68.next();\n\n\tjava.lang.Boolean idIfCond_428 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp68 = elem_ft68;\n\n\tidIfCond_428 = p_lbdExp68.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_428 ) {\n\n\tresult_ft68.add(elem_ft68);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft68);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(this.getterSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_429 = false;\n\twhile( !idLoopCond_429 ) {\n\tidLoopCond_429 = superClasses.isEmpty();\n\tif ( idLoopCond_429 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft69 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_430 = false;\n\twhile( !idLoopCond_430 ) {\n\tidLoopCond_430 = it_ft69.isOff();\n\tif ( idLoopCond_430 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp69 = it_ft69.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(s_lbdExp69.getterSuperClass()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Class> allSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ClassUtil.equals(this, other), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the String representation of this class. \r\n\t *  Note : throws an exception if this class has no classDefinition\r\n\t *  or if the classDefinition is not well constructed.\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_431 = false;\n\twhile( !idLoopCond_431 ) {\n\tidLoopCond_431 = it_ft70.isOff();\n\tif ( idLoopCond_431 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp70 = it_ft70.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tjava.lang.Boolean idIfCond_432 = false;\n\tidIfCond_432 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_432 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_433 = false;\n\tidIfCond_433 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_433 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_434 = false;\n\tidIfCond_434 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_434 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_435 = false;\n\tidIfCond_435 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_435 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb_lbdExp70.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_436 = false;\n\tidIfCond_436 = tpb_lbdExp70.getType().isEDataType();\n\n\tif( idIfCond_436 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_437 = false;\n\tidIfCond_437 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_437 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_438 = false;\n\tidIfCond_438 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp70.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_438 ) {\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOwnedOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Class> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_422 = false;\n\twhile( !idLoopCond_422 ) {\n\tidLoopCond_422 = it_ft65.isOff();\n\tif ( idLoopCond_422 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp65 = it_ft65.next();\n\n\tjava.lang.Boolean idIfCond_423 = false;\n\tidIfCond_423 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), elem_lbdExp65);\n\n\tif( idIfCond_423 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(elem_lbdExp65, \"kermeta.language.structure.Class\");\n\n\tsupertypes.add(c);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Class> getterSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = cDef.getIsAbstract();\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean getterIsAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String getterName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n\n\tresult = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getterClassDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Property> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cDef.getOwnedAttribute());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterOwnedAttribute();

} // Class
