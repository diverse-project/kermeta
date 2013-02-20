/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.structure.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart;
import org.kermeta.language.structure.parts.StructureViewsRepository;
import org.kermeta.language.structure.providers.StructureMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class ConstraintPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConstraintPropertiesEditionPart {

	protected ReferencesTable kTag;
	protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected Text name;
	protected EMFComboViewer stereotype;
	protected EMFComboViewer language;
	protected EObjectFlatComboViewer invOwner;
	protected EObjectFlatComboViewer preOwner;
	protected EObjectFlatComboViewer postOwner;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConstraintPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence constraintStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = constraintStep.addStep(StructureViewsRepository.Constraint.Properties.class);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.kTag);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.kType);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.name);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.stereotype);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.language);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.invOwner);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.preOwner);
		propertiesStep.addStep(StructureViewsRepository.Constraint.Properties.postOwner);
		
		
		composer = new PartComposer(constraintStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StructureViewsRepository.Constraint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.name) {
					return createNameText(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.stereotype) {
					return createStereotypeEMFComboViewer(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.language) {
					return createLanguageEMFComboViewer(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.invOwner) {
					return createInvOwnerFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.preOwner) {
					return createPreOwnerFlatComboViewer(parent);
				}
				if (key == StructureViewsRepository.Constraint.Properties.postOwner) {
					return createPostOwnerFlatComboViewer(parent);
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
		propertiesGroup.setText(StructureMessages.ConstraintPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(StructureMessages.ConstraintPropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.kTag, StructureViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(StructureViewsRepository.Constraint.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.kType, StructureViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(StructureViewsRepository.Constraint.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.kType, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.name, StructureViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, StructureViewsRepository.Constraint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.name, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStereotypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_StereotypeLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.stereotype, StructureViewsRepository.SWT_KIND));
		stereotype = new EMFComboViewer(parent);
		stereotype.setContentProvider(new ArrayContentProvider());
		stereotype.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData stereotypeData = new GridData(GridData.FILL_HORIZONTAL);
		stereotype.getCombo().setLayoutData(stereotypeData);
		stereotype.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.stereotype, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStereotype()));
			}

		});
		stereotype.setID(StructureViewsRepository.Constraint.Properties.stereotype);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.stereotype, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLanguageEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_LanguageLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.language, StructureViewsRepository.SWT_KIND));
		language = new EMFComboViewer(parent);
		language.setContentProvider(new ArrayContentProvider());
		language.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData languageData = new GridData(GridData.FILL_HORIZONTAL);
		language.getCombo().setLayoutData(languageData);
		language.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.language, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLanguage()));
			}

		});
		language.setID(StructureViewsRepository.Constraint.Properties.language);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.language, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInvOwnerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_InvOwnerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.invOwner, StructureViewsRepository.SWT_KIND));
		invOwner = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.invOwner, StructureViewsRepository.SWT_KIND));
		invOwner.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		invOwner.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.invOwner, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInvOwner()));
			}

		});
		GridData invOwnerData = new GridData(GridData.FILL_HORIZONTAL);
		invOwner.setLayoutData(invOwnerData);
		invOwner.setID(StructureViewsRepository.Constraint.Properties.invOwner);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.invOwner, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPreOwnerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_PreOwnerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.preOwner, StructureViewsRepository.SWT_KIND));
		preOwner = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.preOwner, StructureViewsRepository.SWT_KIND));
		preOwner.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		preOwner.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.preOwner, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPreOwner()));
			}

		});
		GridData preOwnerData = new GridData(GridData.FILL_HORIZONTAL);
		preOwner.setLayoutData(preOwnerData);
		preOwner.setID(StructureViewsRepository.Constraint.Properties.preOwner);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.preOwner, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createPostOwnerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, StructureMessages.ConstraintPropertiesEditionPart_PostOwnerLabel, propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.postOwner, StructureViewsRepository.SWT_KIND));
		postOwner = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(StructureViewsRepository.Constraint.Properties.postOwner, StructureViewsRepository.SWT_KIND));
		postOwner.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		postOwner.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintPropertiesEditionPartImpl.this, StructureViewsRepository.Constraint.Properties.postOwner, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPostOwner()));
			}

		});
		GridData postOwnerData = new GridData(GridData.FILL_HORIZONTAL);
		postOwner.setLayoutData(postOwnerData);
		postOwner.setID(StructureViewsRepository.Constraint.Properties.postOwner);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(StructureViewsRepository.Constraint.Properties.postOwner, StructureViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getStereotype()
	 * 
	 */
	public Enumerator getStereotype() {
		Enumerator selection = (Enumerator) ((StructuredSelection) stereotype.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initStereotype(Object input, Enumerator current)
	 */
	public void initStereotype(Object input, Enumerator current) {
		stereotype.setInput(input);
		stereotype.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setStereotype(Enumerator newValue)
	 * 
	 */
	public void setStereotype(Enumerator newValue) {
		stereotype.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getLanguage()
	 * 
	 */
	public Enumerator getLanguage() {
		Enumerator selection = (Enumerator) ((StructuredSelection) language.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initLanguage(Object input, Enumerator current)
	 */
	public void initLanguage(Object input, Enumerator current) {
		language.setInput(input);
		language.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setLanguage(Enumerator newValue)
	 * 
	 */
	public void setLanguage(Enumerator newValue) {
		language.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getInvOwner()
	 * 
	 */
	public EObject getInvOwner() {
		if (invOwner.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) invOwner.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initInvOwner(EObjectFlatComboSettings)
	 */
	public void initInvOwner(EObjectFlatComboSettings settings) {
		invOwner.setInput(settings);
		if (current != null) {
			invOwner.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setInvOwner(EObject newValue)
	 * 
	 */
	public void setInvOwner(EObject newValue) {
		if (newValue != null) {
			invOwner.setSelection(new StructuredSelection(newValue));
		} else {
			invOwner.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setInvOwnerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInvOwnerButtonMode(ButtonsModeEnum newValue) {
		invOwner.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addFilterInvOwner(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInvOwner(ViewerFilter filter) {
		invOwner.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addBusinessFilterInvOwner(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInvOwner(ViewerFilter filter) {
		invOwner.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getPreOwner()
	 * 
	 */
	public EObject getPreOwner() {
		if (preOwner.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) preOwner.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initPreOwner(EObjectFlatComboSettings)
	 */
	public void initPreOwner(EObjectFlatComboSettings settings) {
		preOwner.setInput(settings);
		if (current != null) {
			preOwner.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setPreOwner(EObject newValue)
	 * 
	 */
	public void setPreOwner(EObject newValue) {
		if (newValue != null) {
			preOwner.setSelection(new StructuredSelection(newValue));
		} else {
			preOwner.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setPreOwnerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPreOwnerButtonMode(ButtonsModeEnum newValue) {
		preOwner.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addFilterPreOwner(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPreOwner(ViewerFilter filter) {
		preOwner.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addBusinessFilterPreOwner(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPreOwner(ViewerFilter filter) {
		preOwner.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#getPostOwner()
	 * 
	 */
	public EObject getPostOwner() {
		if (postOwner.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) postOwner.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#initPostOwner(EObjectFlatComboSettings)
	 */
	public void initPostOwner(EObjectFlatComboSettings settings) {
		postOwner.setInput(settings);
		if (current != null) {
			postOwner.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setPostOwner(EObject newValue)
	 * 
	 */
	public void setPostOwner(EObject newValue) {
		if (newValue != null) {
			postOwner.setSelection(new StructuredSelection(newValue));
		} else {
			postOwner.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#setPostOwnerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setPostOwnerButtonMode(ButtonsModeEnum newValue) {
		postOwner.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addFilterPostOwner(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPostOwner(ViewerFilter filter) {
		postOwner.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.structure.parts.ConstraintPropertiesEditionPart#addBusinessFilterPostOwner(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPostOwner(ViewerFilter filter) {
		postOwner.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StructureMessages.Constraint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
