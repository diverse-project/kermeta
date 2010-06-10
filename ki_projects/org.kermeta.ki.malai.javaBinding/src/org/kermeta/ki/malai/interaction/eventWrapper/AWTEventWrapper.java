package org.kermeta.ki.malai.interaction.eventWrapper;

import java.util.EventObject;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Bridges the gap between a kermeta AWTEvent and a Java AWTEvent.
 * @author Arnaud Blouin
 */
public abstract class AWTEventWrapper {
	/**
	 * @param self The kermeta AWTEvent.
	 * @return The kermeta object corresponding to the Java object that produces the event.
	 */
	public static RuntimeObject getSourceObject(RuntimeObject self) {
		final Object obj = self.getUserData();
		RuntimeObject ro;
		
		if(obj instanceof EventObject){
			final Object src = ((EventObject)obj).getSource();
			ro = src==null ? null : RuntimeObject2JavaMap.MAP.get(src); 
		}
		else ro = null;

		return ro;
	}
}
