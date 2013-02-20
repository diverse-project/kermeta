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
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.kermeta.language.structure.AbstractProperty;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.parts.PropertyPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class PropertyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for opposite EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings oppositeSettings;
	
	/**
	 * Settings for owningClass EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings owningClassSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PropertyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject property, String editing_mode) {
		super(editingContext, property, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.Property.class;
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
			final Property property = (Property)elt;
			final PropertyPropertiesEditionPart basePart = (PropertyPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.Property.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(property, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(property, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (property.getName() != null && isAccessible(StructureViewsRepository.Property.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), property.getName()));
			
			if (isAccessible(StructureViewsRepository.Property.Properties.type)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(property, StructurePackage.eINSTANCE.getTypedElement_Type());
				basePart.initType(typeSettings);
				// set the button mode
				basePart.setTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isOrdered)) {
				basePart.setIsOrdered(property.getIsOrdered());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isUnique)) {
				basePart.setIsUnique(property.getIsUnique());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.lower)) {
				basePart.setLower(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), property.getLower()));
			}
			
			if (isAccessible(StructureViewsRepository.Property.Properties.upper)) {
				basePart.setUpper(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), property.getUpper()));
			}
			
			if (isAccessible(StructureViewsRepository.Property.Properties.opposite)) {
				// init part
				oppositeSettings = new EObjectFlatComboSettings(property, StructurePackage.eINSTANCE.getProperty_Opposite());
				basePart.initOpposite(oppositeSettings);
				// set the button mode
				basePart.setOppositeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isReadOnly)) {
				basePart.setIsReadOnly(property.getIsReadOnly());
			}
			if (property.getDefault() != null && isAccessible(StructureViewsRepository.Property.Properties.default_))
				basePart.setDefault_(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), property.getDefault()));
			
			if (isAccessible(StructureViewsRepository.Property.Properties.isComposite)) {
				basePart.setIsComposite(property.getIsComposite());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isDerived)) {
				basePart.setIsDerived(property.getIsDerived());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isID)) {
				basePart.setIsID(property.getIsID());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isGetterAbstract)) {
				basePart.setIsGetterAbstract(property.getIsGetterAbstract());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.isSetterAbstract)) {
				basePart.setIsSetterAbstract(property.getIsSetterAbstract());
			}
			if (isAccessible(StructureViewsRepository.Property.Properties.owningClass)) {
				// init part
				owningClassSettings = new EObjectFlatComboSettings(property, StructurePackage.eINSTANCE.getProperty_OwningClass());
				basePart.initOwningClass(owningClassSettings);
				// set the button mode
				basePart.setOwningClassButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			
			
			
			basePart.addFilterToOpposite(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof AbstractProperty); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for opposite
			// End of user code
			
			
			
			
			
			
			
			
			basePart.addFilterToOwningClass(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ClassDefinition); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for owningClass
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
		if (editorKey == StructureViewsRepository.Property.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.type) {
			return StructurePackage.eINSTANCE.getTypedElement_Type();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isOrdered) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isUnique) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.lower) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Lower();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.upper) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Upper();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.opposite) {
			return StructurePackage.eINSTANCE.getProperty_Opposite();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isReadOnly) {
			return StructurePackage.eINSTANCE.getProperty_IsReadOnly();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.default_) {
			return StructurePackage.eINSTANCE.getProperty_Default();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isComposite) {
			return StructurePackage.eINSTANCE.getProperty_IsComposite();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isDerived) {
			return StructurePackage.eINSTANCE.getProperty_IsDerived();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isID) {
			return StructurePackage.eINSTANCE.getProperty_IsID();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isGetterAbstract) {
			return StructurePackage.eINSTANCE.getProperty_IsGetterAbstract();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.isSetterAbstract) {
			return StructurePackage.eINSTANCE.getProperty_IsSetterAbstract();
		}
		if (editorKey == StructureViewsRepository.Property.Properties.owningClass) {
			return StructurePackage.eINSTANCE.getProperty_OwningClass();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Property property = (Property)semanticObject;
		if (StructureViewsRepository.Property.Properties.kTag == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Property.Properties.kType == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Property.Properties.name == event.getAffectedEditor()) {
			property.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.Property.Properties.type == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Property.Properties.isOrdered == event.getAffectedEditor()) {
			property.setIsOrdered((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.isUnique == event.getAffectedEditor()) {
			property.setIsUnique((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.lower == event.getAffectedEditor()) {
			property.setLower((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getInteger(), (String)event.getNewValue())));
		}
		if (StructureViewsRepository.Property.Properties.upper == event.getAffectedEditor()) {
			property.setUpper((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getUnlimitedNatural(), (String)event.getNewValue())));
		}
		if (StructureViewsRepository.Property.Properties.opposite == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				oppositeSettings.setToReference((AbstractProperty)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, oppositeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (StructureViewsRepository.Property.Properties.isReadOnly == event.getAffectedEditor()) {
			property.setIsReadOnly((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.default_ == event.getAffectedEditor()) {
			property.setDefault((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.Property.Properties.isComposite == event.getAffectedEditor()) {
			property.setIsComposite((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.isDerived == event.getAffectedEditor()) {
			property.setIsDerived((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.isID == event.getAffectedEditor()) {
			property.setIsID((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.isGetterAbstract == event.getAffectedEditor()) {
			property.setIsGetterAbstract((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.isSetterAbstract == event.getAffectedEditor()) {
			property.setIsSetterAbstract((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Property.Properties.owningClass == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				owningClassSettings.setToReference((ClassDefinition)event.getNewValue());
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
				owningClassSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			PropertyPropertiesEditionPart basePart = (PropertyPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Property.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getTypedElement_Type().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.type))
				basePart.setType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isOrdered))
				basePart.setIsOrdered((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isUnique))
				basePart.setIsUnique((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Lower().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.lower)) {
				if (msg.getNewValue() != null) {
					basePart.setLower(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), msg.getNewValue()));
				} else {
					basePart.setLower("");
				}
			}
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Upper().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.upper)) {
				if (msg.getNewValue() != null) {
					basePart.setUpper(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), msg.getNewValue()));
				} else {
					basePart.setUpper("");
				}
			}
			if (StructurePackage.eINSTANCE.getProperty_Opposite().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.opposite))
				basePart.setOpposite((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getProperty_IsReadOnly().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isReadOnly))
				basePart.setIsReadOnly((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_Default().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.default_)) {
				if (msg.getNewValue() != null) {
					basePart.setDefault_(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDefault_("");
				}
			}
			if (StructurePackage.eINSTANCE.getProperty_IsComposite().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isComposite))
				basePart.setIsComposite((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_IsDerived().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isDerived))
				basePart.setIsDerived((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_IsID().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isID))
				basePart.setIsID((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_IsGetterAbstract().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isGetterAbstract))
				basePart.setIsGetterAbstract((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_IsSetterAbstract().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.isSetterAbstract))
				basePart.setIsSetterAbstract((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getProperty_OwningClass().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Property.Properties.owningClass))
				basePart.setOwningClass((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == StructureViewsRepository.Property.Properties.kType || key == StructureViewsRepository.Property.Properties.name;
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
				if (StructureViewsRepository.Property.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isOrdered == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isUnique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.lower == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.upper == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isReadOnly == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsReadOnly().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsReadOnly().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.default_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_Default().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_Default().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isComposite == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsComposite().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsComposite().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isDerived == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsDerived().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsDerived().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isID == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsID().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isGetterAbstract == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsGetterAbstract().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsGetterAbstract().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Property.Properties.isSetterAbstract == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getProperty_IsSetterAbstract().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getProperty_IsSetterAbstract().getEAttributeType(), newValue);
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
