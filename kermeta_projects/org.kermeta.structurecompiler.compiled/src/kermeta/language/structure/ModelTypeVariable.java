/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ModelTypeVariable.java,v 1.12 2009-02-23 15:26:48 cfaucher Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getModelTypeVariable()
 * @model annotation="kermeta documentation='To be written'"
 * @generated
 */
public interface ModelTypeVariable extends TypeVariable {
	/**
	 * Returns the value of the '<em><b>Virtual Type</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.VirtualType}.
	 * It is bidirectional and its opposite is '{@link kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Type</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getModelTypeVariable_VirtualType()
	 * @see kermeta.language.structure.VirtualType#getModelType
	 * @model opposite="modelType" containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='To be written'"
	 * @generated
	 */
	EList<VirtualType> getVirtualType();

} // ModelTypeVariable
