/**
 * <copyright>
 * </copyright>
 *
 * $Id: Persistence.java,v 1.1 2008-07-23 12:37:36 ftanguy Exp $
 */
package org.kermeta.kruntimeconfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kruntimeconfiguration.Persistence#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage#getPersistence()
 * @model
 * @generated
 */
public interface Persistence extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.kruntimeconfiguration.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage#getPersistence_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Persistence
