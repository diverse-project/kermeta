/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 *   <li>{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getOperation()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='Every one knows what an operation is.'"
 * @generated
 */
public interface Operation extends MultiplicityElement {
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
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='TypeParameters of the Operation'"
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
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Body of the Operation, expressed as a KerMeta expression'"
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
	 * @model opposite="preOwner" containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Pre-conditions of the Operation'"
	 * @generated
	 */
	EList<Constraint> getPre();

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
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='ClassDefinition owning the Operation'"
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
	 * @model opposite="postOwner" containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Post-conditions of the Operation'"
	 * @generated
	 */
	EList<Constraint> getPost();

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
	 * @see kermeta.language.structure.StructurePackage#getOperation_IsAbstract()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Boolean stating whether the Operation is abstract'"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

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
	 * @model opposite="operation" containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Parameters of the Operation'"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

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
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Exceptions raised by the Operation'"
	 * @generated
	 */
	EList<Type> getRaisedException();

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
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Super-operation of the Operation, if any'"
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

} // Operation
