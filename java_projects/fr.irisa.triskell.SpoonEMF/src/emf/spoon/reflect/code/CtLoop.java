/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtLoop.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtLoop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtLoop()
 * @model
 * @generated
 */
public interface CtLoop extends CtStatement, spoon.reflect.code.CtLoop {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(CtStatement)
	 * @see emf.spoon.reflect.code.CodePackage#getCtLoop_Body()
	 * @model
	 * @generated
	 */
	CtStatement getBody();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtLoop#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(CtStatement value);

} // CtLoop