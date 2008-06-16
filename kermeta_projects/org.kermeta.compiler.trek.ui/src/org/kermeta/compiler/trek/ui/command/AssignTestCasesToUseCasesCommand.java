/*$Id: AssignTestCasesToUseCasesCommand.java,v 1.6 2008-06-16 13:04:05 cfaucher Exp $
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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.trek.ui.exception.RefinesUCWFRException;
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

	/**
	 * 
	 */
	public void execute() {
		
		// Get the use cases contained into selected "trek" files
		// These use cases are global for all the test cases
		usecasesResources.clear();
		testcasesResources.clear();
		HashMap<String, KUseCase> useCases = getUseCases(usecasesFiles);
		for(IFolder folder : folders) {
			assignTestCasesToUseCases(useCases, folder);
		}

		try {
			// Save the "use cases resources" after the assignment of test cases to use cases
			for (Resource ucR : usecasesResources) {
				ucR.save(null);
			}
			for (Resource tcR : testcasesResources) {
				tcR.save(null);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param folder
	 * @return
	 */
	private List<KTestCase> getTestCases(IFolder folder) {
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
	private HashMap<String, KUseCase> getUseCases(List<IFile> trek_files) {

		HashMap<String, KUseCase> useCases = new HashMap<String, KUseCase>();
		for (IFile trek_file : trek_files) {
			UseKaseModel useKaseModel = TrekModelHelper.getUseKaseModel(trek_file);
			usecasesResources.add(useKaseModel.eResource());
			
			for (KUseCase uC : useKaseModel.getKuseCases()) {
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
	private void assignTestCasesToUseCases(HashMap<String, KUseCase> useCases, IFolder useCaseFolder) {
		List<KTestCase> current_testcases = getTestCases(useCaseFolder);
		
		// This map will be used to retrieve a test case from its name
		HashMap<String, KTestCase> map_current_testcases = new HashMap<String, KTestCase>();
		for (KTestCase tc : current_testcases) {
			map_current_testcases.put(tc.getName(), tc);
		}
		
		try {
			// Assign the test cases that are contained by the current use case
			if ( useCases.get(useCaseFolder.getName()) != null ) {
				KUseCase theKUseCase = useCases.get(useCaseFolder.getName());
				theKUseCase.getVerifiedBy().addAll(current_testcases);
				Collection<String> refined_ucs;
				
				refined_ucs = TrekModelHelper.getRefinesUCContent(useCaseFolder);
				
				// There is only one refined use case, because the Trek model defines that
				// a use case is able to refine a unique use case
				if (refined_ucs!=null && refined_ucs.size()==1) {
					theKUseCase.setRefines(useCases.get(refined_ucs.toArray()[0]));
				}
				
			}
		} catch (RefinesUCWFRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Assign the test cases to the use cases by using information that are stored in the "verifies" file
		try {
			// Iteration on the test case folders
			for(IResource ires : useCaseFolder.members()) {
				if( ires instanceof IFolder ) {
					IFolder testCaseFolder = (IFolder) ires;
					Collection<String> verifiesUCContent = TrekModelHelper.getVerifiesUCContent(testCaseFolder);
					if( verifiesUCContent != null && verifiesUCContent.size()>0 ) {
						for ( String id_uc : verifiesUCContent ) {
							KTestCase current_tc = map_current_testcases.get(testCaseFolder.getName());
							KUseCase current_uc = useCases.get(id_uc);
							if ( current_uc != null && current_tc != null && !current_uc.getVerifiedBy().contains(current_tc) ) {
								current_uc.getVerifiedBy().add(current_tc);
							}
						}
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}