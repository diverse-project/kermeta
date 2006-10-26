/* $Id: StdLibKermetaUnitHelper.java,v 1.2 2006-10-26 12:54:25 dvojtise Exp $
 * Project   : Kermeta 
 * File      : KermetaUnitSharedData.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 24 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.loader;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

/**
 * This class deal with the special KermetaUnit for standard library which is shared by the other KermetaUnits
 *
 * Currently, the StdLib acts as a singleton
 */
public class StdLibKermetaUnitHelper  {

	public static String STD_LIB_URI = null;//"platform:/resource/fr.irisa.triskell.kermeta.io/lib/framework.km";
	
	public static final String STD_LIB_URI_DEFAULT = "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km";
	
    public static String ROOT_CLASS_QNAME = "kermeta::language::structure::Object";
	
	protected static KermetaUnit std_lib = null;
	
	public static void setURItoDefault(){
		STD_LIB_URI = STD_LIB_URI_DEFAULT;
	}
	
	public static KermetaUnit getKermetaUnit() {
		if (std_lib == null) {
			std_lib = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("kermeta", new Hashtable());
			
			try {
				std_lib.load();
			}
			catch(Throwable e) {
				std_lib.messages.addError("Exception while importing the standard library : " + e, null);
				KermetaUnit.internalLog.error("Exception while importing the standard library", e);
			}
		}
		return std_lib;
	}
	
	/** cache for get_ROOT_TYPE_ClassDefinition operation */
	protected static ClassDefinition cachedRootTypeClassDefinition = null;
	
	
	/** retreives the classDefinition for the root type namely "Object"
	 * This is the special ClassDefinition of the superclass of all ClassDefinition
	 * @return
	 */
	public static ClassDefinition get_ROOT_TYPE_ClassDefinition() {
	    ClassDefinition result = cachedRootTypeClassDefinition;
	    if (cachedRootTypeClassDefinition == null && (STD_LIB_URI != null || std_lib != null)) {
	        result = (ClassDefinition)getKermetaUnit().typeDefinitionLookup(ROOT_CLASS_QNAME);
	        cachedRootTypeClassDefinition = result;
	    }
	    
	    return result;
	}
	

	/**
	 * set the standard library to this KermetaUnit. this is usefull when compiling the standard lib itself
	 */
	public static void forceStdLib(KermetaUnit ku) {
		std_lib = ku;
	}
	
	/**
     * 
     */
    public static void unloadStdLib() {
       std_lib = null;
       cachedRootTypeClassDefinition = null;
    }
}
