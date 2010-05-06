package org.kermeta.ki.malai.widget;

import java.awt.Dimension;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class Spinner {
	public static RuntimeObject initialise(RuntimeObject spinnerRO, RuntimeObject eventManagerRO) {
		final EventManagerWrapper emw = (EventManagerWrapper) eventManagerRO.getUserData();
		final JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10000,1));
		
		spinner.setEditor(new JSpinner.NumberEditor(spinner, "0"));
		spinner.setMaximumSize(new Dimension(50, 30));
		
		spinnerRO.setUserData(spinner);
		RuntimeObject2JavaMap.MAP.put(spinner, spinnerRO);
		emw.attachTo(spinner);
		
		return spinnerRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject getValue(RuntimeObject spinnerRO) {
		JSpinner spinner = (JSpinner) spinnerRO.getUserData();
		
		if(spinner==null)
			return spinnerRO.getFactory().getMemory().voidINSTANCE; 

		String value = spinner.getValue().toString();
		return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(value, spinnerRO.getFactory());
	}
}
