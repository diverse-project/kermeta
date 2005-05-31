/* $Id: KermetaRunHelper.java,v 1.7 2005-05-31 22:25:36 ffleurey Exp $
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

import org.eclipse.core.resources.IFile;

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
    	String uri = "platform:/resource/" + filename;
    	//String uri = "file://" +filename;
    	
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck(null);
	        
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
	 * Parse the given file and return its KermetaUnit
	 * @param file
	 * @return KermetaUnit the compilation unit for the given file
	 */
    public static KermetaUnit parse(IFile file)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta.runner/lib/framework.km";

    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
       // System.out.println("file.getFullPath().toOSString() : " + file.getFullPath().toOSString());
        try {
        	result = (KMTUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck(null);
	        
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
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
	 * If tags were not found, the returned ArrayList contains 2 empty strings. 
	 * Those tags are not mandatory, so, they can be empty or unexistant.
	 * @return the ArrayList which 1st element is the @mainClass tag value, and
	 * 2nd element is the @mainOperation tag value.
	 */
	public static ArrayList findEntryPoint(KermetaUnit unit) 
	{
	    ArrayList taglist = new ArrayList(2);
	    String mc = ""; String mo = "";
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
