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
import org.kermeta.language.structure.parts.OperationPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class OperationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OperationPropertiesEditionPart {

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
	protected Button isAbstract;
	protected ReferencesTable raisedException;
	protected List<ViewerFilter> raisedExceptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> raisedExceptionFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer superOperation;
	protected EObjectFlatComboViewer owningClass;
	protected ReferencesTable typeParameter;
	protected List<ViewerFilter> typeParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> typeParameterFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OperationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence operationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = operationStep.addStep(StructureViewsRepository.Operation.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.type);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.isOrdered);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.isUnique);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.lower);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.upper);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.isAbstract);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.raisedException);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.superOperation);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.owningClass);
		propertiesStep.addStep(StructureViewsRepository.Operation.Properties.typeParameter);
		
		
		composer = new PartComposer(operationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.Operation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.name) {
					return createNameText(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.type) {
					return createTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.isOrdered) {
					return createIsOrderedCheckbox(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.isUnique) {
					return createIsUniqueCheckbox(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.lower) {
					return createLowerText(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.upper) {
					return createUpperText(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.isAbstract) {
					return createIsAbstractCheckbox(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.raisedException) {
					return createRaisedExceptionAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.superOperation) {
					return createSuperOperationFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.owningClass) {
					return createOwningClassFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Operation.Properties.typeParameter) {
					return createTypeParameterAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(StructureMessages.OperationPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.OperationPropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.kTag, StructureViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.Operation.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(StructureViewsRepository.Operation.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.kType, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.name, StructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, StructureViewsRepository.Operation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.name, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.type, StructureViewsRepository.SWT_KIND));
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.type, StructureViewsRepository.SWT_KIND));
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		type.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.type, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.setID(StructureViewsRepository.Operation.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.type, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsOrderedCheckbox(Composite parent) {
		isOrdered = new Button(parent, SWT.CHECK);
		isOrdered.setText(StructureMessages.OperationPropertiesEditionPart_IsOrderedLabel);
		isOrdered.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.isOrdered, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isOrdered.getSelection())));
			}

		});
		GridData isOrderedData = new GridData(GridData.FILL_HORIZONTAL);
		isOrderedData.horizontalSpan = 2;
		isOrdered.setLayoutData(isOrderedData);
		EditingUtils.setID(isOrdered, StructureViewsRepository.Operation.Properties.isOrdered);
		EditingUtils.setEEFtype(isOrdered, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.isOrdered, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsUniqueCheckbox(Composite parent) {
		isUnique = new Button(parent, SWT.CHECK);
		isUnique.setText(StructureMessages.OperationPropertiesEditionPart_IsUniqueLabel);
		isUnique.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.isUnique, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isUnique.getSelection())));
			}

		});
		GridData isUniqueData = new GridData(GridData.FILL_HORIZONTAL);
		isUniqueData.horizontalSpan = 2;
		isUnique.setLayoutData(isUniqueData);
		EditingUtils.setID(isUnique, StructureViewsRepository.Operation.Properties.isUnique);
		EditingUtils.setEEFtype(isUnique, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.isUnique, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLowerText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_LowerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.lower, StructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.lower, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lower.getText()));
				}
			}

		});
		EditingUtils.setID(lower, StructureViewsRepository.Operation.Properties.lower);
		EditingUtils.setEEFtype(lower, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.lower, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUpperText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_UpperLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.upper, StructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.upper, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, upper.getText()));
				}
			}

		});
		EditingUtils.setID(upper, StructureViewsRepository.Operation.Properties.upper);
		EditingUtils.setEEFtype(upper, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.upper, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsAbstractCheckbox(Composite parent) {
		isAbstract = new Button(parent, SWT.CHECK);
		isAbstract.setText(StructureMessages.OperationPropertiesEditionPart_IsAbstractLabel);
		isAbstract.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.isAbstract, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAbstract.getSelection())));
			}

		});
		GridData isAbstractData = new GridData(GridData.FILL_HORIZONTAL);
		isAbstractData.horizontalSpan = 2;
		isAbstract.setLayoutData(isAbstractData);
		EditingUtils.setID(isAbstract, StructureViewsRepository.Operation.Properties.isAbstract);
		EditingUtils.setEEFtype(isAbstract, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.isAbstract, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRaisedExceptionAdvancedReferencesTable(Composite parent) {
		this.raisedException = new ReferencesTable(StructureMessages.OperationPropertiesEditionPart_RaisedExceptionLabel, new ReferencesTableListener() {
			public void handleAdd() { addRaisedException(); }
			public void handleEdit(EObject element) { editRaisedException(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRaisedException(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRaisedException(element); }
			public void navigateTo(EObject element) { }
		});
		this.raisedException.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.raisedException, StructureViewsRepository.SWT_KIND));
		this.raisedException.createControls(parent);
		this.raisedException.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.raisedException, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData raisedExceptionData = new GridData(GridData.FILL_HORIZONTAL);
		raisedExceptionData.horizontalSpan = 3;
		this.raisedException.setLayoutData(raisedExceptionData);
		this.raisedException.disableMove();
		raisedException.setID(StructureViewsRepository.Operation.Properties.raisedException);
		raisedException.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRaisedException() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(raisedException.getInput(), raisedExceptionFilters, raisedExceptionBusinessFilters,
		"raisedException", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.raisedException,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				raisedException.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRaisedException(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.raisedException, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		raisedException.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRaisedException(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.raisedException, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		raisedException.refresh();
	}

	/**
	 * 
	 */
	protected void editRaisedException(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				raisedException.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSuperOperationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_SuperOperationLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.superOperation, StructureViewsRepository.SWT_KIND));
		superOperation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.superOperation, StructureViewsRepository.SWT_KIND));
		superOperation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		superOperation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.superOperation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSuperOperation()));
			}

		});
		GridData superOperationData = new GridData(GridData.FILL_HORIZONTAL);
		superOperation.setLayoutData(superOperationData);
		superOperation.setID(StructureViewsRepository.Operation.Properties.superOperation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.superOperation, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOwningClassFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.OperationPropertiesEditionPart_OwningClassLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.owningClass, StructureViewsRepository.SWT_KIND));
		owningClass = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Operation.Properties.owningClass, StructureViewsRepository.SWT_KIND));
		owningClass.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		owningClass.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.owningClass, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwningClass()));
			}

		});
		GridData owningClassData = new GridData(GridData.FILL_HORIZONTAL);
		owningClass.setLayoutData(owningClassData);
		owningClass.setID(StructureViewsRepository.Operation.Properties.owningClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.owningClass, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTypeParameterAdvancedReferencesTable(Composite parent) {
		this.typeParameter = new ReferencesTable(StructureMessages.OperationPropertiesEditionPart_TypeParameterLabel, new ReferencesTableListener() {
			public void handleAdd() { addTypeParameter(); }
			public void handleEdit(EObject element) { editTypeParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTypeParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTypeParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.typeParameter.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Operation.Properties.typeParameter, StructureViewsRepository.SWT_KIND));
		this.typeParameter.createControls(parent);
		this.typeParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.typeParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData typeParameterData = new GridData(GridData.FILL_HORIZONTAL);
		typeParameterData.horizontalSpan = 3;
		this.typeParameter.setLayoutData(typeParameterData);
		this.typeParameter.disableMove();
		typeParameter.setID(StructureViewsRepository.Operation.Properties.typeParameter);
		typeParameter.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTypeParameter() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(typeParameter.getInput(), typeParameterFilters, typeParameterBusinessFilters,
		"typeParameter", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.typeParameter,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				typeParameter.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTypeParameter(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.typeParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		typeParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTypeParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OperationPropertiesEditionPartImpl.this, StructureViewsRepository.Operation.Properties.typeParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		typeParameter.refresh();
	}

	/**
	 * 
	 */
	protected void editTypeParameter(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				typeParameter.refresh();
			}
		}
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getType()
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getIsOrdered()
	 * 
	 */
	public Boolean getIsOrdered() {
		return Boolean.valueOf(isOrdered.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setIsOrdered(Boolean newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getIsUnique()
	 * 
	 */
	public Boolean getIsUnique() {
		return Boolean.valueOf(isUnique.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setIsUnique(Boolean newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getLower()
	 * 
	 */
	public String getLower() {
		return lower.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setLower(String newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getUpper()
	 * 
	 */
	public String getUpper() {
		return upper.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setUpper(String newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getIsAbstract()
	 * 
	 */
	public Boolean getIsAbstract() {
		return Boolean.valueOf(isAbstract.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setIsAbstract(Boolean newValue)
	 * 
	 */
	public void setIsAbstract(Boolean newValue) {
		if (newValue != null) {
			isAbstract.setSelection(newValue.booleanValue());
		} else {
			isAbstract.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initRaisedException(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRaisedException(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		raisedException.setContentProvider(contentProvider);
		raisedException.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#updateRaisedException()
	 * 
	 */
	public void updateRaisedException() {
	raisedException.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterRaisedException(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRaisedException(ViewerFilter filter) {
		raisedExceptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterRaisedException(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRaisedException(ViewerFilter filter) {
		raisedExceptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#isContainedInRaisedExceptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInRaisedExceptionTable(EObject element) {
		return ((ReferencesTableSettings)raisedException.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getSuperOperation()
	 * 
	 */
	public EObject getSuperOperation() {
		if (superOperation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) superOperation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initSuperOperation(EObjectFlatComboSettings)
	 */
	public void initSuperOperation(EObjectFlatComboSettings settings) {
		superOperation.setInput(settings);
		if (current != null) {
			superOperation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setSuperOperation(EObject newValue)
	 * 
	 */
	public void setSuperOperation(EObject newValue) {
		if (newValue != null) {
			superOperation.setSelection(new StructuredSelection(newValue));
		} else {
			superOperation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setSuperOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSuperOperationButtonMode(ButtonsModeEnum newValue) {
		superOperation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterSuperOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuperOperation(ViewerFilter filter) {
		superOperation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterSuperOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuperOperation(ViewerFilter filter) {
		superOperation.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#getOwningClass()
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initOwningClass(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setOwningClass(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#setOwningClassButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwningClassButtonMode(ButtonsModeEnum newValue) {
		owningClass.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterOwningClass(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwningClass(ViewerFilter filter) {
		owningClass.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterOwningClass(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwningClass(ViewerFilter filter) {
		owningClass.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#initTypeParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTypeParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		typeParameter.setContentProvider(contentProvider);
		typeParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#updateTypeParameter()
	 * 
	 */
	public void updateTypeParameter() {
	typeParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addFilterTypeParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeParameter(ViewerFilter filter) {
		typeParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#addBusinessFilterTypeParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeParameter(ViewerFilter filter) {
		typeParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.OperationPropertiesEditionPart#isContainedInTypeParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInTypeParameterTable(EObject element) {
		return ((ReferencesTableSettings)typeParameter.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.Operation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
