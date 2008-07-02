/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: NotComparableExceptionImpl.java,v 1.1 2008-07-02 09:13:16 ftanguy Exp $
 */
package kermeta.standard.impl;

import kermeta.exceptions.impl.ExceptionImpl;

import kermeta.standard.NotComparableException;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Comparable Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotComparableExceptionImpl extends ExceptionImpl implements NotComparableException
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotComparableExceptionImpl()
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
    return StandardPackage.Literals.NOT_COMPARABLE_EXCEPTION;
  }

} //NotComparableExceptionImpl
