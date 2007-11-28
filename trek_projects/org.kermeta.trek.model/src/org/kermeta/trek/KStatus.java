/**
 * <copyright>
 * </copyright>
 *
 * $Id: KStatus.java,v 1.2 2007-11-28 09:23:46 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KStatus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.KStatus#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.kermeta.trek.KStatus#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getKStatus()
 * @model
 * @generated
 */
public interface KStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.kermeta.trek.TrekPackage#getKStatus_Progress()
	 * @model
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KStatus#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.kermeta.trek.TrekPackage#getKStatus_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KStatus#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // KStatus
