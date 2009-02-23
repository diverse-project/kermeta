/* $Id: KM2HTMLMain.java,v 1.7 2009-02-23 08:09:20 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.documentation
 * File       : KM2HTMLMain.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : May 29, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.docutils;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * This class generated the HTML documentation for kermeta API
 *
 */
public class KM2HTMLMain {

	public static void main(String[] args) throws KermetaIOFileNotFoundException, URIMalformedException {
/*		System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl");
		System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");*/

		
		String framework_path = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/framework.km";
		String output_directory = "";
		if (args.length <= 0 || args.length > 1)
			throw new Error("KM2HTMLMain must be called with 1 argument, that will be " +
					"the output directory for generated doc");
		else
		{
			output_directory = args[0]; // build/html/KermetaFramework/
		}
		
		KM2HTMLPrettyPrinter html_printer = new KM2HTMLPrettyPrinter(framework_path);
		html_printer.ppKermetaFile(
		  output_directory + "/" +
		  html_printer.inputFile.substring(framework_path.lastIndexOf("/") + 1)
		  + ".html");
	}

}
