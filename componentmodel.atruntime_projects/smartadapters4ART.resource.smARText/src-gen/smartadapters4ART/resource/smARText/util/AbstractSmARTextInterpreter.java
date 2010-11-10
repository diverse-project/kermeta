/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractSmARTextInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof art_relaxed.distrib_relaxed.Node) {
			result = interprete_art_005frelaxed_distrib_005frelaxed_Node((art_relaxed.distrib_relaxed.Node) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.group_relaxed.InstanceGroup) {
			result = interprete_art_005frelaxed_group_005frelaxed_InstanceGroup((art_relaxed.group_relaxed.InstanceGroup) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.group_relaxed.TypeGroup) {
			result = interprete_art_005frelaxed_group_005frelaxed_TypeGroup((art_relaxed.group_relaxed.TypeGroup) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.group_relaxed.Group) {
			result = interprete_art_005frelaxed_group_005frelaxed_Group((art_relaxed.group_relaxed.Group) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.implem_relaxed.OSGiType) {
			result = interprete_art_005frelaxed_implem_005frelaxed_OSGiType((art_relaxed.implem_relaxed.OSGiType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.implem_relaxed.TypeImplementation) {
			result = interprete_art_005frelaxed_implem_005frelaxed_TypeImplementation((art_relaxed.implem_relaxed.TypeImplementation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.implem_relaxed.OSGiComponent) {
			result = interprete_art_005frelaxed_implem_005frelaxed_OSGiComponent((art_relaxed.implem_relaxed.OSGiComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.implem_relaxed.FractalComponent) {
			result = interprete_art_005frelaxed_implem_005frelaxed_FractalComponent((art_relaxed.implem_relaxed.FractalComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.implem_relaxed.ComponentImplementation) {
			result = interprete_art_005frelaxed_implem_005frelaxed_ComponentImplementation((art_relaxed.implem_relaxed.ComponentImplementation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.DictionaryDefaultValue) {
			result = interprete_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue((art_relaxed.type_relaxed.DictionaryDefaultValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Dictionary) {
			result = interprete_art_005frelaxed_type_005frelaxed_Dictionary((art_relaxed.type_relaxed.Dictionary) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.BasicAttribute) {
			result = interprete_art_005frelaxed_type_005frelaxed_BasicAttribute((art_relaxed.type_relaxed.BasicAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Attribute) {
			result = interprete_art_005frelaxed_type_005frelaxed_Attribute((art_relaxed.type_relaxed.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.PortId) {
			result = interprete_art_005frelaxed_type_005frelaxed_PortId((art_relaxed.type_relaxed.PortId) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.PortCollection) {
			result = interprete_art_005frelaxed_type_005frelaxed_PortCollection((art_relaxed.type_relaxed.PortCollection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Port) {
			result = interprete_art_005frelaxed_type_005frelaxed_Port((art_relaxed.type_relaxed.Port) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.AbstractPort) {
			result = interprete_art_005frelaxed_type_005frelaxed_AbstractPort((art_relaxed.type_relaxed.AbstractPort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.ControlService) {
			result = interprete_art_005frelaxed_type_005frelaxed_ControlService((art_relaxed.type_relaxed.ControlService) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.FunctionalService) {
			result = interprete_art_005frelaxed_type_005frelaxed_FunctionalService((art_relaxed.type_relaxed.FunctionalService) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Parameter) {
			result = interprete_art_005frelaxed_type_005frelaxed_Parameter((art_relaxed.type_relaxed.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Operation) {
			result = interprete_art_005frelaxed_type_005frelaxed_Operation((art_relaxed.type_relaxed.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.Service) {
			result = interprete_art_005frelaxed_type_005frelaxed_Service((art_relaxed.type_relaxed.Service) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.CompositeType) {
			result = interprete_art_005frelaxed_type_005frelaxed_CompositeType((art_relaxed.type_relaxed.CompositeType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.PrimitiveType) {
			result = interprete_art_005frelaxed_type_005frelaxed_PrimitiveType((art_relaxed.type_relaxed.PrimitiveType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.type_relaxed.ComponentType) {
			result = interprete_art_005frelaxed_type_005frelaxed_ComponentType((art_relaxed.type_relaxed.ComponentType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.OtherEntry) {
			result = interprete_art_005frelaxed_instance_005frelaxed_OtherEntry((art_relaxed.instance_relaxed.OtherEntry) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.DefaultEntry) {
			result = interprete_art_005frelaxed_instance_005frelaxed_DefaultEntry((art_relaxed.instance_relaxed.DefaultEntry) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.Entry) {
			result = interprete_art_005frelaxed_instance_005frelaxed_Entry((art_relaxed.instance_relaxed.Entry) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.DictionaryValuedAttribute) {
			result = interprete_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute((art_relaxed.instance_relaxed.DictionaryValuedAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.ValuedAttribute) {
			result = interprete_art_005frelaxed_instance_005frelaxed_ValuedAttribute((art_relaxed.instance_relaxed.ValuedAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.AttributeInstance) {
			result = interprete_art_005frelaxed_instance_005frelaxed_AttributeInstance((art_relaxed.instance_relaxed.AttributeInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.DelegationBinding) {
			result = interprete_art_005frelaxed_instance_005frelaxed_DelegationBinding((art_relaxed.instance_relaxed.DelegationBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.TransmissionBinding) {
			result = interprete_art_005frelaxed_instance_005frelaxed_TransmissionBinding((art_relaxed.instance_relaxed.TransmissionBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.Binding) {
			result = interprete_art_005frelaxed_instance_005frelaxed_Binding((art_relaxed.instance_relaxed.Binding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.CompositeInstance) {
			result = interprete_art_005frelaxed_instance_005frelaxed_CompositeInstance((art_relaxed.instance_relaxed.CompositeInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.PrimitiveInstance) {
			result = interprete_art_005frelaxed_instance_005frelaxed_PrimitiveInstance((art_relaxed.instance_relaxed.PrimitiveInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.instance_relaxed.ComponentInstance) {
			result = interprete_art_005frelaxed_instance_005frelaxed_ComponentInstance((art_relaxed.instance_relaxed.ComponentInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.CardinalityElement) {
			result = interprete_art_005frelaxed_CardinalityElement((art_relaxed.CardinalityElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.TypedElement) {
			result = interprete_art_005frelaxed_TypedElement((art_relaxed.TypedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.DataType) {
			result = interprete_art_005frelaxed_DataType((art_relaxed.DataType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.System) {
			result = interprete_art_005frelaxed_System((art_relaxed.System) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.ModelElement) {
			result = interprete_art_005frelaxed_ModelElement((art_relaxed.ModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.NamedElement) {
			result = interprete_art_005frelaxed_NamedElement((art_relaxed.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof art_relaxed.AspectModelElement) {
			result = interprete_art_005frelaxed_AspectModelElement((art_relaxed.AspectModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding((smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance((smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance((smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance((smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeSystem) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeSystem((smartadapters4ART.adaptations.SetruntimeSystem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.adaptations.SetruntimeNode) {
			result = interprete_smartadapters4ART_adaptations_SetruntimeNode((smartadapters4ART.adaptations.SetruntimeNode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.PerElementMatch) {
			result = interprete_smartadapters4ART_PerElementMatch((smartadapters4ART.PerElementMatch) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.PerRoleMatch) {
			result = interprete_smartadapters4ART_PerRoleMatch((smartadapters4ART.PerRoleMatch) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.ScopedInstantiation) {
			result = interprete_smartadapters4ART_ScopedInstantiation((smartadapters4ART.ScopedInstantiation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.GlobalInstantiation) {
			result = interprete_smartadapters4ART_GlobalInstantiation((smartadapters4ART.GlobalInstantiation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.InstantiationStrategy) {
			result = interprete_smartadapters4ART_InstantiationStrategy((smartadapters4ART.InstantiationStrategy) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.PointcutModel) {
			result = interprete_smartadapters4ART_PointcutModel((smartadapters4ART.PointcutModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.AdviceModel) {
			result = interprete_smartadapters4ART_AdviceModel((smartadapters4ART.AdviceModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.UnsetAdaptation) {
			result = interprete_smartadapters4ART_UnsetAdaptation((smartadapters4ART.UnsetAdaptation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.SetAdaptation) {
			result = interprete_smartadapters4ART_SetAdaptation((smartadapters4ART.SetAdaptation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.CreateAdaptation) {
			result = interprete_smartadapters4ART_CreateAdaptation((smartadapters4ART.CreateAdaptation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.CloneAdaptation) {
			result = interprete_smartadapters4ART_CloneAdaptation((smartadapters4ART.CloneAdaptation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.Adaptation) {
			result = interprete_smartadapters4ART_Adaptation((smartadapters4ART.Adaptation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof smartadapters4ART.Aspect) {
			result = interprete_smartadapters4ART_Aspect((smartadapters4ART.Aspect) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_smartadapters4ART_Aspect(smartadapters4ART.Aspect object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_Adaptation(smartadapters4ART.Adaptation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_CloneAdaptation(smartadapters4ART.CloneAdaptation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_CreateAdaptation(smartadapters4ART.CreateAdaptation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_SetAdaptation(smartadapters4ART.SetAdaptation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_UnsetAdaptation(smartadapters4ART.UnsetAdaptation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_AdviceModel(smartadapters4ART.AdviceModel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_PointcutModel(smartadapters4ART.PointcutModel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_InstantiationStrategy(smartadapters4ART.InstantiationStrategy object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_GlobalInstantiation(smartadapters4ART.GlobalInstantiation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_ScopedInstantiation(smartadapters4ART.ScopedInstantiation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_PerRoleMatch(smartadapters4ART.PerRoleMatch object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_PerElementMatch(smartadapters4ART.PerElementMatch object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeNode(smartadapters4ART.adaptations.SetruntimeNode object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeSystem(smartadapters4ART.adaptations.SetruntimeSystem object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeinstanceComponentInstance(smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeinstancePrimitiveInstance(smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeinstanceCompositeInstance(smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_smartadapters4ART_adaptations_SetruntimeinstanceTransmissionBinding(smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_NamedElement(art_relaxed.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_ModelElement(art_relaxed.ModelElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_System(art_relaxed.System object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_DataType(art_relaxed.DataType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_TypedElement(art_relaxed.TypedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_CardinalityElement(art_relaxed.CardinalityElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_AspectModelElement(art_relaxed.AspectModelElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_ComponentInstance(art_relaxed.instance_relaxed.ComponentInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_PrimitiveInstance(art_relaxed.instance_relaxed.PrimitiveInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_CompositeInstance(art_relaxed.instance_relaxed.CompositeInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_Binding(art_relaxed.instance_relaxed.Binding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_TransmissionBinding(art_relaxed.instance_relaxed.TransmissionBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_DelegationBinding(art_relaxed.instance_relaxed.DelegationBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_AttributeInstance(art_relaxed.instance_relaxed.AttributeInstance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_ValuedAttribute(art_relaxed.instance_relaxed.ValuedAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_DictionaryValuedAttribute(art_relaxed.instance_relaxed.DictionaryValuedAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_Entry(art_relaxed.instance_relaxed.Entry object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_DefaultEntry(art_relaxed.instance_relaxed.DefaultEntry object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_instance_005frelaxed_OtherEntry(art_relaxed.instance_relaxed.OtherEntry object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_ComponentType(art_relaxed.type_relaxed.ComponentType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_PrimitiveType(art_relaxed.type_relaxed.PrimitiveType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_CompositeType(art_relaxed.type_relaxed.CompositeType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Service(art_relaxed.type_relaxed.Service object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Operation(art_relaxed.type_relaxed.Operation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Parameter(art_relaxed.type_relaxed.Parameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_FunctionalService(art_relaxed.type_relaxed.FunctionalService object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_ControlService(art_relaxed.type_relaxed.ControlService object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_AbstractPort(art_relaxed.type_relaxed.AbstractPort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Port(art_relaxed.type_relaxed.Port object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_PortCollection(art_relaxed.type_relaxed.PortCollection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_PortId(art_relaxed.type_relaxed.PortId object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Attribute(art_relaxed.type_relaxed.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_BasicAttribute(art_relaxed.type_relaxed.BasicAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_Dictionary(art_relaxed.type_relaxed.Dictionary object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_type_005frelaxed_DictionaryDefaultValue(art_relaxed.type_relaxed.DictionaryDefaultValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_implem_005frelaxed_ComponentImplementation(art_relaxed.implem_relaxed.ComponentImplementation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_implem_005frelaxed_FractalComponent(art_relaxed.implem_relaxed.FractalComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_implem_005frelaxed_OSGiComponent(art_relaxed.implem_relaxed.OSGiComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_implem_005frelaxed_TypeImplementation(art_relaxed.implem_relaxed.TypeImplementation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_implem_005frelaxed_OSGiType(art_relaxed.implem_relaxed.OSGiType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_group_005frelaxed_Group(art_relaxed.group_relaxed.Group object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_group_005frelaxed_TypeGroup(art_relaxed.group_relaxed.TypeGroup object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_group_005frelaxed_InstanceGroup(art_relaxed.group_relaxed.InstanceGroup object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_art_005frelaxed_distrib_005frelaxed_Node(art_relaxed.distrib_relaxed.Node object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
