/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed.impl;

import art_relaxed.type_relaxed.*;

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
public class Type_relaxedFactoryImpl extends EFactoryImpl implements Type_relaxedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Type_relaxedFactory init() {
		try {
			Type_relaxedFactory theType_relaxedFactory = (Type_relaxedFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/type_relaxed"); 
			if (theType_relaxedFactory != null) {
				return theType_relaxedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Type_relaxedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_relaxedFactoryImpl() {
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
			case Type_relaxedPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case Type_relaxedPackage.COMPOSITE_TYPE: return createCompositeType();
			case Type_relaxedPackage.OPERATION: return createOperation();
			case Type_relaxedPackage.PARAMETER: return createParameter();
			case Type_relaxedPackage.FUNCTIONAL_SERVICE: return createFunctionalService();
			case Type_relaxedPackage.CONTROL_SERVICE: return createControlService();
			case Type_relaxedPackage.PORT: return createPort();
			case Type_relaxedPackage.PORT_COLLECTION: return createPortCollection();
			case Type_relaxedPackage.PORT_ID: return createPortId();
			case Type_relaxedPackage.BASIC_ATTRIBUTE: return createBasicAttribute();
			case Type_relaxedPackage.DICTIONARY: return createDictionary();
			case Type_relaxedPackage.DICTIONARY_DEFAULT_VALUE: return createDictionaryDefaultValue();
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
			case Type_relaxedPackage.PORT_ROLE:
				return createPortRoleFromString(eDataType, initialValue);
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
			case Type_relaxedPackage.PORT_ROLE:
				return convertPortRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalService createFunctionalService() {
		FunctionalServiceImpl functionalService = new FunctionalServiceImpl();
		return functionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlService createControlService() {
		ControlServiceImpl controlService = new ControlServiceImpl();
		return controlService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortCollection createPortCollection() {
		PortCollectionImpl portCollection = new PortCollectionImpl();
		return portCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortId createPortId() {
		PortIdImpl portId = new PortIdImpl();
		return portId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAttribute createBasicAttribute() {
		BasicAttributeImpl basicAttribute = new BasicAttributeImpl();
		return basicAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryDefaultValue createDictionaryDefaultValue() {
		DictionaryDefaultValueImpl dictionaryDefaultValue = new DictionaryDefaultValueImpl();
		return dictionaryDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRole createPortRoleFromString(EDataType eDataType, String initialValue) {
		PortRole result = PortRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_relaxedPackage getType_relaxedPackage() {
		return (Type_relaxedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Type_relaxedPackage getPackage() {
		return Type_relaxedPackage.eINSTANCE;
	}

} //Type_relaxedFactoryImpl
