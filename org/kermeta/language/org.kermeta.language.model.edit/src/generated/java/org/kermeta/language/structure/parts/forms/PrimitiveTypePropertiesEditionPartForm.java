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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class PrimitiveTypePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PrimitiveTypePropertiesEditionPart {

		protected ReferencesTable kTag;
		protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected EObjectFlatComboViewer typeContainer;
	protected Text name;
		protected ReferencesTable superType;
		protected List<ViewerFilter> superTypeBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> superTypeFilters = new ArrayList<ViewerFilter>();
	protected Button isAspect;
	protected EObjectFlatComboViewer instanceType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PrimitiveTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence primitiveTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = primitiveTypeStep.addStep(StructureViewsRepository.PrimitiveType.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.typeContainer);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.superType);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.isAspect);
		propertiesStep.addStep(StructureViewsRepository.PrimitiveType.Properties.instanceType);
		
		
		composer = new PartComposer(primitiveTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.PrimitiveType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.kTag) {
					return createKTagReferencesTable(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.kType) {
					return createKTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.typeContainer) {
					return createTypeContainerFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.superType) {
					return createSuperTypeReferencesTable(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.isAspect) {
					return createIsAspectCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.PrimitiveType.Properties.instanceType) {
					return createInstanceTypeFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(StructureMessages.PrimitiveTypePropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.PrimitiveTypePropertiesEditionPart_KTagLabel, new ReferencesTableListener	() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.kTag, StructureViewsRepository.FORM_KIND));
		this.kTag.createControls(parent, widgetFactory);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.PrimitiveType.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PrimitiveTypePropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.kType, StructureViewsRepository.FORM_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.kType, StructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.kType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		kType.setID(StructureViewsRepository.PrimitiveType.Properties.kType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.kType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTypeContainerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PrimitiveTypePropertiesEditionPart_TypeContainerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.typeContainer, StructureViewsRepository.FORM_KIND));
		typeContainer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.typeContainer, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(typeContainer);
		typeContainer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData typeContainerData = new GridData(GridData.FILL_HORIZONTAL);
		typeContainer.setLayoutData(typeContainerData);
		typeContainer.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.typeContainer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeContainer()));
			}

		});
		typeContainer.setID(StructureViewsRepository.PrimitiveType.Properties.typeContainer);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.typeContainer, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PrimitiveTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.name, StructureViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, StructureViewsRepository.PrimitiveType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.name, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSuperTypeReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.superType = new ReferencesTable(StructureMessages.PrimitiveTypePropertiesEditionPart_SuperTypeLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSuperType(); }
			public void handleEdit(EObject element) { editSuperType(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuperType(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuperType(element); }
			public void navigateTo(EObject element) { }
		});
		this.superType.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.superType, StructureViewsRepository.FORM_KIND));
		this.superType.createControls(parent, widgetFactory);
		this.superType.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.superType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData superTypeData = new GridData(GridData.FILL_HORIZONTAL);
		superTypeData.horizontalSpan = 3;
		this.superType.setLayoutData(superTypeData);
		this.superType.disableMove();
		superType.setID(StructureViewsRepository.PrimitiveType.Properties.superType);
		superType.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuperType() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(superType.getInput(), superTypeFilters, superTypeBusinessFilters,
		"superType", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.superType,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				superType.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuperType(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.superType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		superType.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuperType(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.superType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		superType.refresh();
	}

	/**
	 * 
	 */
	protected void editSuperType(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				superType.refresh();
			}
		}
	}

	
	protected Composite createIsAspectCheckbox(FormToolkit widgetFactory, Composite parent) {
		isAspect = widgetFactory.createButton(parent, StructureMessages.PrimitiveTypePropertiesEditionPart_IsAspectLabel, SWT.CHECK);
		isAspect.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.isAspect, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAspect.getSelection())));
			}

		});
		GridData isAspectData = new GridData(GridData.FILL_HORIZONTAL);
		isAspectData.horizontalSpan = 2;
		isAspect.setLayoutData(isAspectData);
		EditingUtils.setID(isAspect, StructureViewsRepository.PrimitiveType.Properties.isAspect);
		EditingUtils.setEEFtype(isAspect, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.isAspect, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInstanceTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PrimitiveTypePropertiesEditionPart_InstanceTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.instanceType, StructureViewsRepository.FORM_KIND));
		instanceType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.PrimitiveType.Properties.instanceType, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(instanceType);
		instanceType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData instanceTypeData = new GridData(GridData.FILL_HORIZONTAL);
		instanceType.setLayoutData(instanceTypeData);
		instanceType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrimitiveTypePropertiesEditionPartForm.this, StructureViewsRepository.PrimitiveType.Properties.instanceType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInstanceType()));
			}

		});
		instanceType.setID(StructureViewsRepository.PrimitiveType.Properties.instanceType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.PrimitiveType.Properties.instanceType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#getTypeContainer()
	 * 
	 */
	public EObject getTypeContainer() {
		if (typeContainer.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) typeContainer.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#initTypeContainer(EObjectFlatComboSettings)
	 */
	public void initTypeContainer(EObjectFlatComboSettings settings) {
		typeContainer.setInput(settings);
		if (current != null) {
			typeContainer.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setTypeContainer(EObject newValue)
	 * 
	 */
	public void setTypeContainer(EObject newValue) {
		if (newValue != null) {
			typeContainer.setSelection(new StructuredSelection(newValue));
		} else {
			typeContainer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setTypeContainerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeContainerButtonMode(ButtonsModeEnum newValue) {
		typeContainer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addFilterTypeContainer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeContainer(ViewerFilter filter) {
		typeContainer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addBusinessFilterTypeContainer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeContainer(ViewerFilter filter) {
		typeContainer.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#initSuperType(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuperType(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		superType.setContentProvider(contentProvider);
		superType.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#updateSuperType()
	 * 
	 */
	public void updateSuperType() {
	superType.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addFilterSuperType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuperType(ViewerFilter filter) {
		superTypeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addBusinessFilterSuperType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuperType(ViewerFilter filter) {
		superTypeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#isContainedInSuperTypeTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuperTypeTable(EObject element) {
		return ((ReferencesTableSettings)superType.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#getIsAspect()
	 * 
	 */
	public Boolean getIsAspect() {
		return Boolean.valueOf(isAspect.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setIsAspect(Boolean newValue)
	 * 
	 */
	public void setIsAspect(Boolean newValue) {
		if (newValue != null) {
			isAspect.setSelection(newValue.booleanValue());
		} else {
			isAspect.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#getInstanceType()
	 * 
	 */
	public EObject getInstanceType() {
		if (instanceType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) instanceType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#initInstanceType(EObjectFlatComboSettings)
	 */
	public void initInstanceType(EObjectFlatComboSettings settings) {
		instanceType.setInput(settings);
		if (current != null) {
			instanceType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setInstanceType(EObject newValue)
	 * 
	 */
	public void setInstanceType(EObject newValue) {
		if (newValue != null) {
			instanceType.setSelection(new StructuredSelection(newValue));
		} else {
			instanceType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#setInstanceTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInstanceTypeButtonMode(ButtonsModeEnum newValue) {
		instanceType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addFilterInstanceType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInstanceType(ViewerFilter filter) {
		instanceType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PrimitiveTypePropertiesEditionPart#addBusinessFilterInstanceType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInstanceType(ViewerFilter filter) {
		instanceType.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.PrimitiveType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
