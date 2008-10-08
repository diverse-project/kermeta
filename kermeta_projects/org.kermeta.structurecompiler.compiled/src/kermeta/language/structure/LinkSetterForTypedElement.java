/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElement.java,v 1.4 2008-10-08 14:37:43 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_421 = false;\n\tidIfCond_421 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreModelElement)), kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(element.getType().getTypeQName())));\n\n\tif( idIfCond_421 ) {\n\n\tjava.lang.Boolean idIfCond_422 = false;\n\tidIfCond_422 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_422 ) {\n\n\tkermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n\n\tkermeta.language.structure.ClassDefinition classDefinition = c.getClassDefinitionAsTyped();\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_423 = false;\n\tidIfCond_423 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDefinition.getEcoreDataType());\n\n\tif( idIfCond_423 ) {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreModelElement());\n}\n else {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreDataType());\n}\n\n\n\tecoreModelElement.setEGenericType(genericType);\n\n\tc.setEcoreModelElement(genericType);\n\n\tc.setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_424 = false;\n\tidIfCond_424 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_424 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = element.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_425 = false;\n\tidIfCond_425 = element.getType().isEDataType();\n\n\tif( idIfCond_425 ) {\n\n\tecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewEGT.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(newEGT);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft137 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_426 = false;\n\twhile( !idLoopCond_426 ) {\n\tidLoopCond_426 = it_ft137.isOff();\n\tif ( idLoopCond_426 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp137 = it_ft137.next();\n\n\tjava.lang.Boolean idIfCond_427 = false;\n\tidIfCond_427 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreModelElement.getEGenericType()));\n\n\tif( idIfCond_427 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newEGT.getETypeArguments()).add(((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\")));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_428 = false;\n\tidIfCond_428 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_428 ) {\n\n\tecoreModelElement.setEType(cd.getEcoreModelElement());\n}\n else {\n\n\tecoreModelElement.setEType(cd.getEcoreDataType());\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_429 = false;\n\tidIfCond_429 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_429 ) {\n\n\tecoreModelElement.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_430 = false;\n\tidIfCond_430 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_430 ) {\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tgenericType.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(genericType);\n}\n\n}\n\n}\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context);

} // LinkSetterForTypedElement
