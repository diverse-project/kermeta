/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedOperation#getOperationIdentifier <em>Operation Identifier</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UnresolvedOperation#getFromClassName <em>From Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedOperation()
 * @model
 * @generated
 */
public interface UnresolvedOperation extends AbstractOperation, Unresolved {
	/**
	 * Returns the value of the '<em><b>Operation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the Operation.
	 * The container of the UnresolvedOperation  is considered as the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Identifier</em>' attribute.
	 * @see #setOperationIdentifier(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedOperation_OperationIdentifier()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getOperationIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedOperation#getOperationIdentifier <em>Operation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Identifier</em>' attribute.
	 * @see #getOperationIdentifier()
	 * @generated
	 */
	void setOperationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>From Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Class Name</em>' attribute.
	 * @see #setFromClassName(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedOperation_FromClassName()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getFromClassName();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedOperation#getFromClassName <em>From Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Class Name</em>' attribute.
	 * @see #getFromClassName()
	 * @generated
	 */
	void setFromClassName(String value);

} // UnresolvedOperation
