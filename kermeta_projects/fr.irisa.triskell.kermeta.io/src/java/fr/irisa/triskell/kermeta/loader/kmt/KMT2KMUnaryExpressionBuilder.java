/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.ast.UnaryExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * sequence unaryExpression : (unaryOp)? postfixExp ;
 * token unaryOp : NOT_KW | MINUS ;
 */
public class KMT2KMUnaryExpressionBuilder extends KMT2KMPass {

	
	public static FExpression process(UnaryExpression node, KermetaUnit builder) {
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
	
	protected FExpression result;
	
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
			FCallFeature call = builder.behav_factory.createFCallFeature();
			builder.storeTrace(call,unaryExpression.getUnaryOp());
			call.setFName((String)operators.get(unaryExpression.getUnaryOp().getText()));
			call.setFTarget(result);
			result = call;
		}
		return false;
	}
}
