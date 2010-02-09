/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>make Unique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.makeUnique#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getmakeUnique()
 * @model
 * @generated
 */
public interface makeUnique extends Adaptation {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(PObject)
	 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getmakeUnique_Element()
	 * @model required="true"
	 * @generated
	 */
	PObject getElement();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.makeUnique#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(PObject value);

} // makeUnique
