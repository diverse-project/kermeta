package org.kermeta.ki.malai.widget;

import javax.swing.JMenuItem;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class MenuItem {
	public static void initialise(final Object menuItemRO) {
		Source2TargetMap.MAP.add(menuItemRO, new JMenuItem());
	}
	
	
	public static void setText(final Object menuItemRO, final String nameRO) {
		final JMenuItem menuItem = (JMenuItem) Source2TargetMap.MAP.getTargetObject(menuItemRO);
		menuItem.setText(nameRO);
	}
	
	
	
	public static String getText(final Object menuItemRO) {
		final JMenuItem menuItem = (JMenuItem) Source2TargetMap.MAP.getTargetObject(menuItemRO);
		return menuItem.getText();
	}
}
