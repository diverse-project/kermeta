/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerPackageImpl.java,v 1.8 2008-11-07 08:54:19 cfaucher Exp $
 */
package kermeta.compiler.impl;

import kermeta.compiler.CompilerFactory;
import kermeta.compiler.CompilerPackage;
import kermeta.compiler.Main;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

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

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import km2ecore.Km2ecorePackage;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.ecore.EcorePackage;

import km2ecore.helper.ecore.impl.EcorePackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.helper.kermeta.KermetaPackage;

import km2ecore.helper.kermeta.impl.KermetaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

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
public class CompilerPackageImpl extends EPackageImpl implements
		CompilerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

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
	 * @see kermeta.compiler.CompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompilerPackageImpl() {
		super(eNS_URI, CompilerFactory.eINSTANCE);
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
	public static CompilerPackage init() {
		if (isInited)
			return (CompilerPackage) EPackage.Registry.INSTANCE
					.getEPackage(CompilerPackage.eNS_URI);

		// Obtain or create and register package
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new CompilerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI)
				: JavaPackage.eINSTANCE);
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI)
				: CommonPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI)
				: ExceptionPackage.eINSTANCE);
		kermeta.impl.KermetaPackageImpl theKermetaPackage_1 = (kermeta.impl.KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(kermeta.KermetaPackage.eNS_URI) instanceof kermeta.impl.KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(kermeta.KermetaPackage.eNS_URI)
				: kermeta.KermetaPackage.eINSTANCE);
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
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		kermeta.ecore.impl.EcorePackageImpl theEcorePackage_1 = (kermeta.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) instanceof kermeta.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI)
				: kermeta.ecore.EcorePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theCompilerPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theCompilerPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompilerPackage.freeze();

		return theCompilerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Context() {
		return (EReference) mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerFactory getCompilerFactory() {
		return (CompilerFactory) getEFactoryInstance();
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
		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__CONTEXT);
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
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mainEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_Context(), theKm2ecorePackage
				.getKM2EcoreContext(), null, "context", null, 1, 1, Main.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = addEOperation(mainEClass, null,
				"main_km2ecore_onlyEcore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "main_km2ecore_behaviorJava", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "main_mode3", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "traceInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "output", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getCompilingMode(), "mode", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "main_mode2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "traceInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "output", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getCompilingMode(), "mode", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(mainEClass, null, "main_inner", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(mainEClass, null, "main_compilingOnlyOperations", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "traceInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "output", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getCompilingMode(), "mode", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theStandardPackage.getOrderedSet());
		EGenericType g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "operations", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, theStructurePackage.getTypeDefinition(),
				"getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "qn", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, theStandardPackage.getJavaString(),
				"typeDefinitionToString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getTypeDefinition(), "td", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "main", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mainEClass, null, "main_mode", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "traceInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "output", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getCompilingMode(), "mode", 0, 1,
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
				"http://www.kermeta.org/kermeta/compiler" });
		addAnnotation(this, source, new String[] { "usage", "launcher" });
		addAnnotation(mainEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/*****************************************/" });
		addAnnotation(mainEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/********** METHODS FOR TESTING **********/" });
		addAnnotation(mainEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/*****************************************/" });
	}

} //CompilerPackageImpl
