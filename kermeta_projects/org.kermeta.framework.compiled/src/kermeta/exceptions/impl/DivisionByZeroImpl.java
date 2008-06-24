/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: DivisionByZeroImpl.java,v 1.1 2008-06-24 14:23:32 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.DivisionByZero;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division By Zero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DivisionByZeroImpl extends ExceptionImpl implements DivisionByZero
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DivisionByZeroImpl()
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
    return ExceptionsPackage.Literals.DIVISION_BY_ZERO;
  }

} //DivisionByZeroImpl
