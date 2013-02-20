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
 * A representation of the model object '<em><b>Generic Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstracts the definition of generic type definitions (i.e. type definitions that
 * can be parameterized), namely, for ClassDefinition and ModelTypeDefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.GenericTypeDefinition#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getGenericTypeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface GenericTypeDefinition extends ModelElementTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type variables defined for the GenericTypeDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Parameter</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getGenericTypeDefinition_TypeParameter()
	 * @model
	 * @generated
	 */
	EList<TypeVariable> getTypeParameter();

} // GenericTypeDefinition
