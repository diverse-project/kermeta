package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JWindow;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class Window {
	public static RuntimeObject setAlwaysOnTop(final RuntimeObject windowRO, final RuntimeObject onTopRO) {
		final JWindow window = (JWindow) Source2TargetMap.MAP.getTargetObject(windowRO);
		final boolean onTop = Boolean.getValue(onTopRO);
		
		window.setAlwaysOnTop(onTop);
		
		return windowRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject initialise(final RuntimeObject windowRO) {
		final JWindow window = new JWindow();
		
		window.setLocation(200, 200);
		Source2TargetMap.MAP.add(windowRO, window);
		
		return windowRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject add(final RuntimeObject windowRO, final RuntimeObject componentRO) {
		final Object window = Source2TargetMap.MAP.getTargetObject(windowRO);
		final Object comp   = Source2TargetMap.MAP.getTargetObject(componentRO);
		
		if(window==null || !(window instanceof JWindow) || comp==null || !(comp instanceof Component))
			System.out.println("The graphicals objects are null or are not valid: " + window + " " + comp);
		else {
			JWindow win = (JWindow) window;
			win.getContentPane().add((Component)comp);
			win.pack();
		}
		
		return windowRO.getFactory().getMemory().voidINSTANCE; 
	}
}
