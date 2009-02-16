

/*$Id: Pass2.java,v 1.9 2009-02-16 16:45:51 cfaucher Exp $
* Project : org.kermeta.merger
* File : 	Pass2.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * 
 * Creating the second part of the structure:
 * 		- the Operations
 * 		- the Parameters
 * 		- the constraints
 * 		- the Attributes/Properties
 * 
 * @author paco
 *
 */
public class Pass2 extends MergePass {

	private List<ModelType> modelTypes = new ArrayList<ModelType>();
	
	public Pass2(KermetaUnit kermetaUnit, MergeContext context) {
		super(kermetaUnit, context);
	}

	@Override
	public void process() {
		for ( TypeDefinition t : KermetaUnitHelper.getTypeDefinitions(kermetaUnit) ) {
			if ( t instanceof ClassDefinition ) {
				setProperties((ClassDefinition) t);
				setOperations( (ClassDefinition) t);
			} else if ( t instanceof ModelType )
				modelTypes.add( (ModelType) t );
		}
		
		for ( ModelType newDefinition : modelTypes ) {
			ModelType definition = (ModelType) context.getBaseTypeDefinition( newDefinition );
			for ( TypeDefinition t : definition.getIncludedTypeDefinition() ) {
				String qualifiedName = NamedElementHelper.getQualifiedName(t);
				TypeDefinition definitionToInclude = kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName);
				newDefinition.getIncludedTypeDefinition().add( definitionToInclude );
			}
		}
	}
	
	private void setProperties(ClassDefinition t) {
		List<Property> properties = getProperties(t);
		
		for ( Property p : properties ) {
			Property newProperty = StructureFactory.eINSTANCE.createProperty();
			newProperty.setName( p .getName() );
			newProperty.setLower( p.getLower() );
			newProperty.setUpper( p.getUpper() );
			newProperty.setIsDerived( p.isIsDerived() );
			newProperty.setIsReadOnly( p.isIsReadOnly() );
			newProperty.setIsComposite( p.isIsComposite() );
			newProperty.setDefault( p.getDefault() );
			newProperty.setIsID( p.isIsID() );
			newProperty.setIsOrdered( p.isIsOrdered() );
			newProperty.setIsUnique( p.isIsUnique() );
			t.getOwnedAttribute().add( newProperty );
			context.putBaseProperty(newProperty, p);
			// Try to trace
			context.tryToTrace(newProperty, p);
			
			for ( Property prop : context.getProperties(t, p.getName()) ) {
				// Creating the tags
				createTracedTags(newProperty, prop);
			}
			
		}
		
	}
	
	private List<Property> getProperties(ClassDefinition t) {
		/*
		 * 
		 * Getting all properties.
		 * 
		 */
		Set<Property> properties = new HashSet<Property>();
		String qualifiedName = NamedElementHelper.getQualifiedName(t);
		for ( KermetaUnit unit : context.getKermetaUnitsToMerge() ) {
			ClassDefinition cd = (ClassDefinition) unit.getTypeDefinitionByQualifiedName(qualifiedName);
			if ( cd != null )
				properties.addAll( cd.getOwnedAttribute() );
		}
		
		/*
		 * 
		 * Ordering them by name.
		 * 
		 */
		HashMap<String, List<Property>> mapping = new HashMap<String, List<Property>> ();
		for ( Property p : properties ) {
			List<Property> list = mapping.get(p.getName());
			if ( list == null )
				list = new ArrayList<Property>();
			list.add(p);
			mapping.put(p.getName(), list);
		}
		context.setPropertiesMapping(t, mapping);
		
		/*
		 * 
		 * When several properties exist for the same name, let's select only one.
		 * When aspectizing, you can sometimes find several properties with the same type.
		 * FIXME Shall we report an error indicating that two properties are differently typed ?
		 * 
		 */
		List<Property> result = new ArrayList<Property> ();
		for ( String s : mapping.keySet() ) {
			result.add( mapping.get(s).get(0) );
		}
		return result;
	}
	
	private void setOperations(ClassDefinition t) {
		List<Operation> operations = getOperations(t);
		for ( Operation o : operations ) {
			createOperation(t, o);
		}		
	}
	
	private List<Operation> getOperations(ClassDefinition t) {
		/*
		 * 
		 * Getting all operations.
		 * 
		 */
		Set<Operation> operations = new HashSet<Operation>();
		String qualifiedName = NamedElementHelper.getQualifiedName(t);
		for ( KermetaUnit unit : context.getKermetaUnitsToMerge() ) {
			ClassDefinition cd = (ClassDefinition) unit.getTypeDefinitionByQualifiedName(qualifiedName);
			if ( cd != null )
				operations.addAll( cd.getOwnedOperation() );
		}
		
		/*
		 * 
		 * Ordering them by name.
		 * 
		 */
		HashMap<String, List<Operation>> mapping = new HashMap<String, List<Operation>> ();
		for ( Operation o : operations ) {
			List<Operation> list = mapping.get(o.getName());
			if ( list == null )
				list = new ArrayList<Operation>();
			list.add(o);
			mapping.put(o.getName(), list);
		}
		context.setOperationsMapping(t, mapping);
		
		/*
		 * 
		 * When several operations exist for the same name, let's select only one.
		 * 
		 */
		List<Operation> result = new ArrayList<Operation> ();
		for ( String s : mapping.keySet() ) {
			result.add( getOperation(mapping.get(s)) );
		}
		return result;
	}
	
	private Operation getOperation(List<Operation> operations) {
		Operation result = null;
		for ( Operation currentOperation : operations ) {
			
			if ( result == null )
				result = currentOperation;
			else {
				
				if ( result.isIsAbstract() && ! currentOperation.isIsAbstract() )
					result = currentOperation;
				/*else if ( OperationHelper.isOverloadable(result) && ! currentOperation.isIsAbstract() )
					result = currentOperation;*/
				
			}
			
		}
		return result;
	}
	
	
	private void createOperation(ClassDefinition newDefinition, Operation o) {		
		Operation newOperation = StructureFactory.eINSTANCE.createOperation();
		setParameters(newOperation, o);
		newOperation.setName( o.getName() );		
		newOperation.setUpper(o.getUpper());
		newOperation.setLower(o.getLower());
		newOperation.setIsAbstract(o.isIsAbstract());
		newOperation.setIsOrdered(o.isIsOrdered());
		newOperation.setIsUnique(o.isIsUnique());
		newDefinition.getOwnedOperation().add( newOperation );
		//createTags(newOperation, o);
		context.putBaseOperation(newOperation, o);
		// Try to trace
		context.tryToTrace(newOperation, o);

		
		/*
		 * 
		 * Creating the type variables.
		 * 
		 */
		for ( TypeVariable tv : o.getTypeParameter() ) {
			if ( tv instanceof ObjectTypeVariable ) {
				ObjectTypeVariable otv = (ObjectTypeVariable) tv;
				ObjectTypeVariable newOTV = StructureFactory.eINSTANCE.createObjectTypeVariable();
				newOTV.setName( otv.getName() );
				newOperation.getContainedType().add( newOTV );
				newOperation.getTypeParameter().add( newOTV );
				// Try to trace
				context.tryToTrace(newOTV, tv);
			}
		}
		
		for ( Operation op : context.getOperations(newDefinition, o.getName()) ) {
			
			// Creating the tags
			createTracedTags(newOperation, op);
			
			/*
			 * 
			 * Creating the pre constraints.
			 * 
			 */
			for ( Constraint constraint : op.getPre() ) {
				Constraint newConstraint = StructureFactory.eINSTANCE.createConstraint();
				newConstraint.setName( constraint.getName() );
				newConstraint.setStereotype( constraint.getStereotype() );
				newOperation.getPre().add( newConstraint );
				context.putBaseConstraint(newConstraint, constraint);
				// Try to trace
				context.tryToTrace(newConstraint, constraint);
			}
			
			/*
			 * 
			 * Creating the post constraints.
			 * 
			 */
			for ( Constraint constraint : op.getPost() ) {
				Constraint newConstraint = StructureFactory.eINSTANCE.createConstraint();
				newConstraint.setName( constraint.getName() );
				newConstraint.setStereotype( constraint.getStereotype() );
				newOperation.getPost().add( newConstraint );
				context.putBaseConstraint(newConstraint, constraint);
				// Try to trace
				context.tryToTrace(newConstraint, constraint);
			}
		}
	}
	
	private void setParameters(Operation newOperation, Operation o) {
		for ( Parameter p : o.getOwnedParameter() ) {
			Parameter newParameter = StructureFactory.eINSTANCE.createParameter();
			newParameter.setName(p.getName());
			newParameter.setIsOrdered(p.isIsOrdered());
			newParameter.setIsUnique(p.isIsUnique());
			newParameter.setLower(p.getLower());
			newParameter.setUpper(p.getUpper());
			newOperation.getOwnedParameter().add(newParameter);
			context.putBaseParameter(newParameter, p);
			// Try to trace
			context.tryToTrace(newParameter, p);
		}
	}
	
}


