

/*$Id: MergeContext.java,v 1.2 2007-10-02 15:20:32 ftanguy Exp $
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

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class MergeContext extends LoadingContext {

	private Set<KermetaUnit> kermetaUnitsToMerge;
	
	private HashMap<Operation, Operation> operationsMapping = new HashMap<Operation, Operation> ();
	
	private HashMap<Parameter, Parameter> parametersMapping = new HashMap<Parameter, Parameter> ();
	
	private HashMap<Property, Property> propertiesMapping = new HashMap<Property, Property> ();
	
	private HashMap<TypeDefinition, TypeDefinition> typeDefinitionsMapping = new HashMap<TypeDefinition, TypeDefinition> (); 
	
	private HashMap<ClassDefinition, ClassDefinitionContext> classDefinitionsContext = new HashMap<ClassDefinition, ClassDefinitionContext> (); 
	
	private HashMap<Constraint, Constraint> constraintsMapping = new HashMap<Constraint, Constraint> ();
	
	private List<String> postUsingsToAdd = new ArrayList<String> ();
	
	private List<String> preUsingsToAdd = new ArrayList<String> ();
	
	public MergeContext(Set<KermetaUnit> kermetaUnitsToMerge) {
		super();
		this.kermetaUnitsToMerge = kermetaUnitsToMerge;
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
	
}


