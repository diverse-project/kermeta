/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.art2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.art2.Art2Package
 * @generated
 */
public class Art2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Art2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Art2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Art2Switch<Adapter> modelSwitch =
		new Art2Switch<Adapter>() {
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseContainerNode(ContainerNode object) {
				return createContainerNodeAdapter();
			}
			@Override
			public Adapter caseContainerRoot(ContainerRoot object) {
				return createContainerRootAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseDictionary(Dictionary object) {
				return createDictionaryAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryAttribute(DictionaryAttribute object) {
				return createDictionaryAttributeAdapter();
			}
			@Override
			public Adapter caseDictionaryValue(DictionaryValue object) {
				return createDictionaryValueAdapter();
			}
			@Override
			public Adapter caseCompositeType(CompositeType object) {
				return createCompositeTypeAdapter();
			}
			@Override
			public Adapter casePortTypeRef(PortTypeRef object) {
				return createPortTypeRefAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseServicePortType(ServicePortType object) {
				return createServicePortTypeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMessagePortType(MessagePortType object) {
				return createMessagePortTypeAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseDeployUnit(DeployUnit object) {
				return createDeployUnitAdapter();
			}
			@Override
			public Adapter caseTypeLibrary(TypeLibrary object) {
				return createTypeLibraryAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseIntegrationPattern(IntegrationPattern object) {
				return createIntegrationPatternAdapter();
			}
			@Override
			public Adapter caseExtraFonctionalProperty(ExtraFonctionalProperty object) {
				return createExtraFonctionalPropertyAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter casePortTypeMapping(PortTypeMapping object) {
				return createPortTypeMappingAdapter();
			}
			@Override
			public Adapter caseHub(Hub object) {
				return createHubAdapter();
			}
			@Override
			public Adapter caseMBinding(MBinding object) {
				return createMBindingAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter casePlatformModel(PlatformModel object) {
				return createPlatformModelAdapter();
			}
			@Override
			public Adapter caseNodeNetwork(NodeNetwork object) {
				return createNodeNetworkAdapter();
			}
			@Override
			public Adapter caseNodeLink(NodeLink object) {
				return createNodeLinkAdapter();
			}
			@Override
			public Adapter caseNetworkProperty(NetworkProperty object) {
				return createNetworkPropertyAdapter();
			}
			@Override
			public Adapter caseHubType(HubType object) {
				return createHubTypeAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ContainerNode
	 * @generated
	 */
	public Adapter createContainerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ContainerRoot <em>Container Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ContainerRoot
	 * @generated
	 */
	public Adapter createContainerRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Dictionary
	 * @generated
	 */
	public Adapter createDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.DictionaryAttribute <em>Dictionary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.DictionaryAttribute
	 * @generated
	 */
	public Adapter createDictionaryAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.DictionaryValue <em>Dictionary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.DictionaryValue
	 * @generated
	 */
	public Adapter createDictionaryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.CompositeType
	 * @generated
	 */
	public Adapter createCompositeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.PortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.PortTypeRef
	 * @generated
	 */
	public Adapter createPortTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ServicePortType <em>Service Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ServicePortType
	 * @generated
	 */
	public Adapter createServicePortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.MessagePortType <em>Message Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.MessagePortType
	 * @generated
	 */
	public Adapter createMessagePortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.DeployUnit <em>Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.DeployUnit
	 * @generated
	 */
	public Adapter createDeployUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.TypeLibrary <em>Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.TypeLibrary
	 * @generated
	 */
	public Adapter createTypeLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.IntegrationPattern
	 * @generated
	 */
	public Adapter createIntegrationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.ExtraFonctionalProperty <em>Extra Fonctional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.ExtraFonctionalProperty
	 * @generated
	 */
	public Adapter createExtraFonctionalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.PortTypeMapping <em>Port Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.PortTypeMapping
	 * @generated
	 */
	public Adapter createPortTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.Hub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.Hub
	 * @generated
	 */
	public Adapter createHubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.MBinding <em>MBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.MBinding
	 * @generated
	 */
	public Adapter createMBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.PlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.PlatformModel
	 * @generated
	 */
	public Adapter createPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.NodeNetwork <em>Node Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.NodeNetwork
	 * @generated
	 */
	public Adapter createNodeNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.NodeLink <em>Node Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.NodeLink
	 * @generated
	 */
	public Adapter createNodeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.NetworkProperty <em>Network Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.NetworkProperty
	 * @generated
	 */
	public Adapter createNetworkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.HubType <em>Hub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.HubType
	 * @generated
	 */
	public Adapter createHubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.kermeta.art2.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.kermeta.art2.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Art2AdapterFactory
