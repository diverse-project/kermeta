/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.ActualParameter;
import fr.irisa.triskell.kermeta.ast.CallPostfix;
import fr.irisa.triskell.kermeta.ast.LambdaPostfix;
import fr.irisa.triskell.kermeta.ast.LambdaPostfixParam;
import fr.irisa.triskell.kermeta.ast.ParamPostfix;
import fr.irisa.triskell.kermeta.ast.PostfixExp;
import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
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

	public static FExpression process(PostfixExp node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMPostfixExpressionBuilder visitor = new KMT2KMPostfixExpressionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected FExpression result;
	
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
		FCallFeature call = builder.behav_factory.createFCallFeature();
		builder.storeTrace(call,callPostfix);
		call.setFName(getTextForID(callPostfix.getName()));
		call.setFTarget(result);
		result = call;
		return false;
	}
	
	
	FLambdaExpression current_le;
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LambdaPostfix)
	 */
	public boolean beginVisit(LambdaPostfix lambdaPostfix) {
		if (result instanceof FCallExpression &&((FCallExpression)result).getFParameters().size() == 0) {
			current_le = builder.behav_factory.createFLambdaExpression();
			builder.storeTrace(current_le,lambdaPostfix);
			builder.pushContext();
			lambdaPostfix.getParams().accept(this);
			current_le.setFBody(KMT2KMExperessionBuilder.process(lambdaPostfix.getExpression(), builder));
			((FCallExpression)result).getFParameters().add(current_le);
			builder.popContext();
		}
		else {
			builder.error.add(new KMUnitError("A lambda postfix can only be applied as the unique parameter of a call expression.", lambdaPostfix));
			return false;
		}
		
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LambdaPostfixParam)
	 */
	public boolean beginVisit(LambdaPostfixParam lambdaPostfixParam) {
		FLambdaParameter lp = builder.behav_factory.createFLambdaParameter();
		builder.storeTrace(lp,lambdaPostfixParam);
		lp.setFName(getTextForID(lambdaPostfixParam.getName()));
		builder.addSymbol(new KMSymbolLambdaParameter(lp));
		current_le.getFParameters().add(lp);
		//TODO: The type of the parameter cannot be set here. Do it in the type chacker !!
		return false;
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ParamPostfix)
	 */
	public boolean beginVisit(ParamPostfix paramPostfix) {
		// It should be a call expression and it must not have actual parameters yet
		if (result instanceof FCallExpression &&((FCallExpression)result).getFParameters().size() == 0) {
			// The parameters are binded by beginVisit(ActualParameter actualParameter)
		}
		else {
			builder.error.add(new KMUnitError("Parameters can only be associated to a call expression.", paramPostfix));
			return false;
		}
		return super.beginVisit(paramPostfix);
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ActualParameter)
	 */
	public boolean beginVisit(ActualParameter actualParameter) {
		FCallExpression res = (FCallExpression)result;
		FExpression param = KMT2KMExperessionBuilder.process(actualParameter.getExpression(), builder);
		res.getFParameters().add(param);
		return false;
	}
}
