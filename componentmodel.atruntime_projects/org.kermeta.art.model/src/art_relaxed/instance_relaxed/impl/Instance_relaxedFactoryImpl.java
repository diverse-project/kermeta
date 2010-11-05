/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed.impl;

import art_relaxed.instance_relaxed.*;

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
public class Instance_relaxedFactoryImpl extends EFactoryImpl implements Instance_relaxedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instance_relaxedFactory init() {
		try {
			Instance_relaxedFactory theInstance_relaxedFactory = (Instance_relaxedFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/instance_relaxed"); 
			if (theInstance_relaxedFactory != null) {
				return theInstance_relaxedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Instance_relaxedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_relaxedFactoryImpl() {
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
			case Instance_relaxedPackage.PRIMITIVE_INSTANCE: return createPrimitiveInstance();
			case Instance_relaxedPackage.COMPOSITE_INSTANCE: return createCompositeInstance();
			case Instance_relaxedPackage.TRANSMISSION_BINDING: return createTransmissionBinding();
			case Instance_relaxedPackage.DELEGATION_BINDING: return createDelegationBinding();
			case Instance_relaxedPackage.VALUED_ATTRIBUTE: return createValuedAttribute();
			case Instance_relaxedPackage.DICTIONARY_VALUED_ATTRIBUTE: return createDictionaryValuedAttribute();
			case Instance_relaxedPackage.DEFAULT_ENTRY: return createDefaultEntry();
			case Instance_relaxedPackage.OTHER_ENTRY: return createOtherEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
			case Instance_relaxedPackage.INSTANCE_STATE:
				return createInstanceStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
			case Instance_relaxedPackage.INSTANCE_STATE:
				return convertInstanceStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInstance createPrimitiveInstance() {
		PrimitiveInstanceImpl primitiveInstance = new PrimitiveInstanceImpl();
		return primitiveInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInstance createCompositeInstance() {
		CompositeInstanceImpl compositeInstance = new CompositeInstanceImpl();
		return compositeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionBinding createTransmissionBinding() {
		TransmissionBindingImpl transmissionBinding = new TransmissionBindingImpl();
		return transmissionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationBinding createDelegationBinding() {
		DelegationBindingImpl delegationBinding = new DelegationBindingImpl();
		return delegationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedAttribute createValuedAttribute() {
		ValuedAttributeImpl valuedAttribute = new ValuedAttributeImpl();
		return valuedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryValuedAttribute createDictionaryValuedAttribute() {
		DictionaryValuedAttributeImpl dictionaryValuedAttribute = new DictionaryValuedAttributeImpl();
		return dictionaryValuedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultEntry createDefaultEntry() {
		DefaultEntryImpl defaultEntry = new DefaultEntryImpl();
		return defaultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherEntry createOtherEntry() {
		OtherEntryImpl otherEntry = new OtherEntryImpl();
		return otherEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceState createInstanceStateFromString(EDataType eDataType, String initialValue) {
		InstanceState result = InstanceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_relaxedPackage getInstance_relaxedPackage() {
		return (Instance_relaxedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Instance_relaxedPackage getPackage() {
		return Instance_relaxedPackage.eINSTANCE;
	}

} //Instance_relaxedFactoryImpl
