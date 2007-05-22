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
public class Ecore2TextWizard extends SintaksWizard {

	/**
	 * 
	 */
	public Ecore2TextWizard() {
		super();
		defaultOutputExtension = "txt";
	}

	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.tools.wizards.DavidWizard#writeUnit(org.eclipse.core.resources.IFile)
	 */
	@Override
	public void writeUnit(IFile targetFile) throws Exception {
		Master m = new Master();
		/*
		 * 
		 * Modify the path of the rules file wheter it comes from the plugin directory or not.
		 * 
		 */
		String ruleFile = outputPage.getSMdlText();
		if ( ! ruleFile.matches("platform:/plugin/.+") )
			ruleFile = "platform:/resource" + ruleFile;
		m.getTextFromModel(inputFile, targetFile, ruleFile );
	}
	
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// Customize the already added pages
		outputPage = (SintaksDestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.setTitle("Export to text:");
		outputPage.setDescription("This wizard exports your model into a textual file.\nPlease specify the output file name.");
		
		// Eventually add new pages here
	}

}
