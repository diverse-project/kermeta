

/*$Id: EventMonitor.java,v 1.1 2007-09-13 09:04:01 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	EventMonitor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 sept. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class EventMonitor {

	static private EventMonitor instance = new EventMonitor();
	
	private HashMap<String, List<MonitorEventEntry>> entries = new HashMap<String, List<MonitorEventEntry>> ();
	
	class MonitorEventEntry {
		public Event event;
		public IProgressMonitor monitor;
		
		public MonitorEventEntry(Event event, IProgressMonitor monitor) {
			this.event = event;
			this.monitor = monitor;
		}
	}
	
	
	synchronized static public void monitor(Unit unit, Event event, IProgressMonitor monitor) {
		
		List<MonitorEventEntry> l = instance.entries.get( unit.getValue() );
		
		if ( l != null ) {
			for ( MonitorEventEntry entry : l )
				if ( entry.event.equals(event) )
					entry.monitor.setCanceled( true );
		} else {
			l = new ArrayList<MonitorEventEntry> ();
			instance.entries.put(unit.getValue(), l);
		}
		
		MonitorEventEntry entry = instance.new MonitorEventEntry(event, monitor);
		l.add( entry );
		
	}
	
	synchronized static public void stopMonitor(Unit unit, Event event) {
		List<MonitorEventEntry> l = instance.entries.get( unit.getValue() );
		for ( MonitorEventEntry entry : new ArrayList<MonitorEventEntry>(l) ) 
			if ( entry.event == event )
				l.remove(entry);
	}
	
}


