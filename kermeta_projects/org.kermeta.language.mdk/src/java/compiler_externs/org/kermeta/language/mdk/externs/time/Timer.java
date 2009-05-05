/*$Id: $
* Project : org.kermeta.language.mdk
* File : 	Timer.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 jan. 2009
* Authors : 
* 			Cyril Faucher <cyril.faucher@inria.fr>
* 			Brice Morin <brice.morin@inria.fr>
*/

package org.kermeta.language.mdk.externs.time;

import java.util.Stack;

public class Timer {
	
	private static Stack<java.util.Date> starts = new Stack<java.util.Date>();

	/**
	 * 
	 * @param self
	 * @param param0
	 * @return
	 */
	public static java.lang.String start(kermeta.utils.Timer self) {
		starts.push(new java.util.Date());
		java.lang.Long long_ = new java.lang.Long(starts.peek().getTime());
		return long_.toString();
	}
	
	/**
	 * 
	 * @param self = end
	 * @param startDate = start
	 * @return
	 */
	public static java.lang.Integer getTimeDiff(kermeta.utils.Timer self, kermeta.utils.Timer startDate) {
		
		//End
		java.lang.Long self_time_long = new java.lang.Long(self.getTime());
		//Start
		java.lang.Long param0_time_long = new java.lang.Long(startDate.getTime());
		
		//Create the resulting object
		java.lang.Long long_ = new java.lang.Long(self_time_long - param0_time_long);
		//Set the resulting
		return new java.lang.Integer(long_.toString());
	}
    
    public static java.lang.Integer getElapsedTime(kermeta.utils.Timer self){
    	java.util.Date start = starts.pop();
    	java.util.Date end = new java.util.Date();
    	
    	//Create the resulting object
        java.lang.Long long_ = new java.lang.Long(end.getTime()-start.getTime());
		return new java.lang.Integer(long_.toString());
		
    }
		
}


