package org.kermeta.ki.malai.widget;

import javax.swing.JCheckBox;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class CheckBox {
	public static void initialise(final Object cbRO) {
		Source2TargetMap.MAP.add(cbRO, new JCheckBox());
	}
	
	
	
	public static boolean isChecked(final Object cbRO) {
		final JCheckBox cb = (JCheckBox) Source2TargetMap.MAP.getTargetObject(cbRO); 
		
		return cb.isSelected();
	}
	
	
	
	public static void setText(final Object cbRO, final String textRO) {
		final JCheckBox cb = (JCheckBox) Source2TargetMap.MAP.getTargetObject(cbRO);
		
		cb.setText(textRO);
	}
}
