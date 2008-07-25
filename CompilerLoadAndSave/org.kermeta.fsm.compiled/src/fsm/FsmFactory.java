/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FsmFactory.java,v 1.2 2008-07-25 12:40:05 ftanguy Exp $
 */
package fsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsm.FsmPackage
 * @generated
 */
public interface FsmFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  FsmFactory eINSTANCE = fsm.impl.FsmFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
  FSM createFSM();

  /**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
  State createState();

  /**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
  Transition createTransition();

  /**
	 * Returns a new object of class '<em>FSM Exception</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Exception</em>'.
	 * @generated
	 */
  FSMException createFSMException();

  /**
	 * Returns a new object of class '<em>Non Determinism</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Determinism</em>'.
	 * @generated
	 */
  NonDeterminism createNonDeterminism();

  /**
	 * Returns a new object of class '<em>No Transition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Transition</em>'.
	 * @generated
	 */
  NoTransition createNoTransition();

  /**
	 * Returns a new object of class '<em>No Initial State Exception</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Initial State Exception</em>'.
	 * @generated
	 */
  NoInitialStateException createNoInitialStateException();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  FsmPackage getFsmPackage();

} //FsmFactory
