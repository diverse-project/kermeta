/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage
 * @generated
 */
public interface QvtcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QvtcoreFactory eINSTANCE = fr.tm.elibel.smartqvt.qvt.qvtcore.impl.QvtcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Bottom Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bottom Pattern</em>'.
	 * @generated
	 */
	BottomPattern createBottomPattern();

	/**
	 * Returns a new object of class '<em>Core Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Domain</em>'.
	 * @generated
	 */
	CoreDomain createCoreDomain();

	/**
	 * Returns a new object of class '<em>Core Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Pattern</em>'.
	 * @generated
	 */
	CorePattern createCorePattern();

	/**
	 * Returns a new object of class '<em>Enforcement Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enforcement Operation</em>'.
	 * @generated
	 */
	EnforcementOperation createEnforcementOperation();

	/**
	 * Returns a new object of class '<em>Guard Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Pattern</em>'.
	 * @generated
	 */
	GuardPattern createGuardPattern();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Property Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Assignment</em>'.
	 * @generated
	 */
	PropertyAssignment createPropertyAssignment();

	/**
	 * Returns a new object of class '<em>Realized Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realized Variable</em>'.
	 * @generated
	 */
	RealizedVariable createRealizedVariable();

	/**
	 * Returns a new object of class '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Assignment</em>'.
	 * @generated
	 */
	VariableAssignment createVariableAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QvtcorePackage getQvtcorePackage();

} //QvtcoreFactory
