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

} // UnresolvedOperation
