/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: PersistencePackage.java,v 1.1 2008-06-24 14:23:39 cfaucher Exp $
 */
package kermeta.persistence;

import kermeta.language.structure.StructurePackage;

import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kermeta.persistence.PersistenceFactory
 * @model kind="package"
 *        annotation="kermeta documentation='/**\r\n * Contains the classes that handle the serialization of models, in particular\r\n * EMF models.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/persistence_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface PersistencePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "persistence";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kermeta.org/kermeta/persistence";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistencePackage eINSTANCE = kermeta.persistence.impl.PersistencePackageImpl.init();

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.ResourceImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__TAG = StandardPackage.SET__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__OWNED_TAGS = StandardPackage.SET__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Dependent Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DEPENDENT_RESOURCES = StandardPackage.SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__CONTENTS = StandardPackage.SET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repository</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__REPOSITORY = StandardPackage.SET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__META_MODEL_URI = StandardPackage.SET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__IS_READ_ONLY = StandardPackage.SET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__URI = StandardPackage.SET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = StandardPackage.SET_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.EMFResourceImpl <em>EMF Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.EMFResourceImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getEMFResource()
   * @generated
   */
  int EMF_RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__TAG = RESOURCE__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__OWNED_TAGS = RESOURCE__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Dependent Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__DEPENDENT_RESOURCES = RESOURCE__DEPENDENT_RESOURCES;

  /**
   * The feature id for the '<em><b>Contents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__CONTENTS = RESOURCE__CONTENTS;

  /**
   * The feature id for the '<em><b>Repository</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__REPOSITORY = RESOURCE__REPOSITORY;

  /**
   * The feature id for the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__META_MODEL_URI = RESOURCE__META_MODEL_URI;

  /**
   * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__IS_READ_ONLY = RESOURCE__IS_READ_ONLY;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE__URI = RESOURCE__URI;

  /**
   * The number of structural features of the '<em>EMF Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.KMResourceImpl <em>KM Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.KMResourceImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getKMResource()
   * @generated
   */
  int KM_RESOURCE = 2;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__TAG = RESOURCE__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__OWNED_TAGS = RESOURCE__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Dependent Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__DEPENDENT_RESOURCES = RESOURCE__DEPENDENT_RESOURCES;

  /**
   * The feature id for the '<em><b>Contents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__CONTENTS = RESOURCE__CONTENTS;

  /**
   * The feature id for the '<em><b>Repository</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__REPOSITORY = RESOURCE__REPOSITORY;

  /**
   * The feature id for the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__META_MODEL_URI = RESOURCE__META_MODEL_URI;

  /**
   * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__IS_READ_ONLY = RESOURCE__IS_READ_ONLY;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE__URI = RESOURCE__URI;

  /**
   * The number of structural features of the '<em>KM Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.RepositoryImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 3;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__RESOURCES = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.DanglingDiagnosticImpl <em>Dangling Diagnostic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.DanglingDiagnosticImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getDanglingDiagnostic()
   * @generated
   */
  int DANGLING_DIAGNOSTIC = 4;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Referencing Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dangling Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC__DANGLING_ELEMENT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Referencing Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY = StructurePackage.OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dangling Diagnostic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DANGLING_DIAGNOSTIC_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.EMFRepositoryImpl <em>EMF Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.EMFRepositoryImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getEMFRepository()
   * @generated
   */
  int EMF_REPOSITORY = 5;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY__TAG = REPOSITORY__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY__OWNED_TAGS = REPOSITORY__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY__RESOURCES = REPOSITORY__RESOURCES;

  /**
   * The feature id for the '<em><b>Use Interpreter Internal Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES = REPOSITORY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ignore Load Errors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY__IGNORE_LOAD_ERRORS = REPOSITORY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EMF Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link kermeta.persistence.impl.KMRepositoryImpl <em>KM Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see kermeta.persistence.impl.KMRepositoryImpl
   * @see kermeta.persistence.impl.PersistencePackageImpl#getKMRepository()
   * @generated
   */
  int KM_REPOSITORY = 6;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_REPOSITORY__TAG = REPOSITORY__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_REPOSITORY__OWNED_TAGS = REPOSITORY__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_REPOSITORY__RESOURCES = REPOSITORY__RESOURCES;

  /**
   * The number of structural features of the '<em>KM Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KM_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link kermeta.persistence.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see kermeta.persistence.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the reference list '{@link kermeta.persistence.Resource#getDependentResources <em>Dependent Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependent Resources</em>'.
   * @see kermeta.persistence.Resource#getDependentResources()
   * @see #getResource()
   * @generated
   */
  EReference getResource_DependentResources();

  /**
   * Returns the meta object for the reference list '{@link kermeta.persistence.Resource#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contents</em>'.
   * @see kermeta.persistence.Resource#getContents()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Contents();

  /**
   * Returns the meta object for the container reference '{@link kermeta.persistence.Resource#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Repository</em>'.
   * @see kermeta.persistence.Resource#getRepository()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Repository();

  /**
   * Returns the meta object for the attribute '{@link kermeta.persistence.Resource#getMetaModelURI <em>Meta Model URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Model URI</em>'.
   * @see kermeta.persistence.Resource#getMetaModelURI()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_MetaModelURI();

  /**
   * Returns the meta object for the attribute '{@link kermeta.persistence.Resource#isIsReadOnly <em>Is Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Read Only</em>'.
   * @see kermeta.persistence.Resource#isIsReadOnly()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_IsReadOnly();

  /**
   * Returns the meta object for the attribute '{@link kermeta.persistence.Resource#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see kermeta.persistence.Resource#getUri()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Uri();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.EMFResource <em>EMF Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMF Resource</em>'.
   * @see kermeta.persistence.EMFResource
   * @generated
   */
  EClass getEMFResource();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.KMResource <em>KM Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KM Resource</em>'.
   * @see kermeta.persistence.KMResource
   * @generated
   */
  EClass getKMResource();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see kermeta.persistence.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the containment reference list '{@link kermeta.persistence.Repository#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see kermeta.persistence.Repository#getResources()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Resources();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.DanglingDiagnostic <em>Dangling Diagnostic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dangling Diagnostic</em>'.
   * @see kermeta.persistence.DanglingDiagnostic
   * @generated
   */
  EClass getDanglingDiagnostic();

  /**
   * Returns the meta object for the reference '{@link kermeta.persistence.DanglingDiagnostic#getReferencingElement <em>Referencing Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referencing Element</em>'.
   * @see kermeta.persistence.DanglingDiagnostic#getReferencingElement()
   * @see #getDanglingDiagnostic()
   * @generated
   */
  EReference getDanglingDiagnostic_ReferencingElement();

  /**
   * Returns the meta object for the reference '{@link kermeta.persistence.DanglingDiagnostic#getDanglingElement <em>Dangling Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dangling Element</em>'.
   * @see kermeta.persistence.DanglingDiagnostic#getDanglingElement()
   * @see #getDanglingDiagnostic()
   * @generated
   */
  EReference getDanglingDiagnostic_DanglingElement();

  /**
   * Returns the meta object for the reference '{@link kermeta.persistence.DanglingDiagnostic#getReferencingProperty <em>Referencing Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referencing Property</em>'.
   * @see kermeta.persistence.DanglingDiagnostic#getReferencingProperty()
   * @see #getDanglingDiagnostic()
   * @generated
   */
  EReference getDanglingDiagnostic_ReferencingProperty();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.EMFRepository <em>EMF Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMF Repository</em>'.
   * @see kermeta.persistence.EMFRepository
   * @generated
   */
  EClass getEMFRepository();

  /**
   * Returns the meta object for the attribute '{@link kermeta.persistence.EMFRepository#isUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Interpreter Internal Resources</em>'.
   * @see kermeta.persistence.EMFRepository#isUseInterpreterInternalResources()
   * @see #getEMFRepository()
   * @generated
   */
  EAttribute getEMFRepository_UseInterpreterInternalResources();

  /**
   * Returns the meta object for the attribute '{@link kermeta.persistence.EMFRepository#isIgnoreLoadErrors <em>Ignore Load Errors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore Load Errors</em>'.
   * @see kermeta.persistence.EMFRepository#isIgnoreLoadErrors()
   * @see #getEMFRepository()
   * @generated
   */
  EAttribute getEMFRepository_IgnoreLoadErrors();

  /**
   * Returns the meta object for class '{@link kermeta.persistence.KMRepository <em>KM Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KM Repository</em>'.
   * @see kermeta.persistence.KMRepository
   * @generated
   */
  EClass getKMRepository();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PersistenceFactory getPersistenceFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.ResourceImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Dependent Resources</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__DEPENDENT_RESOURCES = eINSTANCE.getResource_DependentResources();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__CONTENTS = eINSTANCE.getResource_Contents();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__REPOSITORY = eINSTANCE.getResource_Repository();

    /**
     * The meta object literal for the '<em><b>Meta Model URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__META_MODEL_URI = eINSTANCE.getResource_MetaModelURI();

    /**
     * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__IS_READ_ONLY = eINSTANCE.getResource_IsReadOnly();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__URI = eINSTANCE.getResource_Uri();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.EMFResourceImpl <em>EMF Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.EMFResourceImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getEMFResource()
     * @generated
     */
    EClass EMF_RESOURCE = eINSTANCE.getEMFResource();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.KMResourceImpl <em>KM Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.KMResourceImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getKMResource()
     * @generated
     */
    EClass KM_RESOURCE = eINSTANCE.getKMResource();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.RepositoryImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__RESOURCES = eINSTANCE.getRepository_Resources();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.DanglingDiagnosticImpl <em>Dangling Diagnostic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.DanglingDiagnosticImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getDanglingDiagnostic()
     * @generated
     */
    EClass DANGLING_DIAGNOSTIC = eINSTANCE.getDanglingDiagnostic();

    /**
     * The meta object literal for the '<em><b>Referencing Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT = eINSTANCE.getDanglingDiagnostic_ReferencingElement();

    /**
     * The meta object literal for the '<em><b>Dangling Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DANGLING_DIAGNOSTIC__DANGLING_ELEMENT = eINSTANCE.getDanglingDiagnostic_DanglingElement();

    /**
     * The meta object literal for the '<em><b>Referencing Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY = eINSTANCE.getDanglingDiagnostic_ReferencingProperty();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.EMFRepositoryImpl <em>EMF Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.EMFRepositoryImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getEMFRepository()
     * @generated
     */
    EClass EMF_REPOSITORY = eINSTANCE.getEMFRepository();

    /**
     * The meta object literal for the '<em><b>Use Interpreter Internal Resources</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES = eINSTANCE.getEMFRepository_UseInterpreterInternalResources();

    /**
     * The meta object literal for the '<em><b>Ignore Load Errors</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMF_REPOSITORY__IGNORE_LOAD_ERRORS = eINSTANCE.getEMFRepository_IgnoreLoadErrors();

    /**
     * The meta object literal for the '{@link kermeta.persistence.impl.KMRepositoryImpl <em>KM Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kermeta.persistence.impl.KMRepositoryImpl
     * @see kermeta.persistence.impl.PersistencePackageImpl#getKMRepository()
     * @generated
     */
    EClass KM_REPOSITORY = eINSTANCE.getKMRepository();

  }

} //PersistencePackage
