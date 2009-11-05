/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.interpreter.impl;

import ecore.EcorePackage;

import ecore.impl.EcorePackageImpl;

import kermeta.KermetaPackage;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.DynamicExpression;
import kermeta.interpreter.InterpreterFactory;
import kermeta.interpreter.InterpreterPackage;
import kermeta.interpreter.KermetaError;
import kermeta.interpreter.ParseError;
import kermeta.interpreter.TypeError;

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
public class InterpreterPackageImpl extends EPackageImpl implements
		InterpreterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeErrorEClass = null;

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
	 * @see kermeta.interpreter.InterpreterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterpreterPackageImpl() {
		super(eNS_URI, InterpreterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterpreterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterpreterPackage init() {
		if (isInited)
			return (InterpreterPackage) EPackage.Registry.INSTANCE
					.getEPackage(InterpreterPackage.eNS_URI);

		// Obtain or create and register package
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new InterpreterPackageImpl());

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
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
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
		theInterpreterPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theIoPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theInterpreterPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theIoPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterpreterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterpreterPackage.eNS_URI,
				theInterpreterPackage);
		return theInterpreterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicExpression() {
		return dynamicExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicExpression_Expression() {
		return (EReference) dynamicExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicExpression_Errors() {
		return (EReference) dynamicExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicExpression_FormalParameters() {
		return (EReference) dynamicExpressionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicExpression_SelfClass() {
		return (EReference) dynamicExpressionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaError() {
		return kermetaErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKermetaError_Message() {
		return (EAttribute) kermetaErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParseError() {
		return parseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeError() {
		return typeErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpreterFactory getInterpreterFactory() {
		return (InterpreterFactory) getEFactoryInstance();
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
		dynamicExpressionEClass = createEClass(DYNAMIC_EXPRESSION);
		createEReference(dynamicExpressionEClass,
				DYNAMIC_EXPRESSION__EXPRESSION);
		createEReference(dynamicExpressionEClass, DYNAMIC_EXPRESSION__ERRORS);
		createEReference(dynamicExpressionEClass,
				DYNAMIC_EXPRESSION__FORMAL_PARAMETERS);
		createEReference(dynamicExpressionEClass,
				DYNAMIC_EXPRESSION__SELF_CLASS);

		kermetaErrorEClass = createEClass(KERMETA_ERROR);
		createEAttribute(kermetaErrorEClass, KERMETA_ERROR__MESSAGE);

		parseErrorEClass = createEClass(PARSE_ERROR);

		typeErrorEClass = createEClass(TYPE_ERROR);
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
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		UtilsPackage theUtilsPackage = (UtilsPackage) EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dynamicExpressionEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		kermetaErrorEClass.getESuperTypes()
				.add(theStructurePackage.getObject());
		parseErrorEClass.getESuperTypes().add(this.getKermetaError());
		typeErrorEClass.getESuperTypes().add(this.getKermetaError());

		// Initialize classes and features; add operations and parameters
		initEClass(dynamicExpressionEClass, DynamicExpression.class,
				"DynamicExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicExpression_Expression(), theBehaviorPackage
				.getExpression(), null, "expression", null, 0, 1,
				DynamicExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicExpression_Errors(), this.getKermetaError(),
				null, "errors", null, 0, -1, DynamicExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		EGenericType g1 = createEGenericType(theUtilsPackage.getHashtable());
		EGenericType g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStructurePackage.getType());
		g1.getETypeArguments().add(g2);
		initEReference(getDynamicExpression_FormalParameters(), g1, null,
				"formalParameters", null, 0, 1, DynamicExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDynamicExpression_SelfClass(), theStructurePackage
				.getClassDefinition(), null, "selfClass", null, 0, 1,
				DynamicExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dynamicExpressionEClass, null, "initializeDefaults", 0,
				1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(dynamicExpressionEClass,
				theStructurePackage.getObject(), "execute", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "selfObj", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getHashtable());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStructurePackage.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "actualParams", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dynamicExpressionEClass, theStandardPackage
				.getJavaBoolean(), "parse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "expression", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dynamicExpressionEClass, theStructurePackage
				.getObject(), "evalString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "body", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "selfObj", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilsPackage.getHashtable());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStructurePackage.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "actualParams", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kermetaErrorEClass, KermetaError.class, "KermetaError",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKermetaError_Message(), theStandardPackage
				.getJavaString(), "message", null, 0, 1, KermetaError.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parseErrorEClass, ParseError.class, "ParseError",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeErrorEClass, TypeError.class, "TypeError", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/interpreter" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains a set of classes whose function is to evaluate a kermeta \n * expression written as a string.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/interpreter_package.png\"/>\n */" });
		addAnnotation(
				dynamicExpressionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * DynamicExpression is a class used to make dynamic calls, i.e dynamic evaluation\n * of Kermeta statements represented in a string.\n * \n * An example :\n *   var de : DynamicExpression init DynamicExpression.new\n *   de.initializeDefaults\n *   de.formalParameters.put(\"a\", String)\n *   de.parse(\"stdio.writeln(a)\") // note: to execute a list of statements, you have to surround them with do..end\n *   var params : Hashtable<String, Object> init Hashtable<String, Object>.new\n *   params.put(\"a\", \"hello world!\")\n *   de.execute(void, params)\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/dynamic_expression_view.png\"/>\n */" });
		addAnnotation(
				dynamicExpressionEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Initializes the formalParameters with an empty set of parameters\n\t * and the self type with void\n\t */" });
		addAnnotation(
				dynamicExpressionEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n     * Execute the expression in the given context\n     */" });
		addAnnotation(
				dynamicExpressionEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Parse the expression as a string\n\t * and updates the expression field and errors\n\t * Returns true if the expression was parsed sucessfuly\n\t */" });
		addAnnotation(
				dynamicExpressionEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n     * Execute the expression given as a string.\n     * the self type and formal parameters are supposed to be set\n     * before calling this operation\n     */" });
		addAnnotation(getDynamicExpression_Expression(), source, new String[] {
				"documentation", "/**\n\t * the expression\n\t */" });
		addAnnotation(getDynamicExpression_Errors(), source, new String[] {
				"documentation",
				"/**\n\t * Parse errors and type errors\n\t */" });
		addAnnotation(
				getDynamicExpression_FormalParameters(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Formal parameters of the expression (bindings between parameters\' names and types)\n\t */" });
		addAnnotation(
				getDynamicExpression_SelfClass(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * The type of the self object\n\t * or void if the expression is not to be executed\n\t * in the context of an object\n\t */" });
		addAnnotation(
				kermetaErrorEClass,
				source,
				new String[] { "documentation",
						"/**\n * Kermeta language error in a code written in Kermeta\n */" });
		addAnnotation(getKermetaError_Message(), source, new String[] {
				"documentation", "/**\n\t * Error message\n\t */" });
		addAnnotation(parseErrorEClass, source, new String[] { "documentation",
				"/**\n * Kermeta error for parsing problems\n */" });
		addAnnotation(typeErrorEClass, source, new String[] { "documentation",
				"/**\n * Type errors in a code written in Kermeta\n */" });
	}

} //InterpreterPackageImpl
