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
import org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class ModelTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ModelTypePropertiesEditionPart {

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
	protected ReferencesTable contents;
	protected List<ViewerFilter> contentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ModelTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence modelTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = modelTypeStep.addStep(StructureViewsRepository.ModelType.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.typeContainer);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.superType);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.isAspect);
		propertiesStep.addStep(StructureViewsRepository.ModelType.Properties.contents);
		
		
		composer = new PartComposer(modelTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.ModelType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.typeContainer) {
					return createTypeContainerFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.name) {
					return createNameText(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.superType) {
					return createSuperTypeAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.isAspect) {
					return createIsAspectCheckbox(parent);
				}
				if (key == StructureViewsRepository.ModelType.Properties.contents) {
					return createContentsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(StructureMessages.ModelTypePropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.ModelTypePropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.kTag, StructureViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.ModelType.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, StructureMessages.ModelTypePropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.ModelType.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.ModelType.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(StructureViewsRepository.ModelType.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.kType, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTypeContainerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ModelTypePropertiesEditionPart_TypeContainerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.ModelType.Properties.typeContainer, StructureViewsRepository.SWT_KIND));
		typeContainer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.ModelType.Properties.typeContainer, StructureViewsRepository.SWT_KIND));
		typeContainer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		typeContainer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.typeContainer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTypeContainer()));
			}

		});
		GridData typeContainerData = new GridData(GridData.FILL_HORIZONTAL);
		typeContainer.setLayoutData(typeContainerData);
		typeContainer.setID(StructureViewsRepository.ModelType.Properties.typeContainer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.typeContainer, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ModelTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.ModelType.Properties.name, StructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, StructureViewsRepository.ModelType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.name, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSuperTypeAdvancedReferencesTable(Composite parent) {
		this.superType = new ReferencesTable(StructureMessages.ModelTypePropertiesEditionPart_SuperTypeLabel, new ReferencesTableListener() {
			public void handleAdd() { addSuperType(); }
			public void handleEdit(EObject element) { editSuperType(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuperType(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuperType(element); }
			public void navigateTo(EObject element) { }
		});
		this.superType.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.superType, StructureViewsRepository.SWT_KIND));
		this.superType.createControls(parent);
		this.superType.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.superType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData superTypeData = new GridData(GridData.FILL_HORIZONTAL);
		superTypeData.horizontalSpan = 3;
		this.superType.setLayoutData(superTypeData);
		this.superType.disableMove();
		superType.setID(StructureViewsRepository.ModelType.Properties.superType);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.superType,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.superType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		superType.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuperType(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.superType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createIsAspectCheckbox(Composite parent) {
		isAspect = new Button(parent, SWT.CHECK);
		isAspect.setText(StructureMessages.ModelTypePropertiesEditionPart_IsAspectLabel);
		isAspect.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.isAspect, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAspect.getSelection())));
			}

		});
		GridData isAspectData = new GridData(GridData.FILL_HORIZONTAL);
		isAspectData.horizontalSpan = 2;
		isAspect.setLayoutData(isAspectData);
		EditingUtils.setID(isAspect, StructureViewsRepository.ModelType.Properties.isAspect);
		EditingUtils.setEEFtype(isAspect, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.isAspect, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createContentsAdvancedReferencesTable(Composite parent) {
		this.contents = new ReferencesTable(StructureMessages.ModelTypePropertiesEditionPart_ContentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContents(); }
			public void handleEdit(EObject element) { editContents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContents(element); }
			public void navigateTo(EObject element) { }
		});
		this.contents.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.ModelType.Properties.contents, StructureViewsRepository.SWT_KIND));
		this.contents.createControls(parent);
		this.contents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.contents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contentsData = new GridData(GridData.FILL_HORIZONTAL);
		contentsData.horizontalSpan = 3;
		this.contents.setLayoutData(contentsData);
		this.contents.disableMove();
		contents.setID(StructureViewsRepository.ModelType.Properties.contents);
		contents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(contents.getInput(), contentsFilters, contentsBusinessFilters,
		"contents", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.contents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				contents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.contents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		contents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModelTypePropertiesEditionPartImpl.this, StructureViewsRepository.ModelType.Properties.contents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		contents.refresh();
	}

	/**
	 * 
	 */
	protected void editContents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				contents.refresh();
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#getTypeContainer()
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#initTypeContainer(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setTypeContainer(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setTypeContainerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeContainerButtonMode(ButtonsModeEnum newValue) {
		typeContainer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addFilterTypeContainer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTypeContainer(ViewerFilter filter) {
		typeContainer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addBusinessFilterTypeContainer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTypeContainer(ViewerFilter filter) {
		typeContainer.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#initSuperType(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#updateSuperType()
	 * 
	 */
	public void updateSuperType() {
	superType.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addFilterSuperType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuperType(ViewerFilter filter) {
		superTypeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addBusinessFilterSuperType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuperType(ViewerFilter filter) {
		superTypeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#isContainedInSuperTypeTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuperTypeTable(EObject element) {
		return ((ReferencesTableSettings)superType.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#getIsAspect()
	 * 
	 */
	public Boolean getIsAspect() {
		return Boolean.valueOf(isAspect.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#setIsAspect(Boolean newValue)
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
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#initContents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contents.setContentProvider(contentProvider);
		contents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#updateContents()
	 * 
	 */
	public void updateContents() {
	contents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addFilterContents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContents(ViewerFilter filter) {
		contentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#addBusinessFilterContents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContents(ViewerFilter filter) {
		contentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ModelTypePropertiesEditionPart#isContainedInContentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContentsTable(EObject element) {
		return ((ReferencesTableSettings)contents.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.ModelType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
