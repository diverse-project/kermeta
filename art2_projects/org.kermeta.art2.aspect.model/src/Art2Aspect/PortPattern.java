/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.PortPattern#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getPortPattern()
 * @model
 * @generated
 */
public interface PortPattern extends EObject {

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(PortTypeRefPattern)
	 * @see Art2Aspect.Art2AspectPackage#getPortPattern_Ref()
	 * @model
	 * @generated
	 */
	PortTypeRefPattern getRef();

	/**
	 * Sets the value of the '{@link Art2Aspect.PortPattern#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(PortTypeRefPattern value);
} // PortPattern
