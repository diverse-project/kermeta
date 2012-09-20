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
 * A representation of the model object '<em><b>Unresolved Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedMetamodel#getOwnedModelingUnits <em>Owned Modeling Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedMetamodel()
 * @model
 * @generated
 */
public interface UnresolvedMetamodel extends Metamodel {
	/**
	 * Returns the value of the '<em><b>Owned Modeling Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Modeling Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Modeling Units</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedMetamodel_OwnedModelingUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getOwnedModelingUnits();

} // UnresolvedMetamodel
