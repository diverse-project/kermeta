/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: CallOnVoidTargetImpl.java,v 1.1 2008-06-24 14:23:33 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call On Void Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CallOnVoidTargetImpl extends RuntimeErrorImpl implements CallOnVoidTarget
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallOnVoidTargetImpl()
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
    return ExceptionsPackage.Literals.CALL_ON_VOID_TARGET;
  }

} //CallOnVoidTargetImpl
