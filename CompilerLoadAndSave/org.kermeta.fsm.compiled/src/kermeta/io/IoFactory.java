/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: IoFactory.java,v 1.1 2008-07-02 09:13:38 ftanguy Exp $
 */
package kermeta.io;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.io.IoPackage
 * @generated
 */
public interface IoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IoFactory eINSTANCE = kermeta.io.impl.IoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Std IO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Std IO</em>'.
   * @generated
   */
  StdIO createStdIO();

  /**
   * Returns a new object of class '<em>File IO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File IO</em>'.
   * @generated
   */
  FileIO createFileIO();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IoPackage getIoPackage();

} //IoFactory
