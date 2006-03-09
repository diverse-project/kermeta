/* $Id: ConstraintChecker.java,v 1.2 2006-03-09 18:31:48 zdrey Exp $
* Project : Kermeta (First iteration)
* File : ExpressionChecker.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 2005
* Author : Franck Fleurey
* Description :
*     This is visitor for kermeta expressions which
* 		the types of expressions.
* 	  It adds type errors in the KermetaUnit
*     The complete description of the type system can
* 	  	be found in the document KerMeta-TypeSystem.sxw
*     	in project documentation.
*/ 
package fr.irisa.triskell.kermeta.graphicaleditor.utils;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoadError;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This class is a visitor called on a model that checks semantic constraints that
 * we didn't not want to be controlled by graphical constraints.
 * 
 * The following test should be in a short-middle term replaced by OCL expressions 
 */
public class ConstraintChecker extends KermetaOptimizedVisitor {

	public static final String NAME_ERROR = "An element is unnamed";
	/*
	 * Initialization methods
	 */
	
	/** The resource hosting the model that we have to check */
	protected IFile inputFile ;
	
	/**
	 * The KermetaUnit that will be build so that we can constraint check more easily the model
	 * hosted by the resource stored in <code>inputFile</code>.
	 */
	protected KermetaUnit builder;
	
	/**
	 * Constructor
	 * TODO :
	 * - We have to find what is the diagram currently edited. 
	 * - We have to find the model/resource associated with the diagram currently edited.
	 */
	public ConstraintChecker(IFile file)
	{
		inputFile = file;
		builder = createUnit();
	}
	
	public ConstraintChecker(KermetaUnit kunit)
	{
		builder = kunit;
	}
	
	/**
	 * Default Unit creation. Create the kermetaUnit linked to the saved model.km
	 * Called in the constructor.
	 * @return KermetaUnit
	 */
	protected KermetaUnit createUnit() {
		String inputFile_uri = "platform:/resource" + inputFile.getFullPath().toString();
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(inputFile_uri);
		return builder;
	}

	
	/**
	 * The following constraints on the classDefinition are checked :
	 *   - a class definition cannot have twice the same operation name 
	 *   
	 *  A wizard that create special *aliases* for redefined operations (aliases 
	 *  in the kermeta language meaning)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition class_definition) {
		builder.current_class = class_definition;
		return super.visitClassDefinition(class_definition);
	}

	/**
	 * Checked constraints :
	 *   - an operation cannot be defined twice in the same class 
	 *   - redefinition of operation should be invariant (the signature must not change)
	 *   
	 * Origine : fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass3
	 *  no overloading in sub-classes
	 *	super operation shoukd be specified if several are possible (multiple inheritance)
	 *
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visitOperation(Operation operation) {
		builder.current_operation = operation;
		boolean result = false;
		result = new OperationChecker(builder, operation, builder.current_class).check();
		// This condition will be useful if we check the body of operations...
		// If we detected an inconsistency, we don't need to visit further..
		if (result==false) return Boolean.FALSE;
		else return super.visitOperation(operation);
	}

	/**
	 * Checked constraints :
	 *   - A package must have a not empty name.
	 * Package checking does not need a special class yet...
	 * Too small and using of pattern command *Checker is only potential yet...
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPackage(fr.irisa.triskell.kermeta.language.structure.Package)
	 */
	public Object visitPackage(Package node) {
		builder.current_package = node;
		// A package must have a not empty name
		if (node.getName()==null || node.getName().length()==0)
		{
			addError(NAME_ERROR, node);
			return new Boolean(false);
		}
		return super.visitPackage(node);
	}

	/**
	 * Constraint checker :
	 *   - A property must not have a name same as an operation in the class.
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		Boolean result = null;
		System.out.println("VisitProp!!");
		builder.current_property = node;
		result = new Boolean(new PropertyChecker(builder, node, builder.current_class).check());
		if (result == Boolean.TRUE) 
			return super.visitProperty(node);
		
		return result;
	}

	/** A shortcut to add messages on the builder kermeta unit */
	public void addError(String msg, fr.irisa.triskell.kermeta.language.structure.Object node)
	{
		builder.messages.addError(AbstractChecker.ERROR_TYPE + ": " + msg, node);	
	}
	
	
}
