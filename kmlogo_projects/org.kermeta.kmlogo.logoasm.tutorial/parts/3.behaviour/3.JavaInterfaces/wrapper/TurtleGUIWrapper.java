/* $Id: TurtleGUIWrapper.java,v 1.3 2007-11-29 15:26:55 dvojtise Exp $
 * Project    : org.kermeta.kmLogo
 * File       : TurtleGUIWrapper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package org.kermeta.kmLogo.wrapper;

import org.kermeta.kmLogo.gui.ITurtleGUI;
import org.kermeta.kmLogo.gui.TurtleSimpleAWTGUI;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * This calls is used to provide access to the java object
 * it gives the static methods needed by Kermeta 
 *
 */
public class TurtleGUIWrapper {

	/**
	 * as call from kermeta using :
	 * 		extern org::kermeta::kmLogo::wrapper::TurtleGUIWrapper.initialize(self, name)
	 * @param self
	 * @param roname
	 * @return
	 */
	public static RuntimeObject initialize(RuntimeObject self, RuntimeObject roname)
    {
		// create the needed object in self
		// put the java object in the getData structure in order to manipulate only this one
		// and not a static object shared by all instances ...
		String name = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(roname);
		ITurtleGUI turtleGUI = new TurtleSimpleAWTGUI(name, 600);
		
		// the UserData is used to store the real Java Object
		self.setUserData( turtleGUI);
		return self.getFactory().getMemory().voidINSTANCE;
    }
	/**
	 * called from kermeta using
	 * 		extern org::kermeta::kmLogo::wrapper::TurtleGUIWrapper.drawLine(self, x1,y1, x2, y2)
	 * @param self
	 * @param rox1
	 * @param roy1
	 * @param rox2
	 * @param roy2
	 * @return
	 */
	public static RuntimeObject drawLine(RuntimeObject self,
			RuntimeObject rox1, RuntimeObject roy1, 
			RuntimeObject rox2, RuntimeObject roy2)
    {
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getUserData();
		turtleGUI.drawLine(fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(rox1), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(roy1), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(rox2), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(roy2));
		return self.getFactory().getMemory().voidINSTANCE;
    }
	
	public static RuntimeObject drawTurtle(RuntimeObject self,
			RuntimeObject rox, RuntimeObject roy, 
			RuntimeObject roAngle, RuntimeObject roPenUp)
    {
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getUserData();
		turtleGUI.drawTurtle(fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(rox), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(roy), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Real.getValue(roAngle), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roPenUp));
		return self.getFactory().getMemory().voidINSTANCE;
    }
	
	public static RuntimeObject clearDrawing(RuntimeObject self)
    {
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getUserData();
		turtleGUI.clearDrawing();
		return self.getFactory().getMemory().voidINSTANCE;
    }
	
	
}
