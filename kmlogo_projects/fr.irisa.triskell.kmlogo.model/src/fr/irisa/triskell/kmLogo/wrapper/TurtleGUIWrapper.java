package fr.irisa.triskell.kmLogo.wrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;
import fr.irisa.triskell.kmLogo.gui.ITurtleGUI;
import fr.irisa.triskell.kmLogo.gui.TurtleSimpleAWTGUI;

public class TurtleGUIWrapper {

	public final static String RUNTIMEOBJECT_DATA_KEY = "TurtlePlatformWrapper.JavaObject";
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
	
	public static RuntimeObject segmentAdded(RuntimeObject a)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.cos(inputVal), a.getFactory());
    }
/*	
	public static RuntimeObject addSegment(RuntimeObject ,)
    {
		return Real.create(java.lang.Math.PI, self.getFactory());
    }
	
	public static RuntimeObject setTurtlePosition(RuntimeObject x, RuntimeObject y)
    {
		double inputVal = Real.getValue(a);
		return Real.create(java.lang.Math.toDegrees(inputVal), x.getFactory());
    }
	public static RuntimeObject setTurtleBearing(RuntimeObject bearing)
    {
		double inputVal = Real.getValue(bearing);
		return Real.create(java.lang.Math.toRadians(inputVal), a.getFactory());
    }
    */
}
