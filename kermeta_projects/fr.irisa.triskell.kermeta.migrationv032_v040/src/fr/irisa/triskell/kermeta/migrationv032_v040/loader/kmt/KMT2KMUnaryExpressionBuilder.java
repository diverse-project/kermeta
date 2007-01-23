/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.UnaryExpression;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * sequence unaryExpression : (unaryOp)? postfixExp ;
 * token unaryOp : NOT_KW | MINUS ;
 */
public class KMT2KMUnaryExpressionBuilder extends KMT2KMPass {

	
	public static Expression process(UnaryExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMUnaryExpressionBuilder visitor = new KMT2KMUnaryExpressionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable operators;
	static {
		// Maping operator -> method
		operators = new Hashtable();
		operators.put("-", "uminus");
		operators.put("not", "not");
	}
	
	protected Expression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMUnaryExpressionBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.UnaryExpression)
	 */
	public boolean beginVisit(UnaryExpression unaryExpression) {
		result = KMT2KMPostfixExpressionBuilder.process(unaryExpression.getPostfixExp(), builder);
		if (unaryExpression.getUnaryOp() != null) {
			CallFeature call = builder.behav_factory.createCallFeature();
			builder.storeTrace(call,unaryExpression.getUnaryOp());
			call.setName((String)operators.get(unaryExpression.getUnaryOp().getText()));
			call.setTarget(result);
			result = call;
		}
		return false;
	}
}
