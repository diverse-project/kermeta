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
import org.kermeta.language.structure.parts.PropertyPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class PropertyPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PropertyPropertiesEditionPart {

		protected ReferencesTable kTag;
		protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected Text name;
	protected EObjectFlatComboViewer type;
	protected Button isOrdered;
	protected Button isUnique;
	protected Text lower;
	protected Text upper;
	protected EObjectFlatComboViewer opposite;
	protected Button isReadOnly;
	protected Text default_;
	protected Button isComposite;
	protected Button isDerived;
	protected Button isID;
	protected Button isGetterAbstract;
	protected Button isSetterAbstract;
	protected EObjectFlatComboViewer owningClass;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PropertyPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence propertyStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = propertyStep.addStep(StructureViewsRepository.Property.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.type);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isOrdered);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isUnique);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.lower);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.upper);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.opposite);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isReadOnly);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.default_);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isComposite);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isDerived);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isID);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isGetterAbstract);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.isSetterAbstract);
		propertiesStep.addStep(StructureViewsRepository.Property.Properties.owningClass);
		
		
		composer = new PartComposer(propertyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.Property.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.kTag) {
					return createKTagReferencesTable(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.kType) {
					return createKTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.Property.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.type) {
					return createTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.Property.Properties.isOrdered) {
					return createIsOrderedCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isUnique) {
					return createIsUniqueCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.lower) {
					return 		createLowerText(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.upper) {
					return 		createUpperText(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.opposite) {
					return createOppositeFlatComboViewer(parent, widgetFactory);
				}
				if (key == StructureViewsRepository.Property.Properties.isReadOnly) {
					return createIsReadOnlyCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.default_) {
					return 		createDefault_Text(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isComposite) {
					return createIsCompositeCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isDerived) {
					return createIsDerivedCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isID) {
					return createIsIDCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isGetterAbstract) {
					return createIsGetterAbstractCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.isSetterAbstract) {
					return createIsSetterAbstractCheckbox(widgetFactory, parent);
				}
				if (key == StructureViewsRepository.Property.Properties.owningClass) {
					return createOwningClassFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(StructureMessages.PropertyPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.PropertyPropertiesEditionPart_KTagLabel, new ReferencesTableListener	() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.kTag, StructureViewsRepository.FORM_KIND));
		this.kTag.createControls(parent, widgetFactory);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.Property.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.kType, StructureViewsRepository.FORM_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.kType, StructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.kType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		kType.setID(StructureViewsRepository.Property.Properties.kType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.kType, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.name, StructureViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, StructureViewsRepository.Property.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.name, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.type, StructureViewsRepository.FORM_KIND));
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.type, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(type);
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(StructureViewsRepository.Property.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.type, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOrderedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isOrdered = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsOrderedLabel, SWT.CHECK);
		isOrdered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isOrdered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOrdered.getSelection())));
			}

		});
		GridData isOrderedData = new GridData(GridData.FILL_HORIZONTAL);
		isOrderedData.horizontalSpan = 2;
		isOrdered.setLayoutData(isOrderedData);
		EditingUtils.setID(isOrdered, StructureViewsRepository.Property.Properties.isOrdered);
		EditingUtils.setEEFtype(isOrdered, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isOrdered, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsUniqueCheckbox(FormToolkit widgetFactory, Composite parent) {
		isUnique = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsUniqueLabel, SWT.CHECK);
		isUnique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isUnique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isUnique.getSelection())));
			}

		});
		GridData isUniqueData = new GridData(GridData.FILL_HORIZONTAL);
		isUniqueData.horizontalSpan = 2;
		isUnique.setLayoutData(isUniqueData);
		EditingUtils.setID(isUnique, StructureViewsRepository.Property.Properties.isUnique);
		EditingUtils.setEEFtype(isUnique, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isUnique, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLowerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_LowerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.lower, StructureViewsRepository.FORM_KIND));
		lower = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		lower.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData lowerData = new GridData(GridData.FILL_HORIZONTAL);
		lower.setLayoutData(lowerData);
		lower.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
			}
		});
		lower.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
				}
			}
		});
		EditingUtils.setID(lower, StructureViewsRepository.Property.Properties.lower);
		EditingUtils.setEEFtype(lower, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.lower, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUpperText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_UpperLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.upper, StructureViewsRepository.FORM_KIND));
		upper = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		upper.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData upperData = new GridData(GridData.FILL_HORIZONTAL);
		upper.setLayoutData(upperData);
		upper.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
			}
		});
		upper.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
				}
			}
		});
		EditingUtils.setID(upper, StructureViewsRepository.Property.Properties.upper);
		EditingUtils.setEEFtype(upper, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.upper, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOppositeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_OppositeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.opposite, StructureViewsRepository.FORM_KIND));
		opposite = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.opposite, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(opposite);
		opposite.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData oppositeData = new GridData(GridData.FILL_HORIZONTAL);
		opposite.setLayoutData(oppositeData);
		opposite.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.opposite, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOpposite()));
			}

		});
		opposite.setID(StructureViewsRepository.Property.Properties.opposite);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.opposite, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsReadOnlyCheckbox(FormToolkit widgetFactory, Composite parent) {
		isReadOnly = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsReadOnlyLabel, SWT.CHECK);
		isReadOnly.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isReadOnly, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isReadOnly.getSelection())));
			}

		});
		GridData isReadOnlyData = new GridData(GridData.FILL_HORIZONTAL);
		isReadOnlyData.horizontalSpan = 2;
		isReadOnly.setLayoutData(isReadOnlyData);
		EditingUtils.setID(isReadOnly, StructureViewsRepository.Property.Properties.isReadOnly);
		EditingUtils.setEEFtype(isReadOnly, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isReadOnly, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefault_Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_Default_Label, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.default_, StructureViewsRepository.FORM_KIND));
		default_ = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		default_.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData default_Data = new GridData(GridData.FILL_HORIZONTAL);
		default_.setLayoutData(default_Data);
		default_.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.default_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, default_.getText()));
			}
		});
		default_.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.default_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, default_.getText()));
				}
			}
		});
		EditingUtils.setID(default_, StructureViewsRepository.Property.Properties.default_);
		EditingUtils.setEEFtype(default_, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.default_, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsCompositeCheckbox(FormToolkit widgetFactory, Composite parent) {
		isComposite = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsCompositeLabel, SWT.CHECK);
		isComposite.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isComposite, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isComposite.getSelection())));
			}

		});
		GridData isCompositeData = new GridData(GridData.FILL_HORIZONTAL);
		isCompositeData.horizontalSpan = 2;
		isComposite.setLayoutData(isCompositeData);
		EditingUtils.setID(isComposite, StructureViewsRepository.Property.Properties.isComposite);
		EditingUtils.setEEFtype(isComposite, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isComposite, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsDerivedCheckbox(FormToolkit widgetFactory, Composite parent) {
		isDerived = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsDerivedLabel, SWT.CHECK);
		isDerived.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isDerived, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isDerived.getSelection())));
			}

		});
		GridData isDerivedData = new GridData(GridData.FILL_HORIZONTAL);
		isDerivedData.horizontalSpan = 2;
		isDerived.setLayoutData(isDerivedData);
		EditingUtils.setID(isDerived, StructureViewsRepository.Property.Properties.isDerived);
		EditingUtils.setEEFtype(isDerived, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isDerived, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsIDCheckbox(FormToolkit widgetFactory, Composite parent) {
		isID = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsIDLabel, SWT.CHECK);
		isID.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isID.getSelection())));
			}

		});
		GridData isIDData = new GridData(GridData.FILL_HORIZONTAL);
		isIDData.horizontalSpan = 2;
		isID.setLayoutData(isIDData);
		EditingUtils.setID(isID, StructureViewsRepository.Property.Properties.isID);
		EditingUtils.setEEFtype(isID, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isID, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsGetterAbstractCheckbox(FormToolkit widgetFactory, Composite parent) {
		isGetterAbstract = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsGetterAbstractLabel, SWT.CHECK);
		isGetterAbstract.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isGetterAbstract, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isGetterAbstract.getSelection())));
			}

		});
		GridData isGetterAbstractData = new GridData(GridData.FILL_HORIZONTAL);
		isGetterAbstractData.horizontalSpan = 2;
		isGetterAbstract.setLayoutData(isGetterAbstractData);
		EditingUtils.setID(isGetterAbstract, StructureViewsRepository.Property.Properties.isGetterAbstract);
		EditingUtils.setEEFtype(isGetterAbstract, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isGetterAbstract, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsSetterAbstractCheckbox(FormToolkit widgetFactory, Composite parent) {
		isSetterAbstract = widgetFactory.createButton(parent, StructureMessages.PropertyPropertiesEditionPart_IsSetterAbstractLabel, SWT.CHECK);
		isSetterAbstract.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.isSetterAbstract, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSetterAbstract.getSelection())));
			}

		});
		GridData isSetterAbstractData = new GridData(GridData.FILL_HORIZONTAL);
		isSetterAbstractData.horizontalSpan = 2;
		isSetterAbstract.setLayoutData(isSetterAbstractData);
		EditingUtils.setID(isSetterAbstract, StructureViewsRepository.Property.Properties.isSetterAbstract);
		EditingUtils.setEEFtype(isSetterAbstract, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.isSetterAbstract, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwningClassFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, StructureMessages.PropertyPropertiesEditionPart_OwningClassLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.owningClass, StructureViewsRepository.FORM_KIND));
		owningClass = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Property.Properties.owningClass, StructureViewsRepository.FORM_KIND));
		widgetFactory.adapt(owningClass);
		owningClass.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData owningClassData = new GridData(GridData.FILL_HORIZONTAL);
		owningClass.setLayoutData(owningClassData);
		owningClass.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PropertyPropertiesEditionPartForm.this, StructureViewsRepository.Property.Properties.owningClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwningClass()));
			}

		});
		owningClass.setID(StructureViewsRepository.Property.Properties.owningClass);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Property.Properties.owningClass, StructureViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getType()
	 * 
	 */
	public EObject getType() {
		if (type.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) type.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setType(EObject newValue)
	 * 
	 */
	public void setType(EObject newValue) {
		if (newValue != null) {
			type.setSelection(new StructuredSelection(newValue));
		} else {
			type.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsOrdered()
	 * 
	 */
	public Boolean getIsOrdered() {
		return Boolean.valueOf(isOrdered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsOrdered(Boolean newValue)
	 * 
	 */
	public void setIsOrdered(Boolean newValue) {
		if (newValue != null) {
			isOrdered.setSelection(newValue.booleanValue());
		} else {
			isOrdered.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsUnique()
	 * 
	 */
	public Boolean getIsUnique() {
		return Boolean.valueOf(isUnique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsUnique(Boolean newValue)
	 * 
	 */
	public void setIsUnique(Boolean newValue) {
		if (newValue != null) {
			isUnique.setSelection(newValue.booleanValue());
		} else {
			isUnique.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getLower()
	 * 
	 */
	public String getLower() {
		return lower.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setLower(String newValue)
	 * 
	 */
	public void setLower(String newValue) {
		if (newValue != null) {
			lower.setText(newValue);
		} else {
			lower.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getUpper()
	 * 
	 */
	public String getUpper() {
		return upper.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setUpper(String newValue)
	 * 
	 */
	public void setUpper(String newValue) {
		if (newValue != null) {
			upper.setText(newValue);
		} else {
			upper.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getOpposite()
	 * 
	 */
	public EObject getOpposite() {
		if (opposite.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) opposite.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#initOpposite(EObjectFlatComboSettings)
	 */
	public void initOpposite(EObjectFlatComboSettings settings) {
		opposite.setInput(settings);
		if (current != null) {
			opposite.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setOpposite(EObject newValue)
	 * 
	 */
	public void setOpposite(EObject newValue) {
		if (newValue != null) {
			opposite.setSelection(new StructuredSelection(newValue));
		} else {
			opposite.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setOppositeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOppositeButtonMode(ButtonsModeEnum newValue) {
		opposite.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addFilterOpposite(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOpposite(ViewerFilter filter) {
		opposite.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addBusinessFilterOpposite(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOpposite(ViewerFilter filter) {
		opposite.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsReadOnly()
	 * 
	 */
	public Boolean getIsReadOnly() {
		return Boolean.valueOf(isReadOnly.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsReadOnly(Boolean newValue)
	 * 
	 */
	public void setIsReadOnly(Boolean newValue) {
		if (newValue != null) {
			isReadOnly.setSelection(newValue.booleanValue());
		} else {
			isReadOnly.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getDefault_()
	 * 
	 */
	public String getDefault_() {
		return default_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setDefault_(String newValue)
	 * 
	 */
	public void setDefault_(String newValue) {
		if (newValue != null) {
			default_.setText(newValue);
		} else {
			default_.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsComposite()
	 * 
	 */
	public Boolean getIsComposite() {
		return Boolean.valueOf(isComposite.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsComposite(Boolean newValue)
	 * 
	 */
	public void setIsComposite(Boolean newValue) {
		if (newValue != null) {
			isComposite.setSelection(newValue.booleanValue());
		} else {
			isComposite.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsDerived()
	 * 
	 */
	public Boolean getIsDerived() {
		return Boolean.valueOf(isDerived.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsDerived(Boolean newValue)
	 * 
	 */
	public void setIsDerived(Boolean newValue) {
		if (newValue != null) {
			isDerived.setSelection(newValue.booleanValue());
		} else {
			isDerived.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsID()
	 * 
	 */
	public Boolean getIsID() {
		return Boolean.valueOf(isID.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsID(Boolean newValue)
	 * 
	 */
	public void setIsID(Boolean newValue) {
		if (newValue != null) {
			isID.setSelection(newValue.booleanValue());
		} else {
			isID.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsGetterAbstract()
	 * 
	 */
	public Boolean getIsGetterAbstract() {
		return Boolean.valueOf(isGetterAbstract.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsGetterAbstract(Boolean newValue)
	 * 
	 */
	public void setIsGetterAbstract(Boolean newValue) {
		if (newValue != null) {
			isGetterAbstract.setSelection(newValue.booleanValue());
		} else {
			isGetterAbstract.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getIsSetterAbstract()
	 * 
	 */
	public Boolean getIsSetterAbstract() {
		return Boolean.valueOf(isSetterAbstract.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setIsSetterAbstract(Boolean newValue)
	 * 
	 */
	public void setIsSetterAbstract(Boolean newValue) {
		if (newValue != null) {
			isSetterAbstract.setSelection(newValue.booleanValue());
		} else {
			isSetterAbstract.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#getOwningClass()
	 * 
	 */
	public EObject getOwningClass() {
		if (owningClass.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owningClass.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#initOwningClass(EObjectFlatComboSettings)
	 */
	public void initOwningClass(EObjectFlatComboSettings settings) {
		owningClass.setInput(settings);
		if (current != null) {
			owningClass.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setOwningClass(EObject newValue)
	 * 
	 */
	public void setOwningClass(EObject newValue) {
		if (newValue != null) {
			owningClass.setSelection(new StructuredSelection(newValue));
		} else {
			owningClass.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#setOwningClassButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningClassButtonMode(ButtonsModeEnum newValue) {
		owningClass.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addFilterOwningClass(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwningClass(ViewerFilter filter) {
		owningClass.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.PropertyPropertiesEditionPart#addBusinessFilterOwningClass(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwningClass(ViewerFilter filter) {
		owningClass.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.Property_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
