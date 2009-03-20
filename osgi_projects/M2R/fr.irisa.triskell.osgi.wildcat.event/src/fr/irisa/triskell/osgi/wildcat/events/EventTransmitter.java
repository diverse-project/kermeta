package fr.irisa.triskell.osgi.wildcat.events;

import org.ow2.wildcat.event.WAttributeEvent;

public interface EventTransmitter {

	public void sendEvent(WAttributeEvent attributeEvent);
	
	public void postEvent(WAttributeEvent attributeEvent);
}
