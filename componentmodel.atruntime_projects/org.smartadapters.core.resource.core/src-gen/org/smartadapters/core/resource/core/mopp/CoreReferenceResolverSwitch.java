/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreReferenceResolverSwitch implements org.smartadapters.core.resource.core.ICoreReferenceResolverSwitch {
	
	protected org.smartadapters.core.resource.core.analysis.AspectPersistentReferenceResolver aspectPersistentReferenceResolver = new org.smartadapters.core.resource.core.analysis.AspectPersistentReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeSystemSystemToSetReferenceResolver setruntimeSystemSystemToSetReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeSystemSystemToSetReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefrootReferenceResolver setruntimeSystemRefrootReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefrootReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefservicesReferenceResolver setruntimeSystemRefservicesReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefservicesReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeSystemReftypesReferenceResolver setruntimeSystemReftypesReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeSystemReftypesReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefdataTypesReferenceResolver setruntimeSystemRefdataTypesReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefdataTypesReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver setruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceReftypeReferenceResolver setruntimeinstanceComponentInstanceReftypeReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceReftypeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver setruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefattributeReferenceResolver setruntimeinstanceComponentInstanceRefattributeReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefattributeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefbindingReferenceResolver setruntimeinstanceComponentInstanceRefbindingReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefbindingReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver setruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceReftypeReferenceResolver setruntimeinstancePrimitiveInstanceReftypeReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceReftypeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver setruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver setruntimeinstancePrimitiveInstanceRefattributeReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver setruntimeinstancePrimitiveInstanceRefbindingReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver setruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver setruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver setruntimeinstanceCompositeInstanceRefdelegationReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver setruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefattributeReferenceResolver setruntimeinstanceCompositeInstanceRefattributeReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefattributeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefbindingReferenceResolver setruntimeinstanceCompositeInstanceRefbindingReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefbindingReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver setruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefclientReferenceResolver setruntimeinstanceTransmissionBindingRefclientReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefclientReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverReferenceResolver setruntimeinstanceTransmissionBindingRefserverReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver setruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver = new org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.ComponentInstanceTypeReferenceResolver componentInstanceTypeReferenceResolver = new org.smartadapters.core.resource.core.analysis.ComponentInstanceTypeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.TransmissionBindingClientReferenceResolver transmissionBindingClientReferenceResolver = new org.smartadapters.core.resource.core.analysis.TransmissionBindingClientReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.BindingServerInstanceReferenceResolver bindingServerInstanceReferenceResolver = new org.smartadapters.core.resource.core.analysis.BindingServerInstanceReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.TransmissionBindingServerReferenceResolver transmissionBindingServerReferenceResolver = new org.smartadapters.core.resource.core.analysis.TransmissionBindingServerReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.DelegationBindingSourceReferenceResolver delegationBindingSourceReferenceResolver = new org.smartadapters.core.resource.core.analysis.DelegationBindingSourceReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.DelegationBindingExportedReferenceResolver delegationBindingExportedReferenceResolver = new org.smartadapters.core.resource.core.analysis.DelegationBindingExportedReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.ValuedAttributeAttributeReferenceResolver valuedAttributeAttributeReferenceResolver = new org.smartadapters.core.resource.core.analysis.ValuedAttributeAttributeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.DictionaryValuedAttributeAttributeReferenceResolver dictionaryValuedAttributeAttributeReferenceResolver = new org.smartadapters.core.resource.core.analysis.DictionaryValuedAttributeAttributeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.DefaultEntryKeyReferenceResolver defaultEntryKeyReferenceResolver = new org.smartadapters.core.resource.core.analysis.DefaultEntryKeyReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.TypedElementTypeReferenceResolver typedElementTypeReferenceResolver = new org.smartadapters.core.resource.core.analysis.TypedElementTypeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.AbstractPortServiceReferenceResolver abstractPortServiceReferenceResolver = new org.smartadapters.core.resource.core.analysis.AbstractPortServiceReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.DictionaryValueTypeReferenceResolver dictionaryValueTypeReferenceResolver = new org.smartadapters.core.resource.core.analysis.DictionaryValueTypeReferenceResolver();
	protected org.smartadapters.core.resource.core.analysis.PRolePlayerReferenceResolver pRolePlayerReferenceResolver = new org.smartadapters.core.resource.core.analysis.PRolePlayerReferenceResolver();
	
	public org.smartadapters.core.resource.core.analysis.AspectPersistentReferenceResolver getAspectPersistentReferenceResolver() {
		return aspectPersistentReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeSystemSystemToSetReferenceResolver getSetruntimeSystemSystemToSetReferenceResolver() {
		return setruntimeSystemSystemToSetReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefrootReferenceResolver getSetruntimeSystemRefrootReferenceResolver() {
		return setruntimeSystemRefrootReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefservicesReferenceResolver getSetruntimeSystemRefservicesReferenceResolver() {
		return setruntimeSystemRefservicesReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeSystemReftypesReferenceResolver getSetruntimeSystemReftypesReferenceResolver() {
		return setruntimeSystemReftypesReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeSystemRefdataTypesReferenceResolver getSetruntimeSystemRefdataTypesReferenceResolver() {
		return setruntimeSystemRefdataTypesReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver getSetruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver() {
		return setruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceReftypeReferenceResolver getSetruntimeinstanceComponentInstanceReftypeReferenceResolver() {
		return setruntimeinstanceComponentInstanceReftypeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver getSetruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver() {
		return setruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefattributeReferenceResolver getSetruntimeinstanceComponentInstanceRefattributeReferenceResolver() {
		return setruntimeinstanceComponentInstanceRefattributeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceComponentInstanceRefbindingReferenceResolver getSetruntimeinstanceComponentInstanceRefbindingReferenceResolver() {
		return setruntimeinstanceComponentInstanceRefbindingReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver getSetruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver() {
		return setruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceReftypeReferenceResolver getSetruntimeinstancePrimitiveInstanceReftypeReferenceResolver() {
		return setruntimeinstancePrimitiveInstanceReftypeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver getSetruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver() {
		return setruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver getSetruntimeinstancePrimitiveInstanceRefattributeReferenceResolver() {
		return setruntimeinstancePrimitiveInstanceRefattributeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver getSetruntimeinstancePrimitiveInstanceRefbindingReferenceResolver() {
		return setruntimeinstancePrimitiveInstanceRefbindingReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver getSetruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver() {
		return setruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver getSetruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver() {
		return setruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver getSetruntimeinstanceCompositeInstanceRefdelegationReferenceResolver() {
		return setruntimeinstanceCompositeInstanceRefdelegationReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver getSetruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver() {
		return setruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefattributeReferenceResolver getSetruntimeinstanceCompositeInstanceRefattributeReferenceResolver() {
		return setruntimeinstanceCompositeInstanceRefattributeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceCompositeInstanceRefbindingReferenceResolver getSetruntimeinstanceCompositeInstanceRefbindingReferenceResolver() {
		return setruntimeinstanceCompositeInstanceRefbindingReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver getSetruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver() {
		return setruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefclientReferenceResolver getSetruntimeinstanceTransmissionBindingRefclientReferenceResolver() {
		return setruntimeinstanceTransmissionBindingRefclientReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverReferenceResolver getSetruntimeinstanceTransmissionBindingRefserverReferenceResolver() {
		return setruntimeinstanceTransmissionBindingRefserverReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.SetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver getSetruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver() {
		return setruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.ComponentInstanceTypeReferenceResolver getComponentInstanceTypeReferenceResolver() {
		return componentInstanceTypeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.TransmissionBindingClientReferenceResolver getTransmissionBindingClientReferenceResolver() {
		return transmissionBindingClientReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.BindingServerInstanceReferenceResolver getBindingServerInstanceReferenceResolver() {
		return bindingServerInstanceReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.TransmissionBindingServerReferenceResolver getTransmissionBindingServerReferenceResolver() {
		return transmissionBindingServerReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.DelegationBindingSourceReferenceResolver getDelegationBindingSourceReferenceResolver() {
		return delegationBindingSourceReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.DelegationBindingExportedReferenceResolver getDelegationBindingExportedReferenceResolver() {
		return delegationBindingExportedReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.ValuedAttributeAttributeReferenceResolver getValuedAttributeAttributeReferenceResolver() {
		return valuedAttributeAttributeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.DictionaryValuedAttributeAttributeReferenceResolver getDictionaryValuedAttributeAttributeReferenceResolver() {
		return dictionaryValuedAttributeAttributeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.DefaultEntryKeyReferenceResolver getDefaultEntryKeyReferenceResolver() {
		return defaultEntryKeyReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.TypedElementTypeReferenceResolver getTypedElementTypeReferenceResolver() {
		return typedElementTypeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.AbstractPortServiceReferenceResolver getAbstractPortServiceReferenceResolver() {
		return abstractPortServiceReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.DictionaryValueTypeReferenceResolver getDictionaryValueTypeReferenceResolver() {
		return dictionaryValueTypeReferenceResolver;
	}
	
	public org.smartadapters.core.resource.core.analysis.PRolePlayerReferenceResolver getPRolePlayerReferenceResolver() {
		return pRolePlayerReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		aspectPersistentReferenceResolver.setOptions(options);
		setruntimeSystemSystemToSetReferenceResolver.setOptions(options);
		setruntimeSystemRefrootReferenceResolver.setOptions(options);
		setruntimeSystemRefservicesReferenceResolver.setOptions(options);
		setruntimeSystemReftypesReferenceResolver.setOptions(options);
		setruntimeSystemRefdataTypesReferenceResolver.setOptions(options);
		setruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver.setOptions(options);
		setruntimeinstanceComponentInstanceReftypeReferenceResolver.setOptions(options);
		setruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver.setOptions(options);
		setruntimeinstanceComponentInstanceRefattributeReferenceResolver.setOptions(options);
		setruntimeinstanceComponentInstanceRefbindingReferenceResolver.setOptions(options);
		setruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver.setOptions(options);
		setruntimeinstancePrimitiveInstanceReftypeReferenceResolver.setOptions(options);
		setruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver.setOptions(options);
		setruntimeinstancePrimitiveInstanceRefattributeReferenceResolver.setOptions(options);
		setruntimeinstancePrimitiveInstanceRefbindingReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceRefdelegationReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceRefattributeReferenceResolver.setOptions(options);
		setruntimeinstanceCompositeInstanceRefbindingReferenceResolver.setOptions(options);
		setruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver.setOptions(options);
		setruntimeinstanceTransmissionBindingRefclientReferenceResolver.setOptions(options);
		setruntimeinstanceTransmissionBindingRefserverReferenceResolver.setOptions(options);
		setruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver.setOptions(options);
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
		dictionaryValueTypeReferenceResolver.setOptions(options);
		pRolePlayerReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.smartadapters.core.resource.core.ICoreReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.smartadapters.core.CorePackage.eINSTANCE.getAspect().isInstance(container)) {
			CoreFuzzyResolveResult<patternframework.PObject> frr = new CoreFuzzyResolveResult<patternframework.PObject>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("persistent")) {
				aspectPersistentReferenceResolver.resolve(identifier, (org.smartadapters.core.Aspect) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.System> frr = new CoreFuzzyResolveResult<pattern.art.System>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("SystemToSet")) {
				setruntimeSystemSystemToSetReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeSystem) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refroot")) {
				setruntimeSystemRefrootReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeSystem) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.Service> frr = new CoreFuzzyResolveResult<pattern.art.type.Service>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refservices")) {
				setruntimeSystemRefservicesReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeSystem) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.ComponentType> frr = new CoreFuzzyResolveResult<pattern.art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("reftypes")) {
				setruntimeSystemReftypesReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeSystem) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeSystem().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.DataType> frr = new CoreFuzzyResolveResult<pattern.art.DataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refdataTypes")) {
				setruntimeSystemRefdataTypesReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeSystem) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ComponentInstanceToSet")) {
				setruntimeinstanceComponentInstanceComponentInstanceToSetReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.ComponentType> frr = new CoreFuzzyResolveResult<pattern.art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("reftype")) {
				setruntimeinstanceComponentInstanceReftypeReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refsuperComponent")) {
				setruntimeinstanceComponentInstanceRefsuperComponentReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute> frr = new CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refattribute")) {
				setruntimeinstanceComponentInstanceRefattributeReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding> frr = new CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refbinding")) {
				setruntimeinstanceComponentInstanceRefbindingReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.PrimitiveInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.PrimitiveInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("PrimitiveInstanceToSet")) {
				setruntimeinstancePrimitiveInstancePrimitiveInstanceToSetReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.ComponentType> frr = new CoreFuzzyResolveResult<pattern.art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("reftype")) {
				setruntimeinstancePrimitiveInstanceReftypeReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refsuperComponent")) {
				setruntimeinstancePrimitiveInstanceRefsuperComponentReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute> frr = new CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refattribute")) {
				setruntimeinstancePrimitiveInstanceRefattributeReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstancePrimitiveInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding> frr = new CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refbinding")) {
				setruntimeinstancePrimitiveInstanceRefbindingReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("CompositeInstanceToSet")) {
				setruntimeinstanceCompositeInstanceCompositeInstanceToSetReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refsubComponent")) {
				setruntimeinstanceCompositeInstanceRefsubComponentReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.DelegationBinding> frr = new CoreFuzzyResolveResult<pattern.art.instance.DelegationBinding>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refdelegation")) {
				setruntimeinstanceCompositeInstanceRefdelegationReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.CompositeInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refsuperComponent")) {
				setruntimeinstanceCompositeInstanceRefsuperComponentReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute> frr = new CoreFuzzyResolveResult<pattern.art.instance.ValuedAttribute>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refattribute")) {
				setruntimeinstanceCompositeInstanceRefattributeReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceCompositeInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding> frr = new CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refbinding")) {
				setruntimeinstanceCompositeInstanceRefbindingReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceCompositeInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding> frr = new CoreFuzzyResolveResult<pattern.art.instance.TransmissionBinding>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("TransmissionBindingToSet")) {
				setruntimeinstanceTransmissionBindingTransmissionBindingToSetReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refclient")) {
				setruntimeinstanceTransmissionBindingRefclientReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refserver")) {
				setruntimeinstanceTransmissionBindingRefserverReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.smartadapters.core.adaptations.AdaptationsPackage.eINSTANCE.getSetruntimeinstanceTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("refserverInstance")) {
				setruntimeinstanceTransmissionBindingRefserverInstanceReferenceResolver.resolve(identifier, (org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getComponentInstance().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.ComponentType> frr = new CoreFuzzyResolveResult<pattern.art.type.ComponentType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				componentInstanceTypeReferenceResolver.resolve(identifier, (pattern.art.instance.ComponentInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("client")) {
				transmissionBindingClientReferenceResolver.resolve(identifier, (pattern.art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance> frr = new CoreFuzzyResolveResult<pattern.art.instance.ComponentInstance>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("serverInstance")) {
				bindingServerInstanceReferenceResolver.resolve(identifier, (pattern.art.instance.Binding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getTransmissionBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("server")) {
				transmissionBindingServerReferenceResolver.resolve(identifier, (pattern.art.instance.TransmissionBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				delegationBindingSourceReferenceResolver.resolve(identifier, (pattern.art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getDelegationBinding().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.AbstractPort> frr = new CoreFuzzyResolveResult<pattern.art.type.AbstractPort>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("exported")) {
				delegationBindingExportedReferenceResolver.resolve(identifier, (pattern.art.instance.DelegationBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getValuedAttribute().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.BasicAttribute> frr = new CoreFuzzyResolveResult<pattern.art.type.BasicAttribute>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				valuedAttributeAttributeReferenceResolver.resolve(identifier, (pattern.art.instance.ValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getDictionaryValuedAttribute().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.Dictionary> frr = new CoreFuzzyResolveResult<pattern.art.type.Dictionary>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				dictionaryValuedAttributeAttributeReferenceResolver.resolve(identifier, (pattern.art.instance.DictionaryValuedAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.instance.InstancePackage.eINSTANCE.getDefaultEntry().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.DictionaryDefaultValue> frr = new CoreFuzzyResolveResult<pattern.art.type.DictionaryDefaultValue>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("key")) {
				defaultEntryKeyReferenceResolver.resolve(identifier, (pattern.art.instance.DefaultEntry) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.ArtPackage.eINSTANCE.getTypedElement().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.DataType> frr = new CoreFuzzyResolveResult<pattern.art.DataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				typedElementTypeReferenceResolver.resolve(identifier, (pattern.art.TypedElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.type.TypePackage.eINSTANCE.getAbstractPort().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.type.Service> frr = new CoreFuzzyResolveResult<pattern.art.type.Service>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("service")) {
				abstractPortServiceReferenceResolver.resolve(identifier, (pattern.art.type.AbstractPort) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (pattern.art.type.TypePackage.eINSTANCE.getDictionary().isInstance(container)) {
			CoreFuzzyResolveResult<pattern.art.DataType> frr = new CoreFuzzyResolveResult<pattern.art.DataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("valueType")) {
				dictionaryValueTypeReferenceResolver.resolve(identifier, (pattern.art.type.Dictionary) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (patternframework.PatternframeworkPackage.eINSTANCE.getPRole().isInstance(container)) {
			CoreFuzzyResolveResult<patternframework.PObject> frr = new CoreFuzzyResolveResult<patternframework.PObject>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("player")) {
				pRolePlayerReferenceResolver.resolve(identifier, (patternframework.PRole) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
}
