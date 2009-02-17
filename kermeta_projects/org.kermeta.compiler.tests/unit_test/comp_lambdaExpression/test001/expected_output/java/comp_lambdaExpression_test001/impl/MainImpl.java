/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MainImpl.java,v 1.2 2009-02-17 13:40:58 cfaucher Exp $
 */
package comp_lambdaExpression_test001.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import comp_lambdaExpression_test001.Comp_lambdaExpression_test001Package;
import comp_lambdaExpression_test001.Main;
import comp_lambdaExpression_test001.helper.Main_3_Helper;

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
    return Comp_lambdaExpression_test001Package.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main()
  {
      comp_lambdaExpression_test001.A a = comp_lambdaExpression_test001.Comp_lambdaExpression_test001Factory.eINSTANCE.createA();
      a.getRef().add("Kernel");
      a.getRef().add("Metamodeling");
      a.getRef().add(" ");
      a.getRef().add("Compiler");
      Main_3_Helper.each(a.getRef());
    
  }

} //MainImpl
