/*$Id: RuleHelper.java,v 1.1 2007-04-24 12:39:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;

public class RuleHelper {

	
	/**
	 * 
	 * Create a dependency. If a dependency with the same name exists, this one is returned.
	 * 
	 * @param kpm
	 * @param ruleName
	 * @param typeName
	 */
	public static Rule createRule(KPM kpm, String ruleName, String typeName, String eventName, In in, List<Out> outs) {
		
		// Check if a dependency with the same name exist
		Rule rule = kpm.findRule(ruleName);
		if ( rule == null ) {
			rule = KpmFactory.eINSTANCE.createRule();
			kpm.getRules().add(rule);
			
			rule.setName(ruleName);
			rule.setEvent(eventName);
			rule.setType(typeName);
			
			in.setRule(rule);
			rule.setIn(in);
			
			for ( Out out : outs)
				out.setRule(rule);
			rule.getOuts().addAll(outs);
	
		}
	
		return rule;
		
	}
	
	
	public static Rule createRule(KPM kpm, String ruleName, String typeName, String eventName, In in, Out out) {
		ArrayList<Out> outs = new ArrayList<Out>();
		outs.add(out);
		return createRule(kpm, ruleName, typeName, eventName, in, outs);
	}
}
