/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitLoader.java,v 1.5 2008-04-28 11:50:15 ftanguy Exp $
 */
package org.kermeta.io;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kermeta Unit Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.KermetaUnitLoader#getKermetaUnits <em>Kermeta Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getKermetaUnitLoader()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KermetaUnitLoader extends EObject {
	/**
	 * Returns the value of the '<em><b>Kermeta Units</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.io.KermetaUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kermeta Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kermeta Units</em>' reference list.
	 * @see org.kermeta.io.IoPackage#getKermetaUnitLoader_KermetaUnits()
	 * @model
	 * @generated
	 */
	EList<KermetaUnit> getKermetaUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	KermetaUnit load(String uri);

} // KermetaUnitLoader