package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.EventObject;

import javax.swing.event.ChangeEvent;

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
	
	public static final java.lang.String ITEM_STATE_CHANGED	= "ITEM_STATE_CHANGED";
	
	public static final java.lang.String STATE_CHANGED		= "STATE_CHANGED";
	
	public static final java.lang.String EXIT_EVENT			= "EXIT_EVENT";
	
	
	/** The name of the produced event (e.g. MOUSE_PRESSED). */
	protected java.lang.String name;
	
	/** The Java event object produced by the UI. */
	protected EventObject info;
	
	
	/**
	 * Initialises an EventWrapper.
	 * @param name The name of the EventWrapper (see MOUSE_PRESSED, etc.).
	 * @param info The java event object.
	 * @throws IllegalArgumentException If name is null.
	 */
	public EventWrapper(java.lang.String name, EventObject info) {
		super();
		
		if(name==null)
			throw new IllegalArgumentException();
		
		this.name = name;
		this.info = info;
	}
	
	
	
	/**
	 * Deduces from the Java event object given as argument the Kermeta class path corresponding to
	 * this Java event object.
	 * @param evt The Java event object to check.
	 * @return The Kermeta class path corresponding to the Kermeta class of the given Java Event class.
	 */
	public static java.lang.String getEventClassPath(EventObject evt) {
		if(evt instanceof ActionEvent) 		return "kermeta::ki::malai::interaction::event::ActionEvent";
		if(evt instanceof MouseWheelEvent) 	return "kermeta::ki::malai::interaction::event::MouseWheelEvent";
		if(evt instanceof MouseEvent) 		return "kermeta::ki::malai::interaction::event::MouseEvent";
		if(evt instanceof KeyEvent)			return "kermeta::ki::malai::interaction::event::KeyEvent";
		if(evt instanceof ItemEvent)		return "kermeta::ki::malai::interaction::event::ItemEvent";
		if(evt instanceof ChangeEvent)		return "kermeta::ki::malai::interaction::event::ChangeEvent";
		return "EVENT CLASS NOT FOUND";
	}
}
