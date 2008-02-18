

/*$Id: WizardNewKETFileCreationPage.java,v 1.1 2008-02-18 08:13:06 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.ket
* File : 	WizardNewKETFileCreationPage.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 févr. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.ket.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class WizardNewKETFileCreationPage extends WizardNewFileCreationPage {

	private String template = "<%@ket\npackage=\"\"\nrequire=\"\"\nusing=\"\"\nclass=\"\"\nparameters=\"\"\n%>";
	
	public WizardNewKETFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setFileName("new_file.ket");
	}

	@Override
	protected String getNewFileLabel() {
		return "File Name : ";
	}
		
	@Override
	protected InputStream getInitialContents() {
		return new ByteArrayInputStream( template.getBytes() );
	}
	
	
}


