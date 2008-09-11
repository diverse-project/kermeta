/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.2 2008-09-11 12:34:37 cfaucher Exp $
 */
package kermeta.language.structure;

import ecore.EGenericType;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link kermeta.language.structure.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getClass_()
 * @model annotation="kermeta documentation='Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class.'"
 * @generated
 */
public interface Class extends ParameterizedType, Traceability<EGenericType> {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_OwnedOperation()
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the Operations owned by the ClassDefinition of this Class.'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(cDef.getOwnedOperation());\n}'"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_SuperClass()
	 * @model changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the Classes of which the ClassDefinition of this Class inherits.'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Class>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft81 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_267 = false;\n\twhile( !idLoopCond_267 ) {\n\tidLoopCond_267 = it_ft81.isOff();\n\tif ( idLoopCond_267 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp81 = it_ft81.next();\n\n\tjava.lang.Boolean idIfCond_268 = false;\n\tidIfCond_268 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"elem_lbdExp81\"));\n\n\tif( idIfCond_268 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) elem_lbdExp81;\n\n\tsupertypes.add(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"c\"));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Class>\"));\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_269 = false;\n\twhile( !idLoopCond_269 ) {\n\tidLoopCond_269 = it_ft82.isOff();\n\tif ( idLoopCond_269 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Type elem_lbdExp82 = it_ft82.next();\n\n\tjava.lang.Boolean idIfCond_270 = false;\n\tidIfCond_270 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"elem_lbdExp82\"));\n\n\tif( idIfCond_270 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) elem_lbdExp82;\n\n\tsupertypes.add(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"c\"));\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = supertypes;\n}'"
	 * @generated
	 */
	EList<Class> getSuperClass();

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
	 * @see kermeta.language.structure.StructurePackage#getClass_IsAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean" derived="true"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = cDef.getIsAbstract();\n}'"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see kermeta.language.structure.StructurePackage#getClass_Name()
	 * @model dataType="kermeta.standard.JavaString" changeable="false" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the name of the ClassDefinition of this Class'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = this.getTypeDefinition().getName();\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = this.getTypeDefinition().getName();\n}'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Definition</em>' reference.
	 * @see #setClassDefinition(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getClass_ClassDefinition()
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the ClassDefinition for this class\n\t \052/'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n}'"
	 * @generated
	 */
	ClassDefinition getClassDefinition();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#getClassDefinition <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Definition</em>' reference.
	 * @see #getClassDefinition()
	 * @generated
	 */
	void setClassDefinition(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getClass_OwnedAttribute()
	 * @model derived="true" ordered="false"
	 *        annotation="kermeta isReadOnly='true'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tresult = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(cDef.getOwnedAttribute());\n}'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.cloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object clone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Instantiates a new occurence for this Class\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(this.getClass().getName());\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object _new();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
			kermeta.language.structure.Object objectToClone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Property>\"));\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft83 = null;\n\n\tkermeta.language.structure.Property elem_ft83 = null;\n\n\tresult_ft83 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(this.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_271 = false;\n\twhile( !idLoopCond_271 ) {\n\tidLoopCond_271 = it_ft83.isOff();\n\tif ( idLoopCond_271 ) {\n\t} else {\n\n\telem_ft83 = it_ft83.next();\n\n\tjava.lang.Boolean idIfCond_272 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp83 = elem_ft83;\n\n\tidIfCond_272 = p_lbdExp83.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_272 ) {\n\n\tresult_ft83.add(elem_ft83);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft83);\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft84 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_273 = false;\n\twhile( !idLoopCond_273 ) {\n\tidLoopCond_273 = it_ft84.isOff();\n\tif ( idLoopCond_273 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp84 = it_ft84.next();\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft85 = null;\n\n\tkermeta.language.structure.Property elem_ft85 = null;\n\n\tresult_ft85 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(s_lbdExp84.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_274 = false;\n\twhile( !idLoopCond_274 ) {\n\tidLoopCond_274 = it_ft85.isOff();\n\tif ( idLoopCond_274 ) {\n\t} else {\n\n\telem_ft85 = it_ft85.next();\n\n\tjava.lang.Boolean idIfCond_275 = false;\n//BIle:selector\nkermeta.language.structure.Property p_lbdExp85 = elem_ft85;\n\n\tidIfCond_275 = p_lbdExp85.getIsComposite();\n//EIle:selector\n\n\n\tif( idIfCond_275 ) {\n\n\tresult_ft85.add(elem_ft85);\n}\n\n}\n\t}\n}\n\n//EIft:select\nproperties.addAll(result_ft85);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(this.getSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_276 = false;\n\twhile( !idLoopCond_276 ) {\n\tidLoopCond_276 = superClasses.isEmpty();\n\tif ( idLoopCond_276 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft86 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_277 = false;\n\twhile( !idLoopCond_277 ) {\n\tidLoopCond_277 = it_ft86.isOff();\n\tif ( idLoopCond_277 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Class s_lbdExp86 = it_ft86.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(s_lbdExp86.getSuperClass()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Class> allSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ClassUtil.equals(this, other);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(kermeta.language.structure.Object other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);\n'"
	 * @generated
	 */
	void applyPass2(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_278 = false;\n\tidIfCond_278 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_278 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getClassDefinitionAsTyped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_279 = false;\n\twhile( !idLoopCond_279 ) {\n\tidLoopCond_279 = it_ft87.isOff();\n\tif ( idLoopCond_279 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.TypeVariableBinding tpb_lbdExp87 = it_ft87.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_280 = false;\n\tidIfCond_280 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_280 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_281 = false;\n\tidIfCond_281 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_281 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setEcoreModelElement(typeArgument);\n\n\t((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).setLinks(context);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_282 = false;\n\tidIfCond_282 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_282 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_283 = false;\n\tidIfCond_283 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_283 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb_lbdExp87.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_284 = false;\n\tidIfCond_284 = tpb_lbdExp87.getType().isEDataType();\n\n\tif( idIfCond_284 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_285 = false;\n\tidIfCond_285 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_285 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_286 = false;\n\tidIfCond_286 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb_lbdExp87.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"void\"));\n\n\tif( idIfCond_286 ) {\n}\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Returns the String representation of this class. \n\t *  Note : throws an exception if this class has no classDefinition\n\t *  or if the classDefinition is not well constructed.\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.getTypeDefinition().getName();\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2BehaviorJava(this, context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Class
