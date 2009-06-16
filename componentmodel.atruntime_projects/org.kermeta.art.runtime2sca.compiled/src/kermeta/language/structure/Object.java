/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

import kermeta.persistence.Resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Object#getTag <em>Tag</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOwnedTags <em>Owned Tags</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOid <em>Oid</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model annotation="kermeta EMF_needProperty='name=oid javaClass=java.lang.Integer'"
 *        annotation="kermeta EMF_needProperty='name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource'"
 *        annotation="kermeta documentation='Object definition: all entities of Kermeta metamodel explicitly inherit from Object'"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_Tag()
	 * @see kermeta.language.structure.Tag#getObject
	 * @model opposite="object"
	 *        annotation="kermeta documentation='An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object'"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getObject_OwnedTags()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='An object can contains a Tag.  \nBe careful, owning a tag doesn\'t means that the tag applies to the Object\nTo know which Tags apply to the object use the \"tag\" reference'"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(Integer)
	 * @see kermeta.language.structure.StructurePackage#getObject_Oid()
	 * @model dataType="kermeta.language.structure.KermetaProperty_Object_oid"
	 * @generated
	 */
	Integer getOid();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(Integer value);

	/**
	 * Returns the value of the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Containing Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #setInternalContainingResource(Resource)
	 * @see kermeta.language.structure.StructurePackage#getObject_InternalContainingResource()
	 * @model
	 * @generated
	 */
	Resource getInternalContainingResource();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getInternalContainingResource <em>Internal Containing Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Containing Resource</em>' reference.
	 * @see #getInternalContainingResource()
	 * @generated
	 */
	void setInternalContainingResource(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is Void\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object conforms to given Type\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, type.getClass().getName()), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the Object that contains current Object, void if the Object has\n\t * no container\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Object container();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * semantic equality,\n\t * if you wish to test for object identity you need to use the method oid\n\t * ex: x.oid == y.oid\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \n\t * reference values x and y, this method returns true if and only if x and y refer to the same \n\t * object (x.oid == y.oid has the value true). \n\t *\n\t * note1: the operator == is mapped to this \n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta WrapperValueTypeSelfExpression='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_225 = false;\n\tidIfCond_225 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, type);\n\n\tif( idIfCond_225 ) {\n\n\tresult = this;\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getTypeCastError())) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object asType(kermeta.language.structure.Class type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\n\t * Returns the Class object that is the metaclass of current Object\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tresult = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass( this ), \"kermeta.language.structure.Class\");\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * See kermeta::language::structure::Object.equals(Object)\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this, element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEqual(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this), cl);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKindOf(kermeta.language.structure.Class cl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns the unique Oid of the Object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getOID(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer oid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n \t * Implements Object.toString()\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\n \t * the object type, and oid the unique ID of the object\n \t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"[\", org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition().qualifiedName()), \":\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oidSwitcher(this))), \"]\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\n\t * True if the <code>~property</code> of the object has been set\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isSet(this, property), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSet(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Returns the instances of the given property for this Object.\n\t *\n\t * Example : \n\t * <pre>\n\t * class A { reference attr : String }\n\t * </pre>\n\t * Using A :\n\t * <pre>\n\t * operation getAProp() is do\n\t *    var a : A\n\t *    var s : String\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\n\t *    s ?= a.get(the_attr)\n\t * end\n\t * </pre>\n\t * The user has to cast\n\t * the result of this method according to the type and the upper multiplicity\n\t * of this property. If upper multiplicity > 1, than the effective type of the \n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \n\t * the name of the given Property (i.e the type of the property instance).\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Object get(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_226 = false;\n\tidIfCond_226 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(element, property.getType());\n\n\tif( idIfCond_226 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, element);\n}\n else {\n\n\tkermeta.language.structure.EnumerationLiteral v = null;\n\n\tv = (kermeta.language.structure.EnumerationLiteral) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(element, \"kermeta.language.structure.EnumerationLiteral\");\n\n\tjava.lang.Boolean idIfCond_227 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft48 = null;\n\n\tjava.lang.Boolean idIfCond_228 = false;\n\tidIfCond_228 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(v, null);\n\n\tif( idIfCond_228 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object e_lbdExp48 = null;\n\n\tresult_ft48 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(property.getType(), v.getEnumeration());\n//EIle:right\n\n}\n else {\n\n\tresult_ft48 = false;\n}\n\n\n//CEC\nidIfCond_227 = result_ft48;\n//EIft:andThen\n\n\n\tif( idIfCond_227 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, v);\n}\n else {\n\n\tkermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getIncompatibleTypeError()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"IncompatibleTypeError : Cannot set property \", property.getName()), \" of object \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)), \" to \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(element)), \".\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n'"
	 * @generated
	 */
	void set(Property property, Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Returns a Boolean stating whether the Object is currently in a\n\t * frozen state\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.isFrozen(this), \"java.lang.Boolean\");\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFrozen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Runs checking of invariants defined for the metaclass of the Object\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterClassDefinition();\n\n\tjava.lang.Boolean idIfCond_229 = false;\n\tidIfCond_229 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(cd));\n\n\tif( idIfCond_229 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft49 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_230 = false;\n\twhile( !idLoopCond_230 ) {\n\tidLoopCond_230 = it_ft49.isOff();\n\tif ( idLoopCond_230 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property p_lbdExp49 = it_ft49.next();\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft50 = null;\n\n\tjava.lang.Boolean test_ft50 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft50 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Tag>convertAsOrderedSet(p_lbdExp49.getTag()).iterator();\n\tjava.lang.Boolean idLoopCond_232 = false;\n\twhile( !idLoopCond_232 ) {\n\tidLoopCond_232 = kermeta.standard.helper.BooleanWrapper.or(it_ft50.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft50, false));\n\tif ( idLoopCond_232 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft50 = null;\n//BIle:func\nkermeta.language.structure.Tag t_lbdExp50 = it_ft50.next();\n\n\tresult_lambda_ft50 = kermeta.standard.helper.StringWrapper.equals(t_lbdExp50.getName(), \"ecore.isTransient\");\n//EIle:func\n\n\ttest_ft50 = kermeta.standard.helper.BooleanWrapper.or(test_ft50, result_lambda_ft50);\n}\n\t}\n}\n\n\n\tresult_ft50 = test_ft50;\n//EIft:exists\njava.lang.Boolean idIfCond_231 = false;\n\tidIfCond_231 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(result_ft50), kermeta.standard.helper.BooleanWrapper.not(p_lbdExp49.getIsDerived()));\n\n\tif( idIfCond_231 ) {\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, p_lbdExp49);\n\n\tjava.lang.Boolean idIfCond_233 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft51 = null;\n\n\tjava.lang.Boolean idIfCond_234 = false;\n\tidIfCond_234 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_234 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object f_lbdExp51 = null;\n\n\tresult_ft51 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\"));\n//EIle:right\n\n}\n else {\n\n\tresult_ft51 = false;\n}\n\n\n//CEC\nidIfCond_233 = result_ft51;\n//EIft:andThen\n\n\n\tif( idIfCond_233 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_235 = false;\n\tidIfCond_235 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(p_lbdExp49.getUpper(), org.kermeta.compil.runtime.helper.language.ObjectUtil.convertAsObject(kermeta.standard.helper.IntegerWrapper.uminus(1))), kermeta.standard.helper.IntegerWrapper.isGreater(c.size(), p_lbdExp49.getUpper()));\n\n\tif( idIfCond_235 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp49.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_236 = false;\n\tidIfCond_236 = kermeta.standard.helper.IntegerWrapper.isLower(c.size(), p_lbdExp49.getLower());\n\n\tif( idIfCond_236 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp49.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_237 = false;\n\tidIfCond_237 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(p_lbdExp49.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(v));\n\n\tif( idIfCond_237 ) {\n\n\tkermeta.exceptions.ConstraintViolatedInv e = ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getConstraintViolatedInv()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"Inv lower bound of \", cd.getName()), \".\"), p_lbdExp49.getName()), \" violated on \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toStringSwitcher(this)));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n'"
	 * @generated
	 */
	void checkInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\n\t * code used in hashtable in order to identify an object in the hashtable keys\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\n\t * for more information about hashcode\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.hashcode(this), \"java.lang.Integer\");\n\nreturn result;\n'"
	 * @generated
	 */
	Integer hashcode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Remove the element set as the <code>~property</code> of the object.\n\t * The <code>isSet(~property)</code> method will then return False\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this, property);\n'"
	 * @generated
	 */
	void unset(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Freeze the Object\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);\n'"
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Returns the Resource currently containing (directly or indirectly) the Object \n\t * or void if the object belongs to no Resource\n\t \052/'"
	 *        annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getContainingResource(this), \"kermeta.persistence.Resource\");\n\nreturn result;\n'"
	 * @generated
	 */
	Resource containingResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta RecopyInValueTypes='true'"
	 *        annotation="kermeta documentation='/**\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\n\t * and its supertypes\n\t * Ignores derived attributes. \n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_238 = false;\n\tidIfCond_238 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this, null);\n\n\tif( idIfCond_238 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariantsSwitcher(this);\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft52 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getterAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_239 = false;\n\twhile( !idLoopCond_239 ) {\n\tidLoopCond_239 = it_ft52.isOff();\n\tif ( idLoopCond_239 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Property prop_lbdExp52 = it_ft52.next();\n\n\tjava.lang.Boolean idIfCond_240 = false;\n\tidIfCond_240 = kermeta.standard.helper.BooleanWrapper.and(prop_lbdExp52.getIsComposite(), kermeta.standard.helper.BooleanWrapper.not(prop_lbdExp52.getIsDerived()));\n\n\tif( idIfCond_240 ) {\n\n\tjava.lang.Boolean idIfCond_241 = false;\n\tidIfCond_241 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp52)));\n\n\tif( idIfCond_241 ) {\n\n\tjava.lang.Boolean idIfCond_242 = false;\n//BIft:exists\n\njava.lang.Boolean result_ft53 = null;\n\n\tjava.lang.Boolean test_ft53 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Type> it_ft53 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp52)).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ClassDefinition\"))).allSuperTypes().iterator();\n\tjava.lang.Boolean idLoopCond_243 = false;\n\twhile( !idLoopCond_243 ) {\n\tidLoopCond_243 = kermeta.standard.helper.BooleanWrapper.or(it_ft53.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft53, false));\n\tif ( idLoopCond_243 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft53 = null;\n//BIle:func\nkermeta.language.structure.Type t_lbdExp53 = it_ft53.next();\n\n\tjava.lang.Boolean idIfCond_244 = false;\n\tidIfCond_244 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(t_lbdExp53, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"));\n\n\tif( idIfCond_244 ) {\n\n\tresult_lambda_ft53 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(t_lbdExp53, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.ParameterizedType\"))).getTypeDefinition().qualifiedName(), \"kermeta::standard::Collection\");\n}\n else {\n\n\tresult_lambda_ft53 = false;\n}\n\n//EIle:func\n\n\ttest_ft53 = kermeta.standard.helper.BooleanWrapper.or(test_ft53, result_lambda_ft53);\n}\n\t}\n}\n\n\n\tresult_ft53 = test_ft53;\n\n//CEC\nidIfCond_242 = result_ft53;\n//EIft:exists\n\n\n\tif( idIfCond_242 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp52), \"kermeta.standard.Collection<kermeta.language.structure.Object>\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft54 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_245 = false;\n\twhile( !idLoopCond_245 ) {\n\tidLoopCond_245 = it_ft54.isOff();\n\tif ( idLoopCond_245 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Object aSubObjInstances_lbdExp54 = it_ft54.next();\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(aSubObjInstances_lbdExp54);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariantsSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.getSwitcher(this, prop_lbdExp52));\n}\n\n}\n\n}\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void checkAllInvariants();

} // Object
