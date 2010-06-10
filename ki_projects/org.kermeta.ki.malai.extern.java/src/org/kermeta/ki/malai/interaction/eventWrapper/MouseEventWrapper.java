package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

/**
 * Bridges the gap between a Kermeta MouseEvent and a Java MouseEvent.
 * @author Arnaud Blouin
 */
public abstract class MouseEventWrapper extends InputEventWrapper {
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The button (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static int getButton(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseEvent)
			return ((MouseEvent)obj).getButton();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The click count value (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static int getClickCount(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseEvent)
			return ((MouseEvent)obj).getClickCount();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The X-coordinate (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static int getX(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseEvent)
			return ((MouseEvent)obj).getX();
		
		return -1;
	}
	
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The Y-coordinate (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static int getY(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseEvent)
			return ((MouseEvent)obj).getY();
		
		return -1;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The paramString value (String) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static String paramString(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof MouseEvent)
			return ((MouseEvent)obj).paramString();
		
		return "";
	}
}
