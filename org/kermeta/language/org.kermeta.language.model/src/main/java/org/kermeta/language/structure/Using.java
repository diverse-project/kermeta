/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Using is a part of QualifiedName that can be used to complement the indentifer and resolve a given Unresolved object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Using#getFromQName <em>From QName</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Using#getToName <em>To Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUsing()
 * @model
 * @generated
 */
public interface Using extends org.kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>From QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From QName</em>' attribute.
	 * @see #setFromQName(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUsing_FromQName()
	 * @model dataType="org.kermeta.language.structure.String" required="true"
	 * @generated
	 */
	String getFromQName();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Using#getFromQName <em>From QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From QName</em>' attribute.
	 * @see #getFromQName()
	 * @generated
	 */
	void setFromQName(String value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUsing_ToName()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Using#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

} // Using
