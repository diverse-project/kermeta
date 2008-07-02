/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Operation.java,v 1.1 2008-07-02 09:13:21 ftanguy Exp $
 */
package kermeta.language.structure;

import kermeta.language.behavior.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Operation#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getOperation()
 * @model annotation="kermeta documentation='Every one knows what an operation is.'"
 * @generated
 */
public interface Operation extends MultiplicityElement
{
  /**
   * Returns the value of the '<em><b>Type Parameter</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.TypeVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameter</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getOperation_TypeParameter()
   * @model
   * @generated
   */
  EList<TypeVariable> getTypeParameter();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see kermeta.language.structure.StructurePackage#getOperation_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Operation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

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
   * @see kermeta.language.structure.StructurePackage#getOperation_IsAbstract()
   * @model dataType="kermeta.standard.Boolean"
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Operation#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Parameter}.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.Parameter#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parameter</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getOperation_OwnedParameter()
   * @see kermeta.language.structure.Parameter#getOperation
   * @model opposite="operation" containment="true"
   * @generated
   */
  EList<Parameter> getOwnedParameter();

  /**
   * Returns the value of the '<em><b>Post</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Constraint}.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getOperation_Post()
   * @see kermeta.language.structure.Constraint#getPostOwner
   * @model opposite="postOwner" containment="true"
   * @generated
   */
  EList<Constraint> getPost();

  /**
   * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
   * The list contents are of type {@link kermeta.language.structure.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raised Exception</em>' reference list.
   * @see kermeta.language.structure.StructurePackage#getOperation_RaisedException()
   * @model
   * @generated
   */
  EList<Type> getRaisedException();

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
   * The list contents are of type {@link kermeta.language.structure.Constraint}.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference list.
   * @see kermeta.language.structure.StructurePackage#getOperation_Pre()
   * @see kermeta.language.structure.Constraint#getPreOwner
   * @model opposite="preOwner" containment="true"
   * @generated
   */
  EList<Constraint> getPre();

  /**
   * Returns the value of the '<em><b>Super Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Operation</em>' reference.
   * @see #setSuperOperation(Operation)
   * @see kermeta.language.structure.StructurePackage#getOperation_SuperOperation()
   * @model
   * @generated
   */
  Operation getSuperOperation();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Operation</em>' reference.
   * @see #getSuperOperation()
   * @generated
   */
  void setSuperOperation(Operation value);

  /**
   * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning Class</em>' container reference.
   * @see #setOwningClass(ClassDefinition)
   * @see kermeta.language.structure.StructurePackage#getOperation_OwningClass()
   * @see kermeta.language.structure.ClassDefinition#getOwnedOperation
   * @model opposite="ownedOperation" transient="false"
   * @generated
   */
  ClassDefinition getOwningClass();

  /**
   * Sets the value of the '{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning Class</em>' container reference.
   * @see #getOwningClass()
   * @generated
   */
  void setOwningClass(ClassDefinition value);

} // Operation
