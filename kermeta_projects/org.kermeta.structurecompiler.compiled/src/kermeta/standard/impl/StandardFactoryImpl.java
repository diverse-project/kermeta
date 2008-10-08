/**
 * <copyright>
 * </copyright>
 *
 * $Id: StandardFactoryImpl.java,v 1.4 2008-10-08 14:37:46 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.standard.Bag;
import kermeta.standard.Iterator;
import kermeta.standard.NotComparableException;
import kermeta.standard.OrderedSet;
import kermeta.standard.Sequence;
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;
import kermeta.standard.StandardPackage;
import kermeta.standard.UnknownJavaObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardFactoryImpl extends EFactoryImpl implements
		StandardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardFactory init() {
		try {
			StandardFactory theStandardFactory = (StandardFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/kermeta/1_2_0//kermeta/standard/kermeta_temp_uri");
			if (theStandardFactory != null) {
				return theStandardFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StandardPackage.UNKNOWN_JAVA_OBJECT:
			return createUnknownJavaObject();
		case StandardPackage.SET:
			return createSet();
		case StandardPackage.BAG:
			return createBag();
		case StandardPackage.ORDERED_SET:
			return createOrderedSet();
		case StandardPackage.SEQUENCE:
			return createSequence();
		case StandardPackage.ITERATOR:
			return createIterator();
		case StandardPackage.VOID:
			return createVoid();
		case StandardPackage.NOT_COMPARABLE_EXCEPTION:
			return createNotComparableException();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case StandardPackage.JAVA_STRING:
			return createJavaStringFromString(eDataType, initialValue);
		case StandardPackage.JAVA_BOOLEAN:
			return createJavaBooleanFromString(eDataType, initialValue);
		case StandardPackage.JAVA_NUMERIC:
			return createJavaNumericFromString(eDataType, initialValue);
		case StandardPackage.JAVA_INTEGER:
			return createJavaIntegerFromString(eDataType, initialValue);
		case StandardPackage.JAVA_REAL:
			return createJavaRealFromString(eDataType, initialValue);
		case StandardPackage.JAVA_CHARACTER:
			return createJavaCharacterFromString(eDataType, initialValue);
		case StandardPackage.UNLIMITED_NATURAL:
			return createUnlimitedNaturalFromString(eDataType, initialValue);
		case StandardPackage.KERMETA_PROPERTY_COLLECTION_VALUES:
			return createKermetaProperty_Collection_valuesFromString(eDataType,
					initialValue);
		case StandardPackage.KERMETA_PROPERTY_ITERATOR_JAVA_ITERATOR:
			return createKermetaProperty_Iterator_javaIteratorFromString(
					eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case StandardPackage.JAVA_STRING:
			return convertJavaStringToString(eDataType, instanceValue);
		case StandardPackage.JAVA_BOOLEAN:
			return convertJavaBooleanToString(eDataType, instanceValue);
		case StandardPackage.JAVA_NUMERIC:
			return convertJavaNumericToString(eDataType, instanceValue);
		case StandardPackage.JAVA_INTEGER:
			return convertJavaIntegerToString(eDataType, instanceValue);
		case StandardPackage.JAVA_REAL:
			return convertJavaRealToString(eDataType, instanceValue);
		case StandardPackage.JAVA_CHARACTER:
			return convertJavaCharacterToString(eDataType, instanceValue);
		case StandardPackage.UNLIMITED_NATURAL:
			return convertUnlimitedNaturalToString(eDataType, instanceValue);
		case StandardPackage.KERMETA_PROPERTY_COLLECTION_VALUES:
			return convertKermetaProperty_Collection_valuesToString(eDataType,
					instanceValue);
		case StandardPackage.KERMETA_PROPERTY_ITERATOR_JAVA_ITERATOR:
			return convertKermetaProperty_Iterator_javaIteratorToString(
					eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownJavaObject createUnknownJavaObject() {
		UnknownJavaObjectImpl unknownJavaObject = new UnknownJavaObjectImpl();
		return unknownJavaObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> Set<G> createSet() {
		SetImpl<G> set = new SetImpl<G>();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> Bag<G> createBag() {
		BagImpl<G> bag = new BagImpl<G>();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> OrderedSet<G> createOrderedSet() {
		OrderedSetImpl<G> orderedSet = new OrderedSetImpl<G>();
		return orderedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> Sequence<G> createSequence() {
		SequenceImpl<G> sequence = new SequenceImpl<G>();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <G> Iterator<G> createIterator() {
		IteratorImpl<G> iterator = new IteratorImpl<G>();
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.standard.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotComparableException createNotComparableException() {
		NotComparableExceptionImpl notComparableException = new NotComparableExceptionImpl();
		return notComparableException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaStringFromString(EDataType eDataType,
			String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaStringToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createJavaBooleanFromString(EDataType eDataType,
			String initialValue) {
		return (Boolean) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaBooleanToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createJavaNumericFromString(EDataType eDataType,
			String initialValue) {
		return (Number) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaNumericToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createJavaIntegerFromString(EDataType eDataType,
			String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIntegerToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createJavaRealFromString(EDataType eDataType,
			String initialValue) {
		return (Double) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaRealToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createJavaCharacterFromString(EDataType eDataType,
			String initialValue) {
		return (Character) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaCharacterToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUnlimitedNaturalFromString(EDataType eDataType,
			String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedNaturalToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> createKermetaProperty_Collection_valuesFromString(
			EDataType eDataType, String initialValue) {
		return (EList<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaProperty_Collection_valuesToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Iterator<?> createKermetaProperty_Iterator_javaIteratorFromString(
			EDataType eDataType, String initialValue) {
		return (java.util.Iterator<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKermetaProperty_Iterator_javaIteratorToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPackage getStandardPackage() {
		return (StandardPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandardPackage getPackage() {
		return StandardPackage.eINSTANCE;
	}

} //StandardFactoryImpl
