/* $Id: Ecore2kmtWizard.java,v 1.10 2007-11-28 13:59:35 ftanguy Exp $
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
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KM;


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
		
        Ecore2KM.isQuickFixEnabled = quickFixPage.isQuickFixEnabled();
        Ecore2KM.isMethodPropertyNameOverlapSafe = quickFixPage.isOpPropertyFixEnabled();
        Ecore2KM.isMethodNameOverlapSafe = quickFixPage.isOperationFixEnabled();
        Ecore2KM.methodRenamePrefix = quickFixPage.getOpPrefixString();
        Ecore2KM.methodRenamePostfix = quickFixPage.getOpPostfixString();
        
        options.put( LoadingOptions.ECORE_QuickFixEnabled, quickFixPage.isQuickFixEnabled() );
        
       	return super.createUnit();	
	}

			
}
