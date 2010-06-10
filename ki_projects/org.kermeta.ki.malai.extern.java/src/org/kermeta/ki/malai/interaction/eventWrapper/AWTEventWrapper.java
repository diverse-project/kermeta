package org.kermeta.ki.malai.interaction.eventWrapper;

import java.util.EventObject;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

/**
 * Bridges the gap between a kermeta AWTEvent and a Java AWTEvent.
 * @author Arnaud Blouin
 */
public abstract class AWTEventWrapper {
	/**
	 * @param self The kermeta AWTEvent.
	 * @return The kermeta object corresponding to the Java object that produces the event.
	 */
	public static Object getSourceObject(final Object self) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(self);
		Object ro;

		if(obj instanceof EventObject){
			final Object src = ((EventObject)obj).getSource();
			ro = src==null ? null : Source2TargetMap.MAP.getSourceObject(src);
		}
		else ro = null;

		return ro;
	}
}
