/* $Id: Tracer.java,v 1.6 2007-07-31 12:34:32 dtouzet Exp $
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TraceModel;
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
	
	protected TraceModel modelTrace = null;
	
	/**
	 * Constructor
	 * provides a Resource : allows to save the trace at the end 
	 */
	public Tracer(Resource newTraceResource) {
		traceResource = newTraceResource;

		// try to retreive the model in this ressource 
		Iterator<EObject> it = traceResource.getContents().iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			if(o instanceof TraceModel)
			{
				modelTrace = (TraceModel)o;
			}
		}
	}	
	
	/**
	 * Constructor
	 * this is a memory tracer, by default nothing is done to serialize the generated traces
	 * 
	 *
	 */
	public Tracer() {
		tracesActivated= true;
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
		modelTrace = TraceabilityFactory.eINSTANCE.createTraceModel();
		if(traceResource != null) traceResource.getContents().add(modelTrace);
	}
	
	public void addMappingTrace(EObject source, EObject target, String message)
	{
		if (!tracesActivated) return;
		if(modelTrace == null)
		{
			newModelTrace();
		}
		
		// get or create reference objects for each of the source and target		
		ModelReference sourceExtRef = getModelReference(source);
		if (sourceExtRef == null)
		{
			sourceExtRef = TraceabilityFactory.eINSTANCE.createModelReference();
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
		sourceTextRef.setLineBeginAt(line);
		sourceTextRef.setLineEndAt(line);
		sourceTextRef.setCharBeginAt(charBeginAt);
		sourceTextRef.setCharEndAt(charEndAt);
		//traceResource.getContents().add(sourceTextRef);		
		addTargetTrace(target, message, sourceTextRef);
	}
	
	/**
	 * Get the text input trace for the given Object
	 * @note : not tested yet!
	 * @return an EList of TextReference
	 */
	protected ArrayList<Reference> getRecursiveSourceTextReferences(Reference eref, ArrayList<Reference> result)
	{	
		// get the list sourceTrace
		EList<Trace> sourceTraces = eref.getSourceTraces();
		Iterator<Trace> sourceIt = sourceTraces.iterator();
		// get, for each sourceTrace, the list of sourceReferences
		while (sourceIt.hasNext())
		{
			Trace t = sourceIt.next();
			EList<Reference> refs = t.getSourceReferences();
			Iterator<Reference> refsIt = refs.iterator();
			while (refsIt.hasNext())
			{
				// for each sourceReference, add it if it is a TextReference
				Reference r = refsIt.next();
				if (r instanceof TextReference)
				{
					result.add(r);
				}
				// Else
				// We assume that we have ExternalReference or TextReference (and no direct "Reference" type)
				if (r.getSourceTraces().size()>0)
				{
					getRecursiveSourceTextReferences(r, result);
				}
			}
		}
		return result;
	}
	
	/**
	 * Calls recursive getRecursiveSourceTextReferences
	 * @note : not tested yet!!!
	 * @return the list of source text references for the given target.
	 */
	public ArrayList<Reference> getAllSourceTextReferences(EObject target)
	{
		ArrayList<Reference> result = new ArrayList<Reference>();
		ModelReference eref = getModelReference(target);
		result.addAll(getRecursiveSourceTextReferences(eref, result));
		return result;
	}
	
	/** 
	 *  Get the first TextReference linked to the given object 
	 *  Useful when, in a debug mode, we want to find the text informations
	 *  of the EObject representation of an element in the text that is being debugged.
	 * */
	public TextReference getFirstTextReference(EObject target)
	{
		ModelReference eref = getModelReference(target);
		return ModelReferenceHelper.getFirstTextReference(eref);
	}
	
	/**
	 * @param target
	 * @param message
	 * @param sourceExtRef
	 */
	private void addTargetTrace(EObject target, String message,Reference sourceRef) {
		
		// get or create the reference
		ModelReference targetExtRef = getModelReference(target);
		if (targetExtRef == null)
		{
			targetExtRef = TraceabilityFactory.eINSTANCE.createModelReference();
			targetExtRef.setRefObject(target);
			//traceResource.getContents().add(targetExtRef);
		}
		
		// create message
		fr.irisa.triskell.traceability.Message tmessage = TraceabilityFactory.eINSTANCE.createMessage();
		tmessage.setValue(message);
		tmessage.setType("Mapping");
		tmessage.setLanguage("english");
		//traceResource.getContents().add(tmessage);
		
		// create trace
		Trace trace = TraceabilityFactory.eINSTANCE.createTrace();
		trace.getSourceReferences().add(sourceRef);
		trace.getTargetReferences().add(targetExtRef);
		trace.getDescription().add(tmessage);
		//traceResource.getContents().add(trace);
		
		modelTrace.getTraces().add(trace);
		modelTrace.getMessages().add(tmessage);
		modelTrace.getReferences().add(sourceRef);
		modelTrace.getReferences().add(targetExtRef);
	}
	
	public ModelReference getModelReference(EObject referedObject)
	{
		if (modelTrace ==  null)
		{
			return null;
		}
		Iterator<Reference> it = modelTrace.getReferences().iterator();
		while (it.hasNext())
		{
			Object o = it.next();
			if(o instanceof ModelReference)
			{
				ModelReference eref = (ModelReference)o;

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
		EList<Reference> refToRemove = new BasicEList<Reference>();
		Iterator<Reference> itRef1 = modelTrace.getReferences().iterator();
		while (itRef1.hasNext())
		{
			Reference ref1 = itRef1.next();
			if((ref1.getSourceTraces().size() != 0 ) && (ref1.getTargetTraces().size() != 0))
			{
				unlinkIntermediateReference(ref1);
				refToRemove.add(ref1);
			}
		}
		Iterator<Reference> it = refToRemove.iterator();
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
		EList<Trace> sourceTraces = new BasicEList<Trace>(ref.getSourceTraces());
		EList<Trace> targetTraces = new BasicEList<Trace>(ref.getTargetTraces());
		
		Iterator<Trace> it = ref.getSourceTraces().iterator();
		while(it.hasNext())
		{
			/*Trace t =*/ it.next();
			//t.getTargetReferences().remove(ref);
			
		}
		it = ref.getTargetTraces().iterator();
		while(it.hasNext())
		{
			/*Trace t =*/ it.next();
			//t.getSourceReferences().remove(ref);
		}
		ref.getTargetTraces().clear();
		ref.getSourceTraces().clear();
		
		// add sourceTrace.target to the sources of TargetTraces
		it = targetTraces.iterator();
		while(it.hasNext())
		{
			Trace tt = (Trace)it.next();
			Iterator<Trace> it2 = sourceTraces.iterator();
			while (it2.hasNext())
			{
				Trace st = it2.next();
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
	
	private Set<TextReference> getTextReferences() {
		
		Set <TextReference> textReferences = new HashSet <TextReference> ();
		Iterator <Reference> iterator = modelTrace.getReferences().iterator();
		while ( iterator.hasNext() ) {
			Reference currentReference = iterator.next();
			if ( currentReference instanceof TextReference )
				textReferences.add( (TextReference) currentReference );
		}
		return textReferences;
	}
	
	public Set <ModelReference> getModelReferences(int offset, int length, String uri) {
		
		Set <TextReference> textReferences = getTextReferences();
		
		TextReference result = null;
		
		for ( TextReference reference : textReferences ) {
			
			if ( result == null ) {
				
				if ( reference.getFileURI().equals(uri) 
				&& ( reference.getCharBeginAt() <= offset ) 
				&& ( reference.getCharEndAt() >= offset+length ) )
				
				result = reference;
					
			} else {
			
				if ( reference.getFileURI().equals(uri) 
					&& ( reference.getCharBeginAt() < offset ) && ( reference.getCharBeginAt() >= result.getCharBeginAt() ) 
					&& ( reference.getCharEndAt() > offset+length ) && ( reference.getCharEndAt() <= result.getCharEndAt() ) )
				
				result = reference;
			
			}
		}

		if ( result != null ) {
			Set <ModelReference> modelReferences = new HashSet <ModelReference> ();
			Iterator <Trace> iterator = result.getTargetTraces().iterator();
			while ( iterator.hasNext() ) {
				Trace currentTrace = iterator.next();
				if ( currentTrace.getTargetReferences().get(0) instanceof ModelReference )
					modelReferences.add( (ModelReference) currentTrace.getTargetReferences().get(0) );
			}
		
			return modelReferences;
		}
		
		return new HashSet <ModelReference> ();
	}
	
}
