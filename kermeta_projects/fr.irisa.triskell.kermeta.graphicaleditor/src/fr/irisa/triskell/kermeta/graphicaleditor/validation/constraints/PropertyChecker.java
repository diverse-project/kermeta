/* $Id: PropertyChecker.java,v 1.1 2006-03-22 16:24:30 zdrey Exp $
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
package fr.irisa.triskell.kermeta.graphicaleditor.validation.constraints;

import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
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
 
	// String messages
	/** The opposite prop. of the opposite prop. *b* of a property *a* must be equals to the property *a* */
	public static final String OPPOSITE_ERROR = "Opposite mismatch  : the association is illformed. ";
	/** A composite property cannot have at its opposite property a multiplicity different than [1..1] */
	public static final String MULTIPLICITY_ERROR = 
		"Composition multiplicity problem : change the multiplicity or do not use composition"+
		" on the other end of the association. ";
	public static final String ISCOMPOSITE_ERROR = "Double composition problem (container contained by its content)";
	public static final String ISDERIVED_ERROR = "If property.isDerived is false than property.getterBody and property.setterBody must be void ";
	
	
	public PropertyChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object property, 
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		super(unit, property, context);
		classDefinition = (ClassDefinition)context;
		this.property = (Property)property; 
		
	}
	
	/**
	 * @param context The context of constraint checking, ClassDefinition for the property
	 * case. Visitor gives it.
	 * @return
	 */
	public Boolean check()
	{
		boolean result = false;
		// if '&&' is ordered, it's good
		// checking methods are ordered according to their increasing complexity
		result =
			checkPropertyMultiplicity() &&
			checkPropertyIsUnique() &&
			checkPropertyIsDerived() &&
			checkPropertyOpposite()
			;
		if (result==false) 
		{
			System.out.println("Property is null??? : " + property);
			System.err.println("Property:" + property.getName());
		}
		return new Boolean(result);
	}

	/**
	 * Constraints:
	 *   - A property must not have the same name as another property or operation
	 *   in the class or in the super types of the class.
	 *  We only check names of property, since it is sufficient to (in)valid the constraint
	 *  Origin: KMT2KMPass3
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
	 * Constraints: a *not* derived property cannot have getterBody nor a setterBody
	 * An error is raised if this constraint is not verified, but only syntactically...
	 * */
	protected boolean checkPropertyIsDerived()
	{
		boolean result = true;
		if (property.isIsDerived()==false)
			result = (property.getGetterBody()==null && property.getSetterBody()==null);
		//if (!result) addProblem(ERROR, )
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
		return (property.getUpper()!=0 && property.getUpper()>property.getLower());
	}
	
	/**
	 * In the graphical editor, user can let the type as null.
	 * TODO We do not impose yet a null type to be the Void type. Should we?? 
	 */
	protected boolean checkPropertyType()
	{
		return (property.getType()!=null);
	}
	
	/** 
	 * didier's
	 * @param prop
	 */
	 public boolean checkPropertyOpposite()
	 {
		 boolean result = true;
		 if(property.getOpposite() != null)
		 {
			 KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
			 // Opposite mismatch
			 if(property.getOpposite().getOpposite() != property)
			 {
				 builder.messages.addError(OPPOSITE_ERROR
					 + pp .ppSimplifiedPropertyInContext(property), property);
				 if(property.getOpposite().getOpposite() == null)
					 builder.messages.addError(OPPOSITE_ERROR
					+ pp.ppSimplifiedPropertyInContext(property.getOpposite()), property.getOpposite());
				 result = false;
			 }
			 // Composition multiplicity
			 if(property.getOpposite().isIsComposite()){
				 if(property.getUpper() != 1){
					 builder.messages.addError(MULTIPLICITY_ERROR
					 + pp.ppSimplifiedPropertyInContext(property), property);
					 result = false;
				 }
			 }
			 // Double Composition (association with diamond on both ends) 
			 if(property.getOpposite().isIsComposite()){
				 if(property.isIsComposite()){
					 // message on this end only, the other end will be checked too from the other class
					 builder.messages.addError(ISCOMPOSITE_ERROR 
							 + pp.ppSimplifiedPropertyInContext(property), property);
					 result = false;
				 }
			 }
		 }
		 return result;
	 }
	 
	
}
