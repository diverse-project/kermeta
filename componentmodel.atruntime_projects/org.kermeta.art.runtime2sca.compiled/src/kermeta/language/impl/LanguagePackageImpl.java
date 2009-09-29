/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.impl;

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

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.DummyClass;
import kermeta.language.LanguageFactory;
import kermeta.language.LanguagePackage;
import kermeta.language.ReflectiveCollection;
import kermeta.language.ReflectiveSequence;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

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
public class LanguagePackageImpl extends EPackageImpl implements
		LanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyClassEClass = null;

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
	 * @see kermeta.language.LanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LanguagePackageImpl() {
		super(eNS_URI, LanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LanguagePackage init() {
		if (isInited)
			return (LanguagePackage) EPackage.Registry.INSTANCE
					.getEPackage(LanguagePackage.eNS_URI);

		// Obtain or create and register package
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new LanguagePackageImpl());

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
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
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
		theLanguagePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theScaPackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theLanguagePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LanguagePackage.eNS_URI,
				theLanguagePackage);
		return theLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveCollection() {
		return reflectiveCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveSequence() {
		return reflectiveSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyClass() {
		return dummyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFactory getLanguageFactory() {
		return (LanguageFactory) getEFactoryInstance();
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
		reflectiveCollectionEClass = createEClass(REFLECTIVE_COLLECTION);

		reflectiveSequenceEClass = createEClass(REFLECTIVE_SEQUENCE);

		dummyClassEClass = createEClass(DUMMY_CLASS);
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
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStructurePackage);
		getESubpackages().add(theBehaviorPackage);

		// Create type parameters
		ETypeParameter reflectiveCollectionEClass_G = addETypeParameter(
				reflectiveCollectionEClass, "G");
		ETypeParameter reflectiveSequenceEClass_G = addETypeParameter(
				reflectiveSequenceEClass, "G");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theStandardPackage.getSet());
		EGenericType g2 = createEGenericType(reflectiveCollectionEClass_G);
		g1.getETypeArguments().add(g2);
		reflectiveCollectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(reflectiveSequenceEClass_G);
		g1.getETypeArguments().add(g2);
		reflectiveSequenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getReflectiveCollection());
		g2 = createEGenericType(reflectiveSequenceEClass_G);
		g1.getETypeArguments().add(g2);
		reflectiveSequenceEClass.getEGenericSuperTypes().add(g1);
		dummyClassEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(reflectiveCollectionEClass, ReflectiveCollection.class,
				"ReflectiveCollection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(reflectiveCollectionEClass, null, "clear", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(reflectiveCollectionEClass, null,
				"remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(reflectiveCollectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reflectiveCollectionEClass, null, "add", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(reflectiveCollectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reflectiveSequenceEClass, ReflectiveSequence.class,
				"ReflectiveSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(reflectiveSequenceEClass, null, "clear", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(reflectiveSequenceEClass, null, "addAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaInteger(), "index", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(reflectiveSequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reflectiveSequenceEClass, null, "removeAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaInteger(), "index", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reflectiveSequenceEClass, null, "remove", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(reflectiveSequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reflectiveSequenceEClass, theStandardPackage
				.getJavaBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reflectiveSequenceEClass, null, "add", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(reflectiveSequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dummyClassEClass, DummyClass.class, "DummyClass",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/language" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains the implementation of Kermeta reflective collections.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_package.png\"/>\n */" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(
				reflectiveCollectionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * ReflectiveCollection is a special collection that is used to define the type \n * of attributes that have an upper multiplicity > 1 in a class. It indeed handles\n * the update of opposite property if such an attribute has got one.\n */" });
		addAnnotation(
				reflectiveCollectionEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::standard::Collection<G>.clear(G)\n\t */" });
		addAnnotation(reflectiveCollectionEClass.getEOperations().get(0),
				source, new String[] { "superOperation",
						"kermeta::standard::Collection" });
		addAnnotation(
				reflectiveCollectionEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::standard::Set<G>.remove(G)\n\t */" });
		addAnnotation(reflectiveCollectionEClass.getEOperations().get(1),
				source, new String[] { "superOperation",
						"kermeta::standard::Set" });
		addAnnotation(
				reflectiveCollectionEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides kermeta::standard::Set<G>.add(G)\n\t * Add an element to this collection and update its opposite property if it exists.\n\t */" });
		addAnnotation(reflectiveCollectionEClass.getEOperations().get(2),
				source, new String[] { "superOperation",
						"kermeta::standard::Set" });
		addAnnotation(
				reflectiveSequenceEClass,
				source,
				new String[] { "documentation",
						"/**\n * ReflectiveSequence is an ordered ReflectiveCollection.\n */" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.clear()\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::ReflectiveCollection" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::standard::OrderedSet.addAt(Integer)\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedSet" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::standard::OrderedSet.removeAt(Integer)\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.remove(G)\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::ReflectiveCollection" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(4),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::standard::OrderedSet.equals(Object)\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedSet" });
		addAnnotation(
				reflectiveSequenceEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n\t * Overrides kermeta::language::ReflectiveCollection<G>.add(G)\n\t */" });
		addAnnotation(reflectiveSequenceEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::language::ReflectiveCollection" });
		addAnnotation(dummyClassEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(
				dummyClassEClass,
				source,
				new String[] {
						"documentation",
						"This class is used to workaround an EMF bug, it doesn\'t really belong to Kermeta metamodel" });
	}

} //LanguagePackageImpl
