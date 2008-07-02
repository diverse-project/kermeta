/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EmptyCollectionImpl.java,v 1.1 2008-07-02 09:13:28 ftanguy Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.EmptyCollection;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmptyCollectionImpl extends ExceptionImpl implements EmptyCollection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmptyCollectionImpl()
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
    return ExceptionsPackage.Literals.EMPTY_COLLECTION;
  }

} //EmptyCollectionImpl
