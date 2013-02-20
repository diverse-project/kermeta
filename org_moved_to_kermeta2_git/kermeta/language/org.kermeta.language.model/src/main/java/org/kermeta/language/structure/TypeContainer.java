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
 * A representation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Phantom class : EMF reflexive editors need that any element of a metamodel 
 * has a direct or indirect containment relationship with the root model element of
 * the metamodel. This class resolves this technical requirement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTypeContainer()
 * @model abstract="true"
 * @generated
 */
public interface TypeContainer extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Type</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeContainer_ContainedType()
	 * @see org.kermeta.language.structure.Type#getTypeContainer
	 * @model opposite="typeContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<Type> getContainedType();

} // TypeContainer
