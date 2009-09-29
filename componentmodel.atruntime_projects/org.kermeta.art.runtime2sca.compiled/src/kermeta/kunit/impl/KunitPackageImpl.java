/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.kunit.impl;

import art.ArtPackage;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

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

import kermeta.kunit.AbstractFallible;
import kermeta.kunit.Assert;
import kermeta.kunit.AssertionFailedError;
import kermeta.kunit.ErrorKind;
import kermeta.kunit.Failure;
import kermeta.kunit.Fallible;
import kermeta.kunit.InvalidParameterException;
import kermeta.kunit.InvalidTestCaseNameException;
import kermeta.kunit.KunitFactory;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;
import kermeta.kunit.Test;
import kermeta.kunit.TestCase;
import kermeta.kunit.TestRunner;
import kermeta.kunit.TestSuite;

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

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime2SCA.Runtime2SCAPackage;

import runtime2SCA.impl.Runtime2SCAPackageImpl;

import sca.ScaPackage;

import sca.impl.ScaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KunitPackageImpl extends EPackageImpl implements KunitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFallibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionFailedErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidTestCaseNameExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidParameterExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorKindEEnum = null;

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
	 * @see kermeta.kunit.KunitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KunitPackageImpl() {
		super(eNS_URI, KunitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KunitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KunitPackage init() {
		if (isInited)
			return (KunitPackage) EPackage.Registry.INSTANCE
					.getEPackage(KunitPackage.eNS_URI);

		// Obtain or create and register package
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new KunitPackageImpl());

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
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
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
		Runtime2SCAPackageImpl theRuntime2SCAPackage = (Runtime2SCAPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI) instanceof Runtime2SCAPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI)
				: Runtime2SCAPackage.eINSTANCE);
		ScaPackageImpl theScaPackage = (ScaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI) instanceof ScaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI)
				: ScaPackage.eINSTANCE);
		ArtPackageImpl theArtPackage = (ArtPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ArtPackage.eNS_URI)
				: ArtPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI)
				: InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI)
				: TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI)
				: ImplemPackage.eINSTANCE);

		// Create package meta-data objects
		theKunitPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theScaPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theKunitPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKunitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KunitPackage.eNS_URI, theKunitPackage);
		return theKunitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFallible() {
		return abstractFallibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionFailedError() {
		return assertionFailedErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssert() {
		return assertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidTestCaseNameException() {
		return invalidTestCaseNameExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidParameterException() {
		return invalidParameterExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFallible() {
		return fallibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFallible_StopOnFailure() {
		return (EAttribute) fallibleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFallible_Rank() {
		return (EAttribute) fallibleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLog() {
		return logEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLog_Failures() {
		return (EReference) logEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLog_Errors() {
		return (EReference) logEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLog_Runtests() {
		return (EAttribute) logEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLog_HarnessErrors() {
		return (EReference) logEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailure() {
		return failureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailure_Message() {
		return (EAttribute) failureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailure_Failure() {
		return (EReference) failureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getError_Error() {
		return (EReference) errorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getError_Exception() {
		return (EReference) errorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Kind() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Log() {
		return (EReference) testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_Tests() {
		return (EReference) testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase___testMethodName() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestRunner() {
		return testRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestRunner_Log() {
		return (EReference) testRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorKind() {
		return errorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KunitFactory getKunitFactory() {
		return (KunitFactory) getEFactoryInstance();
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
		abstractFallibleEClass = createEClass(ABSTRACT_FALLIBLE);

		assertionFailedErrorEClass = createEClass(ASSERTION_FAILED_ERROR);

		assertEClass = createEClass(ASSERT);

		invalidTestCaseNameExceptionEClass = createEClass(INVALID_TEST_CASE_NAME_EXCEPTION);

		invalidParameterExceptionEClass = createEClass(INVALID_PARAMETER_EXCEPTION);

		fallibleEClass = createEClass(FALLIBLE);
		createEAttribute(fallibleEClass, FALLIBLE__STOP_ON_FAILURE);
		createEAttribute(fallibleEClass, FALLIBLE__RANK);

		logEClass = createEClass(LOG);
		createEReference(logEClass, LOG__FAILURES);
		createEReference(logEClass, LOG__ERRORS);
		createEAttribute(logEClass, LOG__RUNTESTS);
		createEReference(logEClass, LOG__HARNESS_ERRORS);

		failureEClass = createEClass(FAILURE);
		createEAttribute(failureEClass, FAILURE__MESSAGE);
		createEReference(failureEClass, FAILURE__FAILURE);

		errorEClass = createEClass(ERROR);
		createEReference(errorEClass, ERROR__ERROR);
		createEReference(errorEClass, ERROR__EXCEPTION);
		createEAttribute(errorEClass, ERROR__KIND);

		testEClass = createEClass(TEST);
		createEReference(testEClass, TEST__LOG);

		testSuiteEClass = createEClass(TEST_SUITE);
		createEReference(testSuiteEClass, TEST_SUITE__TESTS);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__TEST_METHOD_NAME);

		testRunnerEClass = createEClass(TEST_RUNNER);
		createEReference(testRunnerEClass, TEST_RUNNER__LOG);

		// Create enums
		errorKindEEnum = createEEnum(ERROR_KIND);
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
		ExceptionsPackage theExceptionsPackage = (ExceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractFallibleEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		assertionFailedErrorEClass.getESuperTypes().add(
				theExceptionsPackage.getException());
		assertEClass.getESuperTypes().add(this.getAbstractFallible());
		invalidTestCaseNameExceptionEClass.getESuperTypes().add(
				theExceptionsPackage.getException());
		invalidParameterExceptionEClass.getESuperTypes().add(
				theExceptionsPackage.getException());
		fallibleEClass.getESuperTypes().add(this.getAbstractFallible());
		logEClass.getESuperTypes().add(theStructurePackage.getObject());
		failureEClass.getESuperTypes().add(theStructurePackage.getObject());
		errorEClass.getESuperTypes().add(theStructurePackage.getObject());
		testEClass.getESuperTypes().add(theStructurePackage.getObject());
		testSuiteEClass.getESuperTypes().add(this.getTest());
		testCaseEClass.getESuperTypes().add(this.getTest());
		testCaseEClass.getESuperTypes().add(this.getFallible());
		testRunnerEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractFallibleEClass, AbstractFallible.class,
				"AbstractFallible", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(abstractFallibleEClass, null,
				"assertTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, theStandardPackage
				.getJavaString(), "distil", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "s", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertFalseWithMsg",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "message", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "fail", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertEqual", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "expected", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "actual", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertFalse", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertTrueWithMsg",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "message", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "_assert", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractFallibleEClass, null, "assertSimilar", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "expected", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "actual", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(assertionFailedErrorEClass, AssertionFailedError.class,
				"AssertionFailedError", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(assertEClass, null, "fail", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertTrue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertFalseWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertEqual", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "expected", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "actual", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertFalse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertTrueWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "_assert", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(assertEClass, null, "assertWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(invalidTestCaseNameExceptionEClass,
				InvalidTestCaseNameException.class,
				"InvalidTestCaseNameException", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(invalidParameterExceptionEClass,
				InvalidParameterException.class, "InvalidParameterException",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fallibleEClass, Fallible.class, "Fallible", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFallible_StopOnFailure(), theStandardPackage
				.getJavaBoolean(), "stopOnFailure", "false", 0, 1,
				Fallible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallible_Rank(), theStandardPackage.getJavaInteger(),
				"rank", null, 0, 1, Fallible.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(fallibleEClass, theStandardPackage.getJavaInteger(),
				"number", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fallibleEClass, this.getLog(), "getLogKermeta", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(fallibleEClass, theStandardPackage.getJavaBoolean(),
				"mustStop", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "_assert", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertTrue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertFalseWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "message", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "fail", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertEqual", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "expected", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "actual", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertFalse", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fallibleEClass, null, "assertTrueWithMsg", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaBoolean(), "condition", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "message", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLog_Failures(), this.getFailure(), null, "failures",
				null, 0, -1, Log.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLog_Errors(), this.getError(), null, "errors", null,
				0, -1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLog_Runtests(), theStandardPackage.getJavaInteger(),
				"runtests", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLog_HarnessErrors(), this.getError(), null,
				"harnessErrors", null, 0, -1, Log.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(logEClass, null, "addSetUpError", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getFallible(), "test", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theExceptionsPackage.getException(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logEClass, null, "addTestError", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getFallible(), "test", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theExceptionsPackage.getException(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logEClass, null, "addFailure", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getFallible(), "test", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(logEClass, null, "addTearDownError", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFallible(), "test", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theExceptionsPackage.getException(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(logEClass, null, "newAttempt", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(failureEClass, Failure.class, "Failure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailure_Message(),
				theStandardPackage.getJavaString(), "message", null, 0, 1,
				Failure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailure_Failure(), this.getFallible(), null,
				"failure", null, 0, 1, Failure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(failureEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(failureEClass, this.getFailure(), "initFrom", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFallible(), "fallible", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "msg", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(errorEClass, kermeta.kunit.Error.class, "Error",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getError_Error(), this.getFallible(), null, "error",
				null, 0, 1, kermeta.kunit.Error.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getError_Exception(), theExceptionsPackage
				.getException(), null, "exception", null, 0, 1,
				kermeta.kunit.Error.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Kind(), this.getErrorKind(), "kind", null, 0,
				1, kermeta.kunit.Error.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(errorEClass, this.getError(), "makeTearDown", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(errorEClass, this.getError(), "makeSetUp", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(errorEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(errorEClass, this.getError(), "initFrom", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFallible(), "error", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theExceptionsPackage.getException(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTest_Log(), this.getLog(), null, "log", null, 0, 1,
				Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(testEClass, null, "setLogEMF_renameAs", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLog(), "log", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testEClass, this.getLog(), "initLog", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuite_Tests(), this.getTest(), null, "tests",
				null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(testSuiteEClass, this.getTestSuite(),
				"addAllTestCasesFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getClass_(), "testCaseClass", 0,
				1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testSuiteEClass, null, "run", 0, 1, IS_UNIQUE,
				!IS_ORDERED);

		op = addEOperation(testSuiteEClass, null, "addAllTestCasesFromAspects",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getClass_(), "testCaseClass", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getClassDefinition(), "anAspect",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase___testMethodName(), theStandardPackage
				.getJavaString(), "__testMethodName", null, 0, 1,
				TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(testCaseEClass, null, "raiseIfHasFailures", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(testCaseEClass, null, "setUp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(testCaseEClass, this.getLog(), "getLogEMF_renameAs", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(testCaseEClass, this.getTestCase(),
				"setTestMethodName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "name", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(testCaseEClass, theStandardPackage.getJavaString(),
				"getTestMethodName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testCaseEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testCaseEClass, null, "tearDown", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(testCaseEClass, null, "run", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(testRunnerEClass, TestRunner.class, "TestRunner",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestRunner_Log(), this.getLog(), null, "log", null,
				0, 1, TestRunner.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(testRunnerEClass, null, "runTest", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getTest(), "test", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(testRunnerEClass, null, "printTestResult", 0, 1,
				IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(testRunnerEClass, null, "run", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getClass_(), "testCaseClass", 0,
				1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(errorKindEEnum, ErrorKind.class, "ErrorKind");
		addEEnumLiteral(errorKindEEnum, ErrorKind.SET_UP_ERROR);
		addEEnumLiteral(errorKindEEnum, ErrorKind.TEST_ERROR);
		addEEnumLiteral(errorKindEEnum, ErrorKind.TEAR_DOWN_ERROR);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
		// kermeta.post
		createKermeta_1Annotations();
		// kermeta.pre
		createKermeta_2Annotations();
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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/kunit" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * main features of the famous Unit test tool for Kermeta language\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/kunit_package.png\"/>\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains the implementation of a unit test tool. This is a clone of\n * JUnit architecture.\n * Reference : http://junit.sourceforge.net/doc/cookstour/cookstour.htm\n *\n * Usage example of kunit can be found in fr.irisa.triskell.kermeta.samples project.\n *\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/kunit_package.png\"/>\n */" });
		addAnnotation(abstractFallibleEClass, source, new String[] {
				"documentation",
				"/**\n * to be written ############################\n */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/** process the given condition and react if it is not satisfied */" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/** \n\t ** reduces all runs of white-space to a single space character\n\t **/" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n     * process the given condition and react with the given message\n     * if it is satisfied\n     */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/** to be used if a failure reaction is needed */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(4),
				source,
				new String[] { "documentation",
						"/** process the two given string and react if they are not equal */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(5), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/** process the given condition and react if it is satisfied */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(6), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n     * process the given condition and react with the given message\n     * if it is not satisfied\n     */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(7), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(7),
				source,
				new String[] { "documentation",
						"/** process the given condition and react if it is not satisfied */" });
		addAnnotation(abstractFallibleEClass.getEOperations().get(8), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\n     * process the given condition and react with the given message\n     * if it is not satisfied\n     */" });
		addAnnotation(
				abstractFallibleEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\n   * Log a failure if the two strings are not identical modulo-white-space\n   */" });
		addAnnotation(
				assertionFailedErrorEClass,
				source,
				new String[] { "documentation",
						"/** AssertionViolatedException are raised when assertions are violated */" });
		addAnnotation(
				assertEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/** raise a AssertionViolatedException with the provided message */" });
		addAnnotation(assertEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/** will fail if condition is false */" });
		addAnnotation(assertEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(2), source,
				new String[] { "documentation",
						"/** will fail if condition is true */" });
		addAnnotation(assertEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				assertEClass.getEOperations().get(3),
				source,
				new String[] { "documentation",
						"/** Will fail if the two strings are not identical */" });
		addAnnotation(assertEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(4), source,
				new String[] { "documentation",
						"/** will fail if condition is true */" });
		addAnnotation(assertEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(5), source,
				new String[] { "documentation",
						"/** will fail if condition is false */" });
		addAnnotation(assertEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(6), source,
				new String[] { "documentation",
						"/** Fails if condition is false */" });
		addAnnotation(assertEClass.getEOperations().get(6), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(assertEClass.getEOperations().get(7), source,
				new String[] { "documentation",
						"/** will fail if condition is false */" });
		addAnnotation(assertEClass.getEOperations().get(7), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				invalidTestCaseNameExceptionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * This exception is rose if there is a problem on the name of the test method\n */" });
		addAnnotation(
				invalidParameterExceptionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * This is for when we try to build a suite from a class that isn\'t a TestCase\n */" });
		addAnnotation(
				fallibleEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * This is represents the aspect of tests that they may go wrong.\n * it defines the ability to define the conditions for success\n * (assertions) and the mechanism for recording that those \n * conditions have not been met.\n */" });
		addAnnotation(
				fallibleEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n   * current order position of counter of assertions\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(fallibleEClass.getEOperations().get(1), source,
				new String[] { "EMF_renameAs", "getLogKermeta" });
		addAnnotation(fallibleEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/**\n   * where failures will be put \n   */" });
		addAnnotation(
				fallibleEClass.getEOperations().get(3),
				source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is false\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				fallibleEClass.getEOperations().get(4),
				source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is false\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				fallibleEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is false\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(fallibleEClass.getEOperations().get(6), source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is true\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(6), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(fallibleEClass.getEOperations().get(7), source,
				new String[] { "documentation",
						"/**\n   * Log a failure \n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(7), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				fallibleEClass.getEOperations().get(8),
				source,
				new String[] { "documentation",
						"/**\n   * Log a failure if the two strings are not identical\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(8), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(fallibleEClass.getEOperations().get(9), source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is true\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(9), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				fallibleEClass.getEOperations().get(10),
				source,
				new String[] { "documentation",
						"/**\n   * Log a failure if condition is false\n   */" });
		addAnnotation(fallibleEClass.getEOperations().get(10), source,
				new String[] { "superOperation",
						"kermeta::kunit::AbstractFallible" });
		addAnnotation(
				getFallible_StopOnFailure(),
				source,
				new String[] {
						"documentation",
						"/**\n   * Set this attribute to false if you wish your test to not stop if the assert fails.\n   * note : if set to false, the count of failures/errors may be bigger that the number of executed test operations\n   */" });
		addAnnotation(getFallible_Rank(), source, new String[] {
				"documentation",
				"/**\n   * counter of assertions in the test method\n   */" });
		addAnnotation(
				logEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Log is a log of failures and errors that happened to fallibles since start was called\n */" });
		addAnnotation(
				logEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Adds errors which occur during the SetUp phase\n\t */" });
		addAnnotation(logEClass.getEOperations().get(1), source, new String[] {
				"documentation",
				"/**\n\t * Adds an error to the list of errors\n\t */" });
		addAnnotation(
				logEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\n\t * Adds a failed test to the list of failed tests\n\t */" });
		addAnnotation(
				logEClass.getEOperations().get(3),
				source,
				new String[] { "documentation",
						"/**\n\t * Adds errors which occur during the TearDown phase\n\t */" });
		addAnnotation(logEClass.getEOperations().get(4), source, new String[] {
				"documentation",
				"/**\n\t * Increments the runtests counter\n\t */" });
		addAnnotation(getLog_Failures(), source, new String[] {
				"documentation",
				"/** \n\t * list of detected assertion failures\n\t */" });
		addAnnotation(getLog_Errors(), source, new String[] { "documentation",
				"/**\n\t * list of detected test errors\n\t */" });
		addAnnotation(getLog_Runtests(), source, new String[] {
				"documentation",
				"/**\n\t * number of test that were run\n\t */" });
		addAnnotation(
				getLog_HarnessErrors(),
				source,
				new String[] { "documentation",
						"/**\n\t* list of detected errors with the test harness\n\t*/" });
		addAnnotation(
				failureEClass,
				source,
				new String[] { "documentation",
						"/**\n * Failure represents an assertion failure stored in a failure log\n */" });
		addAnnotation(
				failureEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * overwrite the default method, in order to add the message\n\t */" });
		addAnnotation(failureEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(failureEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/**\n\t * initialization of the failure\n\t */" });
		addAnnotation(
				getFailure_Message(),
				source,
				new String[] { "documentation",
						"/**\n\t * the stored message (given or generated one)\n\t */" });
		addAnnotation(getFailure_Failure(), source, new String[] {
				"documentation", "/**\n\t * the stored failure\n\t */" });
		addAnnotation(errorKindEEnum, source, new String[] { "documentation",
				"/**\n * all kinds of error we can meet\n */" });
		addAnnotation(
				errorEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Error represents an occurrence of an exception in setUp, tearDown or a test\n * and is stored in a failure log\n */" });
		addAnnotation(
				errorEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Changes the type of an error to makeTearDownError, the best way to use\n\t * this method is to call it after the init from line:\n\t * var e : Error init Error.new.initFrom(f, e).makeTearDown\n\t */" });
		addAnnotation(
				errorEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Changes the type of an error to SetUpError, the best way to use\n\t * this method is to call it after the init from line:\n\t * var e : Error init Error.new.initFrom(f, e).makeSetUp\n\t */" });
		addAnnotation(
				errorEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * overwrite the default method, in order to add :\n\t *   - the type\n\t *   - the message\n\t *   - the stack trace\n\t */" });
		addAnnotation(errorEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				errorEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Sets up a new error with failable object and the exception that occurred\n\t * by default it will be a test error. Use makeSetUp or makeTearDown to\n\t * change its type\n\t */" });
		addAnnotation(getError_Error(), source, new String[] { "documentation",
				"/**\n\t * the stored error\n\t */" });
		addAnnotation(
				getError_Exception(),
				source,
				new String[] { "documentation",
						"/**\n\t * the Kermeta exception corresponding to the error\n\t */" });
		addAnnotation(getError_Kind(), source, new String[] { "documentation",
				"/**\n\t * the nature of the stored error\n\t */" });
		addAnnotation(
				testEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * The abstact notion of a test which is runnable and which has a log\n * in which it can keep note of failures\n */" });
		addAnnotation(
				testEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Initializes the log where failures and errors will be put\n\t */" });
		addAnnotation(testEClass.getEOperations().get(0), source, new String[] {
				"EMF_renameAs", "setLogEMF_renameAs" });
		addAnnotation(testEClass.getEOperations().get(0), source, new String[] {
				"EMF_renameAs", "setLogKermeta" });
		addAnnotation(testEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(testEClass.getEOperations().get(1), source, new String[] {
				"documentation",
				"/**\n\t * Execute the test and verify its assertions\n\t */" });
		addAnnotation(testEClass.getEOperations().get(2), source, new String[] {
				"documentation",
				"/**\n\t * called when run by the java testrunner\n\t */" });
		addAnnotation(getTest_Log(), source, new String[] { "documentation",
				"/**\n     * where failures and errors will be put \n     */" });
		addAnnotation(
				testSuiteEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * A TestSuite is a structured collection of tests, using the\n * composite pattern, all tests are runnable and have a log\n * In addition a suite can be populated automatically from a\n * test case class with one test case object for each test\n * method in the class.\n *  You can make a suite and populate it manually like this:\n *\n *  var suite : TestSuite init TestSuite.new.\n *  suite.tests.add(t1)\n *\n *  Alternatively you can populate a suite automatically from\n *  a class that inherits TestCase and which has several methods\n *  called test:\n *\n *  var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n */" });
		addAnnotation(
				testSuiteEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t  * Add to this suite, a set of test cases of type c, one for each\n\t  * test method in class c. C must be a descendent of TestCase\n\t  */" });
		addAnnotation(
				testSuiteEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/** \n\t * Run all the tests in the test suite\n\t */" });
		addAnnotation(testSuiteEClass.getEOperations().get(1), source,
				new String[] { "superOperation", "kermeta::kunit::Test" });
		addAnnotation(
				testSuiteEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t  * to be written #####################################################\n\t  */" });
		addAnnotation(
				getTestSuite_Tests(),
				source,
				new String[] { "documentation",
						"/**\n\t * The collection of tests which will be ran as the suite\n\t */" });
		addAnnotation(
				testCaseEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * A test case comprises one or more test methods plus\n * setUp and tearDown that build and destroy their test harness.\n * An instance of a subclass of TestCase should have its\n * testMethodName set to the name of one of its operations\n * which should be called whe the test is run. You can do this\n * yourself:\n *\n * var testCase : TestCase init MyTestCaseClass.new.setTestMethodName(\"testSomething\")\n *\n * Alternatively if your TestCase Class has many methods whose\n * name begins with \'test\' you can create a set of instaces already\n * set up with their testMethodName using the addAllTestCasesFrom\n * operation on TestSuite\n */" });
		addAnnotation(
				testCaseEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * operation used when the TestCase is run from a java test runner, encapsulates the failures results\n\t * into an AssertionFailedError so the TestRunner can detect it\n\t */" });
		addAnnotation(
				testCaseEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * the things to be done before execution of the test method\n\t * (designed to be overwritten in real TestCase classes) \n\t */" });
		addAnnotation(testCaseEClass.getEOperations().get(2), source,
				new String[] { "documentation",
						"/**\n\t * accessor on the log\n\t */" });
		addAnnotation(testCaseEClass.getEOperations().get(2), source,
				new String[] { "EMF_renameAs", "getLogEMF_renameAs" });
		addAnnotation(testCaseEClass.getEOperations().get(2), source,
				new String[] { "superOperation", "kermeta::kunit::Fallible" });
		addAnnotation(
				testCaseEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Sets the name of the method from the concrete subclass of\n\t *  TestCase that should be executed when this TestCase instance\n\t * is run as a test.\n\t * Throws invalidTestCaseNameException if the given string is not\n\t * the name of a method in the test case\n\t */" });
		addAnnotation(testCaseEClass.getEOperations().get(4), source,
				new String[] { "documentation",
						"/**\n\t * accessor on the method name\n\t */" });
		addAnnotation(
				testCaseEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n\t * overwrites the default method for more informative output\n\t */" });
		addAnnotation(testCaseEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				testCaseEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * the things to be done after execution of the test method\n\t * (designed to be overwritten in real TestCase classes) \n\t */" });
		addAnnotation(
				testCaseEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Execute the whole test case : SetUp, test method, TearDown\n\t * The assertions of the test method are computed\n\t */" });
		addAnnotation(testCaseEClass.getEOperations().get(7), source,
				new String[] { "superOperation", "kermeta::kunit::Test" });
		addAnnotation(
				getTestCase___testMethodName(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * the name of the method which corresponds to the test case in the test class\n\t */" });
		addAnnotation(
				testRunnerEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Create and use a test runner to run one or more tests and print the failure log. E.g.:\n * do\n *\t     var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n *\t     var runner : TestRunner init TestRunner.new\n *\t     runner.run(suite)\n *\t     runner.printLogs\n * end\n *\n * Where InterestingTestCaseSet is a subclass of TestCase and contains several test... methods\n */" });
		addAnnotation(
				testRunnerEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Use this to run a test case or a test suite.\n\t * If you want to run all the test.... methods in a TestCase class,\n\t *  you can populate a suite with TestSuite.addAllTestCasesFrom\n\t */" });
		addAnnotation(
				testRunnerEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Prints the log or errors and failures from a test run.\n\t * Run some tests first.\n\t */" });
		addAnnotation(
				testRunnerEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t  * For backwards compatibility with old kunit, this takes a test case class\n\t  * and creates the necessary suite, and runs it. DEPRECATED\n\t  */" });
		addAnnotation(getTestRunner_Log(), source, new String[] {
				"documentation",
				"/**\n\t * Where to register the failures and errors\n\t */" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.post</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta.post";
		addAnnotation(fallibleEClass.getEOperations().get(1), source,
				new String[] { "logDefined", "" });
		addAnnotation(testEClass.getEOperations().get(0), source, new String[] {
				"logNotVoid", "" });
		addAnnotation(testRunnerEClass.getEOperations().get(0), source,
				new String[] { "logNotVoid", "" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.pre</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_2Annotations() {
		String source = "kermeta.pre";
		addAnnotation(testEClass.getEOperations().get(0), source, new String[] {
				"paramNotVoid", "" });
		addAnnotation(testEClass.getEOperations().get(1), source, new String[] {
				"logNotVoid", "" });
		addAnnotation(testSuiteEClass.getEOperations().get(0), source,
				new String[] { "testCaseClassIsATestCase", "" });
		addAnnotation(testRunnerEClass.getEOperations().get(0), source,
				new String[] { "testNotVoid", "" });
		addAnnotation(testRunnerEClass.getEOperations().get(2), source,
				new String[] { "cIsATestCase", "" });
	}

} //KunitPackageImpl
