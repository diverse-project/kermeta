/* $Id: KmtPrinterWizard.java,v 1.1 2005-07-21 15:41:44 dvojtise Exp $
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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;

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
    }
    
	/**
	 * Adding the pages to the wizard.
	 */
	public void addPages() {
		super.addPages();
		
		// customize the already added pages
		WizardNewFileCreationPage outputPage = (WizardNewFileCreationPage)this.getPage(OUTPUTFILE_PAGENAME);
		outputPage.setTitle("PrettyPrint to kmt:");
		outputPage.setDescription("This wizard pretty prints your file into a kmt (kermeta text) file.\nPlease specify the output file name.");
			
		
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
	    
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(ifile.getLocation().toFile()));
		String pkg_name = "package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				
				if (iu instanceof KMTUnit || iu instanceof KMUnit)
					w.write("require \"" + iu.getUri() + "\"\n");
				else {
								
					IFile importedfile = ifile.getProject().getFile(ifile.getProjectRelativePath().removeFileExtension().removeLastSegments(1).append(iu.rootPackage.getFName()).addFileExtension("kmt"));
					
					
					writeUnit(iu, importedfile);
					w.write("require \"" + iu.rootPackage.getFName() + ".kmt\"\n");
				}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
		ifile.refreshLocal(1, null);
	}

	/**
	 * Default Unit creation.
	 * @return KermetaUnit
	 */
	public KermetaUnit createUnit() {
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
        
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        
        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile_uri);
        
		return unit;
	}
}
