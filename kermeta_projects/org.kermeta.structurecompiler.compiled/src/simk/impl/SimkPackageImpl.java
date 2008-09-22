/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkPackageImpl.java,v 1.3 2008-09-22 14:48:57 cfaucher Exp $
 */
package simk.impl;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simk.SIMKModel;
import simk.SMClass;
import simk.SMContext;
import simk.SMNamedElement;
import simk.SMParameter;
import simk.SMReturn;
import simk.SMTypedElement;
import simk.SMUsage;
import simk.SimkFactory;
import simk.SimkPackage;
import simk.StaticMethod;

import traceability.TraceabilityPackage;

import traceability.impl.TraceabilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimkPackageImpl extends EPackageImpl implements SimkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simkModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smUsageEEnum = null;

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
	 * @see simk.SimkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimkPackageImpl() {
		super(eNS_URI, SimkFactory.eINSTANCE);
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
	public static SimkPackage init() {
		if (isInited)
			return (SimkPackage) EPackage.Registry.INSTANCE
					.getEPackage(SimkPackage.eNS_URI);

		// Obtain or create and register package
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new SimkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI)
				: LanguagePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI)
				: CommonPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI)
				: ExceptionPackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI)
				: JavaPackage.eINSTANCE);
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_1 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI) instanceof km2ecore.helper.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI)
				: km2ecore.helper.ecore.EcorePackage.eINSTANCE);
		km2ecore.helper.kermeta.impl.KermetaPackageImpl theKermetaPackage_1 = (km2ecore.helper.kermeta.impl.KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI) instanceof km2ecore.helper.kermeta.impl.KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI)
				: km2ecore.helper.kermeta.KermetaPackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theSimkPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theSimkPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimkPackage.freeze();

		return theSimkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIMKModel() {
		return simkModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSIMKModel_SMContexts() {
		return (EReference) simkModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSIMKModel_StaticMethods() {
		return (EReference) simkModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMClass() {
		return smClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMClass_Context() {
		return (EReference) smClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMClass_Usages() {
		return (EAttribute) smClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticMethod() {
		return staticMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_Body() {
		return (EAttribute) staticMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_TypeParameters() {
		return (EAttribute) staticMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentAttribute() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMParameters() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMReturn() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticMethod_Usages() {
		return (EAttribute) staticMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentMethod() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_SMContext() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticMethod_ParentReference() {
		return (EReference) staticMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMContext() {
		return smContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMContext_QualifiedNameFinalPackage() {
		return (EAttribute) smContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMContext_StaticMethods() {
		return (EReference) smContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMContext_SMClass() {
		return (EReference) smContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMNamedElement() {
		return smNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMNamedElement_Name() {
		return (EAttribute) smNamedElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMParameter() {
		return smParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMTypedElement() {
		return smTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMTypedElement_Type() {
		return (EAttribute) smTypedElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSMReturn() {
		return smReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSMUsage() {
		return smUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimkFactory getSimkFactory() {
		return (SimkFactory) getEFactoryInstance();
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
		simkModelEClass = createEClass(SIMK_MODEL);
		createEReference(simkModelEClass, SIMK_MODEL__SM_CONTEXTS);
		createEReference(simkModelEClass, SIMK_MODEL__STATIC_METHODS);

		smClassEClass = createEClass(SM_CLASS);
		createEReference(smClassEClass, SM_CLASS__CONTEXT);
		createEAttribute(smClassEClass, SM_CLASS__USAGES);

		staticMethodEClass = createEClass(STATIC_METHOD);
		createEAttribute(staticMethodEClass, STATIC_METHOD__BODY);
		createEAttribute(staticMethodEClass, STATIC_METHOD__TYPE_PARAMETERS);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_ATTRIBUTE);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_PARAMETERS);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_RETURN);
		createEAttribute(staticMethodEClass, STATIC_METHOD__USAGES);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_METHOD);
		createEReference(staticMethodEClass, STATIC_METHOD__SM_CONTEXT);
		createEReference(staticMethodEClass, STATIC_METHOD__PARENT_REFERENCE);

		smContextEClass = createEClass(SM_CONTEXT);
		createEAttribute(smContextEClass,
				SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE);
		createEReference(smContextEClass, SM_CONTEXT__STATIC_METHODS);
		createEReference(smContextEClass, SM_CONTEXT__SM_CLASS);

		smNamedElementEClass = createEClass(SM_NAMED_ELEMENT);
		createEAttribute(smNamedElementEClass, SM_NAMED_ELEMENT__NAME);

		smParameterEClass = createEClass(SM_PARAMETER);

		smTypedElementEClass = createEClass(SM_TYPED_ELEMENT);
		createEAttribute(smTypedElementEClass, SM_TYPED_ELEMENT__TYPE);

		smReturnEClass = createEClass(SM_RETURN);

		// Create enums
		smUsageEEnum = createEEnum(SM_USAGE);
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
		ecore.EcorePackage theEcorePackage_2 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simkModelEClass.getESuperTypes().add(this.getSMNamedElement());
		smClassEClass.getESuperTypes().add(this.getSMNamedElement());
		staticMethodEClass.getESuperTypes().add(this.getSMNamedElement());
		smContextEClass.getESuperTypes().add(theStructurePackage.getObject());
		smNamedElementEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		smParameterEClass.getESuperTypes().add(this.getSMNamedElement());
		smParameterEClass.getESuperTypes().add(this.getSMTypedElement());
		smTypedElementEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		smReturnEClass.getESuperTypes().add(this.getSMTypedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(simkModelEClass, SIMKModel.class, "SIMKModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSIMKModel_SMContexts(), this.getSMContext(), null,
				"sMContexts", null, 0, -1, SIMKModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSIMKModel_StaticMethods(), this.getStaticMethod(),
				null, "staticMethods", null, 0, -1, SIMKModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(simkModelEClass, theEcorePackage_2.getEInt(),
				"getNextId", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextForSuper", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getOperation(), "op", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextForWrapper", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getOperation(), "op", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextForRunner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getOperation(), "op", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextWithClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "class_qname", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(),
				"finalPackage_qname", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSMUsage(), "usage", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "class_qname", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(),
				"finalPackage_qname", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSMUsage(), "usage", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smClassEClass, SMClass.class, "SMClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMClass_Context(), this.getSMContext(), this
				.getSMContext_SMClass(), "context", null, 1, 1, SMClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSMClass_Usages(), this.getSMUsage(), "usages", null,
				0, 1, SMClass.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(smClassEClass, null, "setWrapperUsage", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(smClassEClass, theEcorePackage_2.getEString(),
				"getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(staticMethodEClass, StaticMethod.class, "StaticMethod",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticMethod_Body(), theEcorePackage_2.getEString(),
				"body", null, 0, 1, StaticMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticMethod_TypeParameters(), theEcorePackage_2
				.getEString(), "typeParameters", null, 0, 1,
				StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_ParentAttribute(), theEcorePackage_2
				.getEAttribute(), null, "parentAttribute", null, 0, 1,
				StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_SMParameters(), this.getSMParameter(),
				null, "sMParameters", null, 0, -1, StaticMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaticMethod_SMReturn(), this.getSMReturn(), null,
				"sMReturn", null, 0, 1, StaticMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticMethod_Usages(), this.getSMUsage(), "usages",
				null, 0, 1, StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaticMethod_ParentMethod(), theEcorePackage_2
				.getEOperation(), null, "parentMethod", null, 0, 1,
				StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_SMContext(), this.getSMContext(), this
				.getSMContext_StaticMethods(), "sMContext", null, 0, 1,
				StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStaticMethod_ParentReference(), theEcorePackage_2
				.getEReference(), null, "parentReference", null, 0, 1,
				StaticMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(staticMethodEClass, null, "setWrapperUsage", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(staticMethodEClass, theEcorePackage_2.getEOperation(),
				"getParentMethodFromModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smContextEClass, SMContext.class, "SMContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMContext_QualifiedNameFinalPackage(),
				theEcorePackage_2.getEString(), "qualifiedNameFinalPackage",
				null, 0, 1, SMContext.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSMContext_StaticMethods(), this.getStaticMethod(),
				this.getStaticMethod_SMContext(), "staticMethods", null, 0, -1,
				SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMContext_SMClass(), this.getSMClass(), this
				.getSMClass_Context(), "sMClass", null, 0, 1, SMContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(smNamedElementEClass, SMNamedElement.class,
				"SMNamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMNamedElement_Name(),
				theEcorePackage_2.getEString(), "name", null, 0, 1,
				SMNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(smParameterEClass, SMParameter.class, "SMParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smTypedElementEClass, SMTypedElement.class,
				"SMTypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMTypedElement_Type(),
				theEcorePackage_2.getEString(), "type", null, 1, 1,
				SMTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(smReturnEClass, SMReturn.class, "SMReturn", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(smUsageEEnum, SMUsage.class, "SMUsage");
		addEEnumLiteral(smUsageEEnum, SMUsage.DEFAULT);
		addEEnumLiteral(smUsageEEnum, SMUsage.SUPER);
		addEEnumLiteral(smUsageEEnum, SMUsage.DERIVED_PROPERTY);
		addEEnumLiteral(smUsageEEnum, SMUsage.PRE_CONDITION);
		addEEnumLiteral(smUsageEEnum, SMUsage.POST_CONDITION);
		addEEnumLiteral(smUsageEEnum, SMUsage.WRAPPER);
		addEEnumLiteral(smUsageEEnum, SMUsage.RUNNER);
		addEEnumLiteral(smUsageEEnum, SMUsage.INVARIANT);

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
				"http://www.kermeta.org/simk" });
		addAnnotation(simkModelEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(simkModelEClass.getEOperations().get(1), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(simkModelEClass.getEOperations().get(2), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(simkModelEClass.getEOperations().get(3), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(simkModelEClass.getEOperations().get(4), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(simkModelEClass.getEOperations().get(5), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(smClassEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(smClassEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(staticMethodEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(staticMethodEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
	}

} //SimkPackageImpl
