/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MainImpl.java,v 1.2 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_assignment_test002.impl;

import comp_assignment_test002.Comp_assignment_test002Package;
import comp_assignment_test002.Main;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MainImpl extends EObjectImpl implements Main
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
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
    return Comp_assignment_test002Package.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main()
  {
      Integer i;
      i = 1;
      System.out.println("Assignment_Var_Integer: " + i.toString());
    
  }

} //MainImpl
