/* $Id: ExpressionChecker.java,v 1.7 2005-04-26 08:28:06 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : ExpressionChecker.java
* License : GPL
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
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.ast.FSuperCall;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FBooleanLiteral;
import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallSuperOperation;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FConditionnal;
import fr.irisa.triskell.kermeta.behavior.FEmptyExpression;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FIntegerLiteral;
import fr.irisa.triskell.kermeta.behavior.FJavaStaticCall;
import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.behavior.FLoop;
import fr.irisa.triskell.kermeta.behavior.FRaise;
import fr.irisa.triskell.kermeta.behavior.FRescue;
import fr.irisa.triskell.kermeta.behavior.FSelfExpression;
import fr.irisa.triskell.kermeta.behavior.FStringLiteral;
import fr.irisa.triskell.kermeta.behavior.FTypeLiteral;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.behavior.FVoidLiteral;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitWarning;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolLambdaParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolRescueParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ExpressionChecker extends KermetaVisitor {
	
	
    public static Hashtable typeCheckExpression(FExpression expression, KermetaUnit unit, TypeCheckerContext context) {
        ExpressionChecker visitor = new ExpressionChecker(unit, context);
        visitor.accept(expression);
        return visitor.expressionTypes;
    }
	
	
	// The unit to type-check
	protected KermetaUnit unit;
	
	protected TypeCheckerContext context;
	
	/**
	 * Used for type inference on lambda expression parameters
	 */
	protected Type expected_type;
	
	public ExpressionChecker(KermetaUnit unit, TypeCheckerContext context) {
		this.unit = unit;
		expressionTypes = new Hashtable();
		this.context = context;
	}
	
	/**********************************
	 *  RESULT AND EXPORTED INTERFACE
	 **********************************/
	
	// The result of type computation
	// < FExpression, FType >
	protected Hashtable expressionTypes;
	
	/**
	 * Get the type of an expression
	 * @param expression the expression
	 * @return The type of the expression as an FType
	 */
	protected Type getTypeOfExpression(FExpression expression) {
		return (Type)expressionTypes.get(expression);
	}
	
	/**********************************
	 *  UNION TYPING POLICY
	 **********************************/
	
	
	protected Type getUnionType(Type t1, Type t2) {
		UnionType result = new UnionType();
		result.addType(t1);
		result.addType(t2);
		return result;
	}
	
	/**********************************
	 *  TYPE COMPUTATION UTILITIES
	 **********************************/

	
	
	/**
	 * Checks that a call expression matches the function type 
	 * given as parameter and computes its return type.
	 * @param expression
	 * @param func_type
	 * @return
	 */
	protected Type getReturnTypeForParametrizedCallExpression(FCallExpression expression, Type func_type) {
		
		// visit contained expressions
		visitExpressionList(expression.getFParameters());
		
		//FIXME : what if it is not a function type : generate an error ?
		
		Type[] params = func_type.getFunctionTypeLeft().getProductType();
		// check the number of parameters
		if (expression.getFParameters().size() != params.length) {
			unit.error.add(new KMUnitError("TYPE-CHECKER : Wrong number of arguments, expecting "+params.length+" arguments.", expression));
		}
		else {
			// check the types of parameters
			for(int i=0; i<expression.getFParameters().size(); i++) {
				Type provided = getTypeOfExpression((FExpression)expression.getFParameters().get(i));
				if (!provided.isSubTypeOf(params[i])) {
					unit.error.add(new KMUnitError("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+params[i]+", found "+provided+".", (FExpression)expression.getFParameters().get(i)));
				}
			}
		}
		return func_type.getFunctionTypeRight();
	}
	
	protected Type checkOperationCall(CallableOperation op, FCallExpression exp) {
		// Get the type of the operation as a function type
	    Type operation_type = op.getType();
		
	    // The result is the return type of the operation
	    // It can contain type variables that needs to be bound
		Type result = operation_type.getFunctionTypeRight();
		
		// Check number of provided arguments
	    if (op.getOperation().getFOwnedParameter().size() != exp.getFParameters().size()) {
	        unit.error.add(new KMUnitError("TYPE-CHECKER : Wrong number of arguments, expecting "+op.getOperation().getFOwnedParameter().size()+" arguments.", exp));
	        return result;
	    }
		
		// if there is no paramerts the operation type is the return type of the operation.
		// The operation cannot be a generic operation and there are no unbound type variables
	    if (exp.getFParameters().size() == 0) {
		    result = operation_type;
		}
	    else {
	    
		    boolean error = false;
	
		    // It can be a generic operation : Type parameters
		    // actual values has to be infered from parameter types
		    Type[] required_params = operation_type.getFunctionTypeLeft().getProductType();
		    
		   
		    
		    // Try to infer actual types of type variables
		    Hashtable binding = new Hashtable();
		    if (!error) {
			    // get Type of actual parameters
			    for(int i=0; i<exp.getFParameters().size(); i++) {
			        expected_type = new SimpleType(TypeVariableLeastDerivedEnforcer.getBoundType( ((SimpleType)required_params[i]).type));
					Type provided = (Type)this.accept((FExpression)exp.getFParameters().get(i));
					try {
					    //provided = PrimitiveTypeResolver.getResolvedType(provided);
					    provided.inferTypeVariableBinding(((SimpleType)required_params[i]).type, binding);
					}
					catch(TypeDoesNotMatchError e) {
					    unit.error.add(new KMUnitError("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+required_params[i]+", found "+provided+" (TypeDoesNotMatch).", (FExpression)exp.getFParameters().get(i)));
					    error = true;
					}
			    }
		    }
		    
		    // Check that the type of the actual parameter match the types of the formal paramenters
		    if (!error) {
			    // REPLACE AND CHECK
			    for(int i=0; i<exp.getFParameters().size(); i++) {
					Type provided = getTypeOfExpression((FExpression)exp.getFParameters().get(i));
					Type expected = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)required_params[i]).type, binding));
					
					if (!provided.isSubTypeOf(expected)) {
					    unit.error.add(new KMUnitError("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+expected+", found "+provided+".",(FExpression)exp.getFParameters().get(i)));
					    error = true;
					}
			    }
		    }
		    
		    // Replace type variables in the treturn type of the operation
		    if (!error)
		        result = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)result).type, binding));
		    else
		        result = new SimpleType(TypeVariableLeastDerivedEnforcer.getBoundType( ((SimpleType)result).type));
		   
	    }
	    // THE METHOD NEW ON CLASS
	    if (op.getOperation() == TypeCheckerContext.getClassNewOperation()) {
	        if (((FCallFeature)exp).getFTarget() instanceof FTypeLiteral) {
	            result = getTypeFromTypeLiteral((FTypeLiteral)((FCallFeature)exp).getFTarget());
	            // check that it is a concrete class
	            if (((FClass)((SimpleType)result).getType()).getFClassDefinition().isFIsAbstract()) {
	                unit.error.add(new KMUnitError("TYPE-CHECKER : Abstract class "+ result +" should not be instanciated.", (FExpression)exp));
	            }
	        }
	    }
	    
	    // Return result
	    return result;
	}
	
	protected Type checkPropertyCall(CallableProperty prop, FCallExpression exp) {
		if (exp.getFParameters().size() == 0) {
		    return prop.getType();
		}
		else {
		    return getReturnTypeForParametrizedCallExpression(exp, prop.getType());
		}
	}
	
	/**********************************
	 *  VISITOR UTILITIES
	 **********************************/
	
	/**
	 * Visit an Elist of expression and returns the type
	 * of the last expression
	 */
	protected Type visitExpressionList(EList expressions) {
		Type result = TypeCheckerContext.VoidType;
		Iterator it = expressions.iterator();
		while(it.hasNext()) {
			FExpression exp = (FExpression)it.next();
			result = (Type) this.accept(exp);
		}
		return result;
	}
	
	/**********************************
	 *  IMPLEMENTATION OF THE VISITOR
	 **********************************/

	public Object visit(FAssignement expression) {
	    preVisit();
	    
	    // Visit contained expressions
	    this.accept(expression.getFTarget());
	    this.accept(expression.getFValue());
	    
	    // The target of the assignenement cannot have any parameter
	    if (expression.getFTarget().getFParameters().size() != 0) {
	        unit.error.add(new KMUnitError("TYPE-CHECKER : Only variables and properties can be assigned", expression));
	        return TypeCheckerContext.VoidType;
	    }
	    
	    // It should not be a superoperation call
	    if (expression.getFTarget() instanceof FSuperCall) {
	        unit.error.add(new KMUnitError("TYPE-CHECKER : Only variables and properties can be assigned", expression));
	        return TypeCheckerContext.VoidType;
	    }
	    
	    // It should not be an operation call
	    if (expression.getFTarget() instanceof FCallFeature) {
	        FCallFeature fc = (FCallFeature)expression.getFTarget();
	        // Determine the type of the target
			Type target;
			if (fc.getFTarget() != null) target = getTypeOfExpression(fc.getFTarget());
			else target = context.getSelfType();
			// Check if it is an operation
			CallableOperation op = target.getOperationByName(fc.getFName());
			if (op != null) {
			    unit.error.add(new KMUnitError("TYPE-CHECKER : Only variables and properties can be assigned", expression));
			    return TypeCheckerContext.VoidType;
			}
	    }
	    
	    Type targetType = getTypeOfExpression(expression.getFTarget());
	    Type provided_type = getTypeOfExpression(expression.getFValue());
	    
	    if (expression.isFIsCast()) {
	        if (provided_type.isSubTypeOf(targetType)) {
	            unit.error.add(new KMUnitWarning("TYPE-CHECKER : Unecessary cast, it shmoud be a regular assignment", expression));
	            return provided_type;
	        }
	        else if (!targetType.isSubTypeOf(provided_type)) {
	            unit.error.add(new KMUnitError("TYPE-CHECKER : Invalid cast, "+provided_type+" is not a supertype of required type : "+targetType+".", expression));
	            return targetType;
	        }
	        else {
	            return targetType;
	        }
	    }
	    else {
	        if (!provided_type.isSubTypeOf(targetType)) {
	            unit.error.add(new KMUnitError("TYPE-CHECKER : Type mismatch, "+provided_type+" does not conforms to required type : "+targetType+".", expression));
	        }
	        return provided_type;
	    }
	}
	
	public Object visit(FBlock expression) {
	    preVisit();
		Type result = TypeCheckerContext.VoidType;
		// Process contained expressions
		context.pushContext();
		result = visitExpressionList(expression.getFStatement());
		context.popContext();
		//handle rescue blocks
		Iterator it = expression.getFRescueBlock().iterator();
		while (it.hasNext()) {
			FRescue resc = (FRescue)it.next();
			
			// Chech the constraint on multiplicity of exception type
			if (resc.getFExceptionType().getFUpper() != 1) {
				unit.error.add(new KMUnitError("TYPE-CHECKER : The upper multiplicity of the type of object to catch must be 1", resc));
			}
			
			context.pushContext();
			// add the symbol
			context.addSymbol(new KMSymbolRescueParameter(resc), TypeCheckerContext.getTypeFromMultiplicityElement(resc.getFExceptionType()));
			visitExpressionList(resc.getFBody());
			context.popContext();
		}
		// Return the type of the last expression
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FBooleanLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.BooleanType);
		return TypeCheckerContext.BooleanType;
	}
	
	public Object visit(FCallFeature expression) {
	    
		// visit target expression
		if (expression.getFTarget() != null) this.accept(expression.getFTarget());
		
		preVisit();
		// Determine the type of the target
		Type target;
		if (expression.getFTarget() != null) target = getTypeOfExpression(expression.getFTarget());
		else target = context.getSelfType();
		
		Type result = null;
		
		// Is it an operation call
		CallableOperation op = target.getOperationByName(expression.getFName());
		if (op != null) result = checkOperationCall(op, expression);
		else {
			// Is it a property call
			CallableProperty prop = target.getPropertyByName(expression.getFName());
			if (prop != null) result = checkPropertyCall(prop, expression);
		}
		if (result == null) {
		    // The feature was not found
		    unit.error.add(new KMUnitError("TYPE-CHECKER : cannot resolve feature " + expression.getFName() + " in type " + target.toString() + ".",expression));
		    result = TypeCheckerContext.VoidType;
		}
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FCallResult expression) {
	    preVisit();
		
	    Type result = TypeCheckerContext.getTypeFromMultiplicityElement(context.getCurrentOperation());
	    // if there are parameters
		if (expression.getFParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FCallSuperOperation expression) {
	    preVisit();
	    Type result =  checkOperationCall(context.getSuperOperation(), expression);
	    expressionTypes.put(expression, result);
	    return result;
	}
	
	public Object visit(FCallVariable expression) {
	    preVisit();
		// if there is no parameter
		Type result = context.symbolTypeLookup(expression.getFName());
		// Error if symbol not found
		if (result == null) {
			unit.error.add(new KMUnitError("TYPE-CHECKER : cannot resolve symbol " + expression.getFName(), expression));
			 expressionTypes.put(expression, TypeCheckerContext.VoidType);
			return TypeCheckerContext.VoidType;
		}
		// if there are parameters
		if (expression.getFParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		// return result
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FConditionnal expression) {
	    preVisit();
		Type result;
		context.pushContext();
		// Process contained expressions
		this.accept(expression.getFCondition());
		this.accept(expression.getFThenBody());
		if (expression.getFElseBody() != null) this.accept(expression.getFElseBody());
		context.popContext();
		// Check constraints
		if(!getTypeOfExpression(expression.getFCondition()).isSubTypeOf(TypeCheckerContext.BooleanType)) {
			unit.error.add(new KMUnitError("TYPE-CHECKER : The condition expression of a conditional statement should be a Boolean expression", expression.getFCondition()));
		}
		// compute the return type
		if (expression.getFElseBody() != null) {
			result = getUnionType(getTypeOfExpression(expression.getFThenBody()), getTypeOfExpression(expression.getFElseBody()));
		}
		else
			result = getTypeOfExpression(expression.getFThenBody());
		// Return type
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FEmptyExpression expression) {
	    preVisit();
		// Return type
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		return TypeCheckerContext.VoidType;
	}
	
	public Object visit(FIntegerLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.IntegerType);
		return TypeCheckerContext.IntegerType;
	}
	
	public Object visit(FJavaStaticCall expression) {
	    preVisit();
		// visit contained expression
		visitExpressionList(expression.getFParameters());
		// The returned type is Objects
		expressionTypes.put(expression, TypeCheckerContext.ObjectType);
		return TypeCheckerContext.ObjectType;
	}
	
	public Object visit(FLambdaExpression expression) {
	    
	   
	    FProductType result_param = unit.struct_factory.createFProductType();
	    
	    Type[] expected_params = null;
	    if (expected_type != null) {
	        expected_params = expected_type.getFunctionTypeLeft().getProductType();
	   }
	    preVisit();
		context.pushContext();
	    // Find type of lambda parameters and add them to the context
	    for(int i=0;i<expression.getFParameters().size(); i++) {
	        FLambdaParameter param = (FLambdaParameter)expression.getFParameters().get(i);
	        if (param.getFType() == null) {
	            
	            if (expected_params != null && expected_params.length > i) {
	                
	                context.addSymbol(new KMSymbolLambdaParameter(param), expected_params[i]);
	                
	                result_param.getFType().add(((SimpleType)expected_params[i]).type);
	            }
	            
	            else {
	                //context.addSymbol(new KMSymbolLambdaParameter(param), TypeCheckerContext.ObjectType);
	                //result_param.getFType().add(TypeCheckerContext.ObjectType);
	                unit.error.add(new KMUnitError("TYPE-CHECKER : Types of the function does not match required types", expression));
	            }
	            
	        }
	        else {
	            Type t = TypeCheckerContext.getTypeFromMultiplicityElement(param.getFType());
	            context.addSymbol(new KMSymbolLambdaParameter(param), t);
	            result_param.getFType().add(((SimpleType)t).type);
	        }
	    }
	    
	    // check expression
	    Type result_return = (Type)this.accept(expression.getFBody());
	    
	    context.popContext();
	    
	    FFunctionType result = unit.struct_factory.createFFunctionType();
	    // Compute return type
	    if (result_return instanceof SimpleType) {
	        
	        result.setFLeft(result_param);
	        result.setFRight(((SimpleType)result_return).type);
	       
	    }
	    else {
	        // TODO : Complete this method
	        // FIXME : Compute the appropriate union type
	        
	        result.setFLeft(result_param);
	        result.setFRight((((UnionType)result_return).transformAsSimpleType()).type);
	        
	    }
	    Type true_result = new SimpleType(result);
	    expressionTypes.put(expression, true_result);
        return true_result;
	}
	
	public Object visit(FLoop expression) {
	    preVisit();
		context.pushContext();
		// Process contained expressions
		this.accept(expression.getFInitiatization());
		this.accept(expression.getFStopCondition());
		this.accept(expression.getFBody());
		context.popContext();
		// Check constraints
		if(!getTypeOfExpression(expression.getFStopCondition()).isSubTypeOf(TypeCheckerContext.BooleanType)) {
			unit.error.add(new KMUnitError("TYPE-CHECKER : The until expression of a loop statement should be a Boolean expression", expression.getFStopCondition()));
		}
		
		// Return type
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		return TypeCheckerContext.VoidType;
	}
	
	public Object visit(FRaise expression) {
	    preVisit();
		// process contained expression
	    this.accept(expression.getFExpression());
	    // return void
	    expressionTypes.put(expression, TypeCheckerContext.VoidType);
	    return TypeCheckerContext.VoidType;
	}
	
	public Object visit(FSelfExpression expression) {
	    preVisit();
		Type result = context.getSelfType();
		// Return type
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FStringLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.StringType);
		return TypeCheckerContext.StringType;
	}
	
	public Object visit(FTypeLiteral expression) {
	    preVisit();
		Type result;
	    FType type = getTypeFromTypeLiteral(expression).type;
		
		if (!(type instanceof FClass)) {
		    unit.error.add(new KMUnitError("TYPE-CHECKER : Type literal should only refer to classes", expression));
		    result = TypeCheckerContext.VoidType;
		}
		else result = TypeCheckerContext.ClassType;
		
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FVariableDecl expression) {
	    preVisit();
		Type result = TypeCheckerContext.getTypeFromMultiplicityElement(expression.getFType());
		// process contained expressions
		if (expression.getFInitialization() != null) 
			this.accept(expression.getFInitialization());
		
		// Check constraints
		if (expression.getFInitialization() != null) {
			if (!getTypeOfExpression(expression.getFInitialization()).isSubTypeOf(result)) {
				unit.error.add(new KMUnitError("TYPE-CHECKER : The initialization expression should be compatible with the type of the variable : expected "+result+", found "+getTypeOfExpression(expression.getFInitialization())+".", expression.getFInitialization()));
			}
		}
		// Add the variable in the context
		context.addSymbol(new KMSymbolVariable(expression), result);
		
		// Return type
		expressionTypes.put(expression, result);
		return result;
	}
	
	public Object visit(FVoidLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		return TypeCheckerContext.VoidType;
	}
	
	
	protected SimpleType getTypeFromTypeLiteral(FTypeLiteral expression) {
	    Type result;
		
		//FIXME: check that it is realy a class and generate an error othewise
		
		if (expression.getFTyperef().getFUpper() == 1) {
			result = new SimpleType(expression.getFTyperef().getFType());
		}
		else {
			result = TypeCheckerContext.getTypeFromMultiplicityElement(expression.getFTyperef());
		}
		return (SimpleType)result;
	}

	private void preVisit() {
	    expected_type = null;
	}
}
