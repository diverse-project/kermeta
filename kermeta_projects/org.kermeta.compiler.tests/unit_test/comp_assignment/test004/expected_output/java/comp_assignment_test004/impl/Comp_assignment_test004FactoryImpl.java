/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_assignment_test004FactoryImpl.java,v 1.2 2009-02-17 13:40:51 cfaucher Exp $
 */
package comp_assignment_test004.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import comp_assignment_test004.A;
import comp_assignment_test004.B;
import comp_assignment_test004.Comp_assignment_test004Factory;
import comp_assignment_test004.Comp_assignment_test004Package;
import comp_assignment_test004.Main;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_assignment_test004FactoryImpl extends EFactoryImpl implements Comp_assignment_test004Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comp_assignment_test004Factory init()
  {
    try
    {
      Comp_assignment_test004Factory theComp_assignment_test004Factory = (Comp_assignment_test004Factory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.kermeta.compiler.tests/unit_test/comp_assignment/test004/input/kermeta/comp_assignment_test004.ecore#/comp_assignment_test004"); 
      if (theComp_assignment_test004Factory != null)
      {
        return theComp_assignment_test004Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Comp_assignment_test004FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_assignment_test004FactoryImpl()
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
      case Comp_assignment_test004Package.MAIN: return createMain();
      case Comp_assignment_test004Package.A: return createA();
      case Comp_assignment_test004Package.B: return createB();
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
      case Comp_assignment_test004Package.STRING:
        return createStringFromString(eDataType, initialValue);
      case Comp_assignment_test004Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
      case Comp_assignment_test004Package.STRING:
        return convertStringToString(eDataType, instanceValue);
      case Comp_assignment_test004Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
  public String createStringFromString(EDataType eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStringToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
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
  public Comp_assignment_test004Package getComp_assignment_test004Package()
  {
    return (Comp_assignment_test004Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Comp_assignment_test004Package getPackage()
  {
    return Comp_assignment_test004Package.eINSTANCE;
  }

} //Comp_assignment_test004FactoryImpl
