/**
 * <copyright>
 * </copyright>
 *
 * $Id: Km2ecorePackageImpl.java,v 1.1 2008-09-04 15:40:40 cfaucher Exp $
 */
package km2ecore.impl;

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

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import km2ecore.CompilingMode;
import km2ecore.KM2EcoreContext;
import km2ecore.Km2ecoreFactory;
import km2ecore.Km2ecorePackage;
import km2ecore.SourceTracer;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class Km2ecorePackageImpl extends EPackageImpl implements
		Km2ecorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTracerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass km2EcoreContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compilingModeEEnum = null;

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
	 * @see km2ecore.Km2ecorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Km2ecorePackageImpl() {
		super(eNS_URI, Km2ecoreFactory.eINSTANCE);
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
	public static Km2ecorePackage init() {
		if (isInited)
			return (Km2ecorePackage) EPackage.Registry.INSTANCE
					.getEPackage(Km2ecorePackage.eNS_URI);

		// Obtain or create and register package
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new Km2ecorePackageImpl());

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
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
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
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_1 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI) instanceof km2ecore.helper.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI)
				: km2ecore.helper.ecore.EcorePackage.eINSTANCE);
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
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theKm2ecorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theSimkPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theKm2ecorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKm2ecorePackage.freeze();

		return theKm2ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceTracer() {
		return sourceTracerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKM2EcoreContext() {
		return km2EcoreContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_JavaKeyWordList() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_TraceModel() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_VARIABLE_EXCEPTION_SWITCHER() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_ResultOfLastFt() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_TYPE_SEPARATOR() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_KRErrorStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_FtSuffixActivation() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Inc_resultLastStatementStack() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Mode() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_NOT_EVALUATED_MESSAGE() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_StaticOperationMode() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_KmInput() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_FtStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_InputRepository() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_CondStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_OutputRepository() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_EcoreOutputs() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_SEPARATOR_STATEMENT_FT() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_LastStatementStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_ResultLastStatementStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_SimkOutput() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_FrameworkOperations() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_COLLECTION_UTIL_CLASS() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Inc_kRErrorStack() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_CompiledJavaExtern() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_TraceabilityInput() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_Current_valueType() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_BeforeFunctionTypeResult() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Inc_condStack() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_FtSuffix() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_Tasks_stack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_SimkModel() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_Mu() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_FtMapTypeStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKM2EcoreContext_FtProductTypeStack() {
		return (EReference) km2EcoreContextEClass.getEStructuralFeatures().get(
				36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Current_param_ft() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_FtContextualSelf() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_SELF_EXPRESSION_TO_REPLACE() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_PREVIOUS_STATEMENT_FT() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_BeforeLambdaExpressionResult() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_FtReturnType() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKM2EcoreContext_Inc_ftSuffix() {
		return (EAttribute) km2EcoreContextEClass.getEStructuralFeatures().get(
				43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompilingMode() {
		return compilingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Km2ecoreFactory getKm2ecoreFactory() {
		return (Km2ecoreFactory) getEFactoryInstance();
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
		sourceTracerEClass = createEClass(SOURCE_TRACER);

		km2EcoreContextEClass = createEClass(KM2_ECORE_CONTEXT);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__JAVA_KEY_WORD_LIST);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__TRACE_MODEL);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__VARIABLE_EXCEPTION_SWITCHER);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__RESULT_OF_LAST_FT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__TYPE_SEPARATOR);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__KR_ERROR_STACK);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FT_SUFFIX_ACTIVATION);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__INC_RESULT_LAST_STATEMENT_STACK);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__RETURN_EXPRESSION_TO_REPLACE);
		createEAttribute(km2EcoreContextEClass, KM2_ECORE_CONTEXT__MODE);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__NOT_EVALUATED_MESSAGE);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__STATIC_OPERATION_MODE);
		createEAttribute(km2EcoreContextEClass, KM2_ECORE_CONTEXT__KM_INPUT);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__FT_STACK);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__INPUT_REPOSITORY);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__COND_STACK);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__OUTPUT_REPOSITORY);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__ECORE_OUTPUTS);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__SEPARATOR_STATEMENT_FT);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__LAST_STATEMENT_STACK);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__RESULT_LAST_STATEMENT_STACK);
		createEAttribute(km2EcoreContextEClass, KM2_ECORE_CONTEXT__SIMK_OUTPUT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FRAMEWORK_OPERATIONS);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__JAVA_CLASS_EXCEPTION_SWITCHER);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__COLLECTION_UTIL_CLASS);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__INC_KR_ERROR_STACK);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__COMPILED_JAVA_EXTERN);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__TRACEABILITY_INPUT);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__CURRENT_VALUE_TYPE);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__BEFORE_FUNCTION_TYPE_RESULT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__INC_COND_STACK);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__FT_SUFFIX);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__TASKS_STACK);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__SIMK_MODEL);
		createEReference(km2EcoreContextEClass, KM2_ECORE_CONTEXT__MU);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FT_MAP_TYPE_STACK);
		createEReference(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FT_PRODUCT_TYPE_STACK);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__CURRENT_PARAM_FT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FT_CONTEXTUAL_SELF);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__SELF_EXPRESSION_TO_REPLACE);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__PREVIOUS_STATEMENT_FT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__BEFORE_LAMBDA_EXPRESSION_RESULT);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__FT_RETURN_TYPE);
		createEAttribute(km2EcoreContextEClass,
				KM2_ECORE_CONTEXT__INC_FT_SUFFIX);

		// Create enums
		compilingModeEEnum = createEEnum(COMPILING_MODE);
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
		km2ecore.helper.ecore.EcorePackage theEcorePackage_1 = (km2ecore.helper.ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage) EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI);
		km2ecore.helper.kermeta.KermetaPackage theKermetaPackage_1 = (km2ecore.helper.kermeta.KermetaPackage) EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		TraceabilityPackage theTraceabilityPackage = (TraceabilityPackage) EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		UtilsPackage theUtilsPackage = (UtilsPackage) EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		PersistencePackage thePersistencePackage = (PersistencePackage) EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI);
		SimkPackage theSimkPackage = (SimkPackage) EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEcorePackage_1);
		getESubpackages().add(theJavaPackage);
		getESubpackages().add(theKermetaPackage_1);
		getESubpackages().add(theCommonPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceTracerEClass.getESuperTypes()
				.add(theStructurePackage.getObject());
		km2EcoreContextEClass.getESuperTypes().add(
				theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(sourceTracerEClass, SourceTracer.class, "SourceTracer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(sourceTracerEClass, null,
				"addSourceInformation", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKM2EcoreContext(), "context", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(km2EcoreContextEClass, KM2EcoreContext.class,
				"KM2EcoreContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKM2EcoreContext_JavaKeyWordList(), theCommonPackage
				.getJavaKeyWordList(), null, "javaKeyWordList", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKM2EcoreContext_TraceModel(), theTraceabilityPackage
				.getTraceModel(), null, "traceModel", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKM2EcoreContext_VARIABLE_EXCEPTION_SWITCHER(),
				theStandardPackage.getJavaString(),
				"VARIABLE_EXCEPTION_SWITCHER", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_ResultOfLastFt(), theStandardPackage
				.getJavaString(), "resultOfLastFt", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_TYPE_SEPARATOR(), theStandardPackage
				.getJavaString(), "TYPE_SEPARATOR", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilsPackage.getStack());
		EGenericType g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_KRErrorStack(), g1, null,
				"kRErrorStack", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_FtSuffixActivation(),
				theStandardPackage.getJavaBoolean(), "ftSuffixActivation",
				"false", 0, 1, KM2EcoreContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Inc_resultLastStatementStack(),
				theStandardPackage.getJavaInteger(),
				"inc_resultLastStatementStack", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_RETURN_EXPRESSION_TO_REPLACE(),
				theStandardPackage.getJavaString(),
				"RETURN_EXPRESSION_TO_REPLACE", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Mode(), this.getCompilingMode(),
				"mode", null, 1, 1, KM2EcoreContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKM2EcoreContext_NOT_EVALUATED_MESSAGE(),
				theStandardPackage.getJavaString(), "NOT_EVALUATED_MESSAGE",
				null, 1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_StaticOperationMode(),
				theStandardPackage.getJavaBoolean(), "staticOperationMode",
				"false", 0, 1, KM2EcoreContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKM2EcoreContext_KmInput(), theStandardPackage
				.getJavaString(), "kmInput", null, 1, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theBehaviorPackage.getLambdaExpression());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_FtStack(), g1, null, "ftStack", null,
				0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKM2EcoreContext_InputRepository(),
				thePersistencePackage.getEMFRepository(), null,
				"inputRepository", null, 1, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_CondStack(), g1, null, "condStack",
				null, 0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKM2EcoreContext_OutputRepository(),
				thePersistencePackage.getEMFRepository(), null,
				"outputRepository", null, 1, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_EcoreOutputs(), theStandardPackage
				.getJavaString(), "ecoreOutputs", null, 1, -1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_SEPARATOR_STATEMENT_FT(),
				theStandardPackage.getJavaString(), "SEPARATOR_STATEMENT_FT",
				null, 1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_LastStatementStack(), g1, null,
				"lastStatementStack", null, 1, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_ResultLastStatementStack(), g1, null,
				"resultLastStatementStack", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_SimkOutput(), theStandardPackage
				.getJavaString(), "simkOutput", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_FrameworkOperations(),
				theStandardPackage.getJavaString(), "frameworkOperations",
				null, 0, -1, KM2EcoreContext.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER(),
				theStandardPackage.getJavaString(),
				"JAVA_CLASS_EXCEPTION_SWITCHER", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_COLLECTION_UTIL_CLASS(),
				theStandardPackage.getJavaString(), "COLLECTION_UTIL_CLASS",
				null, 1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Inc_kRErrorStack(),
				theStandardPackage.getJavaInteger(), "inc_kRErrorStack", null,
				0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_CompiledJavaExtern(),
				theStandardPackage.getJavaString(), "compiledJavaExtern", null,
				1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_TraceabilityInput(),
				theStandardPackage.getJavaString(), "traceabilityInput", null,
				1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getKM2EcoreContext_Current_valueType(),
				theStructurePackage.getClassDefinition(), null,
				"current_valueType", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_BeforeFunctionTypeResult(),
				theStandardPackage.getJavaString(), "beforeFunctionTypeResult",
				null, 0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Inc_condStack(), theStandardPackage
				.getJavaInteger(), "inc_condStack", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_FtSuffix(), g1, null, "ftSuffix",
				null, 0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_Tasks_stack(), g1, null,
				"tasks_stack", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getKM2EcoreContext_SimkModel(), theSimkPackage
				.getSIMKModel(), null, "simkModel", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKM2EcoreContext_Mu(), theStructurePackage
				.getModelingUnit(), null, "mu", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theUtilsPackage.getHashtable());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_FtMapTypeStack(), g1, null,
				"ftMapTypeStack", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getStack());
		g2 = createEGenericType(theStructurePackage.getProductType());
		g1.getETypeArguments().add(g2);
		initEReference(getKM2EcoreContext_FtProductTypeStack(), g1, null,
				"ftProductTypeStack", null, 0, 1, KM2EcoreContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Current_param_ft(),
				theStandardPackage.getJavaString(), "current_param_ft", null,
				0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_FtContextualSelf(),
				theStandardPackage.getJavaString(), "ftContextualSelf", null,
				0, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_SELF_EXPRESSION_TO_REPLACE(),
				theStandardPackage.getJavaString(),
				"SELF_EXPRESSION_TO_REPLACE", null, 1, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_PREVIOUS_STATEMENT_FT(),
				theStandardPackage.getJavaString(), "PREVIOUS_STATEMENT_FT",
				null, 1, 1, KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_BeforeLambdaExpressionResult(),
				theStandardPackage.getJavaString(),
				"beforeLambdaExpressionResult", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_FtReturnType(), theStandardPackage
				.getJavaString(), "ftReturnType", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKM2EcoreContext_Inc_ftSuffix(), theStandardPackage
				.getJavaInteger(), "inc_ftSuffix", null, 0, 1,
				KM2EcoreContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(), "getLoopConditionId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(), "printLExpSuffix", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null, "pushKRErrorStack", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(), "getIfConditionId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null, "save", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(),
				"getResultLastStatementType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null, "pushFtSuffix", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null, "initializeConstants", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null,
				"popResultLastStatementStack", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null,
				"initializeFrameworkOperations", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(), "printFtSuffix", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass, null, "pushCondStack", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(km2EcoreContextEClass,
				theStandardPackage.getJavaString(), "getResultLastStatementId",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(km2EcoreContextEClass, null, "initialize", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "modelInput", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "traceInput", 0,
				1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(compilingModeEEnum, CompilingMode.class, "CompilingMode");
		addEEnumLiteral(compilingModeEEnum, CompilingMode.ONLY_ECORE);
		addEEnumLiteral(compilingModeEEnum, CompilingMode.BEHAVIOR_KMT);
		addEEnumLiteral(compilingModeEEnum, CompilingMode.BEHAVIOR_JAVA);

		// Create resource
		createResource(eNS_URI);

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
				"http://www.kermeta.org/km2ecore" });
		addAnnotation(km2EcoreContextEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\n\t * Get the identifier\n\t */" });
		addAnnotation(km2EcoreContextEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/**\n\t * Get the identifier\n\t */" });
		addAnnotation(km2EcoreContextEClass.getEOperations().get(7), source,
				new String[] { "documentation",
						"/**\n\t * Initialize the constants\n\t */" });
		addAnnotation(km2EcoreContextEClass.getEOperations().get(12), source,
				new String[] { "documentation",
						"/**\n\t * Get the identifier\n\t */" });
		addAnnotation(getKM2EcoreContext_JavaKeyWordList(), source,
				new String[] { "documentation", "/******/" });
		addAnnotation(getKM2EcoreContext_JavaKeyWordList(), source,
				new String[] { "documentation",
						"/** Unique instance of the JavaKeyWordList */" });
		addAnnotation(
				getKM2EcoreContext_TraceModel(),
				source,
				new String[] {
						"documentation",
						"/**\tThe trace model dedicated to the km model (kmt2km) used for the transformation */" });
		addAnnotation(getKM2EcoreContext_Mode(), source, new String[] {
				"documentation", "/** The choosen compiling mode */" });
		addAnnotation(getKM2EcoreContext_KmInput(), source, new String[] {
				"documentation",
				"/** The input model (as input of the transformation) */" });
		addAnnotation(getKM2EcoreContext_InputRepository(), source,
				new String[] { "documentation",
						"/** Unique instance of the JavaTypeMapping */" });
		addAnnotation(getKM2EcoreContext_InputRepository(), source,
				new String[] { "documentation", "/**  */" });
		addAnnotation(getKM2EcoreContext_OutputRepository(), source,
				new String[] { "documentation", "/**  */" });
		addAnnotation(
				getKM2EcoreContext_EcoreOutputs(),
				source,
				new String[] { "documentation",
						"/** The output Ecore models (as output of the transformation) */" });
		addAnnotation(getKM2EcoreContext_SimkOutput(), source, new String[] {
				"documentation",
				"/** The simk model (as output of the transformation) */" });
		addAnnotation(getKM2EcoreContext_FrameworkOperations(), source,
				new String[] { "documentation",
						"/** List of the method from the framework */" });
		addAnnotation(getKM2EcoreContext_JAVA_CLASS_EXCEPTION_SWITCHER(),
				source, new String[] { "documentation", "/** CONSTANTS */" });
		addAnnotation(getKM2EcoreContext_CompiledJavaExtern(), source,
				new String[] { "documentation", "/********/" });
		addAnnotation(getKM2EcoreContext_CompiledJavaExtern(), source,
				new String[] { "documentation", "/**  */" });
		addAnnotation(
				getKM2EcoreContext_TraceabilityInput(),
				source,
				new String[] { "documentation",
						"/** The input model (as input of the transformation) */" });
		addAnnotation(getKM2EcoreContext_Current_valueType(), source,
				new String[] { "documentation", "/********/" });
		addAnnotation(getKM2EcoreContext_FtSuffix(), source,
				new String[] { "documentation",
						"/*** params for FunctionType contextual ***/" });
		addAnnotation(getKM2EcoreContext_Mu(), source, new String[] {
				"documentation", "/** The modeling units source */" });
		addAnnotation(
				compilingModeEEnum,
				source,
				new String[] { "documentation",
						"/** Enumeration representing the different compiling modes */" });
	}

} //Km2ecorePackageImpl
