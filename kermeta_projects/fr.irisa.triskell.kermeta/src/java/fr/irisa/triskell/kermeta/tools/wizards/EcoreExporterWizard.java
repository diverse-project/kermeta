/* $Id: EcoreExporterWizard.java,v 1.1 2005-07-21 15:41:44 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KmtPrinter.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 * 		Pretty print of kmt files from a KermetaUnit.
 * 		It may be subclassed in order to add new pages or customize the messages.
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2EcoreExporter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * Pretty print of kmt files from a KermetaUnit.
 * It may be subclassed in order to add new pages or customize the messages.
 */
public class EcoreExporterWizard extends UnitExporterWizard{
	
/*	protected IStructuredSelection selection;
    protected IWorkbench workbench;
    
    protected IFile inputFile;
  */  
    // some constants
    /** pagenames */
    
	/**
	 * Constructor for Km2kmtWizard.
	 */
    public EcoreExporterWizard()
    {
		super();
    	defaultOutputExtension = "ecore";
    }
    
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// customize the already added pages
		WizardNewFileCreationPage outputPage = (WizardNewFileCreationPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.setTitle("Export to ecore:");
		outputPage.setDescription("This wizard exports your file into an Ecore file.\nPlease specify the output file name.");
			
		
		// eventually add new pages here
			
	}
    
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {	    
	    
		//		 create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    Resource resource = resource_set.createResource(URI.createFileURI(ifile.getFullPath().toString()));
	    
	    KM2EcoreExporter exporter = new KM2EcoreExporter(resource);
		
		exporter.exportPackage(builder.rootPackage);
		
		
	    // Save Ecore structure	
		try {
			resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: ", e);
			throw new Error("Cannot save ecore ressource (" + ifile.getName() + "), due to Exception: ", e);
		}
		ifile.refreshLocal(1, null);
		
	}

}
