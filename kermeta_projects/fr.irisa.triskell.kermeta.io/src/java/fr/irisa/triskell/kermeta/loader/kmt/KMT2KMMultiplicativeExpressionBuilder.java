/* $Id: KMT2KMMultiplicativeExpressionBuilder.java,v 1.11 2008-04-28 11:50:13 ftanguy Exp $
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.Hashtable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.MultiplicativeExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.MultiplicativeOp;
import fr.irisa.triskell.kermeta.parser.gen.ast.UnaryExpression;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * list multiplicativeExpression : exp1=unaryExpression (multiplicativeOp expn=unaryExpression )* ;
 * token multiplicativeOp : STAR | DIV ;
 */
public class KMT2KMMultiplicativeExpressionBuilder extends KMT2KMPass {

	public static Expression process(LoadingContext context, MultiplicativeExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMMultiplicativeExpressionBuilder visitor = new KMT2KMMultiplicativeExpressionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable<String, String> operators;
	static {
		// Maping operator -> method
		operators = new Hashtable <String, String> ();
		operators.put("*", "mult");
		operators.put("/", "div");
		operators.put("%", "mod");
	}
	
	protected Expression result;
	protected MultiplicativeOp operator;
	
	/**
	 * @param builder
	 */
	public KMT2KMMultiplicativeExpressionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see ftmaction.ast.FtmactionASTNodeVisitor#beginVisit(ftmaction.ast.AdditiveExpression)
	 */
	public boolean beginVisit(MultiplicativeExpression node) {
		ASTNode[] children = node.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof UnaryExpression) {
				if (operator == null) {
					result = KMT2KMUnaryExpressionBuilder.process(context, (UnaryExpression)children[i], builder, monitor);
				}
				else {
					CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMUnaryExpressionBuilder.process(context, (UnaryExpression)children[i], builder, monitor));
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
	public boolean beginVisit(MultiplicativeOp node) {
		operator = node;
		return super.beginVisit(node);
	}

}
