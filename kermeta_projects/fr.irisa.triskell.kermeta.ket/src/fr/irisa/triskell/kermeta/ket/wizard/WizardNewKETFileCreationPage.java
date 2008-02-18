

/*$Id: WizardNewKETFileCreationPage.java,v 1.2 2008-02-18 09:48:36 ftanguy Exp $
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class WizardNewKETFileCreationPage extends WizardNewFileCreationPage {

	private String template = "<%@ket\npackage=\"\"\nrequire=\"\"\nusing=\"\"\nclass=\"\"\nparameters=\"\"\n%>";
	
	public WizardNewKETFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);	
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName("new_file.ket");
		setTitle("New KET File");
		validatePage();
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


