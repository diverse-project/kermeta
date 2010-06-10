package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseWheelEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

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
	public static int getScrollAmount(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseWheelEvent)
			return ((MouseWheelEvent)obj).getScrollAmount();
		
		return -1;
	}

	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The scroll type value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static int getScrollType(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseWheelEvent)
			return ((MouseWheelEvent)obj).getScrollType();
		
		return -1;
	}
	
	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The unitsToScroll value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static int getUnitsToScroll(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseWheelEvent)
			return ((MouseWheelEvent)obj).getUnitsToScroll();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseWheelEvent.
	 * @return The wheel rotation value (Integer) that contains the Java MouseWheelEvent encapsulates
	 * in the Kermeta MouseWheelEvent, or the Kermeta void.
	 */
	public static int getWheelRotation(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseWheelEvent)
			return ((MouseWheelEvent)obj).getWheelRotation();
		
		return -1;
	}
}
