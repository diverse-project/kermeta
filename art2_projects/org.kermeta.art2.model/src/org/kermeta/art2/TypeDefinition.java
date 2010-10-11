/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getDeployUnit <em>Deploy Unit</em>}</li>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getRequiredLibs <em>Required Libs</em>}</li>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getHashcode <em>Hashcode</em>}</li>
 *   <li>{@link org.kermeta.art2.TypeDefinition#getDictionaryType <em>Dictionary Type</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Bean</em>' attribute.
	 * @see #setFactoryBean(String)
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_FactoryBean()
	 * @model
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.TypeDefinition#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_Bean()
	 * @model
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.TypeDefinition#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

	/**
	 * Returns the value of the '<em><b>Required Libs</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Libs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Libs</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_RequiredLibs()
	 * @model
	 * @generated
	 */
	EList<DeployUnit> getRequiredLibs();

	/**
	 * Returns the value of the '<em><b>Hashcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashcode</em>' attribute.
	 * @see #setHashcode(String)
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_Hashcode()
	 * @model
	 * @generated
	 */
	String getHashcode();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.TypeDefinition#getHashcode <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashcode</em>' attribute.
	 * @see #getHashcode()
	 * @generated
	 */
	void setHashcode(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Type</em>' containment reference.
	 * @see #setDictionaryType(DictionaryType)
	 * @see org.kermeta.art2.Art2Package#getTypeDefinition_DictionaryType()
	 * @model containment="true"
	 * @generated
	 */
	DictionaryType getDictionaryType();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.TypeDefinition#getDictionaryType <em>Dictionary Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Type</em>' containment reference.
	 * @see #getDictionaryType()
	 * @generated
	 */
	void setDictionaryType(DictionaryType value);

} // TypeDefinition
