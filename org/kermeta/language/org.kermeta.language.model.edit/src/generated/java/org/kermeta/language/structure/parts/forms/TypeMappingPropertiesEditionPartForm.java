/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class TypeMappingPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TypeMappingPropertiesEditionPart {

		protected ReferencesTable kTag;
		protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected EObjectFlatComboViewer targetType;
	protected EObjectFlatComboViewer sourceType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TypeMappingPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence typeMappingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = typeMappingStep.addStep(StructureViewsRepository.TypeMapping.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.TypeMapping.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.TypeMapping.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.TypeMapping.Properties.targetType);
		propertiesStep.addStep(StructureViewsRepository.TypeMapping.Properties.sourceType);
		
		
		composer = new PartComposer(typeMappingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.TypeMapping.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.TypeMapping.Properties.kTag) {
					return createKTagReferencesTable(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.TypeMapping.Properties.kType) {
					return createKTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.TypeMapping.Properties.targetType) {
					return createTargetTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.TypeMapping.Properties.sourceType) {
					return createSourceTypeFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(StructureMessages.TypeMappingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createKTagReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.kTag = new ReferencesTable(StructureMessages.TypeMappingPropertiesEditionPart_KTagLabel, new ReferencesTableListener	() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.TypeMapping.Properties.kTag, StructureViewsRepository.FORM_KIND));
		this.kTag.createControls(parent, widgetFactory);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.TypeMapping.Properties.kTag);
		kTag.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addKTag() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(kTag.getInput(), kTagFilters, kTagBusinessFilters,
		"kTag", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.kTag,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				kTag.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveKTag(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void editKTag(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				kTag.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createKTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.TypeMappingPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.kType, StructureViewsRepository.FORM_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.kType, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(kType);
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.kType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		kType.setID(StructureViewsRepository.TypeMapping.Properties.kType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.TypeMapping.Properties.kType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.TypeMappingPropertiesEditionPart_TargetTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.targetType, StructureViewsRepository.FORM_KIND));
		targetType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.targetType, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetType);
		targetType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetTypeData = new GridData(GridData.FILL_HORIZONTAL);
		targetType.setLayoutData(targetTypeData);
		targetType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.targetType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetType()));
			}

		});
		targetType.setID(StructureViewsRepository.TypeMapping.Properties.targetType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.TypeMapping.Properties.targetType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.TypeMappingPropertiesEditionPart_SourceTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.sourceType, StructureViewsRepository.FORM_KIND));
		sourceType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.TypeMapping.Properties.sourceType, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourceType);
		sourceType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceTypeData = new GridData(GridData.FILL_HORIZONTAL);
		sourceType.setLayoutData(sourceTypeData);
		sourceType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TypeMappingPropertiesEditionPartForm.this, StructureViewsRepository.TypeMapping.Properties.sourceType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourceType()));
			}

		});
		sourceType.setID(StructureViewsRepository.TypeMapping.Properties.sourceType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.TypeMapping.Properties.sourceType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initKTag(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		kTag.setContentProvider(contentProvider);
		kTag.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#getKType()
	 * 
	 */
	public EObject getKType() {
		if (kType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) kType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#initKType(EObjectFlatComboSettings)
	 */
	public void initKType(EObjectFlatComboSettings settings) {
		kType.setInput(settings);
		if (current != null) {
			kType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setKType(EObject newValue)
	 * 
	 */
	public void setKType(EObject newValue) {
		if (newValue != null) {
			kType.setSelection(new StructuredSelection(newValue));
		} else {
			kType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#getTargetType()
	 * 
	 */
	public EObject getTargetType() {
		if (targetType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#initTargetType(EObjectFlatComboSettings)
	 */
	public void initTargetType(EObjectFlatComboSettings settings) {
		targetType.setInput(settings);
		if (current != null) {
			targetType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setTargetType(EObject newValue)
	 * 
	 */
	public void setTargetType(EObject newValue) {
		if (newValue != null) {
			targetType.setSelection(new StructuredSelection(newValue));
		} else {
			targetType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setTargetTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetTypeButtonMode(ButtonsModeEnum newValue) {
		targetType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addFilterTargetType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetType(ViewerFilter filter) {
		targetType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addBusinessFilterTargetType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetType(ViewerFilter filter) {
		targetType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#getSourceType()
	 * 
	 */
	public EObject getSourceType() {
		if (sourceType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourceType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#initSourceType(EObjectFlatComboSettings)
	 */
	public void initSourceType(EObjectFlatComboSettings settings) {
		sourceType.setInput(settings);
		if (current != null) {
			sourceType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setSourceType(EObject newValue)
	 * 
	 */
	public void setSourceType(EObject newValue) {
		if (newValue != null) {
			sourceType.setSelection(new StructuredSelection(newValue));
		} else {
			sourceType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#setSourceTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceTypeButtonMode(ButtonsModeEnum newValue) {
		sourceType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addFilterSourceType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceType(ViewerFilter filter) {
		sourceType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.TypeMappingPropertiesEditionPart#addBusinessFilterSourceType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceType(ViewerFilter filter) {
		sourceType.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.TypeMapping_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
