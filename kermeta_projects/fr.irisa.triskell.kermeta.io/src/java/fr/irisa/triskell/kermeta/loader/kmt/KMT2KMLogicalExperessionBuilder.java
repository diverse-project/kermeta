/* $Id: KMT2KMLogicalExperessionBuilder.java,v 1.9 2008-02-14 07:13:16 uid21732 Exp $
 * Created on 5 f�vr. 2005
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
import fr.irisa.triskell.kermeta.parser.gen.ast.LogicalExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.LogicalOp;
import fr.irisa.triskell.kermeta.parser.gen.ast.RelationalExpression;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * list logicalExpression : exp1=relationalExpression (logicalOp expn=relationalExpression )* ;
 * token logicalOp : AND_KW | OR_KW ;
 * 
 * It generates method calls
 * 
 * AND_KW -> and() method
 * OR_KW -> or() method
 * 
 */
public class KMT2KMLogicalExperessionBuilder extends KMT2KMPass {

	
	public static Expression process(LoadingContext context, LogicalExpression node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return null;
		KMT2KMLogicalExperessionBuilder visitor = new KMT2KMLogicalExperessionBuilder(builder, context, monitor);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable<String, String> operators;
	static {
		// Maping operator -> method
		operators = new Hashtable<String, String>();
		operators.put("and", "and");
		operators.put("or", "or");
	}
	
	protected Expression result;
	protected LogicalOp operator;
	/**
	 * @param builder
	 */
	public KMT2KMLogicalExperessionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LogicalExpression)
	 */
	public boolean beginVisit(LogicalExpression logicalExpression) {
		ASTNode[] children = logicalExpression.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof RelationalExpression) {
				if (operator == null) {
					result = KMT2KMRelationalExpressionBuilder.process(context, (RelationalExpression)children[i], builder, monitor);
				}
				else {
					CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
					builder.storeTrace(call,operator);
					call.setName((String)operators.get(operator.getText()));
					call.setTarget(result);
					call.getParameters().add(KMT2KMRelationalExpressionBuilder.process(context, (RelationalExpression)children[i], builder, monitor));
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
	public boolean beginVisit(LogicalOp node) {
		operator = node;
		return false;
	}
}
