/* $Id: Kermeta2EcoreWizard.java,v 1.13 2009-02-20 12:56:06 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : Kermeta2EcoreWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 * 		Generate Ecore files from Kmt or Km.
 * 		It may be subclassed in order to add new pages or customize the messages.
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.ExporterOptions;

/**
 * Pretty print of kmt files from a KermetaUnit.
 * It may be subclassed in order to add new pages or customize the messages.
 */
public class Kermeta2EcoreWizard extends UnitExporterWizard{
	
	/** 
	 * Default dir. where ecore files will be generated
	 * FIXME never used
	 */
	public static final String DEFAULT_GEN_DIR = "build/ecore"; // "platform:/resource/project_name/" + DEFAULT_GEN_DIR
	
	
	protected Button dependentOfFrameworkButton;
	
	protected Button structuralButton;
	
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
	
	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		outputPage = (DestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		
		/*Composite composite = new Composite(outputPage.linkedResourceParent, SWT.NONE);
		composite.setFont( outputPage.linkedResourceParent.getFont() );
		outputPage.linkedResourceParent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));*/
		
		
		Group group = new Group(outputPage.linkedResourceParent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setFont( outputPage.linkedResourceParent.getFont() );
		group.setText("Kermeta specificities in the generated ecore");
				
		Label label = new Label(group, SWT.NULL);
		label.setText("Dependency to the Kermeta framework (framework.ecore) for primitive types: ");
		dependentOfFrameworkButton = new Button(group, SWT.CHECK);
		dependentOfFrameworkButton.setSelection(false);
		
		label = new Label(group, SWT.NULL);
		label.setText("Generate with the behavioral part (operations) ");
		structuralButton = new Button(group, SWT.CHECK);
		structuralButton.setSelection(true);
	}
	
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {	    
	    //ResourceSet resource_set = new ResourceSetImpl();
	    String fileURI = "platform:/resource" + ifile.getFullPath().toString();
	    //URI u = URI.createURI( fileURI );
    	//KermetaUnit.internalLog.info("URI created for model to save : "+u);
    	//URIConverter c = new URIConverterImpl();
    	//u = c.normalize(u);
	    //Resource resource = resource_set.createResource(u);
	    
	    //KM2Ecore exporter;
	    //String gendir = null;
	    //List<String> ecorelist = null;
	    
    	/*if (this.resolvePage.overwriteGeneratedEcore())
    		gendir = this.resolvePage.getEcoreFolder();
    	else
    		ecorelist = this.resolvePage.getEcoreFileList();*/

    	if (trace_resource == null) initTraces();
    	int i = fileURI.lastIndexOf("/");
    	String targetDir = fileURI.substring(0, i);
    	EcoreExporter exporter = new EcoreExporter();
	    
    	ExporterOptions exporterOptions = ExporterOptions.getDefault();
    	
    	exporterOptions.isIndependent = !dependentOfFrameworkButton.getSelection();
    	exporterOptions.isOnlyStructural = !structuralButton.getSelection();
    	
    	// Fixed bug #3813 null to fileURI
	    exporter.export(builder, targetDir, fileURI, exporterOptions);

	    
	  /*  if(this.tracePage.enableFileDestinationButton.getSelection())
	    {
	    	if (trace_resource == null) initTraces();
	    	
	    	int i = fileURI.lastIndexOf("/");
	    	String targetDir = fileURI.substring(0, i);
	    	EcoreExporter exporter = new EcoreExporter();
	    	exporter.export(builder, targetDir,null, true);
	    	
	    	
//	    	exporter = new KM2Ecore(resource, trace_resource, builder, gendir, ecorelist);
	    }
	    else {
	    	int index = fileURI.lastIndexOf("/");
	    	String targetDir = fileURI.substring(0, index);
	    	EcoreExporter exporter = new EcoreExporter();
	    	exporter.export(builder, targetDir, fileURI, true);
	    }*/
	    //		 display eventual warnings
		/*if(exporter.messages.getAllWarnings().size() > 0){
			WarningMessage message = new WarningMessage( exporter.messages.getAllMessagesAsString() );
			KermetaPlugin.getDefault().getConsole().println( message );
		}*/
		
	    // Save Ecore structure	
		/*try {
			resource.save(null);
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + ifile.getName() + "), due to Exception: ", e);
		}*/
		ifile.refreshLocal(1, null);		
	}

}
