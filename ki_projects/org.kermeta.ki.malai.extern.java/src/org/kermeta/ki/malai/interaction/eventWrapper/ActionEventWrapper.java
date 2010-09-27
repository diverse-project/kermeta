package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.ActionEvent;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

/**
 * Bridges the gap between a kermeta ActionEvent and a Java ActionEvent.
 * @author Arnaud Blouin
 */
public abstract class ActionEventWrapper extends AWTEventWrapper {
	/**
	 * @param self The Kermeta ActionEvent.
	 * @return The modifiers (Integer) that contains the Java ActionEvent encapsulates
	 * in the Kermeta ActionEvent, or the kermeta void.
	 */
	public static int getModifiers(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self); // We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)
			return ((ActionEvent)obj).getModifiers();
		
		return -1;
	}

	
	
	/**
	 * @param self The kermeta ActionEvent.
	 * @return The action command (String) of the object that produces the Java ActionEvent encapsulates
	 * into the given kermeta ActionEvent, or the kermeta void.
	 */
	public static String getActionCommand(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self); // We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)
			return ((ActionEvent)obj).getActionCommand();
		
		return "";
	}
	
	
	
	/**
	 * @param self The kermeta ActionEvent.
	 * @return The paramString value (String) of the Java ActionEvent encapsulates into the
	 * Kermeta ActionEvent, or the kermeta void.
	 */
	public static String paramString(final Object self) {
		Object obj = Source2TargetMap.MAP.getTargetObject(self);// We get the Java ActionEvent.
		
		if(obj instanceof ActionEvent)
			return ((ActionEvent)obj).paramString();
		
		return "";
	}
}
