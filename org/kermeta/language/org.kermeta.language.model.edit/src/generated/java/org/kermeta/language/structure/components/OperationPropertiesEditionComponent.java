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
import org.kermeta.language.structure.AbstractOperation;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeVariable;
import org.kermeta.language.structure.parts.OperationPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class OperationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for raisedException ReferencesTable
	 */
	private	ReferencesTableSettings raisedExceptionSettings;
	
	/**
	 * Settings for superOperation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings superOperationSettings;
	
	/**
	 * Settings for owningClass EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings owningClassSettings;
	
	/**
	 * Settings for typeParameter ReferencesTable
	 */
	private	ReferencesTableSettings typeParameterSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OperationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject operation, String editing_mode) {
		super(editingContext, operation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = StructureViewsRepository.class;
		partKey = StructureViewsRepository.Operation.class;
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
			final Operation operation = (Operation)elt;
			final OperationPropertiesEditionPart basePart = (OperationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(StructureViewsRepository.Operation.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(operation, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(operation, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (operation.getName() != null && isAccessible(StructureViewsRepository.Operation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), operation.getName()));
			
			if (isAccessible(StructureViewsRepository.Operation.Properties.type)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(operation, StructurePackage.eINSTANCE.getTypedElement_Type());
				basePart.initType(typeSettings);
				// set the button mode
				basePart.setTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.isOrdered)) {
				basePart.setIsOrdered(operation.getIsOrdered());
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.isUnique)) {
				basePart.setIsUnique(operation.getIsUnique());
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.lower)) {
				basePart.setLower(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), operation.getLower()));
			}
			
			if (isAccessible(StructureViewsRepository.Operation.Properties.upper)) {
				basePart.setUpper(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), operation.getUpper()));
			}
			
			if (isAccessible(StructureViewsRepository.Operation.Properties.isAbstract)) {
				basePart.setIsAbstract(operation.getIsAbstract());
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.raisedException)) {
				raisedExceptionSettings = new ReferencesTableSettings(operation, StructurePackage.eINSTANCE.getOperation_RaisedException());
				basePart.initRaisedException(raisedExceptionSettings);
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.superOperation)) {
				// init part
				superOperationSettings = new EObjectFlatComboSettings(operation, StructurePackage.eINSTANCE.getOperation_SuperOperation());
				basePart.initSuperOperation(superOperationSettings);
				// set the button mode
				basePart.setSuperOperationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.owningClass)) {
				// init part
				owningClassSettings = new EObjectFlatComboSettings(operation, StructurePackage.eINSTANCE.getOperation_OwningClass());
				basePart.initOwningClass(owningClassSettings);
				// set the button mode
				basePart.setOwningClassButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(StructureViewsRepository.Operation.Properties.typeParameter)) {
				typeParameterSettings = new ReferencesTableSettings(operation, StructurePackage.eINSTANCE.getOperation_TypeParameter());
				basePart.initTypeParameter(typeParameterSettings);
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
			
			
			
			
			
			
			basePart.addFilterToRaisedException(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRaisedExceptionTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRaisedException(new EObjectFilter(StructurePackage.eINSTANCE.getType()));
			// Start of user code for additional businessfilters for raisedException
			// End of user code
			
			basePart.addFilterToSuperOperation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof AbstractOperation); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for superOperation
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
			
			basePart.addFilterToTypeParameter(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInTypeParameterTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToTypeParameter(new EObjectFilter(StructurePackage.eINSTANCE.getTypeVariable()));
			// Start of user code for additional businessfilters for typeParameter
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
		if (editorKey == StructureViewsRepository.Operation.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.name) {
			return StructurePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.type) {
			return StructurePackage.eINSTANCE.getTypedElement_Type();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.isOrdered) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.isUnique) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.lower) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Lower();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.upper) {
			return StructurePackage.eINSTANCE.getMultiplicityElement_Upper();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.isAbstract) {
			return StructurePackage.eINSTANCE.getOperation_IsAbstract();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.raisedException) {
			return StructurePackage.eINSTANCE.getOperation_RaisedException();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.superOperation) {
			return StructurePackage.eINSTANCE.getOperation_SuperOperation();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.owningClass) {
			return StructurePackage.eINSTANCE.getOperation_OwningClass();
		}
		if (editorKey == StructureViewsRepository.Operation.Properties.typeParameter) {
			return StructurePackage.eINSTANCE.getOperation_TypeParameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Operation operation = (Operation)semanticObject;
		if (StructureViewsRepository.Operation.Properties.kTag == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Operation.Properties.kType == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Operation.Properties.name == event.getAffectedEditor()) {
			operation.setName((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (StructureViewsRepository.Operation.Properties.type == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Operation.Properties.isOrdered == event.getAffectedEditor()) {
			operation.setIsOrdered((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Operation.Properties.isUnique == event.getAffectedEditor()) {
			operation.setIsUnique((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Operation.Properties.lower == event.getAffectedEditor()) {
			operation.setLower((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getInteger(), (String)event.getNewValue())));
		}
		if (StructureViewsRepository.Operation.Properties.upper == event.getAffectedEditor()) {
			operation.setUpper((EEFConverterUtil.createIntFromString(StructurePackage.eINSTANCE.getUnlimitedNatural(), (String)event.getNewValue())));
		}
		if (StructureViewsRepository.Operation.Properties.isAbstract == event.getAffectedEditor()) {
			operation.setIsAbstract((Boolean)event.getNewValue());
		}
		if (StructureViewsRepository.Operation.Properties.raisedException == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Type) {
					raisedExceptionSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				raisedExceptionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				raisedExceptionSettings.move(event.getNewIndex(), (Type) event.getNewValue());
			}
		}
		if (StructureViewsRepository.Operation.Properties.superOperation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				superOperationSettings.setToReference((AbstractOperation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, superOperationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (StructureViewsRepository.Operation.Properties.owningClass == event.getAffectedEditor()) {
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
		if (StructureViewsRepository.Operation.Properties.typeParameter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TypeVariable) {
					typeParameterSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				typeParameterSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				typeParameterSettings.move(event.getNewIndex(), (TypeVariable) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			OperationPropertiesEditionPart basePart = (OperationPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Operation.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (StructurePackage.eINSTANCE.getTypedElement_Type().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.type))
				basePart.setType((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.isOrdered))
				basePart.setIsOrdered((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.isUnique))
				basePart.setIsUnique((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Lower().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.lower)) {
				if (msg.getNewValue() != null) {
					basePart.setLower(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getInteger(), msg.getNewValue()));
				} else {
					basePart.setLower("");
				}
			}
			if (StructurePackage.eINSTANCE.getMultiplicityElement_Upper().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.upper)) {
				if (msg.getNewValue() != null) {
					basePart.setUpper(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getUnlimitedNatural(), msg.getNewValue()));
				} else {
					basePart.setUpper("");
				}
			}
			if (StructurePackage.eINSTANCE.getOperation_IsAbstract().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.isAbstract))
				basePart.setIsAbstract((Boolean)msg.getNewValue());
			
			if (StructurePackage.eINSTANCE.getOperation_RaisedException().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Operation.Properties.raisedException))
				basePart.updateRaisedException();
			if (StructurePackage.eINSTANCE.getOperation_SuperOperation().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.superOperation))
				basePart.setSuperOperation((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getOperation_OwningClass().equals(msg.getFeature()) && basePart != null && isAccessible(StructureViewsRepository.Operation.Properties.owningClass))
				basePart.setOwningClass((EObject)msg.getNewValue());
			if (StructurePackage.eINSTANCE.getOperation_TypeParameter().equals(msg.getFeature())  && isAccessible(StructureViewsRepository.Operation.Properties.typeParameter))
				basePart.updateTypeParameter();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == StructureViewsRepository.Operation.Properties.kType || key == StructureViewsRepository.Operation.Properties.name || key == StructureViewsRepository.Operation.Properties.isAbstract;
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
				if (StructureViewsRepository.Operation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Operation.Properties.isOrdered == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsOrdered().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Operation.Properties.isUnique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_IsUnique().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Operation.Properties.lower == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Lower().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Operation.Properties.upper == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getMultiplicityElement_Upper().getEAttributeType(), newValue);
				}
				if (StructureViewsRepository.Operation.Properties.isAbstract == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getOperation_IsAbstract().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(StructurePackage.eINSTANCE.getOperation_IsAbstract().getEAttributeType(), newValue);
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
