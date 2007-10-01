

/*$Id: MergeAction.java,v 1.1 2007-10-01 15:07:49 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	MergeAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class MergeAction implements IObjectActionDelegate {

	private LinkedHashSet<KermetaUnit> kermetaUnitsToMerge = new LinkedHashSet<KermetaUnit> ();
	
	private boolean done = false;
	
	public MergeAction() {}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	@Override
	public void run(IAction action) {
		
		Merger merger = new Merger();
		try {
			merger.process(kermetaUnitsToMerge);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} finally {
			kermetaUnitsToMerge.clear();
			done = true;
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		TreeSelection treeSelection = (TreeSelection) selection;
		Iterator<?> it = treeSelection.iterator();
		
		if ( ! done )
			kermetaUnitsToMerge.clear();
		
		while ( it.hasNext() ) {

			Object o = it.next();
			if ( o instanceof IFile ) {
				IFile file = (IFile) o;
				KermetaUnit a;
				try {
					a = IOPlugin.getDefault().loadKermetaUnit("platform:/resource" + file.getFullPath().toString(), new NullProgressMonitor());
					kermetaUnitsToMerge.add(a);
					kermetaUnitsToMerge.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(a) );
					done = false;
				} catch (KermetaIOFileNotFoundException e) {
					e.printStackTrace();
				} catch (URIMalformedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}


