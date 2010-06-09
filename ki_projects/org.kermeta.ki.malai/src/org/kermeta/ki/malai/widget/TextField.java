package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JTextField;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class TextField {
	public static RuntimeObject initialise(final RuntimeObject textFieldRO) {
		final JTextField textField = new JTextField(15);
		
		textField.setMaximumSize(new Dimension(200, 30));
		textFieldRO.setUserData(textField);
		
		RuntimeObject2JavaMap.MAP.put(textField, textFieldRO);
		
		return textFieldRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject getText(final RuntimeObject textFieldRO) {
		final JTextField textField = (JTextField) textFieldRO.getUserData();
		
		return String.create(textField.getText(), textFieldRO.getFactory());
	}
	
	
	
	public static RuntimeObject setText(final RuntimeObject textFieldRO, final RuntimeObject textRO) {
		final JTextField textField = (JTextField) textFieldRO.getUserData();
		
		textField.setText(String.getValue(textRO));
		
		return String.create(textField.getText(), textFieldRO.getFactory());
	}
}
