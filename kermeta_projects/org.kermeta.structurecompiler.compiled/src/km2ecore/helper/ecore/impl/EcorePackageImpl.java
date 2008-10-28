/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcorePackageImpl.java,v 1.6 2008-10-28 13:18:31 cfaucher Exp $
 */
package km2ecore.helper.ecore.impl;

import kermeta.KermetaPackage;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

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

import km2ecore.helper.ecore.EAnnotationHelper;
import km2ecore.helper.ecore.ENamedElementHelper;
import km2ecore.helper.ecore.EcoreFactory;
import km2ecore.helper.ecore.EcoreModelElementHelper;
import km2ecore.helper.ecore.EcorePackage;
import km2ecore.helper.ecore.KermetaEAnnotationKey;
import km2ecore.helper.ecore.KermetaEAnnotationSource;
import km2ecore.helper.ecore.ModelAnalizer;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelAnalizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreModelElementHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kermetaEAnnotationSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kermetaEAnnotationKeyEEnum = null;

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
	 * @see km2ecore.helper.ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
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
	public static EcorePackage init() {
		if (isInited)
			return (EcorePackage) EPackage.Registry.INSTANCE
					.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new EcorePackageImpl());

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
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		kermeta.ecore.impl.EcorePackageImpl theEcorePackage_1 = (kermeta.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) instanceof kermeta.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI)
				: kermeta.ecore.EcorePackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI)
				: JavaPackage.eINSTANCE);
		km2ecore.helper.kermeta.impl.KermetaPackageImpl theKermetaPackage_1 = (km2ecore.helper.kermeta.impl.KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI) instanceof km2ecore.helper.kermeta.impl.KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI)
				: km2ecore.helper.kermeta.KermetaPackage.eINSTANCE);
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
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theEcorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theCompilerPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotationHelper() {
		return eAnnotationHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElementHelper() {
		return eNamedElementHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelAnalizer() {
		return modelAnalizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreModelElementHelper() {
		return ecoreModelElementHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKermetaEAnnotationSource() {
		return kermetaEAnnotationSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKermetaEAnnotationKey() {
		return kermetaEAnnotationKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory) getEFactoryInstance();
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
		eAnnotationHelperEClass = createEClass(EANNOTATION_HELPER);

		eNamedElementHelperEClass = createEClass(ENAMED_ELEMENT_HELPER);

		modelAnalizerEClass = createEClass(MODEL_ANALIZER);

		ecoreModelElementHelperEClass = createEClass(ECORE_MODEL_ELEMENT_HELPER);

		// Create enums
		kermetaEAnnotationSourceEEnum = createEEnum(KERMETA_EANNOTATION_SOURCE);
		kermetaEAnnotationKeyEEnum = createEEnum(KERMETA_EANNOTATION_KEY);
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
		ecore.EcorePackage theEcorePackage_2 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eAnnotationHelperEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		eNamedElementHelperEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		modelAnalizerEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		ecoreModelElementHelperEClass.getESuperTypes().add(
				theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(eAnnotationHelperEClass, EAnnotationHelper.class,
				"EAnnotationHelper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(eAnnotationHelperEClass, null,
				"addAnnotationPropGetter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEModelElement(),
				"eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "body", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "createEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, theStandardPackage
				.getJavaBoolean(), "existsAnnotationGenModelImpl", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEModelElement(),
				"eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, null, "addEntry", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEAnnotation(), "annotation", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "key", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "value", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, null,
				"addAnnotationGenModelImpl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEModelElement(),
				"eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "body", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "getKermetaEAnnotation", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "obj", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "createAbstract", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "createKermetaEAnnotation", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "key", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "value", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "getEmptyKermetaEAnnotation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, null,
				"addAnnotationPropSetter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEModelElement(),
				"eModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "body", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eAnnotationHelperEClass, theEcorePackage_2
				.getEAnnotation(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "key", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "value", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(eNamedElementHelperEClass, ENamedElementHelper.class,
				"ENamedElementHelper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eNamedElementHelperEClass, theStandardPackage
				.getJavaString(), "asString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(modelAnalizerEClass, ModelAnalizer.class, "ModelAnalizer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(modelAnalizerEClass, theStandardPackage
				.getJavaBoolean(), "isInterfaceBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEClass(), "extended_class", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEClass(), "super_class", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelAnalizerEClass, theStandardPackage
				.getJavaBoolean(), "isExtendedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEClass(), "extended_class", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEClass(), "super_class", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(ecoreModelElementHelperEClass,
				EcoreModelElementHelper.class, "EcoreModelElementHelper",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ecoreModelElementHelperEClass, theEcorePackage_2
				.getEOperation(), "findEOperationProxy", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getOperation(), "op", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ecoreModelElementHelperEClass, null,
				"setEStructuralFeatureProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getProperty(), "self_", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getEStructuralFeature(),
				"ecoreStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ecoreModelElementHelperEClass, theEcorePackage_2
				.getEClass(), "findEClassProxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getClassDefinition(), "cd", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(kermetaEAnnotationSourceEEnum,
				KermetaEAnnotationSource.class, "KermetaEAnnotationSource");
		addEEnumLiteral(kermetaEAnnotationSourceEEnum,
				KermetaEAnnotationSource.KERMETA);

		initEEnum(kermetaEAnnotationKeyEEnum, KermetaEAnnotationKey.class,
				"KermetaEAnnotationKey");
		addEEnumLiteral(kermetaEAnnotationKeyEEnum,
				KermetaEAnnotationKey.IS_ABSTRACT);
		addEEnumLiteral(kermetaEAnnotationKeyEEnum, KermetaEAnnotationKey.ALIAS);
		addEEnumLiteral(kermetaEAnnotationKeyEEnum,
				KermetaEAnnotationKey.SUPER_OPERATION);
		addEEnumLiteral(kermetaEAnnotationKeyEEnum,
				KermetaEAnnotationKey.IS_READ_ONLY);
		addEEnumLiteral(kermetaEAnnotationKeyEEnum,
				KermetaEAnnotationKey.DOCUMENTATION);

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
				"http://www.kermeta.org/km2ecore/helper/ecore" });
		addAnnotation(eAnnotationHelperEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/**\n\t * Not used\n\t */" });
		addAnnotation(eAnnotationHelperEClass.getEOperations().get(0), source,
				new String[] { "deprecated", "true" });
		addAnnotation(eAnnotationHelperEClass.getEOperations().get(9), source,
				new String[] { "documentation", "/**\n\t * Not used\n\t */" });
		addAnnotation(eAnnotationHelperEClass.getEOperations().get(9), source,
				new String[] { "deprecated", "true" });
		addAnnotation(
				kermetaEAnnotationSourceEEnum,
				source,
				new String[] {
						"documentation",
						"/** Enumeration that lists the different keys among the Kermeta annotation in the Ecore side */" });
		addAnnotation(ecoreModelElementHelperEClass.getEOperations().get(0),
				source, new String[] { "deprecated", "unused" });
		addAnnotation(ecoreModelElementHelperEClass.getEOperations().get(2),
				source, new String[] { "deprecated", "unused" });
	}

} //EcorePackageImpl
