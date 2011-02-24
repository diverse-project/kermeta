/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Alias to kermeta::standard::Integer
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Type Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owning TypeContainer, if any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Container</em>' container reference.
	 * @see #setTypeContainer(TypeContainer)
	 * @see org.kermeta.language.structure.StructurePackage#getType_TypeContainer()
	 * @see org.kermeta.language.structure.TypeContainer#getContainedType
	 * @model opposite="containedType" transient="false"
	 * @generated
	 */
	TypeContainer getTypeContainer();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Container</em>' container reference.
	 * @see #getTypeContainer()
	 * @generated
	 */
	void setTypeContainer(TypeContainer value);

} // Type
