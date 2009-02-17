/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_initialization_test005FactoryImpl.java,v 1.2 2009-02-17 13:40:57 cfaucher Exp $
 */
package comp_initialization_test005.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import comp_initialization_test005.A;
import comp_initialization_test005.Comp_initialization_test005Factory;
import comp_initialization_test005.Comp_initialization_test005Package;
import comp_initialization_test005.Main;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_initialization_test005FactoryImpl extends EFactoryImpl implements Comp_initialization_test005Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comp_initialization_test005Factory init()
  {
    try
    {
      Comp_initialization_test005Factory theComp_initialization_test005Factory = (Comp_initialization_test005Factory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.kermeta.compiler.tests/unit_test/comp_initialization/test005/input/kermeta/comp_initialization_test005.ecore#/comp_initialization_test005"); 
      if (theComp_initialization_test005Factory != null)
      {
        return theComp_initialization_test005Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Comp_initialization_test005FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_initialization_test005FactoryImpl()
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
      case Comp_initialization_test005Package.MAIN: return createMain();
      case Comp_initialization_test005Package.A: return createA();
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
      case Comp_initialization_test005Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
      case Comp_initialization_test005Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
  public Comp_initialization_test005Package getComp_initialization_test005Package()
  {
    return (Comp_initialization_test005Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Comp_initialization_test005Package getPackage()
  {
    return Comp_initialization_test005Package.eINSTANCE;
  }

} //Comp_initialization_test005FactoryImpl
