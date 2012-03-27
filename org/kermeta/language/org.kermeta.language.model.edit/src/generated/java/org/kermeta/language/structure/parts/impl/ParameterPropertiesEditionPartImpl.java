/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.kermeta.language.structure.parts.ParameterPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class ParameterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ParameterPropertiesEditionPart {

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
	protected EObjectFlatComboViewer operation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParameterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence parameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = parameterStep.addStep(StructureViewsRepository.Parameter.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.type);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.isOrdered);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.isUnique);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.lower);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.upper);
		propertiesStep.addStep(StructureViewsRepository.Parameter.Properties.operation);
		
		
		composer = new PartComposer(parameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.Parameter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.name) {
					return createNameText(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.type) {
					return createTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.isOrdered) {
					return createIsOrderedCheckbox(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.isUnique) {
					return createIsUniqueCheckbox(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.lower) {
					return createLowerText(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.upper) {
					return createUpperText(parent);
				}
				if (key == StructureViewsRepository.Parameter.Properties.operation) {
					return createOperationFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(StructureMessages.ParameterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createKTagAdvancedReferencesTable(Composite parent) {
		this.kTag = new ReferencesTable(StructureMessages.ParameterPropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.kTag, StructureViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.Parameter.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createKTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(StructureViewsRepository.Parameter.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.kType, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.name, StructureViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, StructureViewsRepository.Parameter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.name, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.type, StructureViewsRepository.SWT_KIND));
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.type, StructureViewsRepository.SWT_KIND));
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		type.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.type, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.setID(StructureViewsRepository.Parameter.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.type, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOrderedCheckbox(Composite parent) {
		isOrdered = new Button(parent, SWT.CHECK);
		isOrdered.setText(StructureMessages.ParameterPropertiesEditionPart_IsOrderedLabel);
		isOrdered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.isOrdered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOrdered.getSelection())));
			}

		});
		GridData isOrderedData = new GridData(GridData.FILL_HORIZONTAL);
		isOrderedData.horizontalSpan = 2;
		isOrdered.setLayoutData(isOrderedData);
		EditingUtils.setID(isOrdered, StructureViewsRepository.Parameter.Properties.isOrdered);
		EditingUtils.setEEFtype(isOrdered, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.isOrdered, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsUniqueCheckbox(Composite parent) {
		isUnique = new Button(parent, SWT.CHECK);
		isUnique.setText(StructureMessages.ParameterPropertiesEditionPart_IsUniqueLabel);
		isUnique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.isUnique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isUnique.getSelection())));
			}

		});
		GridData isUniqueData = new GridData(GridData.FILL_HORIZONTAL);
		isUniqueData.horizontalSpan = 2;
		isUnique.setLayoutData(isUniqueData);
		EditingUtils.setID(isUnique, StructureViewsRepository.Parameter.Properties.isUnique);
		EditingUtils.setEEFtype(isUnique, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.isUnique, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLowerText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_LowerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.lower, StructureViewsRepository.SWT_KIND));
		lower = new Text(parent, SWT.BORDER);
		GridData lowerData = new GridData(GridData.FILL_HORIZONTAL);
		lower.setLayoutData(lowerData);
		lower.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
			}

		});
		lower.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
				}
			}

		});
		EditingUtils.setID(lower, StructureViewsRepository.Parameter.Properties.lower);
		EditingUtils.setEEFtype(lower, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.lower, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUpperText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_UpperLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.upper, StructureViewsRepository.SWT_KIND));
		upper = new Text(parent, SWT.BORDER);
		GridData upperData = new GridData(GridData.FILL_HORIZONTAL);
		upper.setLayoutData(upperData);
		upper.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
			}

		});
		upper.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
				}
			}

		});
		EditingUtils.setID(upper, StructureViewsRepository.Parameter.Properties.upper);
		EditingUtils.setEEFtype(upper, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.upper, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOperationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ParameterPropertiesEditionPart_OperationLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.operation, StructureViewsRepository.SWT_KIND));
		operation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Parameter.Properties.operation, StructureViewsRepository.SWT_KIND));
		operation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		operation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParameterPropertiesEditionPartImpl.this, StructureViewsRepository.Parameter.Properties.operation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOperation()));
			}

		});
		GridData operationData = new GridData(GridData.FILL_HORIZONTAL);
		operation.setLayoutData(operationData);
		operation.setID(StructureViewsRepository.Parameter.Properties.operation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Parameter.Properties.operation, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getType()
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#initType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getIsOrdered()
	 * 
	 */
	public Boolean getIsOrdered() {
		return Boolean.valueOf(isOrdered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setIsOrdered(Boolean newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getIsUnique()
	 * 
	 */
	public Boolean getIsUnique() {
		return Boolean.valueOf(isUnique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setIsUnique(Boolean newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getLower()
	 * 
	 */
	public String getLower() {
		return lower.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setLower(String newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getUpper()
	 * 
	 */
	public String getUpper() {
		return upper.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setUpper(String newValue)
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
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#getOperation()
	 * 
	 */
	public EObject getOperation() {
		if (operation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) operation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#initOperation(EObjectFlatComboSettings)
	 */
	public void initOperation(EObjectFlatComboSettings settings) {
		operation.setInput(settings);
		if (current != null) {
			operation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setOperation(EObject newValue)
	 * 
	 */
	public void setOperation(EObject newValue) {
		if (newValue != null) {
			operation.setSelection(new StructuredSelection(newValue));
		} else {
			operation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#setOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOperationButtonMode(ButtonsModeEnum newValue) {
		operation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addFilterOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOperation(ViewerFilter filter) {
		operation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ParameterPropertiesEditionPart#addBusinessFilterOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOperation(ViewerFilter filter) {
		operation.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.Parameter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
