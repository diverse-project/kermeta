/* $Id: Tracer.java,v 1.1 2005-07-27 14:04:00 dvojtise Exp $
 * Project    : fr.irisa.triskell.traceability.model
 * File       : Tracer.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 26 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *         
 */
package fr.irisa.triskell.traceability.helper;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.traceability.ExternalReference;
import fr.irisa.triskell.traceability.Model;
import fr.irisa.triskell.traceability.Reference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.Trace;
import fr.irisa.triskell.traceability.TraceabilityFactory;

/**
 * This class helps to use the traceability metamodel
 */
public class Tracer {
	
	public Resource traceResource = null;	

	/**
	 * <code>tracesActivated</code> allows to disable tracing commands
	 */
	public boolean tracesActivated = true;
	
	protected Model modelTrace = null;
	
	/**
	 * Constructor
	 */
	public Tracer(Resource newTraceResource) {
		traceResource = newTraceResource;

		// try to retreive the model in this ressource 
		Iterator it = traceResource.getContents().iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			if(o instanceof Model)
			{
				modelTrace = (Model)o;
			}
		}
	}	
	public Tracer() {
		tracesActivated= false;
	}
	
	/**
	 * Initialize resource.
	 * Notice that you don't have to save the resulting resource even if you have indicated a file here
	 * @param tracefileURI
	 */
	public static Resource getResource(URI tracefileURI)
	{
		//	 create Trace structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("traceability",new XMIResourceFactoryImpl());
		ResourceSet trace_resource_set = new ResourceSetImpl();
		return trace_resource_set.createResource(tracefileURI);
	}
	
	public void newModelTrace()
	{
		modelTrace = TraceabilityFactory.eINSTANCE.createModel();		
		traceResource.getContents().add(modelTrace);
	}
	
	public void addMappingTrace(EObject source, EObject target, String message)
	{
		if (!tracesActivated) return;
		if(modelTrace == null)
		{
			newModelTrace();
		}
		
		// get or create reference objects for each of the source and target		
		ExternalReference sourceExtRef = getExternalReference(source);
		if (sourceExtRef == null)
		{
			sourceExtRef = TraceabilityFactory.eINSTANCE.createExternalReference();
			sourceExtRef.setRefObject(source);
			traceResource.getContents().add(sourceExtRef);
		}
		addTargetTrace(target, message, sourceExtRef);
	}
	
	public void addTextInputTrace(String fileURI,
			int line, int charBeginAt,
			int charEndAt,
			EObject target, String message)
	{
		if (!tracesActivated) return;
		if (modelTrace ==  null)
		{
			newModelTrace();
		}
		TextReference sourceTextRef = TraceabilityFactory.eINSTANCE.createTextReference();
		//		 create reference objects for each of the source and target
		sourceTextRef.setFileURI(fileURI);
		sourceTextRef.setLine(line);
		sourceTextRef.setCharBeginAt(charBeginAt);
		sourceTextRef.setCharBeginAt(charEndAt);
		traceResource.getContents().add(sourceTextRef);		
		addTargetTrace(target, message, sourceTextRef);
	}
	
	
	/**
	 * @param target
	 * @param message
	 * @param sourceExtRef
	 */
	private void addTargetTrace(EObject target, String message,Reference sourceRef) {
		
		// get or create the reference
		ExternalReference targetExtRef = getExternalReference(target);
		if (targetExtRef == null)
		{
			targetExtRef = TraceabilityFactory.eINSTANCE.createExternalReference();
			targetExtRef.setRefObject(target);
			traceResource.getContents().add(targetExtRef);
		}
		
		// create message
		fr.irisa.triskell.traceability.Message tmessage = TraceabilityFactory.eINSTANCE.createMessage();
		tmessage.setValue(message);
		tmessage.setType("Mapping");
		tmessage.setLanguage("english");
		traceResource.getContents().add(tmessage);
		
		// create trace
		Trace trace = TraceabilityFactory.eINSTANCE.createTrace();
		trace.getSourceReferences().add(sourceRef);
		trace.getTargetReferences().add(targetExtRef);
		trace.getDescription().add(tmessage);
		traceResource.getContents().add(trace);
		
		modelTrace.getTraces().add(trace);
		modelTrace.getMessages().add(tmessage);
		modelTrace.getReferences().add(sourceRef);
		modelTrace.getReferences().add(targetExtRef);
	}
	
	public ExternalReference getExternalReference(EObject referedObject)
	{
		if (modelTrace ==  null)
		{ return null;
		}
		Iterator it = modelTrace.getReferences().iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			if(o instanceof ExternalReference)
			{
				ExternalReference eref = (ExternalReference)o;
				if(eref.getRefObject() == referedObject)
					return eref;
			}
		}
		
		return null;
	}
	
	/**
	 * removes all intermediates traces and unused input references
	 * don't work ...!!!
	 */
	public void optimizeTraces()
	{
		removeIntermediateTraces();
		//removeUnusedInputTracesAndRef();
	}
	
	/**
	 * removes all intermediates traces
	 * The last trace is kept
	 * don't work ...!!!
	 */
	public void removeIntermediateTraces()
	{
		if (modelTrace ==  null) return;
		
		// construct a list of Reference that have both input and output trace
		EList refToRemove = new BasicEList();
		Iterator itRef1 = modelTrace.getReferences().iterator();
		while (itRef1.hasNext())
		{
			Reference ref1 = (Reference)itRef1.next();
			if((ref1.getSourceTrace().size() != 0 ) && (ref1.getTargetTrace().size() != 0))
			{
				unlinkIntermediateReference(ref1);
				refToRemove.add(ref1);
			}
		}
		Iterator it = refToRemove.iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			modelTrace.getReferences().remove(o);
			traceResource.getContents().remove(o);
		}
	}
	
	/** don't work ...!!! */
	private void unlinkIntermediateReference(Reference ref)
	{
		EList sourceTraces = new BasicEList(ref.getSourceTrace());
		EList targetTraces = new BasicEList(ref.getTargetTrace());
		
		Iterator it = ref.getSourceTrace().iterator();
		while(it.hasNext())
		{
			Trace t = (Trace)it.next();
			//t.getTargetReferences().remove(ref);
			
		}
		it = ref.getTargetTrace().iterator();
		while(it.hasNext())
		{
			Trace t = (Trace)it.next();
			//t.getSourceReferences().remove(ref);
		}
		ref.getTargetTrace().clear();
		ref.getSourceTrace().clear();
		
		// add sourceTrace.target to the sources of TargetTraces
		it = targetTraces.iterator();
		while(it.hasNext())
		{
			Trace tt = (Trace)it.next();
			Iterator it2 = sourceTraces.iterator();
			while (it2.hasNext())
			{
				Trace st = (Trace)it2.next();
				tt.getSourceReferences().addAll(st.getTargetReferences());
			}						
		}
	}
	
	
	/**
	 * removes Traces that don't have an output in 
	 */
	public void removeTracesWithoutOutputIn()
	{
		if (modelTrace ==  null) return;
	}
	
}
