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

public class Time {

	/**
     * Return the current datetime as a String formated following the format parameter
     * 
     * @param self
     * @param format
     * @return
     */
    public static java.lang.String getCurrentDateTimeAsString(kermeta.utils.Time self, java.lang.String format){
    	java.util.Date current_date = new java.util.Date();
    	DateFormat simpleDF = new SimpleDateFormat(format);
        return simpleDF.format(current_date);
    }
    
}
