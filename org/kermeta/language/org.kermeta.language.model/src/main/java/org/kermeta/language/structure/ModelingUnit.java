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
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
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
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model
 * @generated
 */
public interface ModelingUnit extends TypeDefinitionContainer, org.kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * root packages contained by this ModelingUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.kermeta.language.structure.Package> getPackages();

	/**
	 * Returns the value of the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namespacePrefix is used to capture syntax shortcut for creating NamedElement (ModelDefinition, Package, ClassDefinition, ...) in the ModelingUnit.
	 * The normalization process will replace the namespacePrefix by its equivalent NamedElement for all its declared elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Prefix</em>' attribute.
	 * @see #setNamespacePrefix(String)
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_NamespacePrefix()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getNamespacePrefix();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelingUnit#getNamespacePrefix <em>Namespace Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Prefix</em>' attribute.
	 * @see #getNamespacePrefix()
	 * @generated
	 */
	void setNamespacePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Require}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of "require" statements associated with this ModelingUnit. Ie. list of the other
	 * files required to run this unit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Require> getRequires();

} // ModelingUnit
