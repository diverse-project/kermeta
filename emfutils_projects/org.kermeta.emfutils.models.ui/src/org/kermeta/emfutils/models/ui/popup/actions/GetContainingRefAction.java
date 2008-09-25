/* $Id: GetContainingRefAction.java,v 1.3 2008-09-25 08:28:29 cfaucher Exp $
 * Project    : org.kermeta.emfutils.models.ui
 * File       : GetContainingRefAction.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 28 feb. 2008
 * Authors : 
 *        Cyril Faucher <cfaucher@irisa.fr>
 *
 */

package org.kermeta.emfutils.models.ui.popup.actions;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GetContainingRefAction implements IObjectActionDelegate {

	protected StructuredSelection currentSelection;
	
	protected EObject eObj;
	
	/**
	 * Constructor for GetContainingRefAction.
	 */
	public GetContainingRefAction() {
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
		Shell shell = new Shell();
		
		String text = "None containing reference.";
		
		if( eObj.eContainmentFeature() != null && eObj.eContainingFeature() != null ) {
			text = "This node is contained through the reference: \n" +
			" - " + eObj.eContainmentFeature().getName() + " (ContainmentFeature property)\n" + 
			" - " + eObj.eContainingFeature().getName() + " (ContainingFeature property)";
		}
		
		text += "\n\nIdentification of this node: \n" +
			EcoreUtil.getIdentification(eObj);
		
		text += "\n\ngetURI: \n" +
			EcoreUtil.getURI(eObj);
		
		MessageDialog.openInformation(
			shell,
			"EMF Models Info by Kermeta",
			text);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			currentSelection = (StructuredSelection) selection;
			
			Iterator it = currentSelection.iterator();

			while (it.hasNext()) {
				Object obj = (Object) it.next();
				if(obj instanceof EObject) {
					eObj = (EObject) obj;
				}
			}
		}
	}
}
