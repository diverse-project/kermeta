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
import org.kermeta.language.behavior.TypeReference;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.TypeReferencePropertiesEditionPart;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class TypeReferencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for type EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings typeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TypeReferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject typeReference, String editing_mode) {
		super(editingContext, typeReference, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BehaviorViewsRepository.class;
		partKey = BehaviorViewsRepository.TypeReference.class;
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
			final TypeReference typeReference = (TypeReference)elt;
			final TypeReferencePropertiesEditionPart basePart = (TypeReferencePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(typeReference, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(typeReference, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (typeReference.getName() != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), typeReference.getName()));
			
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.type)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(typeReference, StructurePackage.eINSTANCE.getTypedElement_Type());
				basePart.initType(typeSettings);
				// set the button mode
				basePart.setTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.isOrdered)) {
				basePart.setIsOrdered(typeReference.getIsOrdered());
			}
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.isUnique)) {
				basePart.setIsUnique(typeReference.getIsUnique());
			}
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.lower)) {
				basePart.setLower(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), typeReference.getLower()));
			}
			
			if (isAccessible(BehaviorViewsRepository.TypeReference.Properties.upper)) {
				basePart.setUpper(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), typeReference.getUpper()));
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
			
			
			basePart.addFilterToType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Type); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for type
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
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.type) {
			return StructurePackage.eINSTANCE.getTypedElement_Type();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.isOrdered) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.isUnique) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.lower) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Lower();
		}
		if (editorKey == BehaviorViewsRepository.TypeReference.Properties.upper) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Upper();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TypeReference typeReference = (TypeReference)semanticObject;
		if (BehaviorViewsRepository.TypeReference.Properties.kTag == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.TypeReference.Properties.kType == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.TypeReference.Properties.name == event.getAffectedEditor()) {
			typeReference.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (BehaviorViewsRepository.TypeReference.Properties.type == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeSettings.setToReference((Type)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (BehaviorViewsRepository.TypeReference.Properties.isOrdered == event.getAffectedEditor()) {
			typeReference.setIsOrdered((Boolean)event.getNewValue());
		}
		if (BehaviorViewsRepository.TypeReference.Properties.isUnique == event.getAffectedEditor()) {
			typeReference.setIsUnique((Boolean)event.getNewValue());
		}
		if (BehaviorViewsRepository.TypeReference.Properties.lower == event.getAffectedEditor()) {
			typeReference.setLower((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getInteger(), (String)event.getNewValue())));
		}
		if (BehaviorViewsRepository.TypeReference.Properties.upper == event.getAffectedEditor()) {
			typeReference.setUpper((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getUnlimitedNatural(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TypeReferencePropertiesEditionPart basePart = (TypeReferencePropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.TypeReference.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getTypedElement_Type().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.type))
				basePart.setType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.isOrdered))
				basePart.setIsOrdered((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.isUnique))
				basePart.setIsUnique((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Lower().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.lower)) {
				if (msg.getNewValue() != null) {
					basePart.setLower(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), msg.getNewValue()));
				} else {
					basePart.setLower("");
				}
			}
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Upper().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.TypeReference.Properties.upper)) {
				if (msg.getNewValue() != null) {
					basePart.setUpper(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), msg.getNewValue()));
				} else {
					basePart.setUpper("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BehaviorViewsRepository.TypeReference.Properties.kType || key == BehaviorViewsRepository.TypeReference.Properties.name;
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
				if (BehaviorViewsRepository.TypeReference.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.TypeReference.Properties.isOrdered == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.TypeReference.Properties.isUnique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.TypeReference.Properties.lower == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.TypeReference.Properties.upper == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), newValue);
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
