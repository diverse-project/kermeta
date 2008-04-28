

/*$Id: ExpressionTracer.java,v 1.2 2008-04-28 11:51:08 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	ExpressionTracer.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.util;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.traceability.TextReference;

public class ExpressionTracer {

	private KermetaUnit kermetaUnit;
	
	public ExpressionTracer(KermetaUnit kermetaUnit) {
		this.kermetaUnit = kermetaUnit;
	}
	
	public void tryToTrace(Object newExpression, Object baseExpression) {
		if ( newExpression instanceof EObject && baseExpression instanceof EObject )
			tryToTrace( (EObject) newExpression, (EObject) baseExpression );
	}
	
	public void tryToTrace(EObject newExpression, EObject baseExpression) {
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(baseExpression);
		TextReference reference = unit.getTracer().getFirstTextReference( baseExpression );
		if ( reference != null ) {
			kermetaUnit.getTracer().addTextInputTrace( 
					reference.getFileURI(), 
					reference.getLineBeginAt(), 
					reference.getCharBeginAt(), 
					reference.getCharEndAt(), 
					newExpression, 
					null);
		}
	}
	
}


