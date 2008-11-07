/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinition.java,v 1.8 2008-11-07 08:53:35 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.ClassDefinition#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getClassDefinition()
 * @model annotation="kermeta documentation='/**\n *\n \052/'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_129 = false;\n\tidIfCond_129 = kermeta.standard.helper.BooleanWrapper.or(this.isCollection(), this.isIterator());\n\n\tif( idIfCond_129 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft56 = this.getEMFNeedProperty().iterator();\n\tjava.lang.Boolean idLoopCond_130 = false;\n\twhile( !idLoopCond_130 ) {\n\tidLoopCond_130 = it_ft56.isOff();\n\tif ( idLoopCond_130 ) {\n\t} else {\n\n\t//BIle:func\njava.lang.String emfNeedProperty_lbdExp56 = it_ft56.next();\n\n\tjava.lang.Boolean idIfCond_131 = false;\n\tidIfCond_131 = kermeta.standard.helper.IntegerWrapper.isGreater(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).size(), 0);\n\n\tif( idIfCond_131 ) {\n\n\tecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAttribute\"));\n\n\tjava.lang.Boolean idIfCond_132 = false;\n\tidIfCond_132 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"javaClass\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"javaClass\"), \"\"));\n\n\tif( idIfCond_132 ) {\n\n\tnewProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAttribute\"));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\tnewProperty_EDataType.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"KermetaProperty_\", this.getName()), \"_\"), kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"name\")));\n\n\tnewProperty_EDataType.setInstanceClassName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"javaClass\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(newProperty_EDataType);\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewJavaCollection_EGenericType.setEClassifier(newProperty_EDataType);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_133 = false;\n\tidIfCond_133 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_133 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_134 = false;\n\twhile( !idLoopCond_134 ) {\n\tidLoopCond_134 = it_ft57.isOff();\n\tif ( idLoopCond_134 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp57 = it_ft57.next();\n\n\tecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.ETypeParameter\"));\n\n\tnewEtp.setName(etp_lbdExp57.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(newProperty_EDataType.getETypeParameters()).add(newEtp);\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\teta.setETypeParameter(etp_lbdExp57);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_135 = false;\n\tidIfCond_135 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"classDefinitionQN\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"classDefinitionQN\"), \"\"));\n\n\tif( idIfCond_135 ) {\n\n\tnewProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EReference\"));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EClassifier retrieved_EClassifier = context.getMu().getEClassifierByQualifiedName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp56).getValue(\"classDefinitionQN\"));\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewJavaCollection_EGenericType.setEClassifier(retrieved_EClassifier);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_136 = false;\n\tidIfCond_136 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_136 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_137 = false;\n\twhile( !idLoopCond_137 ) {\n\tidLoopCond_137 = it_ft58.isOff();\n\tif ( idLoopCond_137 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp58 = it_ft58.next();\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\teta.setETypeParameter(etp_lbdExp58);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tnewProperty.set_transient(true);\n\n\tkermeta.language.structure.TypeDefinition retrievedTypeDef = context.getMu().getTypeDefinitionByQualifiedName(\"ecore::EEList\");\n\n\tjava.lang.Boolean idIfCond_138 = false;\n\tidIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_138 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_139 = false;\n\tidIfCond_139 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_139 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n\n}\n\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEStructuralFeatures()).add(newProperty);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void initEmfNeedProperty(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setSubClassDefinitionToSuperTypes();\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\tjava.lang.Boolean idIfCond_140 = false;\n\tidIfCond_140 = this.isValueType();\n\n\tif( idIfCond_140 ) {\n\n\tjava.lang.String instanceClassName = this.getEMFInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_141 = false;\n\tidIfCond_141 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(instanceClassName, \"\");\n\n\tif( idIfCond_141 ) {\n\n\tecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\teDataType.setName(kermeta.standard.helper.StringWrapper.plus(\"Java\", this.getName()));\n\n\teDataType.setInstanceClassName(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getValueTypeMapping()).add(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eDataType);\n\n\tthis.setEcoreDataType(eDataType);\n\n\tjava.lang.Boolean idIfCond_142 = false;\n\tidIfCond_142 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_142 ) {\n\n\tecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EClass\"));\n\n\teClass.setName(this.getName());\n\n\tthis.setEcoreModelElement(eClass);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(eClass);\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_143 = false;\n\tidIfCond_143 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_143 ) {\n\n\tkm2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException\"));\n\n\texcept.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"The class definition: \", this.qualifiedName()), \" is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load.\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( except );\n\n}\n\n}\n\n}\n else {\n\n\tecore.EClass ecoreClass = this.createEcoreModelElement(context);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreClass);\n\n\tthis.setEcoreModelElement(ecoreClass);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft59 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft59.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_144 = false;\n\twhile( !idLoopCond_144 ) {\n\tidLoopCond_144 = it_ft60.isOff();\n\tif ( idLoopCond_144 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp60 = it_ft60.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp59 = o_lbdExp60;\n\n\tjava.lang.Boolean idIfCond_145 = false;\n\tidIfCond_145 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_145 ) {\n\n\to_lbdExp59.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_146 = false;\n\tidIfCond_146 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_146 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft59.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_147 = false;\n\twhile( !idLoopCond_147 ) {\n\tidLoopCond_147 = it_ft61.isOff();\n\tif ( idLoopCond_147 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp61 = it_ft61.next();\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp59 = o_lbdExp61;\n\n\tjava.lang.Boolean idIfCond_148 = false;\n\tidIfCond_148 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_148 ) {\n\n\to_lbdExp59.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_149 = false;\n\tidIfCond_149 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_149 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft59.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_150 = false;\n\twhile( !idLoopCond_150 ) {\n\tidLoopCond_150 = it_ft62.isOff();\n\tif ( idLoopCond_150 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp62 = it_ft62.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp59 = o_lbdExp62;\n\n\tjava.lang.Boolean idIfCond_151 = false;\n\tidIfCond_151 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_151 ) {\n\n\to_lbdExp59.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_152 = false;\n\tidIfCond_152 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_152 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft63 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft59.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_153 = false;\n\twhile( !idLoopCond_153 ) {\n\tidLoopCond_153 = it_ft63.isOff();\n\tif ( idLoopCond_153 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp63 = it_ft63.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp59 = i_lbdExp63;\n\n\tjava.lang.Boolean idIfCond_154 = false;\n\tidIfCond_154 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_154 ) {\n\n\to_lbdExp59.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_155 = false;\n\tidIfCond_155 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_155 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft59.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_156 = false;\n\twhile( !idLoopCond_156 ) {\n\tidLoopCond_156 = it_ft64.isOff();\n\tif ( idLoopCond_156 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp64 = it_ft64.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp59 = t_lbdExp64;\n\n\tjava.lang.Boolean idIfCond_157 = false;\n\tidIfCond_157 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_157 ) {\n\n\to_lbdExp59.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp59, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_158 = false;\n\tidIfCond_158 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_158 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n'"
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
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::ValueType\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft65 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_159 = false;\n\twhile( !idLoopCond_159 ) {\n\tidLoopCond_159 = it_ft65.isOff();\n\tif ( idLoopCond_159 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp65 = it_ft65.next();\n\n\tjava.lang.Boolean idIfCond_160 = false;\n\tidIfCond_160 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp65, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_160 ) {\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp65, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_161 = false;\n\tidIfCond_161 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement()));\n\n\tif( idIfCond_161 ) {\n\n\tjava.lang.Boolean idIfCond_162 = false;\n\tidIfCond_162 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreModelElement()));\n\n\tif( idIfCond_162 ) {\n\n\tecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnew_eGenericType.setEClassifier(classDefinition.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getEGenericSuperTypes()).add(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp65, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp65, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_163 = false;\n\twhile( !idLoopCond_163 ) {\n\tidLoopCond_163 = it_ft66.isOff();\n\tif ( idLoopCond_163 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp66 = it_ft66.next();\n\n\tjava.lang.Boolean idIfCond_164 = false;\n\tidIfCond_164 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp66, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_164 ) {\n\n\tjava.lang.Boolean idIfCond_165 = false;\n\tidIfCond_165 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp66, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_165 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.ClassDefinition>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp66, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSubClassDefinitions()).add(this);\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setSubClassDefinitionToSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String qName = this.qualifiedName();\n\n\tjava.lang.Boolean idIfCond_166 = false;\n\tidIfCond_166 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::String\"), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Integer\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Boolean\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Character\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Real\"));\n\n\tif( idIfCond_166 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isAddedValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" superType_qualifiedNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type res = null;\n//BIft:detect\n\nkermeta.language.structure.Type result_ft67 = null;\n\n\tkermeta.language.structure.Type elem_ft67 = null;\n\n\tresult_ft67 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft67 = this.allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_167 = false;\n\twhile( !idLoopCond_167 ) {\n\tidLoopCond_167 = kermeta.standard.helper.BooleanWrapper.or(it_ft67.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft67, null));\n\tif ( idLoopCond_167 ) {\n\t} else {\n\n\telem_ft67 = it_ft67.next();\n\n\tjava.lang.Boolean idIfCond_168 = false;\n//BIle:detector\nkermeta.language.structure.Type st_lbdExp67 = elem_ft67;\n\n\tidIfCond_168 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(st_lbdExp67, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(st_lbdExp67, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), superType_qualifiedName));\n//EIle:detector\n\n\n\tif( idIfCond_168 ) {\n\n\tresult_ft67 = elem_ft67;\n}\n\n}\n\t}\n}\n\n\n//CE\nres = result_ft67;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_169 = false;\n\tidIfCond_169 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(res));\n\n\tif( idIfCond_169 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(String superType_qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Type> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_170 = false;\n\twhile( !idLoopCond_170 ) {\n\tidLoopCond_170 = superClasses.isEmpty();\n\tif ( idLoopCond_170 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft68 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_171 = false;\n\twhile( !idLoopCond_171 ) {\n\tidLoopCond_171 = it_ft68.isOff();\n\tif ( idLoopCond_171 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type s_lbdExp68 = it_ft68.next();\n\n\tjava.lang.Boolean idIfCond_172 = false;\n\tidIfCond_172 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(s_lbdExp68, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_172 ) {\n\n\tjava.lang.Boolean idIfCond_173 = false;\n\tidIfCond_173 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp68, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_173 ) {\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp68, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSuperType()));\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Type> allSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Iterator\");\n\n\tjava.lang.Boolean idIfCond_174 = false;\n\tidIfCond_174 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Iterator\");\n\n\tif( idIfCond_174 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Collection\");\n\n\tjava.lang.Boolean idIfCond_175 = false;\n\tidIfCond_175 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Collection\");\n\n\tif( idIfCond_175 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\necore.EClass result = null;\n\n\tecore.EClass ecoreClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EClass\"));\n\n\tecoreClass.set_interface(false);\n\n\tecoreClass.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context));\n\n\tecoreClass.set_abstract(this.getIsAbstract());\n\n\tresult = ecoreClass;\n\nreturn result;\n'"
	 * @generated
	 */
	EClass createEcoreModelElement(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_176 = false;\n\tidIfCond_176 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_176 ) {\n\n\tthis.setLinks(context);\n}\n else {\n\n\tkermeta.language.structure.ClassDefinition cd_valueType = null;\n\n\tcd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(context.getMu().getTypeDefinitionByQualifiedName(\"kermeta::standard::ValueType\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEcoreModelElement().getESuperTypes()).add(cd_valueType.getEcoreModelElement());\n}\n\n\n\tjava.lang.Boolean idIfCond_177 = false;\n\tidIfCond_177 = kermeta.standard.helper.BooleanWrapper.and(this.isValueType(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getName(), \"Numeric\"));\n\n\tif( idIfCond_177 ) {\n\n\tcontext.setCurrent_valueType(this);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft69 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_178 = false;\n\twhile( !idLoopCond_178 ) {\n\tidLoopCond_178 = it_ft69.isOff();\n\tif ( idLoopCond_178 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp69 = it_ft69.next();\n\n\top_lbdExp69.applyPass2BehaviorJava(context);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft70 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_179 = false;\n\twhile( !idLoopCond_179 ) {\n\tidLoopCond_179 = it_ft70.isOff();\n\tif ( idLoopCond_179 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp70 = it_ft70.next();\n\n\tjava.lang.Boolean idIfCond_180 = false;\n\tidIfCond_180 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp70);\n\n\tif( idIfCond_180 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp70);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft71 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_181 = false;\n\twhile( !idLoopCond_181 ) {\n\tidLoopCond_181 = it_ft71.isOff();\n\tif ( idLoopCond_181 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp71 = it_ft71.next();\n\n\tjava.lang.Boolean idIfCond_182 = false;\n\tidIfCond_182 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp71.getRecopyInValueTypes(), \"true\");\n\n\tif( idIfCond_182 ) {\n\n\tp_lbdExp71.applyPass2BehaviorJava(context);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tcontext.setCurrent_valueType(null);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_183 = false;\n\tidIfCond_183 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_183 ) {\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft72 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft73 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft72.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_184 = false;\n\twhile( !idLoopCond_184 ) {\n\tidLoopCond_184 = it_ft73.isOff();\n\tif ( idLoopCond_184 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp73 = it_ft73.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp72 = o_lbdExp73;\n\n\tp_lbdExp72.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft74 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft72.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_185 = false;\n\twhile( !idLoopCond_185 ) {\n\tidLoopCond_185 = it_ft74.isOff();\n\tif ( idLoopCond_185 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp74 = it_ft74.next();\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp72 = o_lbdExp74;\n\n\tp_lbdExp72.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft75 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft72.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_186 = false;\n\twhile( !idLoopCond_186 ) {\n\tidLoopCond_186 = it_ft75.isOff();\n\tif ( idLoopCond_186 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp75 = it_ft75.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp72 = o_lbdExp75;\n\n\tp_lbdExp72.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft76 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft72.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_187 = false;\n\twhile( !idLoopCond_187 ) {\n\tidLoopCond_187 = it_ft76.isOff();\n\tif ( idLoopCond_187 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp76 = it_ft76.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp72 = i_lbdExp76;\n\n\tp_lbdExp72.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft77 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft72.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_188 = false;\n\twhile( !idLoopCond_188 ) {\n\tidLoopCond_188 = it_ft77.isOff();\n\tif ( idLoopCond_188 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp77 = it_ft77.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp72 = t_lbdExp77;\n\n\tp_lbdExp72.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n}\n\n\n\tthis.initEmfNeedProperty(context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Operation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_123 = false;\n\twhile( !idLoopCond_123 ) {\n\tidLoopCond_123 = it_ft52.isOff();\n\tif ( idLoopCond_123 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp52 = it_ft52.next();\n\n\tjava.lang.Boolean idIfCond_124 = false;\n\tidIfCond_124 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp52);\n\n\tif( idIfCond_124 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp52);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_125 = false;\n\twhile( !idLoopCond_125 ) {\n\tidLoopCond_125 = it_ft53.isOff();\n\tif ( idLoopCond_125 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp53 = it_ft53.next();\n\n\tresult.add(p_lbdExp53);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterAllOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Property>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getOwnedAttribute()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_126 = false;\n\twhile( !idLoopCond_126 ) {\n\tidLoopCond_126 = it_ft54.isOff();\n\tif ( idLoopCond_126 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp54 = it_ft54.next();\n\n\tjava.lang.Boolean idIfCond_127 = false;\n\tidIfCond_127 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp54);\n\n\tif( idIfCond_127 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp54);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_128 = false;\n\twhile( !idLoopCond_128 ) {\n\tidLoopCond_128 = it_ft55.isOff();\n\tif ( idLoopCond_128 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp55 = it_ft55.next();\n\n\tresult.add(p_lbdExp55);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterAllAttribute();

} // ClassDefinition
