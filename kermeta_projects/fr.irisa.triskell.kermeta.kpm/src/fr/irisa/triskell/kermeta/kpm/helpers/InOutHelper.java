/*$Id: InOutHelper.java,v 1.2 2007-04-13 14:44:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.helpers;

import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.NullExpression;
import fr.irisa.triskell.kermeta.kpm.Out;

public class InOutHelper {

	/**
	 * 
	 * Carefull the out's dependency is no set here.
	 * It will be done if you use the create dependency method.
	 * 
	 * @param kpm
	 * @param action
	 * @return
	 */
	static public Out createOut(KPM kpm, String action) {
		Out out = KpmFactory.eINSTANCE.createOut();
		out.setAction( kpm.findAction(action) );
		
		NullExpression expr = KpmFactory.eINSTANCE.createNullExpression();
		out.setExpression(expr);
		
		return out;
	}

	/**
	 * 	 
	 * Carefull the out's dependency is no set here.
	 * It will be done if you use the create dependency method.
	 * 
	 * @param kpm
	 * @param action
	 * @param regex
	 * @return
	 */
	static public Out createOutWithNameFilter(KPM kpm, String action, String regex) {
		
		FilterExpression outExpression = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter kmFilter = kpm.findNameFilter( regex );
		outExpression.setFilter(kmFilter);
		Out out = KpmFactory.eINSTANCE.createOut();
		out.setExpression(outExpression);
		out.setAction( kpm.findAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2km") );

		return out;
	}
	
	/**
	 * Carefull the in's dependency is no set here.
	 * It will be done if you use the create dependency method.
	 * 
	 * @return
	 */
	static public In createIn() {
		In in = KpmFactory.eINSTANCE.createIn();
		
		NullExpression expr = KpmFactory.eINSTANCE.createNullExpression();
		in.setExpression(expr);
		
		return in;
	}
	
	/**
	 * Carefull the in's dependency is no set here.
	 * It will be done if you use the create dependency method.
	 * 
	 * @param kpm
	 * @param regex
	 * @return
	 */
	static public In createInWithNameFilter(KPM kpm, String regex) {
		FilterExpression inExpression = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter kmtFilter = kpm.findNameFilter( regex );
		inExpression.setFilter(kmtFilter);
		In in = KpmFactory.eINSTANCE.createIn();
		in.setExpression(inExpression);
		return in;
	}
	
}
