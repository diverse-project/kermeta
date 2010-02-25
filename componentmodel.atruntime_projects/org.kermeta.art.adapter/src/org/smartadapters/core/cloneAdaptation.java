/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>clone Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.cloneAdaptation#getIsUnique <em>Is Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.CorePackage#getcloneAdaptation()
 * @model abstract="true"
 * @generated
 */
public interface cloneAdaptation extends Adaptation {
	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smartadapters.core.uniqueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see org.smartadapters.core.uniqueType
	 * @see #setIsUnique(uniqueType)
	 * @see org.smartadapters.core.CorePackage#getcloneAdaptation_IsUnique()
	 * @model annotation="kermeta isComposite='true'"
	 * @generated
	 */
	uniqueType getIsUnique();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.cloneAdaptation#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see org.smartadapters.core.uniqueType
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(uniqueType value);

} // cloneAdaptation
