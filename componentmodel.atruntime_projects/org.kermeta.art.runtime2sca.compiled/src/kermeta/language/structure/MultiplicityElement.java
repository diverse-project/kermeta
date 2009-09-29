/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation=' Model elements with a multiplicity [lower..upper] inherit this class'"
 * @generated
 */
public interface MultiplicityElement extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Boolean stating whether the element is ordered'"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

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
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Upper()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Max cardinality of the element, \'-1\' for \'*\''"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
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
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_Lower()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Min cardinality of the element'"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see kermeta.language.structure.StructurePackage#getMultiplicityElement_IsUnique()
	 * @model default="true" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Boolean stating whether duplicated elements are allowed'"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

} // MultiplicityElement
