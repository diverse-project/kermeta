package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseWheelEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public abstract class MouseWheelEventWrapper extends MouseEventWrapper {

	public static RuntimeObject getScrollAmount(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getScrollAmount(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject getScrollType(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getScrollType(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject getUnitsToScroll(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getUnitsToScroll(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject getWheelRotation(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getWheelRotation(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
