/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinition.java,v 1.9 2008-11-27 15:50:01 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_267 = false;\n\tidIfCond_267 = kermeta.standard.helper.BooleanWrapper.or(this.isCollection(), this.isIterator());\n\n\tif( idIfCond_267 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isMappedToJavaRawType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setSubClassDefinitionToSuperTypes();\n\n\tkermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\")));\n\n\tjava.lang.Boolean idIfCond_268 = false;\n\tidIfCond_268 = this.isValueType();\n\n\tif( idIfCond_268 ) {\n\n\tjava.lang.String instanceClassName = this.getEMFInstanceClassName();\n\n\tjava.lang.Boolean idIfCond_269 = false;\n\tidIfCond_269 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(instanceClassName, \"\");\n\n\tif( idIfCond_269 ) {\n\n\tecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\teDataType.setName(kermeta.standard.helper.StringWrapper.plus(\"Java\", this.getName()));\n\n\teDataType.setInstanceClassName(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getValueTypeMapping()).add(instanceClassName);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eDataType);\n\n\tthis.setEcoreDataType(eDataType);\n\n\tjava.lang.Boolean idIfCond_270 = false;\n\tidIfCond_270 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_270 ) {\n\n\tecore.EClass eClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EClass\"));\n\n\teClass.setName(this.getName());\n\n\tthis.setEcoreModelElement(eClass);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(eClass);\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_271 = false;\n\tidIfCond_271 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());\n\n\tif( idIfCond_271 ) {\n\n\tkm2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException\"));\n\n\texcept.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"The class definition: \", this.qualifiedName()), \" is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load.\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( except );\n\n}\n\n}\n\n}\n else {\n\n\tecore.EClass ecoreClass = this.createEcoreModelElement(context);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreClass);\n\n\tthis.setEcoreModelElement(ecoreClass);\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft86 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft86.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_272 = false;\n\twhile( !idLoopCond_272 ) {\n\tidLoopCond_272 = it_ft87.isOff();\n\tif ( idLoopCond_272 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp87 = it_ft87.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp86 = o_lbdExp87;\n\n\tjava.lang.Boolean idIfCond_273 = false;\n\tidIfCond_273 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_273 ) {\n\n\to_lbdExp86.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_274 = false;\n\tidIfCond_274 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_274 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft86.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_275 = false;\n\twhile( !idLoopCond_275 ) {\n\tidLoopCond_275 = it_ft88.isOff();\n\tif ( idLoopCond_275 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp88 = it_ft88.next();\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp86 = o_lbdExp88;\n\n\tjava.lang.Boolean idIfCond_276 = false;\n\tidIfCond_276 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_276 ) {\n\n\to_lbdExp86.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_277 = false;\n\tidIfCond_277 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_277 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft86.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_278 = false;\n\twhile( !idLoopCond_278 ) {\n\tidLoopCond_278 = it_ft89.isOff();\n\tif ( idLoopCond_278 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp89 = it_ft89.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp86 = o_lbdExp89;\n\n\tjava.lang.Boolean idIfCond_279 = false;\n\tidIfCond_279 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_279 ) {\n\n\to_lbdExp86.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_280 = false;\n\tidIfCond_280 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_280 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft86.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_281 = false;\n\twhile( !idLoopCond_281 ) {\n\tidLoopCond_281 = it_ft90.isOff();\n\tif ( idLoopCond_281 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp90 = it_ft90.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint o_lbdExp86 = i_lbdExp90;\n\n\tjava.lang.Boolean idIfCond_282 = false;\n\tidIfCond_282 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_282 ) {\n\n\to_lbdExp86.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_283 = false;\n\tidIfCond_283 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_283 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft86.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_284 = false;\n\twhile( !idLoopCond_284 ) {\n\tidLoopCond_284 = it_ft91.isOff();\n\tif ( idLoopCond_284 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp91 = it_ft91.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable o_lbdExp86 = t_lbdExp91;\n\n\tjava.lang.Boolean idIfCond_285 = false;\n\tidIfCond_285 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tif( idIfCond_285 ) {\n\n\to_lbdExp86.applyPass1(context);\n}\n else {\n\n\tkermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(o_lbdExp86, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")));\n\n\tjava.lang.Boolean idIfCond_286 = false;\n\tidIfCond_286 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());\n\n\tif( idIfCond_286 ) {\n\n\top.applyPass1(context);\n}\n\n}\n\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n'"
	 * @generated
	 */
	void applyPass1(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<java.lang.String> it_ft92 = this.getEMFNeedProperty().iterator();\n\tjava.lang.Boolean idLoopCond_287 = false;\n\twhile( !idLoopCond_287 ) {\n\tidLoopCond_287 = it_ft92.isOff();\n\tif ( idLoopCond_287 ) {\n\t} else {\n\n\t//BIle:func\njava.lang.String emfNeedProperty_lbdExp92 = it_ft92.next();\n\n\tjava.lang.Boolean idIfCond_288 = false;\n\tidIfCond_288 = kermeta.standard.helper.IntegerWrapper.isGreater(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).size(), 0);\n\n\tif( idIfCond_288 ) {\n\n\tecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAttribute\"));\n\n\tjava.lang.Boolean idIfCond_289 = false;\n\tidIfCond_289 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"javaClass\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"javaClass\"), \"\"));\n\n\tif( idIfCond_289 ) {\n\n\tnewProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EAttribute\"));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EDataType\"));\n\n\tnewProperty_EDataType.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"KermetaProperty_\", this.getName()), \"_\"), kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"name\")));\n\n\tnewProperty_EDataType.setInstanceClassName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"javaClass\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Package\"))).getEcoreModelElement().getEClassifiers()).add(newProperty_EDataType);\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewJavaCollection_EGenericType.setEClassifier(newProperty_EDataType);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_290 = false;\n\tidIfCond_290 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_290 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_291 = false;\n\twhile( !idLoopCond_291 ) {\n\tidLoopCond_291 = it_ft93.isOff();\n\tif ( idLoopCond_291 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp93 = it_ft93.next();\n\n\tecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.ETypeParameter\"));\n\n\tnewEtp.setName(etp_lbdExp93.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(newProperty_EDataType.getETypeParameters()).add(newEtp);\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\teta.setETypeParameter(etp_lbdExp93);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_292 = false;\n\tidIfCond_292 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"classDefinitionQN\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"classDefinitionQN\"), \"\"));\n\n\tif( idIfCond_292 ) {\n\n\tnewProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EReference\"));\n\n\tnewProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"name\"));\n\n\tnewProperty.set_transient(false);\n\n\tecore.EClassifier retrieved_EClassifier = context.getMu().getEClassifierByQualifiedName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty_lbdExp92).getValue(\"classDefinitionQN\"));\n\n\tecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnewJavaCollection_EGenericType.setEClassifier(retrieved_EClassifier);\n\n\tnewProperty.setEGenericType(newJavaCollection_EGenericType);\n\n\tjava.lang.Boolean idIfCond_293 = false;\n\tidIfCond_293 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));\n\n\tif( idIfCond_293 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<ecore.ETypeParameter> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_294 = false;\n\twhile( !idLoopCond_294 ) {\n\tidLoopCond_294 = it_ft94.isOff();\n\tif ( idLoopCond_294 ) {\n\t} else {\n\n\t//BIle:func\necore.ETypeParameter etp_lbdExp94 = it_ft94.next();\n\n\tecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\teta.setETypeParameter(etp_lbdExp94);\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n}\n else {\n\n\tnewProperty.set_transient(true);\n\n\tkermeta.language.structure.TypeDefinition retrievedTypeDef = context.getMu().getTypeDefinitionByQualifiedName(\"ecore::EEList\");\n\n\tjava.lang.Boolean idIfCond_295 = false;\n\tidIfCond_295 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_295 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_296 = false;\n\tidIfCond_296 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_296 ) {\n\n\tnewProperty.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n\n}\n\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"ecore.EClass\"))).getEStructuralFeatures()).add(newProperty);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
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
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::ValueType\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_297 = false;\n\twhile( !idLoopCond_297 ) {\n\tidLoopCond_297 = it_ft95.isOff();\n\tif ( idLoopCond_297 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp95 = it_ft95.next();\n\n\tjava.lang.Boolean idIfCond_298 = false;\n\tidIfCond_298 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp95, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_298 ) {\n\n\tkermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp95, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_299 = false;\n\tidIfCond_299 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getEcoreModelElement()));\n\n\tif( idIfCond_299 ) {\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(classDefinition.getEcoreModelElement()));\n\n\tif( idIfCond_300 ) {\n\n\tecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tnew_eGenericType.setEClassifier(classDefinition.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getEGenericSuperTypes()).add(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp95, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(new_eGenericType);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp95, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_301 = false;\n\twhile( !idLoopCond_301 ) {\n\tidLoopCond_301 = it_ft96.isOff();\n\tif ( idLoopCond_301 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp96 = it_ft96.next();\n\n\tjava.lang.Boolean idIfCond_302 = false;\n\tidIfCond_302 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp96, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_302 ) {\n\n\tjava.lang.Boolean idIfCond_303 = false;\n\tidIfCond_303 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp96, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_303 ) {\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.ClassDefinition>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp96, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSubClassDefinitions()).add(this);\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setSubClassDefinitionToSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String qName = this.qualifiedName();\n\n\tjava.lang.Boolean idIfCond_304 = false;\n\tidIfCond_304 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::String\"), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Integer\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Boolean\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Character\")), kermeta.standard.helper.StringWrapper.equals(qName, \"kermeta::standard::Real\"));\n\n\tif( idIfCond_304 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isAddedValueType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" superType_qualifiedNameDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Type res = null;\n//BIft:detect\n\nkermeta.language.structure.Type result_ft97 = null;\n\n\tkermeta.language.structure.Type elem_ft97 = null;\n\n\tresult_ft97 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft97 = this.allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_305 = false;\n\twhile( !idLoopCond_305 ) {\n\tidLoopCond_305 = kermeta.standard.helper.BooleanWrapper.or(it_ft97.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(result_ft97, null));\n\tif ( idLoopCond_305 ) {\n\t} else {\n\n\telem_ft97 = it_ft97.next();\n\n\tjava.lang.Boolean idIfCond_306 = false;\n//BIle:detector\nkermeta.language.structure.Type st_lbdExp97 = elem_ft97;\n\n\tidIfCond_306 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(st_lbdExp97, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(st_lbdExp97, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), superType_qualifiedName));\n//EIle:detector\n\n\n\tif( idIfCond_306 ) {\n\n\tresult_ft97 = elem_ft97;\n}\n\n}\n\t}\n}\n\n\n//CE\nres = result_ft97;\n//EIft:detect\n\n\n\tjava.lang.Boolean idIfCond_307 = false;\n\tidIfCond_307 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(res));\n\n\tif( idIfCond_307 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSubTypeOf(String superType_qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Type> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_308 = false;\n\twhile( !idLoopCond_308 ) {\n\tidLoopCond_308 = superClasses.isEmpty();\n\tif ( idLoopCond_308 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\tkermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Type>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft98 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_309 = false;\n\twhile( !idLoopCond_309 ) {\n\tidLoopCond_309 = it_ft98.isOff();\n\tif ( idLoopCond_309 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type s_lbdExp98 = it_ft98.next();\n\n\tjava.lang.Boolean idIfCond_310 = false;\n\tidIfCond_310 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(s_lbdExp98, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_310 ) {\n\n\tjava.lang.Boolean idIfCond_311 = false;\n\tidIfCond_311 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp98, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_311 ) {\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(s_lbdExp98, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).getSuperType()));\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Type> allSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Iterator\");\n\n\tjava.lang.Boolean idIfCond_312 = false;\n\tidIfCond_312 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Iterator\");\n\n\tif( idIfCond_312 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tresult = this.isSubTypeOf(\"kermeta::standard::Collection\");\n\n\tjava.lang.Boolean idIfCond_313 = false;\n\tidIfCond_313 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), \"kermeta::standard::Collection\");\n\n\tif( idIfCond_313 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_314 = false;\n\tidIfCond_314 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_314 ) {\n\n\tthis.setLinks(context);\n}\n else {\n\n\tkermeta.language.structure.ClassDefinition cd_valueType = null;\n\n\tcd_valueType = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(context.getMu().getTypeDefinitionByQualifiedName(\"kermeta::standard::ValueType\"));\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClass>convertAsOrderedSet(this.getEcoreModelElement().getESuperTypes()).add(cd_valueType.getEcoreModelElement());\n}\n\n\n\tjava.lang.Boolean idIfCond_315 = false;\n\tidIfCond_315 = kermeta.standard.helper.BooleanWrapper.and(this.isValueType(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getName(), \"Numeric\"));\n\n\tif( idIfCond_315 ) {\n\n\tcontext.setCurrent_valueType(this);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_316 = false;\n\twhile( !idLoopCond_316 ) {\n\tidLoopCond_316 = it_ft99.isOff();\n\tif ( idLoopCond_316 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation op_lbdExp99 = it_ft99.next();\n\n\top_lbdExp99.applyPass2BehaviorJava(context);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_317 = false;\n\twhile( !idLoopCond_317 ) {\n\tidLoopCond_317 = it_ft100.isOff();\n\tif ( idLoopCond_317 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp100 = it_ft100.next();\n\n\tjava.lang.Boolean idIfCond_318 = false;\n\tidIfCond_318 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp100);\n\n\tif( idIfCond_318 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp100);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_319 = false;\n\twhile( !idLoopCond_319 ) {\n\tidLoopCond_319 = it_ft101.isOff();\n\tif ( idLoopCond_319 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp101 = it_ft101.next();\n\n\tjava.lang.Boolean idIfCond_320 = false;\n\tidIfCond_320 = kermeta.standard.helper.StringWrapper.equals(p_lbdExp101.getRecopyInValueTypes(), \"true\");\n\n\tif( idIfCond_320 ) {\n\n\tp_lbdExp101.applyPass2BehaviorJava(context);\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tcontext.setCurrent_valueType(null);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_321 = false;\n\tidIfCond_321 = kermeta.standard.helper.BooleanWrapper.not(this.isAddedValueType());\n\n\tif( idIfCond_321 ) {\n\n\t//BIft:eachOwnedElement\n\n\tkermeta.language.structure.ClassDefinition cd_ft102 = this;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft103 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(cd_ft102.getOwnedTags()).iterator();\n\tjava.lang.Boolean idLoopCond_322 = false;\n\twhile( !idLoopCond_322 ) {\n\tidLoopCond_322 = it_ft103.isOff();\n\tif ( idLoopCond_322 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Tag o_lbdExp103 = it_ft103.next();\n\n\t//BIle:func\nkermeta.language.structure.Tag p_lbdExp102 = o_lbdExp103;\n\n\tp_lbdExp102.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft104 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cd_ft102.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_323 = false;\n\twhile( !idLoopCond_323 ) {\n\tidLoopCond_323 = it_ft104.isOff();\n\tif ( idLoopCond_323 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property o_lbdExp104 = it_ft104.next();\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp102 = o_lbdExp104;\n\n\tp_lbdExp102.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft105 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cd_ft102.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_324 = false;\n\twhile( !idLoopCond_324 ) {\n\tidLoopCond_324 = it_ft105.isOff();\n\tif ( idLoopCond_324 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp105 = it_ft105.next();\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp102 = o_lbdExp105;\n\n\tp_lbdExp102.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft106 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(cd_ft102.getInv()).iterator();\n\tjava.lang.Boolean idLoopCond_325 = false;\n\twhile( !idLoopCond_325 ) {\n\tidLoopCond_325 = it_ft106.isOff();\n\tif ( idLoopCond_325 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Constraint i_lbdExp106 = it_ft106.next();\n\n\t//BIle:func\nkermeta.language.structure.Constraint p_lbdExp102 = i_lbdExp106;\n\n\tp_lbdExp102.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft107 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(cd_ft102.getTypeParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_326 = false;\n\twhile( !idLoopCond_326 ) {\n\tidLoopCond_326 = it_ft107.isOff();\n\tif ( idLoopCond_326 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable t_lbdExp107 = it_ft107.next();\n\n\t//BIle:func\nkermeta.language.structure.TypeVariable p_lbdExp102 = t_lbdExp107;\n\n\tp_lbdExp102.applyPass2BehaviorJava(context);\n//EIle:func\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n//EIft:eachOwnedElement\n\n}\n\n}\n\n\n\tthis.initEmfNeedProperty(context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Operation> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Operation>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_261 = false;\n\twhile( !idLoopCond_261 ) {\n\tidLoopCond_261 = it_ft82.isOff();\n\tif ( idLoopCond_261 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp82 = it_ft82.next();\n\n\tjava.lang.Boolean idIfCond_262 = false;\n\tidIfCond_262 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp82);\n\n\tif( idIfCond_262 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp82);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getterAllOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_263 = false;\n\twhile( !idLoopCond_263 ) {\n\tidLoopCond_263 = it_ft83.isOff();\n\tif ( idLoopCond_263 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation p_lbdExp83 = it_ft83.next();\n\n\tresult.add(p_lbdExp83);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Operation> getterAllOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tresult = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Property>\"));\n\n\tresult.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getOwnedAttribute()));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft84 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_264 = false;\n\twhile( !idLoopCond_264 ) {\n\tidLoopCond_264 = it_ft84.isOff();\n\tif ( idLoopCond_264 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type t_lbdExp84 = it_ft84.next();\n\n\tjava.lang.Boolean idIfCond_265 = false;\n\tidIfCond_265 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstanceSwitcher(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), t_lbdExp84);\n\n\tif( idIfCond_265 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.Class>asTypeOrVoid(t_lbdExp84);\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(c.getTypeDefinition());\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cDef.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_266 = false;\n\twhile( !idLoopCond_266 ) {\n\tidLoopCond_266 = it_ft85.isOff();\n\tif ( idLoopCond_266 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp85 = it_ft85.next();\n\n\tresult.add(p_lbdExp85);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.convertAsEList(result);\n'"
	 * @generated
	 */
	EList<Property> getterAllAttribute();

} // ClassDefinition
