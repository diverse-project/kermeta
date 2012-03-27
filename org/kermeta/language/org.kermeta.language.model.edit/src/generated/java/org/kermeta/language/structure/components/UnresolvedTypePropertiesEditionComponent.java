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
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeContainer;
import org.kermeta.language.structure.UnresolvedType;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.parts.UnresolvedTypePropertiesEditionPart;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class UnresolvedTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for generics ReferencesTable
	 */
	private	ReferencesTableSettings genericsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public UnresolvedTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject unresolvedType, String editing_mode) {
		super(editingContext, unresolvedType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.UnresolvedType.class;
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
			final UnresolvedType unresolvedType = (UnresolvedType)elt;
			final UnresolvedTypePropertiesEditionPart basePart = (UnresolvedTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.UnresolvedType.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(unresolvedType, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.UnresolvedType.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(unresolvedType, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.UnresolvedType.Properties.typeContainer)) {
				// init part
				typeContainerSettings = new EObjectFlatComboSettings(unresolvedType, StructurePackage.eINSTANCE.getType_TypeContainer());
				basePart.initTypeContainer(typeContainerSettings);
				// set the button mode
				basePart.setTypeContainerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.UnresolvedType.Properties.generics)) {
				genericsSettings = new ReferencesTableSettings(unresolvedType, StructurePackage.eINSTANCE.getUnresolvedType_Generics());
				basePart.initGenerics(genericsSettings);
			}
			if (unresolvedType.getTypeIdentifier() != null && isAccessible(StructureViewsRepository.UnresolvedType.Properties.typeIdentifier))
				basePart.setTypeIdentifier(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), unresolvedType.getTypeIdentifier()));
			
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
			
			basePart.addFilterToGenerics(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInGenericsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToGenerics(new EObjectFilter(StructurePackage.eINSTANCE.getType()));
			// Start of user code for additional businessfilters for generics
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
		if (editorKey == StructureViewsRepository.UnresolvedType.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.UnresolvedType.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.UnresolvedType.Properties.typeContainer) {
			return StructurePackage.eINSTANCE.getType_TypeContainer();
		}
		if (editorKey == StructureViewsRepository.UnresolvedType.Properties.generics) {
			return StructurePackage.eINSTANCE.getUnresolvedType_Generics();
		}
		if (editorKey == StructureViewsRepository.UnresolvedType.Properties.typeIdentifier) {
			return StructurePackage.eINSTANCE.getUnresolvedType_TypeIdentifier();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		UnresolvedType unresolvedType = (UnresolvedType)semanticObject;
		if (StructureViewsRepository.UnresolvedType.Properties.kTag == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.UnresolvedType.Properties.kType == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.UnresolvedType.Properties.typeContainer == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.UnresolvedType.Properties.generics == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Type) {
					genericsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				genericsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				genericsSettings.move(event.getNewIndex(), (Type) event.getNewValue());
			}
		}
		if (StructureViewsRepository.UnresolvedType.Properties.typeIdentifier == event.getAffectedEditor()) {
			unresolvedType.setTypeIdentifier((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			UnresolvedTypePropertiesEditionPart basePart = (UnresolvedTypePropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.UnresolvedType.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.UnresolvedType.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getType_TypeContainer().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.UnresolvedType.Properties.typeContainer))
				basePart.setTypeContainer((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getUnresolvedType_Generics().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.UnresolvedType.Properties.generics))
				basePart.updateGenerics();
			if (StructurePackage.eINSTANCE.getUnresolvedType_TypeIdentifier().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.UnresolvedType.Properties.typeIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setTypeIdentifier(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setTypeIdentifier("");
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
		return key == StructureViewsRepository.UnresolvedType.Properties.kType || key == StructureViewsRepository.UnresolvedType.Properties.typeIdentifier;
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
				if (StructureViewsRepository.UnresolvedType.Properties.typeIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getUnresolvedType_TypeIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getUnresolvedType_TypeIdentifier().getEAttributeType(), newValue);
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
