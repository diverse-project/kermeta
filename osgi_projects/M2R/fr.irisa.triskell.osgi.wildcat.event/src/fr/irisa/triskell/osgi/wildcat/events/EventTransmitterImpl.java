package fr.irisa.triskell.osgi.wildcat.events;

import java.util.Properties;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.ow2.wildcat.event.WAttributeEvent;

public class EventTransmitterImpl implements EventTransmitter {

	//private BundleContext bundleContext;
	
	private EventAdmin eventAdmin;

	/*public EventTransmitter(BundleContext context) {
		this.bundleContext = context;
	}*/

	public Event createEvent(WAttributeEvent attributeEvent) {
		Properties properties = new Properties();
		properties.put(EventConstants.WILDCAT_SOURCE, attributeEvent.getSource());
		properties.put(EventConstants.WILDCAT_VALUE, attributeEvent.getValue());
		return new Event(EventConstants.TOPIC_NAME, properties);
	}

	public void sendEvent(WAttributeEvent attributeEvent) {
		try {
			eventAdmin.sendEvent(createEvent(attributeEvent));
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	public void postEvent(WAttributeEvent attributeEvent) {
		eventAdmin.postEvent(createEvent(attributeEvent));
	}
}
