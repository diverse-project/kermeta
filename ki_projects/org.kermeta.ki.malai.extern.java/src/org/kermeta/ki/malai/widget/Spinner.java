package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class Spinner {
	public static void initialise(Object spinnerRO) {
		final JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10000,1));
		
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "0"));
		spinner.setMaximumSize(new Dimension(50, 30));
		Source2TargetMap.MAP.add(spinnerRO, spinner);
	}
	
	
	public static String getValue(Object spinnerRO) {
		JSpinner spinner = (JSpinner) Source2TargetMap.MAP.getTargetObject(spinnerRO);
		
		if(spinner==null)
			return "";

		return spinner.getValue().toString();
	}
}
