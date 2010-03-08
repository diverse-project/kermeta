/* $Id: KMT2KMAdditiveExpressionBuilder.java,v 1.10 2008-04-28 11:50:13 ftanguy Exp $
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
import fr.irisa.triskell.kermeta.parser.gen.ast.AdditiveExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.AdditiveOp;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.MultiplicativeExpression;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * list additiveExpression : exp1=multiplicativeExpression ( additiveOp expn=multiplicativeExpression )* ;
 * token additiveOp : PLUS | MINUS ;
 */
public class KMT2KMAdditiveExpressionBuilder extends KMT2KMPass {

	
	public static fr.irisa.triskell.kermeta.language.behavior.Expression process(LoadingContext context, AdditiveExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) 
			return null;
		KMT2KMAdditiveExpressionBuilder visitor = new KMT2KMAdditiveExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable<String, String> operators;
	static {
		// Maping operator -> method
		operators = new Hashtable<String, String>();
		operators.put("+", "plus");
		operators.put("-", "minus");
	}
	
	protected fr.irisa.triskell.kermeta.language.behavior.Expression result;
	protected AdditiveOp operator;
	
	/**
	 * @param builder
	 */
	public KMT2KMAdditiveExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}

	/**
	 * @see ftmaction.ast.FtmactionASTNodeVisitor#beginVisit(ftmaction.ast.AdditiveExpression)
	 */
	public boolean beginVisit(AdditiveExpression node) {
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof MultiplicativeExpression) {
				if (operator == null) {
					result = KMT2KMMultiplicativeExpressionBuilder.process(context, (MultiplicativeExpression)children[i], builder, monitor);
				}
				else {
					CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMMultiplicativeExpressionBuilder.process(context, (MultiplicativeExpression)children[i], builder, monitor));
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
