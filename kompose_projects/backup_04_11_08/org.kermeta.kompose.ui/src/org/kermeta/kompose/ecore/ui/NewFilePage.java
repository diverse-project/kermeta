

/*$Id: NewFilePage.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
* Project : org.kermeta.kompose.ui
* File : 	NewFilePage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 juin 08
* Authors : paco
*/

package org.kermeta.kompose.ecore.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewFilePage extends WizardNewFileCreationPage {

	public NewFilePage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	@Override
	protected boolean validatePage() {
		boolean valid = super.validatePage();
		if ( valid ) {
			if ( ! getFileName().matches(".+\\.ecore") ) {
				valid = false;
				setErrorMessage("The file must ecore extension.");
			}
		}
		return valid;
	}
	
}


