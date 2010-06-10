package org.kermeta.ki.malai.interaction.eventWrapper;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class EventWrapperExtern {
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The name of the EventWrapper (String).
	 */
	public static String getName(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof EventWrapper)
			return ((EventWrapper)obj).name;
		
		return "";
	}
	
	
	
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The java event object of the EventWrapper (an AWTEvent Kermeta instance).
	 */
	public static Object getInfo(final Object self) {
//		Object obj = Source2TargetMap.MAP.getTargetObject(self);
//		
//		if(obj instanceof EventWrapper) {
//			EventWrapper ew  = (EventWrapper) obj;
//			// To create a Kermeta instance using the EventWrapper, we must get the type of the 
//			// Java event object (e.g. ActionEvent, MouseEvent, etc.) in order to get the good
//			// Kermeta class path to create an instance of this Kermeta class.
//			try {
//				RuntimeObject ro = self.getFactory().createObjectFromClassName(EventWrapper.getEventClassPath(ew.info));
//				Source2TargetMap.MAP.add(ro, ew.info);
//				
//				return ro;
//			}catch(Exception ex) {ex.printStackTrace(); }
//		}
		return null;
	}
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_WHEEL_MOVED.
	 */
	public static String getMouseWheelMovedEventString(final Object self) {
		return EventWrapper.MOUSE_WHEEL_MOVED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_RELEASED.
	 */
	public static String getMouseReleasedEventString(final Object self) {
		return EventWrapper.MOUSE_RELEASED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_PRESSED.
	 */
	public static String getMousePressedEventString(final Object self) {
		return EventWrapper.MOUSE_PRESSED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_MOVED.
	 */
	public static String getMouseMovedEventString(final Object self) {
		return EventWrapper.MOUSE_MOVED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_EXITED.
	 */
	public static String getMouseExitedEventString(final Object self) {
		return EventWrapper.MOUSE_EXITED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_ENTERED.
	 */
	public static String getMouseEnteredEventString(final Object self) {
		return EventWrapper.MOUSE_ENTERED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_DRAGGED.
	 */
	public static String getMouseDraggedEventString(final Object self) {
		return EventWrapper.MOUSE_DRAGGED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_CLICKED.
	 */
	public static String getMouseClickedEventString(final Object self) {
		return EventWrapper.MOUSE_CLICKED;
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_TYPED.
	 */
	public static String getKeyTypedEventString(final Object self) {
		return EventWrapper.KEY_TYPED;
	}
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_RELEASED.
	 */
	public static String getKeyReleasedEventString(final Object self) {
		return EventWrapper.KEY_RELEASED;
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_PRESSED.
	 */
	public static String getKeyPressedEventString(final Object self) {
		return EventWrapper.KEY_PRESSED;
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.ACTION_PERFORMED.
	 */
	public static String getActionPerformedEventString(final Object self) {
		return EventWrapper.ACTION_PERFORMED;
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.EXIT_EVENT.
	 */
	public static String getExitEventString(final Object self) {
		return EventWrapper.EXIT_EVENT;
	}
}
