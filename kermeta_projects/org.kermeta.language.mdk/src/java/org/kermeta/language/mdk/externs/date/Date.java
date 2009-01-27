

/*$Id: Date.java,v 1.1 2009-01-27 13:40:01 cfaucher Exp $
* Project : org.kermeta.language.mdk
* File : 	Date.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 jan. 2009
* Authors : 
* 			Cyril Faucher <cyril.faucher@inria.fr>
* 			Brice Morin <brice.morin@inria.fr>
*/

package org.kermeta.language.mdk.externs.date;

import java.util.Stack;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Date {
	
	private static Stack<java.util.Date> starts = new Stack<java.util.Date>();

	/**
	 * 
	 * @param self
	 * @param param0
	 * @return
	 */
	public static RuntimeObject start(RuntimeObject self) {
		starts.push(new java.util.Date());
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		java.lang.Long long_ = new java.lang.Long(starts.peek().getTime());
		fr.irisa.triskell.kermeta.runtime.basetypes.String.setValue(result, long_.toString());
		return result;
	}
	
	/**
	 * 
	 * @param self = end
	 * @param startDate = start
	 * @return
	 */
	public static RuntimeObject getTimeDiff(RuntimeObject self, RuntimeObject startDate) {
		
		java.lang.String self_time = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self.getProperties().get("time"));
		java.lang.String param0_time = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self.getProperties().get("time"));
		
		//End
		java.lang.Long self_time_long = new java.lang.Long(self_time);
		//Start
		java.lang.Long param0_time_long = new java.lang.Long(param0_time);
		
		//Create the resulting object
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		
		java.lang.Long long_ = new java.lang.Long(self_time_long - param0_time_long);
		//Set the resulting
		fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(result, new java.lang.Integer(long_.toString()));
		return result;
	}
    
    public static RuntimeObject getElapsedTime(RuntimeObject self){
    	java.util.Date start = starts.pop();
    	java.util.Date end = new java.util.Date();
    	
    	//Create the resulting object
        RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");    
        
        java.lang.Long long_ = new java.lang.Long(end.getTime()-start.getTime());
		fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(result, new java.lang.Integer(long_.toString()));
        return result;
    }
		
}


