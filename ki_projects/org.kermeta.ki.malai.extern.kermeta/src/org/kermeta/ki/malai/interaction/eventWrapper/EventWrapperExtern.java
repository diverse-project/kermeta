package org.kermeta.ki.malai.interaction.eventWrapper;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class EventWrapperExtern {
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The name of the EventWrapper (String).
	 */
	public static RuntimeObject getName(RuntimeObject self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof EventWrapper)
			return String.create(((EventWrapper)obj).name, self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The java event object of the EventWrapper (an AWTEvent Kermeta instance).
	 */
	public static RuntimeObject getInfo(RuntimeObject self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof EventWrapper) {
			EventWrapper ew  = (EventWrapper) obj;
			// To create a Kermeta instance using the EventWrapper, we must get the type of the 
			// Java event object (e.g. ActionEvent, MouseEvent, etc.) in order to get the good
			// Kermeta class path to create an instance of this Kermeta class.
			try {
				RuntimeObject ro = self.getFactory().createObjectFromClassName(EventWrapper.getEventClassPath(ew.info));
				Source2TargetMap.MAP.add(ro, ew.info);
				
				return ro;
			}catch(Exception ex) {ex.printStackTrace(); }
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_WHEEL_MOVED.
	 */
	public static RuntimeObject getMouseWheelMovedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_WHEEL_MOVED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_RELEASED.
	 */
	public static RuntimeObject getMouseReleasedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_RELEASED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_PRESSED.
	 */
	public static RuntimeObject getMousePressedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_PRESSED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_MOVED.
	 */
	public static RuntimeObject getMouseMovedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_MOVED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_EXITED.
	 */
	public static RuntimeObject getMouseExitedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_EXITED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_ENTERED.
	 */
	public static RuntimeObject getMouseEnteredEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_ENTERED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_DRAGGED.
	 */
	public static RuntimeObject getMouseDraggedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_DRAGGED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.MOUSE_CLICKED.
	 */
	public static RuntimeObject getMouseClickedEventString(RuntimeObject self) {
		return String.create(EventWrapper.MOUSE_CLICKED, self.getFactory());
	}
	
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_TYPED.
	 */
	public static RuntimeObject getKeyTypedEventString(RuntimeObject self) {
		return String.create(EventWrapper.KEY_TYPED, self.getFactory());
	}
	
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_RELEASED.
	 */
	public static RuntimeObject getKeyReleasedEventString(RuntimeObject self) {
		return String.create(EventWrapper.KEY_RELEASED, self.getFactory());
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.KEY_PRESSED.
	 */
	public static RuntimeObject getKeyPressedEventString(RuntimeObject self) {
		return String.create(EventWrapper.KEY_PRESSED, self.getFactory());
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.ACTION_PERFORMED.
	 */
	public static RuntimeObject getActionPerformedEventString(RuntimeObject self) {
		return String.create(EventWrapper.ACTION_PERFORMED, self.getFactory());
	}
	
	
	
	/**
	 * @param self A Kermeta object.
	 * @return The kermeta String of EventWrapper.EXIT_EVENT.
	 */
	public static RuntimeObject getExitEventString(RuntimeObject self) {
		return String.create(EventWrapper.EXIT_EVENT, self.getFactory());
	}
}
