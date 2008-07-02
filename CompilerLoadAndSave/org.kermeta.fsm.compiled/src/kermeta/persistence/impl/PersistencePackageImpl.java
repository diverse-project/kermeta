/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: PersistencePackageImpl.java,v 1.1 2008-07-02 09:13:18 ftanguy Exp $
 */
package kermeta.persistence.impl;

import fsm.FsmPackage;

import fsm.impl.FsmPackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.DanglingDiagnostic;
import kermeta.persistence.EMFRepository;
import kermeta.persistence.EMFResource;
import kermeta.persistence.KMRepository;
import kermeta.persistence.KMResource;
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emfResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kmResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass danglingDiagnosticEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emfRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kmRepositoryEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see kermeta.persistence.PersistencePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PersistencePackageImpl()
  {
    super(eNS_URI, PersistenceFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PersistencePackage init()
  {
    if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

    // Obtain or create and register package
    PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PersistencePackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KermetaPackage.eNS_URI) : KermetaPackage.eINSTANCE);
    LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
    StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
    BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
    StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI) : StandardPackage.eINSTANCE);
    UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI) : UtilsPackage.eINSTANCE);
    IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
    KunitPackageImpl theKunitPackage = (KunitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KunitPackage.eNS_URI) : KunitPackage.eINSTANCE);
    EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);
    InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterpreterPackage.eNS_URI) : InterpreterPackage.eINSTANCE);
    ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
    FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);

    // Create package meta-data objects
    thePersistencePackage.createPackageContents();
    theKermetaPackage.createPackageContents();
    theLanguagePackage.createPackageContents();
    theStructurePackage.createPackageContents();
    theBehaviorPackage.createPackageContents();
    theStandardPackage.createPackageContents();
    theUtilsPackage.createPackageContents();
    theIoPackage.createPackageContents();
    theKunitPackage.createPackageContents();
    theEcorePackage.createPackageContents();
    theInterpreterPackage.createPackageContents();
    theExceptionsPackage.createPackageContents();
    theFsmPackage.createPackageContents();

    // Initialize created meta-data
    thePersistencePackage.initializePackageContents();
    theKermetaPackage.initializePackageContents();
    theLanguagePackage.initializePackageContents();
    theStructurePackage.initializePackageContents();
    theBehaviorPackage.initializePackageContents();
    theStandardPackage.initializePackageContents();
    theUtilsPackage.initializePackageContents();
    theIoPackage.initializePackageContents();
    theKunitPackage.initializePackageContents();
    theEcorePackage.initializePackageContents();
    theInterpreterPackage.initializePackageContents();
    theExceptionsPackage.initializePackageContents();
    theFsmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePersistencePackage.freeze();

    return thePersistencePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_DependentResources()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_Contents()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_Repository()
  {
    return (EReference)resourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_IsReadOnly()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_MetaModelURI()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Uri()
  {
    return (EAttribute)resourceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMFResource()
  {
    return emfResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKMResource()
  {
    return kmResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Resources()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDanglingDiagnostic()
  {
    return danglingDiagnosticEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDanglingDiagnostic_ReferencingElement()
  {
    return (EReference)danglingDiagnosticEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDanglingDiagnostic_DanglingElement()
  {
    return (EReference)danglingDiagnosticEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDanglingDiagnostic_ReferencingProperty()
  {
    return (EReference)danglingDiagnosticEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMFRepository()
  {
    return emfRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMFRepository_UseInterpreterInternalResources()
  {
    return (EAttribute)emfRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMFRepository_IgnoreLoadErrors()
  {
    return (EAttribute)emfRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKMRepository()
  {
    return kmRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersistenceFactory getPersistenceFactory()
  {
    return (PersistenceFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    resourceEClass = createEClass(RESOURCE);
    createEReference(resourceEClass, RESOURCE__DEPENDENT_RESOURCES);
    createEReference(resourceEClass, RESOURCE__CONTENTS);
    createEReference(resourceEClass, RESOURCE__REPOSITORY);
    createEAttribute(resourceEClass, RESOURCE__IS_READ_ONLY);
    createEAttribute(resourceEClass, RESOURCE__META_MODEL_URI);
    createEAttribute(resourceEClass, RESOURCE__URI);

    emfResourceEClass = createEClass(EMF_RESOURCE);

    kmResourceEClass = createEClass(KM_RESOURCE);

    repositoryEClass = createEClass(REPOSITORY);
    createEReference(repositoryEClass, REPOSITORY__RESOURCES);

    danglingDiagnosticEClass = createEClass(DANGLING_DIAGNOSTIC);
    createEReference(danglingDiagnosticEClass, DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT);
    createEReference(danglingDiagnosticEClass, DANGLING_DIAGNOSTIC__DANGLING_ELEMENT);
    createEReference(danglingDiagnosticEClass, DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY);

    emfRepositoryEClass = createEClass(EMF_REPOSITORY);
    createEAttribute(emfRepositoryEClass, EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES);
    createEAttribute(emfRepositoryEClass, EMF_REPOSITORY__IGNORE_LOAD_ERRORS);

    kmRepositoryEClass = createEClass(KM_REPOSITORY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);
    StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    EGenericType g1 = createEGenericType(theStandardPackage.getSet());
    EGenericType g2 = createEGenericType(theStructurePackage.getObject());
    g1.getETypeArguments().add(g2);
    resourceEClass.getEGenericSuperTypes().add(g1);
    emfResourceEClass.getESuperTypes().add(this.getResource());
    kmResourceEClass.getESuperTypes().add(this.getResource());
    repositoryEClass.getESuperTypes().add(theStructurePackage.getObject());
    danglingDiagnosticEClass.getESuperTypes().add(theStructurePackage.getObject());
    emfRepositoryEClass.getESuperTypes().add(this.getRepository());
    kmRepositoryEClass.getESuperTypes().add(this.getRepository());

    // Initialize classes and features; add operations and parameters
    initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResource_DependentResources(), this.getResource(), null, "dependentResources", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getResource_Contents(), theStructurePackage.getObject(), null, "contents", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getResource_Repository(), this.getRepository(), this.getRepository_Resources(), "repository", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_IsReadOnly(), theStandardPackage.getBoolean(), "isReadOnly", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_MetaModelURI(), theStandardPackage.getString(), "metaModelURI", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResource_Uri(), theStandardPackage.getString(), "uri", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(resourceEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = addEOperation(resourceEClass, null, "saveWithNewURI", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "new_uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(resourceEClass, null, "findDanglingModelElements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getSet());
    g2 = createEGenericType(this.getDanglingDiagnostic());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    addEOperation(resourceEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(resourceEClass, this.getResource(), "instances", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emfResourceEClass, EMFResource.class, "EMFResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(emfResourceEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emfResourceEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emfResourceEClass, null, "saveWithNewURI", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "new_uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emfResourceEClass, theStandardPackage.getBoolean(), "saveAndValidateWithEMF", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(emfResourceEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emfResourceEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(kmResourceEClass, KMResource.class, "KMResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(kmResourceEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(kmResourceEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(kmResourceEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(kmResourceEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(repositoryEClass, Repository.class, "Repository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepository_Resources(), this.getResource(), this.getResource_Repository(), "resources", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(repositoryEClass, this.getResource(), "createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "mm_uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(repositoryEClass, null, "findDanglingModelElements", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(theStandardPackage.getSet());
    g2 = createEGenericType(this.getDanglingDiagnostic());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = addEOperation(repositoryEClass, this.getResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(danglingDiagnosticEClass, DanglingDiagnostic.class, "DanglingDiagnostic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDanglingDiagnostic_ReferencingElement(), theStructurePackage.getObject(), null, "referencingElement", null, 0, 1, DanglingDiagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDanglingDiagnostic_DanglingElement(), theStructurePackage.getObject(), null, "danglingElement", null, 0, 1, DanglingDiagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDanglingDiagnostic_ReferencingProperty(), theStructurePackage.getProperty(), null, "referencingProperty", null, 0, 1, DanglingDiagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(danglingDiagnosticEClass, theStandardPackage.getString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(emfRepositoryEClass, EMFRepository.class, "EMFRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEMFRepository_UseInterpreterInternalResources(), theStandardPackage.getBoolean(), "useInterpreterInternalResources", null, 0, 1, EMFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMFRepository_IgnoreLoadErrors(), theStandardPackage.getBoolean(), "ignoreLoadErrors", null, 0, 1, EMFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(emfRepositoryEClass, this.getResource(), "createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "mm_uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(emfRepositoryEClass, theStandardPackage.getString(), "normalizeUri", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(kmRepositoryEClass, KMRepository.class, "KMRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(kmRepositoryEClass, this.getResource(), "createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theStandardPackage.getString(), "mm_uri", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Create annotations
    // kermeta
    createKermetaAnnotations();
  }

  /**
   * Initializes the annotations for <b>kermeta</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createKermetaAnnotations()
  {
    String source = "kermeta";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Contains the classes that handle the serialization of models, in particular\r\n * EMF models.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/persistence_package.png\"/>\r\n */"
       });		
    addAnnotation
      (resourceEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * The main class that handle a loaded/saved model.\r\n * There are a few important things to note for the developer :\r\n * \r\n * - load a Resource : this loads a Collection of instances corresponding to the\r\n *   objects in the loaded model. If the Collection of instances is empty, than \r\n *\t a ResourceLoadException is raised\r\n *\r\n * - save a Resource : this saves the collection of instances in a new file. This can\r\n *   be correctly done if and only if the instances saved are conform to the metamodel\r\n *   linked to this resource (this link does not need to be explicit. It is normally retrieved\r\n *   through the EMF model -- see Java wrapping \"Resource.java\").\r\n * \r\n * - add/remove an instance to the Resource : this adds an element in the resource. It cannot\r\n *   be \"simply\" added because of the following potential errors :\r\n *\r\n *   - The object added is not conform to the metamodel -> Error\r\n *   - The object was already added in the resource -> Not a real error : we do nothing\r\n *   - The object to remove does not exist -> redirect to a collection-specific error\r\n *   - The object to remove is attached to an object in the collection -> \"dependency-violation\" exception?\r\n\r\n */"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Save a Resource in the file specified by the current value of uri \r\n\t */"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Save a Resource in a file referenced by the new uri. \r\n\t */"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Search for elements referenced by one element contained by this resource that are not contained by this repository\r\n\t * ie. element that EMF would claim as \"not contained in a resource\"\r\n\t * checks only objects directly referenced by the elment in this resource, ignores inderecly referenced objects\r\n\t * example of use :\r\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\r\n\t *\treport := resource.findDanglingModelElements()\r\n\t *\treport.each{ diag | stdio.writeln(diag.toString ) }\r\n\t */"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Loads the Resource, thus making content of the Resource browsable.\r\n\t * Raises a ResourceLoadException in case loaded Resource is empty\r\n\t */"
       });		
    addAnnotation
      (resourceEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * The entities contained in the model-instance, that are provided when user loads a resource \r\n\t * instances == rootContents\r\n\t * this is a loop on Resource itself in order to get backward compatibility\r\n\t * user should use the resource directly since this is a collection\r\n\t */"
       });		
    addAnnotation
      (getResource_DependentResources(), 
       source, 
       new String[] 
       {
       "isReadOnly", "true"
       });		
    addAnnotation
      (getResource_Contents(), 
       source, 
       new String[] 
       {
       "isReadOnly", "true"
       });		
    addAnnotation
      (emfResourceEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Extension of the Resource class definition that is specific to EMF Repository.\r\n * User is not supposed to directly create it. Otherwise it will not be correctly initialized\r\n * You must To create one \r\n */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Set<Object>.remove(Object)\r\n\t * Remove the instance from the Resource\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Set"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Resource.save()\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Resource"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Resource.saveWithNewURI(String)\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Resource"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Checks the Resource using the EMF validation function, and saves it if\r\n\t * validation succeeds\r\n\t * Applies validation to all root objects of the Resource\r\n\t * Returns true if the validation reports no error, raises exceptions otherwise\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Resource.load()\r\n\t * In case the metamodelURI was not previously set, metamodelURI is filled with\r\n\t * the nsuri of the root package of the metamodel used to load the Resource after\r\n\t * a successful load\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(4), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Resource"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Set<Object>.add(Object)\r\n\t * Add an instance to the Resource \r\n\t * Ensures that the instance is referenced by a one and only one Resource of the same Repository\r\n\t * Ensures that the instance does not appear more than once in the Resource\r\n\t */"
       });		
    addAnnotation
      (emfResourceEClass.getEOperations().get(5), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Set"
       });		
    addAnnotation
      (kmResourceEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * NOT IMPLEMENTED\r\n */"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Set"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Resource"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Resource"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (kmResourceEClass.getEOperations().get(3), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::standard::Set"
       });		
    addAnnotation
      (repositoryEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Abstract resource container, that contains a list of available loaded resources, \r\n * and methods to create or get a resource given an URI.\r\n */"
       });		
    addAnnotation
      (repositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "isAbstract", "true"
       });		
    addAnnotation
      (repositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Creates a new Resource with given uri, and an optional mm_uri\r\n\t * mm_uri is required when creating a new model from scratch.\r\n\t * Raises a ResourceCreate exception in case the Repository already\r\n\t * contains a Resource with the given uri\r\n\t * If uri does not points to an existing model file (in the case of\r\n\t * a model creation), calls to load() operation will fail as long as\r\n\t * the model has not been saved once\r\n\t */"
       });		
    addAnnotation
      (repositoryEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Search for elements referenced by one element contained by this repository  that are not contained by this repository\r\n\t * ie. element that EMF would claim as \"not contained in a resource\"\r\n\t * example of use :\r\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\r\n     *\treport := repository.findDanglingModelElements()\r\n     *\treport.each{ diag | stdio.writeln(diag.toString ) }\r\n\t */"
       });		
    addAnnotation
      (repositoryEClass.getEOperations().get(2), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Returns the Resource associated with the given uri if this uri is associated with\r\n\t * an already created Resource of the Repository.\r\n\t * If the Repository contains no Resource associated with the given uri, creates\r\n\t * a new Resource and loads it.\r\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\r\n\t * model file \r\n\t */"
       });		
    addAnnotation
      (danglingDiagnosticEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * class used to gather the information required to make a user friendly report about a dangling element\r\n * (see. findDanglingModelElements())\r\n */"
       });		
    addAnnotation
      (danglingDiagnosticEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * user friendly message build with those informations\r\n\t */"
       });		
    addAnnotation
      (danglingDiagnosticEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::language::structure::Object"
       });		
    addAnnotation
      (emfRepositoryEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Repository that stores and manages resources that come from EMF\r\n */"
       });		
    addAnnotation
      (emfRepositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Overrides Repository.createResource(String, String)\r\n\t * Create a new resource for a model given by its uri, \r\n\t * which meta-model is stored in file given by mm_uri\r\n\t * If file already exists, you\'ll be able to call the load method to concretly load the model\r\n\t * otherwise, you can only call the save method\r\n\t */"
       });		
    addAnnotation
      (emfRepositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Repository"
       });		
    addAnnotation
      (emfRepositoryEClass.getEOperations().get(1), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n\t * Return a normalized version of the Uri\r\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\r\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \r\n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\r\n\t * to check how a given uri is normalized by kermeta\r\n\t */"
       });		
    addAnnotation
      (kmRepositoryEClass, 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n * Repository that stores and manages XMI files representing Kermeta models\r\n */"
       });		
    addAnnotation
      (kmRepositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "documentation", "/**\r\n \t * NOT IMPLEMENTED\r\n \t */"
       });		
    addAnnotation
      (kmRepositoryEClass.getEOperations().get(0), 
       source, 
       new String[] 
       {
       "superOperation", "kermeta::persistence::Repository"
       });
  }

} //PersistencePackageImpl
