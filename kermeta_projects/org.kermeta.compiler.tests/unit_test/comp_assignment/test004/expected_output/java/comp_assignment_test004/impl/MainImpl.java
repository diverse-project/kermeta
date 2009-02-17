/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MainImpl.java,v 1.2 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_assignment_test004.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import comp_assignment_test004.Comp_assignment_test004Package;
import comp_assignment_test004.Main;
import comp_assignment_test004.helper.Main_9_Helper;

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
    return Comp_assignment_test004Package.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main()
  {
      comp_assignment_test004.A a = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createA();
      a.setName("Assignment of a feature");
      comp_assignment_test004.B b1 = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createB();
      comp_assignment_test004.B b2 = comp_assignment_test004.Comp_assignment_test004Factory.eINSTANCE.createB();
      a.getB().add(b1);
      a.getB().add(b2);
      System.out.println("a.name: " + a.getName());
      Main_9_Helper.each(a.getB());
    
  }

} //MainImpl
