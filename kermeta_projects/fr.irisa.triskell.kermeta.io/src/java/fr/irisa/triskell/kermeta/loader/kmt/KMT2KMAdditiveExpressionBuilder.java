/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Hashtable;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.AdditiveExpression;
import fr.irisa.triskell.kermeta.ast.AdditiveOp;
import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.MultiplicativeExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * list additiveExpression : exp1=multiplicativeExpression ( additiveOp expn=multiplicativeExpression )* ;
 * token additiveOp : PLUS | MINUS ;
 */
public class KMT2KMAdditiveExpressionBuilder extends KMT2KMPass {

	
	public static FExpression process(AdditiveExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMAdditiveExpressionBuilder visitor = new KMT2KMAdditiveExpressionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable operators;
	static {
		// Maping operator -> method
		operators = new Hashtable();
		operators.put("+", "plus");
		operators.put("-", "minus");
	}
	
	protected FExpression result;
	protected AdditiveOp operator;
	
	/**
	 * @param builder
	 */
	public KMT2KMAdditiveExpressionBuilder(KermetaUnit builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ftmaction.ast.FtmactionASTNodeVisitor#beginVisit(ftmaction.ast.AdditiveExpression)
	 */
	public boolean beginVisit(AdditiveExpression node) {
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof MultiplicativeExpression) {
				if (operator == null) {
					result = KMT2KMMultiplicativeExpressionBuilder.process((MultiplicativeExpression)children[i], builder);
				}
				else {
					FCallFeature call = builder.behav_factory.createFCallFeature();
					builder.storeTrace(call,operator);
					call.setFName((String)operators.get(operator.getText()));
					call.setFTarget(result);
					call.getFParameters().add(KMT2KMMultiplicativeExpressionBuilder.process((MultiplicativeExpression)children[i], builder));
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
	public boolean beginVisit(AdditiveOp node) {
		operator = node;
		return super.beginVisit(node);
	}
	
}
