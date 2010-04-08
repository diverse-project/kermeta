/* $Id: ExpressionChecker.java,v 1.68 2008-06-17 06:59:57 bmorin Exp $
* Project : Kermeta (First iteration)
* File : ExpressionChecker.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 mars 2005
* Authors : 
* 		Franck Fleurey
* 		Francois Tanguy
* 		Didier Vojtisek
* 		Jim Steel
* 		Zo� Drey
*/ 
package fr.irisa.triskell.kermeta.typechecker;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;

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
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolLambdaParameter;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolRescueParameter;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbolVariable;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.FSuperCall;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 *     This is visitor for kermeta expressions which
 * 		the types of expressions.
 * 	  It adds type errors in the KermetaUnit
 *     The complete description of the type system can
 * 	  	be found in the document KerMeta-TypeSystem.sxw
 *     	in project documentation.
 */
public class ExpressionChecker extends KermetaOptimizedVisitor {
	
	
    public static Hashtable<Expression, Type> typeCheckExpression(Expression expression, KermetaUnit unit, TypeCheckerContext context) {
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
		expressionTypes = new Hashtable<Expression, Type>();
		this.context = context;
	}


	
	/**********************************
	 *  RESULT AND EXPORTED INTERFACE
	 **********************************/
	
	// The result of type computation
	// < Expression, fr.irisa.triskell.kermeta.language.structure.Type >
	protected Hashtable<Expression, Type> expressionTypes;
	
