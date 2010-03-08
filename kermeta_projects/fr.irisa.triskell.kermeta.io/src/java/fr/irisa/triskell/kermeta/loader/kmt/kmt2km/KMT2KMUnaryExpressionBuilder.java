/* $Id: KMT2KMUnaryExpressionBuilder.java,v 1.10 2008-04-28 11:50:13 ftanguy Exp $
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;


import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.parser.gen.ast.UnaryExpression;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * sequence unaryExpression : (unaryOp)? postfixExp ;
 * token unaryOp : NOT_KW | MINUS ;
 */
public class KMT2KMUnaryExpressionBuilder extends KMT2KMPass {

	
	public static Expression process(LoadingContext context, UnaryExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMUnaryExpressionBuilder visitor = new KMT2KMUnaryExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable<String, String> operators;
	static {
		// Maping operator -> method
		operators = new Hashtable<String, String>();
		operators.put("-", "uminus");
		operators.put("not", "not");
	}
	
	protected Expression result;
	
	/**
	 * @param builder
	 */
	public KMT2KMUnaryExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.UnaryExpression)
	 */
	public boolean beginVisit(UnaryExpression unaryExpression) {
		result = KMT2KMPostfixExpressionBuilder.process(context, unaryExpression.getPostfixExp(), builder, monitor);
		if (unaryExpression.getUnaryOp() != null) {
			CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
			builder.storeTrace(call,unaryExpression.getUnaryOp());
			call.setName((String)operators.get(unaryExpression.getUnaryOp().getText()));
			call.setTarget(result);
			result = call;
		}
		return false;
	}
}
