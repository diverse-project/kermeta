/* $Id: TurtleGUIWrapper.java,v 1.2 2007-05-31 21:15:26 dvojtise Exp $
 * Project    : fr.irisa.triskell.kmLogo
 * File       : TurtleGUIWrapper.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package fr.irisa.triskell.kmLogo.wrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kmLogo.gui.ITurtleGUI;
import fr.irisa.triskell.kmLogo.gui.TurtleSimpleAWTGUI;

/**
 * This calls is used to provide access to the java object
 * it gives the static methods needed by Kermeta 
 *
 */
public class TurtleGUIWrapper {

	public final static String RUNTIMEOBJECT_DATA_KEY = "TurtlePlatformWrapper.JavaObject";
	/**
	 * as call from kermeta using :
	 * 		extern fr::irisa::triskell::kmLogo::wrapper::TurtleGUIWrapper.initialize(self, name)
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
		
		self.getData().put(RUNTIMEOBJECT_DATA_KEY, turtleGUI);
		return self.getFactory().getMemory().voidINSTANCE;
    }
	/**
	 * called from kermeta using
	 * 		extern fr::irisa::triskell::kmLogo::wrapper::TurtleGUIWrapper.drawLine(self, x1,y1, x2, y2)
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
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getData().get(RUNTIMEOBJECT_DATA_KEY);
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
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getData().get(RUNTIMEOBJECT_DATA_KEY);
		turtleGUI.drawTurtle(fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(rox), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(roy), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Real.getValue(roAngle), 
				fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(roPenUp));
		return self.getFactory().getMemory().voidINSTANCE;
    }
	
	public static RuntimeObject clearDrawing(RuntimeObject self)
    {
		ITurtleGUI turtleGUI = (ITurtleGUI)self.getData().get(RUNTIMEOBJECT_DATA_KEY);
		turtleGUI.clearDrawing();
		return self.getFactory().getMemory().voidINSTANCE;
    }
	
	
}
