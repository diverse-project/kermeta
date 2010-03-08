/* $Id: KMT2KMRelationalExpressionBuilder.java,v 1.11 2008-04-28 11:50:13 ftanguy Exp $
 * Licence : EPL
 * Copyright : IRISA / INRIA / University of rennes 1
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;


import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.parser.gen.ast.AdditiveExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.RelationalExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.RelationalOp;


/**
 * sequence relationalExpression : left=additiveExpression (relationalOp right=additiveExpression )? ;
 * token relationalOp : EQEQ | NEQ | GT | LT | GTE | LTE ;
 * 
 */
public class KMT2KMRelationalExpressionBuilder extends KMT2KMPass {

	
	public static Expression process(LoadingContext context, RelationalExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) 
			return null;
		KMT2KMRelationalExpressionBuilder visitor = new KMT2KMRelationalExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable<String,String> operators;
	static {
		// Maping operator -> method
		operators = new Hashtable<String,String>();
		operators.put("==", "equals");
		operators.put(">",  "isGreater");
		operators.put("<",  "isLower");
		operators.put("<=", "isLowerOrEqual");
		operators.put(">=", "isGreaterOrEqual");
		operators.put("!=", "isNotEqual");
	}
	
	protected Expression result;
	protected RelationalOp operator;
	
	/**
	 * @param builder
	 */
	public KMT2KMRelationalExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}
	
	public boolean beginVisit(RelationalExpression node) {
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof AdditiveExpression) {
				if (operator == null) {
					result = KMT2KMAdditiveExpressionBuilder.process(context, (AdditiveExpression)children[i], builder, monitor);
				}
				else {
					CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMAdditiveExpressionBuilder.process(context, (AdditiveExpression)children[i], builder, monitor));
					result = call;
				}
			}
			else ((KermetaASTNode)children[i]).accept(this);
		}
		return false;
	}
	
	/**
	 * @see ftmaction.ast.FtmactionASTNodeVisitor#beginVisit(ftmaction.ast.AdditiveOp)
	 */
	public boolean beginVisit(RelationalOp node) {
		operator = node;
		return false;
	}
	

}
