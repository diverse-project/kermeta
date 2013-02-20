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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is the holder of a set of model elements (Object) that are compatible with the ModelType that has 
 * instantiated this Model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Model#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.KermetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contents of this model...
	 * DVK : must be instance of Objuect not KermetaModelElement
	 * should this be defined in the kermeta.ecore or in the framework only (there is no way to serialize instances of that !?)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModel_Contents()
	 * @model changeable="false"
	 * @generated
	 */
	EList<KermetaModelElement> getContents();

} // Model
