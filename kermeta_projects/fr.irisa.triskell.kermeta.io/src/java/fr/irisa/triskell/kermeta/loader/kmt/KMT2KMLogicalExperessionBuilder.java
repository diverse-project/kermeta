/*
 * Created on 5 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Hashtable;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.ast.LogicalExpression;
import fr.irisa.triskell.kermeta.ast.LogicalOp;
import fr.irisa.triskell.kermeta.ast.RelationalExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
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

	
	public static FExpression process(LogicalExpression node, KermetaUnit builder) {
		if (node == null) return null;
		KMT2KMLogicalExperessionBuilder visitor = new KMT2KMLogicalExperessionBuilder(builder);
		node.accept(visitor);
		return visitor.result;
	}
	
	protected static Hashtable operators;
	static {
		// Maping operator -> method
		operators = new Hashtable();
		operators.put("and", "and");
		operators.put("or", "or");
	}
	
	protected FExpression result;
	protected LogicalOp operator;
	/**
	 * @param builder
	 */
	public KMT2KMLogicalExperessionBuilder(KermetaUnit builder) {
		super(builder);
	}

	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.LogicalExpression)
	 */
	public boolean beginVisit(LogicalExpression logicalExpression) {
		ASTNode[] children = logicalExpression.getChildren();
		for(int i=0; i< children.length; i++) {
			if (children[i] instanceof RelationalExpression) {
				if (operator == null) {
					result = KMT2KMRelationalExpressionBuilder.process((RelationalExpression)children[i], builder);
				}
				else {
					FCallFeature call = builder.behav_factory.createFCallFeature();
					builder.storeTrace(call,operator);
					call.setFName((String)operators.get(operator.getText()));
					call.setFTarget(result);
					call.getFParameters().add(KMT2KMRelationalExpressionBuilder.process((RelationalExpression)children[i], builder));
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
