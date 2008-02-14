/* $Id: ClassConformanceChecker.java,v 1.5 2008-02-14 07:13:16 uid21732 Exp $
* Project : Kermeta (First iteration)
* File : ClassConformanceChecker.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : sep 2007
* Authors : 
* 	Francois Tanguy
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class ClassConformanceChecker {

	private Class provided;
	
	private Stack<TypeDefinition> stack = new Stack<TypeDefinition> ();
	
	public ClassConformanceChecker(Class provided) {
		this.provided = provided;
		stack.add( provided.getTypeDefinition() );
	}
	
	public boolean conforms(Class required) {
		boolean result = false;

		/*
		 * 
		 * Calculating the context for the required type.
		 * 
		 */
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(required.getTypeDefinition());
		List<TypeDefinition> requiredTypeDefinitions = new ArrayList<TypeDefinition>();
		requiredTypeDefinitions.add( required.getTypeDefinition() );
		List<TypeDefinition> l = unit.getBaseAspects().get(required.getTypeDefinition());
		if ( l != null )
			requiredTypeDefinitions.addAll( l );
		
		/*
		 * 
		 * The provided type is maybe aspectized. So we first try to get the possible aspect
		 * in the kermeta unit that would provide us the full context.
		 * 
		 * If this is not an aspect, just try to get the context on the provided type.
		 * 
		 */
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(provided.getTypeDefinition());
		ClassDefinition cd = (ClassDefinition) unit.getTypeDefinitionByQualifiedName(qualifiedName);
		Collection<TypeDefinition> context = null;
		if ( cd != null )
			context = KermetaModelHelper.ClassDefinition.getContext( cd );
		else
			context = KermetaModelHelper.ClassDefinition.getContext( (ClassDefinition) provided.getTypeDefinition() );

		/*
		 * 
		 * Checking if the context matches.
		 * 
		 */
		for ( TypeDefinition rt : requiredTypeDefinitions ) {
			for ( TypeDefinition pt : context )
				if ( rt == pt ) {
					result = true;
					break;
				}
			if ( result )
				break;
		}
				
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
						
						if ( t_provided instanceof ObjectTypeVariable && t_required instanceof ObjectTypeVariable ) {
							result = t_provided == t_required;
						} else if ( t_provided instanceof Enumeration && t_required instanceof Enumeration ) {
							result = t_provided == t_required;
						} else {
							
							String requiredQualifiedName = KermetaModelHelper.NamedElement.qualifiedName( requiredType.getTypeDefinition() );
							String providedQualifiedName = KermetaModelHelper.NamedElement.qualifiedName( providedType.getTypeDefinition() );
							
							result = requiredQualifiedName.equals(providedQualifiedName);
						}
					}
				}
				
			} else
				result = false;
		}
		return result;
	}	
	
}
