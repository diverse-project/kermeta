/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: PersistenceFactory.java,v 1.1 2008-07-02 09:13:19 ftanguy Exp $
 */
package kermeta.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistenceFactory eINSTANCE = kermeta.persistence.impl.PersistenceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>EMF Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMF Resource</em>'.
   * @generated
   */
  EMFResource createEMFResource();

  /**
   * Returns a new object of class '<em>KM Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KM Resource</em>'.
   * @generated
   */
  KMResource createKMResource();

  /**
   * Returns a new object of class '<em>Dangling Diagnostic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dangling Diagnostic</em>'.
   * @generated
   */
  DanglingDiagnostic createDanglingDiagnostic();

  /**
   * Returns a new object of class '<em>EMF Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMF Repository</em>'.
   * @generated
   */
  EMFRepository createEMFRepository();

  /**
   * Returns a new object of class '<em>KM Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KM Repository</em>'.
   * @generated
   */
  KMRepository createKMRepository();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PersistencePackage getPersistencePackage();

} //PersistenceFactory
