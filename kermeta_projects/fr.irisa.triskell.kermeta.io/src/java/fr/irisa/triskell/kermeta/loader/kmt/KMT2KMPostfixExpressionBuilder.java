/* $Id: KMT2KMPostfixExpressionBuilder.java,v 1.23 2008-05-19 14:38:23 cfaucher Exp $
 * Project : Kermeta io
 * File : KMT2KMPostfixExpressionBuilder.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.parser.gen.ast.ActualParameter;
import fr.irisa.triskell.kermeta.parser.gen.ast.CallPostfix;
import fr.irisa.triskell.kermeta.parser.gen.ast.LambdaPostfix;
import fr.irisa.triskell.kermeta.parser.gen.ast.LambdaPostfixParam;
import fr.irisa.triskell.kermeta.parser.gen.ast.ParamPostfix;
import fr.irisa.triskell.kermeta.parser.gen.ast.PostfixExp;

/**
 * @author Franck Fleurey
 * 
 * sequence postfixExp : target=primitiveExpression postfixlst ;
 * 
 * list postfixlst : postfix* ;
 * abstract postfix : callPostfix | lambdaPostfix | paramPostfix;
 * 
 * sequence callPostfix : DOT name=ID ;
 * sequence paramPostfix : LPAREN (parameters=actualParameterList)? RPAREN ;
 * list actualParameterList : p1=actualParameter (COMMA pn=actualParameter)* ;
 * sequence actualParameter : expression=fExpression ;
 * sequence lambdaPostfix : LCURLY params=lambdaPostfixParamLst PIPE expression=fExpression RCURLY ;
 * list lambdaPostfixParamLst : p1=lambdaPostfixParam (COMMA pn=lambdaPostfixParam)* ;
 * sequence lambdaPostfixParam : name=ID;
 * 
 */
public class KMT2KMPostfixExpressionBuilder extends KMT2KMPass {

	public static Expression process(LoadingContext context, PostfixExp node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMPostfixExpressionBuilder visitor = new KMT2KMPostfixExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected Expression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMPostfixExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PostfixExp)
	 */
	public boolean beginVisit(PostfixExp postfixExp) {
		result = KMT2KMPrimitiveExpressionBuilder.process(context, postfixExp.getTarget(), builder, monitor);
		postfixExp.getPostfixlst().accept(this);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.CallPostfix)
	 */
	public boolean beginVisit(CallPostfix callPostfix) {
		CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
		builder.storeTrace(call,callPostfix);
		call.setName(getTextForID(callPostfix.getName()));
		call.setIsAtpre(callPostfix.getAtp()!=null);
		call.setTarget(result);
		result = call;
		
		if ( callPostfix.getPostfix() != null )
			callPostfix.getPostfix().accept(this);		
		
		return false;
	}
	
	
	LambdaExpression current_le;
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LambdaPostfix)
	 */
	public boolean beginVisit(LambdaPostfix lambdaPostfix) {
		if (result instanceof CallExpression &&((CallExpression)result).getParameters().size() == 0) {
			
			// prevent against no expression
			if ( lambdaPostfix.getExpression().getChildCount() > 0 ) {
			
				current_le = BehaviorFactory.eINSTANCE.createLambdaExpression();
				builder.storeTrace(current_le,lambdaPostfix);
				context.pushContext();
				lambdaPostfix.getParams().accept(this);
			
						
				// Patch that avoids to create a Block element in case the body of the lambda expression
				// contains a single expression.
				//OLD: current_le.setBody(createBlock(lambdaPostfix.getExpression()));
				//if(lambdaPostfix.getExpression().getChildCount() > 1) {
					current_le.setBody( createBlock(lambdaPostfix) );
				//} else {

				//	FExpression fExp = (FExpression) lambdaPostfix.getExpression().getChild(0);
				//	fr.irisa.triskell.kermeta.language.behavior.Expression expr =  BehaviorFactory.eINSTANCE.createEmptyExpression();
					//builder.storeTrace(expr, fExp);
				//	current_le.setBody( KMT2KMExperessionBuilder.process(context, fExp, builder, monitor) );
				//}
			} else {
				//builder.messages.addMessage(new KMTUnitLoadError("A lambda expression should have at least one expression in its body.", lambdaPostfix));
				builder.error("A lambda expression should have at least one expression in its body.", lambdaPostfix);
				return false;						
			}
						
			((CallExpression)result).getParameters().add(current_le);
			if ( lambdaPostfix.getCall() != null )
				lambdaPostfix.getCall().accept(this);
			context.popContext();
		}
		else {
			//builder.messages.addMessage(new KMTUnitLoadError("A lambda postfix can only be applied as the unique parameter of a call expression.", lambdaPostfix));
			builder.error("A lambda postfix can only be applied as the unique parameter of a call expression.", lambdaPostfix);
			return false;
		}
		
		return false;
	}
	
	/**
	 * Given the body of a lambda expression, creates if necessary the block container.
	 * @param lambda
	 * @return
	 */
	protected Block createBlock(LambdaPostfix lambda) {
		// Creating the behavior
		ArrayList<Expression> expressions = KMT2KMExperessionListBuilder.process(context, lambda.getExpression(), builder, monitor);
		// The behavior can simply be one block expression.
		// If it is the case just return it.
		// Otherwise create a block containing all the statements
		if ( expressions.size() == 1 && expressions.get(0) instanceof Block ) {
			builder.storeTrace(expressions.get(0),lambda);
			return (Block) expressions.get(0);
		} else {
			Block block =  BehaviorFactory.eINSTANCE.createBlock();
			if (lambda.getExpression() != null) {
				builder.storeTrace(block,lambda);
				block.getStatement().addAll(expressions);
			}
			return block;
		}
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LambdaPostfixParam)
	 */
	public boolean beginVisit(LambdaPostfixParam lambdaPostfixParam) {
		LambdaParameter lp = BehaviorFactory.eINSTANCE.createLambdaParameter();
		builder.storeTrace(lp,lambdaPostfixParam);
		lp.setName(getTextForID(lambdaPostfixParam.getName()));
		context.addSymbol(new KMSymbolLambdaParameter(lp));
		current_le.getParameters().add(lp);
		//TODO: The type of the parameter cannot be set here. Do it in the type checker !!
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ParamPostfix)
	 */
	public boolean beginVisit(ParamPostfix paramPostfix) {
		// It should be a call expression and it must not have actual parameters yet
		if (result instanceof CallExpression &&((CallExpression)result).getParameters().size() == 0) {
			// The parameters are bound by beginVisit(ActualParameter actualParameter)
		}
		else {
			//builder.messages.addMessage(new KMTUnitLoadError("Parameters can only be associated to a call expression.", paramPostfix));
			builder.error("Parameters can only be associated to a call expression.", paramPostfix);
			return false;
		}
		
		if ( paramPostfix.getParameters() != null )
			paramPostfix.getParameters().accept(this);
		
		if ( paramPostfix.getCall() != null )
			paramPostfix.getCall().accept(this);
		
		return false;
		//return super.beginVisit(paramPostfix);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ActualParameter)
	 */
	public boolean beginVisit(ActualParameter actualParameter) {
		CallExpression res = (CallExpression)result;
		Expression param = KMT2KMExperessionBuilder.process(context, actualParameter.getExpression(), builder, monitor);
		res.getParameters().add(param);
		return false;
	}
}
