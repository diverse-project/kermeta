package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.InputEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

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
	public static RuntimeObject getModifiers(RuntimeObject self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof InputEvent)
			return Integer.create(((InputEvent)obj).getModifiers(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	/**
	 * @param self The Kermeta InputEvent.
	 * @return The modifiersEx (Integer) that contains the Java InputEvent encapsulates
	 * in the Kermeta InputEvent, or the Kermeta void.
	 */
	public static RuntimeObject getModifiersEx(RuntimeObject self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof InputEvent)
			return Integer.create(((InputEvent)obj).getModifiersEx(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
