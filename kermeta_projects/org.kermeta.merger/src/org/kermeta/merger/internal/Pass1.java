

/*$Id: Pass1.java,v 1.3 2007-10-19 16:23:27 cfaucher Exp $
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
			 * 
			 */
			for ( Tag tag : unit.getModelingUnit().getOwnedTags() ) {
				Tag newTag = StructureFactory.eINSTANCE.createTag();
				newTag.setName( tag.getName() );
				newTag.setValue( tag.getValue() );
				kermetaUnit.getModelingUnit().getOwnedTags().add( newTag );
			}			
			
			for ( Package p : unit.getPackages() ) {			
				String qualifiedName = NamedElementHelper.getQualifiedName(p);
				/*
				 * 
				 * Creating the package.
				 * 
				 */
				Package newPackage = kermetaUnit.addInternalPackage( qualifiedName );
				newPackage.setUri(p.getUri());
				for ( TypeDefinition t : p.getOwnedTypeDefinition() ) {
					String s = NamedElementHelper.getQualifiedName(t);
					TypeDefinition existingTypedefinition = kermetaUnit.getTypeDefinitionByQualifiedName(s);
					if ( existingTypedefinition == null ) {
						definitionProcessed.add( t );
						if ( t instanceof ClassDefinition )
							createClassDefinition(t, newPackage);
						else if ( t instanceof PrimitiveType )
							createPrimitiveType(t, newPackage);	
						else if ( t instanceof Enumeration )
							createEnumeration(t, newPackage);
						else if ( t instanceof ModelType )
							createModelType(t, newPackage );
					} else if ( ! definitionProcessed.contains(t) && t instanceof ClassDefinition && (existingTypedefinition != null) ) {
						if ( ! context.getAspects((ClassDefinition) existingTypedefinition).contains(t) ) {
							context.addAspect((ClassDefinition) existingTypedefinition, (ClassDefinition) t);
							createConstraints((ClassDefinition) existingTypedefinition, (ClassDefinition) t);
						}
					}
				}
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
	
	private void createClassDefinition(TypeDefinition t, Package p) {
		ClassDefinition definition = (ClassDefinition) t;
		ClassDefinition newDefinition = StructureFactory.eINSTANCE.createClassDefinition();
		newDefinition.setName( definition.getName() );
		kermetaUnit.addTypeDefinition(newDefinition, p);
		
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
			} else if ( tv instanceof ModelTypeVariable ) {
				ModelTypeVariable mtv = (ModelTypeVariable) tv;
				ModelTypeVariable newMTV = StructureFactory.eINSTANCE.createModelTypeVariable();
				newMTV.setName( mtv.getName() );
				newDefinition.getContainedType().add( newMTV );
				newDefinition.getTypeParameter().add( newMTV );
			}
		}
		
		/*
		 * 
		 * Creating the constraints.
		 * 
		 */
		createConstraints(newDefinition, definition);
		
		context.putBaseTypeDefinition(newDefinition, definition);
	}
	
	private void createPrimitiveType(TypeDefinition t, Package p) {
		PrimitiveType definition = (PrimitiveType) t;
		PrimitiveType newDefinition = StructureFactory.eINSTANCE.createPrimitiveType();
		newDefinition.setName( definition.getName() );
		kermetaUnit.addTypeDefinition(newDefinition, p);
		context.putBaseTypeDefinition(newDefinition, definition);
	} 
	
	private void createEnumeration(TypeDefinition t, Package p) {
		Enumeration definition = (Enumeration) t;
		Enumeration newDefinition = StructureFactory.eINSTANCE.createEnumeration();
		newDefinition.setName(definition.getName());
		kermetaUnit.addTypeDefinition(newDefinition, p);
		for ( EnumerationLiteral literal : definition.getOwnedLiteral() ) {
			EnumerationLiteral newLiteral = StructureFactory.eINSTANCE.createEnumerationLiteral();
			newLiteral.setName( literal.getName() );
			newDefinition.getOwnedLiteral().add( newLiteral );
		}
	}
	
	private void createModelType(TypeDefinition t, Package p) {
		ModelType definition = (ModelType) t;
		ModelType newDefinition = StructureFactory.eINSTANCE.createModelType();
		newDefinition.setName( definition.getName() );
		kermetaUnit.addTypeDefinition(newDefinition, p);
		context.putBaseTypeDefinition(newDefinition, definition);
	}

	private void createConstraints(ClassDefinition newDefinition, ClassDefinition baseDefinition) {
		for ( Constraint constraint : baseDefinition.getInv() ) {
			Constraint newConstraint = StructureFactory.eINSTANCE.createConstraint();
			newConstraint.setName( constraint.getName() );
			newDefinition.getInv().add( newConstraint );
			context.putBaseConstraint(newConstraint, constraint);
		}
	}
	
}


