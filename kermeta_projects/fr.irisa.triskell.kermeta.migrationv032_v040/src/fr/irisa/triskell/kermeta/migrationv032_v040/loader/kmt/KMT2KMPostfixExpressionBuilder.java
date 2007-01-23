/* $Id: KMT2KMPostfixExpressionBuilder.java,v 1.1 2007-01-23 15:04:12 dvojtise Exp $
 * Project : Kermeta io
 * File : KMT2KMPostfixExpressionBuilder.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 23, 2005
 * Author : ffleurey
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolLambdaParameter;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ActualParameter;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.CallPostfix;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FExpression;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FExpressionLst;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.LambdaPostfix;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.LambdaPostfixParam;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ParamPostfix;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.PostfixExp;

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

	public static Expression process(PostfixExp node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMPostfixExpressionBuilder visitor = new KMT2KMPostfixExpressionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected Expression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMPostfixExpressionBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.PostfixExp)
	 */
	public boolean beginVisit(PostfixExp postfixExp) {
		result = KMT2KMPrimitiveExpressionBuilder.process(postfixExp.getTarget(), builder);
		postfixExp.getPostfixlst().accept(this);
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.CallPostfix)
	 */
	public boolean beginVisit(CallPostfix callPostfix) {
		CallFeature call = builder.behav_factory.createCallFeature();
		builder.storeTrace(call,callPostfix);
		call.setName(getTextForID(callPostfix.getName()));
		call.setTarget(result);
		result = call;
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
			
				current_le = builder.behav_factory.createLambdaExpression();
				builder.storeTrace(current_le,lambdaPostfix);
				builder.pushContext();
				lambdaPostfix.getParams().accept(this);
			
						
				// Patch that avoids to create a Block element in case the body of the lambda expression
				// contains a single expression.
				//OLD: current_le.setBody(createBlock(lambdaPostfix.getExpression()));
				if(lambdaPostfix.getExpression().getChildCount() > 1) {
					current_le.setBody( createBlock(lambdaPostfix.getExpression()) );
				} else {

					FExpression fExp = (FExpression) lambdaPostfix.getExpression().getChild(0);
					fr.irisa.triskell.kermeta.language.behavior.Expression expr =  builder.behav_factory.createEmptyExpression();
					builder.storeTrace(expr, fExp);
					current_le.setBody( KMT2KMExperessionBuilder.process(fExp, builder) );
				}
			} else {
				builder.messages.addMessage(new KMTUnitLoadError("A lambda expression should have at least one expression in its body.", lambdaPostfix));
				return false;						
			}
						
			((CallExpression)result).getParameters().add(current_le);
			builder.popContext();
		}
		else {
			builder.messages.addMessage(new KMTUnitLoadError("A lambda postfix can only be applied as the unique parameter of a call expression.", lambdaPostfix));
			return false;
		}
		
		return false;
	}
	
	protected fr.irisa.triskell.kermeta.language.behavior.Block createBlock(FExpressionLst explst) {
		fr.irisa.triskell.kermeta.language.behavior.Block block =  builder.behav_factory.createBlock();
		if (explst != null) {
			builder.storeTrace(block,explst);
			block.getStatement().addAll(KMT2KMExperessionListBuilder.process(explst, builder));
		}
		return block;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LambdaPostfixParam)
	 */
	public boolean beginVisit(LambdaPostfixParam lambdaPostfixParam) {
		LambdaParameter lp = builder.behav_factory.createLambdaParameter();
		builder.storeTrace(lp,lambdaPostfixParam);
		lp.setName(getTextForID(lambdaPostfixParam.getName()));
		builder.addSymbol(new KMSymbolLambdaParameter(lp));
		current_le.getParameters().add(lp);
		//TODO: The type of the parameter cannot be set here. Do it in the type chacker !!
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
			builder.messages.addMessage(new KMTUnitLoadError("Parameters can only be associated to a call expression.", paramPostfix));
			return false;
		}
		return super.beginVisit(paramPostfix);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ActualParameter)
	 */
	public boolean beginVisit(ActualParameter actualParameter) {
		CallExpression res = (CallExpression)result;
		Expression param = KMT2KMExperessionBuilder.process(actualParameter.getExpression(), builder);
		res.getParameters().add(param);
		return false;
	}
}
