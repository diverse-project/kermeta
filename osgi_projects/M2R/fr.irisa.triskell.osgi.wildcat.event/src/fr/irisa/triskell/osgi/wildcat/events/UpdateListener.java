package fr.irisa.triskell.osgi.wildcat.events;

import org.ow2.wildcat.event.WAttributeEvent;

import com.espertech.esper.event.EventBean;


public class UpdateListener implements com.espertech.esper.client.UpdateListener {

	private EventTransmitter eventTransmitter;
	
	@Override
	public void update(EventBean[] arg0, EventBean[] arg1) {
		for (EventBean eventBean : arg0) {
			if (eventBean.getUnderlying() instanceof WAttributeEvent) {
				WAttributeEvent attributeEvent = ((WAttributeEvent) eventBean
						.getUnderlying());
				eventTransmitter.sendEvent(attributeEvent);
			} else {
				System.err.println("UpdateListener don't manage this type of class : " + eventBean.getUnderlying().getClass());
			}
		}
	}
}