/* $Id: KermetaConstraintChecker.java,v 1.24 2008-05-28 13:37:13 dvojtise Exp $
* Project : Kermeta IO
* File : KermetaConstraintChecker.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 Nov. 2005
* Authors : 
* 	Didier Vojtisek <dvojtise@irisa.fr>
*/ 

package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaConstraintChecker extends KermetaOptimizedVisitor{
    
        
    final static public Log internalLog = LogConfigurationHelper.getLogger("ConstraintChecker");
   
    public static final String NAME_ERROR = "An element is unnamed";
	public static final String CONSTRAINT_ERROR = "The stereotype of a constraint is erroneous";
	public static final String ATPRE_IN_POST_ERROR = "@pre must be contained by a post condition";
	public static final String ATPRE_PROPERTY_ERROR = "@pre must only be associated to a property";
    
	/**
	 * The KermetaUnit that will be build so that we can constraint check more easily the model
	 * hosted by the resource stored in <code>inputFile</code>.
	 */
	protected KermetaUnit builder;
	protected Operation current_operation;
	protected ClassDefinition current_class;
	protected Property current_property;
	protected Package current_package;
	protected Constraint current_constraint;
	protected CallFeature current_callFeature;
	
	protected List messages; 

	/*public KermetaConstraintChecker()
	{
		messages = new ArrayList();
	}*/
	
	public KermetaConstraintChecker(KermetaUnit kunit)
	{
		builder = kunit;
	}
	

    /**
     * check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
    	  	
    	if ( ! builder.isConstraintChecked() ) {
    		builder.lock();
    		new RequireConstraint(builder).check();
    		
    		for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions(builder) )
    			this.accept(td);

    		builder.setConstraintChecked(true);

        	for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(builder) ) {
        		if ( ! importedUnit.isConstraintChecked() && ! importedUnit.isErroneous() ) {
        			KermetaConstraintChecker t = new KermetaConstraintChecker(importedUnit);
        			t.checkUnit();
        		}
        	}
        	builder.unlock();
    	
    	}

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
		current_class = class_definition;
		// check for inheritance cycles
		if ( KermetaModelHelper.ClassDefinition.isSuperTypeOf( current_class, current_class)) {
			builder.error("Cycle in the inheritance tree - The type hierachy of class '" + current_class.getName()+"' is inconsistant.", builder.getNodeByModelElement(current_class));
			return false;
		}
		
		/*
		 * 
		 * Checking the name of type variables.
		 * Type Definitions' name CANNOT be used for type variables.
		 * 
		 */
		for ( TypeVariable tv : class_definition.getTypeParameter() ) {
			if ( builder.getTypeDefinitionByName( tv.getName() ) != null ) {
				String message = "The name of a type variable cannot be a name of type definition.";
				builder.error(message, tv);
			}
		}
		
		return super.visitClassDefinition(class_definition);
	}
		/**
	 * Checked constraints :
	 *   - The stereotype must conform to the right constrained class.
	 * 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	public Object visitConstraint(Constraint node) {
		current_constraint = node;
		//Boolean result = false;
		// stereotype = Constraint implies container is a ClassDefinition
		if ((node.getStereotype() == ConstraintType.INV_LITERAL && node.eContainer() instanceof ClassDefinition) ||
				(node.getStereotype()== ConstraintType.PRE_LITERAL && isPre(node)) ||
				(node.getStereotype()== ConstraintType.POST_LITERAL && isPost(node)))
		{
			//result = true;
		}else{
			addProblem(CONSTRAINT_ERROR, node);
		}
		//return result;
		return super.visitConstraint(node);
	}
/**
	 * @param Constraint node
	 * @return true if the constrained class is an operation and if the node is one pre of this last 
	 */
	private boolean isPre(Constraint node){
		if(node.eContainer() instanceof Operation){
			Iterator<Constraint> it = ((Operation)node.eContainer()).getPre().iterator();
			while(it.hasNext()){
				if(node == it.next())
					return true;
			}
		}
		return false;
	}
	/**
	 * @param node
	 * @return true if the constrained class is an operation and if the node is one post of this last
	 */
	private boolean isPost(Constraint node){
		if(node.eContainer() instanceof Operation){
			Iterator<Constraint> it = ((Operation)node.eContainer()).getPost().iterator();
			while(it.hasNext()){
				if(node == it.next())
					return true;
			}
		}
		return false;
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
		current_operation = operation;
		Boolean result = new OperationChecker(builder, operation, current_class).check();
		//return result;
		return super.visitOperation(operation);
	}
		
	
	/**
	 * Checked constraints :
	 *   - Only CallFeature contained in postcondition can have isIsAtPre == true.
	 *   - Sometimes it is not possible to anticipate the value of a callfeature
	 * 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	public Object visitCallFeature(CallFeature node) {
		current_callFeature = node;
		if (node.isIsAtpre() && !isContainerPost(node))
			addProblem(ATPRE_IN_POST_ERROR, node);
		if (node.isIsAtpre() && node.getStaticProperty() == null)
			addProblem(ATPRE_PROPERTY_ERROR, node);
		
		if (node.isIsAtpre()){
			boolean nodetargetatpre_or_null = true;
			if (node.getTarget() instanceof CallFeature){
				nodetargetatpre_or_null = ((CallFeature)node.getTarget()).isIsAtpre();
			}else if (node.getTarget() instanceof CallVariable){
				nodetargetatpre_or_null = ((CallVariable)node.getTarget()).isIsAtpre();
			}
			if(!nodetargetatpre_or_null){
				addProblem("It is not possible to anticipate the value of '"+((CallExpression)node.getTarget()).getName()+"', you must postfix '"+((CallExpression)node.getTarget()).getName()+"' with @pre, or change your expression.",node);
			}
		}
		return super.visitCallFeature(node);
	}
	
	private Boolean isContainerPost(EObject node) {
		if (node instanceof fr.irisa.triskell.kermeta.language.structure.Package)
			return false;
		
		boolean result = (node.eContainer() instanceof Constraint && ((Constraint)node.eContainer()).getStereotype() == ConstraintType.POST_LITERAL)
							|| (node.eContainer() != null && isContainerPost(node.eContainer()));
		return result;
	}

	/**
	 * Checked constraints :
	 *   - A package must have a not empty name.
	 * Package checking does not need a special class yet...
	 * Too small and using of pattern command *Checker is only potential yet...
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPackage(fr.irisa.triskell.kermeta.language.structure.Package)
	 */
	public Object visitPackage(Package node) {
		current_package = node;
		Boolean result = true;
		// A package must have a not empty name
		if (node.getName()==null || node.getName().length()==0)
		{
			addProblem(NAME_ERROR, node);
			result = false;
		}
		//return result;
		return super.visitPackage(node);
	}

	/**
	 * Constraints:
	 *   - A property must not have a same name as an operation in the class.
	 *   - A property that is derived cannot
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	public Object visitProperty(Property node) {
		current_property = node;
		Boolean result = new PropertyChecker(builder, node, current_class).check();
		return result;
		//return super.visitProperty(node);
	}
	
	/** A shortcut to add messages on the builder kermeta unit */
	public void addProblem(String msg, fr.irisa.triskell.kermeta.language.structure.Object node)
	{// have to make a choice
		if (builder!=null)	builder.error(AbstractChecker.ERROR_TYPE + ": " + msg, node);
		else messages.add(AbstractChecker.ERROR_TYPE + ": " + msg);
	}
	
	/** A shortcut to add messages on the builder kermeta unit */
	public void addWarning(String msg, fr.irisa.triskell.kermeta.language.structure.Object node)
	{// have to make a choice
		if (builder!=null)	builder.warning(AbstractChecker.ERROR_TYPE + ": " + msg, node);
		else messages.add(AbstractChecker.ERROR_TYPE + ": " + msg);
	}
	
	/** A shortcut to get the registered problems in the kermeta unit */
	public List getProblems()
	{
		if (builder == null) return messages;
		else return builder.getMessages();
	}
	
	
    
}
