/* $Id: Art2UIFactory.java 11975 2010-08-02 16:02:55Z dvojtise $ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.editor.eclipse.popup.actions;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;

import javax.swing.JFrame;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.art2.ui.editor.Art2Editor;

public class OpenGraphicalEditorAction implements IObjectActionDelegate {

	private Shell shell;
	protected IFile selectedIFile=null;
	
	/**
	 * Constructor for Action1.
	 */
	public OpenGraphicalEditorAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		JFrame jframe = new JFrame("Art2 UI Tester");
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setPreferredSize(new Dimension(800, 600));

        Art2Editor artpanel = new Art2Editor();
        jframe.add(artpanel.getPanel(),BorderLayout.CENTER);

        //System.out.println(selectedIFile.getLocation().toFile().getPath());
        artpanel.loadModel("file://"+selectedIFile.getLocation().toFile().getPath());


        jframe.pack();
        jframe.setVisible(true);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				if (element instanceof IFile) {
					selectedIFile = (IFile) element;
				} else if (element instanceof IAdaptable) {
					selectedIFile = (IFile) ((IAdaptable) element)
							.getAdapter(IFile.class);
				}
			}
		}
	}

}
