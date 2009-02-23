/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: LinkSetterForTypedElement.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_359 = false;\n\tidIfCond_359 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreModelElement)), kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(element.getType().getTypeQName())));\n\n\tif( idIfCond_359 ) {\n\n\tjava.lang.Boolean idIfCond_360 = false;\n\tidIfCond_360 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_360 ) {\n\n\tkermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n\n\tkermeta.language.structure.ClassDefinition classDefinition = c.getClassDefinitionAsTyped();\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tjava.lang.Boolean idIfCond_361 = false;\n\tidIfCond_361 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreDataType());\n\n\tif( idIfCond_361 ) {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreModelElement());\n}\n else {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreDataType());\n}\n\n\n\tecoreModelElement.setEGenericType(genericType);\n\n\tc.setEcoreModelElement(genericType);\n\n\tc.setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_362 = false;\n\tidIfCond_362 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_362 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = element.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_363 = false;\n\tidIfCond_363 = element.getType().isEDataType();\n\n\tif( idIfCond_363 ) {\n\n\tecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnewEGT.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(newEGT);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft123 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_364 = false;\n\twhile( !idLoopCond_364 ) {\n\tidLoopCond_364 = it_ft123.isOff();\n\tif ( idLoopCond_364 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp123 = it_ft123.next();\n\n\tjava.lang.Boolean idIfCond_365 = false;\n\tidIfCond_365 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ecoreModelElement.getEGenericType()));\n\n\tif( idIfCond_365 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newEGT.getETypeArguments()).add(((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType())));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_366 = false;\n\tidIfCond_366 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd.getEcoreDataType());\n\n\tif( idIfCond_366 ) {\n\n\tecoreModelElement.setEType(cd.getEcoreModelElement());\n}\n else {\n\n\tecoreModelElement.setEType(cd.getEcoreDataType());\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_367 = false;\n\tidIfCond_367 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_367 ) {\n\n\tecoreModelElement.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_368 = false;\n\tidIfCond_368 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_368 ) {\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tgenericType.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(genericType);\n}\n\n}\n\n}\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context);

} // LinkSetterForTypedElement
