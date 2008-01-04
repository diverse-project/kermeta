

/*$Id: Pass3.java,v 1.2 2008-01-04 15:08:47 dvojtise Exp $
* Project : org.kermeta.merger
* File : 	Pass3.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.io.StringReader;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import antlr.RecognitionException;
import antlr.TokenStreamException;
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
import fr.irisa.triskell.kermeta.loader.kmt.KMT2KMTypeBuilder;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionSearcher;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.gen.parser.KermetaParser;


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
		for (TypeDefinition td : TypeDefinitionSearcher.getTypesDefinition(kermetaUnit) ) {
			try {
				if ( td instanceof ClassDefinition )
					setTypes( (ClassDefinition) td );
				else if ( td instanceof PrimitiveType )
					setTypes( (PrimitiveType) td );
			} catch (RecognitionException e) {
				e.printStackTrace();
			} catch (TokenStreamException e) {
				e.printStackTrace();
			} 	
		}
	}
	
	private void setTypes(PrimitiveType newDefinition) throws RecognitionException, TokenStreamException {
		PrimitiveType definition = (PrimitiveType) context.getBaseTypeDefinition(newDefinition);
		Type type = createType(definition.getInstanceType());
		if ( type != null ) {
			newDefinition.getContainedType().add( type );
			newDefinition.setInstanceType(type);
		}
	}

	private void setTypes(ClassDefinition newDefinition) throws RecognitionException, TokenStreamException {

		context.pushContext();			
		for ( TypeVariable tv : newDefinition.getTypeParameter() )
			context.addTypeVar( tv );
		
		/*
		 * 
		 * Setting the super types for the class definitions.
		 * 
		 */
		ClassDefinition definition = (ClassDefinition) context.getBaseTypeDefinition(newDefinition);
		KermetaUnit owner = KermetaUnitHelper.getKermetaUnitFromObject( definition );
		Set<TypeDefinition> group = ClassDefinitionHelper.getAllBaseClasses(definition);
		group.add( definition );
		List<TypeDefinition> aspects = owner.getAspects().get(definition);
		if ( aspects != null )
			group.addAll( aspects );
		for ( TypeDefinition td : group ) {
			ClassDefinition cdef = (ClassDefinition) td;
			for ( Type supertype : cdef.getSuperType() ) {
				Type type = createType(supertype);
				if ( type != null ) {
					newDefinition.getContainedType().add( type );
					newDefinition.getSuperType().add(type);
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
				Type supertype = createType(baseTypeVariable.getSupertype());
				tv.setSupertype( supertype );
			}
		}
		
		setPropertiesType(newDefinition);
		setOperationsType(newDefinition);

		context.popContext();
	}
	
	
	private Type createType(Type t) throws RecognitionException, TokenStreamException {
		KM2KMTPrettyPrinter printer = new KM2KMTPrettyPrinter(true);
		String typeAsString  = (String) printer.accept( t);
		StringReader reader = new StringReader(typeAsString);
		KermetaLexer lexer = new KermetaLexer(reader);
		KermetaParser parser = new KermetaParser(lexer);
		fr.irisa.triskell.kermeta.parser.gen.ast.Type  node = parser.type();
		Type type = KMT2KMTypeBuilder.process(context, node, kermetaUnit, new NullProgressMonitor());
		return type;
	}
	
	private void setPropertiesType(ClassDefinition newDefinition) throws RecognitionException, TokenStreamException {
		for ( Property newProperty : newDefinition.getOwnedAttribute() ) {
			Property p = context.getBaseProperty(newProperty);
			/*
			 * 
			 * Setting the type.
			 * 
			 */
			Type type = createType(p.getType());
			if ( type != null ) {
				if ( type.eContainer() == null )
					newProperty.getContainedType().add( type );
				newProperty.setType(type);
			}
			/*
			 * 
			 * Setting the opposite if there is one.
			 * 
			 */
			if ( p.getOpposite() != null ) {
				String qualifiedName = NamedElementHelper.getQualifiedName( (NamedElement) p.getOpposite().eContainer() );
				ClassDefinition cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName, new NullProgressMonitor());
				newProperty.setOpposite( ClassDefinitionHelper.getPropertyByName(cd, p.getOpposite().getName()) );
			}
		}
	}
	
	private void setOperationsType(ClassDefinition newDefinition) throws RecognitionException, TokenStreamException {
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
				type = createType(baseOperation.getType());
				if ( type != null ) {
					if ( type.eContainer() == null )
						newOperation.getContainedType().add( type );
					newOperation.setType(type);
				}
			}
			
			/*
			 * 
			 * Setting the super operation if there is one.
			 * 
			 */
			if ( baseOperation.getSuperOperation() != null ) {
				String qualifiedName = NamedElementHelper.getQualifiedName( (ClassDefinition) baseOperation.getSuperOperation().eContainer() ); 
				ClassDefinition cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName(qualifiedName);
				Operation superOperation = ClassDefinitionHelper.getOperationByName(cd, baseOperation.getSuperOperation().getName());
				newOperation.setSuperOperation( superOperation );
			}
			
			/*
			 * 
			 * Setting the type of parameters.
			 * 
			 */
			for ( Parameter newParameter : newOperation.getOwnedParameter() ) {
				Parameter p = context.getBaseParameter(newParameter);
				type = createType(p.getType());
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


