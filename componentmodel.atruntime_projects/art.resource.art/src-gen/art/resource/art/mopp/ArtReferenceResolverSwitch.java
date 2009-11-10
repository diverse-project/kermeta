package art.resource.art.mopp;

public class ArtReferenceResolverSwitch implements art.resource.art.IArtReferenceResolverSwitch {
	
	protected art.resource.art.analysis.ComponentInstanceTypeReferenceResolver componentInstanceTypeReferenceResolver = new art.resource.art.analysis.ComponentInstanceTypeReferenceResolver();
	protected art.resource.art.analysis.TransmissionBindingClientReferenceResolver transmissionBindingClientReferenceResolver = new art.resource.art.analysis.TransmissionBindingClientReferenceResolver();
	protected art.resource.art.analysis.BindingServerInstanceReferenceResolver bindingServerInstanceReferenceResolver = new art.resource.art.analysis.BindingServerInstanceReferenceResolver();
	protected art.resource.art.analysis.TransmissionBindingServerReferenceResolver transmissionBindingServerReferenceResolver = new art.resource.art.analysis.TransmissionBindingServerReferenceResolver();
	protected art.resource.art.analysis.DelegationBindingSourceReferenceResolver delegationBindingSourceReferenceResolver = new art.resource.art.analysis.DelegationBindingSourceReferenceResolver();
	protected art.resource.art.analysis.DelegationBindingExportedReferenceResolver delegationBindingExportedReferenceResolver = new art.resource.art.analysis.DelegationBindingExportedReferenceResolver();
	protected art.resource.art.analysis.ValuedAttributeAttributeReferenceResolver valuedAttributeAttributeReferenceResolver = new art.resource.art.analysis.ValuedAttributeAttributeReferenceResolver();
	protected art.resource.art.analysis.DictionaryValuedAttributeAttributeReferenceResolver dictionaryValuedAttributeAttributeReferenceResolver = new art.resource.art.analysis.DictionaryValuedAttributeAttributeReferenceResolver();
	protected art.resource.art.analysis.DefaultEntryKeyReferenceResolver defaultEntryKeyReferenceResolver = new art.resource.art.analysis.DefaultEntryKeyReferenceResolver();
	protected art.resource.art.analysis.TypedElementTypeReferenceResolver typedElementTypeReferenceResolver = new art.resource.art.analysis.TypedElementTypeReferenceResolver();
	protected art.resource.art.analysis.PortServiceReferenceResolver portServiceReferenceResolver = new art.resource.art.analysis.PortServiceReferenceResolver();
	protected art.resource.art.analysis.TypeGroupTypesReferenceResolver typeGroupTypesReferenceResolver = new art.resource.art.analysis.TypeGroupTypesReferenceResolver();
	protected art.resource.art.analysis.InstanceGroupInstancesReferenceResolver instanceGroupInstancesReferenceResolver = new art.resource.art.analysis.InstanceGroupInstancesReferenceResolver();
	protected art.resource.art.analysis.DictionaryValueTypeReferenceResolver dictionaryValueTypeReferenceResolver = new art.resource.art.analysis.DictionaryValueTypeReferenceResolver();
	
	public art.resource.art.analysis.ComponentInstanceTypeReferenceResolver getComponentInstanceTypeReferenceResolver() {
		return componentInstanceTypeReferenceResolver;
	}
	
	public art.resource.art.analysis.TransmissionBindingClientReferenceResolver getTransmissionBindingClientReferenceResolver() {
		return transmissionBindingClientReferenceResolver;
	}
	
	public art.resource.art.analysis.BindingServerInstanceReferenceResolver getBindingServerInstanceReferenceResolver() {
		return bindingServerInstanceReferenceResolver;
	}
	
	public art.resource.art.analysis.TransmissionBindingServerReferenceResolver getTransmissionBindingServerReferenceResolver() {
		return transmissionBindingServerReferenceResolver;
	}
	
	public art.resource.art.analysis.DelegationBindingSourceReferenceResolver getDelegationBindingSourceReferenceResolver() {
		return delegationBindingSourceReferenceResolver;
	}
	
	public art.resource.art.analysis.DelegationBindingExportedReferenceResolver getDelegationBindingExportedReferenceResolver() {
		return delegationBindingExportedReferenceResolver;
	}
	
	public art.resource.art.analysis.ValuedAttributeAttributeReferenceResolver getValuedAttributeAttributeReferenceResolver() {
		return valuedAttributeAttributeReferenceResolver;
	}
	
	public art.resource.art.analysis.DictionaryValuedAttributeAttributeReferenceResolver getDictionaryValuedAttributeAttributeReferenceResolver() {
		return dictionaryValuedAttributeAttributeReferenceResolver;
	}
	
	public art.resource.art.analysis.DefaultEntryKeyReferenceResolver getDefaultEntryKeyReferenceResolver() {
		return defaultEntryKeyReferenceResolver;
	}
	
	public art.resource.art.analysis.TypedElementTypeReferenceResolver getTypedElementTypeReferenceResolver() {
		return typedElementTypeReferenceResolver;
	}
	
