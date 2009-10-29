/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance.impl;

import art.instance.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import art.instance.CompositeInstance;
import art.instance.DelegationBinding;
import art.instance.InstanceFactory;
import art.instance.InstancePackage;
import art.instance.InstanceState;
import art.instance.PrimitiveInstance;
import art.instance.TransmissionBinding;
import art.instance.ValuedAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstanceFactory init() {
		try {
			InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/instance"); 
			if (theInstanceFactory != null) {
				return theInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactoryImpl() {
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
			case InstancePackage.PRIMITIVE_INSTANCE: return createPrimitiveInstance();
			case InstancePackage.COMPOSITE_INSTANCE: return createCompositeInstance();
			case InstancePackage.TRANSMISSION_BINDING: return createTransmissionBinding();
			case InstancePackage.DELEGATION_BINDING: return createDelegationBinding();
			case InstancePackage.VALUED_ATTRIBUTE: return createValuedAttribute();
			case InstancePackage.DICTIONARY_VALUED_ATTRIBUTE: return createDictionaryValuedAttribute();
			case InstancePackage.DEFAULT_ENTRY: return createDefaultEntry();
			case InstancePackage.OTHER_ENTRY: return createOtherEntry();
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
			case InstancePackage.INSTANCE_STATE:
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
			case InstancePackage.INSTANCE_STATE:
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
	public ValuedAttribute createValuedAttribute() {
		ValuedAttributeImpl valuedAttribute = new ValuedAttributeImpl();
		return valuedAttribute;
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
	public InstancePackage getInstancePackage() {
		return (InstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancePackage getPackage() {
		return InstancePackage.eINSTANCE;
	}

} //InstanceFactoryImpl
