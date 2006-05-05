package fr.irisa.triskell.kermeta.interpreter;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class ConstraintInterpreter extends ExpressionInterpreter {
	
	public ConstraintInterpreter(RuntimeMemory pMemory) {
		super(pMemory);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a CallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation node) {
		RuntimeObject result = memory.voidINSTANCE;
		// push expression context
		interpreterContext.peekCallFrame().pushExpressionContext();
		interpreterContext.peekCallFrame().peekExpressionContext().setStatement(node.getBody());
		try {
			
			Iterator itpre = node.getPre().iterator();
			while(itpre.hasNext()){
				this.accept((Constraint)itpre.next());
			}
			
			// Interpret body
			this.accept(node.getBody());
			
			
			Iterator itpost = node.getPost().iterator();
			while(itpost.hasNext()){
				this.accept((Constraint)itpost.next());
			}
			
			// Set the result
			result = interpreterContext.peekCallFrame().getOperationResult();
		}
		finally {
			// Pop the expressionContext
			interpreterContext.peekCallFrame().popExpressionContext();
		}
		return result;
	}
	
	/**
	 * 
	 */
	public Object visitConstraint(Constraint node)
	{
		// System.out.println(node.getName());
		
		// The result returned by the visit
		RuntimeObject result = null;
		// Stops the interpretation.
		if (shouldTerminate()) return result;
		
		Expression constraintBody = node.getBody();
		
		// Set "cond" as the current statement that will be evaluated in the
		// current expressionContext
		getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(constraintBody);
		
		// Object should be a Boolean
		RuntimeObject cond_result = (RuntimeObject)this.accept(constraintBody);
		boolean cond_value=true;
		
		// Get boolean value
		if (cond_result.getData().containsKey("BooleanValue"))
			cond_value = ((Boolean)cond_result.getData().get("BooleanValue")).booleanValue();
		else
		{
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
					"cannot evaluate the constraint",
					this,
					memory,
					constraintBody,
					null);
		}
		
		if (cond_value == false)
		{   
			String message = node.getStereotype().getName()+ " " + node.getName() 
			+ " of operation " + ((Operation)node.eContainer()).getName()
			+ " of class "+ ((Operation)node.eContainer()).getOwningClass().getName()
			+ " violated";
			if(node.getStereotype()==ConstraintType.PRE_LITERAL)
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ConstraintViolatedPre",
						message,
						this,
						memory,
						constraintBody,
						null);
			else
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ConstraintViolatedPost",
						message,
						this,
						memory,
						constraintBody,
						null);        	
		}
		
		return result;
	}
	
}
