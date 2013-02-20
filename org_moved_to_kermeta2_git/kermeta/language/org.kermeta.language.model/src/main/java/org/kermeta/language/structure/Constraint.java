/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Constraint is part of a contract implementation in a Class definition or an operation.
 * Three kinds of constraints are available : pre, post, and inv (invariant constraint)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Constraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body of the constraint, expressed as a KerMeta expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.language.structure.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the Constraint (precond/postcond/inv)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see org.kermeta.language.structure.ConstraintType
	 * @see #setStereotype(ConstraintType)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_Stereotype()
	 * @model
	 * @generated
	 */
	ConstraintType getStereotype();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see org.kermeta.language.structure.ConstraintType
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.language.structure.ConstraintLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language in which the constraint is expressed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see org.kermeta.language.structure.ConstraintLanguage
	 * @see #setLanguage(ConstraintLanguage)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_Language()
	 * @model
	 * @generated
	 */
	ConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see org.kermeta.language.structure.ConstraintLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ConstraintLanguage value);

	/**
	 * Returns the value of the '<em><b>Inv Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owning ClassDefinition if Constraint corresponds to invariant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inv Owner</em>' container reference.
	 * @see #setInvOwner(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_InvOwner()
	 * @see org.kermeta.language.structure.ClassDefinition#getInv
	 * @model opposite="inv" transient="false"
	 * @generated
	 */
	ClassDefinition getInvOwner();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Owner</em>' container reference.
	 * @see #getInvOwner()
	 * @generated
	 */
	void setInvOwner(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Pre Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Operation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owning Operation if Constraint corresponds to pre-condition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Owner</em>' container reference.
	 * @see #setPreOwner(Operation)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_PreOwner()
	 * @see org.kermeta.language.structure.Operation#getPre
	 * @model opposite="pre" transient="false"
	 * @generated
	 */
	Operation getPreOwner();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Owner</em>' container reference.
	 * @see #getPreOwner()
	 * @generated
	 */
	void setPreOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Post Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Operation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owning Operation if Constraint corresponds to post-condition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Owner</em>' container reference.
	 * @see #setPostOwner(Operation)
	 * @see org.kermeta.language.structure.StructurePackage#getConstraint_PostOwner()
	 * @see org.kermeta.language.structure.Operation#getPost
	 * @model opposite="post" transient="false"
	 * @generated
	 */
	Operation getPostOwner();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Owner</em>' container reference.
	 * @see #getPostOwner()
	 * @generated
	 */
	void setPostOwner(Operation value);

} // Constraint
