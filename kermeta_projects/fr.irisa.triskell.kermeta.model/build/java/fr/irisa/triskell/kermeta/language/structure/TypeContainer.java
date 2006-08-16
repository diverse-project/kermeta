/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeContainer.java,v 1.2 2006-08-16 09:09:06 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeContainer#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeContainer()
 * @model abstract="true"
 * @generated
 */
public interface TypeContainer extends fr.irisa.triskell.kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.Type}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.Type#getTypeContainer <em>Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Type</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeContainer_ContainedType()
	 * @see fr.irisa.triskell.kermeta.language.structure.Type#getTypeContainer
	 * @model type="fr.irisa.triskell.kermeta.language.structure.Type" opposite="typeContainer" containment="true"
	 * @generated
	 */
	EList getContainedType();

} // TypeContainer
