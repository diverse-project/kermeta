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
 *   <li>{@link org.kermeta.language.structure.UnresolvedOperation#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedOperation()
 * @model
 * @generated
 */
public interface UnresolvedOperation extends AbstractOperation, Unresolved, TypeContainer {
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
	 * @model dataType="org.kermeta.language.structure.String" required="true"
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
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Type)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedOperation_From()
	 * @model
	 * @generated
	 */
	Type getFrom();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedOperation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Type value);

} // UnresolvedOperation
