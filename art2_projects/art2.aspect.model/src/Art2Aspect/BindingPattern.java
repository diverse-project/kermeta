/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import art2.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.BindingPattern#getSource <em>Source</em>}</li>
 *   <li>{@link Art2Aspect.BindingPattern#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getBindingPattern()
 * @model
 * @generated
 */
public interface BindingPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortPattern)
	 * @see Art2Aspect.Art2AspectPackage#getBindingPattern_Source()
	 * @model required="true"
	 * @generated
	 */
	PortPattern getSource();

	/**
	 * Sets the value of the '{@link Art2Aspect.BindingPattern#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortPattern value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see Art2Aspect.Art2AspectPackage#getBindingPattern_Target()
	 * @model required="true"
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link Art2Aspect.BindingPattern#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

} // BindingPattern
