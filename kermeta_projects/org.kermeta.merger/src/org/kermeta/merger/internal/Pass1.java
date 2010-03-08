

/*$Id: Pass1.java,v 1.8 2008-12-22 09:35:21 cfaucher Exp $
* Project : org.kermeta.merger
* File : 	Pass1.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.HashSet;
import java.util.Set;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * 
 * Creation all the type definitions:
 * 		- Class Definitions
 * 		- Primitive Types
 * 		- Enumerations
 * 		- Model Types
 * 
 * @author paco
 *
 */
public class Pass1 extends MergePass {

	public Pass1(KermetaUnit kermetaUnit, MergeContext context) {
		super(kermetaUnit, context);
	}

	@Override
	public void process() {
		
		Set<TypeDefinition> definitionProcessed = new HashSet<TypeDefinition> ();
		for ( KermetaUnit unit : context.getKermetaUnitsToMerge() ) {

			/*
			 * 
			 * Creating the tags for modeling units.
			 * Here we are not using the createTags method from MergePass class
			 * because a modeling unit does not inherit from Object.
			 * 
			 */
			for ( Tag tag : unit.getModelingUnit().getOwnedTags() ) {
				Tag newTag = StructureFactory.eINSTANCE.createTag();
				newTag.setName( tag.getName() );
				newTag.setValue( tag.getValue() );
				kermetaUnit.getModelingUnit().getOwnedTags().add( newTag );
				kermetaUnit.getModelingUnit().getTag().add( newTag );
			}			
			
			for ( Package p : unit.getInternalPackages() ) {			
				String qualifiedName = NamedElementHelper.getQualifiedName(p);
				/*
				 * 
				 * Creating the package.
				 * 
				 */
				Package newPackage = kermetaUnit.addInternalPackage( qualifiedName, p.getUri() );
				
				for ( TypeDefinition t : p.getOwnedTypeDefinition() ) {
					String s = NamedElementHelper.getQualifiedName(t);
					TypeDefinition existingTypedefinition = kermetaUnit.getTypeDefinitionByQualifiedName(s);
					if ( existingTypedefinition == null ) {
						definitionProcessed.add( t );
						TypeDefinition newTypeDefinition = null;
						if ( t instanceof ClassDefinition )
							newTypeDefinition = createClassDefinition(t, newPackage);
						else if ( t instanceof PrimitiveType )
							newTypeDefinition = createPrimitiveType(t, newPackage);	
						else if ( t instanceof Enumeration )
							newTypeDefinition = createEnumeration(t, newPackage);
						else if ( t instanceof ModelType )
							newTypeDefinition = createModelType(t, newPackage );
						// Try to trace
						context.tryToTrace(newTypeDefinition, t);
					} else if ( ! definitionProcessed.contains(t) && t instanceof ClassDefinition && (existingTypedefinition != null) ) {
						if ( ! context.getAspects((ClassDefinition) existingTypedefinition).contains(t) ) {
							context.addAspect((ClassDefinition) existingTypedefinition, (ClassDefinition) t);
							createConstraints((ClassDefinition) existingTypedefinition, (ClassDefinition) t);
							createTags(existingTypedefinition, t);
						}
					}
				}
				/*
				 * 
				 * Creating the tags for the package.
				 * 
				 */
				createTags(newPackage, p);
			}
		}
		
		/*
		 * 
		 * Adding the usings for the type definition looking.
		 * 
		 */
		for ( String s : context.getPreUsingsToAdd() )
			kermetaUnit.addUsing(s);
		
	}
	
