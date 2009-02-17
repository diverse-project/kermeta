/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Comp_inheritance_test001FactoryImpl.java,v 1.2 2009-02-17 13:40:57 cfaucher Exp $
 */
package comp_inheritance_test001.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import comp_inheritance_test001.A;
import comp_inheritance_test001.B;
import comp_inheritance_test001.Comp_inheritance_test001Factory;
import comp_inheritance_test001.Comp_inheritance_test001Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Comp_inheritance_test001FactoryImpl extends EFactoryImpl implements Comp_inheritance_test001Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comp_inheritance_test001Factory init()
  {
    try
    {
      Comp_inheritance_test001Factory theComp_inheritance_test001Factory = (Comp_inheritance_test001Factory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/org.kermeta.compiler.tests/unit_test/comp_inheritance/test001/input/kermeta/comp_inheritance_test001.ecore#/"); 
      if (theComp_inheritance_test001Factory != null)
      {
        return theComp_inheritance_test001Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Comp_inheritance_test001FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comp_inheritance_test001FactoryImpl()
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
      case Comp_inheritance_test001Package.A: return createA();
      case Comp_inheritance_test001Package.B: return createB();
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
      case Comp_inheritance_test001Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
      case Comp_inheritance_test001Package._KERMETA_SPECIAL_TYPES_ALIAS_:
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
  public Comp_inheritance_test001Package getComp_inheritance_test001Package()
  {
    return (Comp_inheritance_test001Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Comp_inheritance_test001Package getPackage()
  {
    return Comp_inheritance_test001Package.eINSTANCE;
  }

} //Comp_inheritance_test001FactoryImpl
