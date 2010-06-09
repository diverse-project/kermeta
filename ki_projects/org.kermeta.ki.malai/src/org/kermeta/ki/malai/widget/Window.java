package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JWindow;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class Window {
	public static RuntimeObject setAlwaysOnTop(final RuntimeObject windowRO, final RuntimeObject onTopRO) {
		final JWindow window = (JWindow) windowRO.getUserData();
		final boolean onTop = Boolean.getValue(onTopRO);
		
		window.setAlwaysOnTop(onTop);
		
		return windowRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject initialise(final RuntimeObject windowRO) {
		final JWindow window = new JWindow();
		
		window.setLocation(200, 200);
		
		windowRO.setUserData(window);
		RuntimeObject2JavaMap.MAP.put(window, windowRO);
		
		return windowRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject add(final RuntimeObject windowRO, final RuntimeObject componentRO) {
		final Object window = windowRO.getUserData();
		final Object comp   = componentRO.getUserData();
		
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
