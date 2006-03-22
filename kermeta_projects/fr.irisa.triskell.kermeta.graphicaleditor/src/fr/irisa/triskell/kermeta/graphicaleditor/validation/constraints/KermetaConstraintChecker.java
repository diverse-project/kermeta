/* $Id: KermetaConstraintChecker.java,v 1.1 2006-03-22 16:24:30 zdrey Exp $
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
package fr.irisa.triskell.kermeta.graphicaleditor.validation.constraints;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This class is a visitor called on a model that checks semantic constraints that
 * we didn't not want to be controlled by graphical constraints.
 * 
 * The following test should be in a short-middle term replaced by OCL expressions 
 */
public class KermetaConstraintChecker extends KermetaOptimizedVisitor {

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
	protected Operation current_operation;
	protected ClassDefinition current_class;
	protected Property current_property;
	protected Package current_package;
	
	protected List messages; 

	
	/**
	 * Constructor
	 * TODO :
	 * - We have to find what is the diagram currently edited. 
	 * - We have to find the model/resource associated with the diagram currently edited.
	 */
	public KermetaConstraintChecker(IFile file)
	{
		inputFile = file;
		builder = createUnit();
	}
	
	public KermetaConstraintChecker()
	{
		messages = new ArrayList();
	}
	
	public KermetaConstraintChecker(KermetaUnit kunit)
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
		//current_class = class_definition;
		builder.current_class = class_definition;
		return super.visitClassDefinition(class_definition);
	}

	/**
	 * Constraints:
	 *   - an operation cannot be defined twice in the same class 
	 *   - redefinition of operation should be invariant (the signature must not change)
	 *   - 
	 *   
	 * Origin: fr.irisa.triskell.kermeta.loader.kmt.KMT2KMPass3
	 *  no overloading in sub-classes
	 *	super operation shoukd be specified if several are possible (multiple inheritance)
	 *
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	public Object visitOperation(Operation operation) {
		//current_operation = operation;
		builder.current_operation = operation;
		Boolean result = new OperationChecker(builder, operation, builder.current_class).check();
		// This condition will be useful if we check the body of operations...
		// If we detected an inconsistency, we don't need to visit further..
		return result;
		//return super.visitOperation(operation);
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
		Boolean result = true;
		System.err.println("Visit a package");
		// A package must have a not empty name
		if (node.getName()==null || node.getName().length()==0)
		{
			System.err.println("->");
			addProblem(NAME_ERROR, node);
			result = false;
		}
		return result;
		//return super.visitPackage(node);
	}

	/**
	 * Constraints:
	 *   - A property must not have a same name as an operation in the class.
	 *   - A property that is derived cannot
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		builder.current_property = node;
		Boolean result = new PropertyChecker(builder, node, builder.current_class).check();
		return result;
		//return super.visitProperty(node);
	}

	/** A shortcut to add messages on the builder kermeta unit */
	public void addProblem(String msg, fr.irisa.triskell.kermeta.language.structure.Object node)
	{// have to make a choice
		if (builder!=null)	builder.messages.addError(AbstractChecker.ERROR_TYPE + ": " + msg, node);
		else messages.add(AbstractChecker.ERROR_TYPE + ": " + msg);
	}
	
	
}
