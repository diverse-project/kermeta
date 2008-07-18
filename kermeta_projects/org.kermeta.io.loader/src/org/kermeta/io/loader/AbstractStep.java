/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractStep.java,v 1.3 2008-07-18 07:11:19 dvojtise Exp $
 */
package org.kermeta.io.loader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.AbstractStep#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.kermeta.io.loader.AbstractStep#getCurrentStep <em>Current Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.loader.LoaderPackage#getAbstractStep()
 * @model
 * @generated
 */
public interface AbstractStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.io.loader.LoadingStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.kermeta.io.loader.LoaderPackage#getAbstractStep_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoadingStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Current Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Step</em>' reference.
	 * @see #setCurrentStep(LoadingStep)
	 * @see org.kermeta.io.loader.LoaderPackage#getAbstractStep_CurrentStep()
	 * @model
	 * @generated
	 */
	LoadingStep getCurrentStep();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.AbstractStep#getCurrentStep <em>Current Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Step</em>' reference.
	 * @see #getCurrentStep()
	 * @generated
	 */
	void setCurrentStep(LoadingStep value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	LoadingStep getNextStep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean goToNextStep();

} // AbstractStep
