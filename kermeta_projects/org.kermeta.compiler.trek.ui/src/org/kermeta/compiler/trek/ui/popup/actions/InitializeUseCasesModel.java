/*$Id: InitializeUseCasesModel.java,v 1.1 2007-11-28 12:20:25 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeUseCasesModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.UseKaseModel;


public class InitializeUseCasesModel implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for Action1.
	 */
	public InitializeUseCasesModel() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		for(IFolder folder : folders) {
			UseKaseModel useKaseModel = createUseKaseModel(folder);
			initializeTrekFile(folder, useKaseModel);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			folders.clear();
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof IFolder) {
					folders.add((IFolder) obj);
				}
			}
		}
	}
	
	private void initializeTrekFile(IFolder folder, UseKaseModel useKaseModel) {
		try {
			for(IResource subResource : folder.members(false) ) {
				if(subResource instanceof IFolder) {
					IFolder subFolder = (IFolder) subResource;
					useKaseModel.getKuseCases().add(createKUseCase(subFolder));
				}
			}
			
			useKaseModel.eResource().save(null);
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private UseKaseModel createUseKaseModel(IFolder folder)
    {
		IFile trek_file = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension("trek"));
		return TrekModelHelper.createUseKaseModel(trek_file);
    }
	
	private KUseCase createKUseCase(IFolder folder)
    {
		KUseCase aUseCase = TrekFactory.eINSTANCE.createKUseCase();
		aUseCase.setName(CodeGenUtil.capName(folder.getName().substring(5)));
		aUseCase.setId(folder.getName());
		aUseCase.setSummary(TrekModelHelper.getSummaryContent(folder));
		aUseCase.getStatus().add(TrekModelHelper.newStatus("Design",100));
		aUseCase.getStatus().add(TrekModelHelper.newStatusImpl("Java",100));
		aUseCase.getStatus().add(TrekModelHelper.newStatusImpl("Kermeta",0));
		return aUseCase;
    }

}
