/* $Id: StandardKermetaUnit.java,v 1.9 2005-11-28 12:32:50 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KMUnitMessageManager.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 15 févr. 2005
 * Authors : 
 *        Franck FLEUREY <ffleurey@irisa.fr>
 * Description : 
 *         
 */
package fr.irisa.triskell.kermeta.loader;


import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;


import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.utils.OperationBodyLoader;
import fr.irisa.triskell.kermeta.utils.UserDirURI;

/**
 * @author Franck Fleurey
 */
public class StandardKermetaUnit extends KMTUnit {

	/**
	 * @param importStdLib
	 */
	public StandardKermetaUnit(Hashtable packages) {
		super(KermetaUnit.STD_LIB_URI, packages);
		// TODO Auto-generated constructor stub
	}
	
	public StandardKermetaUnit(String uri, Hashtable packages) {
		super(uri, packages);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#importStdlib()
	 */
	protected void importStdlib() {
		
	}
	/**
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#importModelFromURI(java.lang.String)
	 */
	public KermetaUnit importModelFromURI(String str_uri) {
		if (str_uri.startsWith("file:"))
			str_uri=str_uri.substring(5,str_uri.length());
		URI uri = URI.createFileURI(str_uri);
		if (uri.isRelative() && this.uri != null) {
//			str_uri = uri.resolve(c.normalize(URI.createURI(this.uri))).toString();
			str_uri = "file:"+UserDirURI.createURI(str_uri,this.uri,false).toFileString().replaceAll("\\\\","/");
		}
		
		// To import method bodies from another file
		if (uri.fileExtension().equals("mctbodies")) {
			new OperationBodyLoader().load(this, str_uri);
			return null;
		}
		else {
			KermetaUnit unit;
			//unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(str_uri, new StandardKermetaUnit());
			unit =  new StandardKermetaUnit(str_uri, packages);
			if (unit.messages.unitHasError) {
				messages.addMessage(new KMUnitError("Errors in imported model " + str_uri + " : \n" +  unit.messages.getMessagesAsString(), null,null));
			}
			importedUnits.add(unit);
			return unit;
		}
	}
	
	
}
