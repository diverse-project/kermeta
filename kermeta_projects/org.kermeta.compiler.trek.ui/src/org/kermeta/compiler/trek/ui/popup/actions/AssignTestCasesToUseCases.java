/*$Id: AssignTestCasesToUseCases.java,v 1.1 2007-11-28 12:20:25 cfaucher Exp $
* Project : org.kermeta.compiler.trek.ui
* File : 	AssignTestCasesToUseCases.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 nov. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.trek.ui.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.UseKaseModel;


public class AssignTestCasesToUseCases implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;

	protected List<IFile> usecasesFiles = new ArrayList<IFile>();
	
	protected List<IFolder> folders = new ArrayList<IFolder>();
	
	private List<Resource> usecasesResources = new ArrayList<Resource>();
	
	private List<Resource> testcasesResources = new ArrayList<Resource>();
	
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
				if(obj instanceof IFile && ((IFile)obj).getFileExtension().equals("trek") ) {
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
	private List<KTestCase> getTestCases(IFolder folder)
    {
		IFile trek_file = IDEWorkbenchPlugin.getPluginWorkspace().getRoot().getFile(folder.getFullPath().append("/" + folder.getName()).addFileExtension("trek"));
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trek",new XMIResourceFactoryImpl());
		ResourceSet trek_resource_set = new ResourceSetImpl();
		URI u = URI.createURI(trek_file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		Resource trek_resource = trek_resource_set.getResource(u, true);
		
		testcasesResources.add(trek_resource);
		
		return ((UseKaseModel) trek_resource.getContents().get(0)).getKtestCases();
    }
	
	/**
	 * 
	 * @param trek_files
	 * @return
	 */
	private Hashtable<String, KUseCase> getUseCases(List<IFile> trek_files) {

		Hashtable<String, KUseCase> useCases = new Hashtable<String, KUseCase>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trek",new XMIResourceFactoryImpl());
		for(IFile trek_file : trek_files) {
			ResourceSet trek_resource_set = new ResourceSetImpl();
			URI u = URI.createURI(trek_file.getFullPath().toString());
	    	u = new URIConverterImpl().normalize(u);
			Resource trek_resource = trek_resource_set.getResource(u, true);
			usecasesResources.add(trek_resource);
			
			for(KUseCase uC : ((UseKaseModel) trek_resource.getContents().get(0)).getKuseCases()) {
				System.out.println(uC.getId() + " " + uC);
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
