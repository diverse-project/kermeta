/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.CallVariable;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.CallVariablePropertiesEditionPart;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class CallVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for kTag ReferencesTable
	 */
	private	ReferencesTableSettings kTagSettings;
	
	/**
	 * Settings for kType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings kTypeSettings;
	
	/**
	 * Settings for staticType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings staticTypeSettings;
	
	/**
	 * Settings for staticTypeVariableBindings ReferencesTable
	 */
	private	ReferencesTableSettings staticTypeVariableBindingsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CallVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject callVariable, String editing_mode) {
		super(editingContext, callVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BehaviorViewsRepository.class;
		partKey = BehaviorViewsRepository.CallVariable.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final CallVariable callVariable = (CallVariable)elt;
			final CallVariablePropertiesEditionPart basePart = (CallVariablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(BehaviorViewsRepository.CallVariable.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(callVariable, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(BehaviorViewsRepository.CallVariable.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(callVariable, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BehaviorViewsRepository.CallVariable.Properties.staticType)) {
				// init part
				staticTypeSettings = new EObjectFlatComboSettings(callVariable, BehaviorPackage.eINSTANCE.getExpression_StaticType());
				basePart.initStaticType(staticTypeSettings);
				// set the button mode
				basePart.setStaticTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (callVariable.getName() != null && isAccessible(BehaviorViewsRepository.CallVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), callVariable.getName()));
			
			if (isAccessible(BehaviorViewsRepository.CallVariable.Properties.staticTypeVariableBindings)) {
				staticTypeVariableBindingsSettings = new ReferencesTableSettings(callVariable, BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings());
				basePart.initStaticTypeVariableBindings(staticTypeVariableBindingsSettings);
			}
			if (isAccessible(BehaviorViewsRepository.CallVariable.Properties.isAtpre)) {
				basePart.setIsAtpre(callVariable.getIsAtpre());
			}
			// init filters
			basePart.addFilterToKTag(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInKTagTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToKTag(new EObjectFilter(StructurePackage.eINSTANCE.getTag()));
			// Start of user code for additional businessfilters for kTag
			// End of user code
			
			basePart.addFilterToKType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Type);
				}
			
			});
			// Start of user code for additional businessfilters for kType
			// End of user code
			
			basePart.addFilterToStaticType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Type); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for staticType
			// End of user code
			
			
			basePart.addFilterToStaticTypeVariableBindings(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInStaticTypeVariableBindingsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToStaticTypeVariableBindings(new EObjectFilter(StructurePackage.eINSTANCE.getType()));
			// Start of user code for additional businessfilters for staticTypeVariableBindings
			// End of user code
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.staticType) {
			return BehaviorPackage.eINSTANCE.getExpression_StaticType();
		}
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.name) {
			return BehaviorPackage.eINSTANCE.getCallExpression_Name();
		}
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.staticTypeVariableBindings) {
			return BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings();
		}
		if (editorKey == BehaviorViewsRepository.CallVariable.Properties.isAtpre) {
			return BehaviorPackage.eINSTANCE.getCallVariable_IsAtpre();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CallVariable callVariable = (CallVariable)semanticObject;
		if (BehaviorViewsRepository.CallVariable.Properties.kTag == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Tag) {
					kTagSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				kTagSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				kTagSettings.move(event.getNewIndex(), (Tag) event.getNewValue());
			}
		}
		if (BehaviorViewsRepository.CallVariable.Properties.kType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				kTypeSettings.setToReference((Type)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, kTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (BehaviorViewsRepository.CallVariable.Properties.staticType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				staticTypeSettings.setToReference((Type)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, staticTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (BehaviorViewsRepository.CallVariable.Properties.name == event.getAffectedEditor()) {
			callVariable.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (BehaviorViewsRepository.CallVariable.Properties.staticTypeVariableBindings == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Type) {
					staticTypeVariableBindingsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				staticTypeVariableBindingsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				staticTypeVariableBindingsSettings.move(event.getNewIndex(), (Type) event.getNewValue());
			}
		}
		if (BehaviorViewsRepository.CallVariable.Properties.isAtpre == event.getAffectedEditor()) {
			callVariable.setIsAtpre((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			CallVariablePropertiesEditionPart basePart = (CallVariablePropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.CallVariable.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallVariable.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getExpression_StaticType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallVariable.Properties.staticType))
				basePart.setStaticType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getCallExpression_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.CallVariable.Properties.staticTypeVariableBindings))
				basePart.updateStaticTypeVariableBindings();
			if (BehaviorPackage.eINSTANCE.getCallVariable_IsAtpre().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallVariable.Properties.isAtpre))
				basePart.setIsAtpre((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BehaviorViewsRepository.CallVariable.Properties.kType || key == BehaviorViewsRepository.CallVariable.Properties.isAtpre;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (BehaviorViewsRepository.CallVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getCallExpression_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getCallExpression_Name().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.CallVariable.Properties.isAtpre == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getCallVariable_IsAtpre().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getCallVariable_IsAtpre().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
