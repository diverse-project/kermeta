/**
 * <copyright>
 * </copyright>
 *
 * $Id: SMNamedElement.java,v 1.4 2008-10-08 14:37:58 cfaucher Exp $
 */
package simk;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simk.SMNamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see simk.SimkPackage#getSMNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface SMNamedElement extends kermeta.language.structure.Object {
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
	 * @see simk.SimkPackage#getSMNamedElement_Name()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simk.SMNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SMNamedElement
