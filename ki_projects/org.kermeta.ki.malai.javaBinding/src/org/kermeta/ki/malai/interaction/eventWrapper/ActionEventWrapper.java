package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.ActionEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

/**
 * Bridges the gap between a kermeta ActionEvent and a Java ActionEvent.
 * @author Arnaud Blouin
 */
public abstract class ActionEventWrapper extends AWTEventWrapper {
	/**
	 * @param self The Kermeta ActionEvent.
	 * @return The modifiers (Integer) that contains the Java ActionEvent encapsulates
	 * in the Kermeta ActionEvent, or the kermeta void.
	 */
	public static RuntimeObject getModifiers(RuntimeObject self) {
		Object obj = self.getUserData(); // We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)// We convert the Java int into a Kermeta Integer.
			return Integer.create(((ActionEvent)obj).getModifiers(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}

	
	
	/**
	 * @param self The kermeta ActionEvent.
	 * @return The action command (String) of the object that produces the Java ActionEvent encapsulates
	 * into the given kermeta ActionEvent, or the kermeta void.
	 */
	public static RuntimeObject getActionCommand(RuntimeObject self) {
		Object obj = self.getUserData(); // We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)// We convert the Java String into a Kermeta String.
			return String.create(((ActionEvent)obj).getActionCommand(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The kermeta ActionEvent.
	 * @return The paramString value (String) of the Java ActionEvent encapsulates into the
	 * Kermeta ActionEvent, or the kermeta void.
	 */
	public static RuntimeObject paramString(RuntimeObject self) {
		Object obj = self.getUserData();// We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)// We convert the Java String into a Kermeta String.
			return String.create(((ActionEvent)obj).paramString(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
