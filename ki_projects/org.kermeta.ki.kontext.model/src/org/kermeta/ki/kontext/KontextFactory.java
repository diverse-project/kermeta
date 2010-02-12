/**
 * INRIA - Triskell Team
 *
 * $Id$
 */
package org.kermeta.ki.kontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.ki.kontext.KontextPackage
 * @generated
 */
public interface KontextFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA - Triskell Team";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KontextFactory eINSTANCE = org.kermeta.ki.kontext.impl.KontextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context To Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context To Task</em>'.
	 * @generated
	 */
	ContextToTask createContextToTask();

	/**
	 * Returns a new object of class '<em>Context To Task Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context To Task Constraint</em>'.
	 * @generated
	 */
	ContextToTaskConstraint createContextToTaskConstraint();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KontextPackage getKontextPackage();

} //KontextFactory
