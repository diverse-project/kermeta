/**
 * <copyright>
 * </copyright>
 *
 * $Id: UtilsPackageImpl.java,v 1.4 2008-10-08 14:37:34 cfaucher Exp $
 */
package kermeta.utils.impl;

import java.lang.StringBuffer;

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

import kermeta.utils.Hashtable;
import kermeta.utils.Stack;
import kermeta.utils.UtilsFactory;
import kermeta.utils.UtilsPackage;

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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

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
public class UtilsPackageImpl extends EPackageImpl implements UtilsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashtableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_StringBuffer_contentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Hashtable_wrappedHashtableEDataType = null;

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
	 * @see kermeta.utils.UtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilsPackageImpl() {
		super(eNS_URI, UtilsFactory.eINSTANCE);
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
	public static UtilsPackage init() {
		if (isInited)
			return (UtilsPackage) EPackage.Registry.INSTANCE
					.getEPackage(UtilsPackage.eNS_URI);

		// Obtain or create and register package
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new UtilsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
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
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
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
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
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
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theUtilsPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();

		// Initialize created meta-data
		theUtilsPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilsPackage.freeze();

		return theUtilsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringBuffer() {
		return stringBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBuffer_Content() {
		return (EAttribute) stringBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashtable() {
		return hashtableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashtable_WrappedHashtable() {
		return (EAttribute) hashtableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_StringBuffer_content() {
		return kermetaProperty_StringBuffer_contentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Hashtable_wrappedHashtable() {
		return kermetaProperty_Hashtable_wrappedHashtableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsFactory getUtilsFactory() {
		return (UtilsFactory) getEFactoryInstance();
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
		stackEClass = createEClass(STACK);

		stringBufferEClass = createEClass(STRING_BUFFER);
		createEAttribute(stringBufferEClass, STRING_BUFFER__CONTENT);

		hashtableEClass = createEClass(HASHTABLE);
		createEAttribute(hashtableEClass, HASHTABLE__WRAPPED_HASHTABLE);

		// Create data types
		kermetaProperty_StringBuffer_contentEDataType = createEDataType(KERMETA_PROPERTY_STRING_BUFFER_CONTENT);
		kermetaProperty_Hashtable_wrappedHashtableEDataType = createEDataType(KERMETA_PROPERTY_HASHTABLE_WRAPPED_HASHTABLE);
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
		ETypeParameter stackEClass_G = addETypeParameter(stackEClass, "G");
		ETypeParameter hashtableEClass_K = addETypeParameter(hashtableEClass,
				"K");
		ETypeParameter hashtableEClass_V = addETypeParameter(hashtableEClass,
				"V");
		addETypeParameter(kermetaProperty_Hashtable_wrappedHashtableEDataType,
				"K");
		addETypeParameter(kermetaProperty_Hashtable_wrappedHashtableEDataType,
				"V");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theStandardPackage.getSequence());
		EGenericType g2 = createEGenericType(stackEClass_G);
		g1.getETypeArguments().add(g2);
		stackEClass.getEGenericSuperTypes().add(g1);
		stringBufferEClass.getESuperTypes()
				.add(theStructurePackage.getObject());
		hashtableEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(stackEClass, null, "pop", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(stackEClass_G);
		initEOperation(op, g1);

		op = addEOperation(stackEClass, null, "peek", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(stackEClass_G);
		initEOperation(op, g1);

		op = addEOperation(stackEClass, null, "push", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(stackEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringBufferEClass, kermeta.utils.StringBuffer.class,
				"StringBuffer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringBuffer_Content(), this
				.getKermetaProperty_StringBuffer_content(), "content", null, 0,
				1, kermeta.utils.StringBuffer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(stringBufferEClass, this.getStringBuffer(),
				"append", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "arg0", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(stringBufferEClass, theStandardPackage.getJavaInteger(),
				"length", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringBufferEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hashtableEClass, Hashtable.class, "Hashtable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this
				.getKermetaProperty_Hashtable_wrappedHashtable());
		g2 = createEGenericType(hashtableEClass_K);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(hashtableEClass_V);
		g1.getETypeArguments().add(g2);
		initEAttribute(getHashtable_WrappedHashtable(), g1, "wrappedHashtable",
				null, 0, 1, Hashtable.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(hashtableEClass, null, "clear", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(hashtableEClass, null, "getValue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_K);
		addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_V);
		initEOperation(op, g1);

		op = addEOperation(hashtableEClass,
				theStandardPackage.getJavaBoolean(), "containsKey", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_K);
		addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hashtableEClass, null, "values", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getCollection());
		g2 = createEGenericType(hashtableEClass_V);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(hashtableEClass, null, "put", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_K);
		addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_V);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hashtableEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(hashtableEClass_K);
		addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hashtableEClass, null, "keys", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(hashtableEClass_K);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(hashtableEClass, null, "keyIterator", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getIterator());
		g2 = createEGenericType(hashtableEClass_K);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(hashtableEClass, null, "valueIterator", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getIterator());
		g2 = createEGenericType(hashtableEClass_V);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(hashtableEClass, theStandardPackage.getJavaInteger(),
				"size", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(kermetaProperty_StringBuffer_contentEDataType,
				StringBuffer.class, "KermetaProperty_StringBuffer_content",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Hashtable_wrappedHashtableEDataType,
				java.util.Hashtable.class,
				"KermetaProperty_Hashtable_wrappedHashtable", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/utils" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/** \r\n * Contains special classes (Hashtable, Stack) that are not contained in Kermeta\r\n * metamodel\r\n * \r\n * <img src=\"./figures/utils_package.png\"/>\r\n */" });
		addAnnotation(
				stackEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * An implementation of stack\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n */" });
		addAnnotation(
				stackEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Get and remove the element at the top of the stack\r\n\t */" });
		addAnnotation(
				stackEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Gets the element at the top of the stack\r\n\t */" });
		addAnnotation(
				stackEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Pushes an element into the stack\r\n\t */" });
		addAnnotation(
				stringBufferEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * This class mimic the behavior of the java\'s StringBuffer class. This enables better performance in long\n * string concatenation.<br>\n * <b>Only work on Strings</b>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\n */" });
		addAnnotation(
				stringBufferEClass,
				source,
				new String[] { "EMF_needProperty",
						"name=content isUnique=true isOrdered=false javaClass=java.lang.StringBuffer" });
		addAnnotation(
				stringBufferEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Append a given string at the end of this StringBuffer\n\t * @param arg0 A string to append at the end of this StringBuffer\n\t * @return A reference to this object\n\t */" });
		addAnnotation(
				stringBufferEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Return the length of the StringBuffer\n\t * @return length of the StringBuffer\n\t */" });
		addAnnotation(
				stringBufferEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t *Convert this StringBuffer to String and return its value\n\t *@return The string value of this StringBuffer\n\t */" });
		addAnnotation(stringBufferEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				hashtableEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * An implementation of hashtable\r\n * This implementation is for speed optimisation it cannot be serialized. \r\n * If your wish to serialize its content you need to copy its content into a classical ecore structure (attribute or references)\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/utils_package.png\"/>\r\n */" });
		addAnnotation(
				hashtableEClass,
				source,
				new String[] {
						"EMF_needProperty",
						"name=wrappedHashtable isUnique=false isOrdered=false javaClass=java.util.Hashtable" });
		addAnnotation(
				hashtableEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Removes all elements from the Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns the value for key \'key\' if it exists, otherwise returns Void\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\t\r\n\t * Returns a Boolean stating whether a key is present or not in this Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a collection containing the elements of this Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(4),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Adds a entry into the Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Removes the entry with key equals to \'key\'\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(6),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns a set containing the hash keys of this Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(7),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns an iterator over the Keys of this Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(8),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns an iterator over the values of this Hashtable\r\n\t */" });
		addAnnotation(
				hashtableEClass.getEOperations().get(9),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns the size of this Hashtable\r\n\t */" });
	}

} //UtilsPackageImpl
