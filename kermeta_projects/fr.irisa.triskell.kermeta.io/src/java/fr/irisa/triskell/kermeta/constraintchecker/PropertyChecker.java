/* $Id: PropertyChecker.java,v 1.7 2007-07-31 09:08:28 ftanguy Exp $
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
package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
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
		// An property cannot be defined twice in the same class
		boolean result = true;
		int number_of_duplicate = 1;
		List <Property> props = ClassDefinitionHelper.getAllProperties(classDefinition);
		for (Property p : props) {
			if ( (p != property) && (p.getName().equals(property.getName())) ) {
					
				ClassDefinition possibleBaseClass = (ClassDefinition) p.eContainer();
				if ( classDefinition.isIsAspect() && (possibleBaseClass != classDefinition) ) {
					boolean error = false;
					
					if ( property.isIsComposite() != p.isIsComposite() )
						error = true;
					
					if ( !error && ! TypeEqualityChecker.equals(property.getType(), p.getType()) ) {
						ClassDefinition cd1 = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) property.getType()).getTypeDefinition();
						ClassDefinition cd2 = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) p.getType()).getTypeDefinition();
						if ( ! ClassDefinitionHelper.getAllBaseClasses(cd1).contains(cd2) )
							error = true;
					} 
					if ( error ) {
						KermetaUnit distantUnit = KermetaUnitHelper.getKermetaUnitFromObject(p);
						String message = "";
						if ( distantUnit != null )
							message = "Property " + p.getName() + " is declared with a different type in " + distantUnit.getUri();
						else
							message = "Property " + p.getName() + " is declared with a different type elsewhere.";
						
						addProblem(ERROR, message, property);

					}
				} else if (p.getName().equals(property.getName())) {
					number_of_duplicate += 1;
				}
			
			}
		}
		// An operation cannot be defined twice in the same class
		if (number_of_duplicate > 1) {
			addProblem(ERROR, "Class '"+classDefinition.getName()+"' " +
					"duplicate definition of property '"+property.getName()+"'.",property);
			result = false;
		}
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
				 builder.error(OPPOSITE_ERROR
					 + pp .ppSimplifiedPropertyInContext(property), property);
				 if(property.getOpposite().getOpposite() == null)
					 builder.error(OPPOSITE_ERROR
					+ pp.ppSimplifiedPropertyInContext(property.getOpposite()), property.getOpposite());
				 result = false;
			 }
			 // Composition multiplicity
			 if(property.getOpposite().isIsComposite()){
				 if(property.getUpper() != 1){
					 builder.error(MULTIPLICITY_ERROR
					 + pp.ppSimplifiedPropertyInContext(property), property);
					 result = false;
				 }
			 }
			 // Double Composition (association with diamond on both ends) 
			 if(property.getOpposite().isIsComposite()){
				 if(property.isIsComposite()){
					 // message on this end only, the other end will be checked too from the other class
					 builder.error(ISCOMPOSITE_ERROR 
							 + pp.ppSimplifiedPropertyInContext(property), property);
					 result = false;
				 }
			 }
		 }
		 return result;
	 }
	 
	
}
