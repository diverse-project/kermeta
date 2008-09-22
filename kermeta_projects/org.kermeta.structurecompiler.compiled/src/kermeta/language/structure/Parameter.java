/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.3 2008-09-22 14:47:39 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EParameter;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getParameter()
 * @model annotation="kermeta documentation='Definition for operation parameter'"
 *        annotation="kermeta documentation='/**\n *\n \052/'"
 * @generated
 */
public interface Parameter extends MultiplicityElement,
		Traceability<EParameter> {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see kermeta.language.structure.StructurePackage#getParameter_Operation()
	 * @see kermeta.language.structure.Operation#getOwnedParameter
	 * @model opposite="ownedParameter"
	 *        annotation="kermeta ecore.isTransient='true'"
	 *        annotation="kermeta documentation='Owning operation'"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_555 = false;\n\tidIfCond_555 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(this.getUpper(), 1), kermeta.standard.helper.StringWrapper.equals(this.getType().getTypeQName(), \"java.lang.String\"));\n\n\tif( idIfCond_555 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isRunnable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_556 = false;\n\tidIfCond_556 = this.isFunctionType();\n\n\tif( idIfCond_556 ) {\n\n\tkermeta.language.structure.FunctionType ft = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tjava.lang.Boolean idIfCond_557 = false;\n\tidIfCond_557 = ft.getRight().isBooleanTypeDef(context);\n\n\tif( idIfCond_557 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isBooleanFunctionType(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EParameter ecoreParameter = null;\n\n\tjava.lang.Boolean idIfCond_558 = false;\n\tidIfCond_558 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n\n\tif( idIfCond_558 ) {\n\n\tecoreParameter = ((ecore.EParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EParameter\"));\n\n\tecoreParameter.setName(this.getName());\n}\n else {\n\n\tecoreParameter = this.createEcoreModelElement(context);\n}\n\n\n\tkermeta.language.structure.Operation o = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EParameter>convertAsOrderedSet(o.getEcoreModelElement().getEParameters()).add(ecoreParameter);\n\n\tthis.setEcoreModelElement(ecoreParameter);\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EParameter result = null;\n\n\tecore.EParameter ecoreParameter = ((ecore.EParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EParameter\"));\n\n\tecoreParameter.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tecoreParameter.setOrdered(this.getIsOrdered());\n\n\tecoreParameter.setUnique(this.getIsUnique());\n\n\tecoreParameter.setLowerBound(this.getLower());\n\n\tecoreParameter.setUpperBound(this.getUpper());\n\n\tresult = ecoreParameter;\n\nreturn result;\n'"
	 * @generated
	 */
	EParameter createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLinks(context);\n\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_559 = false;\n\tidIfCond_559 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n\n\tif( idIfCond_559 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Parameter.setLinks FunctionType: \", org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this.getType())), \" self.ecoreModelElement: \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this.getEcoreModelElement())));\n\n\tkermeta.language.structure.FunctionType ft = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tthis.getEcoreModelElement().setEType(((km2ecore.helper.kermeta.GenericTypeDefinitionHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.kermeta.GenericTypeDefinitionHelper\")).getKermetaSpecialType(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")))));\n\n\tecore.EAnnotation ft_annotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).createEmpty(\"kermeta.functionType\");\n\n\tjava.lang.Boolean idIfCond_560 = false;\n\tidIfCond_560 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ft.getLeft()));\n\n\tif( idIfCond_560 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addEntry(ft_annotation, \"0\", ft.getLeft().getTypeQName());\n}\n\n\n\tjava.lang.Boolean idIfCond_561 = false;\n\tidIfCond_561 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ft.getLeft()));\n\n\tif( idIfCond_561 ) {\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.ecore.EAnnotationHelper\")).addEntry(ft_annotation, \"1\", ft.getRight().getTypeQName());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ft_annotation);\n\n\tft.setEcoreModelElement(ft_annotation);\n}\n else {\n\n\tkermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.LinkSetterForTypedElement\"));\n\n\ts.setLinks(this, this.getEcoreModelElement(), context);\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Return true if the given operation is a FunctionType\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_562 = false;\n\twhile( !idLoopCond_562 ) {\n\tidLoopCond_562 = it_ft97.isOff();\n\tif ( idLoopCond_562 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp97 = it_ft97.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp96 = o_lbdExp97;\n\n\tp_lbdExp96.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Parameter
