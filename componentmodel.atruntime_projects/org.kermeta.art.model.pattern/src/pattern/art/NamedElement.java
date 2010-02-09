/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art;

import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.ArtPatternPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends PObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pattern.art.ArtPatternPackage#getNamedElement_Name()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pattern.art.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedElement
