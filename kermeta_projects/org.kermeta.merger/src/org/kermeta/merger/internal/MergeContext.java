

/*$Id: MergeContext.java,v 1.3 2008-04-28 11:51:07 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	MergeContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

public class MergeContext extends LoadingContext {

	/**		Should we keep trace of elements ?		*/
	private boolean trace = false;
	
	public boolean isTrace() {
		return trace;
	}
	
	
	private Set<KermetaUnit> kermetaUnitsToMerge;
	
	private HashMap<Operation, Operation> operationsMapping = new HashMap<Operation, Operation> ();
	
	private HashMap<Parameter, Parameter> parametersMapping = new HashMap<Parameter, Parameter> ();
	
	private HashMap<Property, Property> propertiesMapping = new HashMap<Property, Property> ();
	
	private HashMap<TypeDefinition, TypeDefinition> typeDefinitionsMapping = new HashMap<TypeDefinition, TypeDefinition> (); 
	
	private HashMap<ClassDefinition, ClassDefinitionContext> classDefinitionsContext = new HashMap<ClassDefinition, ClassDefinitionContext> (); 
	
	private HashMap<Constraint, Constraint> constraintsMapping = new HashMap<Constraint, Constraint> ();
	
	private List<String> postUsingsToAdd = new ArrayList<String> ();
	
	private List<String> preUsingsToAdd = new ArrayList<String> ();
	
	public MergeContext(Set<KermetaUnit> kermetaUnitsToMerge, Tracer tracer) {
		super();
		this.kermetaUnitsToMerge = kermetaUnitsToMerge;
		if ( tracer == null )
			this.trace = false;
		else {
			this.trace = true;
			this.tracer = tracer;
		}
	}
	
	
	//////////////////////
	//		Getter		//
	//////////////////////
	Set<KermetaUnit> getKermetaUnitsToMerge() {
		return new LinkedHashSet<KermetaUnit> (kermetaUnitsToMerge);
	}
	
	public Operation getBaseOperation(Operation newOperation) {
		return operationsMapping.get(newOperation);
	}
	
	public Parameter getBaseParameter(Parameter newParameter) {
		return parametersMapping.get(newParameter);
	}
	
	public Property getBaseProperty(Property newProperty) {
		return propertiesMapping.get(newProperty);
	}
	
	public TypeDefinition getBaseTypeDefinition(TypeDefinition newTypeDefinition) {
		return typeDefinitionsMapping.get(newTypeDefinition);
	}
	
	public Constraint getBaseConstraint(Constraint newConstraint) {
		return constraintsMapping.get(newConstraint);
	}
	
	public List<String> getPreUsingsToAdd() {
		return preUsingsToAdd;
	}
	
	public List<String> getPostUsingsToAdd() {
		return postUsingsToAdd;
	}
	
	public List<Operation> getOperations(ClassDefinition cd, String operationName) {
		return classDefinitionsContext.get(cd).operationsMapping.get(operationName);
	}
	
	public List<Property> getProperties(ClassDefinition cd, String propertyName) {
		return classDefinitionsContext.get(cd).propertiesMapping.get(propertyName);
	}
	
	public List<ClassDefinition> getAspects(ClassDefinition cd) {
		if ( classDefinitionsContext.get(cd) == null )
			return new ArrayList<ClassDefinition>();
		return classDefinitionsContext.get(cd).aspects;
	}
	//////////////////////////////
	//		End of Getter		//
	//////////////////////////////
	
	
	//////////////////////
	//		Setter		//
	//////////////////////
	public void putBaseOperation(Operation newOperation, Operation baseOperation) {
		operationsMapping.put(newOperation, baseOperation);
	}

	public void putBaseParameter(Parameter newParameter, Parameter baseParameter) {
		parametersMapping.put(newParameter, baseParameter);
	}
	
	public void putBaseProperty(Property newProperty, Property baseProperty) {
		propertiesMapping.put(newProperty, baseProperty);
	}
	
	public void putBaseTypeDefinition(TypeDefinition newTypeDefinition, TypeDefinition baseTypeDefinition) {
		typeDefinitionsMapping.put(newTypeDefinition, baseTypeDefinition);
	}
	
	public void putBaseConstraint(Constraint newConstraint, Constraint baseConstraint) {
		constraintsMapping.put(newConstraint, baseConstraint);
	}
	
	public void addPreUsing(String s) {
		preUsingsToAdd.add(s);
	}
	
	public void addPostUsing(String s) {
		postUsingsToAdd.add(s);
	}
	
	public void addAspect(ClassDefinition cd, ClassDefinition aspect) {
		ClassDefinitionContext context = classDefinitionsContext.get(cd);
		if ( context == null ) {
			context = new ClassDefinitionContext();
			classDefinitionsContext.put(cd, context);
		}
		context.aspects.add(aspect);
	}
	//////////////////////////////
	//		End of Setter		//
	//////////////////////////////
	
	
	public void setOperationsMapping(ClassDefinition cd, Map<String, List<Operation>> mapping) {
		ClassDefinitionContext context = classDefinitionsContext.get(cd);
		if ( context == null ) {
			context = new ClassDefinitionContext();
			classDefinitionsContext.put(cd, context);
		}
		context.operationsMapping = mapping;
	}
	
	public void setPropertiesMapping(ClassDefinition cd, Map<String, List<Property>> mapping) {
		ClassDefinitionContext context = classDefinitionsContext.get(cd);
		if ( context == null ) {
			context = new ClassDefinitionContext();
			classDefinitionsContext.put(cd, context);
		}
		context.propertiesMapping = mapping;
	}
	
	//////////////////////////////
	//////////////////////////////
	//		Traceability		//
	//////////////////////////////
	//////////////////////////////
	private Tracer tracer;
	
	public Tracer getTracer() {
		return tracer;
	}
	
	public void tryToTrace(EObject newObject, EObject oldObject) {
		if ( tracer != null ) {
			// Try to trace
			KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(oldObject);
			if ( unit != null && unit.getTracer() != null ) {
				TextReference reference = unit.getTracer().getFirstTextReference(oldObject);
				addTrace(newObject, reference);
			}
		}
	}
	
	public void addTracesFrom(Tracer anOtherTracer) {
		tracer.getTraceModel().getReferences().addAll( anOtherTracer.getTraceModel().getReferences() );
		tracer.getTraceModel().getTraces().addAll( anOtherTracer.getTraceModel().getTraces() );
		tracer.getTraceModel().getMessages().addAll( anOtherTracer.getTraceModel().getMessages() );
	}
	
	private void addTrace(EObject o, TextReference reference) {
		if ( reference != null ) {
			tracer.addTextInputTrace(reference.getFileURI(),
									reference.getLineBeginAt(), 
									reference.getCharBeginAt(), 
									reference.getCharEndAt(), 
									o, 
									"");
		}
	}
	//////////////////////////////////
	//////////////////////////////////
	//		End of Traceability		//
	//////////////////////////////////
	//////////////////////////////////	
	
}


