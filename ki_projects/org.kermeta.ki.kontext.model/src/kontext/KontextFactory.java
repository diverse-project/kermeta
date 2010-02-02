/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kontext.KontextPackage
 * @generated
 */
public interface KontextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KontextFactory eINSTANCE = kontext.impl.KontextFactoryImpl.init();

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
