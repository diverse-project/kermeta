/* $Id: KermetaOutline.java,v 1.23 2008-06-10 11:41:25 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaOutline.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 09 feb. 2005
* Authors : 
* 		Franck Fleurey <ffleurey@irisa.fr>
* 		Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.BooleanPropertyAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.kermeta.interest.InterestedObject;
import org.kermeta.io.ErrorMessage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.WarningMessage;
import org.kermeta.kpm.KermetaUnitHost;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.texteditor.KermetaEditorEventListener;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.icons.ButtonIcons;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.ModelReferenceHelper;

/**
 * @author Franck Fleurey
 */
public class KermetaOutline extends ContentOutlinePage implements InterestedObject {
      
	protected OutlineContentProvider contentProvider;

	private KermetaTextEditor textEditor;
	
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
	
	
	public KermetaOutline(KermetaTextEditor editor) {
		textEditor = editor;
		// The outline is interested in the file because it allows us to keep a list of erroneous and warned items.
		KermetaUnitHost.getInstance().declareInterest(this, textEditor.getFile());
		contentProvider = new OutlineContentProvider(this);
		preferences = new PreferenceStore();
		initializeDefaultsPreference();		
	}
	
	/**
	 * Set default in preference store.
	 */
	public void initializeDefaultsPreference() {
		preferences.setDefault(SORTED_OUTLINE_PREF_KEY, true);
	}
	
	public KermetaUnit getKermetaUnit() {
		if ( textEditor != null )
			return textEditor.getKermetaUnit();
		return null;
	}
	
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
	
	public void dispose()
    {
		KermetaUnitHost.getInstance().undeclareInterest(this, textEditor.getFile());
        _isDisposed = true;
        super.dispose();
    }

	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		treeViewer.setContentProvider(contentProvider);
		// Specific code for label provider and decorator.
		ILabelDecorator decorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
		treeViewer.setLabelProvider( new DecoratingLabelProvider( new OutlineLabelProvider(), decorator ) );
		
		treeViewer.addSelectionChangedListener(this);
		treeViewer.addDoubleClickListener( new DoubleClickListener() );
		
		// Update manually to calculate the list of erroneous and warned items.
		updateValue( getKermetaUnit() );
		
