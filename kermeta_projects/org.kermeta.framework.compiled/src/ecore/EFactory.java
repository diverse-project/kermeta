/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EFactory.java,v 1.1 2008-06-24 14:23:20 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EFactory#getEPackage <em>EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement
{
  /**
   * Returns the value of the '<em><b>EPackage</b></em>' reference.
   * It is bidirectional and its opposite is '{@link ecore.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EPackage</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EPackage</em>' reference.
   * @see #setEPackage(EPackage)
   * @see ecore.EcorePackage#getEFactory_EPackage()
   * @see ecore.EPackage#getEFactoryInstance
   * @model opposite="eFactoryInstance" required="true" transient="true"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EPackage getEPackage();

  /**
   * Sets the value of the '{@link ecore.EFactory#getEPackage <em>EPackage</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EPackage</em>' reference.
   * @see #getEPackage()
   * @generated
   */
  void setEPackage(EPackage value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  Object createFromString(EDataType eDataType, String literalValue);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  String convertToString(EDataType eDataType, Object instanceValue);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EObject create(EClass eClass);

} // EFactory
