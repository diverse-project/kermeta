package fr.irisa.triskell.kermeta.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;
import fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem;
import fr.irisa.triskell.kermeta.ui.KermetaUIPlugin;
import fr.irisa.triskell.kermeta.ui.UiFactory;

public class FileDependenciesViewPart extends ViewPart {

	static final public String ID = "fr.irisa.triskell.kermeta.ui.views.fileDependencies";
	
	static public IFile resource = null;
	
	public TreeViewer treeViewer;
	
	public FileDependenciesViewPart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider( KermetaUIPlugin.getTreeContentProvider() );
		treeViewer.setLabelProvider( KermetaUIPlugin.getTreeViewerLabelProvider() );
		treeViewer.addSelectionChangedListener( new FileDependenciesSelectionChangedListener(this) );
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
		
			KermetaProject project = KermetaWorkspace.getInstance().getKermetaProject( resource.getProject() );
			Unit unit = project.getKpm().findUnit( resource.getFullPath().toString() );
	
			Object[] result = new Object[1];
			FileDependencyTreeItem item = UiFactory.eINSTANCE.createFileDependencyTreeItem();
			item.setValue( unit );
			item.calculateChildren();
			result[0] = item;	
			
		return result;
	}
	
}
