/* $Id: Generator.java,v 1.8 2008-02-06 10:14:38 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : Generator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 *        Olivier Barais <barais@irisa.fr>
 *        Cyril Faucher <cfaucher@irisa.fr>
 * Description : 
 *   First iteration of a template engine for Kermeta
 */

package fr.irisa.triskell.kermeta.ket;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Generator implements IObjectActionDelegate {

	/**
	 * Current selection of files
	 */
	private StructuredSelection currentSelection;

	/**
	 * List of ketffiles to compile into kmt
	 */
	private List<IFile> ketfiles;

	public Generator() {
	}

	/**
	 * 
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
	}

	/**
	 * 
	 */
	public void run(IAction action) {
		Shell shell = new Shell();

		GeneratorHelper gh = new GeneratorHelper();

		for (IFile ketfile : this.ketfiles) {
			gh.generate(ketfile);
			try {
				ketfile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * @param ketfile
	 * @param outputURI
	 */
	public void generate(IFile ketfile, String outputURI) {
		GeneratorHelper gh = new GeneratorHelper();
		gh.generate(ketfile, outputURI);
	}
	

	/**
	 * 
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			ketfiles = new ArrayList<IFile>();
			// the selection should be a single *.ket file or multiple
			currentSelection = (StructuredSelection) selection;

			for (Object res : currentSelection.toList()) {
				if (res instanceof IFile) {
					this.ketfiles.add((IFile) res);
				}
			}

		}

	}

}
