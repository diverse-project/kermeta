/*$Id: AssignTestCasesToUseCasesCommand.java,v 1.1 2007-12-11 20:16:44 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	AssignTestCasesToUseCasesCommand.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 dec. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.kermeta.compiler.trek.ui.KCompilerConstants;
import org.kermeta.compiler.trek.ui.popup.actions.TrekModelHelper;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.UseKaseModel;

public class AssignTestCasesToUseCasesCommand {

	protected List<IFile> usecasesFiles = new ArrayList<IFile>();
	
	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	private List<Resource> usecasesResources = new ArrayList<Resource>();
	
	private List<Resource> testcasesResources = new ArrayList<Resource>();

	/**
	 * Constructor of a AssignTestCasesToUseCasesCommand
	 */
	public AssignTestCasesToUseCasesCommand(List<IFile> usecasesFiles, List<IFolder> folders) {
		this.usecasesFiles = usecasesFiles;
		this.folders = folders;
	}

	
	public void execute() {
		
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
		}
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	private List<KTestCase> getTestCases(IFolder folder)
    {
		IFile trek_file = ResourcesPlugin.getWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension(KCompilerConstants.TREK_EXT));
		UseKaseModel useKaseModel = TrekModelHelper.getUseKaseModel(trek_file);
		testcasesResources.add(useKaseModel.eResource());
		
		return useKaseModel.getKtestCases();
    }
	
	/**
	 * 
	 * @param trek_files
	 * @return
	 */
	private Hashtable<String, KUseCase> getUseCases(List<IFile> trek_files) {

		Hashtable<String, KUseCase> useCases = new Hashtable<String, KUseCase>();
		for(IFile trek_file : trek_files) {
			UseKaseModel useKaseModel = TrekModelHelper.getUseKaseModel(trek_file);
			usecasesResources.add(useKaseModel.eResource());
			
			for(KUseCase uC : useKaseModel.getKuseCases()) {
				useCases.put(uC.getId(), uC);
			}
		}
		return useCases;
	}

	/**
	 * 
	 * @param useCases
	 * @param testCaseFolder
	 */
	private void assignTestCasesToUseCases(Hashtable<String, KUseCase> useCases, IFolder testCaseFolder) {
		KUseCase theKUseCase = useCases.get(testCaseFolder.getName());
		theKUseCase.getVerifiedBy().addAll(getTestCases(testCaseFolder));
	}
	
}


