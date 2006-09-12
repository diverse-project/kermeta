/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDecl.java,v 1.2 2006-09-12 12:59:22 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends Expression {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Initialization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Identifier()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getVariableDecl_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.VariableDecl#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // VariableDecl