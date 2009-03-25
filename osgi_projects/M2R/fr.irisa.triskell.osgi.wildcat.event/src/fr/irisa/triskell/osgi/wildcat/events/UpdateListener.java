package fr.irisa.triskell.osgi.wildcat.events;

import org.ow2.wildcat.Context;
import org.ow2.wildcat.Query;
import org.ow2.wildcat.event.WAttributeEvent;

import com.espertech.esper.event.EventBean;


public class UpdateListener implements com.espertech.esper.client.UpdateListener {

	private EventTransmitter eventTransmitter;
	
	private Context wildcatContext;
	
	private Query query;
	
	public void start() {
		query = wildcatContext.createQuery("SELECT * FROM WEvent");
		wildcatContext.registerListeners(query, this);
	}
	
	public void stop() {
		wildcatContext.removeListeners(query, this);
	}
	
	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
		for (EventBean eventBean : arg0) {
			if (eventBean.getUnderlying() instanceof WAttributeEvent) {
				WAttributeEvent attributeEvent = ((WAttributeEvent) eventBean
						.getUnderlying());
				eventTransmitter.sendEvent(attributeEvent);
			} else {
				//System.err.println("UpdateListener don't manage this type of wildcat event : " + eventBean.getUnderlying().getClass());
			}
		}
	}
}