package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

/**
 * This class encapsulates a Java event object (e.g. a MouseEvent) with the name 
 * of the event produced (e.g. mousePressed). Such a class is needed since an
 * event object does not contains the corresponding event name produces by the UI.
 * @author Arnaud Blouin
 */
public class EventWrapper {
	public static final java.lang.String MOUSE_PRESSED 		= "MOUSE_PRESSED";
	
	public static final java.lang.String MOUSE_RELEASED 	= "MOUSE_RELEASED";
	
	public static final java.lang.String MOUSE_ENTERED 		= "MOUSE_ENTERED";
	
	public static final java.lang.String MOUSE_CLICKED 		= "MOUSE_CLICKED";
	
	public static final java.lang.String MOUSE_MOVED 		= "MOUSE_MOVED";
	
	public static final java.lang.String MOUSE_DRAGGED 		= "MOUSE_DRAGGED";
	
	public static final java.lang.String MOUSE_EXITED 		= "MOUSE_EXITED";
	
	public static final java.lang.String MOUSE_WHEEL_MOVED 	= "MOUSE_WHEEL_MOVED";
	
	public static final java.lang.String KEY_PRESSED 		= "KEY_PRESSED";
	
	public static final java.lang.String KEY_RELEASED 		= "KEY_RELEASED";
	
	public static final java.lang.String KEY_TYPED 			= "KEY_TYPED";
	
	public static final java.lang.String ACTION_PERFORMED	= "ACTION_PERFORMED";
	
	public static final java.lang.String EXIT_EVENT			= "EXIT_EVENT";
	
	
	/** The name of the produced event (e.g. MOUSE_PRESSED). */
	protected java.lang.String name;
	
	/** The Java event object produced by the UI. */
	protected AWTEvent info;
	
	
	/**
	 * Initialises an EventWrapper.
	 * @param name The name of the EventWrapper (see MOUSE_PRESSED, etc.).
	 * @param info The java event object.
	 * @throws IllegalArgumentException If name is null.
	 */
	public EventWrapper(java.lang.String name, AWTEvent info) {
		super();
		
		if(name==null)
			throw new IllegalArgumentException();
		
		this.name = name;
		this.info = info;
	}
	
	
	
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The name of the EventWrapper (String).
	 */
	public static RuntimeObject getName(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventWrapper)
			return String.create(((EventWrapper)obj).name, self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta Event that encapsulates the EventWrapper. 
	 * @return The java event object of the EventWrapper (an AWTEvent Kermeta instance).
	 */
	public static RuntimeObject getInfo(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventWrapper) {
			EventWrapper ew  = (EventWrapper) obj;
			// To create a Kermeta instance using the EventWrapper, we must get the type of the 
			// Java event object (e.g. ActionEvent, MouseEvent, etc.) in order to get the good
			// Kermeta class path to create an isntance of this Kermeta class.
			RuntimeObject ro = self.getFactory().createObjectFromClassName(getEventClassPath(ew.info));
			ro.setUserData(ew.info);
			
			return ro;
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * Deduces from the Java event object given as argument the Kermeta class path corresponding to
	 * this Java event object.
	 * @param evt The Java event object to check.
	 * @return The Kermeta class path corresponding to the Kermeta class of the given Java Event class.
	 */
	public static java.lang.String getEventClassPath(AWTEvent evt) {
		if(evt instanceof ActionEvent) 		return "kermeta::ki::malai::interaction::event::ActionEvent";
		if(evt instanceof MouseWheelEvent) 	return "kermeta::ki::malai::interaction::event::MouseWheelEvent";
		if(evt instanceof MouseEvent) 		return "kermeta::ki::malai::interaction::event::MouseEvent";
		if(evt instanceof KeyEvent)			return "kermeta::ki::malai::interaction::event::KeyEvent";
		return "";
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
