/* $Id: KMT2KMExperessionListBuilder.java,v 1.8 2008-04-28 11:50:13 ftanguy Exp $
 * Created on 6 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;


import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpressionLst;



/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMT2KMExperessionListBuilder extends KMT2KMPass {

	public static ArrayList process(LoadingContext context, FExpressionLst node, KermetaUnit builder, IProgressMonitor monitor) {
		if (node == null) return new ArrayList();
		KMT2KMExperessionListBuilder visitor = new KMT2KMExperessionListBuilder(builder, context, monitor);
		context.pushContext();
		node.accept(visitor);
		context.popContext();
		return visitor.result;
	}
	
	protected ArrayList result;
	
	/**
	 * @param builder
	 */
	public KMT2KMExperessionListBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
		result = new ArrayList();
	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FExpression)
	 */
	public boolean beginVisit(FExpression fExpression) {
		fr.irisa.triskell.kermeta.language.behavior.Expression exp = KMT2KMExperessionBuilder.process(context, fExpression, builder, monitor);
		if (exp != null) result.add(exp);
		return false;
	}
}
