/**
 * <copyright>
 * </copyright>
 *
 * $Id: KUserStory.java,v 1.1 2007-10-15 16:54:07 fmunoz Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KUser Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.trek.KUserStory#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link org.kermeta.trek.KUserStory#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.trek.KUserStory#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.trek.KUserStory#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.kermeta.trek.KUserStory#getShortSummary <em>Short Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.trek.TrekPackage#getKUserStory()
 * @model
 * @generated
 */
public interface KUserStory extends EObject {
	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.trek.KUseCase}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.trek.KUseCase#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see org.kermeta.trek.TrekPackage#getKUserStory_CoveredBy()
	 * @see org.kermeta.trek.KUseCase#getCovers
	 * @model opposite="covers"
	 * @generated
	 */
	EList<KUseCase> getCoveredBy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.kermeta.trek.TrekPackage#getKUserStory_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUserStory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.kermeta.trek.TrekPackage#getKUserStory_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUserStory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.kermeta.trek.TrekPackage#getKUserStory_Summary()
	 * @model required="true"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUserStory#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see org.kermeta.trek.TrekPackage#getKUserStory_ShortSummary()
	 * @model required="true"
	 * @generated
	 */
	String getShortSummary();

	/**
	 * Sets the value of the '{@link org.kermeta.trek.KUserStory#getShortSummary <em>Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Summary</em>' attribute.
	 * @see #getShortSummary()
	 * @generated
	 */
	void setShortSummary(String value);

} // KUserStory
