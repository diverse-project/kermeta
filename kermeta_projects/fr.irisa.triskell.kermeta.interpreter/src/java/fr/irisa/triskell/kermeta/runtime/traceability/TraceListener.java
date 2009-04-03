package fr.irisa.triskell.kermeta.runtime.traceability;

import org.eclipse.emf.ecore.EObject;

public interface TraceListener {
	
	/**
	 * @return The ID of the trace builder
	 */
	public String getID();
	
	public void createTraceLink(EObject src, EObject tgt, String cName, String oName, String location, String message); 
}
