package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public class EventWrapper {
	
	protected java.lang.String name;
	
	protected AWTEvent info;
	
	
	
	public EventWrapper(java.lang.String name, AWTEvent info) {
		super();
		
		if(name==null)
			throw new IllegalArgumentException();
		
		this.name = name;
		this.info = info;
	}
	
	
	
	public static RuntimeObject getName(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventWrapper)
			return String.create(((EventWrapper)obj).name, self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject getInfo(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof EventWrapper) {
			EventWrapper ew  = (EventWrapper) obj;
			RuntimeObject ro = self.getFactory().createObjectFromClassName(getEventClassPath(ew.info));
			ro.setUserData(ew.info);
			
			return ro;
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static java.lang.String getEventClassPath(AWTEvent evt) {
		if(evt instanceof ActionEvent) 		return "kermeta::ki::malai::interaction::event::ActionEvent";
		if(evt instanceof MouseWheelEvent) 	return "kermeta::ki::malai::interaction::event::MouseWheelEventWrapper";
		if(evt instanceof MouseEvent) 		return "kermeta::ki::malai::interaction::event::MouseEventWrapper";
		if(evt instanceof KeyEvent)			return "kermeta::ki::malai::interaction::event::KeyEventWrapper";
		return "";
	}
}
