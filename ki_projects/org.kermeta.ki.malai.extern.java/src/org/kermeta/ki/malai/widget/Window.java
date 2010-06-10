package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JWindow;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class Window {
	public static void setAlwaysOnTop(final Object windowRO, final boolean onTop) {
		final JWindow window = (JWindow) Source2TargetMap.MAP.getTargetObject(windowRO);
		
		window.setAlwaysOnTop(onTop);
	}
	
	
	
	public static void initialise(final Object windowRO) {
		final JWindow window = new JWindow();
		
		window.setLocation(200, 200);
		Source2TargetMap.MAP.add(windowRO, window);
	}
	
	
	
	public static void add(final Object windowRO, final Object componentRO) {
		final Object window = Source2TargetMap.MAP.getTargetObject(windowRO);
		final Object comp   = Source2TargetMap.MAP.getTargetObject(componentRO);
		
		if(window==null || !(window instanceof JWindow) || comp==null || !(comp instanceof Component))
			System.out.println("The graphicals objects are null or are not valid: " + window + " " + comp);
		else {
			JWindow win = (JWindow) window;
			win.getContentPane().add((Component)comp);
			win.pack();
		}
	}
}
