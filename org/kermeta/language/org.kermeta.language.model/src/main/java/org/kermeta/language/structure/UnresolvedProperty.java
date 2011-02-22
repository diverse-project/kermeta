/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedProperty#getPropertyIdentifier <em>Property Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedProperty()
 * @model
 * @generated
 */
public interface UnresolvedProperty extends AbstractProperty, Unresolved {
	/**
	 * Returns the value of the '<em><b>Property Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the Property.
	 * The container of the UnresolvedProperty  is considered as the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Identifier</em>' attribute.
	 * @see #setPropertyIdentifier(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedProperty_PropertyIdentifier()
	 * @model dataType="org.kermeta.language.structure.String" required="true"
	 * @generated
	 */
	String getPropertyIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedProperty#getPropertyIdentifier <em>Property Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Identifier</em>' attribute.
	 * @see #getPropertyIdentifier()
	 * @generated
	 */
	void setPropertyIdentifier(String value);

} // UnresolvedProperty
