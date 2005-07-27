/* $Id: Ecore2kmtWizard.java,v 1.3 2005-07-27 14:50:33 dvojtise Exp $
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
	protected Ecore2KermetaQuickFixWizardPage quickFixPage;
	
	/**
	 * Constructor for Km2kmtWizard.
	 */
	public Ecore2kmtWizard() {
		super(); 
    	isInputKM = false; 
	}
	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {		
		super.addPages();
		// add here your special pages
		quickFixPage = new Ecore2KermetaQuickFixWizardPage(selection);
		this.addPage(quickFixPage);
	}
	
	/**
	 * overwrite the default createUnit method in order to add some special directives to the loader.
	 * @return KermetaUnit
	 */
	public KermetaUnit createUnit() {
		
        ECore2Kermeta.isQuickFixEnabled = quickFixPage.isQuickFixEnabled();
        ECore2Kermeta.isMethodPropertyNameOverlapSafe = quickFixPage.isOpPropertyFixEnabled();
        ECore2Kermeta.isMethodNameOverlapSafe = quickFixPage.isOperationFixEnabled();
        ECore2Kermeta.methodRenamePrefix = quickFixPage.getOpPrefixString();
        ECore2Kermeta.methodRenamePostfix = quickFixPage.getOpPostfixString();
        
		return super.createUnit();
	}

			
}
