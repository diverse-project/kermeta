/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_javaStaticCall_test001Factory.java,v 1.1 2007-11-19 12:58:26 cfaucher Exp $
 */
package comp_javaStaticCall_test001;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comp_javaStaticCall_test001.Comp_javaStaticCall_test001Package
 * @generated
 */
public interface Comp_javaStaticCall_test001Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_javaStaticCall_test001Factory eINSTANCE = comp_javaStaticCall_test001.impl.Comp_javaStaticCall_test001FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Comp_javaStaticCall_test001Package getComp_javaStaticCall_test001Package();

} //Comp_javaStaticCall_test001Factory
