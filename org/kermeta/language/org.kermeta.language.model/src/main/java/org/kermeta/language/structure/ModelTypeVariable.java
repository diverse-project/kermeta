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
 * A representation of the model object '<em><b>Model Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To be written
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeVariable()
 * @model
 * @generated
 */
public interface ModelTypeVariable extends TypeVariable {
	/**
	 * Returns the value of the '<em><b>Virtual Type</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.VirtualType}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Type</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeVariable_VirtualType()
	 * @see org.kermeta.language.structure.VirtualType#getModelType
	 * @model opposite="modelType"
	 * @generated
	 */
	EList<VirtualType> getVirtualType();

} // ModelTypeVariable
