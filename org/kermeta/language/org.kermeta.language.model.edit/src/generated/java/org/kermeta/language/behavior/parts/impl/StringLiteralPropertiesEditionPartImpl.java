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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.kermeta.language.behavior.parts.BehaviorViewsRepository;
import org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart;
import org.kermeta.language.behavior.providers.BehaviorMessages;


// End of user code

/**
 * @author Didier Vojtisek
 * 
 */
public class StringLiteralPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StringLiteralPropertiesEditionPart {

	protected ReferencesTable kTag;
	protected List<ViewerFilter> kTagBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> kTagFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer kType;
	protected EObjectFlatComboViewer staticType;
	protected Text value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StringLiteralPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence stringLiteralStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = stringLiteralStep.addStep(BehaviorViewsRepository.StringLiteral.Properties.class);
		propertiesStep.addStep(BehaviorViewsRepository.StringLiteral.Properties.kTag);
		propertiesStep.addStep(BehaviorViewsRepository.StringLiteral.Properties.kType);
		propertiesStep.addStep(BehaviorViewsRepository.StringLiteral.Properties.staticType);
		propertiesStep.addStep(BehaviorViewsRepository.StringLiteral.Properties.value);
		
		
		composer = new PartComposer(stringLiteralStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BehaviorViewsRepository.StringLiteral.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BehaviorViewsRepository.StringLiteral.Properties.kTag) {
					return createKTagAdvancedReferencesTable(parent);
				}
				if (key == BehaviorViewsRepository.StringLiteral.Properties.kType) {
					return createKTypeFlatComboViewer(parent);
				}
				if (key == BehaviorViewsRepository.StringLiteral.Properties.staticType) {
					return createStaticTypeFlatComboViewer(parent);
				}
				if (key == BehaviorViewsRepository.StringLiteral.Properties.value) {
					return createValueText(parent);
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
		propertiesGroup.setText(BehaviorMessages.StringLiteralPropertiesEditionPart_PropertiesGroupLabel);
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
		this.kTag = new ReferencesTable(BehaviorMessages.StringLiteralPropertiesEditionPart_KTagLabel, new ReferencesTableListener() {
			public void handleAdd() { addKTag(); }
			public void handleEdit(EObject element) { editKTag(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveKTag(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromKTag(element); }
			public void navigateTo(EObject element) { }
		});
		this.kTag.setHelpText(propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.StringLiteral.Properties.kTag, BehaviorViewsRepository.SWT_KIND));
		this.kTag.createControls(parent);
		this.kTag.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.kTag, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData kTagData = new GridData(GridData.FILL_HORIZONTAL);
		kTagData.horizontalSpan = 3;
		this.kTag.setLayoutData(kTagData);
		this.kTag.disableMove();
		kTag.setID(BehaviorViewsRepository.StringLiteral.Properties.kTag);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.kTag,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		kTag.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromKTag(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.kTag, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, BehaviorMessages.StringLiteralPropertiesEditionPart_KTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.StringLiteral.Properties.kType, BehaviorViewsRepository.SWT_KIND));
		kType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.StringLiteral.Properties.kType, BehaviorViewsRepository.SWT_KIND));
		kType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		kType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.kType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getKType()));
			}

		});
		GridData kTypeData = new GridData(GridData.FILL_HORIZONTAL);
		kType.setLayoutData(kTypeData);
		kType.setID(BehaviorViewsRepository.StringLiteral.Properties.kType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.StringLiteral.Properties.kType, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStaticTypeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, BehaviorMessages.StringLiteralPropertiesEditionPart_StaticTypeLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.StringLiteral.Properties.staticType, BehaviorViewsRepository.SWT_KIND));
		staticType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BehaviorViewsRepository.StringLiteral.Properties.staticType, BehaviorViewsRepository.SWT_KIND));
		staticType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		staticType.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.staticType, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStaticType()));
			}

		});
		GridData staticTypeData = new GridData(GridData.FILL_HORIZONTAL);
		staticType.setLayoutData(staticTypeData);
		staticType.setID(BehaviorViewsRepository.StringLiteral.Properties.staticType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.StringLiteral.Properties.staticType, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, BehaviorMessages.StringLiteralPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(BehaviorViewsRepository.StringLiteral.Properties.value, BehaviorViewsRepository.SWT_KIND));
		value = new Text(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringLiteralPropertiesEditionPartImpl.this, BehaviorViewsRepository.StringLiteral.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, BehaviorViewsRepository.StringLiteral.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BehaviorViewsRepository.StringLiteral.Properties.value, BehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#initKTag(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#updateKTag()
	 * 
	 */
	public void updateKTag() {
	kTag.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKTag(ViewerFilter filter) {
		kTagFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addBusinessFilterKTag(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKTag(ViewerFilter filter) {
		kTagBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#isContainedInKTagTable(EObject element)
	 * 
	 */
	public boolean isContainedInKTagTable(EObject element) {
		return ((ReferencesTableSettings)kTag.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#getKType()
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#initKType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#setKType(EObject newValue)
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#setKTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setKTypeButtonMode(ButtonsModeEnum newValue) {
		kType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToKType(ViewerFilter filter) {
		kType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addBusinessFilterKType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToKType(ViewerFilter filter) {
		kType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#getStaticType()
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#initStaticType(EObjectFlatComboSettings)
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#setStaticType(EObject newValue)
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
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#setStaticTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStaticTypeButtonMode(ButtonsModeEnum newValue) {
		staticType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStaticType(ViewerFilter filter) {
		staticType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#addBusinessFilterStaticType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStaticType(ViewerFilter filter) {
		staticType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.kermeta.language.behavior.parts.StringLiteralPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BehaviorMessages.StringLiteral_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
