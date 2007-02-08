/* $Id: Kermeta2EcoreWizard.java,v 1.5 2007-02-08 15:32:42 ftanguy Exp $
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
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.eclipse.console.messages.WarningMessage;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * Pretty print of kmt files from a KermetaUnit.
 * It may be subclassed in order to add new pages or customize the messages.
 */
public class Kermeta2EcoreWizard extends UnitExporterWizard{
	
	/** Default dir. where ecore files will be generated */
	public static final String DEFAULT_GEN_DIR = "build/ecore"; // "platform:/resource/project_name/" + DEFAULT_GEN_DIR
	
	
/*	protected ResourceSet trace_resource_set;
	protected Resource trace_resource = null;
	protected IFile tracefile;
	protected Tracer tracer;*/
    // some constants
    
	/**
	 * Constructor for Km2kmtWizard.
	 */
    public Kermeta2EcoreWizard()
    {
		super();
    	defaultOutputExtension = "ecore";
    }
    /**
	 * Constructor for Km2kmtWizard.
	 */
    public Kermeta2EcoreWizard(boolean bIsInputKM)
    {
		super();
    	defaultOutputExtension = "ecore";
    	isInputKM = bIsInputKM;  
    	isOutputKM = false; 
    }
    
    	
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// customize the already added pages
		outputPage = (DestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
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
	    URI u = URI.createURI(ifile.getFullPath().toString());
    	KermetaUnit.internalLog.info("URI created for model to save : "+u);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
	    Resource resource = resource_set.createResource(u);
	    
	    KM2Ecore exporter;
	    String gendir = null;
	    List<String> ecorelist = null;
	    
    	if (this.resolvePage.overwriteGeneratedEcore())
    		gendir = this.resolvePage.getEcoreFolder();
    	else
    		ecorelist = this.resolvePage.getEcoreFileList();
	    
	    if(this.tracePage.enableFileDestinationButton.getSelection())
	    {
	    	if (trace_resource == null) initTraces();
	    	exporter = new KM2Ecore(resource, trace_resource, builder, gendir, ecorelist);
	    }
	    else exporter = new KM2Ecore(resource, builder, gendir, ecorelist);
	
		exporter.exportPackage(builder.rootPackage);
		//		 display eventual warnings
		if(exporter.messages.getAllWarnings().size() > 0){
			WarningMessage message = new WarningMessage( exporter.messages.getAllMessagesAsString() );
			KermetaPlugin.getDefault().getConsole().println( message );
		}
		
	    // Save Ecore structure	
		try {
			resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + ifile.getName() + "), due to Exception: ", e);
		}
		ifile.refreshLocal(1, null);		
	}

}
