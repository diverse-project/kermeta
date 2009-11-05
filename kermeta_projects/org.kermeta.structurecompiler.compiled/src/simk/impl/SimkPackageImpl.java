/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package simk.impl;

import ecore.EcorePackage;

import ecore.impl.EcorePackageImpl;

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

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

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
	private EClass smClassEClass = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
				.get(eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new SimkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
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
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		kermeta.ecore.impl.EcorePackageImpl theEcorePackage_1 = (kermeta.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) instanceof kermeta.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI)
				: kermeta.ecore.EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_2 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
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

		// Create package meta-data objects
		theSimkPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theIoPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theSimkPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theIoPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimkPackage.eNS_URI, theSimkPackage);
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
	public EAttribute getSMMethod_Usages() {
		return (EAttribute) smMethodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSMMethod_SMContext() {
		return (EReference) smMethodEClass.getEStructuralFeatures().get(10);
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
		createEAttribute(smMethodEClass, SM_METHOD__USAGES);
		createEReference(smMethodEClass, SM_METHOD__SM_CONTEXT);
		createEAttribute(smMethodEClass, SM_METHOD__ACCESS);

		smContextEClass = createEClass(SM_CONTEXT);
		createEReference(smContextEClass, SM_CONTEXT__SM_CLASS);
		createEReference(smContextEClass, SM_CONTEXT__SM_METHODS);
		createEAttribute(smContextEClass, SM_CONTEXT__FINAL_PACKAGE_QNAME);

		smClassEClass = createEClass(SM_CLASS);
		createEReference(smClassEClass, SM_CLASS__CONTEXT);
		createEAttribute(smClassEClass, SM_CLASS__USAGES);

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
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simkModelEClass.getESuperTypes().add(this.getSMNamedElement());
		smMethodEClass.getESuperTypes().add(this.getSMNamedElement());
		smContextEClass.getESuperTypes().add(theStructurePackage.getObject());
		smClassEClass.getESuperTypes().add(this.getSMNamedElement());
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

		EOperation op = addEOperation(simkModelEClass, null, "save", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(simkModelEClass, this.getSMContext(),
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

		initEClass(smMethodEClass, SMMethod.class, "SMMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMMethod__abstract(), ecorePackage.getEBoolean(),
				"_abstract", "false", 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_Body(), ecorePackage.getEString(), "body",
				null, 0, 1, SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSMMethod_ParentEReference(), theEcorePackage
				.getEReference(), null, "parentEReference", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod__static(), ecorePackage.getEBoolean(),
				"_static", "true", 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_TypeParameters(), ecorePackage.getEString(),
				"typeParameters", null, 0, 1, SMMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_ParentEOperation(), theEcorePackage
				.getEOperation(), null, "parentEOperation", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSMMethod_ParentEAttribute(), theEcorePackage
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
		initEAttribute(getSMMethod_Usages(), this.getSMUsage(), "usages", null,
				0, 1, SMMethod.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSMMethod_SMContext(), this.getSMContext(), this
				.getSMContext_SMMethods(), "sMContext", null, 0, 1,
				SMMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMMethod_Access(), this.getSMAccess(), "access",
				"public", 0, 1, SMMethod.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(smMethodEClass, null, "setWrapperUsage", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(smMethodEClass, theEcorePackage.getEOperation(),
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
		initEAttribute(getSMContext_FinalPackageQName(), ecorePackage
				.getEString(), "finalPackageQName", null, 0, 1,
				SMContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		addEOperation(smClassEClass, ecorePackage.getEString(),
				"getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smNamedElementEClass, SMNamedElement.class,
				"SMNamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMNamedElement_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, SMNamedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(smParameterEClass, SMParameter.class, "SMParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smTypedElementEClass, SMTypedElement.class,
				"SMTypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMTypedElement_Type(), ecorePackage.getEString(),
				"type", null, 1, 1, SMTypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(simkModelEClass, source, new String[] { "ecore", "true" });
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
		addAnnotation(simkModelEClass.getEOperations().get(6), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(getSIMKModel_SMContexts(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSIMKModel_SMMethods(), source, new String[] { "ecore",
				"true" });
		addAnnotation(smMethodEClass, source, new String[] { "ecore", "true" });
		addAnnotation(smMethodEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(smMethodEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(smMethodEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSMMethod__abstract(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_ParentEReference(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSMMethod__static(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_TypeParameters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSMMethod_ParentEOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSMMethod_ParentEAttribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSMMethod_SMParameters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getSMMethod_SMReturn(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_Usages(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_SMContext(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMMethod_Access(), source, new String[] { "ecore",
				"true" });
		addAnnotation(smUsageEEnum, source, new String[] { "ecore", "true" });
		addAnnotation(smAccessEEnum, source, new String[] { "ecore", "true" });
		addAnnotation(smContextEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getSMContext_SMClass(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMContext_SMMethods(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMContext_FinalPackageQName(), source, new String[] {
				"ecore", "true" });
		addAnnotation(smClassEClass, source, new String[] { "ecore", "true" });
		addAnnotation(smClassEClass.getEOperations().get(0), source,
				new String[] { "documentation", "/** TODO TO COMMENT*/" });
		addAnnotation(smClassEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(smClassEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getSMClass_Context(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMClass_Usages(), source, new String[] { "ecore",
				"true" });
		addAnnotation(smNamedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMNamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(smParameterEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(smTypedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getSMTypedElement_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(smReturnEClass, source, new String[] { "ecore", "true" });
	}

} //SimkPackageImpl
