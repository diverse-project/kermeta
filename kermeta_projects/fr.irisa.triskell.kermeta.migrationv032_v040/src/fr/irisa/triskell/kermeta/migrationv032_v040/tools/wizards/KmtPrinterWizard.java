/* $Id: KmtPrinterWizard.java,v 1.3 2007-07-23 09:16:19 ftanguy Exp $
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
package fr.irisa.triskell.kermeta.migrationv032_v040.tools.wizards;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KMTOutputBuilder;

import fr.irisa.triskell.kermeta.loader.kmt.KMTBuildingState;
import fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt.KMTUnitLoader;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * Pretty print of kmt files from a KermetaUnit.
 * It may be subclassed in order to add new pages or customize the messages.
 */
public class KmtPrinterWizard extends UnitExporterWizard{
	
 
    // some constants
    /** pagenames */
    
	/**
	 * Constructor for Km2kmtWizard.
	 */
    public KmtPrinterWizard()
    {
		super();

    	defaultOutputExtension = "kmt";  
    	isOutputKM = false; 
    }
    
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// customize the already added pages
		outputPage = (DestFileWizardPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.setTitle("PrettyPrint to kmt:");
		outputPage.setDescription("This wizard pretty prints your file into a kmt (kermeta text) file.\nPlease specify the output file name.");
			
		
		// eventually add new pages here
			
	}
    
	
	@Override
	public KermetaUnit createUnit() {
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
		KermetaUnit kermetaUnit = IoFactory.eINSTANCE.createKermetaUnit();
		kermetaUnit.setUri( inputFile_uri );
		
		kermetaUnit.importKermetaUnit( IOPlugin.getDefault().getFramework(), false);
		
		kermetaUnit.setBuildingState( new KMTBuildingState() );
		KMTUnitLoader loader = new KMTUnitLoader();
		loader.load( kermetaUnit );
		
		return kermetaUnit;
		
	}
	
	
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {	    
	    
		String fileName = "platform:/resource" + ifile.getFullPath().toString();
		int index = fileName.lastIndexOf("/");
		String rep = fileName.substring(0, index);
		
		KMTOutputBuilder exporter = new KMTOutputBuilder();
		exporter.print(builder, rep, fileName);
		exporter.flush();
		
	}

}
