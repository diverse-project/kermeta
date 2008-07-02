/**
 * <copyright>
 * </copyright>
 *
 * $Id: Constraint.java,v 1.1 2008-07-02 09:43:45 ftanguy Exp $
 */
package kermeta.language.structure;

import kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getConstraint()
 * @model annotation="kermeta documentation='Constraint is part of a contract implementation in a Class definition or an operation.\nThree kinds of constraints are available : pre, post, and inv (invariant constraint)'"
 * @generated
 */
public interface Constraint extends NamedElement {
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
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Body()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="kermeta documentation='Body of the constraint, expressed as a KerMeta expression'"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Pre Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Owner</em>' container reference.
	 * @see #setPreOwner(Operation)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_PreOwner()
	 * @see kermeta.language.structure.Operation#getPre
	 * @model opposite="pre" transient="false"
	 *        annotation="kermeta documentation='Owning Operation if Constraint corresponds to pre-condition'"
	 * @generated
	 */
	Operation getPreOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Owner</em>' container reference.
	 * @see #getPreOwner()
	 * @generated
	 */
	void setPreOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link kermeta.language.structure.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see kermeta.language.structure.ConstraintType
	 * @see #setStereotype(ConstraintType)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Stereotype()
	 * @model annotation="kermeta documentation='Type of the Constraint (precond/postcond/inv)'"
	 * @generated
	 */
	ConstraintType getStereotype();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see kermeta.language.structure.ConstraintType
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Post Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.Operation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Owner</em>' container reference.
	 * @see #setPostOwner(Operation)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_PostOwner()
	 * @see kermeta.language.structure.Operation#getPost
	 * @model opposite="post" transient="false"
	 *        annotation="kermeta documentation='Owning Operation if Constraint corresponds to post-condition'"
	 * @generated
	 */
	Operation getPostOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Owner</em>' container reference.
	 * @see #getPostOwner()
	 * @generated
	 */
	void setPostOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link kermeta.language.structure.ConstraintLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see kermeta.language.structure.ConstraintLanguage
	 * @see #setLanguage(ConstraintLanguage)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_Language()
	 * @model annotation="kermeta documentation='Language in which the constraint is expressed'"
	 * @generated
	 */
	ConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see kermeta.language.structure.ConstraintLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ConstraintLanguage value);

	/**
	 * Returns the value of the '<em><b>Inv Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Owner</em>' container reference.
	 * @see #setInvOwner(ClassDefinition)
	 * @see kermeta.language.structure.StructurePackage#getConstraint_InvOwner()
	 * @see kermeta.language.structure.ClassDefinition#getInv
	 * @model opposite="inv" transient="false"
	 *        annotation="kermeta documentation='Owning ClassDefinition if Constraint corresponds to invariant'"
	 * @generated
	 */
	ClassDefinition getInvOwner();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Owner</em>' container reference.
	 * @see #getInvOwner()
	 * @generated
	 */
	void setInvOwner(ClassDefinition value);

} // Constraint
