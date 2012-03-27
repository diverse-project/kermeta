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
import org.kermeta.language.behavior.JavaStaticCall;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.JavaStaticCallPropertiesEditionPart;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class JavaStaticCallPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public JavaStaticCallPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject javaStaticCall, String editing_mode) {
		super(editingContext, javaStaticCall, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BehaviorViewsRepository.class;
		partKey = BehaviorViewsRepository.JavaStaticCall.class;
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
			final JavaStaticCall javaStaticCall = (JavaStaticCall)elt;
			final JavaStaticCallPropertiesEditionPart basePart = (JavaStaticCallPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.kTag)) {
				kTagSettings = new ReferencesTableSettings(javaStaticCall, StructurePackage.eINSTANCE.getKermetaModelElement_KTag());
				basePart.initKTag(kTagSettings);
			}
			if (isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.kType)) {
				// init part
				kTypeSettings = new EObjectFlatComboSettings(javaStaticCall, StructurePackage.eINSTANCE.getKermetaModelElement_KType());
				basePart.initKType(kTypeSettings);
				// set the button mode
				basePart.setKTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.staticType)) {
				// init part
				staticTypeSettings = new EObjectFlatComboSettings(javaStaticCall, BehaviorPackage.eINSTANCE.getExpression_StaticType());
				basePart.initStaticType(staticTypeSettings);
				// set the button mode
				basePart.setStaticTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (javaStaticCall.getJclass() != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.jclass))
				basePart.setJclass(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), javaStaticCall.getJclass()));
			
			if (javaStaticCall.getJmethod() != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.jmethod))
				basePart.setJmethod(EEFConverterUtil.convertToString(StructurePackage.eINSTANCE.getString(), javaStaticCall.getJmethod()));
			
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
		if (editorKey == BehaviorViewsRepository.JavaStaticCall.Properties.kTag) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KTag();
		}
		if (editorKey == BehaviorViewsRepository.JavaStaticCall.Properties.kType) {
			return StructurePackage.eINSTANCE.getKermetaModelElement_KType();
		}
		if (editorKey == BehaviorViewsRepository.JavaStaticCall.Properties.staticType) {
			return BehaviorPackage.eINSTANCE.getExpression_StaticType();
		}
		if (editorKey == BehaviorViewsRepository.JavaStaticCall.Properties.jclass) {
			return BehaviorPackage.eINSTANCE.getJavaStaticCall_Jclass();
		}
		if (editorKey == BehaviorViewsRepository.JavaStaticCall.Properties.jmethod) {
			return BehaviorPackage.eINSTANCE.getJavaStaticCall_Jmethod();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		JavaStaticCall javaStaticCall = (JavaStaticCall)semanticObject;
		if (BehaviorViewsRepository.JavaStaticCall.Properties.kTag == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.JavaStaticCall.Properties.kType == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.JavaStaticCall.Properties.staticType == event.getAffectedEditor()) {
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
		if (BehaviorViewsRepository.JavaStaticCall.Properties.jclass == event.getAffectedEditor()) {
			javaStaticCall.setJclass((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (BehaviorViewsRepository.JavaStaticCall.Properties.jmethod == event.getAffectedEditor()) {
			javaStaticCall.setJmethod((java.lang.String)EEFConverterUtil.createFromString(StructurePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			JavaStaticCallPropertiesEditionPart basePart = (JavaStaticCallPropertiesEditionPart)editingPart;
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KTag().equals(msg.getFeature())  && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.kTag))
				basePart.updateKTag();
			if (StructurePackage.eINSTANCE.getKermetaModelElement_KType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.kType))
				basePart.setKType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getExpression_StaticType().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.staticType))
				basePart.setStaticType((EObject)msg.getNewValue());
			if (BehaviorPackage.eINSTANCE.getJavaStaticCall_Jclass().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.jclass)) {
				if (msg.getNewValue() != null) {
					basePart.setJclass(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setJclass("");
				}
			}
			if (BehaviorPackage.eINSTANCE.getJavaStaticCall_Jmethod().equals(msg.getFeature()) && basePart != null && isAccessible(BehaviorViewsRepository.JavaStaticCall.Properties.jmethod)) {
				if (msg.getNewValue() != null) {
					basePart.setJmethod(EcoreUtil.convertToString(StructurePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setJmethod("");
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
		return key == BehaviorViewsRepository.JavaStaticCall.Properties.kType;
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
				if (BehaviorViewsRepository.JavaStaticCall.Properties.jclass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getJavaStaticCall_Jclass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getJavaStaticCall_Jclass().getEAttributeType(), newValue);
				}
				if (BehaviorViewsRepository.JavaStaticCall.Properties.jmethod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BehaviorPackage.eINSTANCE.getJavaStaticCall_Jmethod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BehaviorPackage.eINSTANCE.getJavaStaticCall_Jmethod().getEAttributeType(), newValue);
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
