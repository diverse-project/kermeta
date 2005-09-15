/* $Id: OperationBodyLoader.java,v 1.2 2005-09-15 12:40:33 dvojtise Exp $
 * Created on 15 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * Description :
 *  Loads operations from an external file and add it to a given kermeta module
 */
package fr.irisa.triskell.kermeta.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OperationBodyLoader {

	
	/**
	 * Constructor
	 */
	public OperationBodyLoader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Get operation bodies contained in an external file specified by <b>str_uri</b> and
	 * load them in the given kermeta <b>unit</b>.
	 * @see fr.irisa.triskell.kermeta.loader.KermetaLoaderModule#load(kermeta.loader.MetaCoreUnit, java.lang.String)
	 * @param unit : the Kermeta unit in which we put the operations bodies of str_uri file.
	 * @param str_uri : the file (filename.kmtbodies) that contains operation bodies to load
	 * TODO : should we allow operation transferts from a package to another that has not the same name?
	 */
	public boolean load(KermetaUnit unit, String str_uri) {
		try {
			URI uri = URI.createURI(str_uri);
			URIConverter converter = new URIConverterImpl();
			BufferedReader r = new BufferedReader(new InputStreamReader(converter.createInputStream(uri)));
			String line;
			String body = null;
			String opname = null;
			while(r.ready()) {
				line = r.readLine().trim();
				if (line.startsWith("#") || line.equals("")) continue; // to handle comments
				if (line.startsWith("$")) {
					if (body != null) {
						unit.operation_bodies.put(opname, body);
						body= null;
					}
					opname = line.substring(1);
				}
				else {
					if (body == null) body = line + "\n";
					else body += line + "\n";
				}
				
			}
			if (body != null) {
				unit.operation_bodies.put(opname, body);
			}
			return true;
		} catch (IOException e) {
			 unit.messages.addError("Operation body load i/o error : " + e, null);
			 e.printStackTrace(); // print the exceptions for debug (FIXME:remove it later)
		}
	    
		return false;
	}
	
}
