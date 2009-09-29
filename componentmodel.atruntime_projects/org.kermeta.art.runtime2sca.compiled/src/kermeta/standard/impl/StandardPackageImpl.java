/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.standard.impl;

import art.ArtPackage;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import java.lang.Boolean;
import java.lang.Character;
import java.lang.Integer;
import java.lang.String;

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

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.Bag;
import kermeta.standard.Collection;
import kermeta.standard.Iterator;
import kermeta.standard.NotComparableException;
import kermeta.standard.OrderedCollection;
import kermeta.standard.OrderedSet;
import kermeta.standard.Real;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;
import kermeta.standard.StandardPackage;
import kermeta.standard.Summable;
import kermeta.standard.UnknownJavaObject;
import kermeta.standard.ValueType;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
public class StandardPackageImpl extends EPackageImpl implements
		StandardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownJavaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notComparableExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaNumericEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaRealEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaCharacterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_ValueType_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Collection_valuesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Iterator_javaIteratorEDataType = null;

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
	 * @see kermeta.standard.StandardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StandardPackageImpl() {
		super(eNS_URI, StandardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StandardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StandardPackage init() {
		if (isInited)
			return (StandardPackage) EPackage.Registry.INSTANCE
					.getEPackage(StandardPackage.eNS_URI);

		// Obtain or create and register package
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new StandardPackageImpl());

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
		theStandardPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theScaPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theStandardPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStandardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StandardPackage.eNS_URI,
				theStandardPackage);
		return theStandardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownJavaObject() {
		return unknownJavaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
		return (EAttribute) valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummable() {
		return summableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotComparableException() {
		return notComparableExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Values() {
		return (EAttribute) collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBag() {
		return bagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedCollection() {
		return orderedCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedSet() {
		return orderedSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterator() {
		return iteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterator_JavaIterator() {
		return (EAttribute) iteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterator_KermetaCollection() {
		return (EReference) iteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaBoolean() {
		return javaBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaNumeric() {
		return javaNumericEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaInteger() {
		return javaIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaReal() {
		return javaRealEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaCharacter() {
		return javaCharacterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaString() {
		return javaStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_ValueType_value() {
		return kermetaProperty_ValueType_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Collection_values() {
		return kermetaProperty_Collection_valuesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Iterator_javaIterator() {
		return kermetaProperty_Iterator_javaIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFactory getStandardFactory() {
		return (StandardFactory) getEFactoryInstance();
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
		unknownJavaObjectEClass = createEClass(UNKNOWN_JAVA_OBJECT);

		voidEClass = createEClass(VOID);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__VALUE);

		comparableEClass = createEClass(COMPARABLE);

		summableEClass = createEClass(SUMMABLE);

		notComparableExceptionEClass = createEClass(NOT_COMPARABLE_EXCEPTION);

		booleanEClass = createEClass(BOOLEAN);

		integerEClass = createEClass(INTEGER);

		realEClass = createEClass(REAL);

		characterEClass = createEClass(CHARACTER);

		stringEClass = createEClass(STRING);

		collectionEClass = createEClass(COLLECTION);
		createEAttribute(collectionEClass, COLLECTION__VALUES);

		setEClass = createEClass(SET);

		bagEClass = createEClass(BAG);

		orderedCollectionEClass = createEClass(ORDERED_COLLECTION);

		orderedSetEClass = createEClass(ORDERED_SET);

		sequenceEClass = createEClass(SEQUENCE);

		iteratorEClass = createEClass(ITERATOR);
		createEAttribute(iteratorEClass, ITERATOR__JAVA_ITERATOR);
		createEReference(iteratorEClass, ITERATOR__KERMETA_COLLECTION);

		// Create data types
		javaBooleanEDataType = createEDataType(JAVA_BOOLEAN);
		javaNumericEDataType = createEDataType(JAVA_NUMERIC);
		javaIntegerEDataType = createEDataType(JAVA_INTEGER);
		javaRealEDataType = createEDataType(JAVA_REAL);
		javaCharacterEDataType = createEDataType(JAVA_CHARACTER);
		javaStringEDataType = createEDataType(JAVA_STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
		objectEDataType = createEDataType(OBJECT);
		kermetaProperty_ValueType_valueEDataType = createEDataType(KERMETA_PROPERTY_VALUE_TYPE_VALUE);
		kermetaProperty_Collection_valuesEDataType = createEDataType(KERMETA_PROPERTY_COLLECTION_VALUES);
		kermetaProperty_Iterator_javaIteratorEDataType = createEDataType(KERMETA_PROPERTY_ITERATOR_JAVA_ITERATOR);
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
		ExceptionsPackage theExceptionsPackage = (ExceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter summableEClass_G = addETypeParameter(summableEClass, "G");
		ETypeParameter collectionEClass_G = addETypeParameter(collectionEClass,
				"G");
		ETypeParameter setEClass_G = addETypeParameter(setEClass, "G");
		ETypeParameter bagEClass_G = addETypeParameter(bagEClass, "G");
		ETypeParameter orderedCollectionEClass_G = addETypeParameter(
				orderedCollectionEClass, "G");
		ETypeParameter orderedSetEClass_G = addETypeParameter(orderedSetEClass,
				"G");
		ETypeParameter sequenceEClass_G = addETypeParameter(sequenceEClass, "G");
		ETypeParameter iteratorEClass_G = addETypeParameter(iteratorEClass, "G");
		addETypeParameter(kermetaProperty_Collection_valuesEDataType, "G");
		addETypeParameter(kermetaProperty_Iterator_javaIteratorEDataType, "G");

		// Set bounds for type parameters

		// Add supertypes to classes
		unknownJavaObjectEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		voidEClass.getESuperTypes().add(theStructurePackage.getObject());
		valueTypeEClass.getESuperTypes().add(theStructurePackage.getObject());
		comparableEClass.getESuperTypes().add(theStructurePackage.getObject());
		summableEClass.getESuperTypes().add(theStructurePackage.getObject());
		notComparableExceptionEClass.getESuperTypes().add(
				theExceptionsPackage.getException());
		booleanEClass.getESuperTypes().add(this.getValueType());
		integerEClass.getESuperTypes().add(this.getValueType());
		realEClass.getESuperTypes().add(this.getValueType());
		characterEClass.getESuperTypes().add(this.getValueType());
		stringEClass.getESuperTypes().add(this.getValueType());
		collectionEClass.getESuperTypes().add(theStructurePackage.getObject());
		EGenericType g1 = createEGenericType(this.getCollection());
		EGenericType g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		setEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		bagEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(orderedCollectionEClass_G);
		g1.getETypeArguments().add(g2);
		orderedCollectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		sequenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		sequenceEClass.getEGenericSuperTypes().add(g1);
		iteratorEClass.getESuperTypes().add(theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(unknownJavaObjectEClass, UnknownJavaObject.class,
				"UnknownJavaObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(unknownJavaObjectEClass, this.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(voidEClass, kermeta.standard.Void.class, "Void",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(voidEClass, this.getJavaBoolean(), "isVoid", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(voidEClass, this.getJavaBoolean(),
				"isInstanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getType(), "type", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(voidEClass, this.getJavaString(), "toString", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Value(), this
				.getKermetaProperty_ValueType_value(), "value", null, 0, 1,
				ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparableEClass, kermeta.standard.Comparable.class,
				"Comparable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(comparableEClass, this.getJavaInteger(),
				"compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isGreater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isLowerOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isGreaterOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(), "isLower",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(summableEClass, Summable.class, "Summable", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(summableEClass, null, "plus", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(summableEClass_G);
		addEParameter(op, g1, "other", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(summableEClass_G);
		initEOperation(op, g1);

		initEClass(notComparableExceptionEClass, NotComparableException.class,
				"NotComparableException", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, kermeta.standard.Boolean.class, "Boolean",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, kermeta.standard.Integer.class, "Integer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterEClass, kermeta.standard.Character.class,
				"Character", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, kermeta.standard.String.class, "String",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionEClass, Collection.class, "Collection",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getKermetaProperty_Collection_values());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEAttribute(getCollection_Values(), g1, "values", null, 0, 1,
				Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "iterator", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getIterator());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "add", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "addAll", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaInteger(), "size", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaBoolean(), "contains",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaBoolean(), "empty", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaBoolean(), "isEmpty", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, null, "clear", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaInteger(), "count", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "asSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "asSequence", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "asOrderedSet", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "asBag", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, this.getJavaBoolean(), "excludes",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "one", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, this.getJavaBoolean(),
				"containsAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "sum", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, this.getJavaBoolean(),
				"excludesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaBoolean(), "includes",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "any", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		initEOperation(op, g1);

		addEOperation(collectionEClass, this.getJavaBoolean(), "isNotEmpty", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaBoolean(),
				"includesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(setEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(setEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(setEClass, this.getJavaBoolean(), "equals", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(setEClass, null, "intersection", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "minus", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(setEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(setEClass, null, "asSequence", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "symmetricDifference", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "concatenate", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "less", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "pivot", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "flatten", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(theStructurePackage.getObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "asBag", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "union", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "asSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "unionWithBag", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(bagEClass, Bag.class, "Bag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bagEClass, null, "intersection", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "asSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, this.getJavaBoolean(), "equals", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bagEClass, null, "asSequence", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "concatenate", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "less", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "pivot", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "excluding", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(bagEClass_G);
		addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "flatten", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(theStructurePackage.getObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "intersectionWithSet", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "including", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(bagEClass_G);
		addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "asBag", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "union", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(bagEClass, null, "removeOne", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(bagEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bagEClass, null, "removeFromOid", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "elementOid", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(orderedCollectionEClass, OrderedCollection.class,
				"OrderedCollection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orderedCollectionEClass, null, "removeAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(orderedCollectionEClass, null, "addAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedCollectionEClass, null, "elementAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		initEOperation(op, g1);

		op = addEOperation(orderedCollectionEClass, null, "last", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		initEOperation(op, g1);

		op = addEOperation(orderedCollectionEClass, this.getJavaBoolean(),
				"equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedCollectionEClass, this.getJavaInteger(),
				"indexOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedCollectionEClass, null, "first", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		initEOperation(op, g1);

		initEClass(orderedSetEClass, OrderedSet.class, "OrderedSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orderedSetEClass, null, "add", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedSetEClass, null, "append", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, null, "addAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedSetEClass, null, "insertAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "subject", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, null, "preppend", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, this.getJavaBoolean(), "equals",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedSetEClass, null, "at", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, null, "subSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "min", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "max", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(sequenceEClass, null, "subSequence", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "min", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "max", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(sequenceEClass, null, "append", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(sequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(sequenceEClass, null, "insertAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(sequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(sequenceEClass, null, "preppend", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(sequenceEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(sequenceEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(sequenceEClass, this.getJavaBoolean(), "equals", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sequenceEClass, null, "at", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(sequenceEClass_G);
		initEOperation(op, g1);

		initEClass(iteratorEClass, Iterator.class, "Iterator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getKermetaProperty_Iterator_javaIterator());
		g2 = createEGenericType(iteratorEClass_G);
		g1.getETypeArguments().add(g2);
		initEAttribute(getIterator_JavaIterator(), g1, "javaIterator", null, 0,
				1, Iterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(iteratorEClass_G);
		g1.getETypeArguments().add(g2);
		initEReference(getIterator_KermetaCollection(), g1, null,
				"kermetaCollection", null, 0, 1, Iterator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(iteratorEClass, this.getJavaBoolean(), "hasNext", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iteratorEClass, null, "next", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(iteratorEClass_G);
		initEOperation(op, g1);

		addEOperation(iteratorEClass, this.getJavaBoolean(), "isOff", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(javaBooleanEDataType, Boolean.class, "JavaBoolean",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaNumericEDataType, Number.class, "JavaNumeric",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIntegerEDataType, Integer.class, "JavaInteger",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaRealEDataType, Double.class, "JavaReal",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaCharacterEDataType, Character.class, "JavaCharacter",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaStringEDataType, String.class, "JavaString",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, Integer.class,
				"UnlimitedNatural", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_ValueType_valueEDataType, String.class,
				"KermetaProperty_ValueType_value", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Collection_valuesEDataType, EList.class,
				"KermetaProperty_Collection_values", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Iterator_javaIteratorEDataType,
				java.util.Iterator.class,
				"KermetaProperty_Iterator_javaIterator", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
		// kermeta.post
		createKermeta_1Annotations();
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
				"http://www.kermeta.org/kermeta/1_2_0//kermeta/standard" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains types dedicated to dealing with java objects\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Defines value types \n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/primitive_types_view.png\"/>\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Defines Collection types \n * <img src=\"./figures/collections_view.png\"/>\n */" });
		addAnnotation(
				unknownJavaObjectEClass,
				source,
				new String[] {
						"documentation",
						"/** \n  * This special object is used to represent java objects that cannot be concretely used with kermeta\n  * <b>the only actions possible on these objects are : assignment and passing them as parameter</b>\n  * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\n  */" });
		addAnnotation(unknownJavaObjectEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\n \t * NOT IMPLEMENTED\n \t */" });
		addAnnotation(unknownJavaObjectEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				voidEClass,
				source,
				new String[] { "documentation",
						"/**\n * The class Void \n * By convention it is a sub-type of everything\n */" });
		addAnnotation(voidEClass.getEOperations().get(0), source, new String[] {
				"documentation", "/**\n\t * Return true\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(0), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(voidEClass.getEOperations().get(1), source, new String[] {
				"documentation", "/**\n\t * Returns true\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(voidEClass.getEOperations().get(2), source, new String[] {
				"documentation",
				"/**\n\t * Returns the String identifier \'<void>\'\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(2), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				valueTypeEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * The abstract class ValueType does not contain any feature.\n * However, any instance of a sub-class of ValueType will be passed by value \n * instead of by reference for any other objects.\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\n * \n */" });
		addAnnotation(valueTypeEClass, source, new String[] {
				"EMF_needProperty", "name=value javaClass=java.lang.String" });
		addAnnotation(
				comparableEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * The abstract class Comparable defines a set of operation\n * to compare instances of a class.\n * Sub-classes only has to implement abstract operation compareTo.\n * All other methods are defined w.r.t. the compareTo operation\n */" });
		addAnnotation(comparableEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				comparableEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * This method should be implemented by any class that inherits\n\t * from Comparable.\n\t * returns 0 if self = other\n\t * returns > 0 if  self > other\n\t * returns < 0 if  self < other\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(0), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(1), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/**\n\t * return true if self > other\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(2), source,
				new String[] { "documentation",
						"/**\n\t * return true if self <= other\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(2), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(3), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/**\n\t * return true if self >= other\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(4), source,
				new String[] { "documentation",
						"/**\n\t * return true if self < other\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(4), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				summableEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * The abstract class Summable defines a set of operation\n * to sum instances of a class.\n * Sub-classes only has to implement abstract operation plus.\n  */" });
		addAnnotation(summableEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				summableEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Summarization method to be implemented by any summable class.\n\t * The parameter must have the same type (or one of its subtypes)\n\t *  than the current object .\n\t */" });
		addAnnotation(summableEClass.getEOperations().get(0), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(notComparableExceptionEClass, source, new String[] {
				"documentation",
				"/**\n * raised when two objects are not comparable\n */" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"alias", "kermeta::standard::Integer" });
		addAnnotation(
				unlimitedNaturalEDataType,
				source,
				new String[] {
						"documentation",
						"/**\n * Unlimited natural is used for reflection.\n * It is mapped to integer.equals().\n * Any negative number is interpreted as \'*\'\n */" });
		addAnnotation(objectEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(objectEDataType, source, new String[] { "deprecated",
				"please use directly kermeta::language::structure::Object" });
		addAnnotation(
				collectionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Collection is the root abstract class for all kermeta collections\n */" });
		addAnnotation(collectionEClass, source, new String[] {
				"EMF_needProperty",
				"name=values javaClass=org.eclipse.emf.common.util.EList" });
		addAnnotation(
				collectionEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns an Iterator on the Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n\t * Adds an element in the Collection (default implementation)\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Adds all elements from the Collection elements in the current Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(3),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns the number of elements in the Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the Collection contains at least one\n\t * instance of element, based on G.equals(elt : Object) definition\n\t * Note: for checking whether a physical element is contained by the collection,\n\t * make use of G.oid()\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a Boolean stating whether the Collection is empty\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * OCL alignment API, does the same as empty\n\t * See Collection<G>.empty()\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(7),
				source,
				new String[] { "documentation",
						"/**\n\t * Removes all elements from the Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(8),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns the number of instances of element in the Collection\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(9),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a new Set built from the Collection\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(10), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(10),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a new Sequence built from the Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Removes all instances of element from the Collection, based on\n\t * G.equals(Object) definition\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(12), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(12),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a new OrderedSet built from the Collection\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(13),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a new Bag built from the Collection\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(14),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns true if the Collection does not contain element\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(15),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns an element from the Collection or void if the Collection is empty\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(16),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns true if current Collection contains all elements of Collection elements\n\t * See Collection<G>.contains(Object)\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(17),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(18),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns true if the Collection contains no element of Collection elements\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(19),
				source,
				new String[] {
						"documentation",
						"/**\n\t * OCL API alignment, doeas the same as contains\n\t * See Collection<G>.contains(Object)\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(20),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns an element from the Collection\n\t * Raises an EmptyCollection exception if the Collection is empty\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(21),
				source,
				new String[] {
						"documentation",
						"/**\n\t * OCL alignment API\n\t * Returns a Boolean stating whether the Collection contains at least\n\t * one element \n\t * See also Collection<G>.contains(Object)\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(22),
				source,
				new String[] {
						"documentation",
						"/**\n\t * OCL API alignment, does the same as containsAll\n\t * See Collection<G>.containsAll(Collection<G>)\n\t */" });
		addAnnotation(
				setEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * A Set is a non-ordered collection that contains distinct elements\n * (with regards to the G.equals(Object) operation)\n */" });
		addAnnotation(
				setEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.add(G)\n\t * Adds elt to the Set if it is not already contained by the\n\t * Set, does nothing otherwise\n\t */" });
		addAnnotation(setEClass.getEOperations().get(0), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				setEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set corresponding to the intersection of the Set elements\n\t * with the current Set\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set corresponding to the difference between the\n\t * current Set and the Set elements, ie all elements contained by \n\t * the current Set that do not appear in the elements Set \n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.remove(G)\n\t * Removes the element from the Set if it is contained by the Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(4), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asSequence()\n\t * Returns a new Sequence composed of all elements of current Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(5), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set which contents corresponds to the symmetric\n\t * difference between current Set and Set s, ie all elements of\n\t * each Set that do not appear in the other one\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Recursive sort of the given (ordered) set using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Internal concatenation tool for recursive \'quickSort()\' method\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Set, as many elements as the Collection contains\n\t * Duplicates are removed\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asOrderedSet()\n\t * Returns a new OrderedSet that contains all elements of current Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(9), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asBag()\n\t * Returns a new Bag composed of all elements of current Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(10), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set corresponding to the union of the Set elements\n\t * with the current Set\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set composed of all elements of current Set\n\t */" });
		addAnnotation(setEClass.getEOperations().get(12), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag corresponding to the union of the Bag elements\n\t * with the current Set\n\t */" });
		addAnnotation(
				bagEClass,
				source,
				new String[] { "documentation",
						"/**\n * Bag is a concrete non-ordered Collection allowing duplicates\n */" });
		addAnnotation(
				bagEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag corresponding to the intersection of elements\n\t * and the Bag\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asSet()\n\t * Returns a new Set containing elements of the Bag without duplicates\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Object.equals(elt : Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Bag\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(2), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				bagEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asSequence()\n\t * Returns a new Sequence containing all elements of current Bag\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(3), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a sequence of the bag elements sorted using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Recursive sort of the given sequence using the given comparator.\n\t * The comparator must return :<ul>\n\t *   <li>+1 if the second <G> element is greater than the first</li> \n\t *   <li>0 if the second <G> element equals the first</li> \n\t *   <li>-1 if the second <G> element is lower than the first</li> \n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Internal concatenation tool for recursive \'quickSort()\' method\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag which content includes the content of the\n\t * current Bag from which all instances of object have been\n\t * removed\n \t */" });
		addAnnotation(
				bagEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag which content includes all non-Collection elements\n\t * of the current Set, and, for each Collection element of the current\n\t * Bag, as many elements as the Collection contains\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Set corresponding to the intersection of a Set of\n\t * elements and the Bag\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag which content includes the content of the\n\t * current Bag and the element object\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asOrderedSet()\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(9), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Collection<G>.asBag()\n\t * Returns a new Bag containing all elements of current Bag\t\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(10), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a new Bag corresponding to the union of elements and\n\t * current Bag\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(12),
				source,
				new String[] { "documentation",
						"/**\n\t * Removes one instance of element from the Bag\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Removes the element identified by the provided Oid from the Bag\n\t */" });
		addAnnotation(
				orderedCollectionEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * An OrderedCollection is the root abstract class for all ordered Collections.\n */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Removes the element at rank index from the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Adds element in the OrderedCollection at rank index\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the element at rank index in the OrderedCollection\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedCollection\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the last element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides Object.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current OrderedCollection\n\t */" });
		addAnnotation(orderedCollectionEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/** \n\t * Returns the index of the first instance of element in the OrderedCollection\n\t * or -1 if the element is not contained by the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/** \n\t * Returns the first element in the OrderedCollection\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\n\t */" });
		addAnnotation(
				orderedSetEClass,
				source,
				new String[] { "documentation",
						"/**\n * An OrderedSet is a Set that contained ordered distinct elements\n */" });
		addAnnotation(orderedSetEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\n\t * See Set<G>.add(G)\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(0), source,
				new String[] { "superOperation", "kermeta::standard::Set" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new OrderedSet from current one with element\n\t * inserted in head\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides OrderedCollection<G>.addAt(Integer, G)\n\t * Adds element in the OrderedSet at rank index if the ordered set does\n\t * not already contain the element, does nothing otherwise\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new OrderedSet from current one with element\n\t * inserted at rank index\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new OrderedSet from current one with element\n\t * inserted in tail\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n\t * See OrderedCollection<G>.equals(Object) \n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns element at rank index in the sequence\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the OrderedSet\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new OrderedSet composed of elements of current ordered\n\t * set from rank min to rank max (order is respected)\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \n\t * the size of the ordered set or min is larger than max\n\t */" });
		addAnnotation(
				sequenceEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * A Sequence is an OrderedCollection of elements allowing duplicates\n */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new Sequence composed of elements of current sequence\n\t * from rank min to rank max (order is respected)\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \n\t * the size of the sequence or min is larger than max\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new Sequence from current one with element\n\t * inserted in head\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new Sequence from current one with element\n\t * inserted at rank index\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Builds and returns a new Sequence from current one with element\n\t * inserted in tail\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Overrides OrderedCollection<G>.equals(Object)\n\t * Returns a Boolean stating whether the provided element is equal to\n\t * current Sequence\t\n\t */" });
		addAnnotation(sequenceEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				sequenceEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns element at rank index in the sequence\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\n\t * larger than the size of the Sequence\n\t */" });
		addAnnotation(
				iteratorEClass,
				source,
				new String[] {
						"documentation",
						"/**\n * Iterator to be used with Collection\n * See also Collection<G>.getIterator()\n */" });
		addAnnotation(iteratorEClass, source, new String[] {
				"EMF_needProperty",
				"name=javaIterator javaClass=java.util.Iterator" });
		addAnnotation(
				iteratorEClass,
				source,
				new String[] { "EMF_needProperty",
						"name=kermetaCollection classDefinitionQN=kermeta::standard::Collection" });
		addAnnotation(
				iteratorEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns true if the iterator has a next element\n\t */" });
		addAnnotation(
				iteratorEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the next element of the iterator\n\t * Raises IteratorIsOff exception in case the iterator is on the last element \n\t */" });
		addAnnotation(
				iteratorEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns true if the iterator is on the last element\n\t * i.e. returns not self.hasNext()\n\t */" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.post</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta.post";
		addAnnotation(collectionEClass.getEOperations().get(11), source,
				new String[] { "doesntContainsElementAnymore", "" });
		addAnnotation(bagEClass.getEOperations().get(13), source, new String[] {
				"doesntContainsElementAnymore", "" });
	}

} //StandardPackageImpl
