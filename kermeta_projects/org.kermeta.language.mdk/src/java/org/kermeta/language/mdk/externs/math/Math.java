/*$Id: Math.java,v 1.1 2008-12-09 14:20:23 dvojtise Exp $
* Project : org.kermeta.language.mdk
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 09/12/2008
* Authors :
*		Didier Vojtisek
*/
package org.kermeta.language.mdk.externs.math;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

/**
 * This is tha java part of the wrapper for classical Math functions provided by Math.kmt
 *
 */
public class Math {
	public static RuntimeObject sin(RuntimeObject a)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.sin(inputVal), a.getFactory());
    }
	
	public static RuntimeObject cos(RuntimeObject a)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.cos(inputVal), a.getFactory());
    }
	
	public static RuntimeObject pi(RuntimeObject self)
    {
		return Real.create(java.lang.Math.PI, self.getFactory());
    }
	
	public static RuntimeObject toDegrees(RuntimeObject a)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.toDegrees(inputVal), a.getFactory());
    }
	public static RuntimeObject toRadians(RuntimeObject a)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.toRadians(inputVal), a.getFactory());
    }
}
