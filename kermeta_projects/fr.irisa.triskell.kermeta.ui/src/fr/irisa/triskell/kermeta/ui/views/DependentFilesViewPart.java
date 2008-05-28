/*$Id: DependentFilesViewPart.java,v 1.3 2008-05-28 09:25:42 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.ui.DependentFileTreeItem;
import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;
import fr.irisa.triskell.kermeta.ui.UiFactory;

public class DependentFilesViewPart extends ViewPart {

	static final public String ID = "fr.irisa.triskell.kermeta.ui.view.dependentFiles";
	
	static public IFile resource = null;
	
	public TreeViewer treeViewer;
	
	public DependentFilesViewPart() {
	}

	@Override
	public void createPartControl(Composite parent) {
		
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider( KermetaUIPlugin.getTreeContentProvider() );
		treeViewer.setLabelProvider( KermetaUIPlugin.getTreeViewerLabelProvider() );
		treeViewer.addSelectionChangedListener( new DependentFileSelectionChangedListener(this) );
		treeViewer.addDoubleClickListener( new DependenciesDoubleClickListener() );
		
		if ( resource != null ) {
			createInput();
		}
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void createInput() {
		UIJob job = new UIJob("") {
			
			public IStatus runInUIThread(IProgressMonitor monitor) {
				treeViewer.setInput( internCreateInput() );
				return Status.OK_STATUS;
			}
			
		};
		
		job.schedule();
	}
	
	
	private Object[] internCreateInput() {
		Unit unit = KpmManager.getDefault().getUnit( resource );
		Object[] result = new Object[1];
		DependentFileTreeItem item = UiFactory.eINSTANCE.createDependentFileTreeItem();
		item.setValue( unit );
		item.calculateChildren();
		result[0] = item;	
		return result;
	}
	
}