	protected void setType(Expression expression, Type type) {
		expression.setStaticType( type.getFType() );
		expressionTypes.put(expression, type);
		
		if ( type instanceof SimpleType ) {
			if ( type.getFType() != null )
				if ( type.getFType().eContainer() == null )
					expression.getContainedType().add( type.getFType() );
		}
	}
	
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
		UnionType result = new UnionType(context);
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
			unit.error("TYPE-CHECKER : Wrong number of arguments, expecting "+params.length+" arguments.", expression);
		}
		else {
			// check the types of parameters
			for(int i=0; i<expression.getParameters().size(); i++) {
				Type provided = getTypeOfExpression((Expression)expression.getParameters().get(i));
				if (!provided.isSubTypeOf(params[i])) {
					unit.error("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+params[i]+", found "+provided+".", (Expression)expression.getParameters().get(i));
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
	    Type operation_type = op.getType(exp);
	    
	    // The result is the return type of the operation
	    // It can contain type variables that needs to be bound
		Type result = operation_type.getFunctionTypeRight();
		
		//If the destination is a virtual type, we need to do a deep replacement of
		//all class types with corresponding virtual types, creating them where necessary
		if (exp instanceof CallFeature) {
			// To avoid CallSuperOperations, which don't need to be virtualized
			if ( (((CallFeature)exp).getTarget() != null) && getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof VirtualType) {
				operation_type = TypeVirtualizer.virtualizeOperationType(op, (VirtualType) getTypeOfExpression(((CallFeature)exp).getTarget()).getFType(), context);
				result = operation_type.getFunctionTypeRight();
			}
		}
		
		// Check number of provided arguments
	    if (op.getOperation().getOwnedParameter().size() != exp.getParameters().size()) {
	        unit.error("TYPE-CHECKER : Wrong number of arguments, expecting "+op.getOperation().getOwnedParameter().size()+" arguments.", exp);
	        return result;
	    }
	    
		// if there are no parameters the operation type is the return type of the operation.
		// The operation cannot be a generic operation and there are no unbound type variables
	    if (exp.getParameters().size() == 0) {
		    result = operation_type;
		
	    } else {

		    boolean error = false;

		    // It can be a generic operation : Type parameters
		    // actual values have to be inferred from parameter types
		    Type[] required_params = operation_type.getFunctionTypeLeft().getProductType();
		    
		    // Try to infer actual types of type variables
		    Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type> binding = new Hashtable<TypeVariable,fr.irisa.triskell.kermeta.language.structure.Type>();
	    	if ( required_params.length != exp.getParameters().size() ) {
	    		unit.error("TYPE-CHECKER : problem with the number of parameters passed to the operation; passed " + exp.getParameters().size() + "; expecting "+required_params.length + "; maybe due to bug #108 ");
	    		 error = true;
	    	}
	    		    	
		    if (!error) {
			    // get Type of actual parameters
			    for(int i=0; i<exp.getParameters().size(); i++) {
			        expected_type = (SimpleType)required_params[i];
			        Type provided = (Type)this.accept((Expression)exp.getParameters().get(i));
			        try {
					    provided.inferTypeVariableBinding(((SimpleType)required_params[i]).type, binding);
					} catch(TypeDoesNotMatchError e) {
					    unit.error("TYPE-CHECKER : Type of argument " + i + " mismatch, expecting "+required_params[i]+", found "+provided+" (TypeDoesNotMatch).", (Expression)exp.getParameters().get(i));
					    error = true;
					} catch (Exception e) {
						IOPlugin.internalLog.warn("Exception received", e);
					}
			    }
		    }

		    // Check that the type of the actual parameter matches the types of the formal parameters
		    if (!error) {
			    // REPLACE AND CHECK
			    for(int i=0; i<exp.getParameters().size(); i++) {
					Type provided = getTypeOfExpression((Expression)exp.getParameters().get(i));
					Type expected = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)required_params[i]).type, binding), context);
					if (!provided.isSubTypeOf(expected)) {
						new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)required_params[i]).type, binding), context);
						provided.isSubTypeOf(expected);
						unit.error("TYPE-CHECKER : Type of argument "+i+" mismatch, expecting "+expected+", found "+provided+".",(Expression)exp.getParameters().get(i));
					    error = true;
					}
			    }
		    }
		    
		    if ( ! error ) {
			    exp.getStaticTypeVariableBindings().clear();
			    // store values of type variables in the call expression
			    for(int i=0; i<op.getOperation().getTypeParameter().size(); i++) {
			    	// Need to create new TypeVariableBindings
			    	
			    	TypeVariable typeVariable = op.getOperation().getTypeParameter().get(i);
			    	fr.irisa.triskell.kermeta.language.structure.Type typeBinding = (fr.irisa.triskell.kermeta.language.structure.Type) binding.get( typeVariable );
			    	
			    	TypeVariableBinding tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
			    	tvb.setVariable((TypeVariable) op.getOperation().getTypeParameter().get(i));
			    	tvb.setType( typeBinding );
			    	// Jim: If parameterized virtual type bindings were possible on operation calls, then staticTypeVariableBindings would be
			    	// TypeVariableBindings instead of just types, and the following line would add tvb instead.
			    	if ( typeBinding != null )
			    		exp.getStaticTypeVariableBindings().add((fr.irisa.triskell.kermeta.language.structure.Type) binding.get(op.getOperation().getTypeParameter().get(i)));
			    	else {
			    		String message = "TYPE-CHECKER : Binding not found for " + typeVariable.getName();
			    		unit.error(message, exp);
			    		error = true;
			    	}
			    }
		    }
		    
		    // Replace type variables in the return type of the operation
		    if ( ! error )
		        result = new SimpleType(TypeVariableEnforcer.getBoundType( ((SimpleType)result).type, binding), context);
		    else
		        result = new SimpleType(new TypeVariableLeastDerivedEnforcer(context).getBoundType( ((SimpleType)result).type), context);
		
	    }
	    
	    if ( context.specialOperations.contains( op.getOperation() ) )
	    	result = processSpecialOperations(result, op, exp);
	    
	    // Return result
	    return result;
	}
	
	private Type processSpecialOperations(Type t, CallableOperation op, CallExpression exp) {
		Type result = t;
	    // THE METHOD ISTYPE ON OBJECT (The OCL like cast)
	    if (op.getOperation() == context.getObjectAsTypeOperation() ) {
	    	// the operation has one Class parameter; 
	    	// if this parameter is a TypeLitteral then the return type of the operation corresponds to that type litteral
	    	Expression asType_param = (Expression)exp.getParameters().get(0);
	    	if (asType_param instanceof TypeLiteral)
	    		result = getTypeFromTypeLiteral((TypeLiteral)asType_param);
	    }
	
	    // THE METHOD NEW ON CLASS
	    if (op.getOperation() == context.getClassNewOperation()) {
	        if (((CallFeature)exp).getTarget() instanceof TypeLiteral) {
	            result = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget());
	            // check that it is a concrete class (if the literal is in fact a class. If its a type variable, we're ok)
	            if (((SimpleType)result).getType() instanceof Class) {
	            	Class c = (Class) ( (SimpleType)result ).getType();
	            	if ( ((ClassDefinition)c.getTypeDefinition()).isIsAbstract() )
	            		unit.error("TYPE-CHECKER : abstract class "+ result +" should not be instanciated.", (Expression)exp);
	            }
	        }
	    }
	    
	    // THE OPERATION NEW ON MODELTYPE
	    if ((op.getOperation() == context.getModelTypeNewOperation())
	    		|| (op.getOperation() == context.getModelTypeVariableNewOperation())
	    		|| (op.getOperation() == context.getObjectTypeVariableNewOperation())) {
	    	if (((CallFeature)exp).getTarget() instanceof TypeLiteral) {
	    		result = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget());
	    	}
	    }
	    
	    // THE CLONE AND DEEPCLONE OPERATIONS ON CLASS 
	    // FIXME Why the following line doesn't work !!!!
	    if ( op.getOperation() == context.getClassCloneOperation() ) {
	    	if (((CallFeature)exp).getTarget() instanceof TypeLiteral) {
	    	// Check that the parameter is a instance of the type of the target ... A.clone(e:A) : A
		    	if (exp.getParameters().size() == 1 ) {
		    		//Type[] required_params = operation_type.getFunctionTypeLeft().getProductType();
		    		
		    		Type provided = getTypeOfExpression((Expression)exp.getParameters().get(0));
					Type expected = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget()) ;
					
					if (!provided.isSubTypeOf(expected)) {
					    unit.error("TYPE-CHECKER : Type of argument of operation clone must be "+ expected + ".", (Expression)exp.getParameters().get(0));
					}  		
		    		
		    	} else {
		    	    unit.error("TYPE-CHECKER : Clone operation takes only one parameter", (Expression)exp);	    		
		    	}
		    	
		    	result = getTypeFromTypeLiteral((TypeLiteral)((CallFeature)exp).getTarget());
	
/*		    	if ( ((SimpleType)result).getType() instanceof ObjectTypeVariable ) {
					
				} else*/ if ( ((SimpleType)result).getType() instanceof Class ) {
			    	if (((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)result).getType()).getTypeDefinition()).isIsAbstract()) {
		                unit.error("TYPE-CHECKER : Abstract class instance ("+ result +") should not be cloned.", (Expression)exp);
		            }					
				}
	
	    	} else {
	    		unit.error("TYPE-CHECKER : clone() may only be called on a type literal.", exp);
	    	}
	    }
	    
	    // THE FILTER OPERATION ON MODEL
	    if (op.getOperation() == context.getModelFilterOperation()) {
	    	//Can only filter on one of the classes belonging to the model type or virtual types belonging to the model type variable
	    	if (exp.getParameters().size() == 1) {
	    		if (exp.getParameters().get(0) instanceof TypeLiteral) {
	    			Type provided = getTypeFromTypeLiteral((TypeLiteral) exp.getParameters().get(0));
	    			if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelType ) {
	    				if (!(provided.getFType() instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
	    					unit.error("TYPE-CHECKER : The model '" + ((CallFeature)exp).getTarget() + "' may only be filtered by a class present in its type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "', not by '" + provided + "'.", exp);
	    				} else {
		    				ModelType targetTypeDef = (ModelType) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType();
		    				if ( !targetTypeDef.getIncludedTypeDefinition().contains(((fr.irisa.triskell.kermeta.language.structure.Class)provided.getFType()).getTypeDefinition()) ) {
		    					unit.error("TYPE-CHECKER : The model '" + ((CallFeature)exp).getTarget() + "' may only be filtered by a class present in its type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "', not by '" + provided + "'.", exp);
		    				}
	    				}
	    			} else if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelTypeVariable ) {
	    				if (!(provided.getFType() instanceof VirtualType)) {
	    					unit.error("TYPE-CHECKER : The model '" + ((CallFeature)exp).getTarget() + "' may only be filtered by a virtual type present in its type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "', not by '" + provided + "'.", exp);
	    				} else {
	    					ModelTypeVariable targetType = (ModelTypeVariable) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType();
	    					//Assume that the virtual type has been created
	    					if ( !targetType.getVirtualType().contains(provided.getFType())) {
		    					unit.error("TYPE-CHECKER : The model '" + ((CallFeature)exp).getTarget() + "' may only be filtered by a virtual type present in its type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "', not by '" + provided + "'.", exp);	    						
	    					}
	    				}
	    			}
			    	// The return type is a set of the parameter, so long as the parameter was a literal.
		    		result = context.getSetType(provided.getFType());
	    		}

	    	} else {
	    	    unit.error("TYPE-CHECKER : Filter operation takes only one parameter", (Expression)exp);
	    	}
	    	
	    }
	    
	    //The add operation on Model
	    if (op.getOperation() == context.getModelAddOperation()) {
	    	// The type of the parameter must be a subtype of one of the types contained by the model-type of the receiver
	    	if (exp.getParameters().size() == 1) {
	    		Type provided = getTypeOfExpression((Expression) exp.getParameters().get(0));
    			if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelType ) {
    	    		Boolean foundType = false;
    	    		Iterator<fr.irisa.triskell.kermeta.language.structure.Class> classes = TypeMatchChecker.getContainedTypes((ModelType) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType()).iterator();
    				while (!foundType && classes.hasNext()) {
    					fr.irisa.triskell.kermeta.language.structure.Class cls = (fr.irisa.triskell.kermeta.language.structure.Class) classes.next();
    					if (provided.isSubTypeOf(new SimpleType(cls, context))) {
    						foundType = true;
    					}
    				}
    				if (!foundType) {
    					unit.error("Unable to add object of type '" + provided + "' to model of type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "'.", exp);
    				}
    			} else if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelTypeVariable ) {
    				//VirtualTypes, for the moment, are monomorphic
    				ModelTypeVariable mtv = (ModelTypeVariable) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType();
    				if (!mtv.getVirtualType().contains(provided.getFType())) {
    					unit.error("Unable to add object of type '" + provided + "' to model of type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "'.", exp);
    				}
    			}
	    	} else {
	    	    unit.error("TYPE-CHECKER : Add operation takes only one parameter", (Expression)exp);
	    	}
	    }
	    
	    //The remove operation on Model
	    if (op.getOperation() == context.getModelRemoveOperation()) {
	    	// The type of the parameter must be a subtype of one of the types contained by the model-type of the receiver
	    	if (exp.getParameters().size() == 1) {
	    		Type provided = getTypeOfExpression((Expression) exp.getParameters().get(0));
    			if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelType ) {
    	    		Boolean foundType = false;
    	    		Iterator<fr.irisa.triskell.kermeta.language.structure.Class> classes = TypeMatchChecker.getContainedTypes((ModelType) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType()).iterator();
    				while (!foundType && classes.hasNext()) {
    					fr.irisa.triskell.kermeta.language.structure.Class cls = (fr.irisa.triskell.kermeta.language.structure.Class) classes.next();
    					if (provided.isSubTypeOf(new SimpleType(cls, context))) {
    						foundType = true;
    					}
    				}
    				if (!foundType) {
    					unit.error("Unable to remove object of type '" + provided + "' from model of type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "'.", exp);
    				}
    			} else if ( getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof ModelTypeVariable ) {
    				//VirtualTypes, for the moment, are monomorphic
    				ModelTypeVariable mtv = (ModelTypeVariable) getTypeOfExpression(((CallFeature) exp).getTarget()).getFType();
    				if (!mtv.getVirtualType().contains(provided.getFType())) {
    					unit.error("Unable to remove object of type '" + provided + "' from model of type '" + getTypeOfExpression(((CallFeature) exp).getTarget()) + "'.", exp);
    				}
    			}
	    	} else {
	    	    unit.error("TYPE-CHECKER : Add operation takes only one parameter", (Expression)exp);
	    	}
	    }
	    return result;
	}
	
	protected Type checkPropertyCall(CallableProperty prop, CallExpression exp) {
		if (exp.getParameters().size() == 0) {
			if ( (((CallFeature)exp).getTarget() != null) && (getTypeOfExpression(((CallFeature) exp).getTarget()).getFType() instanceof VirtualType)) {
				return TypeVirtualizer.virtualizePropertyType(prop, (VirtualType) getTypeOfExpression(((CallFeature)exp).getTarget()).getFType(), context);
			}
		    return prop.getType(exp);
		}
		else {
		    return getReturnTypeForParametrizedCallExpression(exp, prop.getType(exp));
		}
	}
	
	/**********************************
	 *  VISITOR UTILITIES
	 **********************************/
	
	/**
	 * Visit an Elist of expression and returns the type
	 * of the last expression
	 */
	protected Type visitExpressionList(EList<Expression> expressions) {
		Type result = context.VoidType;
		for ( Expression expression : expressions )
			result = (Type) this.accept(expression);
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
	        unit.error("TYPE-CHECKER : Only variables and properties can be assigned", expression);
	        return context.VoidType;
	    }
	    
	    // It should not be a superoperation call
	    if (expression.getTarget() instanceof FSuperCall) {
	        unit.error("TYPE-CHECKER : Only variables and properties can be assigned", expression);
	        return context.VoidType;
	    }
	    
	    // It should not be an operation call
	    if (expression.getTarget() instanceof CallFeature) {
	        CallFeature fc = (CallFeature)expression.getTarget();
	        
	        // Determine the type of the target
			Type target;
			if (fc.getTarget() != null) target = getTypeOfExpression(fc.getTarget());
			else target = context.getSelfType();
			// Check if it is an operation
			CallableOperation op = target.getOperationByName(fc.getName(), unit);
			if (op != null) {
			    unit.error("TYPE-CHECKER : Only variables and properties can be assigned", expression);
			    return context.VoidType;
			}
			// Check if it is a property and if this property is derived AND readonly
			CallableProperty prop = target.getPropertyByName(fc.getName());
			if (prop!=null && prop.getProperty().isIsReadOnly())
			{
				unit.error("TYPE-CHECKER : '"+ fc.getName() + "' property is readonly. You can't assign it.", expression);
				return context.VoidType;
				
			}
			
			if ( prop == null ) {
				if ( target.getFType() instanceof Class ) {
					Class c = (Class) target.getFType();
					String message = "The class definition " + NamedElementHelper.getQualifiedName(c.getTypeDefinition()) + " does not declare any property named " + fc.getName() + ".";
					unit.error(message, expression);
				} else {
					String message = "Assignment impossible because one class definition is missing a property named " + fc.getName() + ".";
					unit.error(message, expression);	
				}				
				return context.VoidType;
			}
			
			// Check if the property is not a reflectivecollection
			int upperBound = prop.getProperty().getUpper();
			if ( (prop != null) && ((upperBound == -1) || (upperBound > 1)) ) {
				KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
				unit.error("TYPE-CHECKER : You are trying to overwrite the internal reflective collection of the property '" + prop.getProperty().getName() + "'.\n"
						+ "Did you mean ? \n\t" + pp.accept(expression.getTarget()) + ".clear\n\t" + 
						pp.accept(expression.getTarget()) + ".addAll(" +pp.accept(expression.getValue()) + ")"
						, expression);
				return context.VoidType;
			}
	    }
	    
	    Type targetType = getTypeOfExpression(expression.getTarget());
	    Type provided_type = getTypeOfExpression(expression.getValue());
	    
	    if (expression.isIsCast()) {
	        
	        // Allow casting ennumeration literals in Enum values
	        if (targetType.getFType() instanceof Enumeration && provided_type.isSubTypeOf(context.EnumLitType) ) {
	            return targetType;
	        }
	        
	        if (provided_type.isSubTypeOf(targetType)) {
	            unit.warning("TYPE-CHECKER : Unnecessary cast, it should be a regular assignment", expression);
	            return provided_type;
	        }
	        else if (!targetType.isSubTypeOf(provided_type)) {
	        	if ( targetType.getFType() instanceof Class && provided_type.getFType() instanceof Class ) {
	        		ClassDefinition pCDef = (ClassDefinition) ((Class) provided_type.getFType()).getTypeDefinition();
	        		ClassDefinition tCDef = (ClassDefinition) ((Class) targetType.getFType()).getTypeDefinition();
	        		if ( ! KermetaModelHelper.ClassDefinition.isSuperTypeOf(unit, pCDef, tCDef) ) {
	        			Operation op = null;
	        			Property property = null;
	        			ClassDefinition cd = null;
	        			EObject current = expression;
	        			while ( ! (current instanceof Package) && current != null ) {
	        				if ( current instanceof Operation && op == null )
	        					op = (Operation) current;
	        				if ( current instanceof Property && property == null )
	        					property = (Property) current;
	        				if ( current instanceof ClassDefinition && cd == null )
	        					cd = (ClassDefinition) current;
	        				current = current.eContainer();
	        			}
	        			String message = "";
	        			if ( op != null )
	        				message = "TYPE-CHECKER : " + KermetaModelHelper.NamedElement.qualifiedName(cd) + "." + op.getName();
	        			else if ( property != null )
	        				message = "TYPE-CHECKER : " + KermetaModelHelper.NamedElement.qualifiedName(cd) + "." + property.getName();
	        			message += " TYPE-CHECKER : Invalid cast, "+provided_type+" is not a supertype of required type : "+targetType+".";
	        			unit.error(message, expression);
	        			return targetType;
	        		}
	        	}
	        	return provided_type;
	        }
	        else {
	        	setType(expression, targetType);
	            return targetType;
	        }
	    }
	    else {	   
	    	if(provided_type != null){
		        if (!provided_type.isSubTypeOf(targetType)) {
		        	provided_type.isSubTypeOf(targetType);
		            unit.error("TYPE-CHECKER : Type mismatch, "+provided_type+" does not conform to required type : "+targetType+".", expression);
		        }
		        setType(expression, provided_type);
	    	}
		    else
		    	unit.error("TYPE-CHECKER : Type mismatch, null does not conform to required type : "+targetType+".", expression);
	        
	        return provided_type;
	    }
	}
	
	public Object visitBlock(Block expression) {
	    preVisit();
		Type result = context.VoidType;
		// Process contained expressions
		context.pushContext();
		result = visitExpressionList(expression.getStatement());
		context.popContext();
		//handle rescue blocks
		for (Object next : expression.getRescueBlock()) {
			Rescue resc = (Rescue)next;
			
			// Chech the constraint on multiplicity of exception type
			if (resc.getExceptionType() != null && resc.getExceptionType().getUpper() != 1) {
				unit.error("TYPE-CHECKER : The upper multiplicity of the type of object to catch must be 1", resc);
			}
			
			context.pushContext();
			// add the symbol
			if (resc.getExceptionType() != null)
			    context.addSymbol(new KMSymbolRescueParameter(resc), context.getTypeFromMultiplicityElement(resc.getExceptionType()));
			visitExpressionList(resc.getBody());
			context.popContext();
		}
		// Return the type of the last expression
		setType(expression, result);
		return result;
	}
	
	public Object visitBooleanLiteral(BooleanLiteral expression) {
	    preVisit();
	    setType(expression, context.BooleanType);
		return context.BooleanType;
	}
	
	public Object visitCallValue(CallValue expression) {
	    preVisit();
	    Type result = null;
	    // Get the type of the callValue
	    if (!(context.getCurrentCallable() instanceof Property) ||
	         !((Property)context.getCurrentCallable()).isIsDerived())
	    {
	        unit.error("TYPE-CHECKER : 'value' symbol is forbidden outside derived property", expression);
	    }
        result = context.getTypeFromMultiplicityElement(context.getCurrentCallable());
	    setType(expression, result);
	    return result;
	}
	
	public Object visitCallFeature(CallFeature expression) {		
			
		// visit target expression	
		if (expression.getTarget() != null) 
			this.accept(expression.getTarget());
		preVisit();
		
		//The enumeration if it is a enum literal call
		Enumeration e = null;
		
		// Determine the type of the target
		Type target;
		if (expression.getTarget() != null) {
			target = getTypeOfExpression(expression.getTarget());
			if(target == null){
				unit.error("TYPE-CHECKER : cannot resolve type of target "+expression.getTarget().toString() + " in expression " + expression.getName() + ".",expression);
				return context.VoidType;
			}
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
			Iterator<EnumerationLiteral> it = e.getOwnedLiteral().iterator();
			while (it.hasNext() && lit == null) {
				EnumerationLiteral l = (EnumerationLiteral)it.next();
				if (l.getName().equals(expression.getName())) lit = l;
			}
			if (lit != null) {
			    expression.setStaticEnumLiteral(lit);
				result = new SimpleType(e, context);
			}
		}
		
		if (result == null) {
		    // It the target type is an enumeration, the object should be an enumeration literal
		    if (expression.getTarget() != null && target.getFType() instanceof Enumeration) {
		        target = context.EnumLitType;
		    }
		    
			// Is it an operation call
			CallableOperation op = target.getOperationByName(expression.getName(), unit);
			if (op != null) {
				result = checkOperationCall(op, expression);
				expression.setStaticOperation(op.getOperation());
			}
			else {
				// Is it a property call
				CallableProperty prop = target.getPropertyByName(expression.getName());
				//KermetaUnitHelper.getKermetaUnitFromObject( ((Class) prop.getProperty().getType()).getTypeDefinition() )
				if (prop != null) { 
					result = checkPropertyCall(prop, expression);
					expression.setStaticProperty(prop.getProperty());
				}
				
			}
			
			if (result == null) {
			    // The feature was not found
			    if (e != null)
			        unit.error("TYPE-CHECKER : cannot resolve enumeration literal " + expression.getName() + " in enumetation " + e.getName() + ".",expression);
			    else {
			    	unit.error("TYPE-CHECKER : cannot resolve feature " + expression.getName() + " in type " + target.toString() + ".",expression);
			        op = target.getOperationByName(expression.getName(), unit);
			        CallableProperty prop = target.getPropertyByName(expression.getName());
					if (op != null) {
						result = checkOperationCall(op, expression);
						expression.setStaticOperation(op.getOperation());
					}
			    }
			    result = context.VoidType;
			}
		}
		
		setType(expression, result);	
		return result;
	}
	
	public Object visitCallResult(CallResult expression) {
	    preVisit();
	    
	    if (context.getCurrentCallable() == null) {
	    	// cannot call result here
	    	unit.error("TYPE-CHECKER : invalid use of result", expression);
	    	return context.VoidType;
	    }
	    
		// ele
	    Type result = context.getTypeFromMultiplicityElement(context.getCurrentCallable());
	    // if there are parameters
		if (expression.getParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		
		setType(expression, result);
		return result;
	}
	
	public Object visitCallSuperOperation(CallSuperOperation expression) {
	    preVisit();  
	    // If user called "super" in an operation that has no super operation
	    Type result = context.VoidType;
	    if (context.getSuperOperation() == null)
	    {
	    	unit.error("TYPE-CHECKER : the call of super is illegal in operation '" + context.getCurrentCallable().getName() + "' which is not a redefined one", expression);
	    }
	    else
	    {
	    	result =  checkOperationCall(context.getSuperOperation(), expression);
	    	setType(expression, result);
	    }
	    return result;
	}
	
	public Object visitCallVariable(CallVariable expression) {
	    preVisit();
		// if there is no parameter
		Type result = context.symbolTypeLookup(expression.getName());
		// Error if symbol not found
		if (result == null) {
			unit.error("TYPE-CHECKER : cannot resolve symbol " + expression.getName(), expression);
			setType(expression, context.VoidType);
			return context.VoidType;
		}
		// if there are parameters
		if (expression.getParameters().size() != 0) {
			result = getReturnTypeForParametrizedCallExpression(expression, result);
		}
		// return result
		setType(expression, result);
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
		SimpleType conditionType = (SimpleType) getTypeOfExpression(expression.getCondition());
		String conditionTypeQualifiedName = "";
		
		if ( conditionType.type instanceof PrimitiveType ) {
			fr.irisa.triskell.kermeta.language.structure.Type t = KermetaModelHelper.PrimitiveType.resolvePrimitiveType( (PrimitiveType) conditionType.type);
			if ( t instanceof Class )
				conditionTypeQualifiedName = KermetaModelHelper.NamedElement.qualifiedName( ((Class) t).getTypeDefinition() );
		} else
			conditionTypeQualifiedName = KermetaModelHelper.NamedElement.qualifiedName( conditionType.getTypeDefinition() );
		
		if( ! conditionTypeQualifiedName.equals(NamedElementHelper.getQualifiedName(context.BooleanType.getTypeDefinition())) ) {
			unit.error("TYPE-CHECKER : The condition expression of a conditional statement should be a Boolean expression", expression.getCondition());
		}
		// compute the return type
		if (expression.getElseBody() != null) {
			result = getUnionType(getTypeOfExpression(expression.getThenBody()), getTypeOfExpression(expression.getElseBody()));
		}
		else
			result = getTypeOfExpression(expression.getThenBody());
		// Return type
		setType(expression, result);
		return result;
	}
	
	public Object visitEmptyExpression(EmptyExpression expression) {
	    preVisit();
		// Return type
	    setType(expression, context.VoidType);
		return context.VoidType;
	}
	
	public Object visitIntegerLiteral(IntegerLiteral expression) {
	    preVisit();
	    setType(expression, context.IntegerType);
		return context.IntegerType;
	}
	
	public Object visitJavaStaticCall(JavaStaticCall expression) {
	    preVisit();
		// visit contained expression
		visitExpressionList(expression.getParameters());
		// The returned type is Objects
		setType(expression, context.ObjectType);
		return context.ObjectType;
	}
	
	public Object visitLambdaExpression(LambdaExpression expression) {
	    
	   
	    ProductType result_param = StructureFactory.eINSTANCE.createProductType();
	    
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
	                //context.addSymbol(new KMSymbolLambdaParameter(param), context.ObjectType);
	                //result_param.getFType().add(context.ObjectType);
	                unit.error("TYPE-CHECKER : Types of the function does not match required types", expression);
	            }
	            
	        }
	        else {
	            Type t = context.getTypeFromMultiplicityElement(param.getType());
	            ParameterizedTypeChecker.checkType(t.getFType(), unit,  expression, context);
	            context.addSymbol(new KMSymbolLambdaParameter(param), t);
	            result_param.getType().add(((SimpleType)t).type);
	        }
	    }
	    
	    // check expression
    
	    Type result_return = (Type)this.accept(expression.getBody());
	    
	    context.popContext();
	    
	    FunctionType result = StructureFactory.eINSTANCE.createFunctionType();
	    // Compute return type
	    if (result_return instanceof SimpleType) {
	        
	        result.setLeft(result_param);
	        if ( result_param.eContainer() == null )
	        	result.getContainedType().add( result_param );
	        result.setRight(((SimpleType)result_return).type);
	        if ( ((SimpleType)result_return).type.eContainer() == null ) 
	        	result.getContainedType().add( ((SimpleType)result_return).type );
	        
	    }
	    else {
	        // TODO : Complete this method
	        // FIXME : Compute the appropriate union type
	        
	        result.setLeft(result_param);
	        if ( result_param.eContainer() == null )
	        	result.getContainedType().add( result_param );
	        result.getContainedType().add( result_param );
	        result.setRight((((UnionType)result_return).transformAsSimpleType()).type);
	        if ( (((UnionType)result_return).transformAsSimpleType()).type.eContainer() == null ) 
		        result.getContainedType().add( (((UnionType)result_return).transformAsSimpleType()).type );
	        
	    }
	    Type true_result = new SimpleType(result, context);
	    setType(expression, true_result);
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
		if(!getTypeOfExpression(expression.getStopCondition()).isSubTypeOf(context.BooleanType)) {
			unit.error("TYPE-CHECKER : The until expression of a loop statement should be a Boolean expression", expression.getStopCondition());
		}
		
		// Return type
		setType(expression, context.VoidType);
		return context.VoidType;
	}
	
	public Object visitRaise(Raise expression) {
	    preVisit();
		// process contained expression
	    this.accept(expression.getExpression());
	    // return void
	    setType(expression, context.VoidType);
	    return context.VoidType;
	}
	
	public Object visitSelfExpression(SelfExpression expression) {
	    preVisit();
		Type result = context.getSelfType();
		
		/*
		 	[#1586] Type inference failure on type of 'self'
		 	Due to this bug, we now bind self type.
		 */
		fr.irisa.triskell.kermeta.language.structure.Class cl = (fr.irisa.triskell.kermeta.language.structure.Class) result.getFType();
		ClassDefinition tf = (ClassDefinition) cl.getTypeDefinition();
		
		Iterator <TypeVariable> itOnTypeVariable = tf.getTypeParameter().iterator();
		while ( itOnTypeVariable.hasNext() ) {
			TypeVariable tv = itOnTypeVariable.next();
			TypeVariableBinding tvb = StructureFactory.eINSTANCE.createTypeVariableBinding();
			tvb.setType(tv);
			tvb.setVariable(tv);
			cl.getTypeParamBinding().add(tvb);
		}
		
		result = new SimpleType(cl, context);
		
		// Return type
		setType(expression, result);
		return result;
	}
	
	public Object visitStringLiteral(StringLiteral expression) {
	    preVisit();
	    setType(expression, context.StringType);
		return context.StringType;
	}
	
	public Object visitTypeLiteral(TypeLiteral expression) {
	    preVisit();
		Type result;
	    fr.irisa.triskell.kermeta.language.structure.Type type = getTypeFromTypeLiteral(expression).type;
	    if(type == null){
	    	unit.error("TYPE-CHECKER : unable to retreive type from expression", expression);
		    result = context.VoidType;
	    }
	    else {
		    ParameterizedTypeChecker.checkType(type, unit, expression, context);
			
		    if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
		    	result = context.ClassType;
		    }
		    else if (type instanceof Enumeration){
		    	result = context.EnumType;
		    }
		    else if (type instanceof ModelType) {
		    	result = context.ModelTypeType;
		    }
		    else if (type instanceof ObjectTypeVariable) {
		    	//result = context.ObjectTypeVariableType;
		    	result = context.ClassType;
		    }
		    else if (type instanceof ModelTypeVariable) {
		    	//result = context.ModelTypeVariableType;
		    	result = context.ModelTypeType;
		    }
		    else if (type instanceof VirtualType) {
		    	//result = context.VirtualTypeType;
		    	result = context.ClassType;
		    }
		    else {
		    	unit.error("TYPE-CHECKER : Type literal should only refer to classes, enumerations, model types or type variables.", expression);
			    result = context.VoidType;
		    }
	    }
	    setType(expression, result);
		return result;
	}
	
	public Object visitVariableDecl(VariableDecl expression) {
	    preVisit();
	    Type result = context.getTypeFromMultiplicityElement(expression.getType());  
	    ParameterizedTypeChecker.checkType(result.getFType(), unit, expression, context);
		// process contained expressions
		if (expression.getInitialization() != null) 
			this.accept(expression.getInitialization());
		
		// Check constraints
		if (expression.getInitialization() != null) {
			if(getTypeOfExpression(expression.getInitialization())!=null){
			if (!getTypeOfExpression(expression.getInitialization()).isSubTypeOf(result)) {
				//KermetaUnitHelper.getKermetaUnitFromObject( ((SimpleType) getTypeOfExpression(expression.getInitialization())).getTypeDefinition() );
				//KermetaUnitHelper.getKermetaUnitFromObject( ((SimpleType) result).getTypeDefinition() );
				getTypeOfExpression(expression.getInitialization()).isSubTypeOf(result);
				unit.error("TYPE-CHECKER : The initialization expression should be compatible with the type of the variable : expected "+result+", found "+getTypeOfExpression(expression.getInitialization())+".", expression.getInitialization());
			}
			}
			else{
				unit.error("TYPE-CHECKER : The initialization expression should be compatible with the type of the variable : expected "+result+", found null." , expression.getInitialization());
			}
		}
		
		KMSymbol symbol = context.symbolLookup(expression.getIdentifier());
		if (symbol!=null && symbol instanceof KMSymbolVariable)
		{
		    unit.error("TYPE-CHECKER : Variable '"+expression.getIdentifier()+"' is already declared somewhere above.", expression);
		}
		else
		{
		    // Add the variable in the context
		    context.addSymbol(new KMSymbolVariable(expression), result);
		}
		
		// Return type
		setType(expression, result);
		return result;
	}
	
	public Object visitVoidLiteral(VoidLiteral expression) {
	    preVisit();
	    setType(expression, context.VoidType);
		return context.VoidType;
	}
	
	
	protected SimpleType getTypeFromTypeLiteral(TypeLiteral expression) {
	    Type result = null;
		
		//FIXME: check that it is realy a class and generate an error othewise
		
		if (expression.getTyperef().getUpper() == 1) {
			result = new SimpleType(expression.getTyperef().getType(), context);
		}
		else {
			result = context.getTypeFromMultiplicityElement(expression.getTyperef());
		}
		return (SimpleType)result;
	}

	private void preVisit() {
	    expected_type = null;
	}
}
