/**
 * <copyright>
 * </copyright>
 *
 * $Id: EParameter.java,v 1.5 2008-10-08 14:37:50 cfaucher Exp $
 */
package ecore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EParameter#getEOperation <em>EOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' container reference.
	 * @see #setEOperation(EOperation)
	 * @see ecore.EcorePackage#getEParameter_EOperation()
	 * @see ecore.EOperation#getEParameters
	 * @model opposite="eParameters"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EOperation getEOperation();

	/**
	 * Sets the value of the '{@link ecore.EParameter#getEOperation <em>EOperation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOperation</em>' container reference.
	 * @see #getEOperation()
	 * @generated
	 */
	void setEOperation(EOperation value);

} // EParameter
