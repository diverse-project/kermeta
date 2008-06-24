/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EStructuralFeature.java,v 1.1 2008-06-24 14:23:20 cfaucher Exp $
 */
package ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EStructuralFeature#is_volatile <em>volatile</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#is_transient <em>transient</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecore.EStructuralFeature#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface EStructuralFeature extends ETypedElement
{
  /**
   * Returns the value of the '<em><b>volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>volatile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>volatile</em>' attribute.
   * @see #set_volatile(boolean)
   * @see ecore.EcorePackage#getEStructuralFeature__volatile()
   * @model
   * @generated
   */
  boolean is_volatile();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#is_volatile <em>volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>volatile</em>' attribute.
   * @see #is_volatile()
   * @generated
   */
  void set_volatile(boolean value);

  /**
   * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EContaining Class</em>' container reference.
   * @see #setEContainingClass(EClass)
   * @see ecore.EcorePackage#getEStructuralFeature_EContainingClass()
   * @see ecore.EClass#getEStructuralFeatures
   * @model opposite="eStructuralFeatures"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EClass getEContainingClass();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EContaining Class</em>' container reference.
   * @see #getEContainingClass()
   * @generated
   */
  void setEContainingClass(EClass value);

  /**
   * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value Literal</em>' attribute.
   * @see #setDefaultValueLiteral(String)
   * @see ecore.EcorePackage#getEStructuralFeature_DefaultValueLiteral()
   * @model
   * @generated
   */
  String getDefaultValueLiteral();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value Literal</em>' attribute.
   * @see #getDefaultValueLiteral()
   * @generated
   */
  void setDefaultValueLiteral(String value);

  /**
   * Returns the value of the '<em><b>transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>transient</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>transient</em>' attribute.
   * @see #set_transient(boolean)
   * @see ecore.EcorePackage#getEStructuralFeature__transient()
   * @model
   * @generated
   */
  boolean is_transient();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#is_transient <em>transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>transient</em>' attribute.
   * @see #is_transient()
   * @generated
   */
  void set_transient(boolean value);

  /**
   * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsettable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsettable</em>' attribute.
   * @see #setUnsettable(boolean)
   * @see ecore.EcorePackage#getEStructuralFeature_Unsettable()
   * @model
   * @generated
   */
  boolean isUnsettable();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsettable</em>' attribute.
   * @see #isUnsettable()
   * @generated
   */
  void setUnsettable(boolean value);

  /**
   * Returns the value of the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived</em>' attribute.
   * @see #setDerived(boolean)
   * @see ecore.EcorePackage#getEStructuralFeature_Derived()
   * @model
   * @generated
   */
  boolean isDerived();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#isDerived <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived</em>' attribute.
   * @see #isDerived()
   * @generated
   */
  void setDerived(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(Object)
   * @see ecore.EcorePackage#getEStructuralFeature_DefaultValue()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  Object getDefaultValue();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Object value);

  /**
   * Returns the value of the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changeable</em>' attribute.
   * @see #setChangeable(boolean)
   * @see ecore.EcorePackage#getEStructuralFeature_Changeable()
   * @model
   * @generated
   */
  boolean isChangeable();

  /**
   * Sets the value of the '{@link ecore.EStructuralFeature#isChangeable <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Changeable</em>' attribute.
   * @see #isChangeable()
   * @generated
   */
  void setChangeable(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="kermeta isAbstract='true'"
   * @generated
   */
  int getFeatureID();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="kermeta isAbstract='true'"
   * @generated
   */
  Class getContainerClass();

} // EStructuralFeature
