/**
 * 
 */
package fr.irisa.triskell.kermeta.popup.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * @author dtouzet
 *
 */
public class EMFRegisterAction implements IObjectActionDelegate {
	
	protected StructuredSelection currentSelection;
    //protected IFile ecoreFile;
    protected ArrayList<IFile> ecoreFiles; // = new ArrayList<IFile>();

	/**
	 * 
	 */
	public EMFRegisterAction() {
		ecoreFiles = new ArrayList<IFile>();
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			// The selection should be a single  file
			currentSelection = (StructuredSelection) selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				ecoreFiles.add( (IFile) it.next() );
			}
		}
	}

	
	/**
	 * 
	 */
	protected void displayRegisteredPackages() {
		String pList = "Registered packages:\n";
		String uri = null;
		EPackage p = null;
		Object obj = null;
		
		Set kSet = Registry.INSTANCE.keySet();
		Iterator it = kSet.iterator();
		while(it.hasNext()) {
			uri = (String) it.next();
			obj = Registry.INSTANCE.get( uri );
			if(obj instanceof EPackage) {
				p = (EPackage) obj;
				//pList = pList + "  " + p.getName() + " [" + uri + "]\n";
				pList = pList + "  " + getEPackageQualifiedName(p) + " [" + uri + "]\n";
			}
		}
		
		KermetaPlugin.getDefault().getConsole().println(pList);
	}
	
	
	/**
	 * @param p
	 * @return
	 */
	protected String getEPackageQualifiedName(EPackage p) {
		String result = null;
		if(p == null)
			result = "";
		else
			if(p.getESuperPackage() != null)
				result = getEPackageQualifiedName(p.getESuperPackage()) + "::" + p.getName();
			else
				result = p.getName();
		return result;
	}
	

}
