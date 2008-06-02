/* $Id: KMT2KMExperessionBuilder.java,v 1.15 2008-06-02 13:35:43 ftanguy Exp $
 * Created on 5 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.parser.gen.ast.FAssignement;
import fr.irisa.triskell.kermeta.parser.gen.ast.FExpression;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * abstract fExpression : fAssignement ;
 * sequence fAssignement : expression=logicalExpression (assignementOp EQUALS newvalue=logicalExpression)?;
 * token assignementOp : COLON | QMARK ;
 * 
 */
public class KMT2KMExperessionBuilder extends KMT2KMPass {

	public static Expression process(LoadingContext context, FExpression node, KermetaUnit builder, IProgressMonitor monitor) {
	    
		if (node == null) return null;
		KMT2KMExperessionBuilder visitor = new KMT2KMExperessionBuilder(builder, context, monitor);
		int old_errs = builder.getMessages().size();
		try {
			node.accept(visitor);
		}
		catch(IllegalArgumentException e) {
			// just catch the exeption if an error has been reported
			// otherwise trow the exception to the caller
			if (!(builder.getMessages().size() > old_errs)) throw e;
		}
		return visitor.result;
	}
	
	protected Expression result;
	
	/**
	 * 
	 */
	public KMT2KMExperessionBuilder(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);

	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FAssignement)
	 */
	public boolean beginVisit(FAssignement fAssignement) {
		if (fAssignement.getAssignementOp() != null) {
			Expression left = KMT2KMLogicalExperessionBuilder.process(context, fAssignement.getExpression(), builder, monitor);
			Expression right = KMT2KMLogicalExperessionBuilder.process(context, fAssignement.getNewvalue(), builder, monitor);
			// left should be a call expr without params
			if (left instanceof CallExpression && ((CallExpression)left).getParameters().size() == 0)  {
				fr.irisa.triskell.kermeta.language.behavior.Assignment assign = BehaviorFactory.eINSTANCE.createAssignment();
				builder.storeTrace(assign, fAssignement);
				assign.setTarget((CallExpression)left);
				assign.setValue(right);
				if (fAssignement.getAssignementOp().getText().equals("?")) assign.setIsCast(true);
				else assign.setIsCast(false);
				result = assign;
			}
			else {
				//builder.messages.addMessage(new KMTUnitLoadError("Assignement : Only variables and properties can be assigned", fAssignement));
				builder.error("Assignement : Only variables and properties can be assigned", fAssignement);
				result = left;
				return false;
			}
		}
		else {
			result = KMT2KMLogicalExperessionBuilder.process(context, fAssignement.getExpression(), builder, monitor);
		}
		return false;
	}
}
