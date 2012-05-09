/* Id: KermetaOutline.java,v 2.0.1 Apr 17, 2012 12:30:48 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : KermetaOutline.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 17, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.util.HashSet;
import java.util.Set;





import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.OutlineTypes;



public class KermetaOutline extends ContentOutlinePage implements IDoubleClickListener,ISelectionChangedListener {
	protected OutlineContentProvider contentProvider;
	protected LazyTreeContentProvider lazyContentProvider;

	private KermetaEditor textEditor;
	private OutlineItem currentOutlineItem;
	private KermetaOutlineHelper KHelper;
	
	protected boolean _isDisposed = false;

	protected IPreferenceStore preferences;
	
	// keys used by the preference store
	private static final String PREFIX = "kermeta.outline.";
	public static final String SORTED_OUTLINE_PREF_KEY     = PREFIX + "sorted";
	public static final String PACKAGETREE_OUTLINE_PREF_KEY     = PREFIX + "package_tree";
	public static final String INHERITANCEFLATTENING_OUTLINE_PREF_KEY     = PREFIX + "inheritance_flattening";
	public static final String SHOWIMPORTED_OUTLINE_PREF_KEY     = PREFIX + "show_imported";
	
	
	private Set<Object> _erroneousElements = new HashSet<Object>();
	
	private Set<Object> _warnedElements = new HashSet<Object>();
	
	
	/**		A string used to recalculate the selection when updating the outline.		*/
	private String qualifedNameSelected = null;
	
	public KermetaOutline(KermetaEditor editor) {
		textEditor = editor;
		// The outline is interested in the file because it allows us to keep a list of erroneous and warned items.
		//KermetaUnitHost.getInstance().declareInterest(this, textEditor.getFile());
		String fileName = textEditor.getFile().getName();
		contentProvider = new OutlineContentProvider();
		preferences = new PreferenceStore();
		initializeDefaultsPreference();	
		currentOutlineItem = null;
		KHelper = null;
	}
	
	/**
	 * Set default in preference store.
	 */
	public void initializeDefaultsPreference() {
		preferences.setDefault(SORTED_OUTLINE_PREF_KEY, true);
	}
	/*
	public KermetaUnit getKermetaUnit() {
		if ( textEditor != null )
			return textEditor.getKermetaUnit();
		return null;
	}
	*/
	public boolean prefSortedOutline() {
	    return preferences.getBoolean(SORTED_OUTLINE_PREF_KEY);
	}
	
	public boolean prefPackageTree() {
	    return preferences.getBoolean(PACKAGETREE_OUTLINE_PREF_KEY);
	}
	
	public boolean prefInheritanceFlattening() {
	    return preferences.getBoolean(INHERITANCEFLATTENING_OUTLINE_PREF_KEY);
	}
	
	public boolean prefShowImported() {
	    return preferences.getBoolean(SHOWIMPORTED_OUTLINE_PREF_KEY);
	}
	

	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		if (this.lazyContentProvider == null ){
			this.lazyContentProvider = new LazyTreeContentProvider(getTreeViewer());
		}
		treeViewer.setContentProvider(lazyContentProvider);
		
		ILabelDecorator decorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
		treeViewer.setLabelProvider( new DecoratingLabelProvider( new OutlineLabelProvider(), decorator ) );
		treeViewer.setInput(getInitialModel());
		
		
		
		treeViewer.addSelectionChangedListener(this);
		treeViewer.addDoubleClickListener(this);
		treeViewer.refresh();
		
		
	}
	public OutlineItem getInitialModel(){
		if (this.KHelper == null){
			this.KHelper = new KermetaOutlineHelper(loadResource());
		}
		return this.KHelper.getRootStructure();
	}
	public ModelingUnit loadResource(){
		IFile file = this.textEditor.getFile().getProject().getFile("target/beforeCheckingforScopeRESOLVED.km");
		if (file != null){
			ResourceSet resSet = new ResourceSetImpl();
			Resource res = resSet.getResource(org.kermeta.utils.helpers.emf.EMFUriHelper.convertToEMFUri(file.getLocationURI()), true);
			ModelingUnit rtNode = (ModelingUnit) res.getContents().get(0);	
			return rtNode;
		}
		return null;
	}
	public void update(){
		System.out.println("Update Tree View for Outline");
		this.KHelper = null;
	}
	public void check(){
		this.getTreeViewer().setInput(getInitialModel());
		this.getTreeViewer().refresh();
	}
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if(event.getSelection().isEmpty()) {
	           return;
	     }
	     if(event.getSelection() instanceof IStructuredSelection) {
	    	   if ( this.KHelper == null){
					this.check();
			   }
	           IStructuredSelection selection = (IStructuredSelection)event.getSelection();
	           Object o = selection.getFirstElement();
	           if ( o != null ){
	        	   if (o instanceof OutlineItem){
	        		   currentOutlineItem = (OutlineItem) o;
	        	   }
	           }
	     }
	}

	@Override
	public void doubleClick(DoubleClickEvent event) {
		if ( event.getSource() instanceof TreeViewer ){
			if (currentOutlineItem != null){
				if (currentOutlineItem.type == OutlineTypes.Package){
					currentOutlineItem.children = this.KHelper.updatePackage(currentOutlineItem);
					getTreeViewer().refresh();
				}
				if (currentOutlineItem.type == OutlineTypes.Class){
					currentOutlineItem.children = this.KHelper.updateClass(currentOutlineItem);
					getTreeViewer().refresh();
				}
				
			}
		}
		
	}
	
}
