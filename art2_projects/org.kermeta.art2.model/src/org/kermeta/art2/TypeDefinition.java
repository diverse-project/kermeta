/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getDeployUnit <em>Deploy Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deploy Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Unit</em>' reference.
	 * @see #setDeployUnit(DeployUnit)
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_DeployUnit()
	 * @model required="true"
	 * @generated
	 */
	DeployUnit getDeployUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.TypeDefinition#getDeployUnit <em>Deploy Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Unit</em>' reference.
	 * @see #getDeployUnit()
	 * @generated
	 */
	void setDeployUnit(DeployUnit value);

} // TypeDefinition
