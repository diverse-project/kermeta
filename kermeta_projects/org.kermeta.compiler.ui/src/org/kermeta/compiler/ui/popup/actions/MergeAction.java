

/*$Id: MergeAction.java,v 1.4 2008-02-15 14:33:50 cfaucher Exp $
* Project : org.kermeta.compiler.ui
* File : 	MergeAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 31 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.ui.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class MergeAction implements IObjectActionDelegate {

	private IFile file;
	
	private ArrayList<KermetaUnit> excludedKmUnit = new ArrayList<KermetaUnit>();
	
	public MergeAction() {
		//initExcludedKmUnit();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}
	
	private void initExcludedKmUnit() {
		String kermetaMainPath = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/";
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "standard/java.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "ecore/ecore_compatibility.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "language/dynamic_expression.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "io/file_io.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "kunit/kunit.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "kunit/assert.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "utils/StringBuffer.km"));
		excludedKmUnit.add(IOPlugin.getDefault().findKermetaUnit(kermetaMainPath + "utils/stack.km"));
	}

	private String getOutputFilePath() {
		return "platform:/resource" + file.getFullPath().removeFileExtension().toString() + "_merged.km";
	}
	
	public void run(IAction action) {
		
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				try {
					String uri = "platform:/resource" + file.getFullPath().toString();
					KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(uri, null);
					LinkedHashSet<KermetaUnit> context = new LinkedHashSet<KermetaUnit>();
					context.add(kermetaUnit);
					for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit)) {
						if( ! excludedKmUnit.contains(IOPlugin.getDefault().findKermetaUnit(unit.getUri())) ) {
							context.add(unit);
							System.out.println(unit.getUri());
						}
					}
					
					Merger merger = new Merger();
					merger.process(context, getOutputFilePath());
				} catch (URIMalformedException e) {
					e.printStackTrace();
				} catch (NotRegisteredURIException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				file = null;
			}
		};

		try {
			ResourcesPlugin.getWorkspace().run(r, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		TreeSelection treeSelection = (TreeSelection) selection;
		file = (IFile) treeSelection.getFirstElement();
	}

}


