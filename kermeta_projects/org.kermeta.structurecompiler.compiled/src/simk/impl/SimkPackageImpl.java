/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkPackageImpl.java,v 1.8 2008-11-07 08:53:07 cfaucher Exp $
 */
package simk.impl;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simk.SIMKModel;
import simk.SMAccess;
import simk.SMClass;
import simk.SMContext;
import simk.SMMethod;
import simk.SMNamedElement;
import simk.SMParameter;
import simk.SMReturn;
import simk.SMTypedElement;
import simk.SMUsage;
import simk.SimkFactory;
import simk.SimkPackage;

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
	private EClass smMethodEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smAccessEEnum = null;

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
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
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
		theCompilerPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theSimkPackage.initializePackageContents();
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
		theCompilerPackage.initializePackageContents();
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
	public EReference getSIMKModel_SMMethods() {
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
	public EClass getSMMethod() {
		return smMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod__abstract() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod_Body() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_ParentEReference() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod__static() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod_TypeParameters() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_ParentEOperation() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_ParentEAttribute() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_SMParameters() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_SMReturn() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_SMContext() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod_Usages() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMMethod_Access() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(11);
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
	public EReference getSMContext_SMClass() {
		return (EReference) smContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMContext_SMMethods() {
		return (EReference) smContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSMContext_FinalPackageQName() {
		return (EAttribute) smContextEClass.getEStructuralFeatures().get(2);
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
	public EEnum getSMAccess() {
		return smAccessEEnum;
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
		createEReference(simkModelEClass, SIMK_MODEL__SM_METHODS);

		smClassEClass = createEClass(SM_CLASS);
		createEReference(smClassEClass, SM_CLASS__CONTEXT);
		createEAttribute(smClassEClass, SM_CLASS__USAGES);

		smMethodEClass = createEClass(SM_METHOD);
		createEAttribute(smMethodEClass, SM_METHOD__ABSTRACT);
		createEAttribute(smMethodEClass, SM_METHOD__BODY);
		createEReference(smMethodEClass, SM_METHOD__PARENT_EREFERENCE);
		createEAttribute(smMethodEClass, SM_METHOD__STATIC);
		createEAttribute(smMethodEClass, SM_METHOD__TYPE_PARAMETERS);
		createEReference(smMethodEClass, SM_METHOD__PARENT_EOPERATION);
		createEReference(smMethodEClass, SM_METHOD__PARENT_EATTRIBUTE);
		createEReference(smMethodEClass, SM_METHOD__SM_PARAMETERS);
		createEReference(smMethodEClass, SM_METHOD__SM_RETURN);
		createEReference(smMethodEClass, SM_METHOD__SM_CONTEXT);
		createEAttribute(smMethodEClass, SM_METHOD__USAGES);
		createEAttribute(smMethodEClass, SM_METHOD__ACCESS);

		smContextEClass = createEClass(SM_CONTEXT);
		createEReference(smContextEClass, SM_CONTEXT__SM_CLASS);
		createEReference(smContextEClass, SM_CONTEXT__SM_METHODS);
		createEAttribute(smContextEClass, SM_CONTEXT__FINAL_PACKAGE_QNAME);

		smNamedElementEClass = createEClass(SM_NAMED_ELEMENT);
		createEAttribute(smNamedElementEClass, SM_NAMED_ELEMENT__NAME);

		smParameterEClass = createEClass(SM_PARAMETER);

		smTypedElementEClass = createEClass(SM_TYPED_ELEMENT);
		createEAttribute(smTypedElementEClass, SM_TYPED_ELEMENT__TYPE);

		smReturnEClass = createEClass(SM_RETURN);

		// Create enums
		smUsageEEnum = createEEnum(SM_USAGE);
		smAccessEEnum = createEEnum(SM_ACCESS);
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
		ecore.EcorePackage theEcorePackage_2 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simkModelEClass.getESuperTypes().add(this.getSMNamedElement());
		smClassEClass.getESuperTypes().add(this.getSMNamedElement());
		smMethodEClass.getESuperTypes().add(this.getSMNamedElement());
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
		initEReference(getSIMKModel_SMMethods(), this.getSMMethod(), null,
				"sMMethods", null, 0, -1, SIMKModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextForSuper", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getOperation(), "op", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
				"retrieveOrCreateContextForInvariant", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getConstraint(), "constraint", 0,
				1, IS_UNIQUE, IS_ORDERED);
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
				0, 1, SMClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(smClassEClass, null, "setWrapperUsage", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(smClassEClass, theEcorePackage_2.getEString(),
				"getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smMethodEClass, SMMethod.class, "SMMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMMethod__abstract(),
				theEcorePackage_2.getEBoolean(), "_abstract", "false", 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_Body(), theEcorePackage_2.getEString(),
				"body", null, 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_ParentEReference(), theEcorePackage_2
				.getEReference(), null, "parentEReference", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod__static(), theEcorePackage_2.getEBoolean(),
				"_static", "true", 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_TypeParameters(), theEcorePackage_2
				.getEString(), "typeParameters", null, 0, 1, SMMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_ParentEOperation(), theEcorePackage_2
				.getEOperation(), null, "parentEOperation", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_ParentEAttribute(), theEcorePackage_2
				.getEAttribute(), null, "parentEAttribute", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_SMParameters(), this.getSMParameter(), null,
				"sMParameters", null, 0, -1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_SMReturn(), this.getSMReturn(), null,
				"sMReturn", null, 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_SMContext(), this.getSMContext(), this
				.getSMContext_SMMethods(), "sMContext", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_Usages(), this.getSMUsage(), "usages", null,
				0, 1, SMMethod.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSMMethod_Access(), this.getSMAccess(), "access",
				"public", 0, 1, SMMethod.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(smMethodEClass, null, "setWrapperUsage", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(smMethodEClass, theEcorePackage_2.getEOperation(),
				"getParentEOperationFromModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smContextEClass, SMContext.class, "SMContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMContext_SMClass(), this.getSMClass(), this
				.getSMClass_Context(), "sMClass", null, 0, 1, SMContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSMContext_SMMethods(), this.getSMMethod(), this
				.getSMMethod_SMContext(), "sMMethods", null, 0, -1,
				SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMContext_FinalPackageQName(), theEcorePackage_2
				.getEString(), "finalPackageQName", null, 0, 1,
				SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(smAccessEEnum, SMAccess.class, "SMAccess");
		addEEnumLiteral(smAccessEEnum, SMAccess.PRIVATE);
		addEEnumLiteral(smAccessEEnum, SMAccess.PROTECTED);
		addEEnumLiteral(smAccessEEnum, SMAccess.PUBLIC);

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
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
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
		addAnnotation(smMethodEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(smMethodEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
	}

} //SimkPackageImpl
