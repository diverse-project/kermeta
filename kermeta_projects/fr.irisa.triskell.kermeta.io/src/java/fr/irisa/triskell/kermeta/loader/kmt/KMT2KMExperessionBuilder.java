/* $Id : $
 * Created on 5 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.ast.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FExpression;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * abstract fExpression : fAssignement ;
 * sequence fAssignement : expression=logicalExpression (assignementOp EQUALS newvalue=logicalExpression)?;
 * token assignementOp : COLON | QMARK ;
 * 
 */
public class KMT2KMExperessionBuilder extends KMT2KMPass {

	public static FExpression process(fr.irisa.triskell.kermeta.ast.FExpression node, KermetaUnit builder) {
	    
		if (node == null) return null;
		KMT2KMExperessionBuilder visitor = new KMT2KMExperessionBuilder(builder);
		int old_errs = builder.getError().size();
		try {
			node.accept(visitor);
		}
		catch(IllegalArgumentException e) {
			// just catch the exeption if an error has been reported
			// otherwise trow the exception to the caller
			if (!(builder.getError().size() > old_errs)) throw e;
		}
		return visitor.result;
	}
	
	protected FExpression result;
	
	/**
	 * 
	 */
	public KMT2KMExperessionBuilder(KermetaUnit builder) {
		super(builder);

	}
	
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.FAssignement)
	 */
	public boolean beginVisit(FAssignement fAssignement) {
		if (fAssignement.getAssignementOp() != null) {
			FExpression left = KMT2KMLogicalExperessionBuilder.process(fAssignement.getExpression(), builder);
			FExpression right = KMT2KMLogicalExperessionBuilder.process(fAssignement.getNewvalue(), builder);
			// left should be a call expr without params
			if (left instanceof FCallExpression && ((FCallExpression)left).getFParameters().size() == 0)  {
				fr.irisa.triskell.kermeta.behavior.FAssignement assign = builder.behav_factory.createFAssignement();
				assign.setFTarget((FCallExpression)left);
				assign.setFValue(right);
				if (fAssignement.getAssignementOp().getText().equals("?")) assign.setFIsCast(true);
				else assign.setFIsCast(false);
				result = assign;
			}
			else {
				builder.getError().add(new KMUnitError("Assignement : Only variables and properties can be assigned", fAssignement));
				result = left;
				return false;
			}
		}
		else {
			result = KMT2KMLogicalExperessionBuilder.process(fAssignement.getExpression(), builder);
		}
		return false;
	}
}
