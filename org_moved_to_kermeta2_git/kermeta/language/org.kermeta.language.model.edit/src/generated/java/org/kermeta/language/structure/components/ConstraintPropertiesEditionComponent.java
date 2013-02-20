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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.ConstraintLanguage;
import org.kermeta.language.structure.ConstraintType;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class ConstraintPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for invOwner EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings invOwnerSettings;
	
	/**
	 * Settings for preOwner EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings preOwnerSettings;
	
	/**
	 * Settings for postOwner EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings postOwnerSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConstraintPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject constraint, String editing_mode) {
		super(editingContext, constraint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.Constraint.class;
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
			final Constraint constraint = (Constraint)elt;
			final ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.Constraint.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(constraint, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.Constraint.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(constraint, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (constraint.getName() != null && isAccessible(StructureViewsRepository.Constraint.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), constraint.getName()));
			
			if (isAccessible(StructureViewsRepository.Constraint.Properties.stereotype)) {
				basePart.initStereotype(EEFUtils.choiceOfValues(constraint, StructurePackage.eINSTANCE.getConstraint_Stereotype()), constraint.getStereotype());
			}
			if (isAccessible(StructureViewsRepository.Constraint.Properties.language)) {
				basePart.initLanguage(EEFUtils.choiceOfValues(constraint, StructurePackage.eINSTANCE.getConstraint_Language()), constraint.getLanguage());
			}
			if (isAccessible(StructureViewsRepository.Constraint.Properties.invOwner)) {
				// init part
				invOwnerSettings = new EObjectFlatComboSettings(constraint, StructurePackage.eINSTANCE.getConstraint_InvOwner());
				basePart.initInvOwner(invOwnerSettings);
				// set the button mode
				basePart.setInvOwnerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Constraint.Properties.preOwner)) {
				// init part
				preOwnerSettings = new EObjectFlatComboSettings(constraint, StructurePackage.eINSTANCE.getConstraint_PreOwner());
				basePart.initPreOwner(preOwnerSettings);
				// set the button mode
				basePart.setPreOwnerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Constraint.Properties.postOwner)) {
				// init part
				postOwnerSettings = new EObjectFlatComboSettings(constraint, StructurePackage.eINSTANCE.getConstraint_PostOwner());
				basePart.initPostOwner(postOwnerSettings);
				// set the button mode
				basePart.setPostOwnerButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			
			
			basePart.addFilterToInvOwner(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ClassDefinition); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for invOwner
			// End of user code
			
			basePart.addFilterToPreOwner(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Operation); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for preOwner
			// End of user code
			
			basePart.addFilterToPostOwner(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Operation); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for postOwner
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
		if (editorKey == StructureViewsRepository.Constraint.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.stereotype) {
			return StructurePackage.eINSTANCE.getConstraint_Stereotype();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.language) {
			return StructurePackage.eINSTANCE.getConstraint_Language();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.invOwner) {
			return StructurePackage.eINSTANCE.getConstraint_InvOwner();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.preOwner) {
			return StructurePackage.eINSTANCE.getConstraint_PreOwner();
		}
		if (editorKey == StructureViewsRepository.Constraint.Properties.postOwner) {
			return StructurePackage.eINSTANCE.getConstraint_PostOwner();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Constraint constraint = (Constraint)semanticObject;
		if (StructureViewsRepository.Constraint.Properties.kTag == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Constraint.Properties.kType == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Constraint.Properties.name == event.getAffectedEditor()) {
			constraint.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.Constraint.Properties.stereotype == event.getAffectedEditor()) {
			constraint.setStereotype((ConstraintType)event.getNewValue());
		}
		if (StructureViewsRepository.Constraint.Properties.language == event.getAffectedEditor()) {
			constraint.setLanguage((ConstraintLanguage)event.getNewValue());
		}
		if (StructureViewsRepository.Constraint.Properties.invOwner == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				invOwnerSettings.setToReference((ClassDefinition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ClassDefinition eObject = StructureFactory.eINSTANCE.createClassDefinition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				invOwnerSettings.setToReference(eObject);
			}
		}
		if (StructureViewsRepository.Constraint.Properties.preOwner == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				preOwnerSettings.setToReference((Operation)event.getNewValue());
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
				preOwnerSettings.setToReference(eObject);
			}
		}
		if (StructureViewsRepository.Constraint.Properties.postOwner == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				postOwnerSettings.setToReference((Operation)event.getNewValue());
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
				postOwnerSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			ConstraintPropertiesEditionPart basePart = (ConstraintPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Constraint.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Constraint.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Constraint.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getConstraint_Stereotype().equals(msg.getFeature()) && isAccessible(StructureViewsRepository.Constraint.Properties.stereotype))
				basePart.setStereotype((ConstraintType)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getConstraint_Language().equals(msg.getFeature()) && isAccessible(StructureViewsRepository.Constraint.Properties.language))
				basePart.setLanguage((ConstraintLanguage)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getConstraint_InvOwner().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Constraint.Properties.invOwner))
				basePart.setInvOwner((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getConstraint_PreOwner().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Constraint.Properties.preOwner))
				basePart.setPreOwner((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getConstraint_PostOwner().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Constraint.Properties.postOwner))
				basePart.setPostOwner((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == StructureViewsRepository.Constraint.Properties.kType || key == StructureViewsRepository.Constraint.Properties.name;
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
				if (StructureViewsRepository.Constraint.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Constraint.Properties.stereotype == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getConstraint_Stereotype().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getConstraint_Stereotype().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Constraint.Properties.language == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getConstraint_Language().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getConstraint_Language().getEAttributeType(), newValue);
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
