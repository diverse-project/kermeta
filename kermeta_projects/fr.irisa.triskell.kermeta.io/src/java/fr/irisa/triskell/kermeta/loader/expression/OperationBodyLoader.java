/*
 * Created on 15 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OperationBodyLoader {

	
	/**
	 * 
	 */
	public OperationBodyLoader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaLoaderModule#load(kermeta.loader.MetaCoreUnit, java.lang.String)
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
			 unit.error.add(new KMUnitError("Operation body load i/o error : " + e, null));
		}
	    
		return false;
	}
	
}
