

/*$Id: Pass3.java,v 1.6 2008-07-22 13:22:04 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	Pass3.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.merger.internal.util.TypeCloner;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;


/**
 * 
 * Setting the types for properties, parameters, supertypes.
 * Setting opposites properties.
 * 
 * @author paco
 *
 */
public class Pass3 extends MergePass {

	public Pass3(KermetaUnit kermetaUnit, MergeContext context) {
		super(kermetaUnit, context);
	}

	@Override
	public void process() {
		for (TypeDefinition td : KermetaUnitHelper.getTypeDefinitions(kermetaUnit) ) {
			if ( td instanceof ClassDefinition ) {
				setTypes( (ClassDefinition) td );
				removeDuplicateInheritance((ClassDefinition) td);
			} else if ( td instanceof PrimitiveType ) {
				setTypes( (PrimitiveType) td );
			}
		}
	}
	
	private void setTypes(PrimitiveType newDefinition) {
		PrimitiveType definition = (PrimitiveType) context.getBaseTypeDefinition(newDefinition);
		Type type = TypeCloner.clone( definition.getInstanceType(), kermetaUnit );
		if ( type != null ) {
			if ( type.eContainer() == null )
				newDefinition.getContainedType().add( type );
			newDefinition.setInstanceType(type);
		}
	}
	
