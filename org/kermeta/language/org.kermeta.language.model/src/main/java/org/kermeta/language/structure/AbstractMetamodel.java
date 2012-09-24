/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Before normalization, for support of concrete syntax, a ModelingUnit can directly own TypeDefinition (ClassDefintion, ModelType, enumeration, ...)
 * However, this suppose that a package is specified in the namespacePrefix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.AbstractMetamodel#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.AbstractMetamodel#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.language.structure.AbstractMetamodel#getReferencedMetamodels <em>Referenced Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getAbstractMetamodel()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMetamodel extends KermetaModelElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * root packages contained by this ModelingUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAbstractMetamodel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namespacePrefix is used to capture syntax shortcut for creating NamedElement (ModelDefinition, Package, ClassDefinition, ...) in the ModelingUnit.
	 * The normalization process will replace the namespacePrefix by its equivalent NamedElement for all its declared elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.kermeta.language.structure.StructurePackage#getAbstractMetamodel_Uri()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.AbstractMetamodel#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.FilteredMetamodelReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Metamodels</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAbstractMetamodel_ReferencedMetamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilteredMetamodelReference> getReferencedMetamodels();

} // AbstractMetamodel
