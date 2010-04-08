/* $Id: PropertyChecker.java,v 1.22 2008-10-16 09:35:49 cfaucher Exp $
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
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;
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
	public static final String UPPERNOTZERO_ERROR = "the upperbound multiplicity cannot be 0";
	public static final String LOWERGREATERTHANUPPER_ERROR = "the upperbound must be greater than the lowerbound";
	public static final String MULTIPLICITY_ERROR = 
		"A composite property cannot have at its opposite property a multiplicity  greater than 1 : " +
		"change the multiplicity or do not use composition"+
		" on the other end of the association. ";
	public static final String NOT_USABLE_ATTRIBUTE_WARNING = "the attribute cannot be used because the target object has a constraint " +
			"that force it to be contained by another kind of object";
	public static final String ISCOMPOSITE_ERROR = "Double composition problem (container contained by its content)";
	public static final String ISDERIVED_ERROR = "If property.isDerived is false then property.getterBody and property.setterBody must be void ";
	public static final String READONLY_AND_SETTER_ERROR = "A readonly derived property cannot define a setter";
	public static final String MULTIPLICITY_ON_DERIVED_PROPERTY_AND_SETTER_ERROR = "A property with a multiplicity greater than 1 cannot define a setter";
	
	
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
			checkPropertyOpposite() && 
			checkPropertiesConformity() &&
			checkAttributeIsUsable() &&
			checkDerivedPropertySetterConstraints()
			;
		checkUseOfDeprecated();
		return Boolean.valueOf(result);
	}

	private void checkUseOfDeprecated() {
		checkDeprecatedTypeDefinition(property.getType(), property);
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
		
		KermetaUnitHelper.getKermetaUnitFromObject( classDefinition );
		List <Property> props = KermetaModelHelper.ClassDefinition.getAllProperties(builder, classDefinition);
		for (Property p : props) {
			if ( (p != property) && (p.getName().equals(property.getName())) ) {		
				ClassDefinition possibleBaseClass = (ClassDefinition) p.eContainer();
				if ( classDefinition.isIsAspect() && (possibleBaseClass != classDefinition) ) {
					boolean error = false;

					if ( property.isIsComposite() != p.isIsComposite() )
						error = true;
					
					if ( !error && ! TypeEqualityChecker.equals(property.getType(), p.getType()) ) {
						if ( property.getType() instanceof Class && p.getType() instanceof Class ) {
							ClassDefinition cd1 = (ClassDefinition) ((Class) property.getType()).getTypeDefinition();
							ClassDefinition cd2 = (ClassDefinition) ((Class) p.getType()).getTypeDefinition();
						
							if ( TypeDefinitionHelper.getBaseAspects(builder.getModelingUnit(), cd1) != null && ! TypeDefinitionHelper.getBaseAspects(builder.getModelingUnit(),cd1).contains(cd2) )
							//if ( ! ClassDefinitionHelper.getAllBaseClasses(cd1).contains(cd2) )
								error = true;
						} else if ( property.getType() instanceof Enumeration && p.getType() instanceof Enumeration ) {
							if ( property.getType() != p.getType() )
								error = true;
						} else if ( property.getType() instanceof Class && p.getType() instanceof ObjectTypeVariable )
							error = true;
					} 
					if ( error ) {
						KermetaUnit distantUnit = KermetaUnitHelper.getKermetaUnitFromObject(p);
						String message = "";
						if ( distantUnit != null ) {
							String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(p.getOwningClass());
							message = "Property " + p.getName() + " is declared with a different type in class definition " + qualifiedName + " defined in file " + distantUnit.getUri();
						} else
							message = "Property " + p.getName() + " is declared with a different type elsewhere.";
						
						addProblem(ERROR, message, property);

					}
				} else if ( p.getName().equals(property.getName()) ) {
	
					if ( TypeDefinitionHelper.getBaseAspects(builder.getModelingUnit(),possibleBaseClass) == null )
						number_of_duplicate += 1;
					else if ( ! TypeDefinitionHelper.getBaseAspects(builder.getModelingUnit(),possibleBaseClass).contains(classDefinition) )
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
		if (property.isIsDerived()==false){
			result = (property.getGetterBody()==null && property.getSetterBody()==null);
		//if (!result) addProblem(ERROR, )
		}
		return result;
	}
	
	/**
	 * derived property with a readonly cannot define a setter
	 * derived property with a multiplicity greater than 1 cannot define a setter
	 * @return
	 */
	protected boolean checkDerivedPropertySetterConstraints()
	{
		boolean result = true;
		if (property.isIsDerived() && property.getSetterBody()!=null ){
			if(property.isIsReadOnly() ){
				result = false;
				addProblem(ERROR, READONLY_AND_SETTER_ERROR + " on '" + property.getName() + "'" ,property);
			}
			if((property.getUpper() > 1 || property.getUpper()< 0) ){
				result = false;
				addProblem(WARNING, MULTIPLICITY_ON_DERIVED_PROPERTY_AND_SETTER_ERROR ,property);
			}
		}
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
		boolean result = true;
		if(property.getUpper()==0){
			result = false;
			addProblem(ERROR, UPPERNOTZERO_ERROR ,property);
		}
		if(property.getUpper() > 0)//note: in some metamodels, the upper bound equals -2
			if(property.getUpper()<property.getLower()){
				result = false;
				addProblem(ERROR, LOWERGREATERTHANUPPER_ERROR, property);
			}
		return result;
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
			// if ( property.getOpposite() != null ) {
				 /*
				  * 
				  * If the property got an opposite, check if the container of the respective opposite property is the same,
				  * or an aspect of the current container which is a class definition.
				  * 
				  */
				 ClassDefinition container1 = null;
				 if ( property.getOpposite().getOpposite() != null ) 
					 container1 = (ClassDefinition) property.getOpposite().getOpposite().eContainer();
				 ClassDefinition container2 = (ClassDefinition) property.eContainer();
			 
				 if ( (container1 != container2) && ! TypeDefinitionHelper.getBaseAspects(builder.getModelingUnit(),  container2).contains(container1) ) {			 
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

	private boolean checkPropertiesConformity() {
		boolean result = true;
		KermetaUnitHelper.getKermetaUnitFromObject( classDefinition );
		List <Property> props = KermetaModelHelper.ClassDefinition.getAllProperties(builder, classDefinition);
		for (Property p : props) {
			result = result && checkPropertyConformity(p);
		}
		return result;
	}
	 
	 private boolean checkPropertyConformity(Property property) {
		 boolean result = true;
		 if ( property.isIsDerived() ) {
		 
			 ClassDefinition owner = (ClassDefinition) property.eContainer();
			 String qualifiedName = NamedElementHelper.getQualifiedName(owner);
			 for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(builder) ) {
				 TypeDefinition typeDefinition = unit.getTypeDefinitionByQualifiedName(qualifiedName);
				 if ( typeDefinition != null && typeDefinition instanceof ClassDefinition ) {
					 ClassDefinition cd = (ClassDefinition) typeDefinition;
					 Property p = KermetaModelHelper.ClassDefinition.getPropertyByName(builder, cd, property.getName());
					 if ( p != null && p != property ) {
						 if ( ! property.isIsGetterAbstract() && ! p.isIsGetterAbstract() ) {
							 builder.error("Property " + property.getName() + " has redeclared the getter declared in " + unit.getUri() + ".", property.getGetterBody());
							 result = false;
						 }
						 if ( ! property.isIsSetterAbstract() && ! p.isIsSetterAbstract() ) {
							 builder.error("Property " + property.getName() + " has redeclared the setter declared in " + unit.getUri() + ".", property.getSetterBody());
							 result = false;
						 }
				 	}
				 }
			 }
		 }
		 return result;
	 }
	 
	 /**
	  * Checks if on the target object it exists a link that declares a multiplicity 1 for an aggregation which is not this property
		then we have an error
	  * @param property
	  * @return
	  */
	 private boolean checkAttributeIsUsable(){
		 boolean result = true;
		 if(property.isIsComposite()){
			 // if on the target object it exists a link that declares a multiplicity 1 for an aggregation which is not this property
			 // then we have an error
			 Type type = property.getType();
			 if(type instanceof fr.irisa.triskell.kermeta.language.structure.Class){
				 fr.irisa.triskell.kermeta.language.structure.Class ctype = ( fr.irisa.triskell.kermeta.language.structure.Class)type;
				 ClassDefinition cd = (ClassDefinition)ctype.getTypeDefinition();
				 for(Property p : KermetaModelHelper.ClassDefinition.getAllPropertiesWithOpposite(builder, cd)){
					 if(p.getLower() == 1 && p.getUpper() == 1){
						 if((p.getOpposite() != property) && p.getOpposite().isIsComposite()) {
							 builder.warning("Property " + property.getOwningClass().getName()+"."+property.getName() + " cannot be used because the target class " + cd.getName() +
							 		" is already contained in a mandatory composition : " + new KM2KMTPrettyPrinter().ppSimplifiedPropertyInContext(p) , 
							 	property );
							 
							 result = false;
						 }
					 }
				 }
			 }
		 }
		 return result;
	 }
	 
}
