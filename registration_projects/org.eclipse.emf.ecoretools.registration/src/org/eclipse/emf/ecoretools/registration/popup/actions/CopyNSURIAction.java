/* $Id: CopyNSURIAction.java,v 1.1 2007-11-21 13:17:59 cfaucher Exp $
 * Project : org.eclipse.emf.ecoretools.registration
 * File : CopyNSURIAction.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 24 Set. 2007
 * Authors : 
 * 		Didier Vojtisek	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 */
package org.eclipse.emf.ecoretools.registration.popup.actions;


import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecoretools.registration.view.RegisteredPackageView;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;

/**
 * This action will copy the selection NSURI (from then EMFRegisteredView)
 * to the clipboard
 */
public class CopyNSURIAction extends Action {
		

	private RegisteredPackageView view;
	
	private Clipboard clipboard;

	public CopyNSURIAction(RegisteredPackageView view, Clipboard clip, String text) {
		super(text);
		clipboard = clip;
		this.view = view;
	}

	public void run() {
		String stringToClip = "";
		
		for(int i = 0; i < view.getSelectedPackages().length; i++){
			EPackage p = view.getSelectedPackages()[i];;

			if(i > 0) stringToClip += "\n";
			stringToClip += p.getNsURI();
			
		}
		clipboard.setContents(new Object[] { stringToClip },
	              new Transfer[] { TextTransfer.getInstance()});
	}
}
