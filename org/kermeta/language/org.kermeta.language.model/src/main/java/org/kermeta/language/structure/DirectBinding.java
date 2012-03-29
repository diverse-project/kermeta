/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.DirectBinding#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.DirectBinding#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getDirectBinding()
 * @model
 * @generated
 */
public interface DirectBinding extends ObjectTypeBinding {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getDirectBinding_Target()
	 * @model
	 * @generated
	 */
	TypeDefinition getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.DirectBinding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getDirectBinding_Source()
	 * @model
	 * @generated
	 */
	TypeDefinition getSource();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.DirectBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeDefinition value);

} // DirectBinding
