/* $Id: KermetaConstraintChecker.java,v 1.8 2007-06-27 15:28:30 jmottu Exp $
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * Constraint checker 
 * Verifies various contraints on Kermeta models
 */
public class KermetaConstraintChecker extends KermetaOptimizedVisitor{
    
        
    final static public Logger internalLog = LogConfigurationHelper.getLogger("ConstraintChecker");
   
    public static final String NAME_ERROR = "An element is unnamed";
	public static final String CONSTRAINT_ERROR = "The stereotype of a constraint is erroneous";
	public static final String ATPRE_IN_POST_ERROR = "@pre must be contained by a post condition";
	public static final String ATPRE_PROPERTY_PARAMETER_ERROR = "@pre must only be associated to a property or a parameter";

    
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

	public KermetaConstraintChecker()
	{
		messages = new ArrayList();
	}
	
	public KermetaConstraintChecker(KermetaUnit kunit)
	{
		builder = kunit;
	}
	

    /**
     * check all the class definitions 
     * of a kermeta unit
     */
    public void checkUnit() {
        Iterator it = builder.typeDefs.values().iterator();
        // Call the check constraint visitor on it!
        while(it.hasNext()) {
            TypeDefinition td = (TypeDefinition)it.next();
            this.accept(td);
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
		builder.current_class = class_definition;
		return super.visitClassDefinition(class_definition);
	}
		/**
	 * Checked constraints :
	 *   - The stereotype must conform to the right constrained class.
	 * 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	public Object visitConstraint(Constraint node) {
		builder.current_constraint = node;
		Boolean result = false;
		// stereotype = Constraint implies container is a ClassDefinition
		if ((node.getStereotype() == ConstraintType.INV_LITERAL && node.eContainer() instanceof ClassDefinition) ||
				(node.getStereotype()== ConstraintType.PRE_LITERAL && isPre(node)) ||
				(node.getStereotype()== ConstraintType.POST_LITERAL && isPost(node)))
		{
			result = true;
		}else{
			addProblem(CONSTRAINT_ERROR, node);
		}
		//return result;
		return super.visitConstraint(node);
	}
/**
	 * @param node
	 * @return true if the constrained class is an operation and if the node is one pre of this last 
	 */
	private boolean isPre(Constraint node){
		if(node.eContainer() instanceof Operation){
			Iterator it = ((Operation)node.eContainer()).getPre().iterator();
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
			Iterator it = ((Operation)node.eContainer()).getPost().iterator();
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
		builder.current_operation = operation;
		Boolean result = new OperationChecker(builder, operation, builder.current_class).check();
		//return result;
		return super.visitOperation(operation);
	}
	/**
	 * Checked constraints :
	 *   - Only CallFeature contained in postcondition can have isIsAtPre == true.
	 * 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	public Object visitCallFeature(CallFeature node) {
		builder.current_callFeature = node;
		if (node.isIsAtpre() && !isContainerPost(node))
			addProblem(ATPRE_IN_POST_ERROR, node);
		if (node.isIsAtpre() && node.getStaticProperty() == null)
			addProblem(ATPRE_PROPERTY_PARAMETER_ERROR, node);	
		return super.visitCallFeature(node);
	}
	
	/**
	 * Checked constraints :
	 *   - Only CallVariable contained in postcondition can have isIsAtPre == true.
	 * 
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	public Object visitCallVariable(CallVariable node) {
		builder.current_callVariable = node;
		if (node.isIsAtpre()){
			if(!isContainerPost(node)){
				addProblem(ATPRE_IN_POST_ERROR, node);
			}
			
			Operation containerOperation = getContainerOperation(node);
			if(containerOperation == null){
				addProblem(ATPRE_PROPERTY_PARAMETER_ERROR, node);
			}else{
				List<Parameter> parameters = containerOperation.getOwnedParameter();
				boolean paramExist = false;
				for(Parameter currentParameter : parameters){		
					if(currentParameter.getName() == node.getName())
						paramExist = true;
				}
				if(!paramExist){
					addProblem(ATPRE_PROPERTY_PARAMETER_ERROR, node);
				}
			}
		}
			
		if (node.isIsAtpre() && getContainerOperation(node) == null){
			
		}
		return super.visitCallVariable(node);
	}
	
	private Boolean isContainerPost(EObject node) {
		if (node instanceof fr.irisa.triskell.kermeta.language.structure.Package)
			return false;
		
		boolean result = (node.eContainer() instanceof Constraint && ((Constraint)node.eContainer()).getStereotype() == ConstraintType.POST_LITERAL)
							|| (node.eContainer() != null && isContainerPost(node.eContainer()));
		return result;
	}
	
	private Operation getContainerOperation(EObject node) {
		if (node instanceof fr.irisa.triskell.kermeta.language.structure.Package){
			return null;
		}
		
		if(node instanceof fr.irisa.triskell.kermeta.language.structure.Operation){
			return (Operation) node;
		}
		
		return getContainerOperation(node.eContainer());
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
	
	/** A shortcut to get the registered problems in the kermeta unit */
	public List getProblems()
	{
		if (builder == null) return messages;
		else return builder.messages.getAllMessages();
	}
	
	
    
}
