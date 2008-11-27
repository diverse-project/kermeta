/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaPackageImpl.java,v 1.9 2008-11-27 15:49:51 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

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

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.helper.kermeta.CompilerHelperJava;
import km2ecore.helper.kermeta.GenericTypeDefinitionHelper;
import km2ecore.helper.kermeta.KermetaFactory;
import km2ecore.helper.kermeta.KermetaPackage;

import km2ecore.impl.Km2ecorePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
public class KermetaPackageImpl extends EPackageImpl implements KermetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerHelperJavaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeDefinitionHelperEClass = null;

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
	 * @see km2ecore.helper.kermeta.KermetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KermetaPackageImpl() {
		super(eNS_URI, KermetaFactory.eINSTANCE);
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
	public static KermetaPackage init() {
		if (isInited)
			return (KermetaPackage) EPackage.Registry.INSTANCE
					.getEPackage(KermetaPackage.eNS_URI);

		// Obtain or create and register package
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new KermetaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
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
		theKermetaPackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theIoPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();

		// Initialize created meta-data
		theKermetaPackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKermetaPackage.freeze();

		return theKermetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilerHelperJava() {
		return compilerHelperJavaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTypeDefinitionHelper() {
		return genericTypeDefinitionHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaFactory getKermetaFactory() {
		return (KermetaFactory) getEFactoryInstance();
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
		compilerHelperJavaEClass = createEClass(COMPILER_HELPER_JAVA);

		genericTypeDefinitionHelperEClass = createEClass(GENERIC_TYPE_DEFINITION_HELPER);
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
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);
		ecore.EcorePackage theEcorePackage_2 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compilerHelperJavaEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		genericTypeDefinitionHelperEClass.getESuperTypes().add(
				theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(compilerHelperJavaEClass, CompilerHelperJava.class,
				"CompilerHelperJava", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(compilerHelperJavaEClass,
				theStandardPackage.getJavaString(), "ppComaSeparatedNodes", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theStandardPackage.getSet());
		EGenericType g2 = createEGenericType(theBehaviorPackage.getExpression());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "expressions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerHelperJavaEClass, theStandardPackage
				.getJavaString(), "ppCRSeparatedNode", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(theBehaviorPackage.getExpression());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "expressions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerHelperJavaEClass, theStandardPackage
				.getJavaString(), "ppTypeFromMultiplicityElement", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getMultiplicityElement(), "elem",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerHelperJavaEClass, theStandardPackage
				.getJavaString(), "ppEmfLikeCreateFactory", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "localType", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericTypeDefinitionHelperEClass,
				GenericTypeDefinitionHelper.class,
				"GenericTypeDefinitionHelper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(genericTypeDefinitionHelperEClass, theEcorePackage_2
				.getEClass(), "getKermetaSpecialType", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getPackage(), "p", 0, 1,
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
				"http://www.kermeta.org/km2ecore/helper/kermeta" });
		addAnnotation(
				compilerHelperJavaEClass,
				source,
				new String[] { "documentation",
						"/**\n * Class containing some helpers dedicated to the Kermeta compiler\n */" });
		addAnnotation(
				compilerHelperJavaEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * This helper is used for the pretty printing of the parameters in a CallFeature\n\t */" });
		addAnnotation(compilerHelperJavaEClass.getEOperations().get(2), source,
				new String[] { "documentation", "/**\n\t *\n\t */" });
		addAnnotation(
				compilerHelperJavaEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Give the pp string corresponding to the CreateFactory in EMF-like of a type\n\t * @deprecated\n\t */" });
		addAnnotation(
				genericTypeDefinitionHelperEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * FIXME CF: this method should be deprecated, because the function type are included in the resulted Ecore\n\t * or we could create only the signature of the method\n\t */" });
	}

} //KermetaPackageImpl
