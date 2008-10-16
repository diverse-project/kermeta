/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElement.java,v 1.6 2008-10-16 13:18:10 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.ENamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getENamedElement()
 * @model abstract="true"
 * @generated
 */
public interface ENamedElement extends EModelElement {
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
	 * @see ecore.EcorePackage#getENamedElement_Name()
	 * @model dataType="ecore.EString"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.ENamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ENamedElement
