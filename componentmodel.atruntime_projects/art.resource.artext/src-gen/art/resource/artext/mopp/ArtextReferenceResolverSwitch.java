/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package art.resource.artext.mopp;

public class ArtextReferenceResolverSwitch implements art.resource.artext.IArtextReferenceResolverSwitch {
	
	protected art.resource.artext.analysis.ComponentInstanceTypeReferenceResolver componentInstanceTypeReferenceResolver = new art.resource.artext.analysis.ComponentInstanceTypeReferenceResolver();
	protected art.resource.artext.analysis.TransmissionBindingClientReferenceResolver transmissionBindingClientReferenceResolver = new art.resource.artext.analysis.TransmissionBindingClientReferenceResolver();
	protected art.resource.artext.analysis.BindingServerInstanceReferenceResolver bindingServerInstanceReferenceResolver = new art.resource.artext.analysis.BindingServerInstanceReferenceResolver();
	protected art.resource.artext.analysis.TransmissionBindingServerReferenceResolver transmissionBindingServerReferenceResolver = new art.resource.artext.analysis.TransmissionBindingServerReferenceResolver();
	protected art.resource.artext.analysis.DelegationBindingSourceReferenceResolver delegationBindingSourceReferenceResolver = new art.resource.artext.analysis.DelegationBindingSourceReferenceResolver();
	protected art.resource.artext.analysis.DelegationBindingExportedReferenceResolver delegationBindingExportedReferenceResolver = new art.resource.artext.analysis.DelegationBindingExportedReferenceResolver();
	protected art.resource.artext.analysis.ValuedAttributeAttributeReferenceResolver valuedAttributeAttributeReferenceResolver = new art.resource.artext.analysis.ValuedAttributeAttributeReferenceResolver();
	protected art.resource.artext.analysis.DictionaryValuedAttributeAttributeReferenceResolver dictionaryValuedAttributeAttributeReferenceResolver = new art.resource.artext.analysis.DictionaryValuedAttributeAttributeReferenceResolver();
	protected art.resource.artext.analysis.DefaultEntryKeyReferenceResolver defaultEntryKeyReferenceResolver = new art.resource.artext.analysis.DefaultEntryKeyReferenceResolver();
	protected art.resource.artext.analysis.TypedElementTypeReferenceResolver typedElementTypeReferenceResolver = new art.resource.artext.analysis.TypedElementTypeReferenceResolver();
	protected art.resource.artext.analysis.AbstractPortServiceReferenceResolver abstractPortServiceReferenceResolver = new art.resource.artext.analysis.AbstractPortServiceReferenceResolver();
	protected art.resource.artext.analysis.TypeGroupTypesReferenceResolver typeGroupTypesReferenceResolver = new art.resource.artext.analysis.TypeGroupTypesReferenceResolver();
	protected art.resource.artext.analysis.InstanceGroupInstancesReferenceResolver instanceGroupInstancesReferenceResolver = new art.resource.artext.analysis.InstanceGroupInstancesReferenceResolver();
	protected art.resource.artext.analysis.DictionaryValueTypeReferenceResolver dictionaryValueTypeReferenceResolver = new art.resource.artext.analysis.DictionaryValueTypeReferenceResolver();
	
	public art.resource.artext.analysis.ComponentInstanceTypeReferenceResolver getComponentInstanceTypeReferenceResolver() {
		return componentInstanceTypeReferenceResolver;
	}
	
	public art.resource.artext.analysis.TransmissionBindingClientReferenceResolver getTransmissionBindingClientReferenceResolver() {
		return transmissionBindingClientReferenceResolver;
	}
	
	public art.resource.artext.analysis.BindingServerInstanceReferenceResolver getBindingServerInstanceReferenceResolver() {
		return bindingServerInstanceReferenceResolver;
	}
	
	public art.resource.artext.analysis.TransmissionBindingServerReferenceResolver getTransmissionBindingServerReferenceResolver() {
		return transmissionBindingServerReferenceResolver;
	}
	
	public art.resource.artext.analysis.DelegationBindingSourceReferenceResolver getDelegationBindingSourceReferenceResolver() {
		return delegationBindingSourceReferenceResolver;
	}
	
	public art.resource.artext.analysis.DelegationBindingExportedReferenceResolver getDelegationBindingExportedReferenceResolver() {
		return delegationBindingExportedReferenceResolver;
	}
	
	public art.resource.artext.analysis.ValuedAttributeAttributeReferenceResolver getValuedAttributeAttributeReferenceResolver() {
		return valuedAttributeAttributeReferenceResolver;
	}
	
	public art.resource.artext.analysis.DictionaryValuedAttributeAttributeReferenceResolver getDictionaryValuedAttributeAttributeReferenceResolver() {
		return dictionaryValuedAttributeAttributeReferenceResolver;
	}
	
	public art.resource.artext.analysis.DefaultEntryKeyReferenceResolver getDefaultEntryKeyReferenceResolver() {
		return defaultEntryKeyReferenceResolver;
	}
	
	public art.resource.artext.analysis.TypedElementTypeReferenceResolver getTypedElementTypeReferenceResolver() {
		return typedElementTypeReferenceResolver;
	}
	
	public art.resource.artext.analysis.AbstractPortServiceReferenceResolver getAbstractPortServiceReferenceResolver() {
		return abstractPortServiceReferenceResolver;
	}
	
	public art.resource.artext.analysis.TypeGroupTypesReferenceResolver getTypeGroupTypesReferenceResolver() {
		return typeGroupTypesReferenceResolver;
	}
	