	private boolean isClassWithTypeVariableBinding(Class aClass) {
		if( aClass.getTypeParamBinding()!=null && aClass.getTypeParamBinding().size()>0 )  {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Used to avoid the duplication of the same super types
	 * @param newDefinition
	 * @param type
	 * @return
	 */
	private void removeDuplicateInheritance(ClassDefinition newDefinition) {
		
		List<Type> list_typeToKeep = new ArrayList<Type>();
		
		for ( Type type : newDefinition.getSuperType() ) {
			for ( Type tmp_type : newDefinition.getSuperType() ) {
				if ( type != tmp_type ) {
					if ( TypeHelper.getMangledQualifiedName(type).equals(TypeHelper.getMangledQualifiedName(tmp_type)) ) {
						if( isClassWithTypeVariableBinding((Class) type) ) {
							if(TypeEqualityChecker.equals(type, tmp_type)) {
								list_typeToKeep.add(tmp_type);
							}
						} else if ( ! list_typeToKeep.contains(tmp_type) ) {
							list_typeToKeep.add(tmp_type);
						}
					}
				} else if ( ! list_typeToKeep.contains(tmp_type) ) {
					list_typeToKeep.add(tmp_type);
				}
			}
		}
				
		List<Type> l = newDefinition.getSuperType();
		newDefinition.getSuperType().removeAll(l);
		newDefinition.getContainedType().retainAll(l);
		newDefinition.getSuperType().addAll(list_typeToKeep);
		newDefinition.getContainedType().addAll(list_typeToKeep);		
	}

	private void setTypes(ClassDefinition newDefinition) {
		ClassDefinition definition = (ClassDefinition) context.getBaseTypeDefinition(newDefinition);
		
		context.pushContext();			
		for ( TypeVariable tv : newDefinition.getTypeParameter() )
			context.addTypeVar( tv );

		/*
		 * 
		 * Setting the super types for the class definitions.
		 * 
		 */
		Collection<ClassDefinition> group = context.getAspects(newDefinition);
		group.add(definition);
		
		for ( TypeDefinition t : group ) {
			if ( t instanceof ClassDefinition ) {
				ClassDefinition cdef = (ClassDefinition) t;
				for ( Type supertype : cdef.getSuperType() ) {
					Type type = TypeCloner.clone( supertype, kermetaUnit );
					if ( type != null ) {
						newDefinition.getContainedType().add( type );
						newDefinition.getSuperType().add(type);
					}
				}		
			}
		}
		
		/*
		 * 
		 * Setting the super types for the type variables.
		 * 
		 */
		for ( TypeVariable tv : newDefinition.getTypeParameter() ) {
			TypeVariable baseTypeVariable = ClassDefinitionHelper.getTypeVariable(definition, tv.getName());
			if ( baseTypeVariable.getSupertype() != null ) {
				Type supertype = TypeCloner.clone( baseTypeVariable.getSupertype(), kermetaUnit );
				tv.setSupertype( supertype );
			}
		}
		
		setPropertiesType(newDefinition);
		setOperationsType(newDefinition);

		context.popContext();
	}
	 
	
	/*private Type createType(Type t) throws RecognitionException, TokenStreamException {
		KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter(true);
		String typeAsString  = (String) printer.accept( t);
		StringReader reader = new StringReader(typeAsString);
		KermetaLexer lexer = new KermetaLexer(reader);
		KermetaParser parser = new KermetaParser(lexer);
		fr.irisa.triskell.kermeta.parser.gen.ast.Type  node = parser.type();
		Type type = KMT2KMTypeBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		return type;
	}*/
	
	private void setPropertiesType(ClassDefinition newDefinition) {
		for ( Property newProperty : newDefinition.getOwnedAttribute() ) {
			Property p = context.getBaseProperty(newProperty);
			/*
			 * 
			 * Setting the type.
			 * 
			 */
			Type type = TypeCloner.clone( p.getType(), kermetaUnit );
			if ( type != null ) {
				if ( type.eContainer() == null )
					newProperty.getContainedType().add( type );
				newProperty.setType(type);
			}
			// Try to trace
			context.tryToTrace(type, p.getType());
			/*
			 * 
			 * Setting the opposite if there is one.
			 * 
			 */
			if ( p.getOpposite() != null ) {
				String qualifiedName = NamedElementHelper.getQualifiedName( (NamedElement) p.getOpposite().eContainer() );
				ClassDefinition cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName, new NullProgressMonitor());
				newProperty.setOpposite( KermetaModelHelper.ClassDefinition.getPropertyByName(cd, p.getOpposite().getName()) );
			}
		}
	}
	
	private void setOperationsType(ClassDefinition newDefinition) {
		for ( Operation newOperation : newDefinition.getOwnedOperation() ) {
			
			context.pushContext();
				
			for ( TypeVariable tv : newOperation.getTypeParameter() )
				context.addTypeVar( tv );
			
			/*
			 * 
			 * Setting the returned type.
			 * 
			 */
			Operation baseOperation = context.getBaseOperation(newOperation);
			Type type = null;
			if ( baseOperation.getType() == null ) {
				fr.irisa.triskell.kermeta.language.structure.Class c = StructureFactory.eINSTANCE.createClass();
				c.setTypeDefinition( (GenericTypeDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object") );
			} else {		
				type = TypeCloner.clone( baseOperation.getType(), kermetaUnit );
				if ( type != null ) {
					if ( type.eContainer() == null )
						newOperation.getContainedType().add( type );
					newOperation.setType(type);
				}
			}
			// Try to trace
			context.tryToTrace(type, baseOperation.getType());
			 
			/*
			 * 
			 * Setting the super operation if there is one.
			 * 
			 */
			if ( baseOperation.getSuperOperation() != null ) {
				String qualifiedName = NamedElementHelper.getQualifiedName( (ClassDefinition) baseOperation.getSuperOperation().eContainer() ); 
				ClassDefinition cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName);
				Operation superOperation = KermetaModelHelper.ClassDefinition.getOperationByName(cd, baseOperation.getSuperOperation().getName());
				newOperation.setSuperOperation( superOperation );
			}
			
			/*
			 * 
			 * Setting the type of parameters.
			 * 
			 */
			for ( Parameter newParameter : newOperation.getOwnedParameter() ) {
				Parameter p = context.getBaseParameter(newParameter);
				type = TypeCloner.clone( p.getType(), kermetaUnit );	
				if ( type != null ) {
					if ( type.eContainer() == null )
						newParameter.getContainedType().add( type );
					newParameter.setType(type);
				}
			}
			
			context.popContext();
			
		}
	}
	
}


