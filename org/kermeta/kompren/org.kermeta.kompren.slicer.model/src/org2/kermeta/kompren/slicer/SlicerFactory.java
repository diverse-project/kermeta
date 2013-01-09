/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org2.kermeta.kompren.slicer.SlicerPackage
 * @generated
 */
public interface SlicerFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlicerFactory eINSTANCE = org2.kermeta.kompren.slicer.impl.SlicerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Slicer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slicer</em>'.
	 * @generated
	 */
	Slicer createSlicer();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Radius</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radius</em>'.
	 * @generated
	 */
	Radius createRadius();

	/**
	 * Returns a new object of class '<em>Sliced Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sliced Class</em>'.
	 * @generated
	 */
	SlicedClass createSlicedClass();

	/**
	 * Returns a new object of class '<em>Sliced Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sliced Property</em>'.
	 * @generated
	 */
	SlicedProperty createSlicedProperty();

	/**
	 * Returns a new object of class '<em>Opposite Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opposite Creation</em>'.
	 * @generated
	 */
	OppositeCreation createOppositeCreation();

	/**
	 * Returns a new object of class '<em>Var Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Decl</em>'.
	 * @generated
	 */
	VarDecl createVarDecl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SlicerPackage getSlicerPackage();

} //SlicerFactory
