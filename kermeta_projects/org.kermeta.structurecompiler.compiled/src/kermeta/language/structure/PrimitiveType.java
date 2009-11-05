/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

import ecore.EDataType;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.PrimitiveType#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getPrimitiveType()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='The class definition for kermeta aliases. Above statement defines a primitive\r\ntype called MyString, which instanceType is <code>kermeta::standard::String</code>\r\n<pre>alias MyString : kermeta::standard::String</pre>. Another example could be: <code>root::apackage::AClass</code>\r\n<pre>alias MyClass : root::apackage::AClass</pre>, thus a primitive type may be not a subtype of ValueType (ValueType is a concept from the Kermeta framework).'"
 *        annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 * @generated
 */
public interface PrimitiveType extends DataType, TypeContainer,
		Traceability<EDataType> {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' reference.
	 * @see #setInstanceType(Type)
	 * @see kermeta.language.structure.StructurePackage#getPrimitiveType_InstanceType()
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='The type the primitive type is linked with'"
	 * @generated
	 */
	Type getInstanceType();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.PrimitiveType#getInstanceType <em>Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' reference.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_518 = false;\n\tidIfCond_518 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isValueType()), this.isEDataType());\n\n\tif( idIfCond_518 ) {\n\n\tresult = this.getEMFEDataTypeInstanceClassName();\n}\n\n\n\tjava.lang.Boolean idIfCond_519 = false;\n\tidIfCond_519 = kermeta.standard.helper.StringWrapper.equals(result, \"\");\n\n\tif( idIfCond_519 ) {\n\n\tresult = this.getInstanceType().createBehaviorJava(context);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType eModelElement = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eModelElement);\n\n\tthis.setEcoreModelElement(eModelElement);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_520 = false;\n\twhile( !idLoopCond_520 ) {\n\tidLoopCond_520 = it_ft100.isOff();\n\tif ( idLoopCond_520 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp100 = it_ft100.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag cd_lbdExp99 = o_lbdExp100;\n\n\tcd_lbdExp99.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EDataType result = null;\n\n\tecore.EDataType eModelElement = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\teModelElement.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(this.getName(), context));\n\n\teModelElement.setInstanceClassName(\"java.lang.Object\");\n\n\tjava.lang.String instanceClassName = this.getEMFEDataTypeInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_521 = false;\n\tidIfCond_521 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(instanceClassName, \"\");\n\n\tif( idIfCond_521 ) {\n\n\teModelElement.setInstanceClassName(instanceClassName);\n\n\tkermeta.standard.Sequence<java.lang.String> etps = kermeta.standard.helper.StringWrapper.split(this.getEMFEDataTypeETypeParameters(), \" , \");\n\n\tjava.lang.Boolean idIfCond_522 = false;\n\tidIfCond_522 = kermeta.standard.helper.IntegerWrapper.isGreater(etps.size(), 0);\n\n\tif( idIfCond_522 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft101 = etps.iterator();\n\tjava.lang.Boolean idLoopCond_523 = false;\n\twhile( !idLoopCond_523 ) {\n\tidLoopCond_523 = it_ft101.isOff();\n\tif ( idLoopCond_523 ) {\n\t} else {\n\n\t//BIle:func\njava.lang.String etp_lbdExp101 = it_ft101.next();\n\n\tjava.lang.Boolean idIfCond_524 = false;\n\tidIfCond_524 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(etp_lbdExp101, \"\");\n\n\tif( idIfCond_524 ) {\n\n\tecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getETypeParameter()));\n\n\tecoreTypeParameter.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(etp_lbdExp101, context));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(eModelElement.getETypeParameters()).add(ecoreTypeParameter);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\teModelElement.setSerializable(this.getEMFEDataTypeIsSerializable());\n}\n\n\n\tkermeta.language.structure.TypeDefinition typeDef = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getClassFromPrimitiveType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeDefinition();\n\n\tjava.lang.String typeDef_EMFInstanceClassName = typeDef.getEMFInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_525 = false;\n\tidIfCond_525 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(typeDef_EMFInstanceClassName, \"\"), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(eModelElement.getInstanceClassName(), \"\"), kermeta.standard.helper.StringWrapper.equals(eModelElement.getInstanceClassName(), \"java.lang.Object\")));\n\n\tif( idIfCond_525 ) {\n\n\teModelElement.setInstanceClassName(typeDef_EMFInstanceClassName);\n}\n\n\n\tjava.lang.String qualifiedName = typeDef.qualifiedName();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"alias\").getName()), qualifiedName));\n\n\tjava.lang.Boolean idIfCond_526 = false;\n\tidIfCond_526 = kermeta.standard.helper.StringWrapper.equals(eModelElement.getInstanceClassName(), \"\");\n\n\tif( idIfCond_526 ) {\n\n\teModelElement.setInstanceClassName(kermeta.standard.helper.StringWrapper.replace(qualifiedName, context.getKERMETA_SEPARATOR(), context.getJAVA_SEPARATOR()));\n}\n\n\n\tresult = eModelElement;\n\nreturn result;\n'"
	 * @generated
	 */
	EDataType createEcoreModelElement(KM2EcoreContext context);

} // PrimitiveType
