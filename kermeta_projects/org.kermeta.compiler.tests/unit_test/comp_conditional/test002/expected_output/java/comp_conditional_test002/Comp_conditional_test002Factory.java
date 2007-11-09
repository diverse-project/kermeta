/**
 * Copyright : IRISA / INRIA / Universite de Rennes 1/nLicense   : EPL/nhttp://www.kermeta.org
 *
 * $Id: Comp_conditional_test002Factory.java,v 1.1 2007-11-09 17:56:36 cfaucher Exp $
 */
package comp_conditional_test002;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comp_conditional_test002.Comp_conditional_test002Package
 * @generated
 */
public interface Comp_conditional_test002Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comp_conditional_test002Factory eINSTANCE = comp_conditional_test002.impl.Comp_conditional_test002FactoryImpl.init();

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
  Comp_conditional_test002Package getComp_conditional_test002Package();

} //Comp_conditional_test002Factory
