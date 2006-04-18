/* $Id: ExpressionChecker.java,v 1.30 2006-04-18 16:23:22 zdrey Exp $
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
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.ast.FSuperCall;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolLambdaParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolRescueParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolVariable;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ExpressionChecker extends KermetaOptimizedVisitor {
	
	
    public static Hashtable typeCheckExpression(Expression expression, KermetaUnit unit, TypeCheckerContext context) {
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
	// < Expression, fr.irisa.triskell.kermeta.language.structure.Type >
	protected Hashtable expressionTypes;
	
	/**
	 * Get the type of an expression
	 * @param expression the expression
	 * @return The type of the expression as an FType
	 */
	protected Type getTypeOfExpression(Expression expression) {
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
	protected Type getReturnTypeForParametrizedCallExpression(CallExpression expression, Type func_type) {
		
		// visit contained expressions
		visitExpressionList(expression.getParameters());
		
		//FIXME : what if it is not a function type : generate an error ?
		
		Type[] params = func_type.getFunctionTypeLeft().getProductType();
		// check the number of parameters
		if (expression.getParameters().size() != params.length) {
			unit.messages.addError("TYPE-CHECKER : Wrong number of arguments, expecting "+params.length+" arguments.", expression);
		}
		else {
			// check the types of parameters
			for(int i=0; i<expression.getParameters().size(); i++) {
				Type provided = getTypeOfExpression((Expression)expression.getParameters().get(i));
				if (!provided.isSubTypeOf(params[i])) {
					unit.messages.addError("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+params[i]+", found "+provided+".", (Expression)expression.getParameters().get(i));
				}
			}
		}
		return func_type.getFunctionTypeRight();
	}
	
	/**
	 * 
	 * @param op
	 * @param exp
	 * @return
	 */
	protected Type checkOperationCall(CallableOperation op, CallExpression exp) {
		// Get the type of the operation as a function type
	    Type operation_type = op.getType();
		
	    // The result is the return type of the operation
	    // It can contain type variables that needs to be bound
		Type result = operation_type.getFunctionTypeRight();
		
		// Check number of provided arguments
	    if (op.getOperation().getOwnedParameter().size() != exp.getParameters().size()) {
	        unit.messages.addError("TYPE-CHECKER : Wrong number of arguments, expecting "+op.getOperation().getOwnedParameter().size()+" arguments.", exp);
	        return result;
	    }
	    
		// if there is no parameters the operation type is the return type of the operation.
		// The operation cannot be a generic operation and there are no unbound type variables
	    if (exp.getParameters().size() == 0) {
		    result = operation_type;
		
	    } else {
	    
		    boolean error = false;
	
		    // It can be a generic operation : Type parameters
		    // actual values has to be infered from parameter types
		    Type[] required_params = operation_type.getFunctionTypeLeft().getProductType();
		    
		    // Try to infer actual types of type variables
		    Hashtable binding = new Hashtable();
	    	if(required_params.length != exp.getParameters().size()){
	    		unit.messages.addError("TYPE-CHECKER : problem with the number of parameters passed to the operation; passed " + exp.getParameters().size() + "; expecting "+required_params.length + "; maybe due to bug #108 ", exp);
			    error = true;
	    	}
		    if (!error) {
			    // get Type of actual parameters
			    for(int i=0; i<exp.getParameters().size(); i++) {
			        //expected_type = new SimpleType(TypeVariableLeastDerivedEnforcer.getBoundType( ((SimpleType)required_params[i]).type));
			        expected_type = (SimpleType)required_params[i];
			        
			        
			        Type provided = (Type)this.accept((Expression)exp.getParameters().get(i));
			        
			        try
			        {
					    //provided = PrimitiveTypeResolver.getResolvedType(provided);
					    provided.inferTypeVariableBinding(((SimpleType)required_params[i]).type, binding);
					}
					catch(TypeDoesNotMatchError e) {
					    unit.messages.addError("TYPE-CHECKER : Type of argument " + i + " mismatch, expecting "+required_params[i]+", found "+provided+" (TypeDoesNotMatch).", (Expression)exp.getParameters().get(i));
					    error = true;
					}
			    }
		    }
		    
		    // Check that the type of the actual parameter match the types of the formal paramenters
		    if (!error) {
			    // REPLACE AND CHECK
			    for(int i=0; i<exp.getParameters().size(); i++) {
					Type provided = getTypeOfExpression((Expression)exp.getParameters().get(i));
					Type expected = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)required_params[i]).type, binding));
					
					if (!provided.isSubTypeOf(expected)) {
					    unit.messages.addError("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+expected+", found "+provided+".",(Expression)exp.getParameters().get(i));
					    error = true;
					}
			    }
		    }
		    
		    if (!error) {
			    exp.getStaticTypeVariableBindings().clear();
			    // store values of type variables in the call expression
			    for(int i=0; i<op.getOperation().getTypeParameter().size(); i++) {
			        exp.getStaticTypeVariableBindings().add(binding.get(op.getOperation().getTypeParameter().get(i)));
			    }
		    }
		    
		    // Replace type variables in the return type of the operation
		    if (!error)
		        result = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)result).type, binding));
		    else
		        result = new SimpleType(TypeVariableLeastDerivedEnforcer.getBoundType( ((SimpleType)result).type));
		   
	    }
	
	    // THE METHOD NEW ON CLASS
	    if (op.getOperation() == TypeCheckerContext.getClassNewOperation()) {
	        if (((CallFeature)exp).getTarget() instanceof TypeLiteral) {
	            result = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget());
	            // check that it is a concrete class
	            if (((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)result).getType()).getTypeDefinition()).isIsAbstract()) {
	                unit.messages.addError("TYPE-CHECKER : Abstract class "+ result +" should not be instanciated.", (Expression)exp);
	            }
	        }
	    }
	    
	    // THE CLONE AND DEEPCLONE OPERATIONS ON CLASS 
	    // FIXME Why the following line doesn't work !!!!
	    // if ( op.getOperation() == TypeCheckerContext.getClassCloneOperation() ) {
	    if ( exp.getName().equals("clone") ||  exp.getName().equals("deepClone") )
	    {
	    	// Check that the parameter is a instance of the type of the target ... A.clone(e:A) : A
	    	if (exp.getParameters().size() == 1 ) {
	    		Type[] required_params = operation_type.getFunctionTypeLeft().getProductType();
	    		
	    		Type provided = getTypeOfExpression((Expression)exp.getParameters().get(0));
				Type expected = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget()) ;
				
				if (!provided.isSubTypeOf(expected)) {
				    unit.messages.addError("TYPE-CHECKER : Type of argument of operation clone must be "+ expected + ".", (Expression)exp.getParameters().get(0));
				}  		
	    		
	    	} else {
	    	    unit.messages.addError("TYPE-CHECKER : Clone operation take only one parameter", (Expression)exp);	    		
	    	}
	    	
	    	 result = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget());
	    	 if (((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)result).getType()).getTypeDefinition()).isIsAbstract()) {
                unit.messages.addError("TYPE-CHECKER : Abstract class instance ("+ result +") should not be cloned.", (Expression)exp);
            }
	    }
	    
	    // Return result
	    return result;
	}
	
	protected Type checkPropertyCall(CallableProperty prop, CallExpression exp) {
		if (exp.getParameters().size() == 0) {
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
			Expression exp = (Expression)it.next();
			result = (Type) this.accept(exp);
		}
		return result;
	}
	
	/**********************************
	 *  IMPLEMENTATION OF THE VISITOR
	 **********************************/

	public Object visitAssignment(Assignment expression) {
	    preVisit();
	    
	    // Visit contained expressions
	    this.accept(expression.getTarget());
	    this.accept(expression.getValue());
	    
	    // The target of the assignenement cannot have any parameter
	    if (expression.getTarget().getParameters().size() != 0) {
	        unit.messages.addError("TYPE-CHECKER : Only variables and properties can be assigned", expression);
	        return TypeCheckerContext.VoidType;
	    }
	    
	    // It should not be a superoperation call
	    if (expression.getTarget() instanceof FSuperCall) {
	        unit.messages.addError("TYPE-CHECKER : Only variables and properties can be assigned", expression);
	        return TypeCheckerContext.VoidType;
	    }
	    
	    // It should not be an operation call
	    if (expression.getTarget() instanceof CallFeature) {
	        CallFeature fc = (CallFeature)expression.getTarget();
	        // Determine the type of the target
			Type target;
			if (fc.getTarget() != null) target = getTypeOfExpression(fc.getTarget());
			else target = context.getSelfType();
			// Check if it is an operation
			CallableOperation op = target.getOperationByName(fc.getName());
			if (op != null) {
			    unit.messages.addError("TYPE-CHECKER : Only variables and properties can be assigned", expression);
			    return TypeCheckerContext.VoidType;
			}
			// Check if it is a property and if this property is derived AND readonly
			CallableProperty prop = target.getPropertyByName(fc.getName());
			if (prop!=null && prop.getProperty().isIsReadOnly())
			{
				unit.messages.addError("TYPE-CHECKER : '"+ fc.getName() + "' property is readonly. You can't assign it.", expression);
				return TypeCheckerContext.VoidType;
				
			}
	    }
	    
	    Type targetType = getTypeOfExpression(expression.getTarget());
	    Type provided_type = getTypeOfExpression(expression.getValue());
	    
	    if (expression.isIsCast()) {
	        
	        // Allow casting ennumeration literals in Enum values
	        if (targetType.getFType() instanceof Enumeration && provided_type.isSubTypeOf(TypeCheckerContext.EnumLitType) ) {
	            return targetType;
	        }
	        
	        if (provided_type.isSubTypeOf(targetType)) {
	            unit.messages.addWarning("TYPE-CHECKER : Unnecessary cast, it should be a regular assignment", expression);
	            return provided_type;
	        }
	        else if (!targetType.isSubTypeOf(provided_type)) {
	            unit.messages.addError("TYPE-CHECKER : Invalid cast, "+provided_type+" is not a supertype of required type : "+targetType+".", expression);
	            return targetType;
	        }
	        else {
	        	expressionTypes.put(expression, targetType);
	    		expression.setStaticType(targetType.getFType());
	            return targetType;
	        }
	    }
	    else {
	        if (!provided_type.isSubTypeOf(targetType)) {
	            unit.messages.addError("TYPE-CHECKER : Type mismatch, "+provided_type+" does not conforms to required type : "+targetType+".", expression);
	        }
	        expressionTypes.put(expression, provided_type);
    		expression.setStaticType(provided_type.getFType());
	        return provided_type;
	    }
	}
	
	public Object visitBlock(Block expression) {
	    preVisit();
		Type result = TypeCheckerContext.VoidType;
		// Process contained expressions
		context.pushContext();
		result = visitExpressionList(expression.getStatement());
		context.popContext();
		//handle rescue blocks
		Iterator it = expression.getRescueBlock().iterator();
		while (it.hasNext()) {
			Rescue resc = (Rescue)it.next();
			
			// Chech the constraint on multiplicity of exception type
			if (resc.getExceptionType() != null && resc.getExceptionType().getUpper() != 1) {
				unit.messages.addError("TYPE-CHECKER : The upper multiplicity of the type of object to catch must be 1", resc);
			}
			
			context.pushContext();
			// add the symbol
			if (resc.getExceptionType() != null)
			    context.addSymbol(new KMSymbolRescueParameter(resc), TypeCheckerContext.getTypeFromMultiplicityElement(resc.getExceptionType()));
			visitExpressionList(resc.getBody());
			context.popContext();
		}
		// Return the type of the last expression
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitBooleanLiteral(BooleanLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.BooleanType);
		expression.setStaticType(TypeCheckerContext.BooleanType.getFType());
		return TypeCheckerContext.BooleanType;
	}
	
	public Object visitCallValue(CallValue expression) {
	    preVisit();
	    Type result = null;
	    // Get the type of the callValue
	    if (!(context.getCurrentCallable() instanceof Property) ||
	         !((Property)context.getCurrentCallable()).isIsDerived())
	    {
	        unit.messages.addError("TYPE-CHECKER : 'value' symbol is forbidden outside derived property", expression);
	    }
        result = TypeCheckerContext.getTypeFromMultiplicityElement(context.getCurrentCallable());
	    expressionTypes.put(expression, result);
        expression.setStaticType(result.getFType());
	    return result;
	}
	
	public Object visitCallFeature(CallFeature expression) {
	    
		// visit target expression
		if (expression.getTarget() != null) this.accept(expression.getTarget());
		
		preVisit();
		
		//The ennumeration if it is a enum lietral call
		Enumeration e = null;
		
		// Determine the type of the target
		Type target;
		if (expression.getTarget() != null) {
			target = getTypeOfExpression(expression.getTarget());
			if (expression.getTarget() instanceof TypeLiteral) {
				TypeLiteral tl = (TypeLiteral)expression.getTarget();
				fr.irisa.triskell.kermeta.language.structure.Type tlt = getTypeFromTypeLiteral(tl).type;
				if (tlt instanceof Enumeration) {
					e = (Enumeration)tlt;
				}
			}
			
		}
		else target = context.getSelfType();
		
		Type result = null;
		
		// It is a call to an enum literal
		if(e != null) {
			EnumerationLiteral lit = null;
			Iterator it = e.getOwnedLiteral().iterator();
			while (it.hasNext() && lit == null) {
				EnumerationLiteral l = (EnumerationLiteral)it.next();
				if (l.getName().equals(expression.getName())) lit = l;
			}
			if (lit != null) {
			    expression.setStaticEnumLiteral(lit);
				result = new SimpleType(e);
			}
		}
		
		if (result == null) {
		    
		    // It the target type is an ennumeration, the object should be an enumeration literal
		    if (expression.getTarget() != null && target.getFType() instanceof Enumeration) {
		        target = TypeCheckerContext.EnumLitType;
		    }
		    
			// Is it an operation call
			CallableOperation op = target.getOperationByName(expression.getName());
			if (op != null) {
				result = checkOperationCall(op, expression);
				expression.setStaticOperation(op.getOperation());
			}
			else {
				// Is it a property call
				CallableProperty prop = target.getPropertyByName(expression.getName());
				if (prop != null) { 
					result = checkPropertyCall(prop, expression);
					expression.setStaticProperty(prop.getProperty());
				}
			}
			
			if (result == null) {
			    // The feature was not found
			    if (e != null)
			        unit.messages.addError("TYPE-CHECKER : cannot resolve enumeration literal " + expression.getName() + " in enumetation " + e.getName() + ".",expression);
			    else
			        unit.messages.addError("TYPE-CHECKER : cannot resolve feature " + expression.getName() + " in type " + target.toString() + ".",expression);
			    result = TypeCheckerContext.VoidType;
			}
		}
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitCallResult(CallResult expression) {
	    preVisit();
	    
	    if (context.getCurrentCallable() == null) {
	    	// cannot call result here
	    	unit.messages.addError("TYPE-CHECKER : invalid use of result", expression);
	    	return TypeCheckerContext.VoidType;
	    }
	    
		// ele
	    Type result = TypeCheckerContext.getTypeFromMultiplicityElement(context.getCurrentCallable());
	    // if there are parameters
		if (expression.getParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitCallSuperOperation(CallSuperOperation expression) {
	    preVisit();
	    // If user called "super" in an operation that has no super operation
	    Type result = TypeCheckerContext.VoidType;
	    if (context.getSuperOperation() == null)
	    {
	    	unit.messages.addError("TYPE-CHECKER : the call of super is illegal in operation '" + context.getCurrentCallable().getName() + "' which is not a redefined one", expression);
	    }
	    else
	    {
	    	result =  checkOperationCall(context.getSuperOperation(), expression);
	    	expressionTypes.put(expression, result);
	    	expression.setStaticType(result.getFType());
	    }
	    return result;
	}
	
	public Object visitCallVariable(CallVariable expression) {
	    preVisit();
		// if there is no parameter
		Type result = context.symbolTypeLookup(expression.getName());
		// Error if symbol not found
		if (result == null) {
			unit.messages.addError("TYPE-CHECKER : cannot resolve symbol " + expression.getName(), expression);
			 expressionTypes.put(expression, TypeCheckerContext.VoidType);
			 expression.setStaticType(TypeCheckerContext.VoidType.getFType());
			return TypeCheckerContext.VoidType;
		}
		// if there are parameters
		if (expression.getParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		// return result
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitConditional(Conditional expression) {
	    preVisit();
		Type result;
		context.pushContext();
		// Process contained expressions
		this.accept(expression.getCondition());
		this.accept(expression.getThenBody());
		if (expression.getElseBody() != null) this.accept(expression.getElseBody());
		context.popContext();
		// Check constraints
		if(!getTypeOfExpression(expression.getCondition()).isSubTypeOf(TypeCheckerContext.BooleanType)) {
			unit.messages.addError("TYPE-CHECKER : The condition expression of a conditional statement should be a Boolean expression", expression.getCondition());
		}
		// compute the return type
		if (expression.getElseBody() != null) {
			result = getUnionType(getTypeOfExpression(expression.getThenBody()), getTypeOfExpression(expression.getElseBody()));
		}
		else
			result = getTypeOfExpression(expression.getThenBody());
		// Return type
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitEmptyExpression(EmptyExpression expression) {
	    preVisit();
		// Return type
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		expression.setStaticType(TypeCheckerContext.VoidType.getFType());
		return TypeCheckerContext.VoidType;
	}
	
	public Object visitIntegerLiteral(IntegerLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.IntegerType);
		expression.setStaticType(TypeCheckerContext.IntegerType.getFType());
		return TypeCheckerContext.IntegerType;
	}
	
	public Object visitJavaStaticCall(JavaStaticCall expression) {
	    preVisit();
		// visit contained expression
		visitExpressionList(expression.getParameters());
		// The returned type is Objects
		expressionTypes.put(expression, TypeCheckerContext.ObjectType);
		expression.setStaticType(TypeCheckerContext.ObjectType.getFType());
		return TypeCheckerContext.ObjectType;
	}
	
	public Object visitLambdaExpression(LambdaExpression expression) {
	    
	   
	    ProductType result_param = unit.struct_factory.createProductType();
	    
	    Type[] expected_params = null;
	    if (expected_type != null) {
	        expected_params = expected_type.getFunctionTypeLeft().getProductType();
	   }
	    preVisit();
		context.pushContext();
	    // Find type of lambda parameters and add them to the context
	    for(int i=0;i<expression.getParameters().size(); i++) {
	        LambdaParameter param = (LambdaParameter)expression.getParameters().get(i);
	        if (param.getType() == null) {
	            
	            if (expected_params != null && expected_params.length > i) {
	                
	                context.addSymbol(new KMSymbolLambdaParameter(param), expected_params[i]);
	                
	                result_param.getType().add(((SimpleType)expected_params[i]).type);
	            }
	            
	            else {
	                //context.addSymbol(new KMSymbolLambdaParameter(param), TypeCheckerContext.ObjectType);
	                //result_param.getFType().add(TypeCheckerContext.ObjectType);
	                unit.messages.addError("TYPE-CHECKER : Types of the function does not match required types", expression);
	            }
	            
	        }
	        else {
	            Type t = TypeCheckerContext.getTypeFromMultiplicityElement(param.getType());
	            context.addSymbol(new KMSymbolLambdaParameter(param), t);
	            result_param.getType().add(((SimpleType)t).type);
	        }
	    }
	    
	    // check expression
	    Type result_return = (Type)this.accept(expression.getBody());
	    
	    context.popContext();
	    
	    FunctionType result = unit.struct_factory.createFunctionType();
	    // Compute return type
	    if (result_return instanceof SimpleType) {
	        
	        result.setLeft(result_param);
	        result.setRight(((SimpleType)result_return).type);
	       
	    }
	    else {
	        // TODO : Complete this method
	        // FIXME : Compute the appropriate union type
	        
	        result.setLeft(result_param);
	        result.setRight((((UnionType)result_return).transformAsSimpleType()).type);
	        
	    }
	    Type true_result = new SimpleType(result);
	    expressionTypes.put(expression, true_result);
	    expression.setStaticType(true_result.getFType());
        return true_result;
	}
	
	public Object visitLoop(Loop expression) {
	    preVisit();
		context.pushContext();
		// Process contained expressions
		this.accept(expression.getInitialization());
		this.accept(expression.getStopCondition());
		this.accept(expression.getBody());
		context.popContext();
		// Check constraints
		if(!getTypeOfExpression(expression.getStopCondition()).isSubTypeOf(TypeCheckerContext.BooleanType)) {
			unit.messages.addError("TYPE-CHECKER : The until expression of a loop statement should be a Boolean expression", expression.getStopCondition());
		}
		
		// Return type
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		expression.setStaticType(TypeCheckerContext.VoidType.getFType());
		return TypeCheckerContext.VoidType;
	}
	
	public Object visitRaise(Raise expression) {
	    preVisit();
		// process contained expression
	    this.accept(expression.getExpression());
	    // return void
	    expressionTypes.put(expression, TypeCheckerContext.VoidType);
	    expression.setStaticType(TypeCheckerContext.VoidType.getFType());
	    return TypeCheckerContext.VoidType;
	}
	
	public Object visitSelfExpression(SelfExpression expression) {
	    preVisit();
		Type result = context.getSelfType();
		// Return type
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitStringLiteral(StringLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.StringType);
		expression.setStaticType(TypeCheckerContext.StringType.getFType());
		return TypeCheckerContext.StringType;
	}
	
	public Object visitTypeLiteral(TypeLiteral expression) {
	    preVisit();
		Type result;
	    fr.irisa.triskell.kermeta.language.structure.Type type = getTypeFromTypeLiteral(expression).type;
		
	    if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
	    	result = TypeCheckerContext.ClassType;
	    }
	    else if (type instanceof Enumeration){
	    	result = TypeCheckerContext.EnumType;
	    }
	    else {
	    	unit.messages.addError("TYPE-CHECKER : Type literal should only refer to classes or ennumerations", expression);
		    result = TypeCheckerContext.VoidType;
	    }
		
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitVariableDecl(VariableDecl expression) {
	    preVisit();
		Type result = TypeCheckerContext.getTypeFromMultiplicityElement(expression.getType());
		// process contained expressions
		if (expression.getInitialization() != null) 
			this.accept(expression.getInitialization());
		
		// Check constraints
		if (expression.getInitialization() != null) {
			if (!getTypeOfExpression(expression.getInitialization()).isSubTypeOf(result)) {
				unit.messages.addError("TYPE-CHECKER : The initialization expression should be compatible with the type of the variable : expected "+result+", found "+getTypeOfExpression(expression.getInitialization())+".", expression.getInitialization());
			}
		}
		
		KMSymbol symbol = context.symbolLookup(expression.getIdentifier());
		if (symbol!=null && symbol instanceof KMSymbolVariable)
		{
		    unit.messages.addError("TYPE-CHECKER : Variable '"+expression.getIdentifier()+"' is already declared somewhere above.", expression);
		}
		else
		{
		    // Add the variable in the context
		    context.addSymbol(new KMSymbolVariable(expression), result);
		}
		
		// Return type
		expressionTypes.put(expression, result);
		expression.setStaticType(result.getFType());
		return result;
	}
	
	public Object visitVoidLiteral(VoidLiteral expression) {
	    preVisit();
		expressionTypes.put(expression, TypeCheckerContext.VoidType);
		expression.setStaticType(TypeCheckerContext.VoidType.getFType());
		return TypeCheckerContext.VoidType;
	}
	
	
	protected SimpleType getTypeFromTypeLiteral(TypeLiteral expression) {
	    Type result;
		
		//FIXME: check that it is realy a class and generate an error othewise
		
		if (expression.getTyperef().getUpper() == 1) {
			result = new SimpleType(expression.getTyperef().getType());
		}
		else {
			result = TypeCheckerContext.getTypeFromMultiplicityElement(expression.getTyperef());
		}
		return (SimpleType)result;
	}

	private void preVisit() {
	    expected_type = null;
	}
}
