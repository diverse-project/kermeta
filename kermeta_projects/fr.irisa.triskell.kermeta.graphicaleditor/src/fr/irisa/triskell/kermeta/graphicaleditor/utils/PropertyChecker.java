/* $Id: PropertyChecker.java,v 1.1 2006-03-08 17:17:25 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : propertyChecker.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 */

/**
 * This package contains some constraint checking tools
 */
package fr.irisa.triskell.kermeta.graphicaleditor.utils;

import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 *
 * Defaults : some comparison tests need to be done using KM2KMTPrettyPrinter..
 * This is not the most efficient way but there is no other.
 * (but simpler to test the types conformity)
 * We also have to discuss if some constraints are more type-checking related or not
 */
public class PropertyChecker extends AbstractChecker {

	protected TypeEqualityChecker typeEqualityChecker;
	protected ClassDefinition classDefinition;
	protected Property property;
 
	
	public PropertyChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object property, 
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		super(unit, property, context);
		classDefinition = (ClassDefinition)context;
		
	}
	
	/**
	 * @param context The context of constraint checking, ClassDefinition for the property
	 * case. Visitor gives it.
	 * @return
	 */
	public boolean check()
	{
		boolean result = false;
		// if '&&' is ordered, it's good
		result =
			checkPropertyMultiplicity() &&
			checkPropertyIsUnique() &&
			checkPropertyIsDerived();
		return result;
	}

	/**
	 * Constraints:
	 *   - A property must not have the same name as another property or operation
	 *   in the class or in the super types of the class.
	 *  We only check names of property, since it is sufficient to (in)valid the constraint
	 * @param property
	 * @param classdef
	 * @return
	 */
	public boolean checkPropertyIsUnique()
	{
		boolean result = true;
		// An property cannot be defined twice in the same class
		if (builder.getPropertyByName(classDefinition, property.getName()) != null) {
			builder.messages.addMessage(new KMUnitMessage("PASS 3 : Class '"+builder.current_class.getName()+"' duplicate definition of property '"+builder.current_property.getName()+"'.",property));
			result = false;
		}
		// A property that exist in a super type must not be redeclared in the sub types in either
		// way.
		List<Property> ops = builder.getAllProperties(classDefinition);
		Iterator<Property> it = ops.iterator();
		while (it.hasNext() && result == true)
			if (it.next().getName().equals(property.getName())) result = false;
		return result;
	}
	
	/**
	 * Constraint: a *not* derived property cannot have getter and setter body
	 * An error is raised if this constraint is not verified, but only syntactically...
	 * */
	protected boolean checkPropertyIsDerived()
	{
		boolean result = true;
		if (property.isIsDerived()==false)
			result = (property.getGetterBody()==null && property.getSetterBody()==null);
		return result;
	}
	
	/**
	 * Yet there is only one constraint : upperBound must not be 0.
	 * Otherwise, the multiplicity constraintChecking is more complicated. We have
	 * to think about the necessity of having a complex algorithm or not... 
	 * @return
	 */
	protected boolean checkPropertyMultiplicity()
	{
		return property.getUpper()!=0;
	}
	
	
}
