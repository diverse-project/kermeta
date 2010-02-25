package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.KeyEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

/**
 * Bridges the gap between a Kermeta KeyEvent and a Java KeyEvent.
 * @author Arnaud Blouin
 */
public abstract class KeyEventWrapper extends InputEventWrapper {
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The key code (Integer) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static RuntimeObject getKeyCode(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof KeyEvent)
			return Integer.create(((KeyEvent)obj).getKeyCode(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The key location (Integer) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static RuntimeObject getKeyLocation(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof KeyEvent)
			return Integer.create(((KeyEvent)obj).getKeyLocation(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The key char (String) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static RuntimeObject getKeyChar(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof KeyEvent)
			return String.create(java.lang.String.valueOf(((KeyEvent)obj).getKeyChar()), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The isActionKey value (Boolean) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static RuntimeObject isActionKey(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof KeyEvent)
			return ((KeyEvent)obj).isActionKey() ? self.getFactory().getMemory().trueINSTANCE : self.getFactory().getMemory().falseINSTANCE;
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
