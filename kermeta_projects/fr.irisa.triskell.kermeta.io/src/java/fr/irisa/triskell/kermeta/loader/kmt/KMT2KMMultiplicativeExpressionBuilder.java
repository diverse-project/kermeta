/*
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.Hashtable;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.AbstractKermetaUnitLoader;
import org.kermeta.loader.LoadingContext;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.MultiplicativeExpression;
import fr.irisa.triskell.kermeta.ast.MultiplicativeOp;
import fr.irisa.triskell.kermeta.ast.UnaryExpression;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * list multiplicativeExpression : exp1=unaryExpression (multiplicativeOp expn=unaryExpression )* ;
 * token multiplicativeOp : STAR | DIV ;
 */
public class KMT2KMMultiplicativeExpressionBuilder extends KMT2KMPass {

	public static Expression process(LoadingContext context, MultiplicativeExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMMultiplicativeExpressionBuilder visitor = new KMT2KMMultiplicativeExpressionBuilder(builder, context);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable operators;
	static {
		// Maping operator -> method
		operators = new Hashtable();
		operators.put("*", "mult");
		operators.put("/", "div");
		operators.put("%", "mod");
	}
	
	protected Expression result;
	protected MultiplicativeOp operator;
	
	/**
	 * @param builder
	 */
	public KMT2KMMultiplicativeExpressionBuilder(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
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
					result = KMT2KMUnaryExpressionBuilder.process(context, (UnaryExpression)children[i], builder);
				}
				else {
					CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMUnaryExpressionBuilder.process(context, (UnaryExpression)children[i], builder));
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
