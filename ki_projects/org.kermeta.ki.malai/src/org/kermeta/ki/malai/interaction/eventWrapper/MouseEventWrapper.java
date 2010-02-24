package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.MouseEvent;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class MouseEventWrapper extends InputEventWrapper {
	
	public static RuntimeObject getButton(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getButton(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject getClickCount(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getClickCount(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject getX(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getX(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject getY(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return Integer.create(((MouseEvent)obj).getY(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject paramString(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof MouseEvent)
			return String.create(((MouseEvent)obj).paramString(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