	public art.resource.artext.analysis.InstanceGroupInstancesReferenceResolver getInstanceGroupInstancesReferenceResolver() {
		return instanceGroupInstancesReferenceResolver;
	}
	
	public art.resource.artext.analysis.DictionaryValueTypeReferenceResolver getDictionaryValueTypeReferenceResolver() {
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
		abstractPortServiceReferenceResolver.setOptions(options);
		typeGroupTypesReferenceResolver.setOptions(options);
		instanceGroupInstancesReferenceResolver.setOptions(options);
		dictionaryValueTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, art.resource.artext.IArtextReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (art.instance.InstancePackage.eINSTANCE.getComponentInstance().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.ComponentType> frr = new ArtextFuzzyResolveResult<art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				componentInstanceTypeReferenceResolver.resolve(identifier, (art.instance.ComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.AbstractPort> frr = new ArtextFuzzyResolveResult<art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("client")) {
				transmissionBindingClientReferenceResolver.resolve(identifier, (art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getBinding().isInstance(container)) {
			ArtextFuzzyResolveResult<art.instance.ComponentInstance> frr = new ArtextFuzzyResolveResult<art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("serverInstance")) {
				bindingServerInstanceReferenceResolver.resolve(identifier, (art.instance.Binding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.AbstractPort> frr = new ArtextFuzzyResolveResult<art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("server")) {
				transmissionBindingServerReferenceResolver.resolve(identifier, (art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.AbstractPort> frr = new ArtextFuzzyResolveResult<art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				delegationBindingSourceReferenceResolver.resolve(identifier, (art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.AbstractPort> frr = new ArtextFuzzyResolveResult<art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("exported")) {
				delegationBindingExportedReferenceResolver.resolve(identifier, (art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getValuedAttribute().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.BasicAttribute> frr = new ArtextFuzzyResolveResult<art.type.BasicAttribute>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				valuedAttributeAttributeReferenceResolver.resolve(identifier, (art.instance.ValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.Dictionary> frr = new ArtextFuzzyResolveResult<art.type.Dictionary>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				dictionaryValuedAttributeAttributeReferenceResolver.resolve(identifier, (art.instance.DictionaryValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.instance.InstancePackage.eINSTANCE.getDefaultEntry().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.DictionaryDefaultValue> frr = new ArtextFuzzyResolveResult<art.type.DictionaryDefaultValue>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("key")) {
				defaultEntryKeyReferenceResolver.resolve(identifier, (art.instance.DefaultEntry) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.ArtPackage.eINSTANCE.getTypedElement().isInstance(container)) {
			ArtextFuzzyResolveResult<art.DataType> frr = new ArtextFuzzyResolveResult<art.DataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				typedElementTypeReferenceResolver.resolve(identifier, (art.TypedElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.type.TypePackage.eINSTANCE.getAbstractPort().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.Service> frr = new ArtextFuzzyResolveResult<art.type.Service>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("service")) {
				abstractPortServiceReferenceResolver.resolve(identifier, (art.type.AbstractPort) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.group.GroupPackage.eINSTANCE.getTypeGroup().isInstance(container)) {
			ArtextFuzzyResolveResult<art.type.ComponentType> frr = new ArtextFuzzyResolveResult<art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("types")) {
				typeGroupTypesReferenceResolver.resolve(identifier, (art.group.TypeGroup) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.group.GroupPackage.eINSTANCE.getInstanceGroup().isInstance(container)) {
			ArtextFuzzyResolveResult<art.instance.ComponentInstance> frr = new ArtextFuzzyResolveResult<art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("instances")) {
				instanceGroupInstancesReferenceResolver.resolve(identifier, (art.group.InstanceGroup) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (art.type.TypePackage.eINSTANCE.getDictionary().isInstance(container)) {
			ArtextFuzzyResolveResult<art.DataType> frr = new ArtextFuzzyResolveResult<art.DataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("valueType")) {
				dictionaryValueTypeReferenceResolver.resolve(identifier, (art.type.Dictionary) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public art.resource.artext.IArtextReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == art.instance.InstancePackage.eINSTANCE.getComponentInstance_Type()) {
			return componentInstanceTypeReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getTransmissionBinding_Client()) {
			return transmissionBindingClientReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getBinding_ServerInstance()) {
			return bindingServerInstanceReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getTransmissionBinding_Server()) {
			return transmissionBindingServerReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getDelegationBinding_Source()) {
			return delegationBindingSourceReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getDelegationBinding_Exported()) {
			return delegationBindingExportedReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getValuedAttribute_Attribute()) {
			return valuedAttributeAttributeReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute_Attribute()) {
			return dictionaryValuedAttributeAttributeReferenceResolver;
		}
		if (reference == art.instance.InstancePackage.eINSTANCE.getDefaultEntry_Key()) {
			return defaultEntryKeyReferenceResolver;
		}
		if (reference == art.ArtPackage.eINSTANCE.getTypedElement_Type()) {
			return typedElementTypeReferenceResolver;
		}
		if (reference == art.type.TypePackage.eINSTANCE.getAbstractPort_Service()) {
			return abstractPortServiceReferenceResolver;
		}
		if (reference == art.group.GroupPackage.eINSTANCE.getTypeGroup_Types()) {
			return typeGroupTypesReferenceResolver;
		}
		if (reference == art.group.GroupPackage.eINSTANCE.getInstanceGroup_Instances()) {
			return instanceGroupInstancesReferenceResolver;
		}
		if (reference == art.type.TypePackage.eINSTANCE.getDictionary_ValueType()) {
			return dictionaryValueTypeReferenceResolver;
		}
		return null;
	}
	
}
