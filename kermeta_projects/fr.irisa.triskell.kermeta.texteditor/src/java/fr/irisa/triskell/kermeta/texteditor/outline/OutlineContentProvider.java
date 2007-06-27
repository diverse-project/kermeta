/* $Id: OutlineContentProvider.java,v 1.4 2007-06-27 13:19:39 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : OutlineContentProvider.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 feb. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;

/**
 * @author Franck Fleurey
 */
public class OutlineContentProvider implements ITreeContentProvider {

	protected KermetaOutline outline;
	
	/**
	 * 
	 */
	public OutlineContentProvider(KermetaOutline outline) {
		super();
		this.outline = outline;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
	    if (parentElement == null) return new Object[0];
		if (parentElement instanceof OutlineItem) return ((OutlineItem)parentElement).getChildren();
		else if (parentElement instanceof KermetaUnit) return getElements(parentElement);
		else return new Object[0];
	}
	
	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		return ((OutlineItem)element).parent;
	}
	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
	    if (element == null) return false;
		return ((OutlineItem)element).getChildren().length != 0;
	}
	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
	    
	    try {
	    
	    if (!(inputElement instanceof KermetaUnit) || inputElement == null) {
	        Object[] o = new Object[1];
	        o[0] = "error creating outline";
	    }
		KermetaUnit unit = (KermetaUnit)inputElement;
		ArrayList result = new ArrayList();
		
	    Iterator it = unit.packages.values().iterator();
	    while(it.hasNext()) {
	        Package pack = (Package)it.next();
	       
            OutlineItem item = new OutlineItem(pack, null, outline);
            
            
            if (!outline.prefPackageTree() || pack.getNestingPackage() == null) {
                if(outline.prefShowImported() || !item.isPackageFullyImported()) {
	                result.add(item);
	            }
            }
	    }
	    
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		
		return result.toArray();
		
	    }
	    catch(Throwable t) {
	        t.printStackTrace();
	    }
	    return new Object[0];
	}
	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {

	}
	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}
}

