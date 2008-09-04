/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveType.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
 *        annotation="kermeta documentation='The class definition for kermeta aliases. Above statement defines a primitive\r\ntype called MyString, which instanceType is <code>kermeta::standard::String</code>\r\n<pre>alias MyString : kermeta::standard::String</pre>. Another example could be: <code>root::apackage::AClass</code>\r\n<pre>alias MyClass : root::apackage::AClass</pre>, thus a primitive type may be not a subtype of ValueType (ValueType is a concept from the Kermeta framework).'"
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
	 * @model annotation="kermeta documentation='The type the primitive type is linked with'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getInstanceType().createBehaviorJava(context);\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EDataType eModelElement = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eModelElement);\n\n\tthis.setEcoreModelElement(eModelElement);\n\n\t//Beginning of the Inlining of the function type: eachOwnedElement\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_183 = false;\n\twhile( !idLoopCond_183 ) {\n\tidLoopCond_183 = it_ft69.isOff();\n\tif ( idLoopCond_183 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Tag o = it_ft69.next();\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Tag cd = o_ft69;\n\n\tcd.applyPass1(context);\n//End of the Inlining of the lambda expression: func\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n//End of the Inlining of the function type: eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EDataType result = null;\n\n\tecore.EDataType eModelElement = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\teModelElement.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\teModelElement.setInstanceClassName(\"java.lang.Object\");\n\n\tjava.lang.String instanceClassName = this.getEMFEDataTypeInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_184 = false;\n\tidIfCond_184 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(instanceClassName, \"\");\n\n\tif( idIfCond_184 ) {\n\n\teModelElement.setInstanceClassName(instanceClassName);\n\n\tkermeta.standard.OrderedSet<java.lang.String> etps = kermeta.standard.helper.StringWrapper.split(this.getUniqueTagValue(\"ecore.EDataType_eTypeParameters\"), \" , \");\n\n\tjava.lang.Boolean idIfCond_185 = false;\n\tidIfCond_185 = kermeta.standard.helper.IntegerWrapper.isGreater(etps.size(), 0);\n\n\tif( idIfCond_185 ) {\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft70 = etps.iterator();\n\tjava.lang.Boolean idLoopCond_186 = false;\n\twhile( !idLoopCond_186 ) {\n\tidLoopCond_186 = it_ft70.isOff();\n\tif ( idLoopCond_186 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\njava.lang.String etp = it_ft70.next();\n\n\tjava.lang.Boolean idIfCond_187 = false;\n\tidIfCond_187 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(etp, \"\");\n\n\tif( idIfCond_187 ) {\n\n\tecore.ETypeParameter ecoreTypeParameter = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.ETypeParameter\"));\n\n\tecoreTypeParameter.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(etp, context));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(eModelElement.getETypeParameters()).add(ecoreTypeParameter);\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}\n\n\n\teModelElement.setSerializable(this.getEMFEDataTypeIsSerializable());\n}\n\n\n\tjava.lang.String qualifiedName = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getClassFromPrimitiveType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeDefinition().qualifiedName();\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(eModelElement.getEAnnotations()).add(((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"alias\").getName()), qualifiedName));\n\n\tjava.lang.Boolean idIfCond_188 = false;\n\tidIfCond_188 = kermeta.standard.helper.StringWrapper.equals(eModelElement.getInstanceClassName(), \"\");\n\n\tif( idIfCond_188 ) {\n\n\teModelElement.setInstanceClassName(kermeta.standard.helper.StringWrapper.replace(qualifiedName, \"::\", \"\\\\.\"));\n}\n\n\n\tresult = eModelElement;\n\nreturn result;\n'"
	 * @generated
	 */
	EDataType createEcoreModelElement(KM2EcoreContext context);

} // PrimitiveType
