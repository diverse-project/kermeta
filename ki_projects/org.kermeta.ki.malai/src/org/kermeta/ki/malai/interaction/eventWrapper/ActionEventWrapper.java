package org.kermeta.ki.malai.interaction.eventWrapper;

import java.awt.event.ActionEvent;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

public abstract class ActionEventWrapper extends AWTEventWrapper {

	public static RuntimeObject getModifiers(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof ActionEvent)
			return Integer.create(((ActionEvent)obj).getModifiers(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject getActionCommand(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof ActionEvent)
			return String.create(((ActionEvent)obj).getActionCommand(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject paramString(RuntimeObject self) {
		Object obj = self.getUserData();
		
		if(obj instanceof ActionEvent)
			return String.create(((ActionEvent)obj).paramString(), self.getFactory());
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
