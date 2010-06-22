/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import art2.ContainerRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Art2Aspect.AspectDefinition#getBindings <em>Bindings</em>}</li>
 *   <li>{@link Art2Aspect.AspectDefinition#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link Art2Aspect.AspectDefinition#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @see Art2Aspect.Art2AspectPackage#getAspectDefinition()
 * @model
 * @generated
 */
public interface AspectDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link Art2Aspect.BindingPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see Art2Aspect.Art2AspectPackage#getAspectDefinition_Bindings()
	 * @model type="Art2Aspect.BindingPattern" containment="true"
	 * @generated
	 */
	EList getBindings();

	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' containment reference.
	 * @see #setPointcut(PointcutDefinition)
	 * @see Art2Aspect.Art2AspectPackage#getAspectDefinition_Pointcut()
	 * @model containment="true"
	 * @generated
	 */
	PointcutDefinition getPointcut();

	/**
	 * Sets the value of the '{@link Art2Aspect.AspectDefinition#getPointcut <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' containment reference.
	 * @see #getPointcut()
	 * @generated
	 */
	void setPointcut(PointcutDefinition value);

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference.
	 * @see #setAdvice(ContainerRoot)
	 * @see Art2Aspect.Art2AspectPackage#getAspectDefinition_Advice()
	 * @model containment="true"
	 * @generated
	 */
	ContainerRoot getAdvice();

	/**
	 * Sets the value of the '{@link Art2Aspect.AspectDefinition#getAdvice <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' containment reference.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(ContainerRoot value);

} // AspectDefinition
