/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EClass.java,v 1.1 2008-06-24 14:23:20 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.EClass#is_abstract <em>abstract</em>}</li>
 *   <li>{@link ecore.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecore.EClass#is_interface <em>interface</em>}</li>
 *   <li>{@link ecore.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecore.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecore.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecore.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecore.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecore.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecore.EClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecore.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecore.EClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EClassifier
{
  /**
   * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
   * The list contents are of type {@link ecore.EStructuralFeature}.
   * It is bidirectional and its opposite is '{@link ecore.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EStructural Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EStructural Features</em>' containment reference list.
   * @see ecore.EcorePackage#getEClass_EStructuralFeatures()
   * @see ecore.EStructuralFeature#getEContainingClass
   * @model opposite="eContainingClass" containment="true"
   * @generated
   */
  EList<EStructuralFeature> getEStructuralFeatures();

  /**
   * Returns the value of the '<em><b>abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>abstract</em>' attribute.
   * @see #set_abstract(boolean)
   * @see ecore.EcorePackage#getEClass__abstract()
   * @model
   * @generated
   */
  boolean is_abstract();

  /**
   * Sets the value of the '{@link ecore.EClass#is_abstract <em>abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>abstract</em>' attribute.
   * @see #is_abstract()
   * @generated
   */
  void set_abstract(boolean value);

  /**
   * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
   * The list contents are of type {@link ecore.EOperation}.
   * It is bidirectional and its opposite is '{@link ecore.EOperation#getEContainingClass <em>EContaining Class</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EOperations</em>' containment reference list.
   * @see ecore.EcorePackage#getEClass_EOperations()
   * @see ecore.EOperation#getEContainingClass
   * @model opposite="eContainingClass" containment="true"
   * @generated
   */
  EList<EOperation> getEOperations();

  /**
   * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
   * The list contents are of type {@link ecore.EAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Attributes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Attributes</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllAttributes()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EAttribute> getEAllAttributes();

  /**
   * Returns the value of the '<em><b>interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>interface</em>' attribute.
   * @see #set_interface(boolean)
   * @see ecore.EcorePackage#getEClass__interface()
   * @model
   * @generated
   */
  boolean is_interface();

  /**
   * Sets the value of the '{@link ecore.EClass#is_interface <em>interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>interface</em>' attribute.
   * @see #is_interface()
   * @generated
   */
  void set_interface(boolean value);

  /**
   * Returns the value of the '<em><b>EReferences</b></em>' reference list.
   * The list contents are of type {@link ecore.EReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EReferences</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EReferences</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EReferences()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EReference> getEReferences();

  /**
   * Returns the value of the '<em><b>EAll References</b></em>' reference list.
   * The list contents are of type {@link ecore.EReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll References</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllReferences()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EReference> getEAllReferences();

  /**
   * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
   * The list contents are of type {@link ecore.EClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ESuper Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ESuper Types</em>' reference list.
   * @see ecore.EcorePackage#getEClass_ESuperTypes()
   * @model
   * @generated
   */
  EList<EClass> getESuperTypes();

  /**
   * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
   * The list contents are of type {@link ecore.EReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Containments</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Containments</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllContainments()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EReference> getEAllContainments();

  /**
   * Returns the value of the '<em><b>EGeneric Super Types</b></em>' containment reference list.
   * The list contents are of type {@link ecore.EGenericType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EGeneric Super Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EGeneric Super Types</em>' containment reference list.
   * @see ecore.EcorePackage#getEClass_EGenericSuperTypes()
   * @model containment="true"
   * @generated
   */
  EList<EGenericType> getEGenericSuperTypes();

  /**
   * Returns the value of the '<em><b>EAll Generic Super Types</b></em>' reference list.
   * The list contents are of type {@link ecore.EGenericType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Generic Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Generic Super Types</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllGenericSuperTypes()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EGenericType> getEAllGenericSuperTypes();

  /**
   * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
   * The list contents are of type {@link ecore.EAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAttributes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAttributes</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAttributes()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EAttribute> getEAttributes();

  /**
   * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EID Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EID Attribute</em>' reference.
   * @see #setEIDAttribute(EAttribute)
   * @see ecore.EcorePackage#getEClass_EIDAttribute()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EAttribute getEIDAttribute();

  /**
   * Sets the value of the '{@link ecore.EClass#getEIDAttribute <em>EID Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EID Attribute</em>' reference.
   * @see #getEIDAttribute()
   * @generated
   */
  void setEIDAttribute(EAttribute value);

  /**
   * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
   * The list contents are of type {@link ecore.EOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Operations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Operations</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllOperations()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EOperation> getEAllOperations();

  /**
   * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
   * The list contents are of type {@link ecore.EStructuralFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Structural Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Structural Features</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllStructuralFeatures()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EStructuralFeature> getEAllStructuralFeatures();

  /**
   * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
   * The list contents are of type {@link ecore.EClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EAll Super Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EAll Super Types</em>' reference list.
   * @see ecore.EcorePackage#getEClass_EAllSuperTypes()
   * @model transient="true" derived="true"
   *        annotation="kermeta isReadOnly='false'"
   *        annotation="kermeta ecore.isTransient='true'"
   * @generated
   */
  EList<EClass> getEAllSuperTypes();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  int getFeatureID(EStructuralFeature feature);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EStructuralFeature getEStructuralFeature(String featureName);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  boolean isSuperTypeOf(EClass someClass);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="kermeta isAbstract='true'"
   * @generated
   */
  int getFeatureCount();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  EStructuralFeature op_getEStructuralFeature(int featureID);

} // EClass
