/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelingUnit#getOwnedMetamodels <em>Owned Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit()
 * @model
 * @generated
 */
public interface ModelingUnit extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Owned Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Metamodels</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelingUnit_OwnedMetamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getOwnedMetamodels();

} // ModelingUnit
