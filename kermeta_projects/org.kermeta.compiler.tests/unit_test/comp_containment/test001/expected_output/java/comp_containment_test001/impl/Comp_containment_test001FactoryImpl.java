/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_containment_test001FactoryImpl.java,v 1.1 2007-11-19 13:23:37 cfaucher Exp $
 */
package comp_containment_test001.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import comp_containment_test001.A;
import comp_containment_test001.B;
import comp_containment_test001.C;
import comp_containment_test001.Comp_containment_test001Factory;
import comp_containment_test001.Comp_containment_test001Package;
import comp_containment_test001.D;
import comp_containment_test001.Main;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_containment_test001FactoryImpl extends EFactoryImpl implements Comp_containment_test001Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comp_containment_test001Factory init()
  {
    try
    {
      Comp_containment_test001Factory theComp_containment_test001Factory = (Comp_containment_test001Factory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.kermeta.compiler.tests/unit_test/comp_containment/test001/input/kermeta/comp_containment_test001.ecore#/comp_containment_test001"); 
      if (theComp_containment_test001Factory != null)
      {
        return theComp_containment_test001Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Comp_containment_test001FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_containment_test001FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Comp_containment_test001Package.MAIN: return createMain();
      case Comp_containment_test001Package.A: return createA();
      case Comp_containment_test001Package.B: return createB();
      case Comp_containment_test001Package.C: return createC();
      case Comp_containment_test001Package.D: return createD();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Comp_containment_test001Package._KERMETA_SPECIAL_TYPES_ALIAS_:
        return create_KermetaSpecialTypesAlias_FromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Comp_containment_test001Package._KERMETA_SPECIAL_TYPES_ALIAS_:
        return convert_KermetaSpecialTypesAlias_ToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public A createA()
  {
    AImpl a = new AImpl();
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public B createB()
  {
    BImpl b = new BImpl();
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public C createC()
  {
    CImpl c = new CImpl();
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D createD()
  {
    DImpl d = new DImpl();
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object create_KermetaSpecialTypesAlias_FromString(EDataType eDataType, String initialValue)
  {
    return super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convert_KermetaSpecialTypesAlias_ToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_containment_test001Package getComp_containment_test001Package()
  {
    return (Comp_containment_test001Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Comp_containment_test001Package getPackage()
  {
    return Comp_containment_test001Package.eINSTANCE;
  }

} //Comp_containment_test001FactoryImpl
