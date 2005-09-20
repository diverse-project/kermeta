/* $Id: KermetaRunHelper.java,v 1.14 2005-09-20 15:19:57 ffleurey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunHelper.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 23, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.structure.FPackage;
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

    
	/**
	 * Parse the given file and return its KermetaUnit
	 * @param file
	 * @return KermetaUnit the compilation unit for the given file
	 */
    public static KermetaUnit parse(IFile file)
    {
        KermetaUnit.STD_LIB_URI = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";

    	StructurePackageImpl.init();
    	BehaviorPackageImpl.init();
    	String uri = "platform:/resource" + file.getFullPath().toString();
    	KermetaUnitFactory.getDefaultLoader().unloadAll();
    	KMTUnit result = null;
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
        	else if (!result.messages.hasError())
        		result.messages.addMessage(new KMUnitError("INTERNAL ERROR : " + e, null));
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
	        if (unit.rootPackage == null)
	        {
	            throw new KermetaInterpreterError("No root package was found");
	        }
	        else
	        {
	            Iterator it = unit.rootPackage.getFTag().iterator();
	            
	            while (it.hasNext()) {
	                FTag tag = (FTag)it.next();
	                if (tag.getFName().equals("mainClass")) 
	                {    mc = tag.getFValue();} //remove the " to memorize value
	                if (tag.getFName().equals("mainOperation"))
	                {    mo = tag.getFValue();} //remove the " to memorize value
	        }
	        }
	    }
        taglist.add(mc); taglist.add(mo);
	    return taglist;
	}
	
	/** Get and flatten recursively the classes in the given package and in the packages children */
	public static void getRecursivePackageTypeDefs(FPackage pPackage, ArrayList pList)
	{
	    pList.addAll(pPackage.getFOwnedTypeDefinition());
	    EList packages = pPackage.getFNestedPackage();
	    for  (int i=0; i<packages.size(); i++)
	    {
	        pList.addAll(((FPackage)packages.get(i)).getFOwnedTypeDefinition());
	        getRecursivePackageTypeDefs((FPackage)packages.get(i), pList);
	    }
	    
	}
    
}
