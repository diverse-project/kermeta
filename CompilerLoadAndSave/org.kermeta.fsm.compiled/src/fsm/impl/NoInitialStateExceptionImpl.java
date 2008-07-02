/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: NoInitialStateExceptionImpl.java,v 1.1 2008-07-02 09:13:40 ftanguy Exp $
 */
package fsm.impl;

import fsm.FsmPackage;
import fsm.NoInitialStateException;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Initial State Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NoInitialStateExceptionImpl extends FSMExceptionImpl implements NoInitialStateException
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoInitialStateExceptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FsmPackage.Literals.NO_INITIAL_STATE_EXCEPTION;
  }

} //NoInitialStateExceptionImpl
