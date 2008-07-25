/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Object.java,v 1.2 2008-07-25 12:40:10 ftanguy Exp $
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
 *   <li>{@link kermeta.language.structure.Object#getContainer <em>Container</em>}</li>
 *   <li>{@link kermeta.language.structure.Object#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject
{
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
	 * @model containment="true"
	 * @generated
	 */
  EList<Tag> getOwnedTags();

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
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(int)
	 * @see kermeta.language.structure.StructurePackage#getObject_Oid()
	 * @model
	 * @generated
	 */
	int getOid();

		/**
	 * Sets the value of the '{@link kermeta.language.structure.Object#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(int value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * True if the <code>~property</code> of the object has been set\r\n\t \052/'"
	 * @generated
	 */
  boolean isSet(Property property);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Returns the instances of the given property for this Object.\r\n\t *\r\n\t * Example : \r\n\t * <pre>\r\n\t * class A { reference attr : String }\r\n\t * </pre>\r\n\t * Using A :\r\n\t * <pre>\r\n\t * operation getAProp() is do\r\n\t *    var a : A\r\n\t *    var s : String\r\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\r\n\t *    s ?= a.get(the_attr)\r\n\t * end\r\n\t * </pre>\r\n\t * The user has to cast\r\n\t * the result of this method according to the type and the upper multiplicity\r\n\t * of this property. If upper multiplicity > 1, than the effective type of the \r\n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \r\n\t * the name of the given Property (i.e the type of the property instance).\r\n\t \052/'"
	 * @generated
	 */
  Object get(Property property);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\r\n\t \052/'"
	 * @generated
	 */
  boolean isKindOf(kermeta.language.structure.Class cl);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * semantic equality,\r\n\t * if you wish to test for object identity you need to use the method oid\r\n\t * ex: x.oid == y.oid\r\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \r\n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \r\n\t * reference values x and y, this method returns true if and only if x and y refer to the same \r\n\t * object (x.oid == y.oid has the value true). \r\n\t *\r\n\t * note1: the operator == is mapped to this \r\n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\r\n\t \052/'"
	 * @generated
	 */
  boolean equals(Object element);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the Class object that is the metaclass of current Object\r\n\t \052/'"
	 * @generated
	 */
  kermeta.language.structure.Class getMetaClass();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \r\n\t \052/'"
	 * @generated
	 */
  void set(Property property, Object element);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is currently in a\r\n\t * frozen state\r\n\t \052/'"
	 * @generated
	 */
  boolean isFrozen();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Runs checking of invariants defined for the metaclass of the Object\r\n\t \052/'"
	 * @generated
	 */
  void checkInvariants();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * code used in hashtable in order to identify an object in the hashtable keys\r\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\r\n\t * for more information about hashcode\r\n\t \052/'"
	 * @generated
	 */
  int hashcode();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the Object is Void\r\n\t \052/'"
	 * @generated
	 */
  boolean isVoid();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * See kermeta::language::structure::Object.equals(Object)\r\n\t \052/'"
	 * @generated
	 */
  boolean isNotEqual(Object element);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Freeze the Object\r\n\t \052/'"
	 * @generated
	 */
  void freeze();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Integer"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns the unique Oid of the Object\r\n\t \052/'"
	 * @generated
	 */
  int oid();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Remove the element set as the <code>~property</code> of the object.\r\n\t * The <code>isSet(~property)</code> method will then return False\r\n\t \052/'"
	 * @generated
	 */
  void unset(Property property);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Object that contains current Object, void if the Object has\r\n\t * no container\r\n\t \052/'"
	 * @generated
	 */
  Object container();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Returns the Resource currently containing (directly or indirectly) the Object \r\n\t * or void if the object belongs to no Resource\r\n\t \052/'"
	 * @generated
	 */
  Resource containingResource();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/**\r\n\t * Returns a Boolean stating whether the current Object conforms to given Type\r\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \r\n\t \052/'"
	 * @generated
	 */
  boolean isInstanceOf(Type type);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\r\n\t \052/'"
	 * @generated
	 */
  Object asType(kermeta.language.structure.Class type);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\r\n\t * and its supertypes\r\n\t \052/'"
	 * @generated
	 */
  void checkAllInvariants();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n \t * Implements Object.toString()\r\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\r\n \t * the object type, and oid the unique ID of the object\r\n \t \052/'"
	 * @generated
	 */
  String toString();

} // Object
