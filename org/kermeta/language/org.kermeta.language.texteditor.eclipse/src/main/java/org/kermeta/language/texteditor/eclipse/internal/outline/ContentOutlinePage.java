/* Id: ContentOutlinePage.java,v 2.0.1 Apr 19, 2012 4:35:51 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : ContentOutlinePage.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 19, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 		Adjusted the class to allow for lazy loading by adding the SWT.VIRTUAL feature to the treeview
 */

package org.kermeta.language.texteditor.eclipse.internal.outline;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;


public abstract class ContentOutlinePage extends Page implements
	IContentOutlinePage, ISelectionChangedListener {
	private ListenerList selectionChangedListeners = new ListenerList();
	
	private TreeViewer treeViewer;
	
	/**
	* Create a new content outline page.
	*/
	protected ContentOutlinePage() {
	super();
	}
	
	/* (non-Javadoc)
	* Method declared on ISelectionProvider.
	*/
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
	selectionChangedListeners.add(listener);
	}
	
	/**
	* The <code>ContentOutlinePage</code> implementation of this 
	* <code>IContentOutlinePage</code> method creates a tree viewer. Subclasses
	* must extend this method configure the tree viewer with a proper content 
	* provider, label provider, and input element.
	* @param parent
	*/
	public void createControl(Composite parent) {
	treeViewer = new TreeViewer(parent, SWT.VIRTUAL | SWT.MULTI | SWT.H_SCROLL
	        | SWT.V_SCROLL);
	treeViewer.addSelectionChangedListener(this);
	}
	
	/**
	* Fires a selection changed event.
	*
	* @param selection the new selection
	*/
	protected void fireSelectionChanged(ISelection selection) {
	// create an event
	final SelectionChangedEvent event = new SelectionChangedEvent(this,
	        selection);
	
	// fire the event
	Object[] listeners = selectionChangedListeners.getListeners();
	for (int i = 0; i < listeners.length; ++i) {
	    final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
	    SafeRunner.run(new SafeRunnable() {
	        public void run() {
	            l.selectionChanged(event);
	        }
	    });
	}
	}
	
	/* (non-Javadoc)
	* Method declared on IPage (and Page).
	*/
	public Control getControl() {
	if (treeViewer == null) {
		return null;
	}
	return treeViewer.getControl();
	}
	
	/* (non-Javadoc)
	* Method declared on ISelectionProvider.
	*/
	public ISelection getSelection() {
	if (treeViewer == null) {
		return StructuredSelection.EMPTY;
	}
	return treeViewer.getSelection();
	}
	
	/**
	* Returns this page's tree viewer.
	*
	* @return this page's tree viewer, or <code>null</code> if 
	*   <code>createControl</code> has not been called yet
	*/
	protected TreeViewer getTreeViewer() {
	return treeViewer;
	}
	
	/*
	*  (non-Javadoc)
	* @see org.eclipse.ui.part.IPageBookViewPage#init(org.eclipse.ui.part.IPageSite)
	*/
	public void init(IPageSite pageSite) {
	super.init(pageSite);
	pageSite.setSelectionProvider(this);
	}
	
	/* (non-Javadoc)
	* Method declared on ISelectionProvider.
	*/
	public void removeSelectionChangedListener(
	    ISelectionChangedListener listener) {
	selectionChangedListeners.remove(listener);
	}
	
	/* (non-Javadoc)
	* Method declared on ISelectionChangeListener.
	* Gives notification that the tree selection has changed.
	*/
	public void selectionChanged(SelectionChangedEvent event) {
	fireSelectionChanged(event.getSelection());
	}
	
	/**
	* Sets focus to a part in the page.
	*/
	public void setFocus() {
	treeViewer.getControl().setFocus();
	}
	
	/* (non-Javadoc)
	* Method declared on ISelectionProvider.
	*/
	public void setSelection(ISelection selection) {
	if (treeViewer != null) {
		treeViewer.setSelection(selection);
	}
	}
}
