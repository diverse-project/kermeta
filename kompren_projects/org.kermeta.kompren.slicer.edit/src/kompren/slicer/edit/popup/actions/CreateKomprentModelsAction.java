package kompren.slicer.edit.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class CreateKomprentModelsAction implements IObjectActionDelegate {
	private List<IFile> paths;


	public CreateKomprentModelsAction() {
		super();
		paths = new ArrayList<IFile>();
	}


	@Override
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		//
	}


	@Override
	public void run(final IAction action) {
		for(final IFile file : paths)
			convertKomprentFile(file);
	}



	private void convertKomprentFile(final IFile file) {
		org.kermeta.kompren.MainRunner.convertAsXMI(file.getLocation().toString());
		try { file.getParent().refreshLocal(IResource.DEPTH_ONE, null); }
		catch(final CoreException ex) { ex.printStackTrace(System.err); }
	}



	@Override
	public void selectionChanged(final IAction action, final ISelection selection) {
		paths.clear();

		if(selection!=null && !selection.isEmpty() && selection instanceof StructuredSelection) {
			List<?> listSel = ((StructuredSelection)selection).toList();

			for(Object obj : listSel)
				if(obj instanceof IFile && ((IFile)obj).getFileExtension().equals("komprent"))
					paths.add((IFile)obj);
		}

		action.setEnabled(!paths.isEmpty());
	}
}
