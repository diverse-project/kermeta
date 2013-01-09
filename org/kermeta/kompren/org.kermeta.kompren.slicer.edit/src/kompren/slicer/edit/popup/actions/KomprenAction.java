package kompren.slicer.edit.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class KomprenAction implements IObjectActionDelegate {
	
	protected List<IFile> paths;
	
	public KomprenAction() {
		super();
		paths = new ArrayList<IFile>();
	}
	
	@Override
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
//		shell = targetPart.getSite().getShell();
	}
	
	
	protected abstract boolean supportExtension(final IFile file);
	
	
	@Override
	public void selectionChanged(final IAction action, final ISelection selection) {
		paths.clear();

		if(selection!=null && !selection.isEmpty() && selection instanceof StructuredSelection) {
			List<?> listSel = ((StructuredSelection)selection).toList();

			for(Object obj : listSel)
				if(obj instanceof IFile && supportExtension((IFile)obj))
					paths.add((IFile)obj);
		}

		action.setEnabled(!paths.isEmpty());
	}
}
