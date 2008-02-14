/**
 * <copyright>
 * </copyright>
 *
 * $Id: Constraint.java,v 1.6 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import fr.irisa.triskell.kermeta.language.behavior.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint()
 * @model annotation="GenModel documentation='/**\n * Constraint is part of a contract implementation in a Class definition or an operation.\n * Three kinds of constraints are available : pre, post, and inv (invariant constraint)\n \052/'"
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_Body()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 *        annotation="GenModel documentation='/**\n * Body of the constraint, expressed as a KerMeta expression\n \052/'"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.irisa.triskell.kermeta.language.structure.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.ConstraintType
	 * @see #setStereotype(ConstraintType)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_Stereotype()
	 * @model annotation="GenModel documentation='/**\n * Type of the Constraint (precond/postcond/inv)\n \052/'"
	 * @generated
	 */
	ConstraintType getStereotype();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.ConstraintType
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage
	 * @see #setLanguage(ConstraintLanguage)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_Language()
	 * @model annotation="GenModel documentation='/**\n * Language in which the constraint is expressed\n \052/'"
	 * @generated
	 */
	ConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ConstraintLanguage value);

	/**
	 * Returns the value of the '<em><b>Inv Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.ClassDefinition#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv Owner</em>' container reference.
	 * @see #setInvOwner(ClassDefinition)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_InvOwner()
	 * @see fr.irisa.triskell.kermeta.language.structure.ClassDefinition#getInv
	 * @model opposite="inv" transient="false"
	 *        annotation="GenModel documentation='/**\n * Owning ClassDefinition if Constraint corresponds to invariant\n \052/'"
	 * @generated
	 */
	ClassDefinition getInvOwner();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getInvOwner <em>Inv Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv Owner</em>' container reference.
	 * @see #getInvOwner()
	 * @generated
	 */
	void setInvOwner(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Pre Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Operation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Owner</em>' container reference.
	 * @see #setPreOwner(Operation)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_PreOwner()
	 * @see fr.irisa.triskell.kermeta.language.structure.Operation#getPre
	 * @model opposite="pre" transient="false"
	 *        annotation="GenModel documentation='/**\n * Owning Operation if Constraint corresponds to pre-condition\n \052/'"
	 * @generated
	 */
	Operation getPreOwner();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getPreOwner <em>Pre Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Owner</em>' container reference.
	 * @see #getPreOwner()
	 * @generated
	 */
	void setPreOwner(Operation value);

	/**
	 * Returns the value of the '<em><b>Post Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Operation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Owner</em>' container reference.
	 * @see #setPostOwner(Operation)
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getConstraint_PostOwner()
	 * @see fr.irisa.triskell.kermeta.language.structure.Operation#getPost
	 * @model opposite="post" transient="false"
	 *        annotation="GenModel documentation='/**\n * Owning Operation if Constraint corresponds to post-condition\n \052/'"
	 * @generated
	 */
	Operation getPostOwner();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.structure.Constraint#getPostOwner <em>Post Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Owner</em>' container reference.
	 * @see #getPostOwner()
	 * @generated
	 */
	void setPostOwner(Operation value);

} // Constraint