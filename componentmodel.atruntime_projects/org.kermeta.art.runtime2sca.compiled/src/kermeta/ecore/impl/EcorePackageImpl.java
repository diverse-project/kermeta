/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.ecore.impl;

import art.ArtPackage;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EFeatureMapEntry;
import kermeta.ecore.EcoreFactory;
import kermeta.ecore.EcorePackage;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureMapEntryEClass = null;

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
	 * @see kermeta.ecore.EcorePackage#eNS_URI
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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
				.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new EcorePackageImpl());

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
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
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
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		ScaPackageImpl theScaPackage = (ScaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI) instanceof ScaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI)
				: ScaPackage.eINSTANCE);
		Runtime2SCAPackageImpl theRuntime2SCAPackage = (Runtime2SCAPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI) instanceof Runtime2SCAPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI)
				: Runtime2SCAPackage.eINSTANCE);
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
		theEcorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theScaPackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeatureMapEntry() {
		return eFeatureMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeatureMapEntry_Value() {
		return (EReference) eFeatureMapEntryEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFeatureMapEntry_EStructuralFeatureName() {
		return (EAttribute) eFeatureMapEntryEClass.getEStructuralFeatures()
				.get(1);
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
		eFeatureMapEntryEClass = createEClass(EFEATURE_MAP_ENTRY);
		createEReference(eFeatureMapEntryEClass, EFEATURE_MAP_ENTRY__VALUE);
		createEAttribute(eFeatureMapEntryEClass,
				EFEATURE_MAP_ENTRY__ESTRUCTURAL_FEATURE_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eFeatureMapEntryEClass.getESuperTypes().add(
				theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(eFeatureMapEntryEClass, EFeatureMapEntry.class,
				"EFeatureMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFeatureMapEntry_Value(), theStructurePackage
				.getObject(), null, "value", null, 0, 1,
				EFeatureMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEFeatureMapEntry_EStructuralFeatureName(),
				theStandardPackage.getJavaString(), "eStructuralFeatureName",
				null, 0, 1, EFeatureMapEntry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/ecore" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/** \n * Contains the definition of a Kermeta classes used for compatibility with Ecore \n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/ecore_compatibility_package.png\"/>\n */" });
		addAnnotation(
				eFeatureMapEntryEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Kermeta representation of EMF EFeatureMapEntry\n * it contains the name of the required feature and the actual value\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/ecore_compatibility_package.png\"/>\n */" });
	}

} //EcorePackageImpl
