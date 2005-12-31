/* $Id: BooleanLock.java,v 1.1 2005-12-31 09:58:03 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : BooleanLock.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 d�c. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.utils;
/**
 * Class that implements a simple lock
 *
 */
public class BooleanLock extends Object {
	private boolean value;
	
	public BooleanLock(boolean initialValue) {
		value = initialValue;
	}
	
	public BooleanLock() {
		this(false);
	}
	
	public synchronized void setValue(boolean newValue) {
		if (newValue != value) {
			value = newValue;
			notifyAll();
		}
	}
	
	public synchronized boolean waitToSetTrue(long msTimeout)
	throws InterruptedException {
		
		boolean success = waitUntilFalse(msTimeout);
		if (success) {
			setValue(true);
		}
		
		return success;
	}
	
	public synchronized boolean waitToSetFalse(long msTimeout)
	throws InterruptedException {
		
		boolean success = waitUntilTrue(msTimeout);
		if (success) {
			setValue(false);
		}
		
		return success;
	}
	
	public synchronized boolean isTrue() {
		return value;
	}
	
	public synchronized boolean isFalse() {
		return !value;
	}
	
	public synchronized boolean waitUntilTrue(long msTimeout)
	throws InterruptedException {
		
		return waitUntilStateIs(true, msTimeout);
	}
	
	public synchronized boolean waitUntilFalse(long msTimeout)
	throws InterruptedException {
		
		return waitUntilStateIs(false, msTimeout);
	}
	
	public synchronized boolean waitUntilStateIs(boolean state, long msTimeout)
	throws InterruptedException {
		
		if (msTimeout == 0L) {
			while (value != state) {
				wait(); // wait indefinitely until notified
			}
			
			// condition has finally been met
			return true;
		}
		
		// only wait for the specified amount of time
		long endTime = System.currentTimeMillis() + msTimeout;
		long msRemaining = msTimeout;
		
		while ((value != state) && (msRemaining > 0L)) {
			wait(msRemaining);
			msRemaining = endTime - System.currentTimeMillis();
		}
		
		// May have timed out, or may have met value,
		// calculate return value.
		return (value == state);
	}
}
