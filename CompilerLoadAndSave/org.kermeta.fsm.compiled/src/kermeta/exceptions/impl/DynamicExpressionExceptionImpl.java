/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: DynamicExpressionExceptionImpl.java,v 1.1 2008-07-02 09:13:28 ftanguy Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.DynamicExpressionException;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Expression Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DynamicExpressionExceptionImpl extends ExceptionImpl implements DynamicExpressionException
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicExpressionExceptionImpl()
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
    return ExceptionsPackage.Literals.DYNAMIC_EXPRESSION_EXCEPTION;
  }

} //DynamicExpressionExceptionImpl
