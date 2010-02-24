package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.InputEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public abstract class InputEventWrapper extends AWTEventWrapper {

	public static RuntimeObject getModifiers(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof InputEvent)
			return Integer.create(((InputEvent)obj).getModifiers(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject getModifiersEx(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof InputEvent)
			return Integer.create(((InputEvent)obj).getModifiersEx(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
