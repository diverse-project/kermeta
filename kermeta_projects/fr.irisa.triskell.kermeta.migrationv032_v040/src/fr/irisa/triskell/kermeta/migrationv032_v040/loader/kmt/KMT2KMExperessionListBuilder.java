/*
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;


import java.util.ArrayList;

import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.AbstractKermetaUnitLoader;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.migrationv032_v040.ast.*;



/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMT2KMExperessionListBuilder extends KMT2KMPass {

	public static ArrayList process(LoadingContext context, FExpressionLst node, KermetaUnit builder) {
		if (node == null) return new ArrayList();
		KMT2KMExperessionListBuilder visitor = new KMT2KMExperessionListBuilder(builder, context);
		context.pushContext();
		node.accept(visitor);
		context.popContext();
		return visitor.result;
	}
	
	protected ArrayList result;
	
	/**
	 * @param builder
	 */
	public KMT2KMExperessionListBuilder(KermetaUnit builder, LoadingContext context) {
		super(builder, context);
		result = new ArrayList();
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FExpression)
	 */
	public boolean beginVisit(FExpression fExpression) {
		fr.irisa.triskell.kermeta.language.behavior.Expression exp = KMT2KMExperessionBuilder.process(context, fExpression, builder);
		if (exp != null) result.add(exp);
		return false;
	}
}
