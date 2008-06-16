/*$Id: InitializeTestCasesModel.java,v 1.9 2008-06-16 13:05:37 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	InitializeTestCasesModel.java
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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.common.KCompilerConstants;
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
	
	protected static void initializeTrekFile(IFolder folder, UseKaseModel useKaseModel) {
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
	
	protected static KTestCase createKTestCase(IFolder folder)
    {
		KTestCase aTestCase = TrekFactory.eINSTANCE.createKTestCase();
		aTestCase.setName(folder.getName());
		aTestCase.setUri(KCompilerConstants.KERMETA_CVS + KCompilerConstants.COMPILER_USE_CASES_FOLDER + folder.getParent().getName() + "/" + folder.getName() + "/input/kermeta" + KCompilerConstants.KERMETA_CVS_VIEW_SUFFIX);
		aTestCase.setType(KTestCaseType.UNIT_TEST);
		
		/*
		 * Print the folder organization for the input and output resources
		 * An inspection of the "input" and "expected_output" folders is done, i.e.: each sub folder is printed between "[" "]" with an url to the corresponding gforge folder
		 */
		String inputResources = "<para>Input resources:";
		String outputResources = "<para>Output resources:";
		
		// Get the docbook xml-text corresponding to the input resources
		inputResources += getRelatedResources(KCompilerConstants.INPUT_FOLDER, folder) + "</para>";
		// Get the docbook xml-text corresponding to the output resources
		outputResources += getRelatedResources(KCompilerConstants.EXPECTED_OUTPUT_FOLDER, folder) + "</para>";
		
		aTestCase.setSummary(inputResources + "\n\n" + outputResources + "\n\n" +TrekModelHelper.getSummaryContent(folder));
		return aTestCase;
    }
	
	private static String getRelatedResources(String targetedFolderName, IFolder folder) {
		String textResources = "";
		if(folder.getFolder(targetedFolderName).exists()) {
			try {
				for(IResource resMember : folder.getFolder(targetedFolderName).members(false)) {
					textResources += " " + getULink(resMember, folder);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return textResources;
	}
	
	private static String getULink(IResource resMember, IFolder folder) {
		return "[<ulink url=\"" + KCompilerConstants.KERMETA_CVS + KCompilerConstants.COMPILER_USE_CASES_FOLDER + folder.getParent().getName() + "/" + folder.getName() + "/" + resMember.getParent().getName() + "/" + resMember.getName() + KCompilerConstants.KERMETA_CVS_VIEW_SUFFIX + "\">" + resMember.getName() + "</ulink>] ";
	}

}