	private ClassDefinition createClassDefinition(TypeDefinition t, Package p) {
		ClassDefinition definition = (ClassDefinition) t;
		ClassDefinition newDefinition = StructureFactory.eINSTANCE.createClassDefinition();
		newDefinition.setName( definition.getName() );
		newDefinition.setIsAbstract( definition.isIsAbstract() );
		
		kermetaUnit.addTypeDefinition(newDefinition, p);
		/*
		 * 
		 * Creating the tags.
		 * 
		 */
		createTags(newDefinition, definition);
		
		/*
		 * 
		 * Creating the type variables.
		 * 
		 */
		for ( TypeVariable tv : definition.getTypeParameter() ) {
			if ( tv instanceof ObjectTypeVariable ) {
				ObjectTypeVariable otv = (ObjectTypeVariable) tv;
				ObjectTypeVariable newOTV = StructureFactory.eINSTANCE.createObjectTypeVariable();
				newOTV.setName( otv.getName() );
				newDefinition.getContainedType().add( newOTV );
				newDefinition.getTypeParameter().add( newOTV );
				// Try to trace
				context.tryToTrace(newOTV, tv);
			} else if ( tv instanceof ModelTypeVariable ) {
				ModelTypeVariable mtv = (ModelTypeVariable) tv;
				ModelTypeVariable newMTV = StructureFactory.eINSTANCE.createModelTypeVariable();
				newMTV.setName( mtv.getName() );
				newDefinition.getContainedType().add( newMTV );
				newDefinition.getTypeParameter().add( newMTV );
				// Try to trace
				context.tryToTrace(newMTV, tv);
			}
		}
		
		/*
		 * 
		 * Creating the constraints.
		 * 
		 */
		createConstraints(newDefinition, definition);
		
		context.putBaseTypeDefinition(newDefinition, definition);
		return newDefinition;
	}
	
	private PrimitiveType createPrimitiveType(TypeDefinition t, Package p) {
		PrimitiveType definition = (PrimitiveType) t;
		PrimitiveType newDefinition = KermetaModelHelper.PrimitiveType.create( definition.getName() );
		kermetaUnit.addTypeDefinition(newDefinition, p);
		context.putBaseTypeDefinition(newDefinition, definition);
		/*
		 * 
		 * Creating the tags.
		 * 
		 */
		createTags(newDefinition, definition);
		return newDefinition;
	} 
	
	private Enumeration createEnumeration(TypeDefinition t, Package p) {
		Enumeration definition = (Enumeration) t;
		Enumeration newDefinition = StructureFactory.eINSTANCE.createEnumeration();
		newDefinition.setName(definition.getName());
		kermetaUnit.addTypeDefinition(newDefinition, p);
		for ( EnumerationLiteral literal : definition.getOwnedLiteral() ) {
			EnumerationLiteral newLiteral = StructureFactory.eINSTANCE.createEnumerationLiteral();
			newLiteral.setName( literal.getName() );
			newDefinition.getOwnedLiteral().add( newLiteral );
			// Try to trace
			context.tryToTrace(newLiteral, literal);
		}
		/*
		 * 
		 * Creating the tags.
		 * 
		 */
		createTags(newDefinition, definition);
		return newDefinition;
	}
	
	private ModelType createModelType(TypeDefinition t, Package p) {
		ModelType definition = (ModelType) t;
		ModelType newDefinition = StructureFactory.eINSTANCE.createModelType();
		newDefinition.setName( definition.getName() );
		kermetaUnit.addTypeDefinition(newDefinition, p);
		context.putBaseTypeDefinition(newDefinition, definition);
		/*
		 * 
		 * Creating the tags.
		 * 
		 */
		createTags(newDefinition, definition);
		return newDefinition;
	}

	private void createConstraints(ClassDefinition newDefinition, ClassDefinition baseDefinition) {
		for ( Constraint constraint : baseDefinition.getInv() ) {
			Constraint newConstraint = StructureFactory.eINSTANCE.createConstraint();
			newConstraint.setName( constraint.getName() );
			newDefinition.getInv().add( newConstraint );
			context.putBaseConstraint(newConstraint, constraint);
			/*
			 * 
			 * Creating the tags.
			 * 
			 */
			createTags(newConstraint, constraint);
			// Try to trace
			context.tryToTrace(newConstraint, constraint);
		}
	}
	
}


