/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ClassDefinition.java,v 1.11 2009-02-10 17:51:52 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EClass;
import ecore.EDataType;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getSubClassDefinitions <em>Sub Class Definitions</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getClassDefinition()
 * @model annotation="kermeta documentation='/**\r\n *\r\n \052/'"
 *        annotation="kermeta documentation='The definition of a class definition :)\n <pre>class A\n{ \n  attribute s : String\n}\n  </pre> is a class definition; in :\n<pre>\nmain() : A is do end\n</pre>\nA is a <b>Class</b> : it corresponds to the <b>use</b> of the class definition of A'"
 * @generated
 */
public interface ClassDefinition extends Traceability<EClass>,
		GenericTypeDefinition, TypeContainer {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Operation}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_OwnedOperation()
	 * @see kermeta.language.structure.Operation#getOwningClass
	 * @model opposite="owningClass" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Operations owned by this ClassDefinition.'"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_IsAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether the ClassDefinition is abstract (which means that\nno instance can be allocated)'"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.ClassDefinition#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_SuperType()
	 * @model annotation="kermeta documentation='Classes from which this ClassDefinition inherits.'"
	 * @generated
	 */
	EList<Type> getSuperType();

	/**
	 * Returns the value of the '<em><b>Inv</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_Inv()
	 * @see kermeta.language.structure.Constraint#getInvOwner
	 * @model opposite="invOwner" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Invariants defined for this ClassDefinition'"
	 * @generated
	 */
	EList<Constraint> getInv();

	/**
	 * Returns the value of the '<em><b>Sub Class Definitions</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Definitions</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_SubClassDefinitions()
	 * @model
	 * @generated
	 */
	EList<ClassDefinition> getSubClassDefinitions();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Property}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Property#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_OwnedAttribute()
	 * @see kermeta.language.structure.Property#getOwningClass
	 * @model opposite="owningClass" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Attributes, References, and derived Properties owned by this ClassDefinition.'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Data Type</em>' reference.
	 * @see #setEcoreDataType(EDataType)
	 * @see kermeta.language.structure.StructurePackage#getClassDefinition_EcoreDataType()
	 * @model
	 * @generated
	 */
	EDataType getEcoreDataType();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.ClassDefinition#getEcoreDataType <em>Ecore Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Data Type</em>' reference.
	 * @see #getEcoreDataType()
	 * @generated
	 */
	void setEcoreDataType(EDataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_362 = false;\n\tidIfCond_362 = kermeta.standard.helper.BooleanWrapper.or(this.isCollection(), this.isIterator());\n\n\tif( idIfCond_362 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setSubClassDefinitionToSuperTypes();\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\tjava.lang.Boolean idIfCond_363 = false;\n\tidIfCond_363 = this.isValueType();\n\n\tif( idIfCond_363 ) {\n\n\tjava.lang.String instanceClassName = this.getEMFInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_364 = false;\n\tidIfCond_364 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(instanceClassName, \"\");\n\n\tif( idIfCond_364 ) {\n\n\tecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\teDataType.setName(kermeta.standard.helper.StringWrapper.plus(\"Java\", this.getName()));\n\n\teDataType.setInstanceClassName(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getValueTypeMapping()).add(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eDataType);\n\n\tthis.setEcoreDataType(eDataType);\n\n\tjava.lang.Boolean idIfCond_365 = false;\n\tidIfCond_365 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_365 ) {\n\n\tecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));\n\n\teClass.setName(this.getName());\n\n\tthis.setEcoreModelElement(eClass);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(eClass);\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_366 = false;\n\tidIfCond_366 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_366 ) {\n\n\tkm2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.common.exception.ExceptionPackage.eINSTANCE.getUndefinedValueTypeInstanceClassNameException()));\n\n\texcept.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"The class definition: \", this.qualifiedName()), \" is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load.\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( except );\n\n}\n\n}\n\n}\n else {\n\n\tecore.EClass ecoreClass = this.createEcoreModelElement(context);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreClass);\n\n\tthis.setEcoreModelElement(ecoreClass);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft43 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft43.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_367 = false;\n\twhile( !idLoopCond_367 ) {\n\tidLoopCond_367 = it_ft44.isOff();\n\tif ( idLoopCond_367 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp44 = it_ft44.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp43 = o_lbdExp44;\n\n\tjava.lang.Boolean idIfCond_368 = false;\n\tidIfCond_368 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_368 ) {\n\n\to_lbdExp43.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_369 = false;\n\tidIfCond_369 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_369 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft43.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_370 = false;\n\twhile( !idLoopCond_370 ) {\n\tidLoopCond_370 = it_ft45.isOff();\n\tif ( idLoopCond_370 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp45 = it_ft45.next();\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp43 = o_lbdExp45;\n\n\tjava.lang.Boolean idIfCond_371 = false;\n\tidIfCond_371 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_371 ) {\n\n\to_lbdExp43.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_372 = false;\n\tidIfCond_372 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_372 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft46 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft43.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_373 = false;\n\twhile( !idLoopCond_373 ) {\n\tidLoopCond_373 = it_ft46.isOff();\n\tif ( idLoopCond_373 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp46 = it_ft46.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp43 = o_lbdExp46;\n\n\tjava.lang.Boolean idIfCond_374 = false;\n\tidIfCond_374 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_374 ) {\n\n\to_lbdExp43.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_375 = false;\n\tidIfCond_375 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_375 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft43.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_376 = false;\n\twhile( !idLoopCond_376 ) {\n\tidLoopCond_376 = it_ft47.isOff();\n\tif ( idLoopCond_376 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp47 = it_ft47.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp43 = i_lbdExp47;\n\n\tjava.lang.Boolean idIfCond_377 = false;\n\tidIfCond_377 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_377 ) {\n\n\to_lbdExp43.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_378 = false;\n\tidIfCond_378 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_378 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft43.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_379 = false;\n\twhile( !idLoopCond_379 ) {\n\tidLoopCond_379 = it_ft48.isOff();\n\tif ( idLoopCond_379 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp48 = it_ft48.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp43 = t_lbdExp48;\n\n\tjava.lang.Boolean idIfCond_380 = false;\n\tidIfCond_380 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_380 ) {\n\n\to_lbdExp43.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp43, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_381 = false;\n\tidIfCond_381 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_381 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft49 = this.getEMFNeedProperty().iterator();\n\tjava.lang.Boolean idLoopCond_382 = false;\n\twhile( !idLoopCond_382 ) {\n\tidLoopCond_382 = it_ft49.isOff();\n\tif ( idLoopCond_382 ) {\n\t} else {\n\n\t//BIle:func\njava.lang.String emfNeedProperty_lbdExp49 = it_ft49.next();\n\n\tjava.lang.Boolean idIfCond_383 = false;\n\tidIfCond_383 = kermeta.standard.helper.IntegerWrapper.isGreater(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).size(), 0);\n\n\tif( idIfCond_383 ) {\n\n\tecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAttribute()));\n\n\tjava.lang.Boolean idIfCond_384 = false;\n\tidIfCond_384 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"javaClass\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"javaClass\"), \"\"));\n\n\tif( idIfCond_384 ) {\n\n\tnewProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAttribute()));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\tnewProperty_EDataType.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"KermetaProperty_\", this.getName()), \"_\"), kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"name\")));\n\n\tnewProperty_EDataType.setInstanceClassName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"javaClass\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(newProperty_EDataType);\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnewJavaCollection_EGenericType.setEClassifier(newProperty_EDataType);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_385 = false;\n\tidIfCond_385 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_385 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_386 = false;\n\twhile( !idLoopCond_386 ) {\n\tidLoopCond_386 = it_ft50.isOff();\n\tif ( idLoopCond_386 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp50 = it_ft50.next();\n\n\tecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getETypeParameter()));\n\n\tnewEtp.setName(etp_lbdExp50.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(newProperty_EDataType.getETypeParameters()).add(newEtp);\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\teta.setETypeParameter(etp_lbdExp50);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_387 = false;\n\tidIfCond_387 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"classDefinitionQN\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"classDefinitionQN\"), \"\"));\n\n\tif( idIfCond_387 ) {\n\n\tnewProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEReference()));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EClassifier retrieved_EClassifier = context.getMu().getEClassifierByQualifiedName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp49).getValue(\"classDefinitionQN\"));\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnewJavaCollection_EGenericType.setEClassifier(retrieved_EClassifier);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_388 = false;\n\tidIfCond_388 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_388 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_389 = false;\n\twhile( !idLoopCond_389 ) {\n\tidLoopCond_389 = it_ft51.isOff();\n\tif ( idLoopCond_389 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp51 = it_ft51.next();\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\teta.setETypeParameter(etp_lbdExp51);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tnewProperty.set_transient(true);\n\n\tkermeta.language.structure.TypeDefinition retrievedTypeDef = context.getMu().getTypeDefinitionByQualifiedName(\"ecore::EEList\");\n\n\tjava.lang.Boolean idIfCond_390 = false;\n\tidIfCond_390 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_390 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_391 = false;\n\tidIfCond_391 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_391 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n\n}\n\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEStructuralFeatures()).add(newProperty);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void initEmfNeedProperty(KM2EcoreContext context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_392 = false;\n\twhile( !idLoopCond_392 ) {\n\tidLoopCond_392 = it_ft52.isOff();\n\tif ( idLoopCond_392 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp52 = it_ft52.next();\n\n\tjava.lang.Boolean idIfCond_393 = false;\n\tidIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp52, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_393 ) {\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp52, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement()));\n\n\tif( idIfCond_394 ) {\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreModelElement()));\n\n\tif( idIfCond_395 ) {\n\n\tecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnew_eGenericType.setEClassifier(classDefinition.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getEGenericSuperTypes()).add(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp52, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp52, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::ValueType\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_396 = false;\n\twhile( !idLoopCond_396 ) {\n\tidLoopCond_396 = it_ft53.isOff();\n\tif ( idLoopCond_396 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp53 = it_ft53.next();\n\n\tjava.lang.Boolean idIfCond_397 = false;\n\tidIfCond_397 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp53, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_397 ) {\n\n\tjava.lang.Boolean idIfCond_398 = false;\n\tidIfCond_398 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp53, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_398 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.ClassDefinition>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp53, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSubClassDefinitions()).add(this);\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setSubClassDefinitionToSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String qName = this.qualifiedName();\n\n\tjava.lang.Boolean idIfCond_399 = false;\n\tidIfCond_399 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::String\"), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Integer\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Boolean\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Character\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Real\"));\n\n\tif( idIfCond_399 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isAddedValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns all the types directly and indirectly inherited by this ClasDefinition \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Type> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_400 = false;\n\twhile( !idLoopCond_400 ) {\n\tidLoopCond_400 = superClasses.isEmpty();\n\tif ( idLoopCond_400 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft54 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_401 = false;\n\twhile( !idLoopCond_401 ) {\n\tidLoopCond_401 = it_ft54.isOff();\n\tif ( idLoopCond_401 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type s_lbdExp54 = it_ft54.next();\n\n\tjava.lang.Boolean idIfCond_402 = false;\n\tidIfCond_402 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(s_lbdExp54, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_402 ) {\n\n\tjava.lang.Boolean idIfCond_403 = false;\n\tidIfCond_403 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp54, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_403 ) {\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp54, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSuperType()));\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Type> allSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" superType_qualifiedNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type res = null;\n//BIft:detect\n\nkermeta.language.structure.Type result_ft55 = null;\n\n\tkermeta.language.structure.Type elem_ft55 = null;\n\n\tresult_ft55 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft55 = this.allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_404 = false;\n\twhile( !idLoopCond_404 ) {\n\tidLoopCond_404 = kermeta.standard.helper.BooleanWrapper.or(it_ft55.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft55, null));\n\tif ( idLoopCond_404 ) {\n\t} else {\n\n\telem_ft55 = it_ft55.next();\n\n\tjava.lang.Boolean idIfCond_405 = false;\n//BIle:detector\nkermeta.language.structure.Type st_lbdExp55 = elem_ft55;\n\n\tidIfCond_405 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(st_lbdExp55, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(st_lbdExp55, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), superType_qualifiedName));\n//EIle:detector\n\n\n\tif( idIfCond_405 ) {\n\n\tresult_ft55 = elem_ft55;\n}\n\n}\n\t}\n}\n\n\n//CE\nres = result_ft55;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_406 = false;\n\tidIfCond_406 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(res));\n\n\tif( idIfCond_406 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(String superType_qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Iterator\");\n\n\tjava.lang.Boolean idIfCond_407 = false;\n\tidIfCond_407 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Iterator\");\n\n\tif( idIfCond_407 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Collection\");\n\n\tjava.lang.Boolean idIfCond_408 = false;\n\tidIfCond_408 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Collection\");\n\n\tif( idIfCond_408 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tecore.EClass ecoreClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));\n\n\tecoreClass.set_interface(false);\n\n\tecoreClass.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(this.getName(), context));\n\n\tecoreClass.set_abstract(this.getIsAbstract());\n\n\tresult = ecoreClass;\n\nreturn result;\n'"
	 * @generated
	 */
	EClass createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_409 = false;\n\tidIfCond_409 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_409 ) {\n\n\tthis.setLinks(context);\n}\n else {\n\n\tkermeta.language.structure.ClassDefinition cd_valueType = null;\n\n\tcd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(context.getMu().getTypeDefinitionByQualifiedName(\"kermeta::standard::ValueType\"), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEcoreModelElement().getESuperTypes()).add(cd_valueType.getEcoreModelElement());\n}\n\n\n\tjava.lang.Boolean idIfCond_410 = false;\n\tidIfCond_410 = kermeta.standard.helper.BooleanWrapper.and(this.isValueType(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getName(), \"Numeric\"));\n\n\tif( idIfCond_410 ) {\n\n\tcontext.setCurrent_valueType(this);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_411 = false;\n\twhile( !idLoopCond_411 ) {\n\tidLoopCond_411 = it_ft56.isOff();\n\tif ( idLoopCond_411 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp56 = it_ft56.next();\n\n\top_lbdExp56.applyPass2BehaviorJava(context);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_412 = false;\n\twhile( !idLoopCond_412 ) {\n\tidLoopCond_412 = it_ft57.isOff();\n\tif ( idLoopCond_412 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp57 = it_ft57.next();\n\n\tjava.lang.Boolean idIfCond_413 = false;\n\tidIfCond_413 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp57);\n\n\tif( idIfCond_413 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp57, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_414 = false;\n\twhile( !idLoopCond_414 ) {\n\tidLoopCond_414 = it_ft58.isOff();\n\tif ( idLoopCond_414 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp58 = it_ft58.next();\n\n\tjava.lang.Boolean idIfCond_415 = false;\n\tidIfCond_415 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp58.getRecopyInValueTypes(), \"true\");\n\n\tif( idIfCond_415 ) {\n\n\tp_lbdExp58.applyPass2BehaviorJava(context);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tcontext.setCurrent_valueType(null);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_416 = false;\n\tidIfCond_416 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_416 ) {\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft59 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft59.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_417 = false;\n\twhile( !idLoopCond_417 ) {\n\tidLoopCond_417 = it_ft60.isOff();\n\tif ( idLoopCond_417 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp60 = it_ft60.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp59 = o_lbdExp60;\n\n\tp_lbdExp59.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft59.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_418 = false;\n\twhile( !idLoopCond_418 ) {\n\tidLoopCond_418 = it_ft61.isOff();\n\tif ( idLoopCond_418 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp61 = it_ft61.next();\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp59 = o_lbdExp61;\n\n\tp_lbdExp59.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft59.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_419 = false;\n\twhile( !idLoopCond_419 ) {\n\tidLoopCond_419 = it_ft62.isOff();\n\tif ( idLoopCond_419 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp62 = it_ft62.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp59 = o_lbdExp62;\n\n\tp_lbdExp59.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft59.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_420 = false;\n\twhile( !idLoopCond_420 ) {\n\tidLoopCond_420 = it_ft63.isOff();\n\tif ( idLoopCond_420 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp63 = it_ft63.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp59 = i_lbdExp63;\n\n\tp_lbdExp59.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft59.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_421 = false;\n\twhile( !idLoopCond_421 ) {\n\tidLoopCond_421 = it_ft64.isOff();\n\tif ( idLoopCond_421 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp64 = it_ft64.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp59 = t_lbdExp64;\n\n\tp_lbdExp59.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n}\n\n\n\tthis.initEmfNeedProperty(context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_356 = false;\n\twhile( !idLoopCond_356 ) {\n\tidLoopCond_356 = it_ft39.isOff();\n\tif ( idLoopCond_356 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp39 = it_ft39.next();\n\n\tjava.lang.Boolean idIfCond_357 = false;\n\tidIfCond_357 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp39);\n\n\tif( idIfCond_357 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp39, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_358 = false;\n\twhile( !idLoopCond_358 ) {\n\tidLoopCond_358 = it_ft40.isOff();\n\tif ( idLoopCond_358 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp40 = it_ft40.next();\n\n\tresult.add(p_lbdExp40);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterAllOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getOwnedAttribute()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_359 = false;\n\twhile( !idLoopCond_359 ) {\n\tidLoopCond_359 = it_ft41.isOff();\n\tif ( idLoopCond_359 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp41 = it_ft41.next();\n\n\tjava.lang.Boolean idIfCond_360 = false;\n\tidIfCond_360 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp41);\n\n\tif( idIfCond_360 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp41, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_361 = false;\n\twhile( !idLoopCond_361 ) {\n\tidLoopCond_361 = it_ft42.isOff();\n\tif ( idLoopCond_361 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp42 = it_ft42.next();\n\n\tresult.add(p_lbdExp42);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterAllAttribute();

} // ClassDefinition
