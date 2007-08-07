/* $Id: KMT2KMPass4.java,v 1.23 2007-08-07 14:22:16 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass4.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Authors : 
 * 	Franck Fleurey	ffleurey@irisa.fr
 * Description :
 * 	For each class declaration
 * 	   - Set the property opposites
 *     - Set the super operations 
 * 
 * 
*/
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


/**
 * PASS 4 :
 *  - Set property opposites (the matching of opposite properties shoud be checked in next PASS)
 *  - Set super operations
 * 
 * TODO : check inheritance loops / operation, property defs
 */
public class KMT2KMPass4 extends KMT2KMPass {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2KMPass4");
	
	/**
	 * @param builder
	 */
	public KMT2KMPass4(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
	}
	
	/*
	* *******************************************************
	*                     CLASSES
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
		context.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		// check for inheritance cycles
		if (ClassDefinitionHelper.isSuperClassOf(context.current_class, context.current_class)) {
			builder.error("Cycle in the inheritance tree - The type hierachy of class '"+context.current_class.getName()+"' is inconsistant.", classDecl);
			return false;
		}
		return super.beginVisit(classDecl);
	}
	

	/*
	* *******************************************************
	*                     OPERATION
	* *******************************************************
	*/
	
	/**
	 * Visit the AST node called Operation.
	 * operation : operationKind name=ID 
	 * 			   (LT typeVarDecllst GT)? LPAREN (params)? RPAREN (COLON typeRef)?  
	 * 			   ("from" superSelection=qualifiedID)? ("raises" exceptions=typelst)? 
	 * 			   "is" operationBody;
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Operation)
	 */
	public boolean beginVisit(Operation operation) {
		context.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation)builder.getModelElementByNode(operation);
		
