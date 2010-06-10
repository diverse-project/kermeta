package org.kermeta.ki.malai.widget;

import javax.swing.JMenuItem;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class MenuItem {
	public static RuntimeObject initialise(final RuntimeObject menuItemRO) {
		Source2TargetMap.MAP.add(menuItemRO, new JMenuItem());
		
		return menuItemRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject setText(final RuntimeObject menuItemRO, final RuntimeObject nameRO) {
		final JMenuItem menuItem = (JMenuItem) Source2TargetMap.MAP.getTargetObject(menuItemRO);
		
		menuItem.setText(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO));
		
		return menuItemRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject getText(final RuntimeObject menuItemRO) {
		final JMenuItem menuItem = (JMenuItem) Source2TargetMap.MAP.getTargetObject(menuItemRO);
		
		return String.create(menuItem.getText(), menuItemRO.getFactory());
	}
}
