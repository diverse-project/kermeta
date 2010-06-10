package org.kermeta.ki.malai.interaction.eventWrapper;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;


public class ChangeEventWrapper extends AWTEventWrapper {
	/**
	 * @param self The kermeta ActionEvent.
	 * @return 
	 * @return The action command (String) of the object that produces the Java ActionEvent encapsulates
	 * into the given kermeta ActionEvent, or the kermeta void.
	 */
	public static String getValue(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self); // We get the Java ChangeEvent.
		
		if(obj instanceof ChangeEvent) {
			Object source = ((ChangeEvent)obj).getSource();
			
			if(source instanceof JSpinner) // We return the value of the spinner.
				return ((JSpinner)source).getValue().toString();
		}
		
		return "";
	}
}
