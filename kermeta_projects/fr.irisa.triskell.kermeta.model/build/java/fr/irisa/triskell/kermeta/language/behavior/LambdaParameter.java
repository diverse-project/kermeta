/**
 * <copyright>
 * </copyright>
 *
 * $Id: LambdaParameter.java,v 1.4 2006-10-23 15:40:50 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaParameter()
 * @model
 * @generated
 */
public interface LambdaParameter extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaParameter_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaParameter_Type()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // LambdaParameter