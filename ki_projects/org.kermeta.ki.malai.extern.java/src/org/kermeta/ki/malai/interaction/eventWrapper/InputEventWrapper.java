package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.InputEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

/**
 * Bridges the gap between a Kermeta InputEvent and a Java InputEvent.
 * @author Arnaud Blouin
 */
public abstract class InputEventWrapper extends AWTEventWrapper {
	/**
	 * @param self The Kermeta InputEvent.
	 * @return The modifiers (Integer) that contains the Java InputEvent encapsulates
	 * in the Kermeta InputEvent, or the Kermeta void.
	 */
	public static int getModifiers(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof InputEvent)
			return ((InputEvent)obj).getModifiers();
		
		return -1;
	}
	
	
	/**
	 * @param self The Kermeta InputEvent.
	 * @return The modifiersEx (Integer) that contains the Java InputEvent encapsulates
	 * in the Kermeta InputEvent, or the Kermeta void.
	 */
	public static int getModifiersEx(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof InputEvent)
			return ((InputEvent)obj).getModifiersEx();
		
		return -1;
	}
}
