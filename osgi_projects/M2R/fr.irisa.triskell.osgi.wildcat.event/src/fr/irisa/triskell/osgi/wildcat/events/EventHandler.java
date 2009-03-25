package fr.irisa.triskell.osgi.wildcat.events;
import org.osgi.service.event.Event;
import org.ow2.wildcat.Context;
import org.ow2.wildcat.ContextException;
import org.ow2.wildcat.hierarchy.attribute.Attribute;
import org.ow2.wildcat.hierarchy.attribute.POJOAttribute;


public class EventHandler implements org.osgi.service.event.EventHandler {

	private Context wildcatContext;
	
	/*public EventHandler(Context wildcatContext) {
		this.wildcatContext = wildcatContext;
	}*/
	
	@Override
	public void handleEvent(Event event) {
		System.out.println("handle event : " + event.getTopic());
		if (!event.getTopic().equals(EventConstants.TOPIC_NAME)) {
			System.out.println(event.getTopic() + " will be emit as a Wildcat event");
			String identifier = "self://" + event.getTopic() + "#event";
			try {
				Attribute attribute = wildcatContext.getAttribute(identifier);
				if (attribute != null) {
					wildcatContext.setValue(identifier, event);
				} else {
					wildcatContext.attachAttribute(identifier, new EventAttribute(event));
					wildcatContext.setValue(identifier, event);
				}
				
			} catch (ContextException e) {
				e.printStackTrace();
			}
		}
	}
	
	class EventAttribute extends POJOAttribute {

		public EventAttribute(Object value) {
			super(value);
		}
	}

}
