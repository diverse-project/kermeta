/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PConstraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link patternframework.PConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link patternframework.PConstraint#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see patternframework.PatternframeworkPackage#getPConstraint()
 * @model
 * @generated
 */
public interface PConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see patternframework.PatternframeworkPackage#getPConstraint_Expression()
	 * @model dataType="patternframework.PExpression"
	 *        annotation="kermeta isComposite='true'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link patternframework.PConstraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link patternframework.PConstraintLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see patternframework.PConstraintLanguage
	 * @see #setLanguage(PConstraintLanguage)
	 * @see patternframework.PatternframeworkPackage#getPConstraint_Language()
	 * @model annotation="kermeta isComposite='true'"
	 * @generated
	 */
	PConstraintLanguage getLanguage();

	/**
	 * Sets the value of the '{@link patternframework.PConstraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see patternframework.PConstraintLanguage
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(PConstraintLanguage value);

} // PConstraint
