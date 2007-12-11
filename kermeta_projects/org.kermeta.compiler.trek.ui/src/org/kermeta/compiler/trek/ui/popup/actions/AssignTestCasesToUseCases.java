/*$Id: AssignTestCasesToUseCases.java,v 1.5 2007-12-11 20:16:44 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	AssignTestCasesToUseCases.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.compiler.trek.ui.KCompilerConstants;
import org.kermeta.compiler.trek.ui.command.AssignTestCasesToUseCasesCommand;


public class AssignTestCasesToUseCases implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFile> usecasesFiles = new ArrayList<IFile>();
	
	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	//private List<Resource> usecasesResources = new ArrayList<Resource>();
	
	//private List<Resource> testcasesResources = new ArrayList<Resource>();
	
	/**
	 * Constructor for Action1.
	 */
	public AssignTestCasesToUseCases() {
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
		/*
		// Get the use cases contained into selected "trek" files
		// These use cases are global for all the test cases
		usecasesResources.clear();
		testcasesResources.clear();
		Hashtable<String, KUseCase> useCases = getUseCases(usecasesFiles);
		for(IFolder folder : folders) {
			assignTestCasesToUseCases(useCases, folder);
		}
		
		try {
			// Save the "use cases resources" after the assignment of test cases to use cases
			for(Resource ucR : usecasesResources) {
				ucR.save(null);
			}
			for(Resource tcR : testcasesResources) {
				tcR.save(null);
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		AssignTestCasesToUseCasesCommand cmd = new AssignTestCasesToUseCasesCommand(usecasesFiles, folders);
		cmd.execute();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		
		usecasesFiles.clear();
		folders.clear();
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof IFile && ((IFile)obj).getFileExtension().equals(KCompilerConstants.TREK_EXT) ) {
					usecasesFiles.add((IFile) obj);
				}
				if(obj instanceof IFolder) {
					folders.add((IFolder) obj);
				}
			}
		}
		
		if(usecasesFiles.size()>0 && folders.size()>0) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
			
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	/*private List<KTestCase> getTestCases(IFolder folder)
    {
		IFile trek_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension(KCompilerConstants.TREK_EXT));
		UseKaseModel useKaseModel = TrekModelHelper.getUseKaseModel(trek_file);
		testcasesResources.add(useKaseModel.eResource());
		
		return useKaseModel.getKtestCases();
    }*/
	
	/**
	 * 
	 * @param trek_files
	 * @return
	 */
	/*private Hashtable<String, KUseCase> getUseCases(List<IFile> trek_files) {

		Hashtable<String, KUseCase> useCases = new Hashtable<String, KUseCase>();
		for(IFile trek_file : trek_files) {
			UseKaseModel useKaseModel = TrekModelHelper.getUseKaseModel(trek_file);
			usecasesResources.add(useKaseModel.eResource());
			
			for(KUseCase uC : useKaseModel.getKuseCases()) {
				useCases.put(uC.getId(), uC);
			}
		}
		return useCases;
	}*/

	/**
	 * 
	 * @param useCases
	 * @param testCaseFolder
	 */
	/*private void assignTestCasesToUseCases(Hashtable<String, KUseCase> useCases, IFolder testCaseFolder) {
		KUseCase theKUseCase = useCases.get(testCaseFolder.getName());
		theKUseCase.getVerifiedBy().addAll(getTestCases(testCaseFolder));
	}*/

}
