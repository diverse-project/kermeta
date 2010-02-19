/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.*;

import org.eclipse.emf.ecore.EClass;
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
public class Art2FactoryImpl extends EFactoryImpl implements Art2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Art2Factory init() {
		try {
			Art2Factory theArt2Factory = (Art2Factory)EPackage.Registry.INSTANCE.getEFactory("http://art/2.0"); 
			if (theArt2Factory != null) {
				return theArt2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Art2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2FactoryImpl() {
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
			case Art2Package.COMPONENT_INSTANCE: return createComponentInstance();
			case Art2Package.COMPONENT_TYPE: return createComponentType();
			case Art2Package.CONTAINER_NODE: return createContainerNode();
			case Art2Package.CONTAINER_ROOT: return createContainerRoot();
			case Art2Package.PORT_TYPE: return createPortType();
			case Art2Package.PORT: return createPort();
			case Art2Package.NAMESPACE: return createNamespace();
			case Art2Package.PORT_SERVICE_IMPL: return createPortServiceImpl();
			case Art2Package.PORT_ACTOR_IMPL: return createPortActorImpl();
			case Art2Package.PORT_MESSAGE_IMPL: return createPortMessageImpl();
			case Art2Package.DICTIONARY: return createDictionary();
			case Art2Package.DICTIONARY_TYPE: return createDictionaryType();
			case Art2Package.DICTIONARY_ATTRIBUTE: return createDictionaryAttribute();
			case Art2Package.DICTIONARY_VALUE: return createDictionaryValue();
			case Art2Package.BINDING: return createBinding();
			case Art2Package.COMPOSITE_TYPE: return createCompositeType();
			case Art2Package.PORT_TYPE_REF: return createPortTypeRef();
			case Art2Package.WIRE: return createWire();
			case Art2Package.SERVICE_DATA_TYPE: return createServiceDataType();
			case Art2Package.OPERATION: return createOperation();
			case Art2Package.PARAMETER: return createParameter();
			case Art2Package.TYPED_ELEMENT: return createTypedElement();
			case Art2Package.MESSAGE_DATA_TYPE: return createMessageDataType();
			case Art2Package.REPOSITORY: return createRepository();
			case Art2Package.COMPONENT_TYPE_LIBRARY: return createComponentTypeLibrary();
			case Art2Package.NAMED_ELEMENT: return createNamedElement();
			case Art2Package.DATA_TYPE: return createDataType();
			case Art2Package.INTEGRATION_PATTERN: return createIntegrationPattern();
			case Art2Package.EXTRA_FONCTIONAL_PROPERTY: return createExtraFonctionalProperty();
			case Art2Package.OS_GI_SCR_DATA_TYPE: return createOSGiScrDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNode createContainerNode() {
		ContainerNodeImpl containerNode = new ContainerNodeImpl();
		return containerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRoot createContainerRoot() {
		ContainerRootImpl containerRoot = new ContainerRootImpl();
		return containerRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
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
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortServiceImpl createPortServiceImpl() {
		PortServiceImplImpl portServiceImpl = new PortServiceImplImpl();
		return portServiceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortActorImpl createPortActorImpl() {
		PortActorImplImpl portActorImpl = new PortActorImplImpl();
		return portActorImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMessageImpl createPortMessageImpl() {
		PortMessageImplImpl portMessageImpl = new PortMessageImplImpl();
		return portMessageImpl;
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
	public DictionaryType createDictionaryType() {
		DictionaryTypeImpl dictionaryType = new DictionaryTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryAttribute createDictionaryAttribute() {
		DictionaryAttributeImpl dictionaryAttribute = new DictionaryAttributeImpl();
		return dictionaryAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryValue createDictionaryValue() {
		DictionaryValueImpl dictionaryValue = new DictionaryValueImpl();
		return dictionaryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
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
	public PortTypeRef createPortTypeRef() {
		PortTypeRefImpl portTypeRef = new PortTypeRefImpl();
		return portTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDataType createServiceDataType() {
		ServiceDataTypeImpl serviceDataType = new ServiceDataTypeImpl();
		return serviceDataType;
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
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDataType createMessageDataType() {
		MessageDataTypeImpl messageDataType = new MessageDataTypeImpl();
		return messageDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeLibrary createComponentTypeLibrary() {
		ComponentTypeLibraryImpl componentTypeLibrary = new ComponentTypeLibraryImpl();
		return componentTypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationPattern createIntegrationPattern() {
		IntegrationPatternImpl integrationPattern = new IntegrationPatternImpl();
		return integrationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraFonctionalProperty createExtraFonctionalProperty() {
		ExtraFonctionalPropertyImpl extraFonctionalProperty = new ExtraFonctionalPropertyImpl();
		return extraFonctionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGiScrDataType createOSGiScrDataType() {
		OSGiScrDataTypeImpl osGiScrDataType = new OSGiScrDataTypeImpl();
		return osGiScrDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2Package getArt2Package() {
		return (Art2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Art2Package getPackage() {
		return Art2Package.eINSTANCE;
	}

} //Art2FactoryImpl
