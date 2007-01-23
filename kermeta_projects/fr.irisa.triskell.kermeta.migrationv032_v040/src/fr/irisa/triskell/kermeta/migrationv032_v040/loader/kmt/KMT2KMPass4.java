/* $Id: KMT2KMPass4.java,v 1.1 2007-01-23 15:04:12 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ClassDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Operation;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Property;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;


/**
 * PASS 4 :
 *  - Set property opposites (the matching of opposite properties shoud be checked in next PASS)
 *  - Set super operations
 * 
 * TODO : check inheritance loops / operation, property defs
 */
public class KMT2KMPass4 extends KMT2KMPass {

	/**
	 * @param builder
	 */
	public KMT2KMPass4(KermetaUnit builder) {
		super(builder);
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
		builder.current_class = (ClassDefinition)builder.getModelElementByNode(classDecl);
		// check for inheritance cycles
		if (ClassDefinitionHelper.isSuperClassOf(builder.current_class, builder.current_class)) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Cycle in the inheritance tree - The type hierachy of class '"+builder.current_class.getName()+"' is inconsistant.", classDecl));
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
		builder.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation)builder.getModelElementByNode(operation);
		if (ClassDefinitionHelper.findPropertyByName(builder.current_class, builder.current_operation.getName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : A property named '"+builder.current_operation.getName()+
					"' is already inherited by class '"+builder.current_class.getName()+"'."
					, operation));
			return false;
		}
		String base_msg = "PASS 4 : An operation named '" + builder.current_operation.getName() + "' on class "+ builder.current_class.getName()+ " is already inherited from class '";
		String end_msg = " If you want redefinition, please use \"method\" keyword.";
		// Is there already an operation in the super types of this class?
		EList superclasses = builder.current_class.getSuperType();
		if (operation.getOperationKind().getText().equals("operation")) {
			// If not, is there already an operation in the common *implicit* super type object?
			ClassDefinition object_classdef = ((ClassDefinition)builder.getTypeDefinitionByName("kermeta::reflection::Object"));
			if (object_classdef != null) // robustness useless test -> Object type should already have been parsed!
			{
				if (ClassDefinitionHelper.findOperationByName(object_classdef, builder.current_operation.getName())!=null && 
						builder.current_class != object_classdef && // ignore "Object" itself ...
						!NamedElementHelper.getQualifiedName(builder.current_class).equals("kermeta::language::structure::KMStructureVisitable")) // the concret implementation of Object inherits from KMStructureVisitable
				builder.messages.addMessage(new KMTUnitLoadError(
						base_msg + "kermeta:language::structure::Object'. (implicit inheritance!)" + end_msg,
						operation));
					return false;
			}
			// the operation should not have been defined in any super class
			for (int i=0; i<superclasses.size(); i++) {
				ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
				if (ClassDefinitionHelper.findOperationByName(sc, builder.current_operation.getName()) != null) {
					builder.messages.addMessage(new KMTUnitLoadError(base_msg
							+ sc.getName() + "'." + end_msg,
							operation));
					return false;
				}
			}

		}
		else if (operation.getOperationKind().getText().equals("method")) {
			// the op should be defined in a superclass
			// potential super ops
			Hashtable superops = getSupersForMethod(builder.current_class, builder.current_operation.getName());
			if (superops.size() == 0) { // Error, no super operation
				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :No super operation found for method '"+builder.current_operation.getName()+"'.", operation));
				return false;
			}
			else if (superops.size() == 1) { // No problem
				String scname = (String)superops.keys().nextElement();
				builder.current_operation.setSuperOperation((fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(scname));
				if (operation.getSuperSelection() != null) {
					String provided_name = qualifiedIDAsString(operation.getSuperSelection());
					if (!provided_name.equals(scname)) {
						builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Wrong super operation selection directive '"+provided_name+"', super operation selected from class '"+scname+"'.", operation));
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
				if (operation.getSuperSelection() != null) { // the user has chosen
					String provided_name = qualifiedIDAsString(operation.getSuperSelection());
					fr.irisa.triskell.kermeta.language.structure.Operation superop = null;
					superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(provided_name);
					
					if (superop == null) superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(NamedElementHelper.getQualifiedName(builder.rootPackage) + "::" + provided_name);
					
					if (superop == null) {
						Iterator uit = builder.usings.iterator();
						while(uit.hasNext()) {
							superop = (fr.irisa.triskell.kermeta.language.structure.Operation)superops.get(uit.next() + "::" + provided_name);
							if (superop != null) break;
						}
					}
					
					if (superop != null) { 
						builder.current_operation.setSuperOperation(superop);
					}
					
					else {
						builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :Wrong super operation selection directive '"+provided_name+"', expecting one of "+possible_selection+".", operation.getSuperSelection()));
						return false;
					}
				}
				else { // error
					builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :Several super operation found for method '"+builder.current_operation.getName()+"', : "+possible_selection+".", operation));
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
		builder.current_property = (fr.irisa.triskell.kermeta.language.structure.Property)builder.getModelElementByNode(property);
		if (property.getOppositeName() != null) {
			String opname = getTextForID(property.getOppositeName());
			// the type of such a property must a class which class definition contains a property
			// named opname and which type is current_property.owningClass
			if (!(builder.current_property.getType() instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Unexpected opposite - The type of a property that have an opposite should be a Class.", property.getOppositeName()));
				return false;
			}
			ClassDefinition opposite_class = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)builder.current_property.getType()).getTypeDefinition();
			fr.irisa.triskell.kermeta.language.structure.Property oposite_property = ClassDefinitionHelper.getPropertyByName(opposite_class, opname);
			if (oposite_property == null) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Unable to resolve opposite of property", property.getOppositeName()));
				return false;
			}
			builder.current_property.setOpposite(oposite_property);
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
		
		ClassDefinition objectClass = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();
		if ( objectClass != null) {
		    result.putAll(getSupersForMethodOnObject(objectClass, methname));
		}
		else builder.internalLog.warn("Not able to retreive Object ClassDefinition for operation/method check");
		
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

