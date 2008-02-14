/**
 * <copyright>
 * </copyright>
 *
 * $Id: Object.java,v 1.6 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Object#getTag <em>Tag</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.Object#getOwnedTags <em>Owned Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Tag}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Tag#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getObject_Tag()
	 * @see fr.irisa.triskell.kermeta.language.structure.Tag#getObject
	 * @model opposite="object"
	 *        annotation="GenModel documentation='/**\n * An Object can be tagged by a Tag. \n * They are typically used to put comments/documentation on the object\n \052/'"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Owned Tags</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tags</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getObject_OwnedTags()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * An object can contains a Tag.  \n * Be careful, owning a tag doesn\'t means that the tag applies to the Object\n * To know which Tags apply to the object use the \"tag\" reference\n \052/'"
	 * @generated
	 */
	EList<Tag> getOwnedTags();

} // Object