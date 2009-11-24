

/*$Id: EventDispatcher.java,v 1.1 2008-05-28 09:26:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	EventDispatcher.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package org.kermeta.kpm;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.kpm.internal.RuleProcessor;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class EventDispatcher {
	
	/**
	 * 
	 * @param unit
	 * @param eventName
	 * @param arguments
	 * @param monitor
	 */
	static public void sendEvent(Unit unit, String eventName, Map<String, Object> arguments, IProgressMonitor monitor) {
		assert(unit != null);
		KPM kpm = (KPM) unit.eContainer().eContainer();
		Event event = kpm.getEvent(eventName);
		if ( event != null )
			sendEvent(unit, event, arguments, monitor);
	}
	
	/**
	 * 
	 * @param unit
	 * @param event
	 * @param arguments
	 * @param monitor
	 */
	static public void sendEvent(Unit unit, Event event, Map<String, Object> arguments, IProgressMonitor monitor) {
		assert(event != null);
		// If monitor is null, simulate one.
		if ( monitor == null )
			monitor = new NullProgressMonitor();

		for ( Rule currentRule : unit.getRules() ) {
			Event currentEvent = currentRule.getEvent();
			if ( currentEvent.equals(event) ) {
				RuleProcessor.process(unit, currentRule, arguments, monitor);
			}
		}
		
	}
	
}


