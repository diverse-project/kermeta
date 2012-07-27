/* Id: LazyTreeContentPtovider.java,v 2.0.1 Apr 19, 2012 4:12:47 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : LazyTreeContentPtovider.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 19, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import org.eclipse.jface.viewers.ILazyTreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;



public class LazyTreeContentProvider implements ILazyTreeContentProvider {

	
	private TreeViewer viewer;
	//private OutlineItem root = new OutlineItem("root");
	private Object input;

	public LazyTreeContentProvider(TreeViewer viewer) {
		this.viewer = viewer;
	}
	

	public void dispose() {
		// do nothing
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.input = newInput;
	}

	public Object getParent(Object element) {
		if (element instanceof OutlineItem) {
			return ((OutlineItem)element).getParent();
		}
		return input;
	}

	public void updateChildCount(Object element, int currentChildCount) {
		if (element instanceof OutlineItem){
			viewer.setChildCount(element, ((OutlineItem)element).getNoOfChildren());
			
		}
	}
	

	@Override
	public void updateElement(Object parent, int index) {
		if (parent instanceof OutlineItem){
			if (index < ((OutlineItem)parent).getNoOfChildren()){
				System.out.println("  updateElement "+((OutlineItem)parent).getLabel()+ " at "+index);
				OutlineItem node = (OutlineItem)parent;
				OutlineItem element = (OutlineItem) node.getChildren()[index];
				viewer.replace(parent, index, element);
				//updateChildCount(element, element.getNoOfChildren());				
				viewer.setHasChildren(element, element.getNoOfChildren() > 0); // indicates that the real count will be updated later
				
			}
		}
	}
	
	public void refreshViewer(){
		viewer.refresh();
	}
}
