package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.Component;

import org.kermeta.ki.malai.dispatcherWrapper.DispatcherWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class EventManagerWrapperExtern {
	/**
	 * Attaches the SwingEventManager to the Java component to listen.
	 * @param componentRO The Java Component to listen.
	 * @param eventManagerRO The event manager to attach to the component.
	 */
	public static RuntimeObject attachTo(final RuntimeObject componentRO, final RuntimeObject eventManagerRO) {
		final Object obj1 = componentRO==null ? null : Source2TargetMap.MAP.getTargetObject(componentRO);
		final Object obj2 = eventManagerRO==null ? null : Source2TargetMap.MAP.getTargetObject(eventManagerRO);
		
		if(obj1 instanceof Component && obj2 instanceof EventManagerWrapper)
			((EventManagerWrapper) obj2).attachTo((Component) obj1);
		else
			System.err.println("ERROR KI: Trying to attach the event manager " + obj2 + " to the component " + obj1 + ".");
		
		return componentRO==null ? null : componentRO.getFactory().getMemory().voidINSTANCE;
	}
	
	

	
	/**
	 * Initialises a Kermeta EventManager by encapsulating this EventManagerWrapper
	 * into it.
	 * @param self The Kermeta EventManager.
	 * @param dispatcherRo A Kermeta AbstractDispatcher that contains the Java DispatcherWrapper.
	 * @return The Kermeta EventManager.
	 */
	public static RuntimeObject initialise(final RuntimeObject self, final RuntimeObject dispatcherRo) {
		EventManagerWrapper emw = new EventManagerWrapper();
		emw.dispatcher 			= (DispatcherWrapper) Source2TargetMap.MAP.getTargetObject(dispatcherRo);
		Source2TargetMap.MAP.add(self, emw);

		return self;
	}
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return True if the list of events is not empty.
	 */
	public static RuntimeObject isWaiting(final RuntimeObject self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		if(obj instanceof EventManagerWrapper)
			return ((EventManagerWrapper)obj).isEmpty() ? self.getFactory().getMemory().falseINSTANCE : self.getFactory().getMemory().trueINSTANCE;
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return The next Kermeta Event to analyse.
	 */
	public static RuntimeObject getTopEvent(final RuntimeObject self) {
		// An instance of the Kermeta class Event is created.
		EventManagerWrapper emw = (EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(self);
		RuntimeObject ro = self.getFactory().createObjectFromClassName("kermeta::ki::malai::interaction::event::Event");
		// The next Java Event is encapsulating into the Kermeta Event.
		Source2TargetMap.MAP.add(ro, emw.getTopEvent());
		
		return ro;
	}
}
