/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Class.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
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
public interface Class extends ParameterizedType, Traceability<EGenericType> {
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
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
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
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft118 = null;\n\n\tkermeta.language.structure.Property elem_ft118 = null;\n\n\tresult_ft118 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft118 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(this.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_344 = false;\n\twhile( !idLoopCond_344 ) {\n\tidLoopCond_344 = it_ft118.isOff();\n\tif ( idLoopCond_344 ) {\n\t} else {\n\n\telem_ft118 = it_ft118.next();\n\n\tjava.lang.Boolean idIfCond_345 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp118 = elem_ft118;\n\n\tidIfCond_345 = p_lbdExp118.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_345 ) {\n\n\tresult_ft118.add(elem_ft118);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft118);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft119 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_346 = false;\n\twhile( !idLoopCond_346 ) {\n\tidLoopCond_346 = it_ft119.isOff();\n\tif ( idLoopCond_346 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp119 = it_ft119.next();\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft120 = null;\n\n\tkermeta.language.structure.Property elem_ft120 = null;\n\n\tresult_ft120 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft120 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(s_lbdExp119.getterOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_347 = false;\n\twhile( !idLoopCond_347 ) {\n\tidLoopCond_347 = it_ft120.isOff();\n\tif ( idLoopCond_347 ) {\n\t} else {\n\n\telem_ft120 = it_ft120.next();\n\n\tjava.lang.Boolean idIfCond_348 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp120 = elem_ft120;\n\n\tidIfCond_348 = p_lbdExp120.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_348 ) {\n\n\tresult_ft120.add(elem_ft120);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft120);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(this.getterSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_349 = false;\n\twhile( !idLoopCond_349 ) {\n\tidLoopCond_349 = superClasses.isEmpty();\n\tif ( idLoopCond_349 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft121 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_350 = false;\n\twhile( !idLoopCond_350 ) {\n\tidLoopCond_350 = it_ft121.isOff();\n\tif ( idLoopCond_350 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp121 = it_ft121.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(s_lbdExp121.getterSuperClass()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft122 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_351 = false;\n\twhile( !idLoopCond_351 ) {\n\tidLoopCond_351 = it_ft122.isOff();\n\tif ( idLoopCond_351 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp122 = it_ft122.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tjava.lang.Boolean idIfCond_352 = false;\n\tidIfCond_352 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_352 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_353 = false;\n\tidIfCond_353 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_353 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_354 = false;\n\tidIfCond_354 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_354 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_355 = false;\n\tidIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_355 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb_lbdExp122.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_356 = false;\n\tidIfCond_356 = tpb_lbdExp122.getType().isEDataType();\n\n\tif( idIfCond_356 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_357 = false;\n\tidIfCond_357 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_357 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_358 = false;\n\tidIfCond_358 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(tpb_lbdExp122.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\"));\n\n\tif( idIfCond_358 ) {\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.OrderedSet<kermeta.language.structure.Operation> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterOwnedOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getOrderedSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_342 = false;\n\twhile( !idLoopCond_342 ) {\n\tidLoopCond_342 = it_ft117.isOff();\n\tif ( idLoopCond_342 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp117 = it_ft117.next();\n\n\tjava.lang.Boolean idIfCond_343 = false;\n\tidIfCond_343 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), elem_lbdExp117);\n\n\tif( idIfCond_343 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(elem_lbdExp117, \"kermeta.language.structure.Class\");\n\n\tsupertypes.add(c);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
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
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(this.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cDef.getOwnedAttribute());\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterOwnedAttribute();

} // Class
