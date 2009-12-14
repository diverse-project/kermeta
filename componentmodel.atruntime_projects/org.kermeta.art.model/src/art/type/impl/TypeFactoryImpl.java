/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type.impl;

import art.type.*;

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
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeFactory init() {
		try {
			TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory("http://art/type"); 
			if (theTypeFactory != null) {
				return theTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFactoryImpl() {
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
			case TypePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case TypePackage.COMPOSITE_TYPE: return createCompositeType();
			case TypePackage.OPERATION: return createOperation();
			case TypePackage.PARAMETER: return createParameter();
			case TypePackage.FUNCTIONAL_SERVICE: return createFunctionalService();
			case TypePackage.CONTROL_SERVICE: return createControlService();
			case TypePackage.PORT: return createPort();
			case TypePackage.PORT_COLLECTION: return createPortCollection();
			case TypePackage.PORT_ID: return createPortId();
			case TypePackage.BASIC_ATTRIBUTE: return createBasicAttribute();
			case TypePackage.DICTIONARY: return createDictionary();
			case TypePackage.DICTIONARY_DEFAULT_VALUE: return createDictionaryDefaultValue();
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
			case TypePackage.PORT_ROLE:
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
			case TypePackage.PORT_ROLE:
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
	public TypePackage getTypePackage() {
		return (TypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypePackage getPackage() {
		return TypePackage.eINSTANCE;
	}

} //TypeFactoryImpl
