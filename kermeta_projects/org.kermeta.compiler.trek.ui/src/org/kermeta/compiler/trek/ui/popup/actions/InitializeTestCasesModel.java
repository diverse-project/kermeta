/*$Id: InitializeTestCasesModel.java,v 1.3 2007-11-30 13:24:53 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTestCasesModel.java
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
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.compiler.trek.ui.KCompilerConstants;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KTestCaseType;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.UseKaseModel;


public class InitializeTestCasesModel implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	/**
	 * Constructor for Action1.
	 */
	public InitializeTestCasesModel() {
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
					useKaseModel.getKtestCases().add(createKTestCase(subFolder));
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
		IFile trek_file = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension(KCompilerConstants.TREK_EXT));
		return TrekModelHelper.createUseKaseModel(trek_file);
    }
	
	private KTestCase createKTestCase(IFolder folder)
    {
		KTestCase aTestCase = TrekFactory.eINSTANCE.createKTestCase();
		aTestCase.setName(folder.getName());
		aTestCase.setUri(KCompilerConstants.KERMETA_CVS + KCompilerConstants.COMPILER_USE_CASES_FOLDER + folder.getParent().getName() + "/" + folder.getName() + KCompilerConstants.KERMETA_CVS_VIEW_SUFFIX);
		aTestCase.setType(KTestCaseType.UNIT_TEST);
		
		String inputResources = "Input resources:\n";
		String outputResources = "Output resources:\n";
		
		try {
			
			if(folder.getFolder("input").exists()) {
				for(IResource resMember : folder.getFolder("input").members(false)) {
					inputResources += "[" + resMember.getName() + "] ";
				}
			}
			if(folder.getFolder("expected_output").exists()) {
				for(IResource resMember : folder.getFolder("expected_output").members(false)) {
					outputResources += "[" + resMember.getName() + "] ";
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aTestCase.setSummary(inputResources + "\n\n" + outputResources + "\n\n" +TrekModelHelper.getSummaryContent(folder));
		return aTestCase;
    }

}
