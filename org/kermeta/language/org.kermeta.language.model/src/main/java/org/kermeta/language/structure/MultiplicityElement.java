/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Model elements with a multiplicity [lower..upper] inherit this class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getMultiplicityElement()
 * @model
 * @generated
 */
public interface MultiplicityElement extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether the element is ordered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.MultiplicityElement#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean stating whether duplicated elements are allowed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getMultiplicityElement_IsUnique()
	 * @model default="true" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.MultiplicityElement#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Min cardinality of the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see org.kermeta.language.structure.StructurePackage#getMultiplicityElement_Lower()
	 * @model default="0" dataType="org.kermeta.language.structure.Integer"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max cardinality of the element, '-1' for '*'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see org.kermeta.language.structure.StructurePackage#getMultiplicityElement_Upper()
	 * @model default="1" dataType="org.kermeta.language.structure.UnlimitedNatural"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // MultiplicityElement
