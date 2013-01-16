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
 * A representation of the model object '<em><b>Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getRules <em>Rules</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getOwningModelTypeDefinition <em>Owning Model Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTransformation#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation()
 * @model
 * @generated
 */
public interface ModelTransformation extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelTypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_TypeParameters()
	 * @model
	 * @generated
	 */
	EList<ModelTypeVariable> getTypeParameters();

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
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTransformation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_Rules()
	 * @model derived="true"
	 * @generated
	 */
	EList<Operation> getRules();

	/**
	 * Returns the value of the '<em><b>Owning Model Type Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ModelTypeDefinition#getOwnedTransformations <em>Owned Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model Type Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model Type Definition</em>' container reference.
	 * @see #setOwningModelTypeDefinition(ModelTypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_OwningModelTypeDefinition()
	 * @see org.kermeta.language.structure.ModelTypeDefinition#getOwnedTransformations
	 * @model opposite="ownedTransformations" transient="false"
	 * @generated
	 */
	ModelTypeDefinition getOwningModelTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTransformation#getOwningModelTypeDefinition <em>Owning Model Type Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Model Type Definition</em>' container reference.
	 * @see #getOwningModelTypeDefinition()
	 * @generated
	 */
	void setOwningModelTypeDefinition(ModelTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getModelTransformation_IsAbstract()
	 * @model dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTransformation#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

} // ModelTransformation
