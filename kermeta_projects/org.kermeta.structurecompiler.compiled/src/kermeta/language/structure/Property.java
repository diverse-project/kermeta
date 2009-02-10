/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Property.java,v 1.11 2009-02-10 17:51:52 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EStructuralFeature;

import kermeta.language.behavior.Expression;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Property#get_default <em>default</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Property#getIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getProperty()
 * @model annotation="kermeta documentation='/** We have to visit property in order to print the behavior of the getter and setter \052/'"
 *        annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='Class representing the property definition. Kermeta<->Ecore equivalence:\n - Property with isComposite == true or with type is a base type (String, Integer, Boolean)  : EAttribute\n - Property with isComposite == false : EReference'"
 * @generated
 */
public interface Property extends Traceability<EStructuralFeature>,
		MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>default</em>' attribute.
	 * @see #set_default(String)
	 * @see kermeta.language.structure.StructurePackage#getProperty__default()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	String get_default();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#get_default <em>default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>default</em>' attribute.
	 * @see #get_default()
	 * @generated
	 */
	void set_default(String value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see kermeta.language.structure.StructurePackage#getProperty_Opposite()
	 * @model annotation="kermeta documentation='Opposite Property of the Property, void if the Property has no opposite'"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsDerived()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='If True, the value of the property is not stored but computed from other properties'"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Getter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Body</em>' containment reference.
	 * @see #setGetterBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getProperty_GetterBody()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	Expression getGetterBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getGetterBody <em>Getter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Body</em>' containment reference.
	 * @see #getGetterBody()
	 * @generated
	 */
	void setGetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsReadOnly()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the Property is read-only'"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Setter Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Body</em>' containment reference.
	 * @see #setSetterBody(Expression)
	 * @see kermeta.language.structure.StructurePackage#getProperty_SetterBody()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	Expression getSetterBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getSetterBody <em>Setter Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Body</em>' containment reference.
	 * @see #getSetterBody()
	 * @generated
	 */
	void setSetterBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsID()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the property allows to identify its containing Object'"
	 * @generated
	 */
	Boolean getIsID();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #getIsID()
	 * @generated
	 */
	void setIsID(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Setter Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Setter Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #setIsSetterAbstract(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsSetterAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating wether the setter is abstract.'"
	 * @generated
	 */
	Boolean getIsSetterAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsSetterAbstract <em>Is Setter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Setter Abstract</em>' attribute.
	 * @see #getIsSetterAbstract()
	 * @generated
	 */
	void setIsSetterAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getProperty_OwningClass()
	 * @see kermeta.language.structure.ClassDefinition#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false"
	 *        annotation="kermeta documentation='ClassDefinition that owns the Property'"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Getter Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Getter Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #setIsGetterAbstract(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsGetterAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating wether the getter is abstract.'"
	 * @generated
	 */
	Boolean getIsGetterAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsGetterAbstract <em>Is Getter Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Getter Abstract</em>' attribute.
	 * @see #getIsGetterAbstract()
	 * @generated
	 */
	void setIsGetterAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getProperty_IsComposite()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the Property has a containment role'"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = null;\n\n\tjava.lang.String javaCode = \"\";\n\n\tjava.lang.Boolean idIfCond_502 = false;\n\tidIfCond_502 = this.getIsDerived();\n\n\tif( idIfCond_502 ) {\n\n\tjava.lang.Boolean idIfCond_503 = false;\n\tidIfCond_503 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getIsReadOnly()), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getSetterBody())));\n\n\tif( idIfCond_503 ) {\n\n\tjavaCode = this.getSetterBody().createBehaviorJava(context);\n\n\tecore.EOperation setterEOp = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));\n\n\tsetterEOp.setName(this.printSetAccessor(context));\n\n\tsetterEOp.setOrdered(this.getEcoreModelElement().isOrdered());\n\n\tsetterEOp.setUnique(this.getEcoreModelElement().isUnique());\n\n\tecore.EParameter param_setterEOp = ((ecore.EParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEParameter()));\n\n\tparam_setterEOp.setName(\"value\");\n\n\t((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement())).setLinks(this, param_setterEOp, context);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EParameter>convertAsOrderedSet(setterEOp.getEParameters()).add(param_setterEOp);\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).addAnnotationGenModelImpl(setterEOp, javaCode);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(this.getOwningClass().getEcoreModelElement().getEOperations()).add(setterEOp);\n}\n\n\n\tjavaCode = \"\";\n\n\tjava.lang.String type_label = \"\";\n\n\tjava.lang.Boolean idIfCond_504 = false;\n\tidIfCond_504 = context.getFtSuffixActivation();\n\n\tif( idIfCond_504 ) {\n\n\ttype_label = context.getFtReturnType();\n\n\tcontext.setFtReturnType(\"\");\n}\n else {\n\n\ttype_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.kermeta.KermetaPackage.eINSTANCE.getCompilerHelperJava())).ppTypeFromMultiplicityElement(this, context);\n}\n\n\n\tjava.lang.Boolean idIfCond_505 = false;\n\tidIfCond_505 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(type_label));\n\n\tif( idIfCond_505 ) {\n\n\tjavaCode = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(javaCode, \"\\n\"), type_label), \" result\"), context.printFtSuffix()), \" = null;\\n\");\n}\n\n\n\tjava.lang.Boolean idIfCond_506 = false;\n\tidIfCond_506 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getGetterBody()));\n\n\tif( idIfCond_506 ) {\n\n\tjavaCode = kermeta.standard.helper.StringWrapper.plus(javaCode, this.getGetterBody().createBehaviorJava(context));\n}\n\n\n\tjavaCode = kermeta.standard.helper.StringWrapper.plus(javaCode, this.ppReturnResult(context));\n\n\tecore.EOperation getterEOp = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEOperation()));\n\n\tgetterEOp.setName(this.printGetAccessor(context));\n\n\tgetterEOp.setUpperBound(this.getEcoreModelElement().getUpperBound());\n\n\tgetterEOp.setOrdered(this.getEcoreModelElement().isOrdered());\n\n\tgetterEOp.setUnique(this.getEcoreModelElement().isUnique());\n\n\t((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement())).setLinks(this, getterEOp, context);\n\n\t((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).addAnnotationGenModelImpl(getterEOp, javaCode);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getOwningClass().getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEOperations()).add(getterEOp);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(this.getOwningClass().getEcoreModelElement().getEStructuralFeatures()).remove(this.getEcoreModelElement());\n\n\tthis.setEcoreModelElement(null);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tecore.EStructuralFeature ecoreStructuralFeature = this.createEcoreModelElement(context);\n\n\tkermeta.language.structure.ClassDefinition c = null;\n\n\tc = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(c.getEcoreModelElement().getEStructuralFeatures()).add(ecoreStructuralFeature);\n\n\tthis.setEcoreModelElement(ecoreStructuralFeature);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_507 = false;\n\twhile( !idLoopCond_507 ) {\n\tidLoopCond_507 = it_ft92.isOff();\n\tif ( idLoopCond_507 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp92 = it_ft92.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp91 = o_lbdExp92;\n\n\to_lbdExp91.applyPass1(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EStructuralFeature result = null;\n\n\tecore.EStructuralFeature ecoreStructuralFeature = null;\n\n\tkermeta.language.structure.Type current_type = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Type\")));\n\n\tjava.lang.Boolean idIfCond_508 = false;\n\tidIfCond_508 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(current_type.isValueType(), current_type.isEnumeration()), current_type.isEDataType());\n\n\tif( idIfCond_508 ) {\n\n\tecoreStructuralFeature = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAttribute()));\n}\n else {\n\n\tecoreStructuralFeature = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEReference()));\n\n\t((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(ecoreStructuralFeature, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"))).setContainment(this.getIsComposite());\n}\n\n\n\t((km2ecore.helper.ecore.EcoreModelElementHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEcoreModelElementHelper())).setEStructuralFeatureProperties(this, ecoreStructuralFeature, context);\n\n\tjava.lang.Boolean idIfCond_509 = false;\n\tidIfCond_509 = this.getIsDerived();\n\n\tif( idIfCond_509 ) {\n\n\tecore.EAnnotation annotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.ecore.EcorePackage.eINSTANCE.getEAnnotationHelper())).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName(\"isReadOnly\").getName()), kermeta.standard.helper.BooleanWrapper.toString(this.getIsReadOnly()));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreStructuralFeature.getEAnnotations()).add(annotation);\n}\n\n\n\tecoreStructuralFeature.set_transient(this.getEMFIsTransient());\n\n\tjava.lang.Boolean idIfCond_510 = false;\n\tidIfCond_510 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(ecoreStructuralFeature.is_transient()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(ecoreStructuralFeature, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"))), kermeta.standard.helper.StringWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this.getType()).getTypeDefinition().qualifiedName(), \"kermeta::language::structure::Enumeration\"));\n\n\tif( idIfCond_510 ) {\n\n\t((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(ecoreStructuralFeature, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"))).set_transient(true);\n}\n\n\n\tresult = ecoreStructuralFeature;\n\nreturn result;\n'"
	 * @generated
	 */
	EStructuralFeature createEcoreModelElement(KM2EcoreContext context);

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
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_511 = false;\n\tidIfCond_511 = this.getIsDerived();\n\n\tif( idIfCond_511 ) {\n\n\tresult = \"getter\";\n}\n else {\n\n\tjava.lang.Boolean isBoolean = false;\n\n\tjava.lang.Boolean idIfCond_512 = false;\n\tidIfCond_512 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement()));\n\n\tif( idIfCond_512 ) {\n\n\tjava.lang.Boolean idIfCond_513 = false;\n\tidIfCond_513 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EAttribute\"));\n\n\tif( idIfCond_513 ) {\n\n\tjava.lang.Boolean idIfCond_514 = false;\n\tidIfCond_514 = kermeta.standard.helper.StringWrapper.equals(this.getType().getEMFEDataTypeInstanceClassName(), \"boolean\");\n\n\tif( idIfCond_514 ) {\n\n\tisBoolean = true;\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_515 = false;\n\tidIfCond_515 = isBoolean;\n\n\tif( idIfCond_515 ) {\n\n\tresult = \"is\";\n}\n else {\n\n\tresult = \"get\";\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, kermeta.standard.helper.StringWrapper.capName(this.getFinalName(context)));\n\nreturn result;\n'"
	 * @generated
	 */
	String printGetAccessor(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_516 = false;\n\tidIfCond_516 = this.getIsDerived();\n\n\tif( idIfCond_516 ) {\n\n\tresult = \"setter\";\n}\n else {\n\n\tresult = \"set\";\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, kermeta.standard.helper.StringWrapper.capName(this.getFinalName(context)));\n\nreturn result;\n'"
	 * @generated
	 */
	String printSetAccessor(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getLinkSetterForTypedElement())).setLinks(this, this.getEcoreModelElement(), context);\n\n\tjava.lang.Boolean idIfCond_517 = false;\n\tidIfCond_517 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getOpposite()));\n\n\tif( idIfCond_517 ) {\n\n\tjava.lang.Boolean idIfCond_518 = false;\n\tidIfCond_518 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getOpposite().getEcoreModelElement()));\n\n\tif( idIfCond_518 ) {\n\n\t((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"))).setEOpposite(((ecore.EReference) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getOpposite().getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EReference\"))));\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_519 = false;\n\tidIfCond_519 = kermeta.standard.helper.StringWrapper.equals(this.getType().getTypeQName(), \"kermeta::standard::Boolean\");\n\n\tif( idIfCond_519 ) {\n\n\tjava.lang.Boolean mustSetted = false;\n\n\tjava.lang.Boolean idIfCond_520 = false;\n\tidIfCond_520 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement().getDefaultValueLiteral());\n\n\tif( idIfCond_520 ) {\n\n\tmustSetted = true;\n}\n else {\n\n\tjava.lang.Boolean idIfCond_521 = false;\n\tidIfCond_521 = kermeta.standard.helper.StringWrapper.equals(this.getEcoreModelElement().getDefaultValueLiteral(), \"\");\n\n\tif( idIfCond_521 ) {\n\n\tmustSetted = true;\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_522 = false;\n\tidIfCond_522 = mustSetted;\n\n\tif( idIfCond_522 ) {\n\n\tthis.getEcoreModelElement().setDefaultValueLiteral(\"false\");\n}\n\n}\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLinks(context);\n\n\t//BIft:eachOwnedElement\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(this.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_523 = false;\n\twhile( !idLoopCond_523 ) {\n\tidLoopCond_523 = it_ft94.isOff();\n\tif ( idLoopCond_523 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp94 = it_ft94.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp93 = o_lbdExp94;\n\n\tp_lbdExp93.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n\n\tthis.createBehaviorJava(context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Property
