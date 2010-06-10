package org.kermeta.ki.malai.dispatcherWrapper;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * A DispatcherWrapper corresponds to a Kermeta Dispatcher.
 * The only use of this class is to be able to put in wait
 * a Disptacher from kermeta by using the method waitForEvent
 * of class DispatcherWrapper.
 * @author Arnaud Blouin
 *
 */
public abstract class DispatcherWrapperExtern {
	/**
	 * Initialises the  DispatcherWrapper using the Kermeta Dispatcher.
	 * It puts the DispatcherWrapper instance into the Kermeta Dispatcher
	 * using setUserData.
	 * @param self The Kermeta Dispatcher.
	 * @return The Kermeta Dispatcher.
	 */
	public static RuntimeObject initialise(final RuntimeObject self) {
		Source2TargetMap.MAP.add(self, new DispatcherWrapper());
		return self;
	}
	
	
	/**
	 * Puts in wait the DispatcherWrapper and therefore the Kermeta
	 * Dispatcher.
	 * @param self The Kermeta Dispatcher.
	 * @return The Kermeta Dispatcher.
	 */
	public static RuntimeObject waitForEvent(final RuntimeObject self) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(self);
		
		try {
			synchronized(obj) { obj.wait(); }
		}catch(InterruptedException e) { e.printStackTrace(); }
		
		return self;
	}
}
