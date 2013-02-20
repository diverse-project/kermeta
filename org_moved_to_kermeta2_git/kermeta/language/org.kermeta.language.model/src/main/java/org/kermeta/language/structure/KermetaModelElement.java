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
 * A representation of the model object '<em><b>Kermeta Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object definition: all entities of Kermeta metamodel explicitly inherit from Object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.KermetaModelElement#getKTag <em>KTag</em>}</li>
 *   <li>{@link org.kermeta.language.structure.KermetaModelElement#getKOwnedTags <em>KOwned Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getKermetaModelElement()
 * @model abstract="true"
 * @generated
 */
public interface KermetaModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>KTag</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Tag}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Object can be tagged by a Tag. 
	 * They are typically used to put comments/documentation on the object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KTag</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getKermetaModelElement_KTag()
	 * @see org.kermeta.language.structure.Tag#getObject
	 * @model opposite="object"
	 * @generated
	 */
	EList<Tag> getKTag();

	/**
	 * Returns the value of the '<em><b>KOwned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object can contains a Tag.  
	 * Be careful, owning a tag doesn't means that the tag applies to the Object
	 * To know which Tags apply to the object use the "tag" reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KOwned Tags</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getKermetaModelElement_KOwnedTags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getKOwnedTags();

} // KermetaModelElement
