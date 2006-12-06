/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualTypeContainer.java,v 1.2 2006-12-06 16:22:58 dvojtise Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer#getVirtualType <em>Virtual Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualTypeContainer()
 * @model abstract="true"
 * @generated
 */
public interface VirtualTypeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Type</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.VirtualType}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Type</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getVirtualTypeContainer_VirtualType()
	 * @see fr.irisa.triskell.kermeta.language.structure.VirtualType#getModelType
	 * @model type="fr.irisa.triskell.kermeta.language.structure.VirtualType" opposite="modelType" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList getVirtualType();

} // VirtualTypeContainer