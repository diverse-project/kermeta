/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMTypedElement.java,v 1.1 2008-09-04 15:40:41 cfaucher Exp $
 */
package simk;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMTypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface SMTypedElement extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see simk.SimkPackage#getSMTypedElement_Type()
	 * @model dataType="ecore.EString" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link simk.SMTypedElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SMTypedElement
