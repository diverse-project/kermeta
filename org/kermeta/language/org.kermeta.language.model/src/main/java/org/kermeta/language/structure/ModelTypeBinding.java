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
 * A representation of the model object '<em><b>Model Type Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeBinding#getObjectTypeBindings <em>Object Type Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeBinding()
 * @model abstract="true"
 * @generated
 */
public interface ModelTypeBinding extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Object Type Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ObjectTypeBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeBinding_ObjectTypeBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectTypeBinding> getObjectTypeBindings();

} // ModelTypeBinding
