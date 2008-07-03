/**
 * <copyright>
 * </copyright>
 *
 * $Id: Configuration.java,v 1.1 2008-07-03 15:20:45 ftanguy Exp $
 */
package org.kermeta.kruntimeconfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kruntimeconfiguration.Configuration#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage#getConfiguration_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Configuration
