package org.kermeta.ki.malai.examples.canvas;

import org.kermeta.ki.malai.examples.canvas.ui.CanvasIS;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class CanvasExample {

	public static void main(String[] args) {
		CanvasIS is = new CanvasIS();
		
		is.setVisible(true);
	}
	
	
	public static RuntimeObject initialize(RuntimeObject self) {
		CanvasIS is = new CanvasIS();

		self.setUserData(is);
		is.setVisible(true);
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
