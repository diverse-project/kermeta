/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.components;

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
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.parts.EnumerationPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class EnumerationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for typeContainer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings typeContainerSettings;
	
	/**
	 * Settings for superType ReferencesTable
	 */
	private	ReferencesTableSettings superTypeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EnumerationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject enumeration, String editing_mode) {
		super(editingContext, enumeration, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.Enumeration.class;
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
			final Enumeration enumeration = (Enumeration)elt;
			final EnumerationPropertiesEditionPart basePart = (EnumerationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.Enumeration.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(enumeration, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.Enumeration.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(enumeration, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Enumeration.Properties.typeContainer)) {
				// init part
				typeContainerSettings = new EObjectFlatComboSettings(enumeration, StructurePackage.eINSTANCE.getType_TypeContainer());
				basePart.initTypeContainer(typeContainerSettings);
				// set the button mode
				basePart.setTypeContainerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (enumeration.getName() != null && isAccessible(StructureViewsRepository.Enumeration.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), enumeration.getName()));
			
			if (isAccessible(StructureViewsRepository.Enumeration.Properties.superType)) {
				superTypeSettings = new ReferencesTableSettings(enumeration, StructurePackage.eINSTANCE.getTypeDefinition_SuperType());
				basePart.initSuperType(superTypeSettings);
			}
			if (isAccessible(StructureViewsRepository.Enumeration.Properties.isAspect)) {
				basePart.setIsAspect(enumeration.getIsAspect());
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
			
			basePart.addFilterToTypeContainer(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof TypeContainer); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for typeContainer
			// End of user code
			
			
			basePart.addFilterToSuperType(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSuperTypeTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSuperType(new EObjectFilter(StructurePackage.eINSTANCE.getType()));
			// Start of user code for additional businessfilters for superType
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
		if (editorKey == StructureViewsRepository.Enumeration.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.Enumeration.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.Enumeration.Properties.typeContainer) {
			return StructurePackage.eINSTANCE.getType_TypeContainer();
		}
		if (editorKey == StructureViewsRepository.Enumeration.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == StructureViewsRepository.Enumeration.Properties.superType) {
			return StructurePackage.eINSTANCE.getTypeDefinition_SuperType();
		}
		if (editorKey == StructureViewsRepository.Enumeration.Properties.isAspect) {
			return StructurePackage.eINSTANCE.getTypeDefinition_IsAspect();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Enumeration enumeration = (Enumeration)semanticObject;
		if (StructureViewsRepository.Enumeration.Properties.kTag == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Enumeration.Properties.kType == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Enumeration.Properties.typeContainer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeContainerSettings.setToReference((TypeContainer)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeContainerSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (StructureViewsRepository.Enumeration.Properties.name == event.getAffectedEditor()) {
			enumeration.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.Enumeration.Properties.superType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Type) {
					superTypeSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				superTypeSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				superTypeSettings.move(event.getNewIndex(), (Type) event.getNewValue());
			}
		}
		if (StructureViewsRepository.Enumeration.Properties.isAspect == event.getAffectedEditor()) {
			enumeration.setIsAspect((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EnumerationPropertiesEditionPart basePart = (EnumerationPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Enumeration.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Enumeration.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getType_TypeContainer().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Enumeration.Properties.typeContainer))
				basePart.setTypeContainer((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Enumeration.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getTypeDefinition_SuperType().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Enumeration.Properties.superType))
				basePart.updateSuperType();
			if (StructurePackage.eINSTANCE.getTypeDefinition_IsAspect().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Enumeration.Properties.isAspect))
				basePart.setIsAspect((Boolean)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == StructureViewsRepository.Enumeration.Properties.kType || key == StructureViewsRepository.Enumeration.Properties.name;
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
				if (StructureViewsRepository.Enumeration.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Enumeration.Properties.isAspect == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getTypeDefinition_IsAspect().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getTypeDefinition_IsAspect().getEAttributeType(), newValue);
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
