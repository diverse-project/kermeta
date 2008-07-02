/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: LanguageFactoryImpl.java,v 1.1 2008-07-02 09:13:19 ftanguy Exp $
 */
package kermeta.language.impl;

import kermeta.language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LanguageFactory init()
  {
    try
    {
      LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/kermeta/language/kermeta_temp_uri"); 
      if (theLanguageFactory != null)
      {
        return theLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageFactoryImpl()
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
      case LanguagePackage.REFLECTIVE_COLLECTION: return createReflectiveCollection();
      case LanguagePackage.REFLECTIVE_SEQUENCE: return createReflectiveSequence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <G> ReflectiveCollection<G> createReflectiveCollection()
  {
    ReflectiveCollectionImpl<G> reflectiveCollection = new ReflectiveCollectionImpl<G>();
    return reflectiveCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <G> ReflectiveSequence<G> createReflectiveSequence()
  {
    ReflectiveSequenceImpl<G> reflectiveSequence = new ReflectiveSequenceImpl<G>();
    return reflectiveSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguagePackage getLanguagePackage()
  {
    return (LanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LanguagePackage getPackage()
  {
    return LanguagePackage.eINSTANCE;
  }

} //LanguageFactoryImpl
