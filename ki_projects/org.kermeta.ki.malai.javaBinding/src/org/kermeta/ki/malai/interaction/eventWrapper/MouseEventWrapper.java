package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseEvent;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * Bridges the gap between a Kermeta MouseEvent and a Java MouseEvent.
 * @author Arnaud Blouin
 */
public abstract class MouseEventWrapper extends InputEventWrapper {
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The button (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static RuntimeObject getButton(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getButton(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The click count value (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static RuntimeObject getClickCount(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getClickCount(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The X-coordinate (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static RuntimeObject getX(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getX(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The Y-coordinate (Integer) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static RuntimeObject getY(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getY(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	/**
	 * @param self The Kermeta MouseEvent.
	 * @return The paramString value (String) that contains the Java MouseEvent encapsulates
	 * in the Kermeta MouseEvent, or the Kermeta void.
	 */
	public static RuntimeObject paramString(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return String.create(((MouseEvent)obj).paramString(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
