/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_callResult_test002Factory.java,v 1.1 2007-11-19 09:44:41 cfaucher Exp $
 */
package comp_callResult_test002;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comp_callResult_test002.Comp_callResult_test002Package
 * @generated
 */
public interface Comp_callResult_test002Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_callResult_test002Factory eINSTANCE = comp_callResult_test002.impl.Comp_callResult_test002FactoryImpl.init();

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
  Comp_callResult_test002Package getComp_callResult_test002Package();

} //Comp_callResult_test002Factory
