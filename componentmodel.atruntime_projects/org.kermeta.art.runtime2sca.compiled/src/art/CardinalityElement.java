/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.CardinalityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link art.CardinalityElement#getLower <em>Lower</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.ArtPackage#getCardinalityElement()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface CardinalityElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see art.ArtPackage#getCardinalityElement_Upper()
	 * @model dataType="art.Integer"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link art.CardinalityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see art.ArtPackage#getCardinalityElement_Lower()
	 * @model dataType="art.Integer"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link art.CardinalityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

} // CardinalityElement
