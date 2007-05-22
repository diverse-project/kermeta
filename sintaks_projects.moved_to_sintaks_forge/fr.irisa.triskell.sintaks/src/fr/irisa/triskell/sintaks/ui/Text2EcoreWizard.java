/**
 * 
 */
package fr.irisa.triskell.sintaks.ui;

import fr.irisa.triskell.sintaks.main.Master;

import org.eclipse.core.resources.IFile;

/**
 * @author dtouzet
 *
 */
public class Text2EcoreWizard extends SintaksWizard {

	/**
	 * 
	 */
	public Text2EcoreWizard() {
		super();
		defaultOutputExtension = "xmi";
	}

	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.tools.wizards.DavidWizard#writeUnit(org.eclipse.core.resources.IFile)
	 */
	@Override
	public void writeUnit(IFile targetFile) throws Exception {
		Master m = new Master();
		String ruleFile = outputPage.getSMdlText();	
		if ( ! ruleFile.matches("platform:/plugin/.+") )
			ruleFile = "platform:/resource" + ruleFile;
		m.getModelFromText(inputFile, targetFile, ruleFile );
	}
	
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// Customize the already added pages
		outputPage = (SintaksDestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.setTitle("Import to Ecore:");
		outputPage.setDescription("This wizard imports your file into an Ecore model.\nPlease specify the output file name.");
		
		// Eventually add new pages here
	}

}
