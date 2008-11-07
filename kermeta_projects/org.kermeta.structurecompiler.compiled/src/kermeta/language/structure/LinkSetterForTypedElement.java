/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElement.java,v 1.8 2008-11-07 08:53:38 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.ETypedElement;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Setter For Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.language.structure.StructurePackage#getLinkSetterForTypedElement()
 * @model
 * @generated
 */
public interface LinkSetterForTypedElement extends
		kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_409 = false;\n\tidIfCond_409 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreModelElement)), kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(element.getType().getTypeQName())));\n\n\tif( idIfCond_409 ) {\n\n\tjava.lang.Boolean idIfCond_410 = false;\n\tidIfCond_410 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_410 ) {\n\n\tkermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n\n\tkermeta.language.structure.ClassDefinition classDefinition = c.getClassDefinitionAsTyped();\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_411 = false;\n\tidIfCond_411 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreDataType());\n\n\tif( idIfCond_411 ) {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreModelElement());\n}\n else {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreDataType());\n}\n\n\n\tecoreModelElement.setEGenericType(genericType);\n\n\tc.setEcoreModelElement(genericType);\n\n\tc.setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_412 = false;\n\tidIfCond_412 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_412 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = element.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_413 = false;\n\tidIfCond_413 = element.getType().isEDataType();\n\n\tif( idIfCond_413 ) {\n\n\tecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewEGT.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(newEGT);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft128 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_414 = false;\n\twhile( !idLoopCond_414 ) {\n\tidLoopCond_414 = it_ft128.isOff();\n\tif ( idLoopCond_414 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp128 = it_ft128.next();\n\n\tjava.lang.Boolean idIfCond_415 = false;\n\tidIfCond_415 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreModelElement.getEGenericType()));\n\n\tif( idIfCond_415 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newEGT.getETypeArguments()).add(((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\")));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_416 = false;\n\tidIfCond_416 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_416 ) {\n\n\tecoreModelElement.setEType(cd.getEcoreModelElement());\n}\n else {\n\n\tecoreModelElement.setEType(cd.getEcoreDataType());\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_417 = false;\n\tidIfCond_417 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_417 ) {\n\n\tecoreModelElement.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_418 = false;\n\tidIfCond_418 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_418 ) {\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tgenericType.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(genericType);\n}\n\n}\n\n}\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context);

} // LinkSetterForTypedElement
