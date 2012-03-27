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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class UnresolvedOperationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, UnresolvedOperationPropertiesEditionPart {

		protected ReferencesTable kTag;
		protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected Text operationIdentifier;
	protected EObjectFlatComboViewer from;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public UnresolvedOperationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence unresolvedOperationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = unresolvedOperationStep.addStep(StructureViewsRepository.UnresolvedOperation.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.UnresolvedOperation.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.UnresolvedOperation.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier);
		propertiesStep.addStep(StructureViewsRepository.UnresolvedOperation.Properties.from);
		
		
		composer = new PartComposer(unresolvedOperationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.UnresolvedOperation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.UnresolvedOperation.Properties.kTag) {
					return createKTagReferencesTable(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.UnresolvedOperation.Properties.kType) {
					return createKTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier) {
					return 		createOperationIdentifierText(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.UnresolvedOperation.Properties.from) {
					return createFromFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(StructureMessages.UnresolvedOperationPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.UnresolvedOperationPropertiesEditionPart_KTagLabel, new ReferencesTableListener	() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.UnresolvedOperation.Properties.kTag, StructureViewsRepository.FORM_KIND));
		this.kTag.createControls(parent, widgetFactory);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.UnresolvedOperation.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.UnresolvedOperationPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.UnresolvedOperation.Properties.kType, StructureViewsRepository.FORM_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.UnresolvedOperation.Properties.kType, StructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.kType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		kType.setID(StructureViewsRepository.UnresolvedOperation.Properties.kType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.UnresolvedOperation.Properties.kType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOperationIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.UnresolvedOperationPropertiesEditionPart_OperationIdentifierLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier, StructureViewsRepository.FORM_KIND));
		operationIdentifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		operationIdentifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData operationIdentifierData = new GridData(GridData.FILL_HORIZONTAL);
		operationIdentifier.setLayoutData(operationIdentifierData);
		operationIdentifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationIdentifier.getText()));
			}
		});
		operationIdentifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationIdentifier.getText()));
				}
			}
		});
		EditingUtils.setID(operationIdentifier, StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier);
		EditingUtils.setEEFtype(operationIdentifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.UnresolvedOperation.Properties.operationIdentifier, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFromFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.UnresolvedOperationPropertiesEditionPart_FromLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.UnresolvedOperation.Properties.from, StructureViewsRepository.FORM_KIND));
		from = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.UnresolvedOperation.Properties.from, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(from);
		from.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fromData = new GridData(GridData.FILL_HORIZONTAL);
		from.setLayoutData(fromData);
		from.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedOperationPropertiesEditionPartForm.this, StructureViewsRepository.UnresolvedOperation.Properties.from, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFrom()));
			}

		});
		from.setID(StructureViewsRepository.UnresolvedOperation.Properties.from);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.UnresolvedOperation.Properties.from, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#getOperationIdentifier()
	 * 
	 */
	public String getOperationIdentifier() {
		return operationIdentifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#setOperationIdentifier(String newValue)
	 * 
	 */
	public void setOperationIdentifier(String newValue) {
		if (newValue != null) {
			operationIdentifier.setText(newValue);
		} else {
			operationIdentifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#getFrom()
	 * 
	 */
	public EObject getFrom() {
		if (from.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) from.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#initFrom(EObjectFlatComboSettings)
	 */
	public void initFrom(EObjectFlatComboSettings settings) {
		from.setInput(settings);
		if (current != null) {
			from.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#setFrom(EObject newValue)
	 * 
	 */
	public void setFrom(EObject newValue) {
		if (newValue != null) {
			from.setSelection(new StructuredSelection(newValue));
		} else {
			from.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#setFromButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromButtonMode(ButtonsModeEnum newValue) {
		from.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFrom(ViewerFilter filter) {
		from.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.UnresolvedOperationPropertiesEditionPart#addBusinessFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFrom(ViewerFilter filter) {
		from.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.UnresolvedOperation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
