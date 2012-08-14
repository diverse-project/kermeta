/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeBinding#getBoundModelType <em>Bound Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeBinding()
 * @model abstract="true"
 * @generated
 */
public interface ModelTypeBinding extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Bound Model Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Model Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Model Type</em>' reference.
	 * @see #setBoundModelType(ModelType)
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeBinding_BoundModelType()
	 * @model required="true"
	 * @generated
	 */
	ModelType getBoundModelType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTypeBinding#getBoundModelType <em>Bound Model Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Model Type</em>' reference.
	 * @see #getBoundModelType()
	 * @generated
	 */
	void setBoundModelType(ModelType value);

} // ModelTypeBinding
