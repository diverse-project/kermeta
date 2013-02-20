/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Project Sources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kp.ImportProjectSources#getProjectResource <em>Project Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kp.KpPackage#getImportProjectSources()
 * @model
 * @generated
 */
public interface ImportProjectSources extends EObject {
	/**
   * Returns the value of the '<em><b>Project Resource</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Project Resource</em>' reference.
   * @see #setProjectResource(ReusableResource)
   * @see org.kermeta.kp.KpPackage#getImportProjectSources_ProjectResource()
   * @model required="true"
   * @generated
   */
	ReusableResource getProjectResource();

	/**
   * Sets the value of the '{@link org.kermeta.kp.ImportProjectSources#getProjectResource <em>Project Resource</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Resource</em>' reference.
   * @see #getProjectResource()
   * @generated
   */
	void setProjectResource(ReusableResource value);

} // ImportProjectSources
