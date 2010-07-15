/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sitacview;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitacview.PropertyEditor#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitacview.SitacviewPackage#getPropertyEditor()
 * @model
 * @generated
 */
public interface PropertyEditor extends View {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Selectable)
	 * @see sitacview.SitacviewPackage#getPropertyEditor_Element()
	 * @model
	 * @generated
	 */
	Selectable getElement();

	/**
	 * Sets the value of the '{@link sitacview.PropertyEditor#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Selectable value);

} // PropertyEditor
