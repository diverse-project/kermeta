/* $Id: KermetaRunHelper.java,v 1.4 2005-05-27 15:06:12 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunHelper.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 23, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * 
 */
public class KermetaRunHelper {

	/**
	 * 
	 * Parse the given file and return its KermetaUnit.
	 * FIXME : the uri defined is platform dependant! (platform:/resource...?)
	 * TODO : throw a specific exception?  
	 * @param file the file to parse
	 * @return KermetaUnit the compilation unit for the given file
	 */
    public static KermetaUnit parse(String filename)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta.runner/lib/framework.km";

    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	// FIXME : adaptation...
    	//String uri = "platform:/resource/" + filename;
    	String uri = "file://" +filename;
    	
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck();
	        
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error : "+e, e);
        	if (result == null) {
        		//e.printStackTrace();
        		return null;
        	}
        	else if (result.error.size() == 0)
        		result.error.add(new KMUnitError("INTERNAL ERROR : " + e, null));
        }
        return result;
    }
    
	/**
	 * Initialize the entrypoint of the program according to
	 * the tags on the root_package.
	 */
	public static ArrayList setEntryPoint(KermetaUnit unit) 
	{
	    ArrayList taglist = new ArrayList(2);
	    String mc = null; String mo = null;
	    if (unit!=null)
	    {
	        Iterator it = unit.rootPackage.getFTag().iterator();
	        
	        while (it.hasNext()) {
	            FTag tag = (FTag)it.next();
	            if (tag.getFName().equals("mainClass")) 
	            {    mc = tag.getFValue().substring(1,tag.getFValue().length()-1);} //remove the " to memorize value
	            if (tag.getFName().equals("mainOperation"))
	            {    mo = tag.getFValue().substring(1,tag.getFValue().length()-1);} //remove the " to memorize value
	        }
	    }
        taglist.add(mc); taglist.add(mo);
	    return taglist;
	}
	
    
}
