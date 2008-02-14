/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoadingStep.java,v 1.2 2008-02-14 07:12:49 uid21732 Exp $
 */
package org.kermeta.io.loader;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loading Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.loader.LoadingStep#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.io.loader.LoadingStep#isDone <em>Done</em>}</li>
 *   <li>{@link org.kermeta.io.loader.LoadingStep#getAction <em>Action</em>}</li>
 *   <li>{@link org.kermeta.io.loader.LoadingStep#isPropagate <em>Propagate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.loader.LoaderPackage#getLoadingStep()
 * @model
 * @generated
 */
public interface LoadingStep extends AbstractStep {
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
	 * @see org.kermeta.io.loader.LoaderPackage#getLoadingStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.LoadingStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.kermeta.io.loader.LoaderPackage#getLoadingStep_Done()
	 * @model required="true"
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.LoadingStep#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.kermeta.io.loader.LoaderPackage#getLoadingStep_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.LoadingStep#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Propagate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagate</em>' attribute.
	 * @see #setPropagate(boolean)
	 * @see org.kermeta.io.loader.LoaderPackage#getLoadingStep_Propagate()
	 * @model required="true"
	 * @generated
	 */
	boolean isPropagate();

	/**
	 * Sets the value of the '{@link org.kermeta.io.loader.LoadingStep#isPropagate <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagate</em>' attribute.
	 * @see #isPropagate()
	 * @generated
	 */
	void setPropagate(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process(ILoadingDatas datas, Map<?, ?> options);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction(ILoadingDatas datas, Map<?, ?> options);

} // LoadingStep