	public art.resource.art.analysis.PortServiceReferenceResolver getPortServiceReferenceResolver() {
		return portServiceReferenceResolver;
	}
	
	public art.resource.art.analysis.TypeGroupTypesReferenceResolver getTypeGroupTypesReferenceResolver() {
		return typeGroupTypesReferenceResolver;
	}
	
	public art.resource.art.analysis.InstanceGroupInstancesReferenceResolver getInstanceGroupInstancesReferenceResolver() {
		return instanceGroupInstancesReferenceResolver;
	}
	
	public art.resource.art.analysis.DictionaryValueTypeReferenceResolver getDictionaryValueTypeReferenceResolver() {
		return dictionaryValueTypeReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		componentInstanceTypeReferenceResolver.setOptions(options);
		transmissionBindingClientReferenceResolver.setOptions(options);
		bindingServerInstanceReferenceResolver.setOptions(options);
		transmissionBindingServerReferenceResolver.setOptions(options);
		delegationBindingSourceReferenceResolver.setOptions(options);
		delegationBindingExportedReferenceResolver.setOptions(options);
		valuedAttributeAttributeReferenceResolver.setOptions(options);
		dictionaryValuedAttributeAttributeReferenceResolver.setOptions(options);
		defaultEntryKeyReferenceResolver.setOptions(options);
		typedElementTypeReferenceResolver.setOptions(options);
		portServiceReferenceResolver.setOptions(options);
		typeGroupTypesReferenceResolver.setOptions(options);
		instanceGroupInstancesReferenceResolver.setOptions(options);
		dictionaryValueTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, int position, art.resource.art.IArtReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (art.instance.InstancePackage.eINSTANCE.getComponentInstance().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.ComponentType> frr = new ArtFuzzyResolveResult<art.type.ComponentType>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("type");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				componentInstanceTypeReferenceResolver.resolve(identifier, (art.instance.ComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Port> frr = new ArtFuzzyResolveResult<art.type.Port>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("client");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				transmissionBindingClientReferenceResolver.resolve(identifier, (art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getBinding().isInstance(container)) {
			ArtFuzzyResolveResult<art.instance.ComponentInstance> frr = new ArtFuzzyResolveResult<art.instance.ComponentInstance>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("serverInstance");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				bindingServerInstanceReferenceResolver.resolve(identifier, (art.instance.Binding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Port> frr = new ArtFuzzyResolveResult<art.type.Port>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("server");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				transmissionBindingServerReferenceResolver.resolve(identifier, (art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Port> frr = new ArtFuzzyResolveResult<art.type.Port>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("source");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				delegationBindingSourceReferenceResolver.resolve(identifier, (art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Port> frr = new ArtFuzzyResolveResult<art.type.Port>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("exported");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				delegationBindingExportedReferenceResolver.resolve(identifier, (art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getValuedAttribute().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.BasicAttribute> frr = new ArtFuzzyResolveResult<art.type.BasicAttribute>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("attribute");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				valuedAttributeAttributeReferenceResolver.resolve(identifier, (art.instance.ValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Dictionary> frr = new ArtFuzzyResolveResult<art.type.Dictionary>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("attribute");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				dictionaryValuedAttributeAttributeReferenceResolver.resolve(identifier, (art.instance.DictionaryValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDefaultEntry().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.DictionaryDefaultValue> frr = new ArtFuzzyResolveResult<art.type.DictionaryDefaultValue>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("key");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				defaultEntryKeyReferenceResolver.resolve(identifier, (art.instance.DefaultEntry) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.ArtPackage.eINSTANCE.getTypedElement().isInstance(container)) {
			ArtFuzzyResolveResult<art.DataType> frr = new ArtFuzzyResolveResult<art.DataType>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("type");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				typedElementTypeReferenceResolver.resolve(identifier, (art.TypedElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.type.TypePackage.eINSTANCE.getPort().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.Service> frr = new ArtFuzzyResolveResult<art.type.Service>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("service");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				portServiceReferenceResolver.resolve(identifier, (art.type.Port) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.group.GroupPackage.eINSTANCE.getTypeGroup().isInstance(container)) {
			ArtFuzzyResolveResult<art.type.ComponentType> frr = new ArtFuzzyResolveResult<art.type.ComponentType>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("types");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				typeGroupTypesReferenceResolver.resolve(identifier, (art.group.TypeGroup) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.group.GroupPackage.eINSTANCE.getInstanceGroup().isInstance(container)) {
			ArtFuzzyResolveResult<art.instance.ComponentInstance> frr = new ArtFuzzyResolveResult<art.instance.ComponentInstance>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("instances");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				instanceGroupInstancesReferenceResolver.resolve(identifier, (art.group.InstanceGroup) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.type.TypePackage.eINSTANCE.getDictionary().isInstance(container)) {
			ArtFuzzyResolveResult<art.DataType> frr = new ArtFuzzyResolveResult<art.DataType>(result);
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature("valueType");
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				dictionaryValueTypeReferenceResolver.resolve(identifier, (art.type.Dictionary) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
}
