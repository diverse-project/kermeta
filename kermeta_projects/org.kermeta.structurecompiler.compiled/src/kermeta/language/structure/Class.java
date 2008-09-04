/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.1 2008-09-04 15:40:23 cfaucher Exp $
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
public interface Class extends Traceability<EGenericType>, ParameterizedType {
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
	 * @model derived="true"
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
	 * @model derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the Classes of which the ClassDefinition of this Class inherits.'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Class>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft61 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_163 = false;\n\twhile( !idLoopCond_163 ) {\n\tidLoopCond_163 = it_ft61.isOff();\n\tif ( idLoopCond_163 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Type elem = it_ft61.next();\n\n\tjava.lang.Boolean idIfCond_164 = false;\n\tidIfCond_164 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"elem\"));\n\n\tif( idIfCond_164 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) elem;\n\n\tsupertypes.add(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"c\"));\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tresult = supertypes;\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tkermeta.language.structure.ClassDefinition cDef = null;\n\n\tcDef = (kermeta.language.structure.ClassDefinition) this.getTypeDefinition();\n\n\tkermeta.standard.OrderedSet<kermeta.language.structure.Class> supertypes = ((kermeta.standard.OrderedSet<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.OrderedSet<kermeta.language.structure.Class>\"));\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft62 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(cDef.getSuperType()).iterator();\n\tjava.lang.Boolean idLoopCond_165 = false;\n\twhile( !idLoopCond_165 ) {\n\tidLoopCond_165 = it_ft62.isOff();\n\tif ( idLoopCond_165 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Type elem = it_ft62.next();\n\n\tjava.lang.Boolean idIfCond_166 = false;\n\tidIfCond_166 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"elem\"));\n\n\tif( idIfCond_166 ) {\n\n\tkermeta.language.structure.Class c = null;\n\n\tc = (kermeta.language.structure.Class) elem;\n\n\tsupertypes.add(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"c\"));\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tresult = supertypes;\n}'"
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
	 * @see #setName(String)
	 * @see kermeta.language.structure.StructurePackage#getClass_Name()
	 * @model dataType="kermeta.standard.JavaString" derived="true"
	 *        annotation="kermeta isReadOnly='false'"
	 *        annotation="kermeta documentation='Returns the name of the ClassDefinition of this Class'"
	 *        annotation="kompiledderivedProp.setter body='{\n\n\tresult = this.getTypeDefinition().getName();\n}'"
	 *        annotation="kompiledderivedProp.getter body='{\n\n\tresult = this.getTypeDefinition().getName();\n}'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.deepCloneObject(this, objectToClone);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object deepClone(
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
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Class> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\tsuperClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(this.getSuperClass()));\n\n\tkermeta.standard.Set<kermeta.language.structure.Class> temp = ((kermeta.standard.Set<kermeta.language.structure.Class>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Class>\"));\n\n\t\n\tkermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());\n\tjava.lang.Boolean idLoopCond_167 = false;\n\twhile( !idLoopCond_167 ) {\n\tidLoopCond_167 = superClasses.isEmpty();\n\tif ( idLoopCond_167 ) {\n\t} else {\n\n\tallSuperClasses.addAll(superClasses);\n\n\ttemp.clear();\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft63 = superClasses.iterator();\n\tjava.lang.Boolean idLoopCond_168 = false;\n\twhile( !idLoopCond_168 ) {\n\tidLoopCond_168 = it_ft63.isOff();\n\tif ( idLoopCond_168 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Class s = it_ft63.next();\n\n\ttemp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(s.getSuperClass()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tsuperClasses.clear();\n\n\tsuperClasses.addAll(temp);\n}\n\t}\n\n\tresult = allSuperClasses;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Class> allSuperClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** Never used for the moment \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.standard.Set<kermeta.language.structure.Property> result = null;\n\n\tkermeta.standard.Set<kermeta.language.structure.Property> properties = ((kermeta.standard.Set<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<kermeta.language.structure.Property>\"));\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft64 = null;\n\n\tkermeta.language.structure.Property elem_ft64 = null;\n\n\tresult_ft64 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft64 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(this.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_169 = false;\n\twhile( !idLoopCond_169 ) {\n\tidLoopCond_169 = it_ft64.isOff();\n\tif ( idLoopCond_169 ) {\n\t} else {\n\n\telem_ft64 = it_ft64.next();\n\n\tjava.lang.Boolean idIfCond_170 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Property p = elem_ft64;\n\n\tidIfCond_170 = p.getIsComposite();\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_170 ) {\n\n\tresult_ft64.add(elem_ft64);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nproperties.addAll(result_ft64);\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft65 = this.allSuperClasses().iterator();\n\tjava.lang.Boolean idLoopCond_171 = false;\n\twhile( !idLoopCond_171 ) {\n\tidLoopCond_171 = it_ft65.isOff();\n\tif ( idLoopCond_171 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Class s = it_ft65.next();\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Property> result_ft66 = null;\n\n\tkermeta.language.structure.Property elem_ft66 = null;\n\n\tresult_ft66 = ((kermeta.standard.Sequence<kermeta.language.structure.Property>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Property>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft66 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(s.getOwnedAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_172 = false;\n\twhile( !idLoopCond_172 ) {\n\tidLoopCond_172 = it_ft66.isOff();\n\tif ( idLoopCond_172 ) {\n\t} else {\n\n\telem_ft66 = it_ft66.next();\n\n\tjava.lang.Boolean idIfCond_173 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Property p = elem_ft66;\n\n\tidIfCond_173 = p.getIsComposite();\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_173 ) {\n\n\tresult_ft66.add(elem_ft66);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\nproperties.addAll(result_ft66);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tresult = properties;\n\nreturn result;\n'"
	 * @generated
	 */
	Set<Property> allAttributes();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.ClassDefinition result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_174 = false;\n\tidIfCond_174 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"));\n\n\tif( idIfCond_174 ) {\n\n\tresult = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\")));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	ClassDefinition getClassDefinitionAsTyped();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.TypeVariableBinding> it_ft67 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(this.getTypeParamBinding()).iterator();\n\tjava.lang.Boolean idLoopCond_175 = false;\n\twhile( !idLoopCond_175 ) {\n\tidLoopCond_175 = it_ft67.isOff();\n\tif ( idLoopCond_175 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.TypeVariableBinding tpb = it_ft67.next();\n\n\tecore.EGenericType typeArgument = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"ecore.EGenericType\"));\n\n\tjava.lang.Boolean idIfCond_176 = false;\n\tidIfCond_176 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"));\n\n\tif( idIfCond_176 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_177 = false;\n\tidIfCond_177 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_177 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_178 = false;\n\tidIfCond_178 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\"));\n\n\tif( idIfCond_178 ) {\n\n\tkermeta.language.structure.ObjectTypeVariable otv = ((kermeta.language.structure.ObjectTypeVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ObjectTypeVariable\")));\n\n\ttypeArgument.setETypeParameter(otv.getEcoreModelElement());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_179 = false;\n\tidIfCond_179 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"));\n\n\tif( idIfCond_179 ) {\n\n\tkermeta.language.structure.ClassDefinition cd = tpb.getType().getClassFromPrimitiveType().getClassDefinitionAsTyped();\n\n\tjava.lang.Boolean idIfCond_180 = false;\n\tidIfCond_180 = tpb.getType().isEDataType();\n\n\tif( idIfCond_180 ) {\n\n\ttypeArgument.setEClassifier(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.PrimitiveType\"))).getEcoreModelElement());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_181 = false;\n\tidIfCond_181 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd.getEcoreDataType());\n\n\tif( idIfCond_181 ) {\n\n\ttypeArgument.setEClassifier(cd.getEcoreModelElement());\n}\n else {\n\n\ttypeArgument.setEClassifier(cd.getEcoreDataType());\n}\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getETypeArguments()).add(typeArgument);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_182 = false;\n\tidIfCond_182 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tpb.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"void\"));\n\n\tif( idIfCond_182 ) {\n}\n\n}\n\n}\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void setLinks(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.helper.ObjectSuper.super_applyPass2BehaviorJava(this, context);\n'"
	 * @generated
	 */
	void applyPass2BehaviorJava(KM2EcoreContext context);

} // Class
