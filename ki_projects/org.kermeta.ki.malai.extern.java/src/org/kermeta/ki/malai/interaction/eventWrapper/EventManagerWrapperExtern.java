package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class EventManagerWrapperExtern {
	/**
	 * Attaches the SwingEventManager to the Java component to listen.
	 * @param componentRO The Java Component to listen.
	 * @param eventManagerRO The event manager to attach to the component.
	 */
	public static void attachTo(final Object componentRO, final Object eventManagerRO) {
		final Object obj1 = componentRO==null ? null : Source2TargetMap.MAP.getTargetObject(componentRO);
		final Object obj2 = eventManagerRO==null ? null : Source2TargetMap.MAP.getTargetObject(eventManagerRO);
		
		if(obj1 instanceof Component && obj2 instanceof EventManagerWrapper)
			((EventManagerWrapper) obj2).attachTo((Component) obj1);
		else
			System.err.println("ERROR KI: Trying to attach the event manager " + obj2 + " to the component " + obj1 + ".");
	}
	
	

	
	/**
	 * Initialises a Kermeta EventManager by encapsulating this EventManagerWrapper into it.
	 * @param self The Kermeta EventManager.
	 */
	public static void initialise(final Object self) {
		Source2TargetMap.MAP.add(self, new EventManagerWrapper());
	}
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return True if the list of events is not empty.
	 */
	public static boolean isWaiting(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		return obj instanceof EventManagerWrapper && ((EventManagerWrapper)obj).isEmpty();
	}
	
	
	
	/**
	 * @param self The Kermeta EventManager that encapsulates the EventManagerWrapper.
	 * @return The next Kermeta Event to analyse.
	 */
	public static Object getTopEvent(final Object self) {
		// An instance of the Kermeta class Event is created.
		EventManagerWrapper emw 	= (EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(self);
		EventWrapper eventWrapper 	= emw.getTopEvent();
		Object topEvent 			= null;
		try {
			// Getting the Scala factory that creates Kermeta Event.
			Class<?> eventClass = Class.forName("kermeta.ki.malai.interaction.event.RichFactory");
			Method method 		= eventClass.getMethod("createEvent");
			topEvent 			= method.invoke(eventClass);

			if(topEvent!=null)
				Source2TargetMap.MAP.add(topEvent, eventWrapper);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return topEvent;
	}
}
