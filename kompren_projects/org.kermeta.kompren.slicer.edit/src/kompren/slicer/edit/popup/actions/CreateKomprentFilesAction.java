package kompren.slicer.edit.popup.actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org2.kermeta.kompren.slicer.Slicer;

public class CreateKomprentFilesAction implements IObjectActionDelegate {
	private List<IFile> paths;


	public CreateKomprentFilesAction() {
		super();
		paths = new ArrayList<IFile>();
	}


	@Override
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
//		shell = targetPart.getSite().getShell();
	}


	@Override
	public void run(final IAction action) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("kompren", new XMIResourceFactoryImpl());

		for(final IFile file : paths)
			convertKomprenFile(file);
	}



	private void convertKomprenFile(final IFile file) {
		final Resource resource = new ResourceSetImpl().getResource(URI.createFileURI(file.getLocation().toString()), true);
		final String code = ((Slicer)resource.getContents().get(0)).toString();
		final File fileOut = new File(file.getLocation().removeFileExtension().addFileExtension("komprent").toString());
		FileWriter fw = null;

		try {
			fw = new FileWriter(fileOut, false);
			fw.write(code);
		}catch(IOException ex) { ex.printStackTrace(System.err); }

		try { if(fw!=null) fw.close(); } catch(final IOException ex) { ex.printStackTrace(System.err); }

		try { file.getParent().refreshLocal(IResource.DEPTH_ONE, null); }
		catch(final CoreException ex) { ex.printStackTrace(System.err); }
	}



	@Override
	public void selectionChanged(final IAction action, final ISelection selection) {
		paths.clear();

		if(selection!=null && !selection.isEmpty() && selection instanceof StructuredSelection) {
			List<?> listSel = ((StructuredSelection)selection).toList();

			for(Object obj : listSel)
				if(obj instanceof IFile && ((IFile)obj).getFileExtension().equals("kompren"))
					paths.add((IFile)obj);
		}

		action.setEnabled(!paths.isEmpty());
	}
}
