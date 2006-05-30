/* $Id: KM2HTMLMain.java,v 1.1 2006-05-30 08:32:18 zdrey Exp $
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

/**
 * This class generated the HTML documentation for kermeta API
 *
 */
public class KM2HTMLMain {

	public static void main(String[] args) {
		String framework_path = "../fr.irisa.triskell.kermeta/lib/framework.km";
		String output_directory = "src/html/";
		KM2HTMLPrettyPrinter html_printer = new KM2HTMLPrettyPrinter(framework_path);
		html_printer.ppKermetaFile(
		  output_directory + 
		  html_printer.inputFile.substring(framework_path.lastIndexOf("/") + 1)
		  + ".html");
	}

}
