/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: MainImpl.java,v 1.1 2007-11-19 12:58:26 cfaucher Exp $
 */
package comp_javaStaticCall_test001.impl;

import comp_javaStaticCall_test001.Comp_javaStaticCall_test001Package;
import comp_javaStaticCall_test001.Main;

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
    return Comp_javaStaticCall_test001Package.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void main()
  {
      String filename = "file.txt";
      String text = "The text";
      fr.irisa.triskell.kermeta.runtime.io.SimpleFileIO.writeTextFile(filename, text);
    
  }

} //MainImpl
