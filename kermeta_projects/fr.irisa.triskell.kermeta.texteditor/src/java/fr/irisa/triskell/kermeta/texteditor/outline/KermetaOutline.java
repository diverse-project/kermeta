/* $Id: KermetaOutline.java,v 1.13 2007-09-11 12:32:51 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaOutline.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 09 feb. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.Iterator;

import org.eclipse.jface.preference.BooleanPropertyAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.KMTEditor;
import fr.irisa.triskell.kermeta.texteditor.editors.KermetaEditorEventListener;
import fr.irisa.triskell.kermeta.texteditor.icons.ButtonIcons;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;

/**
 * @author Franck Fleurey
 */
public class KermetaOutline extends ContentOutlinePage {
      
	protected OutlineContentProvider contentProvider;
	protected OutlineLabelProvider labelProvider;

	protected KMTEditor editor;
	
	protected boolean _isDisposed = false;

	protected IPreferenceStore preferences;
	
	/**
	 * 
	 */
	public KermetaOutline(KMTEditor editor) {
		super();
		this.editor = editor;
		contentProvider = new OutlineContentProvider(this);
		labelProvider = new OutlineLabelProvider();
		preferences = new PreferenceStore();
	}
	
	public boolean prefSortedOutline() {
	    return preferences.getBoolean("kermeta.outline.sorted");
	}
	
	public boolean prefPackageTree() {
	    return preferences.getBoolean("kermeta.outline.package_tree");
	}
	
	public boolean prefInheritanceFlattening() {
	    return preferences.getBoolean("kermeta.outline.inheritance_flattening");
	}
	
	public boolean prefShowImported() {
	    return preferences.getBoolean("kermeta.outline.show_imported");
	}
	
	public void dispose()
    {
        _isDisposed = true;
        super.dispose();
    }

	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.addSelectionChangedListener(this);
		if (editor.getMcunit() != null && ! editor.getMcunit().getInternalPackages().isEmpty() ) {
			treeViewer.setInput(editor.getMcunit());
			treeViewer.expandToLevel(1);
		}
	}
	
    public void setActionBars(IActionBars actionBars) {
        super.setActionBars(actionBars);
        
        BooleanPropertyAction act = new MyBooleanPropertyAction("Sort features", preferences, "kermeta.outline.sorted");
        act.setImageDescriptor(ButtonIcons.SORT);
        act.setToolTipText("Sort features");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Show package hierarchy", preferences, "kermeta.outline.package_tree");
        act.setImageDescriptor(ButtonIcons.PACKAGE_TREE);
        act.setToolTipText("Show package hierarchy");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Flatten inheritance", preferences, "kermeta.outline.inheritance_flattening");
        act.setImageDescriptor(ButtonIcons.INHERITANCE_FLAT);
        act.setToolTipText("Flatten inheritance");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Show imported types", preferences, "kermeta.outline.show_imported");
        act.setImageDescriptor(ButtonIcons.SHOW_IMPORTED);
        act.setToolTipText("Show imported types");
        actionBars.getToolBarManager().add(act);
    }
    
	public void update() {
		if (_isDisposed) {
			return;
		} else {
			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					updateHelper();
				}

			});
			return;
		}
	}
	
    public void selectionChanged(SelectionChangedEvent event)
    {
        super.selectionChanged(event);
        if (editor.getMcunit()==null || (! editor.getMcunit().getInternalPackages().isEmpty() && editor.getMcunit().getInternalPackages().get(0) == null)) return;
        ISelection selection = event.getSelection();
        if(selection.isEmpty())
        	editor.resetHighlightRange();
        else {
            try
            {
                IStructuredSelection ssel = (IStructuredSelection)selection;
                // try to get one kermeta model element  (DVK with aspect this may be not precise ...)
                fr.irisa.triskell.kermeta.language.structure.Object modelElement = null;
                if(ssel.getFirstElement() instanceof OutlineItem)
                	modelElement =((OutlineItem)ssel.getFirstElement()).modelElement;
                else if (ssel.getFirstElement() instanceof PackageItem){
                	// get first package part 
                	modelElement = ((PackageItem)ssel.getFirstElement()).initialPackage;
                }
                ModelReference mr = editor.getMcunit().getTracer().getModelReference(modelElement);
                
                TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
                if(tr != null)
                	editor.setHighlightRange(tr.getCharBeginAt()-1,0 ,true);
                
                //              Now notify other plugins
                if(modelElement != null){
	                Iterator<KermetaEditorEventListener> it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
	    			while(it.hasNext())
	    			{
	    				KermetaEditorEventListener listener = it.next();
	    				listener.outlineSelectionChanged(modelElement);
	    			}
                }
            }
            catch(Exception _ex)
            {
            	editor.resetHighlightRange();
            }
            
        }
    }
	
	public void updateHelper() {
        if (_isDisposed)
            return;

        TreeViewer treeViewer = getTreeViewer();

        if (treeViewer != null) {
            if (editor.getMcunit() == null) {
                //treeViewer.setInput("Nothing to display");
                return;
            } else {
                
                // save expanded elements
                Object[] expended = treeViewer.getExpandedElements();

                Control control = treeViewer.getControl();
                if (control != null && !control.isDisposed()) {
                    control.setRedraw(false);
                    treeViewer.setInput(editor.getMcunit());
                    treeViewer.expandToLevel(1);
                    
                    // Restore expanded elements
                   // treeViewer.setComparer(fNamedElementComparer);
                    treeViewer.setExpandedElements(expended);
                    
                    control.setRedraw(true);
                }
            }
        }
    }
	/*
    protected static Comparator fNamedElementComparator = new Comparator() {
	    public int compare(Object o1, Object o2) {
	        FNamedElement e1 = (FNamedElement)o1;
	        FNamedElement e2 = (FNamedElement)o2;
	        return e1.getFName().compareTo(e2.getFName());
	    }
	};
	
	protected static IElementComparer fNamedElementComparer = new IElementComparer() {
        public boolean equals(Object o1, Object o2) {
            if (o1 instanceof FNamedElement && o2 instanceof FNamedElement) {
                FNamedElement e1 = (FNamedElement)o1;
                FNamedElement e2 = (FNamedElement)o2;
                return getQualifiedName(e1).equals(getQualifiedName(e2)); 
            }
            else return o1.equals(o2);
        }
        
        public int hashCode(Object o1) {
            if (o1 instanceof FNamedElement) 
                return getQualifiedName((FNamedElement)o1).hashCode();
            else return o1.hashCode();
        }
        
        public String getQualifiedName(FNamedElement element) {
    		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
    			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + element.getFName();
    		else return element.getFName();
    	}
     };
     */



	class MyBooleanPropertyAction extends BooleanPropertyAction {
	    
	    /**
         * @param title
         * @param preferenceStore
         * @param property
         * @throws java.lang.IllegalArgumentException
         */
        public MyBooleanPropertyAction(String title, IPreferenceStore preferenceStore, String property) throws IllegalArgumentException {
            super(title, preferenceStore, property);
        }
        
        
        public void run() {
            super.run();
            update();
        }
	}
}