/*$Id: InitializeUseCasesModel.java,v 1.10 2008-06-16 13:05:37 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeUseCasesModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
		initializeTrekFiles(this.folders);
	}
	
	/**
	 * 
	 * @param folders
	 */
	public static void initializeTrekFiles(List<IFolder> folders) {
		for(IFolder folder : folders) {
			UseKaseModel useKaseModel = TrekModelHelper.createUseKaseModel(folder);
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
	
	/**
	 * 
	 * @param folder
	 * @param useKaseModel
	 */
	protected static void initializeTrekFile(IFolder folder, UseKaseModel useKaseModel) {
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
	
	/**
	 * Create a Use Case from the metadata contained in the a "Use Case" folder
	 * @param folder
	 * @return
	 */
	protected static KUseCase createKUseCase(IFolder folder)
    {
		KUseCase aUseCase = TrekFactory.eINSTANCE.createKUseCase();
		aUseCase.setName(CodeGenUtil.capName(folder.getName().substring(5)));
		aUseCase.setId(folder.getName());
		aUseCase.setSummary(TrekModelHelper.getSummaryContent(folder));
		
		Map<String, String> map = TrekModelHelper.getProgressContent(folder);
		
		// Create the status and add it to the given use case
		// Status are created from the Map that is extracted from the "progress" file
		if(map != null) {
			for(String key : map.keySet()) {
				if( map.get(key) != null ) {
					aUseCase.getStatus().add(TrekModelHelper.newStatus(key, Integer.parseInt(map.get(key))));
				}
			}
		}
		
		return aUseCase;
    }

}
