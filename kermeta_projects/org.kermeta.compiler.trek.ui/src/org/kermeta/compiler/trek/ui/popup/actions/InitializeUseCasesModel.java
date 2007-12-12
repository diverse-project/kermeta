/*$Id: InitializeUseCasesModel.java,v 1.6 2007-12-12 18:05:48 cfaucher Exp $
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
import org.kermeta.compiler.trek.ui.KCompilerConstants;
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
	
	protected static KUseCase createKUseCase(IFolder folder)
    {
		KUseCase aUseCase = TrekFactory.eINSTANCE.createKUseCase();
		aUseCase.setName(CodeGenUtil.capName(folder.getName().substring(5)));
		aUseCase.setId(folder.getName());
		aUseCase.setSummary(TrekModelHelper.getSummaryContent(folder));
		
		Map<String, Integer> map = TrekModelHelper.getProgressContent(folder);
		
		if(map.get(KCompilerConstants.STATUS_DESIGN)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatus(KCompilerConstants.STATUS_DESIGN, map.get(KCompilerConstants.STATUS_DESIGN)));
		if(map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_JAVA)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatusImpl(KCompilerConstants.STATUS_JAVA, map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_JAVA)));
		if(map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_KERMETA)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatusImpl(KCompilerConstants.STATUS_KERMETA, map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_KERMETA)));
		if(map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_JET)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatusImpl(KCompilerConstants.STATUS_JET, map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_JET)));
		if(map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_KET)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatusImpl(KCompilerConstants.STATUS_KET, map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_KET)));
		if(map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_SIMK)!=null)
			aUseCase.getStatus().add(TrekModelHelper.newStatusImpl(KCompilerConstants.STATUS_SIMK, map.get(KCompilerConstants.IMPL_PREFIX + KCompilerConstants.STATUS_SIMK)));
		
		return aUseCase;
    }

}