		if ( getKermetaUnit() != null && ! getKermetaUnit().getInternalPackages().isEmpty() )
			treeViewer.setInput( getKermetaUnit() );
		
	}
	
    public void setActionBars(IActionBars actionBars) {
        super.setActionBars(actionBars);
        
        BooleanPropertyAction act = new MyBooleanPropertyAction("Sort features", preferences, SORTED_OUTLINE_PREF_KEY);
        act.setImageDescriptor(ButtonIcons.SORT);
        act.setToolTipText("Sort features");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Show package hierarchy", preferences, PACKAGETREE_OUTLINE_PREF_KEY);
        act.setImageDescriptor(ButtonIcons.PACKAGE_TREE);
        act.setToolTipText("Show package hierarchy");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Flatten inheritance", preferences, INHERITANCEFLATTENING_OUTLINE_PREF_KEY);
        act.setImageDescriptor(ButtonIcons.INHERITANCE_FLAT);
        act.setToolTipText("Flatten inheritance");
        actionBars.getToolBarManager().add(act);
        
        act = new MyBooleanPropertyAction("Show imported types", preferences, SHOWIMPORTED_OUTLINE_PREF_KEY);
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
					try{
						updateHelper();
					}
					catch(Exception e){
						TexteditorPlugin.logErrorMessage("Error while updating outline", e);
					}
				}

			});
			return;
		}
	}
	
    public void selectionChanged(SelectionChangedEvent event)
    {
    	/*
    	 * 
    	 * Getting the selection.
    	 * 
    	 */
    	IStructuredSelection selection = (IStructuredSelection) event.getSelection();
    	NamedElement modelElement = null;
        if ( selection.getFirstElement() instanceof ModelElementOutlineItem )
        	modelElement = (NamedElement) ((ModelElementOutlineItem)selection.getFirstElement()).modelElement;
        else if (selection.getFirstElement() instanceof PackageItem)
        	// get first package part 
        	modelElement = ((PackageItem)selection.getFirstElement()).initialPackage;
    	
        /*
         * 
         * Getting the qualified name of the selected element.
         * 
         */
        if ( modelElement != null )
        	qualifedNameSelected = KermetaModelHelper.NamedElement.qualifiedName(modelElement);        	
    	
        ModelReference mr = textEditor.getKermetaUnit().getTracer().getOneModelReference(modelElement);
            
        TextReference tr = ModelReferenceHelper.getFirstTextReference(mr);
        if(tr != null)
         	textEditor.setHighlightRange(tr.getCharBeginAt(),0 ,true);
        
        // Now notify other plugins or views that the outline selection has changed
        if(modelElement != null){
            Iterator<KermetaEditorEventListener> it = TexteditorPlugin.getDefault().kermetaEditorEventListeners.iterator();
			while(it.hasNext())
			{
				KermetaEditorEventListener listener = it.next();
				listener.outlineSelectionChanged(modelElement);
			}
        }
    }
 	
	public void updateHelper() {
        if (_isDisposed)
            return;

        TreeViewer treeViewer = getTreeViewer();

        if (treeViewer != null) {
    
       		Control control = treeViewer.getControl();
            if (control != null && !control.isDisposed()) {
            	control.setRedraw(false);
                treeViewer.setInput(getKermetaUnit());
	                    
                if ( qualifedNameSelected != null ) {
                	TreeItem[] items = treeViewer.getTree().getItems();
	                List<PackageItem> pitems = new ArrayList<PackageItem>();
	                for ( int i = 0; i < items.length; i++ )
	                	pitems.add( (PackageItem) items[i].getData() );
	                try{
	                	TreePath treePath = getTreePath(pitems);
	                		                    
	                	getTreeViewer().setSelection( new TreeSelection(treePath), true );
	                }
	                catch(Exception e){
	                	TexteditorPlugin.logWarningMessage("cannot set outline selection to "+qualifedNameSelected, e);
	                }
                }
                control.setRedraw(true);
            }
        }
    }

	
	private TreePath getTreePath(List<PackageItem> items) {

		List<java.lang.Object> l = new ArrayList<java.lang.Object>();
		PackageItem packageItem = getPackageItem(qualifedNameSelected, items);
		if ( packageItem == null )
			return null;
		
		String left = qualifedNameSelected.replace(packageItem.getName(), "");
		left = left.replaceFirst("::", "");
		String[] splits = left.split("::");		
		
		l.add(packageItem);
		java.lang.Object currentObject = packageItem;
		for (int i=0; i<splits.length; i++) {
			String s = splits[i];
			if ( currentObject instanceof PackageItem ) {
				for ( ModelElementOutlineItem element : ((PackageItem) currentObject).getTypeDefinitions() )
					if ( ((TypeDefinition) element.modelElement).getName().equals(s) ) {
						l.add(element);
						currentObject = element;
						break;
					}
			} else if ( currentObject instanceof ModelElementOutlineItem ) {
				ModelElementOutlineItem item = (ModelElementOutlineItem) currentObject;
				if ( item.modelElement instanceof ClassDefinition ) {
					for ( java.lang.Object child : item.getChildren() ) {
						ModelElementOutlineItem propOrOp = (ModelElementOutlineItem) child;
						if ( propOrOp.modelElement.getName().equals(s) ) {
							l.add(propOrOp);
							currentObject = propOrOp;
							break;
						}
					}								
				}
			}
		}
		return new TreePath(l.toArray());
	}
	
	private PackageItem getPackageItem(String s, List<PackageItem> items) {
		String[] splits = s.split("::");
		int index = splits.length;
		String packageName = null;
		
		while (index > 0) {
			for ( int i=0; i<index; i++ )
				if ( packageName == null )
					packageName = splits[i];
				else
					packageName += "::" + splits[i];
			
			for ( PackageItem item : items )
				if ( item.getName().equals(packageName) )
					return item;
			
			index--;
			packageName = null;
		}
		return null;
	}



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
	
	public void updateValue(Object value) {
		if ( value instanceof KermetaUnit ) {
			// Getting the kermeta unit. Only do the processing if the kermeta unit is typechecked.
			KermetaUnit kermetaUnit = (KermetaUnit) value;
			// Clearing the list of problematic objects
			_erroneousElements.clear();
			_warnedElements.clear();
			// Recalculate the list of problematic objects.
			List<ErrorMessage> errors = KermetaUnitHelper.getAllErrors(kermetaUnit);
			for ( ErrorMessage e : errors ) {
				if ( e.getTarget() instanceof EObject )
					addErroneousObject( (EObject) e.getTarget() );
			}	
			List<WarningMessage> warnings = KermetaUnitHelper.getAllWarnings(kermetaUnit);
			for ( WarningMessage w : warnings ) {
				if ( w.getTarget() instanceof EObject )
					addWarnedObject( (EObject) w.getTarget() );
			}
		}
	}
	
	private void addErroneousObject(EObject o) {
		addObjectToContainer(o, _erroneousElements);
	}
	
	private void addWarnedObject(EObject o) {
		addObjectToContainer(o, _warnedElements);
	}
	
	private void addObjectToContainer(EObject o, Set<Object> container) {
		while ( o != null ) {
			if ( o instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) o;
				String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(cd);
				Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext( (ClassDefinition) o );
				for ( TypeDefinition t : context ) {
					if ( KermetaModelHelper.NamedElement.qualifiedName(t).equals(qualifiedName) ) {
						container.add( t );
						addObjectToContainer( t.eContainer(), container );
					}
				}
			} else
				container.add(o);
			o = o.eContainer();
		}
	}
	
	public boolean isErroneous(Object item) {
		return _erroneousElements.contains(item);
	}
	
	public boolean isWarned(Object item) {
		return _warnedElements.contains(item);
	}
}