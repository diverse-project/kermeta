package art.resource.art.popups.popup.actions;

import org.eclipse.emf.common.util.URI;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class XMI2ART implements IObjectActionDelegate {

	private Shell shell;
	protected StructuredSelection currentSelection;
    protected IFile xmiFile;

	
	/**
	 * Constructor for Action1.
	 */
	public XMI2ART() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		try {
			ResourceSet rs = new ResourceSetImpl();
			URI xmiuri = URI.createPlatformResourceURI(xmiFile.getFullPath().toString(), true);
			Resource xmires = rs.getResource(xmiuri, true);
			xmires.load(null);
			EcoreUtil.resolveAll(xmires);
			
			Resource artres = rs.createResource(xmires.getURI().trimFileExtension().appendFileExtension("art"));
			artres.getContents().addAll(xmires.getContents());
			artres.save(null);
		} catch (IOException e) {
			MessageDialog.openError(shell, "Error !", e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				xmiFile = (IFile)it.next();
			}

		}

	}

}
