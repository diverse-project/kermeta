/* $Id: KMT2KMRelationalExpressionBuilder.java,v 1.5 2007-02-23 09:56:08 dvojtise Exp $
 * Licence : EPL
 * Copyright : IRISA / INRIA / University of rennes 1
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Hashtable;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.AdditiveExpression;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.RelationalExpression;
import fr.irisa.triskell.kermeta.ast.RelationalOp;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * sequence relationalExpression : left=additiveExpression (relationalOp right=additiveExpression )? ;
 * token relationalOp : EQEQ | NEQ | GT | LT | GTE | LTE ;
 * 
 */
public class KMT2KMRelationalExpressionBuilder extends KMT2KMPass {

	
	public static Expression process(RelationalExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMRelationalExpressionBuilder visitor = new KMT2KMRelationalExpressionBuilder(builder);
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
	public KMT2KMRelationalExpressionBuilder(KermetaUnit builder) {
		super(builder);
	}
	
	public boolean beginVisit(RelationalExpression node) {
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof AdditiveExpression) {
				if (operator == null) {
					result = KMT2KMAdditiveExpressionBuilder.process((AdditiveExpression)children[i], builder);
				}
				else {
					CallFeature call = builder.behav_factory.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMAdditiveExpressionBuilder.process((AdditiveExpression)children[i], builder));
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
