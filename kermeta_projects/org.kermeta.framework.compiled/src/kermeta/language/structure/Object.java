/**
 * <copyright>
 * </copyright>
 *
 * $Id: Object.java,v 1.2 2008-08-19 13:22:57 cfaucher Exp $
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
 *   <li>{@link kermeta.language.structure.Object#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model annotation="kermeta documentation='Object definition: all entities of Kermeta metamodel explicitly inherit from Object'"
 *        annotation="kermeta EMF_needProperty='name=oid javaClass=java.lang.Integer'"
 *        annotation="kermeta EMF_needProperty='name=container classDefinitionQN=kermeta::language::structure::Object'"
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
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Object)
	 * @see kermeta.language.structure.StructurePackage#getObject_Container()
	 * @model
	 * @generated
	 */
	Object getContainer();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * True if the <code>~property</code> of the object has been set\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.isSet(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isSet(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"cl\"));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isKindOf(kermeta.language.structure.Class cl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Returns the instances of the given property for this Object.\r\n\t *\r\n\t * Example : \r\n\t * <pre>\r\n\t * class A { reference attr : String }\r\n\t * </pre>\r\n\t * Using A :\r\n\t * <pre>\r\n\t * operation getAProp() is do\r\n\t *    var a : A\r\n\t *    var s : String\r\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\r\n\t *    s ?= a.get(the_attr)\r\n\t * end\r\n\t * </pre>\r\n\t * The user has to cast\r\n\t * the result of this method according to the type and the upper multiplicity\r\n\t * of this property. If upper multiplicity > 1, than the effective type of the \r\n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \r\n\t * the name of the given Property (i.e the type of the property instance).\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, property);\n\nreturn result;\n'"
	 * @generated
	 */
	Object get(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * semantic equality,\r\n\t * if you wish to test for object identity you need to use the method oid\r\n\t * ex: x.oid == y.oid\r\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \r\n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \r\n\t * reference values x and y, this method returns true if and only if x and y refer to the same \r\n\t * object (x.oid == y.oid has the value true). \r\n\t *\r\n\t * note1: the operator == is mapped to this \r\n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean equals(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Class object that is the metaclass of current Object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Class result = null;\n\n\tresult = (kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass( this );\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Class getMetaClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_235 = false;\n\tidIfCond_235 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(element, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"property.getType()\"));\n\n\tif( idIfCond_235 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.set(this, property, element);\n}\n else {\n\n\tkermeta.exceptions.IncompatibleTypeError e = ((kermeta.exceptions.IncompatibleTypeError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.IncompatibleTypeError\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"IncompatibleTypeError : Cannot set property \", property.getName()), \" of object \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(this)), \" to \"), org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(element)), \".\"));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n'"
	 * @generated
	 */
	void set(Property property, Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is currently in a\r\n\t * frozen state\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.isFrozen(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFrozen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * code used in hashtable in order to identify an object in the hashtable keys\r\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\r\n\t * for more information about hashcode\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.hashcode(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer hashcode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Runs checking of invariants defined for the metaclass of the Object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.language.structure.ClassDefinition cd = org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).getClassDefinition();\n\n\tjava.lang.Boolean idIfCond_236 = false;\n\tidIfCond_236 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cd));\n\n\tif( idIfCond_236 ) {\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_237 = false;\n\twhile( !idLoopCond_237 ) {\n\tidLoopCond_237 = it_ft38.isOff();;\n\tif ( idLoopCond_237 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Property p = it_ft38.next();\n\n\tkermeta.language.structure.Object v = org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, p);\n\n\tjava.lang.Boolean idIfCond_238 = false;\n\tidIfCond_238 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(v)), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tif( idIfCond_238 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> c = ((kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(v, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.standard.Collection<kermeta.language.structure.Object>\")));\n\n\tjava.lang.Boolean idIfCond_239 = false;\n\tidIfCond_239 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.IntegerWrapper.isLower(c.size(), p.getLower()), kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(p.getUpper(), kermeta.standard.helper.IntegerWrapper.uminus(1)), kermeta.standard.helper.IntegerWrapper.isGreater(c.size(), p.getUpper())));\n\n\tif( idIfCond_239 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ConstraintViolatedInv\")) );\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_240 = false;\n\tidIfCond_240 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.IntegerWrapper.equals(p.getLower(), 1), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(v));\n\n\tif( idIfCond_240 ) {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.ConstraintViolatedInv) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.ConstraintViolatedInv\")) );\n\n}\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n'"
	 * @generated
	 */
	void checkInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is Void\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isVoid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * See kermeta::language::structure::Object.equals(Object)\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(this, element));\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isNotEqual(Object element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Remove the element set as the <code>~property</code> of the object.\r\n\t * The <code>isSet(~property)</code> method will then return False\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.unset(this, property);\n'"
	 * @generated
	 */
	void unset(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the unique Oid of the Object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tresult = (java.lang.Integer) org.kermeta.compil.runtime.helper.language.ObjectUtil.getOID(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Integer oid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Object that contains current Object, void if the Object has\r\n\t * no container\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tresult = org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Object container();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Freeze the Object\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.freeze(this);\n'"
	 * @generated
	 */
	void freeze();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Resource currently containing (directly or indirectly) the Object \r\n\t * or void if the object belongs to no Resource\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.persistence.Resource result = null;\n\n\tresult = (kermeta.persistence.Resource) org.kermeta.compil.runtime.helper.language.ObjectUtil.getContainingResource(this);\n\nreturn result;\n'"
	 * @generated
	 */
	Resource containingResource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object conforms to given Type\r\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, type.getClass().getName());\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isInstanceOf(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\r\n\t \052/'"
	 *        annotation="kermeta WrapperValueTypeReturnType='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="kermeta WrapperValueTypeSelfExpression='java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_241 = false;\n\tidIfCond_241 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"type\"));\n\n\tif( idIfCond_241 ) {\n\n\tresult = this;\n}\n else {\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( ((kermeta.exceptions.TypeCastError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.TypeCastError\")) );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Object asType(kermeta.language.structure.Class type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\r\n\t * and its supertypes\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_242 = false;\n\tidIfCond_242 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this, null);\n\n\tif( idIfCond_242 ) {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkInvariants(this);\n\n\tkermeta.language.structure.ClassDefinition cd = null;\n\n\tcd = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).getTypeDefinition();\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Property> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsSet(cd.getAllAttribute()).iterator();\n\tjava.lang.Boolean idLoopCond_243 = false;\n\twhile( !idLoopCond_243 ) {\n\tidLoopCond_243 = it_ft39.isOff();;\n\tif ( idLoopCond_243 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Property subObj = it_ft39.next();\n\n\tjava.lang.Boolean idIfCond_244 = false;\n\tidIfCond_244 = subObj.getIsComposite();\n\n\tif( idIfCond_244 ) {\n\n\tjava.lang.Boolean idIfCond_245 = false;\n\tidIfCond_245 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, subObj)).getTypeDefinition().getName(), \"ReflectiveSequence\"), kermeta.standard.helper.StringWrapper.equals(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, subObj)).getTypeDefinition().getName(), \"ReflectiveCollection\"));\n\n\tif( idIfCond_245 ) {\n\n\tkermeta.standard.Collection<kermeta.language.structure.Object> subObjInstances = null;\n\n\tsubObjInstances = (kermeta.standard.Collection<kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, subObj);\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Object> it_ft40 = subObjInstances.iterator();\n\tjava.lang.Boolean idLoopCond_246 = false;\n\twhile( !idLoopCond_246 ) {\n\tidLoopCond_246 = it_ft40.isOff();;\n\tif ( idLoopCond_246 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Object aSubObjInstances = it_ft40.next();\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariants(aSubObjInstances);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n else {\n\n\torg.kermeta.compil.runtime.helper.language.ObjectUtil.checkAllInvariants(org.kermeta.compil.runtime.helper.language.ObjectUtil.get(this, subObj));\n}\n\n}\n\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n}\n\n'"
	 * @generated
	 */
	void checkAllInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n \t * Implements Object.toString()\r\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\r\n \t * the object type, and oid the unique ID of the object\r\n \t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"[\", org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClass(this).getTypeDefinition().qualifiedName()), \":\"), kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.language.ObjectUtil.oid(this))), \"]\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

} // Object
