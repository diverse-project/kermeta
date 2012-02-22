/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Every one knows what an operation is.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getPre <em>Pre</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getPost <em>Post</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getOwnedUnresolvedOperations <em>Owned Unresolved Operations</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Operation#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends MultiplicityElement, AbstractOperation {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the Operation is abstract
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_IsAbstract()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Operation#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions raised by the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_RaisedException()
	 * @model
	 * @generated
	 */
	EList<Type> getRaisedException();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters of the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_OwnedParameter()
	 * @see org.kermeta.language.structure.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre-conditions of the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_Pre()
	 * @see org.kermeta.language.structure.Constraint#getPreOwner
	 * @model opposite="preOwner" containment="true"
	 * @generated
	 */
	EList<Constraint> getPre();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Post-conditions of the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_Post()
	 * @see org.kermeta.language.structure.Constraint#getPostOwner
	 * @model opposite="postOwner" containment="true"
	 * @generated
	 */
	EList<Constraint> getPost();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body of the Operation, expressed as a KerMeta expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Super Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Super-operation of the Operation, if any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Operation</em>' reference.
	 * @see #setSuperOperation(AbstractOperation)
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_SuperOperation()
	 * @model
	 * @generated
	 */
	AbstractOperation getSuperOperation();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Operation#getSuperOperation <em>Super Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Operation</em>' reference.
	 * @see #getSuperOperation()
	 * @generated
	 */
	void setSuperOperation(AbstractOperation value);

	/**
	 * Returns the value of the '<em><b>Owned Unresolved Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.UnresolvedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Unresolved Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Unresolved Operations</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_OwnedUnresolvedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnresolvedOperation> getOwnedUnresolvedOperations();

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ClassDefinition#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClassDefinition owning the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_OwningClass()
	 * @see org.kermeta.language.structure.ClassDefinition#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 * @generated
	 */
	ClassDefinition getOwningClass();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Operation#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TypeParameters of the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Parameter</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_TypeParameter()
	 * @model
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uniqueName of an Operation is a calculated value. It returns a value that will be unique for this Operation
	 * even if the name of the operation itself is shared by several Operation in the context of operation overloading.
	 * Currently, the value is calculated using the number of parameters. (TODO should be more precise but this implies that we really support operation overloading in all kermeta workflow)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see #setUniqueName(String)
	 * @see org.kermeta.language.structure.StructurePackage#getOperation_UniqueName()
	 * @model dataType="org.kermeta.language.structure.String" transient="true" derived="true"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Operation#getUniqueName <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Name</em>' attribute.
	 * @see #getUniqueName()
	 * @generated
	 */
	void setUniqueName(String value);

} // Operation
