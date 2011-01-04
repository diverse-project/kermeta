/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.Unresolved;
import org.kermeta.language.structure.Using;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any callable expression that is not yet resolved due to ambiguity in the surface syntax.
 * Possible expression will be
 *   - CallVariable
 *   - CallOperation
 *   - CallSuperOperation
 *   - CallProperty
 *   - CallResult
 *   - CallValue
 * additionnaly this can be a call to a TypeLiteral.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.UnresolvedCall#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.UnresolvedCall#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.UnresolvedCall#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.UnresolvedCall#getTargetParent <em>Target Parent</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.UnresolvedCall#getGenerics <em>Generics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall()
 * @model
 * @generated
 */
public interface UnresolvedCall extends Unresolved, CallExpression, TypeContainer {
	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Using that can be used to complement the indentifer and resolve this call in the case of TypeLiteral and EnumLiteral
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall_Usings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Expression (the owner of the feature)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.UnresolvedCall#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether this CallFeature represents a call to @pre in a postcondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(Boolean)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall_IsAtpre()
	 * @model dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.UnresolvedCall#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

	/**
	 * Returns the value of the '<em><b>Target Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of a pointed parent, the Call will infer the feature from the parent instead of infering from self.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Parent</em>' reference.
	 * @see #setTargetParent(Type)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall_TargetParent()
	 * @model
	 * @generated
	 */
	Type getTargetParent();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.UnresolvedCall#getTargetParent <em>Target Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parent</em>' reference.
	 * @see #getTargetParent()
	 * @generated
	 */
	void setTargetParent(Type value);

	/**
	 * Returns the value of the '<em><b>Generics</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics</em>' containment reference list.
	 * @see org.kermeta.language.behavior.BehaviorPackage#getUnresolvedCall_Generics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getGenerics();

} // UnresolvedCall
