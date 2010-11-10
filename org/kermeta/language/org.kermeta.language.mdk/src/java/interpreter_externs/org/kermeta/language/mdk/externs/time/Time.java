/*$Id: $
* Project : org.kermeta.language.mdk
* File : 	Time.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 05 may 2009
* Authors : 
* 			Cyril Faucher <cyril.faucher@inria.fr>
* 			
*/

package org.kermeta.language.mdk.externs.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Time {

	/**
     * Return the current date as a String formated following the format parameter
     * 
     * @param self
     * @param format
     * @return
     */
    public static RuntimeObject getCurrentDateTimeAsString(RuntimeObject self, RuntimeObject format){
    	java.util.Date current_date = new java.util.Date();
    	DateFormat simpleDF = new SimpleDateFormat(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(format));
    	    	
    	//Create the resulting object
        RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
        
		fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(result, simpleDF.format(current_date));
        return result;
    }
    
}
