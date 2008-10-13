/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompareElement.java,v 1.1 2008-10-13 20:03:35 fmunoz Exp $
 */
package ocompare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ocompare.CompareElement#getOriginalURI <em>Original URI</em>}</li>
 *   <li>{@link ocompare.CompareElement#getResultURI <em>Result URI</em>}</li>
 *   <li>{@link ocompare.CompareElement#getDiffURI <em>Diff URI</em>}</li>
 *   <li>{@link ocompare.CompareElement#getMatchURI <em>Match URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see ocompare.OcomparePackage#getCompareElement()
 * @model
 * @generated
 */
public interface CompareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Original URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original URI</em>' attribute.
	 * @see #setOriginalURI(String)
	 * @see ocompare.OcomparePackage#getCompareElement_OriginalURI()
	 * @model required="true"
	 * @generated
	 */
	String getOriginalURI();

	/**
	 * Sets the value of the '{@link ocompare.CompareElement#getOriginalURI <em>Original URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original URI</em>' attribute.
	 * @see #getOriginalURI()
	 * @generated
	 */
	void setOriginalURI(String value);

	/**
	 * Returns the value of the '<em><b>Result URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result URI</em>' attribute.
	 * @see #setResultURI(String)
	 * @see ocompare.OcomparePackage#getCompareElement_ResultURI()
	 * @model required="true"
	 * @generated
	 */
	String getResultURI();

	/**
	 * Sets the value of the '{@link ocompare.CompareElement#getResultURI <em>Result URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result URI</em>' attribute.
	 * @see #getResultURI()
	 * @generated
	 */
	void setResultURI(String value);

	/**
	 * Returns the value of the '<em><b>Diff URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff URI</em>' attribute.
	 * @see #setDiffURI(String)
	 * @see ocompare.OcomparePackage#getCompareElement_DiffURI()
	 * @model required="true"
	 * @generated
	 */
	String getDiffURI();

	/**
	 * Sets the value of the '{@link ocompare.CompareElement#getDiffURI <em>Diff URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff URI</em>' attribute.
	 * @see #getDiffURI()
	 * @generated
	 */
	void setDiffURI(String value);

	/**
	 * Returns the value of the '<em><b>Match URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match URI</em>' attribute.
	 * @see #setMatchURI(String)
	 * @see ocompare.OcomparePackage#getCompareElement_MatchURI()
	 * @model required="true"
	 * @generated
	 */
	String getMatchURI();

	/**
	 * Sets the value of the '{@link ocompare.CompareElement#getMatchURI <em>Match URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match URI</em>' attribute.
	 * @see #getMatchURI()
	 * @generated
	 */
	void setMatchURI(String value);

} // CompareElement
