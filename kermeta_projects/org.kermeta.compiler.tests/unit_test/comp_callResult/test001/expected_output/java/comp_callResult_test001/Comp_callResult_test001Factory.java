/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_callResult_test001Factory.java,v 1.2 2009-02-17 13:40:53 cfaucher Exp $
 */
package comp_callResult_test001;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comp_callResult_test001.Comp_callResult_test001Package
 * @generated
 */
public interface Comp_callResult_test001Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_callResult_test001Factory eINSTANCE = comp_callResult_test001.impl.Comp_callResult_test001FactoryImpl.init();

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
  Comp_callResult_test001Package getComp_callResult_test001Package();

} //Comp_callResult_test001Factory
