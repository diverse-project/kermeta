/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: LanguageSwitch.java,v 1.1 2008-07-02 09:13:28 ftanguy Exp $
 */
package kermeta.language.util;

import java.util.List;

import kermeta.language.*;

import kermeta.standard.Collection;
import kermeta.standard.OrderedCollection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kermeta.language.LanguagePackage
 * @generated
 */
public class LanguageSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LanguagePackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LanguagePackage.REFLECTIVE_COLLECTION:
      {
        @SuppressWarnings("unchecked") ReflectiveCollection<?> reflectiveCollection = (ReflectiveCollection<?>)theEObject;
        T result = caseReflectiveCollection(reflectiveCollection);
        if (result == null) result = caseSet(reflectiveCollection);
        if (result == null) result = caseCollection(reflectiveCollection);
        if (result == null) result = caseObject(reflectiveCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.REFLECTIVE_SEQUENCE:
      {
        @SuppressWarnings("unchecked") ReflectiveSequence<?> reflectiveSequence = (ReflectiveSequence<?>)theEObject;
        T result = caseReflectiveSequence(reflectiveSequence);
        if (result == null) result = caseOrderedSet(reflectiveSequence);
        if (result == null) result = caseReflectiveCollection(reflectiveSequence);
        if (result == null) result = caseSet(reflectiveSequence);
        if (result == null) result = caseOrderedCollection(reflectiveSequence);
        if (result == null) result = caseCollection(reflectiveSequence);
        if (result == null) result = caseObject(reflectiveSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.DUMMY_CLASS:
      {
        DummyClass dummyClass = (DummyClass)theEObject;
        T result = caseDummyClass(dummyClass);
        if (result == null) result = caseObject(dummyClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reflective Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reflective Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseReflectiveCollection(ReflectiveCollection<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reflective Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reflective Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseReflectiveSequence(ReflectiveSequence<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dummy Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dummy Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDummyClass(DummyClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(kermeta.language.structure.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseCollection(Collection<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseSet(Set<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseOrderedCollection(OrderedCollection<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <G> T caseOrderedSet(OrderedSet<G> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LanguageSwitch
