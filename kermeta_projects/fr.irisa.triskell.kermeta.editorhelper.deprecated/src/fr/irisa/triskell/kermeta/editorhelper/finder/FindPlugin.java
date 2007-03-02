/*$Id: FindPlugin.java,v 1.4 2007-03-02 13:26:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.editorfinder
* File : 	FindPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 28, 2007
* Authors : cfaucher
* Adaptation in order to enable this finder in the Kermeta reflexive editor
* The original source of this file is the 1.1 version
*/

/*******************************************************************************
 * Copyright (c) 2007 Ecliptical Software Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ecliptical Software Inc. - initial API and implementation
 *******************************************************************************/
package fr.irisa.triskell.kermeta.editorhelper.finder;

import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class FindPlugin extends AbstractUIPlugin implements IStartup, IWindowListener, IPageListener, IPartListener2 {

	// The plug-in ID
	// Modified for Kermeta
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.editorhelper";

	// The shared instance
	private static FindPlugin plugin;
	
	private FindDialog findDialog;
	
	/**
	 * The constructor
	 */
	public FindPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		try {
			Display display = getWorkbench().getDisplay();
			if (display != null && !display.isDisposed()) {
				if (display == Display.getCurrent()) {
					doStop();
				} else {
					display.syncExec(new Runnable() {
						public void run() {
							doStop();
						}
					});
				}
			}
		} finally {
			plugin = null;
			super.stop(context);
		}
	}

	private void doStop() {
		if (getDefault().findDialog != null) {
			getDefault().findDialog.close();
			getDefault().findDialog = null;
		}
		
		stopListening();
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static FindPlugin getDefault() {
		return plugin;
	}

	// Added for Kermeta
	private HashSet <String> editorIDs = new HashSet <String> ();
	private Hashtable <String, IConfigurationElement> editorContributor = new Hashtable <String, IConfigurationElement> ();

	// Added for Kermeta
	private void initialize() {
		
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("fr.irisa.triskell.kermeta.editorhelper", "emfSearch");
		for (int i = 0; i < elements.length; i++) {
			
			getDefault().editorIDs.add( elements[i].getAttribute("id") );
			getDefault().editorContributor.put(elements[i].getAttribute("id"), elements[i]);
			
		}
		
	}
	
	static public String getClass(String editorID) {
		IConfigurationElement element = getDefault().editorContributor.get(editorID);
		return element.getAttribute("class");
	}
	
	static public IConfigurationElement getConfigurationElement(String editorID) {
		return getDefault().editorContributor.get(editorID);
	}
	
	static public boolean isEditorExtended(String editorID) {
		return getDefault().editorIDs.contains( editorID );
	}
	
	
	public void earlyStartup() {
		initialize();
		getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				startListening();
			}
		});
	}
	
	private void startListening() {
		IWorkbench wb = getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		if (window != null)
			windowActivated(window);
		
		wb.addWindowListener(this);
	}
	
	private void stopListening() {
		IWorkbench wb = getWorkbench();
		wb.removeWindowListener(this);
		IWorkbenchWindow[] windows = wb.getWorkbenchWindows();
		for (int i = 0; i < windows.length; ++i) {
			windows[i].removePageListener(this);
			IWorkbenchPage[] pages = windows[i].getPages();
			for (int j = 0; j < pages.length; ++j) {
				pages[j].removePartListener(this);
				IEditorReference[] editorRefs = pages[j].getEditorReferences();
				for (int k = 0; k < editorRefs.length; ++k)
					editorClosed(editorRefs[k]);
			}
		}
	}
	
	public void windowActivated(IWorkbenchWindow window) {
		IWorkbenchPage page = window.getActivePage();
		if (page != null)
			pageOpened(page);

		window.addPageListener(this);
	}
	
	public void windowDeactivated(IWorkbenchWindow window) {
		// do nothing
	}
	
	public void windowOpened(IWorkbenchWindow window) {
		// do nothing
	}
	
	public void windowClosed(IWorkbenchWindow window) {
		window.removePageListener(this);
	}
	
	public void pageActivated(IWorkbenchPage page) {
		// this is never called; we must handle opening instead
	}
	
	public void pageOpened(IWorkbenchPage page) {
		IWorkbenchPartReference partRef = page.getActivePartReference();
		if (partRef != null)
			partActivated(partRef);

		page.addPartListener(this);
	}
	
	public void pageClosed(IWorkbenchPage page) {
		page.removePartListener(this);
	}
	
	public void partActivated(IWorkbenchPartReference partRef) {
		if (partRef instanceof IEditorReference)
			editorActivated((IEditorReference) partRef);
		else if (getDefault().findDialog != null)
			getDefault().findDialog.setEditor(null);
	}
	
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// do nothing
	}
	
	public void partOpened(IWorkbenchPartReference partRef) {
		// do nothing
	}
	
	public void partClosed(IWorkbenchPartReference partRef) {
		if (partRef instanceof IEditorReference)
			editorClosed((IEditorReference) partRef);
	}
	
	public void partVisible(IWorkbenchPartReference partRef) {
		// do nothing
	}
	
	public void partHidden(IWorkbenchPartReference partRef) {
		// do nothing
	}
	
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// do nothing
	}
	
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// do nothing
	}

	private void editorActivated(IEditorReference partRef) {
		IEditorPart editor = null;
		if (getDefault().editorIDs.contains(partRef.getId())) {
			editor = ((IEditorReference) partRef).getEditor(false);
			if (editor != null) {
				IActionBars bars = editor.getEditorSite().getActionBars();
				if (bars.getGlobalActionHandler(ActionFactory.FIND.getId()) == null) {
					bars.setGlobalActionHandler(ActionFactory.FIND.getId(), new FindAction(editor, ((IEditorReference) partRef).getId()));
					bars.updateActionBars();
				}
			}
		}

		if (getDefault().findDialog != null)
			getDefault().findDialog.setEditor(editor);
	}
	
	private void editorClosed(IEditorReference partRef) {
		if (getDefault().editorIDs.contains(partRef.getId())) {
			IEditorPart editor = ((IEditorReference) partRef).getEditor(false);
			if (editor == null)
				return;
			
			if (getDefault().findDialog != null && editor == getDefault().findDialog.getEditor())
				getDefault().findDialog.setEditor(null);
			
			IActionBars bars = editor.getEditorSite().getActionBars();
			if (bars.getGlobalActionHandler(ActionFactory.FIND.getId()) instanceof FindAction) {
				bars.setGlobalActionHandler(ActionFactory.FIND.getId(), null);
				bars.updateActionBars();
			}
		}
	}
	
	void openFindDialog(IEditorPart editorPart, String editorID) {
		if (getDefault().findDialog == null) {
			getDefault().findDialog = new FindDialog(editorPart.getSite().getShell());
			getDefault().findDialog.setEditorID(editorID);
			getDefault().findDialog.setEditor(editorPart);
			getDefault().findDialog.create();
			getDefault().findDialog.getShell().addDisposeListener(new DisposeListener() {
				public void widgetDisposed(DisposeEvent e) {
					getDefault().findDialog = null;
				}
			});
		}

		getDefault().findDialog.open();
	}
}
