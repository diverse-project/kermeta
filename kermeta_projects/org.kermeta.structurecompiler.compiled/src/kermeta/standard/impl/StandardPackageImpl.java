/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandardPackageImpl.java,v 1.6 2008-10-28 13:18:17 cfaucher Exp $
 */
package kermeta.standard.impl;

import java.lang.Boolean;
import java.lang.Character;
import java.lang.Integer;
import java.lang.String;

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

import km2ecore.Km2ecorePackage;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

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
public class StandardPackageImpl extends EPackageImpl implements
		StandardPackage {
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
	private EClass unknownJavaObjectEClass = null;

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
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_String_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Boolean_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Integer_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Real_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Character_valueEDataType = null;

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
	public static StandardPackage init() {
		if (isInited)
			return (StandardPackage) EPackage.Registry.INSTANCE
					.getEPackage(StandardPackage.eNS_URI);

		// Obtain or create and register package
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
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
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
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
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
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
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theStandardPackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theSimkPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();

		// Initialize created meta-data
		theStandardPackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStandardPackage.freeze();

		return theStandardPackage;
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
	public EAttribute getString_Value() {
		return (EAttribute) stringEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getBoolean_Value() {
		return (EAttribute) booleanEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInteger_Value() {
		return (EAttribute) integerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getReal_Value() {
		return (EAttribute) realEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCharacter_Value() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(0);
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
	public EClass getUnknownJavaObject() {
		return unknownJavaObjectEClass;
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
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_String_value() {
		return kermetaProperty_String_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Boolean_value() {
		return kermetaProperty_Boolean_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Integer_value() {
		return kermetaProperty_Integer_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Real_value() {
		return kermetaProperty_Real_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Character_value() {
		return kermetaProperty_Character_valueEDataType;
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
		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);

		voidEClass = createEClass(VOID);

		valueTypeEClass = createEClass(VALUE_TYPE);

		comparableEClass = createEClass(COMPARABLE);

		summableEClass = createEClass(SUMMABLE);

		notComparableExceptionEClass = createEClass(NOT_COMPARABLE_EXCEPTION);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		realEClass = createEClass(REAL);
		createEAttribute(realEClass, REAL__VALUE);

		characterEClass = createEClass(CHARACTER);
		createEAttribute(characterEClass, CHARACTER__VALUE);

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

		unknownJavaObjectEClass = createEClass(UNKNOWN_JAVA_OBJECT);

		// Create data types
		javaStringEDataType = createEDataType(JAVA_STRING);
		javaBooleanEDataType = createEDataType(JAVA_BOOLEAN);
		javaNumericEDataType = createEDataType(JAVA_NUMERIC);
		javaIntegerEDataType = createEDataType(JAVA_INTEGER);
		javaRealEDataType = createEDataType(JAVA_REAL);
		javaCharacterEDataType = createEDataType(JAVA_CHARACTER);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
		kermetaProperty_String_valueEDataType = createEDataType(KERMETA_PROPERTY_STRING_VALUE);
		kermetaProperty_Boolean_valueEDataType = createEDataType(KERMETA_PROPERTY_BOOLEAN_VALUE);
		kermetaProperty_Integer_valueEDataType = createEDataType(KERMETA_PROPERTY_INTEGER_VALUE);
		kermetaProperty_Real_valueEDataType = createEDataType(KERMETA_PROPERTY_REAL_VALUE);
		kermetaProperty_Character_valueEDataType = createEDataType(KERMETA_PROPERTY_CHARACTER_VALUE);
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
		stringEClass.getESuperTypes().add(this.getValueType());
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
		unknownJavaObjectEClass.getESuperTypes().add(
				theStructurePackage.getObject());

		// Initialize classes and features; add operations and parameters
		initEClass(stringEClass, kermeta.standard.String.class, "String",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), this
				.getKermetaProperty_String_value(), "value", null, 0, 1,
				kermeta.standard.String.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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

		initEClass(comparableEClass, kermeta.standard.Comparable.class,
				"Comparable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(comparableEClass, this.getJavaBoolean(), "isLower",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isGreaterOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaInteger(),
				"compareTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isLowerOrEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "other", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(comparableEClass, this.getJavaBoolean(),
				"isGreater", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		initEAttribute(getBoolean_Value(), this
				.getKermetaProperty_Boolean_value(), "value", null, 0, 1,
				kermeta.standard.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(integerEClass, kermeta.standard.Integer.class, "Integer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), this
				.getKermetaProperty_Integer_value(), "value", null, 0, 1,
				kermeta.standard.Integer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReal_Value(), this.getKermetaProperty_Real_value(),
				"value", null, 0, 1, Real.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(characterEClass, kermeta.standard.Character.class,
				"Character", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacter_Value(), this
				.getKermetaProperty_Character_value(), "value", null, 0, 1,
				kermeta.standard.Character.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getKermetaProperty_Collection_values());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEAttribute(getCollection_Values(), g1, "values", null, 0, 1,
				Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaInteger(), "count", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(collectionEClass, this.getJavaBoolean(), "contains",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaBoolean(), "includes",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "add", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "asSequence", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, this.getJavaBoolean(),
				"excludesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, null, "clear", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaBoolean(), "isEmpty", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "asBag", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getBag());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "any", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(collectionEClass_G);
		initEOperation(op, g1);

		addEOperation(collectionEClass, this.getJavaBoolean(), "empty", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaBoolean(), "isNotEmpty", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "iterator", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getIterator());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "addAll", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, this.getJavaBoolean(),
				"includesAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(collectionEClass, this.getJavaInteger(), "size", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(collectionEClass, null, "asOrderedSet", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(collectionEClass, null, "asSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(collectionEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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

		op = addEOperation(setEClass, this.getJavaBoolean(), "equals", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(setEClass, null, "asSequence", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSequence());
		g2 = createEGenericType(setEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(setEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(setEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(bagEClass, null, "asOrderedSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
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

		op = addEOperation(bagEClass, null, "asSet", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(bagEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(orderedCollectionEClass, OrderedCollection.class,
				"OrderedCollection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orderedCollectionEClass, null, "addAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedCollectionEClass, null, "removeAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

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

		op = addEOperation(orderedCollectionEClass, null, "elementAt", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		initEOperation(op, g1);

		op = addEOperation(orderedCollectionEClass, null, "first", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(orderedCollectionEClass_G);
		initEOperation(op, g1);

		initEClass(orderedSetEClass, OrderedSet.class, "OrderedSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(orderedSetEClass, null, "append", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

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

		op = addEOperation(orderedSetEClass, null, "addAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedSetEClass, this.getJavaBoolean(), "equals",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStructurePackage.getObject(), "element", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(orderedSetEClass, null, "preppend", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getOrderedSet());
		g2 = createEGenericType(orderedSetEClass_G);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, null, "at", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getJavaInteger(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		initEOperation(op, g1);

		op = addEOperation(orderedSetEClass, null, "add", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		g1 = createEGenericType(orderedSetEClass_G);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(unknownJavaObjectEClass, UnknownJavaObject.class,
				"UnknownJavaObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(unknownJavaObjectEClass, this.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(javaStringEDataType, String.class, "JavaString",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		initEDataType(unlimitedNaturalEDataType, Integer.class,
				"UnlimitedNatural", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_String_valueEDataType, String.class,
				"KermetaProperty_String_value", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Boolean_valueEDataType, String.class,
				"KermetaProperty_Boolean_value", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Integer_valueEDataType, String.class,
				"KermetaProperty_Integer_value", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Real_valueEDataType, String.class,
				"KermetaProperty_Real_value", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Character_valueEDataType, String.class,
				"KermetaProperty_Character_value", IS_SERIALIZABLE,
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
						"/**\r\n * Defines value types \r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/primitive_types_view.png\"/>\r\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Defines Collection types \r\n * <img src=\"./figures/collections_view.png\"/>\r\n */" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Contains types dedicated to dealing with java objects\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n */" });
		addAnnotation(
				voidEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * The class Void \r\n * By convention it is a sub-type of everything\r\n */" });
		addAnnotation(voidEClass.getEOperations().get(0), source, new String[] {
				"documentation", "/**\r\n\t * Return true\r\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(0), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(voidEClass.getEOperations().get(1), source, new String[] {
				"documentation", "/**\r\n\t * Returns true\r\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				voidEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns the String identifier \'<void>\'\r\n\t */" });
		addAnnotation(voidEClass.getEOperations().get(2), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				valueTypeEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * The abstract class ValueType does not contain any feature.\r\n * However, any instance of a sub-class of ValueType will be passed by value \r\n * instead of by reference for any other objects.\r\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\r\n * \r\n */" });
		addAnnotation(
				comparableEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * The abstract class Comparable defines a set of operation\r\n * to compare instances of a class.\r\n * Sub-classes only has to implement abstract operation compareTo.\r\n * All other methods are defined w.r.t. the compareTo operation\r\n */" });
		addAnnotation(comparableEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\r\n\t * return true if self < other\r\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(0), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/**\r\n\t * return true if self >= other\r\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(1), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				comparableEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * This method should be implemented by any class that inherits\r\n\t * from Comparable.\r\n\t * returns 0 if self = other\r\n\t * returns > 0 if  self > other\r\n\t * returns < 0 if  self < other\r\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(2), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/**\r\n\t * return true if self <= other\r\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(3), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(comparableEClass.getEOperations().get(4), source,
				new String[] { "documentation",
						"/**\r\n\t * return true if self > other\r\n\t */" });
		addAnnotation(comparableEClass.getEOperations().get(4), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				summableEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * The abstract class Summable defines a set of operation\r\n * to sum instances of a class.\r\n * Sub-classes only has to implement abstract operation plus.\r\n  */" });
		addAnnotation(summableEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				summableEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Summarization method to be implemented by any summable class.\r\n\t * The parameter must have the same type (or one of its subtypes)\r\n\t *  than the current object .\r\n\t */" });
		addAnnotation(summableEClass.getEOperations().get(0), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(notComparableExceptionEClass, source, new String[] {
				"documentation",
				"/**\r\n * raised when two objects are not comparable\r\n */" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"alias", "kermeta::standard::Integer" });
		addAnnotation(
				unlimitedNaturalEDataType,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Unlimited natural is used for reflection.\r\n * It is mapped to integer.equals().\r\n * Any negative number is interpreted as \'*\'\r\n */" });
		addAnnotation(
				collectionEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Collection is the root abstract class for all kermeta collections\r\n */" });
		addAnnotation(
				collectionEClass,
				source,
				new String[] {
						"EMF_needProperty",
						"name=values isUnique=false isOrdered=false javaClass=org.eclipse.emf.common.util.EList" });
		addAnnotation(
				collectionEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns the number of instances of element in the Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Removes all instances of element from the Collection, based on\r\n\t * G.equals(Object) definition\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(2),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns true if the Collection does not contain element\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns an element from the Collection or void if the Collection is empty\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns true if current Collection contains all elements of Collection elements\r\n\t * See Collection<G>.contains(Object)\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Sum the element if they are summable (ie implement \'+\' operator by inheriting of the class Summable)\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a Boolean stating whether the Collection contains at least one\r\n\t * instance of element, based on G.equals(elt : Object) definition\r\n\t * Note: for checking whether a physical element is contained by the collection,\r\n\t * make use of G.oid()\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * OCL API alignment, doeas the same as contains\r\n\t * See Collection<G>.contains(Object)\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Adds an element in the Collection (default implementation)\r\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(9), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(9),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns a new Sequence built from the Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns true if the Collection contains no element of Collection elements\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(11),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Removes all elements from the Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * OCL alignment API, does the same as empty\r\n\t * See Collection<G>.empty()\r\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(13), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(13),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns a new Bag built from the Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(14),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns an element from the Collection\r\n\t * Raises an EmptyCollection exception if the Collection is empty\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(15),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a Boolean stating whether the Collection is empty\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(16),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * OCL alignment API\r\n\t * Returns a Boolean stating whether the Collection contains at least\r\n\t * one element \r\n\t * See also Collection<G>.contains(Object)\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(17),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns an Iterator on the Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(18),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Adds all elements from the Collection elements in the current Collection\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(19),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * OCL API alignment, does the same as containsAll\r\n\t * See Collection<G>.containsAll(Collection<G>)\r\n\t */" });
		addAnnotation(
				collectionEClass.getEOperations().get(20),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns the number of elements in the Collection\r\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(21), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(21),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns a new OrderedSet built from the Collection\r\n\t */" });
		addAnnotation(collectionEClass.getEOperations().get(22), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(
				collectionEClass.getEOperations().get(22),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Returns a new Set built from the Collection\r\n\t */" });
		addAnnotation(
				setEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * A Set is a non-ordered collection that contains distinct elements\r\n * (with regards to the G.equals(Object) operation)\r\n * not used for the moment @EMF_needProperty \"isUnique=true isOrdered=false javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n */" });
		addAnnotation(
				setEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set corresponding to the intersection of the Set elements\r\n\t * with the current Set\r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set corresponding to the difference between the\r\n\t * current Set and the Set elements, ie all elements contained by \r\n\t * the current Set that do not appear in the elements Set \r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.remove(G)\r\n\t * Removes the element from the Set if it is contained by the Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(2), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(3), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				setEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence composed of all elements of current Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(4), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.add(G)\r\n\t * Adds elt to the Set if it is not already contained by the\r\n\t * Set, does nothing otherwise\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(5), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set which contents corresponds to the symmetric\r\n\t * difference between current Set and Set s, ie all elements of\r\n\t * each Set that do not appear in the other one\r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a ordered set of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Recursive sort of the given (ordered) set using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Set, as many elements as the Collection contains\r\n\t * Duplicates are removed\r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet that contains all elements of current Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(9), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag composed of all elements of current Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(10), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set corresponding to the union of the Set elements\r\n\t * with the current Set\r\n\t */" });
		addAnnotation(
				setEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set composed of all elements of current Set\r\n\t */" });
		addAnnotation(setEClass.getEOperations().get(12), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				setEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag corresponding to the union of the Bag elements\r\n\t * with the current Set\r\n\t */" });
		addAnnotation(
				bagEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Bag is a concrete non-ordered Collection allowing duplicates\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=false javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n */" });
		addAnnotation(
				bagEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag corresponding to the intersection of elements\r\n\t * and the Bag\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Object.equals(elt : Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Bag\r\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(
				bagEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asSequence()\r\n\t * Returns a new Sequence containing all elements of current Bag\r\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(2), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a sequence of the bag elements sorted using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Recursive sort of the given sequence using the given comparator.\r\n\t * The comparator must return :<ul>\r\n\t *   <li>+1 if the second <G> element is greater than the first</li> \r\n\t *   <li>0 if the second <G> element equals the first</li> \r\n\t *   <li>-1 if the second <G> element is lower than the first</li> \r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Internal concatenation tool for recursive \'quickSort()\' method\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag from which all instances of object have been\r\n\t * removed\r\n \t */" });
		addAnnotation(
				bagEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag which content includes all non-Collection elements\r\n\t * of the current Set, and, for each Collection element of the current\r\n\t * Bag, as many elements as the Collection contains\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Set corresponding to the intersection of a Set of\r\n\t * elements and the Bag\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asOrderedSet()\r\n\t * Returns a new OrderedSet containing elements of the Bag without duplicates\r\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(7), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag which content includes the content of the\r\n\t * current Bag and the element object\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asBag()\r\n\t * Returns a new Bag containing all elements of current Bag\t\r\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(9), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				bagEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns a new Bag corresponding to the union of elements and\r\n\t * current Bag\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(11),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Removes one instance of element from the Bag\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Removes the element identified by the provided Oid from the Bag\r\n\t */" });
		addAnnotation(
				bagEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Collection<G>.asSet()\r\n\t * Returns a new Set containing elements of the Bag without duplicates\r\n\t */" });
		addAnnotation(bagEClass.getEOperations().get(13), source, new String[] {
				"superOperation", "kermeta::standard::Collection" });
		addAnnotation(
				orderedCollectionEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * An OrderedCollection is the root abstract class for all ordered Collections.\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Adds element in the OrderedCollection at rank index\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Removes the element at rank index from the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns the last element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides Object.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current OrderedCollection\r\n\t */" });
		addAnnotation(orderedCollectionEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/** \r\n\t * Returns the index of the first instance of element in the OrderedCollection\r\n\t * or -1 if the element is not contained by the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns the element at rank index in the OrderedCollection\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedCollection\r\n\t */" });
		addAnnotation(
				orderedCollectionEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/** \r\n\t * Returns the first element in the OrderedCollection\r\n\t * Raises an EmptyCollection exception if the OrderedCollection is empty\r\n\t */" });
		addAnnotation(
				orderedSetEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * An OrderedSet is a Set that contained ordered distinct elements\r\n * not used for the moment @EMF_needProperty \"isUnique=true isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in head\r\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted at rank index\r\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides OrderedCollection<G>.addAt(Integer, G)\r\n\t * Adds element in the OrderedSet at rank index if the ordered set does\r\n\t * not already contain the element, does nothing otherwise\r\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(3),
				source,
				new String[] { "documentation",
						"/**\r\n\t * See OrderedCollection<G>.equals(Object) \r\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new OrderedSet from current one with element\r\n\t * inserted in tail\r\n\t */" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the OrderedSet\r\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(6), source,
				new String[] { "documentation",
						"/**\r\n\t * See Set<G>.add(G)\r\n\t */" });
		addAnnotation(orderedSetEClass.getEOperations().get(6), source,
				new String[] { "superOperation", "kermeta::standard::Set" });
		addAnnotation(
				orderedSetEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new OrderedSet composed of elements of current ordered\r\n\t * set from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the ordered set or min is larger than max\r\n\t */" });
		addAnnotation(
				sequenceEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * A Sequence is an OrderedCollection of elements allowing duplicates\r\n * not used for the moment @EMF_needProperty \"isUnique=false isOrdered=true javaClass=org.eclipse.emf.common.util.BasicEList\"\r\n */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new Sequence composed of elements of current sequence\r\n\t * from rank min to rank max (order is respected)\r\n\t * Raises IndexOutOfBound exception if min is negative, max is larger than \r\n\t * the size of the sequence or min is larger than max\r\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in head\r\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted at rank index\r\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Builds and returns a new Sequence from current one with element\r\n\t * inserted in tail\r\n\t */" });
		addAnnotation(
				sequenceEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Overrides OrderedCollection<G>.equals(Object)\r\n\t * Returns a Boolean stating whether the provided element is equal to\r\n\t * current Sequence\t\r\n\t */" });
		addAnnotation(sequenceEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::standard::OrderedCollection" });
		addAnnotation(
				sequenceEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns element at rank index in the sequence\r\n\t * Raises IndexOutOfBound exception if provided index is lower than 0 or\r\n\t * larger than the size of the Sequence\r\n\t */" });
		addAnnotation(
				iteratorEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n * Iterator to be used with Collection\r\n * See also Collection<G>.getIterator()\r\n */" });
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
						"/**\r\n\t * Returns true if the iterator has a next element\r\n\t */" });
		addAnnotation(
				iteratorEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns the next element of the iterator\r\n\t * Raises IteratorIsOff exception in case the iterator is on the last element \r\n\t */" });
		addAnnotation(
				iteratorEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Returns true if the iterator is on the last element\r\n\t * i.e. returns not self.hasNext()\r\n\t */" });
		addAnnotation(
				unknownJavaObjectEClass,
				source,
				new String[] {
						"documentation",
						"/** \r\n  * This special object is used to represent java objects that cannot be concretely used with kermeta\r\n  * <b>the only actions possible on these objects are : assignment and passing them as parameter</b>\r\n  * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/java_package.png\"/>\r\n  */" });
		addAnnotation(unknownJavaObjectEClass.getEOperations().get(0), source,
				new String[] { "documentation",
						"/**\r\n \t * NOT IMPLEMENTED\r\n \t */" });
		addAnnotation(unknownJavaObjectEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.post</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta.post";
		addAnnotation(collectionEClass.getEOperations().get(1), source,
				new String[] { "doesntContainsElementAnymore", "" });
		addAnnotation(bagEClass.getEOperations().get(12), source, new String[] {
				"doesntContainsElementAnymore", "" });
	}

} //StandardPackageImpl