		if (ClassDefinitionHelper.getPropertyByName(context.current_class, context.current_operation.getName()) != null) {
			builder.error("A property named '"+context.current_operation.getName()+
					"' is already inherited by class '"+context.current_class.getName()+"'."
					, operation);
			return false;
		}
		String base_msg = "An operation named '" + context.current_operation.getName() + "' on class "+ context.current_class.getName()+ " is already inherited from class '";
		String end_msg = " If you want redefinition, please use \"method\" keyword.";
		// Is there already an operation in the super types of this class?
		EList superclasses = context.current_class.getSuperType();
		if (operation.getOperationKind().getText().equals("operation")) {
			// If not, is there already an operation in the common *implicit* super type object?
			ClassDefinition object_classdef = ((ClassDefinition)builder.getTypeDefinitionByName("kermeta::reflection::Object"));
			if (object_classdef != null) // robustness useless test -> Object type should already have been parsed!
			{
				if (ClassDefinitionHelper.getOperationByName(object_classdef, context.current_operation.getName())!=null && 
						context.current_class != object_classdef && // ignore "Object" itself ...
						!NamedElementHelper.getQualifiedName(context.current_class).equals("kermeta::language::structure::KMStructureVisitable")) // the concret implementation of Object inherits from KMStructureVisitable
					builder.error(base_msg + "kermeta:language::structure::Object'. (implicit inheritance!)" + end_msg,
							operation);
					return false;
			}
			// the operation should not have been defined in any super class
			for (int i=0; i<superclasses.size(); i++) {
				ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
				if (ClassDefinitionHelper.getOperationByName(sc, context.current_operation.getName()) != null) {
					builder.error(base_msg
							+ sc.getName() + "'." + end_msg);
					/*builder.messages.addMessage(new KMTUnitLoadError(base_msg
							+ sc.getName() + "'." + end_msg,
							operation));*/
					return false;
				}
			}

		}
		else if (operation.getOperationKind().getText().equals("method")) {
			// the op should be defined in a superclass
			// potential super ops
			Hashtable superops = getSupersForMethod(context.current_class, context.current_operation.getName());
			if (superops.size() == 0) { // Error, no super operation
//				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :No super operation found for method '"+builder.current_operation.getName()+"'.", operation));
				builder.error("No super operation found for method '"+context.current_operation.getName()+"'.", context.current_operation);
				return false;
			}
			else if (superops.size() == 1) { // No problem
				String scname = (String)superops.keys().nextElement();
				context.current_operation.setSuperOperation((fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(scname));
				if (operation.getSuperSelection() != null) {
					String provided_name = qualifiedIDAsString(operation.getSuperSelection());
					if (!provided_name.equals(scname)) {
						//builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Wrong super operation selection directive '"+provided_name+"', super operation selected from class '"+scname+"'.", operation));
						builder.error("Wrong super operation selection directive '"+provided_name+"', super operation selected from class '"+scname+"'.");
					}
				}
			}
			// FIXED : superoperation finding is not correct
			else { // the super method has to be chosen
			    
				String possible_selection = "";
				Enumeration e = superops.keys();
				while (e.hasMoreElements()) {
					possible_selection += e.nextElement() + ", ";
				}
				possible_selection = possible_selection.substring(0, possible_selection.length()-2);
				
				if ( (operation.getSuperSelection() == null) && possible_selection.contains("kermeta::language::structure::Object") )
					context.current_operation.setSuperOperation( (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get("kermeta::language::structure::Object") );
				else if (operation.getSuperSelection() != null) { // the user has chosen
					String provided_name = qualifiedIDAsString(operation.getSuperSelection());
					fr.irisa.triskell.kermeta.language.structure.Operation superop = null;
					superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(provided_name);
					
					if (superop == null) {
						
						//ClassDefinition supertype = (ClassDefinition) builder.getTypeDefinitionByName(provided_name);
						//superop = (fr.irisa.triskell.kermeta.language.structure.Operation) superops.get( NamedElementHelper.getQualifiedName(supertype) );
						
					Iterator<Package> iterator = builder.getInternalPackages().iterator();
						while ( iterator.hasNext() && (superop == null) ) {
							Package p = iterator.next();
							superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(NamedElementHelper.getQualifiedName(p) + "::" + provided_name);
						}
					}
					
					if (superop == null) {
						
						for ( String qualifiedName : (Set<String>) builder.getUsings() ) {
							superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(qualifiedName + "::" + provided_name);
							if (superop != null) break;
						}
					}
					
					if (superop != null) { 
						context.current_operation.setSuperOperation(superop);
					}
					
					else {
						builder.error("Wrong super operation selection directive '"+provided_name+"', expecting one of "+possible_selection+".", operation.getSuperSelection());
						return false;
					}
				}
				else { // error
					builder.error("Several super operation found for method '"+context.current_operation.getName()+"', : "+possible_selection+".", operation);
					return false;
				}
			}
		}
		return false;
	}

	
	
	/*
	* *******************************************************
	*                     PROPERTY
	* *******************************************************
	*/
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.Property)
	 */
	public boolean beginVisit(Property property) {
		context.current_property = (fr.irisa.triskell.kermeta.language.structure.Property)builder.getModelElementByNode(property);
		if (property.getOppositeName() != null) {
			String opname = getTextForID(property.getOppositeName());
			// the type of such a property must a class which class definition contains a property
			// named opname and which type is current_property.owningClass
			if (!(context.current_property.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				builder.error("Unexpected opposite - The type of a property that have an opposite should be a Class.", property.getOppositeName());
				return false;
			}
			ClassDefinition opposite_class = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)context.current_property.getType()).getTypeDefinition();
			fr.irisa.triskell.kermeta.language.structure.Property oposite_property = ClassDefinitionHelper.getPropertyByName(opposite_class, opname);
			if (oposite_property == null) {
				builder.error("Unable to resolve opposite of property " + context.current_property.getName(), property.getOppositeName());
				return false;
			}
			context.current_property.setOpposite(oposite_property);
		}
		return super.beginVisit(property);
	}

	/**
	 * Get the super operation/methods for given method name <code>methname</code>
	 * of the class <code>cls</code>, and add it to a hashtable.
	 * @param cls
	 * @param methname
	 * @return
	 */
	public Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation> getSupersForMethod(ClassDefinition cls, String methname) {
		Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation> result = new Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation>();
		ArrayList<ClassDefinition> supers = ClassDefinitionHelper.getDirectSuperClasses(cls);
		
		for(int i=0; i<supers.size(); i++) {
			fr.irisa.triskell.kermeta.language.structure.Operation superop = ClassDefinitionHelper.getOperationByName(supers.get(i), methname);
			if (superop != null)
			{
				result.put(NamedElementHelper.getQualifiedName(supers.get(i)), superop);
			}
			else 
			{ // search in supertypes of supers[i]
				result.putAll(getSupersForMethod(supers.get(i), methname));
			}
		}
		
		ClassDefinition objectClass = (ClassDefinition) builder.getTypeDefinitionByQualifiedName("kermeta::language::structure::Object");//StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();
		if ( objectClass != null) {
		    result.putAll(getSupersForMethodOnObject(objectClass, methname));
		}
		else 
			internalLog.warn("Not able to retreive Object ClassDefinition for operation/method check");
		
		return result;
	}
	
	private Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation> getSupersForMethodOnObject(ClassDefinition cls, String methname) {
		Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation> result = new Hashtable<String, fr.irisa.triskell.kermeta.language.structure.Operation>();
		ArrayList<ClassDefinition> supers = ClassDefinitionHelper.getDirectSuperClasses(cls);
		
		for(int i=0; i<supers.size(); i++) {
			fr.irisa.triskell.kermeta.language.structure.Operation superop = ClassDefinitionHelper.getOperationByName(supers.get(i), methname);
			if (superop != null)
			{
				result.put(NamedElementHelper.getQualifiedName(supers.get(i)), superop);
			}
			else 
			{ // search in supertypes of supers[i]
				result.putAll(getSupersForMethodOnObject(supers.get(i), methname));
			}
		}
		return result;
	}
	
	
}

