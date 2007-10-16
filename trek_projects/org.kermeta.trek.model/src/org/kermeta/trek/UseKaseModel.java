/**
 * <copyright>
 * </copyright>
 *
 * $Id: UseKaseModel.java,v 1.2 2007-10-16 08:20:33 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Kase Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.UseKaseModel#getKuseCases <em>Kuse Cases</em>}</li>
 *   <li>{@link org.kermeta.trek.UseKaseModel#getKtestCases <em>Ktest Cases</em>}</li>
 *   <li>{@link org.kermeta.trek.UseKaseModel#getKtags <em>Ktags</em>}</li>
 *   <li>{@link org.kermeta.trek.UseKaseModel#getKuserStories <em>Kuser Stories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getUseKaseModel()
 * @model
 * @generated
 */
public interface UseKaseModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Kuse Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kuse Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kuse Cases</em>' containment reference list.
	 * @see org.kermeta.trek.TrekPackage#getUseKaseModel_KuseCases()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<KUseCase> getKuseCases();

	/**
	 * Returns the value of the '<em><b>Ktest Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.trek.KTestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ktest Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ktest Cases</em>' containment reference list.
	 * @see org.kermeta.trek.TrekPackage#getUseKaseModel_KtestCases()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<KTestCase> getKtestCases();

	/**
	 * Returns the value of the '<em><b>Ktags</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.trek.KTestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ktags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ktags</em>' containment reference list.
	 * @see org.kermeta.trek.TrekPackage#getUseKaseModel_Ktags()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<KTestCase> getKtags();

	/**
	 * Returns the value of the '<em><b>Kuser Stories</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUserStory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kuser Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kuser Stories</em>' containment reference list.
	 * @see org.kermeta.trek.TrekPackage#getUseKaseModel_KuserStories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<KUserStory> getKuserStories();

} // UseKaseModel
