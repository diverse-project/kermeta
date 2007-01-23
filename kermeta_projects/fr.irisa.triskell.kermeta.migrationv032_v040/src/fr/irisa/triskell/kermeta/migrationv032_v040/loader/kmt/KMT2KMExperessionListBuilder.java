/*
 * Created on 6 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FExpression;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FExpressionLst;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMExperessionListBuilder extends KMT2KMPass {

	public static ArrayList process(FExpressionLst node, KermetaUnit builder) {
		if (node == null) return new ArrayList();
		KMT2KMExperessionListBuilder visitor = new KMT2KMExperessionListBuilder(builder);
		builder.pushContext();
		node.accept(visitor);
		builder.popContext();
		return visitor.result;
	}
	
	protected ArrayList result;
	
	/**
	 * @param builder
	 */
	public KMT2KMExperessionListBuilder(KermetaUnit builder) {
		super(builder);
		result = new ArrayList();
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FExpression)
	 */
	public boolean beginVisit(FExpression fExpression) {
		fr.irisa.triskell.kermeta.language.behavior.Expression exp = KMT2KMExperessionBuilder.process(fExpression, builder);
		if (exp != null) result.add(exp);
		return false;
	}
}
