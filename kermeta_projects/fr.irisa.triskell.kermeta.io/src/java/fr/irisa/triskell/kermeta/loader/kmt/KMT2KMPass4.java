/* $Id: KMT2KMPass4.java,v 1.9 2005-11-30 13:49:51 dpollet Exp $
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

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.Property;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;


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
		builder.current_class = (FClassDefinition)builder.getModelElementByNode(classDecl);
		// check for inheritance cycles
		if (builder.isSuperClass(builder.current_class, builder.current_class)) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Cycle in the inheritance tree - The type hierachy of class '"+builder.current_class.getFName()+"' is inconsistant.", classDecl));
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
		builder.current_operation = (FOperation)builder.getModelElementByNode(operation);
		if (builder.findPropertyByName(builder.current_class, builder.current_operation.getFName()) != null) {
			builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :A property named '"+builder.current_operation.getFName()+"' is already inherited by class '"+builder.current_class.getFName()+"'.", operation));
			return false;
		}
		
		EList superclasses = builder.current_class.getFSuperType();
		
		if (operation.getOperationKind().getText().equals("operation")) {
			 // the operation should not have been defined in any super class
			for (int i=0; i<superclasses.size(); i++) {
				FClassDefinition sc = ((FClass)superclasses.get(i)).getFClassDefinition();
				if (builder.findOperationByName(sc, builder.current_operation.getFName()) != null) {
					builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :An operation named '"+builder.current_operation.getFName()+"' is already inherited from class '"+sc.getFName()+"'.", operation));
					return false;
				}
			}
		}
		else if (operation.getOperationKind().getText().equals("method")) {
			// the op should be defined in a superclass
			for (int i=0; i<superclasses.size(); i++) {
				FClassDefinition sc = ((FClass)superclasses.get(i)).getFClassDefinition();
				// potential super ops
				Hashtable superops = getSupersForMethod(builder.current_class, builder.current_operation.getFName());
				if (superops.size() == 0) { // Error, no super operation
					builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :No super operation found for method '"+builder.current_operation.getFName()+"'.", operation));
					return false;
				}
				else if (superops.size() == 1) { // No problem
					String scname = (String)superops.keys().nextElement();
					builder.current_operation.setFSuperOperation((FOperation)superops.get(scname));
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
						FOperation superop = null;
						superop = (FOperation)superops.get(provided_name);
						
						if (superop == null) superop = (FOperation)superops.get(builder.getQualifiedName(builder.rootPackage) + "::" + provided_name);
						
						if (superop == null) {
							Iterator uit = builder.usings.iterator();
							while(uit.hasNext()) {
								superop = (FOperation)superops.get(uit.next() + "::" + provided_name);
								if (superop != null) break;
							}
						}
						
						if (superop != null) { 
							builder.current_operation.setFSuperOperation(superop);
						}
						
						else {
							builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :Wrong super operation selection directive '"+provided_name+"', expecting one of "+possible_selection+".", operation.getSuperSelection()));
							return false;
						}
					}
					else { // error
						builder.messages.addMessage(new KMTUnitLoadError("PASS 4 :Several super operation found for method '"+builder.current_operation.getFName()+"', : "+possible_selection+".", operation));
						return false;
					}
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
		builder.current_property = (FProperty)builder.getModelElementByNode(property);
		if (property.getOppositeName() != null) {
			String opname = getTextForID(property.getOppositeName());
			// the type of such a property must a class which class definition contains a property
			// named opname and which type is current_property.owningClass
			if (!(builder.current_property.getFType() instanceof FClass)) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Unexpected opposite - The type of a property that have an opposite should be a Class.", property.getOppositeName()));
				return false;
			}
			FClassDefinition oposite_class = ((FClass)builder.current_property.getFType()).getFClassDefinition();
			FProperty oposite_property = builder.getPropertyByName(oposite_class, opname);
			if (oposite_property == null) {
				builder.messages.addMessage(new KMTUnitLoadError("PASS 4 : Unable to resolve opposite of property", property.getOppositeName()));
				return false;
			}
			builder.current_property.setFOpposite(oposite_property);
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
	public Hashtable getSupersForMethod(FClassDefinition cls, String methname) {
		Hashtable result = new Hashtable();
		FClassDefinition[] supers = builder.getDirectSuperClasses(cls);
		
		for(int i=0; i<supers.length; i++) {
			FOperation superop = builder.getOperationByName(supers[i], methname);
			if (superop != null)
			{
				result.put(builder.getQualifiedName(supers[i]), superop);
			}
			else 
			{ // search in supertypes of supers[i]
				result.putAll(getSupersForMethod(supers[i], methname));
			}
		}
		
		FClassDefinition objectClass = builder.get_ROOT_TYPE_ClassDefinition();
		
		if ( objectClass != null) {
		    result.putAll(getSupersForMethodOnObject(objectClass, methname));
		}
		
		return result;
	}
	
	private Hashtable getSupersForMethodOnObject(FClassDefinition cls, String methname) {
		Hashtable result = new Hashtable();
		FClassDefinition[] supers = builder.getDirectSuperClasses(cls);
		
		for(int i=0; i<supers.length; i++) {
			FOperation superop = builder.getOperationByName(supers[i], methname);
			if (superop != null)
			{
				result.put(builder.getQualifiedName(supers[i]), superop);
			}
			else 
			{ // search in supertypes of supers[i]
				result.putAll(getSupersForMethodOnObject(supers[i], methname));
			}
		}
		return result;
	}
	
	
}

