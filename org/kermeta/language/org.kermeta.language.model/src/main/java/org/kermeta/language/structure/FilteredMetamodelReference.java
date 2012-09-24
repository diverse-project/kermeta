/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Metamodel Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.FilteredMetamodelReference#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getFilteredMetamodelReference()
 * @model
 * @generated
 */
public interface FilteredMetamodelReference extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(AbstractMetamodel)
	 * @see org.kermeta.language.structure.StructurePackage#getFilteredMetamodelReference_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	AbstractMetamodel getMetamodel();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.FilteredMetamodelReference#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(AbstractMetamodel value);

} // FilteredMetamodelReference
