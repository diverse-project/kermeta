package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JTextField;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class TextField {
	public static void initialise(final Object textFieldRO) {
		final JTextField textField = new JTextField(15);
		
		textField.setMaximumSize(new Dimension(200, 30));
		Source2TargetMap.MAP.add(textFieldRO, textField);		
	}
	
	
	public static String getText(final Object textFieldRO) {
		final JTextField textField = (JTextField) Source2TargetMap.MAP.getTargetObject(textFieldRO);
		
		return textField.getText();
	}
	
	
	
	public static void setText(final Object textFieldRO, final String text) {
		final JTextField textField = (JTextField) Source2TargetMap.MAP.getTargetObject(textFieldRO);
		
		textField.setText(text);
	}
}
