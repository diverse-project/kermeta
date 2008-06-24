/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ClassDefinition.java,v 1.1 2008-06-24 14:23:26 cfaucher Exp $
 */
package kermeta.language.structure;

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
 *   <li>{@link kermeta.language.structure.ClassDefinition#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getAllOperation <em>All Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getAllAttribute <em>All Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.ClassDefinition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getClassDefinition()
 * @model annotation="kermeta documentation='The definition of a class definition :)\n <pre>class A\n{ \n  attribute s : String\n}\n  </pre> is a class definition; in :\n<pre>\nmain() : A is do end\n</pre>\nA is a <b>Class</b> : it corresponds to the <b>use</b> of the class definition of A'"
 * @generated
 */
public interface ClassDefinition extends GenericTypeDefinition, TypeContainer
{
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
   * @model opposite="owningClass" containment="true"
   *        annotation="kermeta documentation='Operations owned by this ClassDefinition.'"
   * @generated
   */
  EList<Operation> getOwnedOperation();

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see kermeta.language.structure.StructurePackage#getClassDefinition_IsAbstract()
   * @model dataType="kermeta.standard.Boolean"
   *        annotation="kermeta documentation='Boolean stating whether the ClassDefinition is abstract (which means that\nno instance can be allocated)'"
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link kermeta.language.structure.ClassDefinition#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

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
   * @model opposite="invOwner" containment="true"
   *        annotation="kermeta documentation='Invariants defined for this ClassDefinition'"
   * @generated
   */
  EList<Constraint> getInv();

  /**
   * Returns the value of the '<em><b>All Operation</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Operation</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Operation</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getClassDefinition_AllOperation()
   * @model derived="true" ordered="false"
   *        annotation="kermeta isReadOnly='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns all the Operations of this ClassDefinition\r\n\t * including the inherited ones\r\n\t \052/'"
   * @generated
   */
  EList<Operation> getAllOperation();

  /**
   * Returns the value of the '<em><b>All Attribute</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Attribute</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Attribute</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getClassDefinition_AllAttribute()
   * @model derived="true" ordered="false"
   *        annotation="kermeta isReadOnly='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Returns all the Attributes, References, derived Properties of this \r\n\t * ClassDefinition including the inherited ones\r\n\t \052/'"
   * @generated
   */
  EList<Property> getAllAttribute();

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
   * @model opposite="owningClass" containment="true"
   *        annotation="kermeta documentation='Attributes, References, and derived Properties owned by this ClassDefinition.'"
   * @generated
   */
  EList<Property> getOwnedAttribute();

} // ClassDefinition
