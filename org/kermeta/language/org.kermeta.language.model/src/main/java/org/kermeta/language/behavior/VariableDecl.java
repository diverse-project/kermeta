/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * refers to variable declaration <code>var x : X init a</code>
 * <img alt="" src="http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_var_expressions.png"/>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.kermeta.language.behavior.VariableDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.behavior.BehaviorPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends Expression {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialization expression for the variable
	 * Default value is <code>void</code> ????
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(Expression value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initialization expression for the variable
	 * Default value is <code>void</code> ????
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Identifier()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the declared variable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see org.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.behavior.VariableDecl#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // VariableDecl
