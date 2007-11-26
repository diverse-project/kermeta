/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUseCase.java,v 1.4 2007-11-26 17:04:18 cfaucher Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KUse Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.KUseCase#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getShortSummary <em>Short Summary</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getUse <em>Use</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getCovers <em>Covers</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getLevel <em>Level</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getTags <em>Tags</em>}</li>
 *   <li>{@link org.kermeta.trek.KUseCase#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getKUseCase()
 * @model
 * @generated
 */
public interface KUseCase extends TrekModelElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUseCase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Summary</em>' attribute.
	 * @see #setShortSummary(String)
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_ShortSummary()
	 * @model
	 * @generated
	 */
	String getShortSummary();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUseCase#getShortSummary <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Summary</em>' attribute.
	 * @see #getShortSummary()
	 * @generated
	 */
	void setShortSummary(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Use()
	 * @see org.kermeta.trek.KUseCase#getUsedBy
	 * @model opposite="usedBy"
	 * @generated
	 */
	EList<KUseCase> getUse();

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_UsedBy()
	 * @see org.kermeta.trek.KUseCase#getUse
	 * @model opposite="use"
	 * @generated
	 */
	EList<KUseCase> getUsedBy();

	/**
	 * Returns the value of the '<em><b>Verified By</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KTestCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KTestCase#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified By</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_VerifiedBy()
	 * @see org.kermeta.trek.KTestCase#getVerifies
	 * @model opposite="verifies"
	 * @generated
	 */
	EList<KTestCase> getVerifiedBy();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(KUseCase)
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Refines()
	 * @see org.kermeta.trek.KUseCase#getRefinedBy
	 * @model opposite="refinedBy"
	 * @generated
	 */
	KUseCase getRefines();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUseCase#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(KUseCase value);

	/**
	 * Returns the value of the '<em><b>Refined By</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined By</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_RefinedBy()
	 * @see org.kermeta.trek.KUseCase#getRefines
	 * @model opposite="refines"
	 * @generated
	 */
	EList<KUseCase> getRefinedBy();

	/**
	 * Returns the value of the '<em><b>Covers</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUserStory}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUserStory#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Covers()
	 * @see org.kermeta.trek.KUserStory#getCoveredBy
	 * @model opposite="coveredBy"
	 * @generated
	 */
	EList<KUserStory> getCovers();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.trek.KUseLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.kermeta.trek.KUseLevel
	 * @see #setLevel(KUseLevel)
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Level()
	 * @model required="true"
	 * @generated
	 */
	KUseLevel getLevel();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUseCase#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.kermeta.trek.KUseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(KUseLevel value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KTagElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Tags()
	 * @model
	 * @generated
	 */
	EList<KTagElement> getTags();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.trek.KStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUseCase_Status()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<KStatus> getStatus();

} // KUseCase
