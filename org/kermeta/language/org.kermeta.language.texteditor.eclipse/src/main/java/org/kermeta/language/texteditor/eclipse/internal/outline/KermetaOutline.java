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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.texteditor.eclipse.internal.KermetaEditor;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.OutlineTypes;



public class KermetaOutline extends ContentOutlinePage implements IDoubleClickListener,ISelectionChangedListener {
	//protected OutlineContentProvider contentProvider;
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
	
	protected MutexRule mutexRule = new MutexRule();
	
	
	/**		A string used to recalculate the selection when updating the outline.		*/
	private String qualifedNameSelected = null;
	
	public KermetaOutline(KermetaEditor editor) {
		textEditor = editor;
		// The outline is interested in the file because it allows us to keep a list of erroneous and warned items.
		//KermetaUnitHost.getInstance().declareInterest(this, textEditor.getFile());
		//String fileName = textEditor.getFile().getName();
		//contentProvider = new OutlineContentProvider();
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
			this.lazyContentProvider = new LazyTreeContentProvider(treeViewer);
		}
		treeViewer.setContentProvider(lazyContentProvider);
		
		ILabelDecorator decorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
		treeViewer.setLabelProvider( new DecoratingLabelProvider( new OutlineLabelProvider(), decorator ) );
		
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				// Do something in the user interface
				TreeViewer treeViewer = getTreeViewer();
				OutlineItem root = getInitialModel();
				if (root != null){
					treeViewer.setInput(root);
				}
				treeViewer.refresh();
			}
		});
		
		
		
		treeViewer.addSelectionChangedListener(this);
		treeViewer.addDoubleClickListener(this);
		treeViewer.addTreeListener(this);
		//treeViewer.refresh(root);
		//treeViewer.update(root, null);
		//treeViewer.refresh();
		
		
		
	}
	public OutlineItem getInitialModel(){
		if (this.KHelper == null){
			ModelingUnit res = loadResource();
			if (res != null){
				this.KHelper = new KermetaOutlineHelper(res);
				this.KHelper.setOutlineForFile(this.textEditor.getFile().getLocationURI());
			} else {
				return null;
			}
		}
		return this.KHelper.getRootStructure();
	}
	public ModelingUnit loadResource(){
		IFile file = this.textEditor.getFile().getProject().getFile("target/beforeCheckingforScopeRESOLVED.km");
		if (file != null){
			try {
				ResourceSet resSet = new ResourceSetImpl();
				Resource res = resSet.getResource(org.kermeta.utils.helpers.emf.EMFUriHelper.convertToEMFUri(file.getLocationURI()), true);
				ModelingUnit rtNode = (ModelingUnit) res.getContents().get(0);	
				
				return rtNode;
			} catch(RuntimeException e){
				return null;
			}
		}
		return null;
	}
	public void update(final ModelingUnit lastCompiledKm){
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				TreeViewer treeViewer = getTreeViewer();
				//lazyContentProvider = new LazyTreeContentProvider(getTreeViewer()); // takes long time
				//treeViewer.setContentProvider(lazyContentProvider);
				final Object[] expandedElements =treeViewer.getExpandedElements(); // must run in the UI Thread
				KHelper = new KermetaOutlineHelper(lastCompiledKm);
				KHelper.setOutlineForFile(textEditor.getFile().getLocationURI());
				OutlineItem root = KHelper.getRootStructure();
				if (root != null){
					treeViewer.setInput(root); // must run in the UI Thread
				}
										
				reexpandFromPreviousState(expandedElements, treeViewer, treeViewer.getTree().getItems());				
	        }
		});
		
		
	}
	public void reexpandFromPreviousState(Object[] previouslyExpandedElements, final TreeViewer treeViewerToExpand,final TreeItem[] possibleObjectsToExpand){
		if(possibleObjectsToExpand == null || possibleObjectsToExpand.length ==0) return;
		if(previouslyExpandedElements == null || previouslyExpandedElements.length ==0) return;
		for(final Object previouslyExpandedObject : previouslyExpandedElements){
			reexpandFromPreviousState((OutlineItem)previouslyExpandedObject,treeViewerToExpand, possibleObjectsToExpand );			
		}		
	}
	public void reexpandFromPreviousState(final OutlineItem previouslyExpandedItem,final TreeViewer treeViewerToExpand, TreeItem[] possibleObjectsToExpand){
		if(possibleObjectsToExpand == null || possibleObjectsToExpand.length ==0) return;
		for(final TreeItem childO : possibleObjectsToExpand){
			if(childO.getData() instanceof OutlineItem){
				OutlineItem childOI = (OutlineItem)childO.getData();
				if(childOI.isSimilar(previouslyExpandedItem)){
					// update child count if necessary
					lazyContentProvider.updateChildCount(childOI, childOI.getChildren().length);
					
					childO.setExpanded(true);
					treeViewerToExpand.refresh(childO);
						
					//treeViewerToExpand.getTree().showItem(childO);
					return;
				}
				// ignore branch with wrong package
				if(((OutlineItem)childO.getData()).fullName().contains(previouslyExpandedItem.packageName)){
					reexpandFromPreviousState(previouslyExpandedItem, treeViewerToExpand, childO.getItems());					
				}
			}
			else{
				reexpandFromPreviousState(previouslyExpandedItem, treeViewerToExpand, childO.getItems());
			}
		}		
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
		/* if ( event.getSource() instanceof TreeViewer ){
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
		}*/
		
	}
	
	@Override
	public void treeExpanded(final TreeExpansionEvent evt) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				if ( evt.getSource() instanceof TreeViewer && evt.getElement() != null && evt.getElement() instanceof OutlineItem ){
					OutlineItem item = (OutlineItem) evt.getElement();
					for(Object child : item.getChildren()){
						if(child instanceof OutlineItem){
							OutlineItem subitem = (OutlineItem) child;
							if(subitem.getChildren() == null){
								if(subitem.type == OutlineTypes.Package){
									subitem.setChildren(KHelper.updatePackage(subitem));							
								}
								if(subitem.type == OutlineTypes.Class){
									subitem.setChildren(KHelper.updateClass(subitem));
								}
								lazyContentProvider.updateChildCount(subitem, subitem.getNoOfChildren());
							}
						}
					}
					//lazyContentProvider.refreshViewer();
					TreeViewer tv = (TreeViewer) evt.getSource();
					
					//tv.refresh();
					tv.refresh(evt.getElement());
					//getTreeViewer().refresh();
				}		
			}
		});
	}

	@Override
	public void treeCollapsed(TreeExpansionEvent arg0) {
		
	}
	
	
	/** mutex rule for not updating twice the same update
	 *
	 */
	public class MutexRule implements ISchedulingRule {
	      public boolean isConflicting(ISchedulingRule rule) {
	         return rule == this;
	      }
	      public boolean contains(ISchedulingRule rule) {
	         return rule == this;
	      }
	}
	

	   
}
