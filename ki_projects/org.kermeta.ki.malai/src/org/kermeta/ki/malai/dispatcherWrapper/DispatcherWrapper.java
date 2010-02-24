package org.kermeta.ki.malai.dispatcherWrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class DispatcherWrapper {

	
	public static RuntimeObject initialise(RuntimeObject self) {
		self.setUserData(new DispatcherWrapper());
		
		return self;
	}
	
	
	
	public static RuntimeObject waitForEvent(RuntimeObject self) {
		try {
			Object obj = self.getUserData();

			synchronized(obj) {
				obj.wait();
			}
		}catch(InterruptedException e) { e.printStackTrace(); }
		
		return self;
	}
}
