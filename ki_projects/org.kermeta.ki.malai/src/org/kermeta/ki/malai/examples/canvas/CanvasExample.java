package org.kermeta.ki.malai.examples.canvas;

import org.kermeta.ki.malai.examples.canvas.ui.CanvasIS;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;

public class CanvasExample {

	public static void main(String[] args) {
		CanvasIS is = new CanvasIS(new EventManagerWrapper());
		
		is.setVisible(true);
	}
	
	
//	public static RuntimeObject initialize(RuntimeObject self, RuntimeObject eventManager) {
//		EventManagerWrapper emw = (EventManagerWrapper) eventManager.getUserData();
//		CanvasIS is = new CanvasIS(emw);
//
//		self.setUserData(is);
//		is.setVisible(true);
//		
//		return self.getFactory().getMemory().voidINSTANCE;
//	}
}
