package fr.irisa.triskell.kermeta.typechecker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;
import fr.irisa.triskell.kermeta.language.structure.Type;

public class ClassConformanceChecker {

	private Class provided;
	
	private Set <TypeDefinition> context = new HashSet <TypeDefinition> ();
	
	private Stack<TypeDefinition> stack = new Stack<TypeDefinition> ();
	
	private Set <TypeDefinition> processed = new HashSet <TypeDefinition> ();
	
	public ClassConformanceChecker(Class provided) {
		this.provided = provided;
		stack.add( provided.getTypeDefinition() );
		calculateContext();
	}
	
	public boolean conforms(Class required) {
		boolean result = false;
		result = context.contains( required.getTypeDefinition() );
		if ( ! provided.getTypeParamBinding().isEmpty() ) {
			if ( ! required.getTypeParamBinding().isEmpty() ) {
				if ( provided.getTypeParamBinding().size() != required.getTypeParamBinding().size() )
					result = false;
				else {
					Iterator<TypeVariableBinding> it_provided = provided.getTypeParamBinding().iterator();
					Iterator<TypeVariableBinding> it_required = required.getTypeParamBinding().iterator();
				
					while ( result && it_provided.hasNext() && it_required.hasNext() ) {
						Type t_provided = it_provided.next().getType();
						Type t_required = it_required.next().getType();
						SimpleType providedType = new SimpleType( t_provided );
						SimpleType requiredType = new SimpleType( t_required );
						/*
						 * 
						 * We do not use voluntarily the isSubType because of the genericity.
						 * So we use the basic comparison and the aspects.
						 * 
						 */
						result = providedType.getTypeDefinition() == requiredType.getTypeDefinition();
						if ( ! result )
							result = TypeDefinitionHelper.getAspects( providedType.getTypeDefinition() ).contains(requiredType.getTypeDefinition());
						if ( !result )
							result = TypeDefinitionHelper.getAspects( requiredType.getTypeDefinition() ).contains(providedType.getTypeDefinition());	
					}
				}
				
			} else
				result = false;
		}
		return result;
	}
	
	private void calculateContext() {
		
		while ( ! stack.isEmpty() ) {
			TypeDefinition tdef = stack.pop();
			if ( ! processed.contains(tdef) ) {
				Set<TypeDefinition> localContext = getLocalContext( (ClassDefinition) tdef);
				context.add( tdef );
				stack.addAll( localContext );
				processed.add( tdef );

				for ( fr.irisa.triskell.kermeta.language.structure.Type c : ((ClassDefinition) tdef).getSuperType() ) {
					stack.push( ((ClassDefinition) ((Class) c).getTypeDefinition()) );
				}
				
			}
		}
		
	}
	
	private Set<TypeDefinition> getLocalContext(ClassDefinition c) {
		
		Set <TypeDefinition> result = ClassDefinitionHelper.getAllBaseClasses(c);
		result.addAll( TypeDefinitionHelper.getAspects(c) );
		return result;
		
	}
	
	
}
