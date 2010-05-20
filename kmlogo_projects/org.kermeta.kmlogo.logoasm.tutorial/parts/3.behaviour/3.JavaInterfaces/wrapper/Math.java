/*$Id : Math.java v 1.3 May 8, 2010 9:40:21 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.srcKermeta
* File : 	Math.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmLogo.wrapper;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;
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
