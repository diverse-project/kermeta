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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
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
import org.kermeta.language.behavior.CallSuperOperation;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.CallSuperOperationPropertiesEditionPart;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class CallSuperOperationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for staticOperation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings staticOperationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CallSuperOperationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject callSuperOperation, String editing_mode) {
		super(editingContext, callSuperOperation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BehaviorViewsRepository.class;
		partKey = BehaviorViewsRepository.CallSuperOperation.class;
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
			final CallSuperOperation callSuperOperation = (CallSuperOperation)elt;
			final CallSuperOperationPropertiesEditionPart basePart = (CallSuperOperationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(callSuperOperation, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(callSuperOperation, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticType)) {
				// init part
				staticTypeSettings = new EObjectFlatComboSettings(callSuperOperation, BehaviorPackage.eINSTANCE.getExpression_StaticType());
				basePart.initStaticType(staticTypeSettings);
				// set the button mode
				basePart.setStaticTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (callSuperOperation.getName() != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), callSuperOperation.getName()));
			
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticTypeVariableBindings)) {
				staticTypeVariableBindingsSettings = new ReferencesTableSettings(callSuperOperation, BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings());
				basePart.initStaticTypeVariableBindings(staticTypeVariableBindingsSettings);
			}
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre)) {
				basePart.setIsAtpre(callSuperOperation.getIsAtpre());
			}
			if (isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticOperation)) {
				// init part
				staticOperationSettings = new EObjectFlatComboSettings(callSuperOperation, BehaviorPackage.eINSTANCE.getCallOperation_StaticOperation());
				basePart.initStaticOperation(staticOperationSettings);
				// set the button mode
				basePart.setStaticOperationButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			basePart.addFilterToStaticOperation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Operation); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for staticOperation
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
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.staticType) {
			return BehaviorPackage.eINSTANCE.getExpression_StaticType();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.name) {
			return BehaviorPackage.eINSTANCE.getCallExpression_Name();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.staticTypeVariableBindings) {
			return BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre) {
			return BehaviorPackage.eINSTANCE.getCallFeature_IsAtpre();
		}
		if (editorKey == BehaviorViewsRepository.CallSuperOperation.Properties.staticOperation) {
			return BehaviorPackage.eINSTANCE.getCallOperation_StaticOperation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CallSuperOperation callSuperOperation = (CallSuperOperation)semanticObject;
		if (BehaviorViewsRepository.CallSuperOperation.Properties.kTag == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.CallSuperOperation.Properties.kType == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.CallSuperOperation.Properties.staticType == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.CallSuperOperation.Properties.name == event.getAffectedEditor()) {
			callSuperOperation.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (BehaviorViewsRepository.CallSuperOperation.Properties.staticTypeVariableBindings == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre == event.getAffectedEditor()) {
			callSuperOperation.setIsAtpre((Boolean)event.getNewValue());
		}
		if (BehaviorViewsRepository.CallSuperOperation.Properties.staticOperation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				staticOperationSettings.setToReference((Operation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Operation eObject = StructureFactory.eINSTANCE.createOperation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				staticOperationSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			CallSuperOperationPropertiesEditionPart basePart = (CallSuperOperationPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getExpression_StaticType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticType))
				basePart.setStaticType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getCallExpression_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BehaviorPackage.eINSTANCE.getCallExpression_StaticTypeVariableBindings().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticTypeVariableBindings))
				basePart.updateStaticTypeVariableBindings();
			if (BehaviorPackage.eINSTANCE.getCallFeature_IsAtpre().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre))
				basePart.setIsAtpre((Boolean)msg.getNewValue());
			
			if (BehaviorPackage.eINSTANCE.getCallOperation_StaticOperation().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.CallSuperOperation.Properties.staticOperation))
				basePart.setStaticOperation((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BehaviorViewsRepository.CallSuperOperation.Properties.kType || key == BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre;
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
				if (BehaviorViewsRepository.CallSuperOperation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getCallExpression_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getCallExpression_Name().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.CallSuperOperation.Properties.isAtpre == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getCallFeature_IsAtpre().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getCallFeature_IsAtpre().getEAttributeType(), newValue);
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
