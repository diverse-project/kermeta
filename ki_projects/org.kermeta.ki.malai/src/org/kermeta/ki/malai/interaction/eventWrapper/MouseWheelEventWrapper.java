package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseWheelEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

/**
 * Bridges the gap between a Kermeta MouseWheelEvent and a Java MouseWheelEvent.
 * @author Arnaud Blouin
 */
public abstract class MouseWheelEventWrapper extends MouseEventWrapper {
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The scroll amount value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static RuntimeObject getScrollAmount(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getScrollAmount(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}

	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The scroll type value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static RuntimeObject getScrollType(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getScrollType(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The unitsToScroll value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static RuntimeObject getUnitsToScroll(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getUnitsToScroll(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The wheel rotation value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static RuntimeObject getWheelRotation(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseWheelEvent)
			return Integer.create(((MouseWheelEvent)obj).getWheelRotation(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
