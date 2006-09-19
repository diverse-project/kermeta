/* $Id: KermetaRunHelper.java,v 1.17 2006-09-19 12:39:59 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaRunHelper.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 23, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

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
        KermetaUnit result = null;
    	try {
        	result = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri);
	        result.load();
	        
	        result.typeCheck(null);
	        
        }
        catch(Throwable e) {
            KermetaUnit.internalLog.error("load error ", e);
        	if (result == null) {
        		e.printStackTrace();
        		return null;
        	}
        	else if (!result.messages.unitHasError)
        		result.messages.addError("INTERNAL ERROR : " + e, null);
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
	            Iterator it = unit.rootPackage.getTag().iterator();
	            
	            while (it.hasNext()) {
	                Tag tag = (Tag)it.next();
	                if (tag.getName().equals("mainClass")) 
	                {    mc = tag.getValue();} //remove the " to memorize value
	                if (tag.getName().equals("mainOperation"))
	                {    mo = tag.getValue();} //remove the " to memorize value
	        }
	        }
	    }
        taglist.add(mc); taglist.add(mo);
	    return taglist;
	}
	
	/** Get and flatten recursively the classes in the given package and in the packages children */
	public static void getRecursivePackageTypeDefs(Package pPackage, ArrayList pList)
	{
	    pList.addAll(pPackage.getOwnedTypeDefinition());
	    EList packages = pPackage.getNestedPackage();
	    for  (int i=0; i<packages.size(); i++)
	    {
	        pList.addAll(((Package)packages.get(i)).getOwnedTypeDefinition());
	        getRecursivePackageTypeDefs((Package)packages.get(i), pList);
	    }
	    
	}
    
}
