/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualTypeContainer.java,v 1.3 2007-07-11 14:41:51 cfaucher Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @model opposite="modelType" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<VirtualType> getVirtualType();

} // VirtualTypeContainer