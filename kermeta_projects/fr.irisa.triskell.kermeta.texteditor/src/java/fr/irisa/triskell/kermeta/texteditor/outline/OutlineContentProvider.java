/* $Id: OutlineContentProvider.java,v 1.8 2007-12-17 14:05:11 ftanguy Exp $
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

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
	    if (parentElement == null) 
	    	return new Object[0];
	    
	    if ( parentElement instanceof PackageItem )
	    	return ((PackageItem) parentElement).getTypeDefinitions().toArray();
		if (parentElement instanceof ModelElementOutlineItem) 
			return ((OutlineItem)parentElement).getChildren();
		else if (parentElement instanceof KermetaUnit) 
			return getElements(parentElement);
		else 
			return new Object[0];
	}
	
	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		if ( element instanceof PackageItem )
			return null;
		return ((ModelElementOutlineItem)element).parent;
	}
	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
	    if (element == null) return false;
	    
	    if ( element instanceof PackageItem ) {
	    	return ((PackageItem) element).getTypeDefinitions().size() > 0;
	    } else {    
	    	return ((OutlineItem)element).getChildren().length != 0;
	    }
	}
	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
	    
	    try {
	    
		    if ( ! (inputElement instanceof KermetaUnit) ) {
		    	Object[] o = new Object[1];
		    	if ( inputElement instanceof String ) {
			        o[0] = new NonModelElementItem( (String) inputElement);		    				    		
		    	} else {
			        o[0] = new NonModelElementItem( "error creating outline" );		    		
		    	}
		    	return o;
		    }

			KermetaUnit unit = (KermetaUnit)inputElement;
			ArrayList <PackageItem> result = new ArrayList <PackageItem> ();
			
			Map <String, PackageItem> packages = new HashMap <String, PackageItem> ();
			
			if ( outline.prefShowImported() ) {
				for ( Package p : (List<Package>) unit.getExternalPackages() ) {
					String qualifiedName = NamedElementHelper.getQualifiedName(p);
					PackageItem item = packages.get( qualifiedName );
					if ( item == null ) {
						item = new PackageItem( qualifiedName, false, outline, p );
						item.addAllTypeDefinitions( p.getOwnedTypeDefinition() );
						packages.put( qualifiedName, item );
						result.add( item );
					} else {
						item.addAllTypeDefinitions( p.getOwnedTypeDefinition() );
						item.getPackageParts().add(p);	// the item must know about all its parts
					}
				}	
			}
			
			for ( Package p : (List<Package>) unit.getInternalPackages() ) {
				String qualifiedName = NamedElementHelper.getQualifiedName(p);
				PackageItem item = packages.get( qualifiedName );
				if ( item == null ) {
					item = new PackageItem( qualifiedName, true, outline, p );
					item.addAllTypeDefinitions( p.getOwnedTypeDefinition() );
					 result.add( item );
					 packages.put( qualifiedName, item );
				} else {
					item.addAllTypeDefinitions( p.getOwnedTypeDefinition() );
					item.getPackageParts().add(p);	// the item must know about all its parts
				}
			}	
		
			
		   /* Iterator it = unit.getPackages().iterator();
		    while(it.hasNext()) {
		    	
		    	
		    	
		        Package pack = (Package)it.next();
		       
	            OutlineItem item = new OutlineItem(pack, null, outline);
	            
	            
	            if (!outline.prefPackageTree() || pack.getNestingPackage() == null) {
	                if(outline.prefShowImported() || !item.isPackageFullyImported()) {
		                result.add(item);
		            }
	            }
		    }*/
		    
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

