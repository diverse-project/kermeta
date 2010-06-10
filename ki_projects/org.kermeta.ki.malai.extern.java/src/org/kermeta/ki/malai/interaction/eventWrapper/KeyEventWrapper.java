package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.KeyEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

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
	public static int getKeyCode(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof KeyEvent)
			return ((KeyEvent)obj).getKeyCode();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The key location (Integer) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static int getKeyLocation(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof KeyEvent)
			return ((KeyEvent)obj).getKeyLocation();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The key char (String) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static String getKeyChar(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof KeyEvent)
			return String.valueOf(((KeyEvent)obj).getKeyChar());
		
		return "";
	}
	
	
	
	/**
	 * @param self The Kermeta KeyEvent.
	 * @return The isActionKey value (Boolean) that contains the Java KeyEvent encapsulates
	 * in the Kermeta KeyEvent, or the kermeta void.
	 */
	public static boolean isActionKey(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		return obj instanceof KeyEvent && ((KeyEvent)obj).isActionKey();
	}
}
