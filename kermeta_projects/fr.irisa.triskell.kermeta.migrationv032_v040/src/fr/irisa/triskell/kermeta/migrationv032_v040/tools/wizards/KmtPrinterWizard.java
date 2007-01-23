/* $Id: KmtPrinterWizard.java,v 1.1 2007-01-23 15:04:13 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
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
    
	/**
	 * PrettyPrint the given KermetaUnit to the file
	 * overwrites the default behavior of UnitExporterWizard.
	 * @param builder
	 * @param ifile
	 * @throws Exception
	 */
	public void writeUnit(KermetaUnit builder, IFile ifile) throws Exception  {	    
	    
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter( builder.getUri() );
		
		BufferedWriter w = new BufferedWriter(new FileWriter(ifile.getLocation().toFile()));
		String pkg_name = "package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage && builder.rootPackage.getUri() != null)
				if(!builder.rootPackage.getUri().equals(iu.getUri())) { // maybe we are serializing ecore, just forget about this require
				
					if (iu instanceof KMTUnit || iu instanceof KMUnit)
						w.write("require \"" + iu.getUri() + "\"\n");
					else {
						
						// When the Ecore unit is required, the link is directly set to the Ecore.kmt file
						// contained by the Kermeta main plugin -> no need to generate ecore.kmt!
						if(iu.rootPackage.getUri().equals("http://www.eclipse.org/emf/2002/Ecore")) {
							w.write("require \"" + "platform:/plugin/fr.irisa.triskell.kermeta/lib/ecore.kmt" + "\"\n");
						}
						else {
							IFile importedfile = ifile.getProject().getFile(ifile.getProjectRelativePath().removeFileExtension().removeLastSegments(1).append(iu.rootPackage.getName()).addFileExtension("kmt"));
							
							writeUnit(iu, importedfile);
							w.write("require \"" + iu.rootPackage.getName() + ".kmt\"\n");
						}
					}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
		ifile.refreshLocal(1, null);
	}

}
