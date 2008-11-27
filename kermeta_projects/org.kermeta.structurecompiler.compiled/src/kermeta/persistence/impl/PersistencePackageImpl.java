/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistencePackageImpl.java,v 1.9 2008-11-27 15:50:06 cfaucher Exp $
 */
package kermeta.persistence.impl;

import kermeta.KermetaPackage;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

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
import kermeta.persistence.PersistenceFactory;
import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import km2ecore.Km2ecorePackage;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simk.SimkPackage;

import simk.impl.SimkPackageImpl;

import traceability.TraceabilityPackage;

import traceability.impl.TraceabilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements
		PersistencePackage {
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
	private PersistencePackageImpl() {
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
	public static PersistencePackage init() {
		if (isInited)
			return (PersistencePackage) EPackage.Registry.INSTANCE
					.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new PersistencePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI)
				: LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_1 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI) instanceof km2ecore.helper.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI)
				: km2ecore.helper.ecore.EcorePackage.eINSTANCE);
		km2ecore.helper.kermeta.impl.KermetaPackageImpl theKermetaPackage_1 = (km2ecore.helper.kermeta.impl.KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI) instanceof km2ecore.helper.kermeta.impl.KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI)
				: km2ecore.helper.kermeta.KermetaPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI)
				: JavaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI)
				: CommonPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI)
				: ExceptionPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Repository() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_IsReadOnly() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_MetaModelURI() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Uri() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFResource() {
		return emfResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Resources() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDanglingDiagnostic() {
		return danglingDiagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingDiagnostic_ReferencingElement() {
		return (EReference) danglingDiagnosticEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingDiagnostic_DanglingElement() {
		return (EReference) danglingDiagnosticEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingDiagnostic_ReferencingProperty() {
		return (EReference) danglingDiagnosticEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFRepository() {
		return emfRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFRepository_IgnoreLoadErrorUnknownMetaclass() {
		return (EAttribute) emfRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFRepository_UseInterpreterInternalResources() {
		return (EAttribute) emfRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFRepository_IgnoreAllLoadErrors() {
		return (EAttribute) emfRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFRepository_IgnoreLoadErrorUnknownProperty() {
		return (EAttribute) emfRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__REPOSITORY);
		createEAttribute(resourceEClass, RESOURCE__IS_READ_ONLY);
		createEAttribute(resourceEClass, RESOURCE__META_MODEL_URI);
		createEAttribute(resourceEClass, RESOURCE__URI);

		emfResourceEClass = createEClass(EMF_RESOURCE);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__RESOURCES);

		danglingDiagnosticEClass = createEClass(DANGLING_DIAGNOSTIC);
		createEReference(danglingDiagnosticEClass,
				DANGLING_DIAGNOSTIC__REFERENCING_ELEMENT);
		createEReference(danglingDiagnosticEClass,
				DANGLING_DIAGNOSTIC__DANGLING_ELEMENT);
		createEReference(danglingDiagnosticEClass,
				DANGLING_DIAGNOSTIC__REFERENCING_PROPERTY);

		emfRepositoryEClass = createEClass(EMF_REPOSITORY);
		createEAttribute(emfRepositoryEClass,
				EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_METACLASS);
		createEAttribute(emfRepositoryEClass,
				EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES);
		createEAttribute(emfRepositoryEClass,
				EMF_REPOSITORY__IGNORE_ALL_LOAD_ERRORS);
		createEAttribute(emfRepositoryEClass,
				EMF_REPOSITORY__IGNORE_LOAD_ERROR_UNKNOWN_PROPERTY);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theStandardPackage.getSet());
		EGenericType g2 = createEGenericType(theStructurePackage.getObject());
		g1.getETypeArguments().add(g2);
		resourceEClass.getEGenericSuperTypes().add(g1);
		emfResourceEClass.getESuperTypes().add(this.getResource());
		repositoryEClass.getESuperTypes().add(theStructurePackage.getObject());
		danglingDiagnosticEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		emfRepositoryEClass.getESuperTypes().add(this.getRepository());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Repository(), this.getRepository(), this
				.getRepository_Resources(), "repository", null, 0, 1,
				Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_IsReadOnly(), theStandardPackage
				.getJavaBoolean(), "isReadOnly", "false", 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_MetaModelURI(), theStandardPackage
				.getJavaString(), "metaModelURI", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Uri(), theStandardPackage.getJavaString(),
				"uri", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(resourceEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(resourceEClass, null, "saveWithNewURI",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "new_uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceEClass, null, "findDanglingModelElements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getDanglingDiagnostic());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(resourceEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEClass, this.getResource(), "instances", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEClass, theStandardPackage.getJavaString(),
				"normalizedUri", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(resourceEClass, this.getResource(),
				"getterDependentResources", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(resourceEClass, theStructurePackage.getObject(),
				"getterContents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emfResourceEClass, EMFResource.class, "EMFResource",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(emfResourceEClass, null, "save", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(emfResourceEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emfResourceEClass, null, "saveWithNewURI", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "new_uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(emfResourceEClass, theStandardPackage.getJavaBoolean(),
				"saveAndValidateWithEMF", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(emfResourceEClass, null, "load", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(emfResourceEClass, null, "add", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "instance", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Resources(), this.getResource(), this
				.getResource_Repository(), "resources", null, 0, -1,
				Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = addEOperation(repositoryEClass, this.getResource(),
				"createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "mm_uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(repositoryEClass,
				theStandardPackage.getJavaString(), "normalizeUri", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(repositoryEClass, null, "findDanglingModelElements",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getDanglingDiagnostic());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(repositoryEClass, this.getResource(), "getResource",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(danglingDiagnosticEClass, DanglingDiagnostic.class,
				"DanglingDiagnostic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDanglingDiagnostic_ReferencingElement(),
				theStructurePackage.getObject(), null, "referencingElement",
				null, 0, 1, DanglingDiagnostic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDanglingDiagnostic_DanglingElement(),
				theStructurePackage.getObject(), null, "danglingElement", null,
				0, 1, DanglingDiagnostic.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDanglingDiagnostic_ReferencingProperty(),
				theStructurePackage.getProperty(), null, "referencingProperty",
				null, 0, 1, DanglingDiagnostic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(danglingDiagnosticEClass, theStandardPackage
				.getJavaString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(emfRepositoryEClass, EMFRepository.class, "EMFRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFRepository_IgnoreLoadErrorUnknownMetaclass(),
				theStandardPackage.getJavaBoolean(),
				"ignoreLoadErrorUnknownMetaclass", "false", 0, 1,
				EMFRepository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEMFRepository_UseInterpreterInternalResources(),
				theStandardPackage.getJavaBoolean(),
				"useInterpreterInternalResources", "false", 0, 1,
				EMFRepository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEMFRepository_IgnoreAllLoadErrors(),
				theStandardPackage.getJavaBoolean(), "ignoreAllLoadErrors",
				"false", 0, 1, EMFRepository.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFRepository_IgnoreLoadErrorUnknownProperty(),
				theStandardPackage.getJavaBoolean(),
				"ignoreLoadErrorUnknownProperty", "false", 0, 1,
				EMFRepository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(emfRepositoryEClass, this.getResource(),
				"createResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "mm_uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emfRepositoryEClass, null, "registerEcoreFile", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "mm_uri", 0, 1,
				IS_UNIQUE, IS_ORDERED);

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
	protected void createKermetaAnnotations() {
		String source = "kermeta";
		addAnnotation(this, source, new String[] { "ecoreUri",
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/persistence" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains the classes that handle the serialization of models, in particular\n * EMF models.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/persistence_package.png\"/>\n */" });
		addAnnotation(
				resourceEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * The main class that handle a loaded/saved model.\n * There are a few important things to note for the developer :\n * \n * - load a Resource : this loads a Collection of instances corresponding to the\n *   objects in the loaded model. If the Collection of instances is empty, than \n *\t a ResourceLoadException is raised\n *\n * - save a Resource : this saves the collection of instances in a new file. This can\n *   be correctly done if and only if the instances saved are conform to the metamodel\n *   linked to this resource (this link does not need to be explicit. It is normally retrieved\n *   through the EMF model -- see Java wrapping \"Resource.java\").\n * \n * - add/remove an instance to the Resource : this adds an element in the resource. It cannot\n *   be \"simply\" added because of the following potential errors :\n *\n *   - The object added is not conform to the metamodel -> Error\n *   - The object was already added in the resource -> Not a real error : we do nothing\n *   - The object to remove does not exist -> redirect to a collection-specific error\n *   - The object to remove is attached to an object in the collection -> \"dependency-violation\" exception?\n\n */" });
		addAnnotation(resourceEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				resourceEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Save a Resource in the file specified by the current value of uri \n\t */" });
		addAnnotation(
				resourceEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Save a Resource in a file referenced by the new uri.\n\t * note: this doesn\'t change the URI of the resource, it is only saved in another place \n\t */" });
		addAnnotation(
				resourceEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Search for elements referenced by one element contained by this resource that are not contained by this repository\n\t * ie. element that EMF would claim as \"not contained in a resource\"\n\t * checks only objects directly referenced by the element in this resource, ignores indirectly referenced objects\n\t * example of use :\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\n\t *\treport := resource.findDanglingModelElements()\n\t *\treport.each{ diag | stdio.writeln(diag.toString ) }\n\t */" });
		addAnnotation(resourceEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				resourceEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Loads the Resource, thus making content of the Resource browsable.\n\t * Raises a ResourceLoadException in case loaded Resource is empty\n\t */" });
		addAnnotation(
				resourceEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * The entities contained in the model-instance, that are provided when user loads a resource \n\t * instances == rootContents\n\t * this is a loop on Resource itself in order to get backward compatibility\n\t */" });
		addAnnotation(
				resourceEClass.getEOperations().get(4),
				source,
				new String[] { "deprecated",
						"user should use the resource directly since this is a collection" });
		addAnnotation(
				resourceEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Return a normalized version of the Uri of this resource\n\t * in order to prevent several loading of the same file because they have diffent path that leads to them, kermeta uses normalizedURI\n\t * for some of its functions (eg. repository.getResource )\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\n\t * to check how a given uri is normalized by kermeta\n\t */" });
		addAnnotation(
				getResource_Repository(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Repository used to create the Resource\n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \n\t * one Resource of a given Repository\n\t */" });
		addAnnotation(
				getResource_IsReadOnly(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Indicates weither this resource will be updated when saving the repository\n\t * This is useful if the repository contains some metamodels that should not be saved.\n\t *\n\t * Note that in the current version, it doesn\'t ensure that you have not modified its content (using the freeze)\n\t * If you modify the elements of such resource, other resource that depend on it will be incorrectly saved \n\t */" });
		addAnnotation(
				getResource_MetaModelURI(),
				source,
				new String[] { "documentation",
						"/**\n\t * Uri of the meta-model of the Resource to load\n\t */" });
		addAnnotation(getResource_Uri(), source,
				new String[] { "documentation",
						"/**\n\t * Uri of the Resource to load\n\t */" });
		addAnnotation(
				emfResourceEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Extension of the Resource class definition that is specific to EMF Repository.\n * User is not supposed to directly create it. Otherwise it will not be correctly initialized\n * You must To create one \n */" });
		addAnnotation(emfResourceEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\n\t * Overrides Resource.save()\n\t */" });
		addAnnotation(emfResourceEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::persistence::Resource" });
		addAnnotation(
				emfResourceEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Set<Object>.remove(Object)\n\t * Remove the instance from the Resource\n\t */" });
		addAnnotation(emfResourceEClass.getEOperations().get(1), source,
				new String[] { "superOperation", "kermeta::standard::Set" });
		addAnnotation(
				emfResourceEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides Resource.saveWithNewURI(String)\n\t */" });
		addAnnotation(emfResourceEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::persistence::Resource" });
		addAnnotation(
				emfResourceEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Checks the Resource using the EMF validation function, and saves it if\n\t * validation succeeds\n\t * Applies validation to all root objects of the Resource\n\t * Returns true if the validation reports no error, raises exceptions otherwise\n\t */" });
		addAnnotation(
				emfResourceEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Resource.load()\n\t * In case the metamodelURI was not previously set, metamodelURI is filled with\n\t * the nsuri of the root package of the metamodel used to load the Resource after\n\t * a successful load\n\t */" });
		addAnnotation(emfResourceEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::persistence::Resource" });
		addAnnotation(
				emfResourceEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Set<Object>.add(Object)\n\t * Add an instance to the Resource \n\t * Ensures that the instance is referenced by a one and only one Resource of the same Repository\n\t * Ensures that the instance does not appear more than once in the Resource\n\t */" });
		addAnnotation(emfResourceEClass.getEOperations().get(5), source,
				new String[] { "superOperation", "kermeta::standard::Set" });
		addAnnotation(
				repositoryEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Abstract resource container, that contains a list of available loaded resources, \n * and methods to create or get a resource given an URI.\n * A repository cannot contain 2 resources which points to the same file (ie. that have the same normalizedURI)\n */" });
		addAnnotation(repositoryEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				repositoryEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Creates a new Resource with given uri, and an optional mm_uri\n\t * mm_uri is required when creating a new model from scratch.\n\t * Raises a ResourceCreate exception in case the Repository already\n\t * contains a Resource with the given uri\n\t * If uri does not points to an existing model file (in the case of\n\t * a model creation), calls to load() operation will fail as long as\n\t * the model has not been saved once\n\t */" });
		addAnnotation(
				repositoryEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Return a normalized version of the Uri \n\t * in order to prevent several loading of the same file because they have different path that leads to them, kermeta uses normalizedURI\n\t * for some of its functions (eg. repository.getResource )\n\t * As EMF needs URI of the form platform:/resource or platform:/plugin, kermeta automatically\n\t * normalize the uri when loading or saving. This is especially true for file:/ uri or relative uri (./ or / ) \n\t * If you wish to know what concrete uri is used by kermeta when loading and saving you can use this function\n\t * to check how a given uri is normalized by kermeta \n\t */" });
		addAnnotation(
				repositoryEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Search for elements referenced by one element contained by this repository  that are not contained by this repository\n\t * ie. element that EMF would claim as \"not contained in a resource\"\n\t * example of use :\n\t *  var report : Set&lt;DanglingDiagnostic&gt;\n     *\treport := repository.findDanglingModelElements()\n     *\treport.each{ diag | stdio.writeln(diag.toString ) }\n\t */" });
		addAnnotation(
				repositoryEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Resource associated with the given uri if this uri is associated with\n\t * an already created Resource of the Repository.\n\t * If the Repository contains no Resource associated with the given uri, creates\n\t * a new Resource and loads it.\n\t * In order to prevent multiple load of the same file by using variant path to the same file, all URI used by this function are normalized\n\t * Raises a ResourceCreate exception if the given uri does not point to an existing\n\t * model file \n\t * May also raises loading exceptions if this is the first retrieval of the resource\n\t */" });
		addAnnotation(
				getRepository_Resources(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Resources created by this Repository \n\t * This feature is supposed read only, otherwise it cannot garantee that an element is contained by only \n\t * one Resource of a given Repository\n\t */" });
		addAnnotation(
				danglingDiagnosticEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * class used to gather the information required to make a user friendly report about a dangling element\n * (see. findDanglingModelElements())\n */" });
		addAnnotation(
				danglingDiagnosticEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * user friendly message build with those informations\n\t */" });
		addAnnotation(danglingDiagnosticEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				getDanglingDiagnostic_ReferencingElement(),
				source,
				new String[] { "documentation",
						"/**\n\t * Element that has a reference to the dangling element  \n\t */" });
		addAnnotation(
				getDanglingDiagnostic_DanglingElement(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Element that is not contained by a resource in the repository  \n\t */" });
		addAnnotation(
				getDanglingDiagnostic_ReferencingProperty(),
				source,
				new String[] { "documentation",
						"/**\n\t * Property used to reference the dangling element  \n\t */" });
		addAnnotation(
				emfRepositoryEClass,
				source,
				new String[] { "documentation",
						"/**\n * Repository that stores and manages resources that come from EMF\n */" });
		addAnnotation(
				emfRepositoryEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Repository.createResource(String, String)\n\t * Create a new resource for a model given by its uri, \n\t * which meta-model is stored in file given by mm_uri\n\t * If file already exists, you\'ll be able to call the load method to concretly load the model\n\t * otherwise, you can only call the save method\n\t */" });
		addAnnotation(emfRepositoryEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::persistence::Repository" });
		addAnnotation(
				emfRepositoryEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t  * Register the content of the given ecore file into EMF registry\n\t  * Once registered, EMF will be able to load and save models conformant to this ecore file\n\t  * Warning: if the NSURI you wish to register is already, registered (either statically or due to a previous call)\n\t  *  it will do nothing. Ie. modification in the ecore file will not be taken into account unless you manually unregister it.\t    \n\t  */" });
		addAnnotation(
				getEMFRepository_IgnoreLoadErrorUnknownMetaclass(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * When loading the Resources, \n\t * if there are some errors due to an unknown metaclass while loading some objects, the loader try to ignore them\n\t * by default, not setting this attribute is considered as false.\n\t */" });
		addAnnotation(
				getEMFRepository_UseInterpreterInternalResources(),
				source,
				new String[] {
						"documentation",
						"/** \n\t * If true, tells to the save of the resources that they should also integrate the resources from Kermeta interpreter itself\n\t * this is useful for example to make a dependency to framework.km\n\t * by default, not setting this is considered as false.\n\t */" });
		addAnnotation(
				getEMFRepository_IgnoreAllLoadErrors(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * When loading the Resources, \n\t * if there are some errors while loading some objects, the loader can try to ignore them\n\t * setting this attribute to true is equivalent to setting ignoreLoadErrorUnknownMetaclass and ignoreLoadErrorUnknownProperty to true\n\t * by default, not setting this attribute is considered as false.\n\t */" });
		addAnnotation(
				getEMFRepository_IgnoreLoadErrorUnknownProperty(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * When loading the Resources, \n\t * if there are some errors due to an unknown property while loading some objects (ie. the metaclass is known but it cannot retreive\n\t * the given reference or attribute in the ClassDefinition, the loader try to ignore them\n\t * by default, not setting this attribute is considered as false.\n\t */" });
	}

} //PersistencePackageImpl
