package org.kermeta.ki.malai.interaction.eventWrapper;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;


public class ChangeEventWrapper extends AWTEventWrapper {
	/**
	 * @param self The kermeta ActionEvent.
	 * @return The action command (String) of the object that produces the Java ActionEvent encapsulates
	 * into the given kermeta ActionEvent, or the kermeta void.
	 */
	public static RuntimeObject getValue(RuntimeObject self) {
		Object obj = self.getUserData(); // We get the Java ChangeEvent.
		
		if(obj instanceof ChangeEvent) {
			Object source = ((ChangeEvent)obj).getSource();
			
			if(source instanceof JSpinner) // We return the value of the spinner.
				return String.create(((JSpinner)source).getValue().toString(), self.getFactory());
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
