/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkSetterForTypedElement.java,v 1.3 2008-09-22 14:47:41 cfaucher Exp $
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_788 = false;\n\tidIfCond_788 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreModelElement)), kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(element.getType().getTypeQName())));\n\n\tif( idIfCond_788 ) {\n\n\tjava.lang.Boolean idIfCond_789 = false;\n\tidIfCond_789 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_789 ) {\n\n\tkermeta.language.structure.Class c = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\")));\n\n\tkermeta.language.structure.ClassDefinition classDefinition = c.getClassDefinitionAsTyped();\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_790 = false;\n\tidIfCond_790 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDefinition.getEcoreDataType());\n\n\tif( idIfCond_790 ) {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreModelElement());\n}\n else {\n\n\tgenericType.setEClassifier(classDefinition.getEcoreDataType());\n}\n\n\n\tecoreModelElement.setEGenericType(genericType);\n\n\tc.setEcoreModelElement(genericType);\n\n\tc.setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_791 = false;\n\tidIfCond_791 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_791 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = element.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_792 = false;\n\tidIfCond_792 = element.getType().isEDataType();\n\n\tif( idIfCond_792 ) {\n\n\tecore.EGenericType newEGT = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewEGT.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(newEGT);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft179 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_793 = false;\n\twhile( !idLoopCond_793 ) {\n\tidLoopCond_793 = it_ft179.isOff();\n\tif ( idLoopCond_793 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp179 = it_ft179.next();\n\n\tjava.lang.Boolean idIfCond_794 = false;\n\tidIfCond_794 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ecoreModelElement.getEGenericType()));\n\n\tif( idIfCond_794 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newEGT.getETypeArguments()).add(((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\")));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_795 = false;\n\tidIfCond_795 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_795 ) {\n\n\tecoreModelElement.setEType(cd.getEcoreModelElement());\n}\n else {\n\n\tecoreModelElement.setEType(cd.getEcoreDataType());\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_796 = false;\n\tidIfCond_796 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"));\n\n\tif( idIfCond_796 ) {\n\n\tecoreModelElement.setEType(((kermeta.language.structure.Enumeration) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Enumeration\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_797 = false;\n\tidIfCond_797 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_797 ) {\n\n\tecore.EGenericType genericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tgenericType.setETypeParameter(((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(element.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"))).getEcoreModelElement());\n\n\tecoreModelElement.setEGenericType(genericType);\n}\n\n}\n\n}\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void setLinks(TypedElement element, ETypedElement ecoreModelElement,
			KM2EcoreContext context);

} // LinkSetterForTypedElement
