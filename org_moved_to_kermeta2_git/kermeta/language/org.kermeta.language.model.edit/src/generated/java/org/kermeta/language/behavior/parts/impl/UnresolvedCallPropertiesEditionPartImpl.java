/*
 * Licence : EPL
 * Copyright : IRISA/Inria
*/
package org.kermeta.language.behavior.parts.impl;

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
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart;
import org.kermeta.language.behavior.providers.BehaviorMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class UnresolvedCallPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, UnresolvedCallPropertiesEditionPart {

	protected ReferencesTable kTag;
	protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected EObjectFlatComboViewer staticType;
	protected Text name;
	protected ReferencesTable staticTypeVariableBindings;
	protected List<ViewerFilter> staticTypeVariableBindingsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> staticTypeVariableBindingsFilters = new ArrayList<ViewerFilter>();
	protected Button isAtpre;
	protected EObjectFlatComboViewer targetParent;
	protected ReferencesTable generics;
	protected List<ViewerFilter> genericsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> genericsFilters = new ArrayList<ViewerFilter>();
	protected Button isCalledWithParenthesis;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public UnresolvedCallPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence unresolvedCallStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = unresolvedCallStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.class);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.kTag);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.kType);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.staticType);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.name);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.isAtpre);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.targetParent);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.generics);
		propertiesStep.addStep(BehaviorViewsRepository.UnresolvedCall.Properties.isCalledWithParenthesis);
		
		
		composer = new PartComposer(unresolvedCallStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.staticType) {
					return createStaticTypeFlatComboViewer(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.name) {
					return createNameText(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings) {
					return createStaticTypeVariableBindingsAdvancedReferencesTable(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.isAtpre) {
					return createIsAtpreCheckbox(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.targetParent) {
					return createTargetParentFlatComboViewer(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.generics) {
					return createGenericsAdvancedReferencesTable(parent);
				}
				if (key == BehaviorViewsRepository.UnresolvedCall.Properties.isCalledWithParenthesis) {
					return createIsCalledWithParenthesisCheckbox(parent);
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
		propertiesGroup.setText(BehaviorMessages.UnresolvedCallPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(BehaviorMessages.UnresolvedCallPropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.kTag, BehaviorViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(BehaviorViewsRepository.UnresolvedCall.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, BehaviorMessages.UnresolvedCallPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.kType, BehaviorViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.kType, BehaviorViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(BehaviorViewsRepository.UnresolvedCall.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.kType, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStaticTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, BehaviorMessages.UnresolvedCallPropertiesEditionPart_StaticTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.staticType, BehaviorViewsRepository.SWT_KIND));
		staticType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.staticType, BehaviorViewsRepository.SWT_KIND));
		staticType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		staticType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.staticType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStaticType()));
			}

		});
		GridData staticTypeData = new GridData(GridData.FILL_HORIZONTAL);
		staticType.setLayoutData(staticTypeData);
		staticType.setID(BehaviorViewsRepository.UnresolvedCall.Properties.staticType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.staticType, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, BehaviorMessages.UnresolvedCallPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.name, BehaviorViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BehaviorViewsRepository.UnresolvedCall.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.name, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createStaticTypeVariableBindingsAdvancedReferencesTable(Composite parent) {
		this.staticTypeVariableBindings = new ReferencesTable(BehaviorMessages.UnresolvedCallPropertiesEditionPart_StaticTypeVariableBindingsLabel, new ReferencesTableListener() {
			public void handleAdd() { addStaticTypeVariableBindings(); }
			public void handleEdit(EObject element) { editStaticTypeVariableBindings(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveStaticTypeVariableBindings(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromStaticTypeVariableBindings(element); }
			public void navigateTo(EObject element) { }
		});
		this.staticTypeVariableBindings.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings, BehaviorViewsRepository.SWT_KIND));
		this.staticTypeVariableBindings.createControls(parent);
		this.staticTypeVariableBindings.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData staticTypeVariableBindingsData = new GridData(GridData.FILL_HORIZONTAL);
		staticTypeVariableBindingsData.horizontalSpan = 3;
		this.staticTypeVariableBindings.setLayoutData(staticTypeVariableBindingsData);
		this.staticTypeVariableBindings.disableMove();
		staticTypeVariableBindings.setID(BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings);
		staticTypeVariableBindings.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addStaticTypeVariableBindings() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(staticTypeVariableBindings.getInput(), staticTypeVariableBindingsFilters, staticTypeVariableBindingsBusinessFilters,
		"staticTypeVariableBindings", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				staticTypeVariableBindings.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveStaticTypeVariableBindings(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		staticTypeVariableBindings.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromStaticTypeVariableBindings(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.staticTypeVariableBindings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		staticTypeVariableBindings.refresh();
	}

	/**
	 * 
	 */
	protected void editStaticTypeVariableBindings(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				staticTypeVariableBindings.refresh();
			}
		}
	}

	
	protected Composite createIsAtpreCheckbox(Composite parent) {
		isAtpre = new Button(parent, SWT.CHECK);
		isAtpre.setText(BehaviorMessages.UnresolvedCallPropertiesEditionPart_IsAtpreLabel);
		isAtpre.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.isAtpre, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAtpre.getSelection())));
			}

		});
		GridData isAtpreData = new GridData(GridData.FILL_HORIZONTAL);
		isAtpreData.horizontalSpan = 2;
		isAtpre.setLayoutData(isAtpreData);
		EditingUtils.setID(isAtpre, BehaviorViewsRepository.UnresolvedCall.Properties.isAtpre);
		EditingUtils.setEEFtype(isAtpre, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.isAtpre, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetParentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, BehaviorMessages.UnresolvedCallPropertiesEditionPart_TargetParentLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.targetParent, BehaviorViewsRepository.SWT_KIND));
		targetParent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.UnresolvedCall.Properties.targetParent, BehaviorViewsRepository.SWT_KIND));
		targetParent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetParent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.targetParent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetParent()));
			}

		});
		GridData targetParentData = new GridData(GridData.FILL_HORIZONTAL);
		targetParent.setLayoutData(targetParentData);
		targetParent.setID(BehaviorViewsRepository.UnresolvedCall.Properties.targetParent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.targetParent, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGenericsAdvancedReferencesTable(Composite parent) {
		this.generics = new ReferencesTable(BehaviorMessages.UnresolvedCallPropertiesEditionPart_GenericsLabel, new ReferencesTableListener() {
			public void handleAdd() { addGenerics(); }
			public void handleEdit(EObject element) { editGenerics(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGenerics(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGenerics(element); }
			public void navigateTo(EObject element) { }
		});
		this.generics.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.generics, BehaviorViewsRepository.SWT_KIND));
		this.generics.createControls(parent);
		this.generics.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.generics, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData genericsData = new GridData(GridData.FILL_HORIZONTAL);
		genericsData.horizontalSpan = 3;
		this.generics.setLayoutData(genericsData);
		this.generics.disableMove();
		generics.setID(BehaviorViewsRepository.UnresolvedCall.Properties.generics);
		generics.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGenerics() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(generics.getInput(), genericsFilters, genericsBusinessFilters,
		"generics", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.generics,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				generics.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGenerics(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.generics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		generics.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGenerics(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.generics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		generics.refresh();
	}

	/**
	 * 
	 */
	protected void editGenerics(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				generics.refresh();
			}
		}
	}

	
	protected Composite createIsCalledWithParenthesisCheckbox(Composite parent) {
		isCalledWithParenthesis = new Button(parent, SWT.CHECK);
		isCalledWithParenthesis.setText(BehaviorMessages.UnresolvedCallPropertiesEditionPart_IsCalledWithParenthesisLabel);
		isCalledWithParenthesis.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnresolvedCallPropertiesEditionPartImpl.this, BehaviorViewsRepository.UnresolvedCall.Properties.isCalledWithParenthesis, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isCalledWithParenthesis.getSelection())));
			}

		});
		GridData isCalledWithParenthesisData = new GridData(GridData.FILL_HORIZONTAL);
		isCalledWithParenthesisData.horizontalSpan = 2;
		isCalledWithParenthesis.setLayoutData(isCalledWithParenthesisData);
		EditingUtils.setID(isCalledWithParenthesis, BehaviorViewsRepository.UnresolvedCall.Properties.isCalledWithParenthesis);
		EditingUtils.setEEFtype(isCalledWithParenthesis, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.UnresolvedCall.Properties.isCalledWithParenthesis, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getStaticType()
	 * 
	 */
	public EObject getStaticType() {
		if (staticType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) staticType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initStaticType(EObjectFlatComboSettings)
	 */
	public void initStaticType(EObjectFlatComboSettings settings) {
		staticType.setInput(settings);
		if (current != null) {
			staticType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setStaticType(EObject newValue)
	 * 
	 */
	public void setStaticType(EObject newValue) {
		if (newValue != null) {
			staticType.setSelection(new StructuredSelection(newValue));
		} else {
			staticType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setStaticTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStaticTypeButtonMode(ButtonsModeEnum newValue) {
		staticType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStaticType(ViewerFilter filter) {
		staticType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStaticType(ViewerFilter filter) {
		staticType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setName(String newValue)
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
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initStaticTypeVariableBindings(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initStaticTypeVariableBindings(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		staticTypeVariableBindings.setContentProvider(contentProvider);
		staticTypeVariableBindings.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#updateStaticTypeVariableBindings()
	 * 
	 */
	public void updateStaticTypeVariableBindings() {
	staticTypeVariableBindings.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterStaticTypeVariableBindings(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStaticTypeVariableBindings(ViewerFilter filter) {
		staticTypeVariableBindingsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterStaticTypeVariableBindings(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStaticTypeVariableBindings(ViewerFilter filter) {
		staticTypeVariableBindingsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#isContainedInStaticTypeVariableBindingsTable(EObject element)
	 * 
	 */
	public boolean isContainedInStaticTypeVariableBindingsTable(EObject element) {
		return ((ReferencesTableSettings)staticTypeVariableBindings.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getIsAtpre()
	 * 
	 */
	public Boolean getIsAtpre() {
		return Boolean.valueOf(isAtpre.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setIsAtpre(Boolean newValue)
	 * 
	 */
	public void setIsAtpre(Boolean newValue) {
		if (newValue != null) {
			isAtpre.setSelection(newValue.booleanValue());
		} else {
			isAtpre.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getTargetParent()
	 * 
	 */
	public EObject getTargetParent() {
		if (targetParent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetParent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initTargetParent(EObjectFlatComboSettings)
	 */
	public void initTargetParent(EObjectFlatComboSettings settings) {
		targetParent.setInput(settings);
		if (current != null) {
			targetParent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setTargetParent(EObject newValue)
	 * 
	 */
	public void setTargetParent(EObject newValue) {
		if (newValue != null) {
			targetParent.setSelection(new StructuredSelection(newValue));
		} else {
			targetParent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setTargetParentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetParentButtonMode(ButtonsModeEnum newValue) {
		targetParent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterTargetParent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetParent(ViewerFilter filter) {
		targetParent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterTargetParent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetParent(ViewerFilter filter) {
		targetParent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#initGenerics(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGenerics(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		generics.setContentProvider(contentProvider);
		generics.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#updateGenerics()
	 * 
	 */
	public void updateGenerics() {
	generics.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addFilterGenerics(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGenerics(ViewerFilter filter) {
		genericsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#addBusinessFilterGenerics(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGenerics(ViewerFilter filter) {
		genericsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#isContainedInGenericsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGenericsTable(EObject element) {
		return ((ReferencesTableSettings)generics.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#getIsCalledWithParenthesis()
	 * 
	 */
	public Boolean getIsCalledWithParenthesis() {
		return Boolean.valueOf(isCalledWithParenthesis.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.UnresolvedCallPropertiesEditionPart#setIsCalledWithParenthesis(Boolean newValue)
	 * 
	 */
	public void setIsCalledWithParenthesis(Boolean newValue) {
		if (newValue != null) {
			isCalledWithParenthesis.setSelection(newValue.booleanValue());
		} else {
			isCalledWithParenthesis.setSelection(false);
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BehaviorMessages.UnresolvedCall_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
