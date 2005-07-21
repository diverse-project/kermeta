/* $Id: Ecore2kmtWizard.java,v 1.1 2005-07-21 15:41:44 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : Wizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import org.eclipse.ui.INewWizard;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.ecore.ECore2Kermeta;


/**
 * This wizard specializes the KmtPrinterWizard by adding special features
 */
public class Ecore2kmtWizard extends KmtPrinterWizard implements INewWizard {	
	/**
	 * Constructor for Km2kmtWizard.
	 */
	public Ecore2kmtWizard() {
		super();
	}
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {		
		super.addPages();
		// add here your special pages
		Ecore2KermetaQuickFixWizardPage quickFixPage = new Ecore2KermetaQuickFixWizardPage(selection);
		this.addPage(quickFixPage);
	}
	
	/**
	 * overwrite the default createUnit method in order to add some special directives to the loader.
	 * @return KermetaUnit
	 */
	public KermetaUnit creatUnit() {
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
        
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        
        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile_uri);
        

        ECore2Kermeta.isQuickFixEnabled = true;
        
		return unit;
	}

			
}
