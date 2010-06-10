package org.kermeta.ki.malai.dispatcherWrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * A DispatcherWrapper corresponds to a Kermeta Dispatcher.
 * The only use of this class is to be able to put in wait
 * a Disptacher from kermeta by using the method waitForEvent
 * of class DispatcherWrapper.
 * @author Arnaud Blouin
 *
 */
public class DispatcherWrapper {
	/**
	 * Initialises the  DispatcherWrapper using the Kermeta Dispatcher.
	 * It puts the DispatcherWrapper instance into the Kermeta Dispatcher
	 * using setUserData.
	 * @param self The Kermeta Dispatcher.
	 * @return The Kermeta Dispatcher.
	 */
	public static RuntimeObject initialise(RuntimeObject self) {
		self.setUserData(new DispatcherWrapper());
		
		return self;
	}
	
	
	/**
	 * Puts in wait the DispatcherWrapper and therefore the Kermeta
	 * Dispatcher.
	 * @param self The Kermeta Dispatcher.
	 * @return The Kermeta Dispatcher.
	 */
	public static RuntimeObject waitForEvent(RuntimeObject self) {
		try {
			Object obj = self.getUserData();

			synchronized(obj) { obj.wait(); }
		}catch(InterruptedException e) { e.printStackTrace(); }
		
		return self;
	}
}
