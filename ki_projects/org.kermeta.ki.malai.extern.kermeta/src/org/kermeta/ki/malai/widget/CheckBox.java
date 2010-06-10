package org.kermeta.ki.malai.widget;

import javax.swing.JCheckBox;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class CheckBox {
	public static RuntimeObject initialise(RuntimeObject cbRO) {
		Source2TargetMap.MAP.add(cbRO, new JCheckBox());
		
		return cbRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject isChecked(RuntimeObject cbRO) {
		final JCheckBox cb = (JCheckBox) Source2TargetMap.MAP.getTargetObject(cbRO); 
		
		return cb.isSelected() ? cbRO.getFactory().getMemory().trueINSTANCE : cbRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	
	
	public static RuntimeObject setText(RuntimeObject cbRO, RuntimeObject textRO) {
		final JCheckBox cb = (JCheckBox) Source2TargetMap.MAP.getTargetObject(cbRO);
		
		cb.setText(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(textRO));
		
		return cbRO.getFactory().getMemory().voidINSTANCE; 
	}
}
