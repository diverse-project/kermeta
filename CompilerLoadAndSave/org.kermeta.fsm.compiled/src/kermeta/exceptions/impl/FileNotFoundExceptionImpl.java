/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FileNotFoundExceptionImpl.java,v 1.1 2008-07-02 09:13:28 ftanguy Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.FileNotFoundException;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Not Found Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileNotFoundExceptionImpl extends IOExceptionImpl implements FileNotFoundException
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileNotFoundExceptionImpl()
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
    return ExceptionsPackage.Literals.FILE_NOT_FOUND_EXCEPTION;
  }

} //FileNotFoundExceptionImpl
