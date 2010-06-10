package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JTextField;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class TextField {
	public static RuntimeObject initialise(final RuntimeObject textFieldRO) {
		final JTextField textField = new JTextField(15);
		
		textField.setMaximumSize(new Dimension(200, 30));
		Source2TargetMap.MAP.add(textFieldRO, textField);		
		
		return textFieldRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject getText(final RuntimeObject textFieldRO) {
		final JTextField textField = (JTextField) Source2TargetMap.MAP.getTargetObject(textFieldRO);
		
		return String.create(textField.getText(), textFieldRO.getFactory());
	}
	
	
	
	public static RuntimeObject setText(final RuntimeObject textFieldRO, final RuntimeObject textRO) {
		final JTextField textField = (JTextField) Source2TargetMap.MAP.getTargetObject(textFieldRO);
		
		textField.setText(String.getValue(textRO));
		
		return String.create(textField.getText(), textFieldRO.getFactory());
	}
}
