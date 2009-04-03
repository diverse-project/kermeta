package fr.irisa.triskell.kermeta.runtime.traceability;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class TraceProvider {

	private static ArrayList<TraceListener> listeners = new ArrayList<TraceListener>();
	
	public static void addTraceListener(TraceListener listener) {
		listeners.add(listener);
	}
	
	public static RuntimeObject isListenerAvailable(RuntimeObject self, RuntimeObject id) {
		String listid = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(id);
		for(TraceListener tl : listeners) {
			if (tl.getID().equalsIgnoreCase(listid))
				return self.getFactory().getMemory().trueINSTANCE;
		}
		return self.getFactory().getMemory().falseINSTANCE;
	}
	
	public static RuntimeObject createTrace(RuntimeObject self, RuntimeObject src, RuntimeObject tgt, RuntimeObject msg) {
		
		// Get the set of traces of the current adapter
		ArrayList<TraceLink> links = (ArrayList<TraceLink>)self.getUserData();
		if(links == null) { 
			links = new ArrayList<TraceLink>();
			self.setUserData(links);
		}
		
		// Create and temporary store the trace link
		TraceLink trace = new TraceLink(src, tgt);
		links.add(trace);
		
		if (self.getFactory().getMemory().voidINSTANCE != msg)
			trace.comment = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(msg);
		
		InterpreterContext ctx = self.getFactory().getMemory().getInterpreter().getBasicInterpreter().getInterpreterContext();
		CallFrame cf = ctx.getFrameStack().elementAt(ctx.getFrameStack().size() - 2);
		trace.opName = cf.getOperation().getName();
		trace.className = cf.getOperation().getOwningClass().getName();
		// TODO: Populate the trace here
		
		return self.getFactory().getMemory().trueINSTANCE;
	}
	
	public static RuntimeObject saveTrace(RuntimeObject self) {
		
		ArrayList<TraceLink> links = (ArrayList<TraceLink>)self.getUserData();
		
		if (links != null) {
			for(TraceLink tl : links) {
				EObject src = tl.getSrcEMFObject();
				EObject tgt = tl.getTgtEMFObject();
				
				for(TraceListener l : listeners) {
					l.createTraceLink(src, tgt, tl.className, tl.opName, tl.location, tl.comment);
				}
			}
		}
		return self.getFactory().getMemory().voidINSTANCE;
	}
}

class TraceLink {
	
	RuntimeObject src;
	RuntimeObject tgt;
	String comment;
	String className;
	String opName;
	String location;
	
	TraceLink(RuntimeObject src, RuntimeObject tgt) {
		this.src = src;
		this.tgt = tgt;
	}
	
	EObject getSrcEMFObject() {
		EObject result = null;
		if (src.getEmfObject() instanceof EObject) result = (EObject)src.getEmfObject();
		if (result == null) result = src.getR2eEmfObject();
		return result;
	}
	
	EObject getTgtEMFObject() {
		EObject result = null;
		result = tgt.getR2eEmfObject();
		if (result == null && tgt.getEmfObject() instanceof EObject) result = (EObject)tgt.getEmfObject();
		return result;
	}
	
}