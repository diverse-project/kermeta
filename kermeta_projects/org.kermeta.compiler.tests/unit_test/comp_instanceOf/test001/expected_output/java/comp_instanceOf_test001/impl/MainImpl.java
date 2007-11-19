/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MainImpl.java,v 1.1 2007-11-19 09:47:08 cfaucher Exp $
 */
package comp_instanceOf_test001.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import comp_instanceOf_test001.Comp_instanceOf_test001Package;
import comp_instanceOf_test001.Main;

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
    return Comp_instanceOf_test001Package.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main()
  {
      comp_instanceOf_test001.A a = comp_instanceOf_test001.Comp_instanceOf_test001Factory.eINSTANCE.createA();
      if( a instanceof comp_instanceOf_test001.A) {
        System.out.println("a is instance of A");
    
      }
    
  }

} //MainImpl
