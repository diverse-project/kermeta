package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class Spinner {
	public static RuntimeObject initialise(RuntimeObject spinnerRO) {
		final JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10000,1));
		
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "0"));
		spinner.setMaximumSize(new Dimension(50, 30));
		Source2TargetMap.MAP.add(spinnerRO, spinner);
		
		return spinnerRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject getValue(RuntimeObject spinnerRO) {
		JSpinner spinner = (JSpinner) Source2TargetMap.MAP.getTargetObject(spinnerRO);
		
		if(spinner==null)
			return spinnerRO.getFactory().getMemory().voidINSTANCE; 

		String value = spinner.getValue().toString();
		return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(value, spinnerRO.getFactory());
	}
}
