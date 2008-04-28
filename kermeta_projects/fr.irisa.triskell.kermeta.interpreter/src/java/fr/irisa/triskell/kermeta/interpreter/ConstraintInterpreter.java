/* $Id: ConstraintInterpreter.java,v 1.15 2008-04-28 11:50:55 ftanguy Exp $
 * Project   : kermeta interpreter
 * File      : Extern2CmdCompiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 2006
 * Authors       : 
 *     Jean-Marie Mottu
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.List;

import org.kermeta.interpreter.internal.constraint.CallFeatureConstraintInterpreter;
import org.kermeta.interpreter.internal.constraint.CallVariableConstraintInterpreter;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class ConstraintInterpreter extends ExpressionInterpreter {
	public AtPreVisitor atpreV;

	public ConstraintInterpreter(RuntimeMemory pMemory) {
		super(pMemory);
		atpreV = new AtPreVisitor(pMemory , this);
	}

	@Override
	public void setInterpreterContext(InterpreterContext context) {
		super.setInterpreterContext(context);
		atpreV.interpreterContext = context;
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

		List<Operation> superOps = KermetaModelHelper.Operation.getSuperOperations(node);
		try {
			// Memorise the value of the @pre variables
			for (Object next : node.getPost())
				atpreV.accept((Constraint)next);

			for (Operation superOp : superOps){
				// Memorise the value of the parents' @pre variables
				for (Object next : superOp.getPost())
					atpreV.accept((Constraint)next);

				// TODO : check that parentPre implies Pre
				
				// Check the parents' pre conditions
				for (Object next : superOp.getPre()) {
					interpreterContext.peekCallFrame().pushExpressionContext();
					int size = superOp.getOwnedParameter().size();
					for ( int i=0; i < size; i++ ) {
						RuntimeObject ro = interpreterContext.peekCallFrame().getVariableByName(node.getOwnedParameter().get(i).getName()).getRuntimeObject();
						interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(superOp.getOwnedParameter().get(i).getName(), ro);
					}
					this.accept((Constraint)next);
					interpreterContext.peekCallFrame().popExpressionContext();
				}
				
			}

			// Check the pre conditions
			for (Object next : node.getPre())
				this.accept((Constraint)next);

			// Interpret body
			this.accept(node.getBody());

			// Check the post conditions
			for (Object next : node.getPost())
				this.accept((Constraint)next);

			//TODO : check that post implies parentPost
			for (Operation superOp : superOps) {
				// Check the parents' post conditions
				for (Object next : superOp.getPost()) {
					interpreterContext.peekCallFrame().pushExpressionContext();
					int size = superOp.getOwnedParameter().size();
					for ( int i=0; i < size; i++ ) {
						RuntimeObject ro = interpreterContext.peekCallFrame().getVariableByName(node.getOwnedParameter().get(i).getName()).getRuntimeObject();
						interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(superOp.getOwnedParameter().get(i).getName(), ro);
					}
					this.accept((Constraint)next);
					interpreterContext.peekCallFrame().popExpressionContext();
				}
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
	public Object visitConstraint(Constraint node) {

		// The result returned by the visit
		RuntimeObject result = null;

		Expression constraintBody = node.getBody();

		// Set "cond" as the current statement that will be evaluated in the
		// current expressionContext
		getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(constraintBody);

		// Object should be a Boolean
		RuntimeObject cond_result = (RuntimeObject)this.accept(constraintBody);
		boolean cond_value=true;

		// Get boolean value
		if (RuntimeObject.BOOLEAN_VALUE.equals(cond_result.getPrimitiveType()))
			cond_value = ((Boolean)cond_result.getJavaNativeObject()).booleanValue();
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

	public Object visitCallFeature(CallFeature node) {
		return CallFeatureConstraintInterpreter.doIt(node, this);
	}

	public Object visitCallVariable(CallVariable node) {
		return CallVariableConstraintInterpreter.doIt(node, this);
	}
}