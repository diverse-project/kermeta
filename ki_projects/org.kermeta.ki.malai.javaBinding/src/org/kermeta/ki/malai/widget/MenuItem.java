package org.kermeta.ki.malai.widget;

import javax.swing.JMenuItem;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class MenuItem {
	public static RuntimeObject initialise(final RuntimeObject menuItemRO) {
		final JMenuItem menuItem = new JMenuItem();
		menuItemRO.setUserData(menuItem);
		RuntimeObject2JavaMap.MAP.put(menuItem, menuItemRO);
		
		return menuItemRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject setText(final RuntimeObject menuItemRO, final RuntimeObject nameRO) {
		final JMenuItem menuItem = (JMenuItem) menuItemRO.getUserData();
		
		menuItem.setText(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO));
		
		return menuItemRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject getText(final RuntimeObject menuItemRO) {
		final JMenuItem menuItem = (JMenuItem) menuItemRO.getUserData();
		
		return String.create(menuItem.getText(), menuItemRO.getFactory());
	}
}
