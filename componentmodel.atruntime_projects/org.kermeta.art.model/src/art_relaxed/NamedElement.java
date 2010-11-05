/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.Art_relaxedPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends AspectModelElement {
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
	 * @see art_relaxed.Art_relaxedPackage#getNamedElement_Name()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link art_relaxed.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedElement
