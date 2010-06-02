package org.kermeta.ki.malai.widget;

import javax.swing.JCheckBox;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class CheckBox {
	public static RuntimeObject initialise(RuntimeObject cbRO) {
		final JCheckBox cb = new JCheckBox(); 
		
		cbRO.setUserData(cb);
		RuntimeObject2JavaMap.MAP.put(cb, cbRO);
		
		return cbRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject isChecked(RuntimeObject cbRO) {
		final JCheckBox cb = (JCheckBox) cbRO.getUserData(); 
		
		return cb.isSelected() ? cbRO.getFactory().getMemory().trueINSTANCE : cbRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	
	
	public static RuntimeObject setText(RuntimeObject cbRO, RuntimeObject textRO) {
		final JCheckBox cb = (JCheckBox) cbRO.getUserData();
		final String text  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(textRO);
		
		cb.setText(text);
		
		return cbRO.getFactory().getMemory().voidINSTANCE; 
	}
}
