/* Id: OutlineContentProvider.java,v 2.0.1 Apr 17, 2012 12:35:04 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : OutlineContentProvider.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 17, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class OutlineContentProvider implements ITreeContentProvider {

	public OutlineContentProvider(){
		// TODO Implement constructor
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] getChildren(Object arg0) {
		// TODO Auto-generated method stub
		return new Object[0];
	}

	@Override
	public Object[] getElements(Object arg0) {
		// TODO Auto-generated method stub
		return new Object[0];
	}

	@Override
	public Object getParent(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
