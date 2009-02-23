/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ClassDefinition.java,v 1.12 2009-02-23 15:26:47 cfaucher Exp $
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
public interface ClassDefinition extends GenericTypeDefinition, TypeContainer,
		Traceability<EClass> {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_153 = false;\n\tidIfCond_153 = kermeta.standard.helper.BooleanWrapper.or(this.isCollection(), this.isIterator());\n\n\tif( idIfCond_153 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft60 = this.getEMFNeedProperty().iterator();\n\tjava.lang.Boolean idLoopCond_154 = false;\n\twhile( !idLoopCond_154 ) {\n\tidLoopCond_154 = it_ft60.isOff();\n\tif ( idLoopCond_154 ) {\n\t} else {\n\n\t//BIle:func\njava.lang.String emfNeedProperty_lbdExp60 = it_ft60.next();\n\n\tjava.lang.Boolean idIfCond_155 = false;\n\tidIfCond_155 = kermeta.standard.helper.IntegerWrapper.isGreater(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).size(), 0);\n\n\tif( idIfCond_155 ) {\n\n\tecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAttribute()));\n\n\tjava.lang.Boolean idIfCond_156 = false;\n\tidIfCond_156 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"javaClass\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"javaClass\"), \"\"));\n\n\tif( idIfCond_156 ) {\n\n\tnewProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEAttribute()));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\tnewProperty_EDataType.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"KermetaProperty_\", this.getName()), \"_\"), kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"name\")));\n\n\tnewProperty_EDataType.setInstanceClassName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"javaClass\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(newProperty_EDataType);\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnewJavaCollection_EGenericType.setEClassifier(newProperty_EDataType);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_157 = false;\n\tidIfCond_157 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_157 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_158 = false;\n\twhile( !idLoopCond_158 ) {\n\tidLoopCond_158 = it_ft61.isOff();\n\tif ( idLoopCond_158 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp61 = it_ft61.next();\n\n\tecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getETypeParameter()));\n\n\tnewEtp.setName(etp_lbdExp61.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(newProperty_EDataType.getETypeParameters()).add(newEtp);\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\teta.setETypeParameter(etp_lbdExp61);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_159 = false;\n\tidIfCond_159 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"classDefinitionQN\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"classDefinitionQN\"), \"\"));\n\n\tif( idIfCond_159 ) {\n\n\tnewProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEReference()));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EClassifier retrieved_EClassifier = context.getMu().getEClassifierByQualifiedName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp60).getValue(\"classDefinitionQN\"));\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnewJavaCollection_EGenericType.setEClassifier(retrieved_EClassifier);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_160 = false;\n\tidIfCond_160 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_160 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_161 = false;\n\twhile( !idLoopCond_161 ) {\n\tidLoopCond_161 = it_ft62.isOff();\n\tif ( idLoopCond_161 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp62 = it_ft62.next();\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\teta.setETypeParameter(etp_lbdExp62);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tnewProperty.set_transient(true);\n\n\tkermeta.language.structure.TypeDefinition retrievedTypeDef = context.getMu().getTypeDefinitionByQualifiedName(\"ecore::EEList\");\n\n\tjava.lang.Boolean idIfCond_162 = false;\n\tidIfCond_162 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_162 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_163 = false;\n\tidIfCond_163 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_163 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n\n}\n\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEStructuralFeatures()).add(newProperty);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void initEmfNeedProperty(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setSubClassDefinitionToSuperTypes();\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\tjava.lang.Boolean idIfCond_164 = false;\n\tidIfCond_164 = this.isValueType();\n\n\tif( idIfCond_164 ) {\n\n\tjava.lang.String instanceClassName = this.getEMFInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_165 = false;\n\tidIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(instanceClassName, \"\");\n\n\tif( idIfCond_165 ) {\n\n\tecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEDataType()));\n\n\teDataType.setName(kermeta.standard.helper.StringWrapper.plus(\"Java\", this.getName()));\n\n\teDataType.setInstanceClassName(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getValueTypeMapping()).add(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eDataType);\n\n\tthis.setEcoreDataType(eDataType);\n\n\tjava.lang.Boolean idIfCond_166 = false;\n\tidIfCond_166 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_166 ) {\n\n\tecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEClass()));\n\n\teClass.setName(this.getName());\n\n\tthis.setEcoreModelElement(eClass);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(eClass);\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_167 = false;\n\tidIfCond_167 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_167 ) {\n\n\tkm2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.common.exception.ExceptionPackage.eINSTANCE.getUndefinedValueTypeInstanceClassNameException()));\n\n\texcept.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"The class definition: \", this.qualifiedName()), \" is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load.\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( except );\n\n}\n\n}\n\n}\n else {\n\n\tecore.EClass ecoreClass = this.createEcoreModelElement(context);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreClass);\n\n\tthis.setEcoreModelElement(ecoreClass);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft63 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft63.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_168 = false;\n\twhile( !idLoopCond_168 ) {\n\tidLoopCond_168 = it_ft64.isOff();\n\tif ( idLoopCond_168 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp64 = it_ft64.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp63 = o_lbdExp64;\n\n\tjava.lang.Boolean idIfCond_169 = false;\n\tidIfCond_169 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_169 ) {\n\n\to_lbdExp63.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_170 = false;\n\tidIfCond_170 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_170 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft63.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_171 = false;\n\twhile( !idLoopCond_171 ) {\n\tidLoopCond_171 = it_ft65.isOff();\n\tif ( idLoopCond_171 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp65 = it_ft65.next();\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp63 = o_lbdExp65;\n\n\tjava.lang.Boolean idIfCond_172 = false;\n\tidIfCond_172 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_172 ) {\n\n\to_lbdExp63.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_173 = false;\n\tidIfCond_173 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_173 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft63.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_174 = false;\n\twhile( !idLoopCond_174 ) {\n\tidLoopCond_174 = it_ft66.isOff();\n\tif ( idLoopCond_174 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp66 = it_ft66.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp63 = o_lbdExp66;\n\n\tjava.lang.Boolean idIfCond_175 = false;\n\tidIfCond_175 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_175 ) {\n\n\to_lbdExp63.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_176 = false;\n\tidIfCond_176 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_176 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft63.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_177 = false;\n\twhile( !idLoopCond_177 ) {\n\tidLoopCond_177 = it_ft67.isOff();\n\tif ( idLoopCond_177 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp67 = it_ft67.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp63 = i_lbdExp67;\n\n\tjava.lang.Boolean idIfCond_178 = false;\n\tidIfCond_178 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_178 ) {\n\n\to_lbdExp63.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_179 = false;\n\tidIfCond_179 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_179 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft68 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft63.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_180 = false;\n\twhile( !idLoopCond_180 ) {\n\tidLoopCond_180 = it_ft68.isOff();\n\tif ( idLoopCond_180 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp68 = it_ft68.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp63 = t_lbdExp68;\n\n\tjava.lang.Boolean idIfCond_181 = false;\n\tidIfCond_181 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_181 ) {\n\n\to_lbdExp63.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp63, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_182 = false;\n\tidIfCond_182 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_182 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_183 = false;\n\twhile( !idLoopCond_183 ) {\n\tidLoopCond_183 = it_ft69.isOff();\n\tif ( idLoopCond_183 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp69 = it_ft69.next();\n\n\tjava.lang.Boolean idIfCond_184 = false;\n\tidIfCond_184 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_184 ) {\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_185 = false;\n\tidIfCond_185 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement()));\n\n\tif( idIfCond_185 ) {\n\n\tjava.lang.Boolean idIfCond_186 = false;\n\tidIfCond_186 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreModelElement()));\n\n\tif( idIfCond_186 ) {\n\n\tecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(ecore.EcorePackage.eINSTANCE.getEGenericType()));\n\n\tnew_eGenericType.setEClassifier(classDefinition.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getEGenericSuperTypes()).add(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp69, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_187 = false;\n\twhile( !idLoopCond_187 ) {\n\tidLoopCond_187 = it_ft70.isOff();\n\tif ( idLoopCond_187 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp70 = it_ft70.next();\n\n\tjava.lang.Boolean idIfCond_188 = false;\n\tidIfCond_188 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp70, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_188 ) {\n\n\tjava.lang.Boolean idIfCond_189 = false;\n\tidIfCond_189 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp70, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_189 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.ClassDefinition>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp70, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSubClassDefinitions()).add(this);\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setSubClassDefinitionToSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t\t * FIXME CF Should be optimized via the context to avoid the re-creation everytime\r\n\t\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String qName = this.qualifiedName();\n\n\tjava.lang.Boolean idIfCond_190 = false;\n\tidIfCond_190 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::String\"), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Integer\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Boolean\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Character\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Real\"));\n\n\tif( idIfCond_190 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isAddedValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns all the types directly and indirectly inherited by this ClasDefinition \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Type> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_191 = false;\n\twhile( !idLoopCond_191 ) {\n\tidLoopCond_191 = superClasses.isEmpty();\n\tif ( idLoopCond_191 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft71 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_192 = false;\n\twhile( !idLoopCond_192 ) {\n\tidLoopCond_192 = it_ft71.isOff();\n\tif ( idLoopCond_192 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type s_lbdExp71 = it_ft71.next();\n\n\tjava.lang.Boolean idIfCond_193 = false;\n\tidIfCond_193 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(s_lbdExp71, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_193 ) {\n\n\tjava.lang.Boolean idIfCond_194 = false;\n\tidIfCond_194 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp71, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_194 ) {\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp71, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSuperType()));\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Type> allSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" superType_qualifiedNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type res = null;\n//BIft:detect\n\nkermeta.language.structure.Type result_ft72 = null;\n\n\tkermeta.language.structure.Type elem_ft72 = null;\n\n\tresult_ft72 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft72 = this.allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_195 = false;\n\twhile( !idLoopCond_195 ) {\n\tidLoopCond_195 = kermeta.standard.helper.BooleanWrapper.or(it_ft72.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft72, null));\n\tif ( idLoopCond_195 ) {\n\t} else {\n\n\telem_ft72 = it_ft72.next();\n\n\tjava.lang.Boolean idIfCond_196 = false;\n//BIle:detector\nkermeta.language.structure.Type st_lbdExp72 = elem_ft72;\n\n\tidIfCond_196 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(st_lbdExp72, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(st_lbdExp72, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), superType_qualifiedName));\n//EIle:detector\n\n\n\tif( idIfCond_196 ) {\n\n\tresult_ft72 = elem_ft72;\n}\n\n}\n\t}\n}\n\n\n//CE\nres = result_ft72;\n//EIft:detect\n;\n\n\tjava.lang.Boolean idIfCond_197 = false;\n\tidIfCond_197 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(res));\n\n\tif( idIfCond_197 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(String superType_qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Iterator\");\n\n\tjava.lang.Boolean idIfCond_198 = false;\n\tidIfCond_198 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Iterator\");\n\n\tif( idIfCond_198 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Collection\");\n\n\tjava.lang.Boolean idIfCond_199 = false;\n\tidIfCond_199 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Collection\");\n\n\tif( idIfCond_199 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_200 = false;\n\tidIfCond_200 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_200 ) {\n\n\tthis.setLinks(context);\n}\n else {\n\n\tkermeta.language.structure.ClassDefinition cd_valueType = null;\n\n\tcd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(context.getMu().getTypeDefinitionByQualifiedName(\"kermeta::standard::ValueType\"), \"kermeta.language.structure.ClassDefinition\");\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEcoreModelElement().getESuperTypes()).add(cd_valueType.getEcoreModelElement());\n}\n\n\n\tjava.lang.Boolean idIfCond_201 = false;\n\tidIfCond_201 = kermeta.standard.helper.BooleanWrapper.and(this.isValueType(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getName(), \"Numeric\"));\n\n\tif( idIfCond_201 ) {\n\n\tcontext.setCurrent_valueType(this);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_202 = false;\n\twhile( !idLoopCond_202 ) {\n\tidLoopCond_202 = it_ft73.isOff();\n\tif ( idLoopCond_202 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp73 = it_ft73.next();\n\n\top_lbdExp73.applyPass2BehaviorJava(context);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_203 = false;\n\twhile( !idLoopCond_203 ) {\n\tidLoopCond_203 = it_ft74.isOff();\n\tif ( idLoopCond_203 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp74 = it_ft74.next();\n\n\tjava.lang.Boolean idIfCond_204 = false;\n\tidIfCond_204 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp74);\n\n\tif( idIfCond_204 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp74, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_205 = false;\n\twhile( !idLoopCond_205 ) {\n\tidLoopCond_205 = it_ft75.isOff();\n\tif ( idLoopCond_205 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp75 = it_ft75.next();\n\n\tjava.lang.Boolean idIfCond_206 = false;\n\tidIfCond_206 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp75.getRecopyInValueTypes(), \"true\");\n\n\tif( idIfCond_206 ) {\n\n\tp_lbdExp75.applyPass2BehaviorJava(context);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tcontext.setCurrent_valueType(null);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_207 = false;\n\tidIfCond_207 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_207 ) {\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft76 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft76.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_208 = false;\n\twhile( !idLoopCond_208 ) {\n\tidLoopCond_208 = it_ft77.isOff();\n\tif ( idLoopCond_208 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp77 = it_ft77.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp76 = o_lbdExp77;\n\n\tp_lbdExp76.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft78 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft76.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_209 = false;\n\twhile( !idLoopCond_209 ) {\n\tidLoopCond_209 = it_ft78.isOff();\n\tif ( idLoopCond_209 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp78 = it_ft78.next();\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp76 = o_lbdExp78;\n\n\tp_lbdExp76.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft79 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft76.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_210 = false;\n\twhile( !idLoopCond_210 ) {\n\tidLoopCond_210 = it_ft79.isOff();\n\tif ( idLoopCond_210 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp79 = it_ft79.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp76 = o_lbdExp79;\n\n\tp_lbdExp76.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft80 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft76.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_211 = false;\n\twhile( !idLoopCond_211 ) {\n\tidLoopCond_211 = it_ft80.isOff();\n\tif ( idLoopCond_211 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp80 = it_ft80.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp76 = i_lbdExp80;\n\n\tp_lbdExp76.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft76.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_212 = false;\n\twhile( !idLoopCond_212 ) {\n\tidLoopCond_212 = it_ft81.isOff();\n\tif ( idLoopCond_212 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp81 = it_ft81.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp76 = t_lbdExp81;\n\n\tp_lbdExp76.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n}\n\n\n\tthis.initEmfNeedProperty(context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_147 = false;\n\twhile( !idLoopCond_147 ) {\n\tidLoopCond_147 = it_ft56.isOff();\n\tif ( idLoopCond_147 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp56 = it_ft56.next();\n\n\tjava.lang.Boolean idIfCond_148 = false;\n\tidIfCond_148 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp56);\n\n\tif( idIfCond_148 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp56, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_149 = false;\n\twhile( !idLoopCond_149 ) {\n\tidLoopCond_149 = it_ft57.isOff();\n\tif ( idLoopCond_149 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp57 = it_ft57.next();\n\n\tresult.add(p_lbdExp57);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterAllOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSet()));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getOwnedAttribute()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_150 = false;\n\twhile( !idLoopCond_150 ) {\n\tidLoopCond_150 = it_ft58.isOff();\n\tif ( idLoopCond_150 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp58 = it_ft58.next();\n\n\tjava.lang.Boolean idIfCond_151 = false;\n\tidIfCond_151 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp58);\n\n\tif( idIfCond_151 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(t_lbdExp58, \"kermeta.language.structure.Class\");\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(c.getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_152 = false;\n\twhile( !idLoopCond_152 ) {\n\tidLoopCond_152 = it_ft59.isOff();\n\tif ( idLoopCond_152 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp59 = it_ft59.next();\n\n\tresult.add(p_lbdExp59);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterAllAttribute();

} // ClassDefinition
