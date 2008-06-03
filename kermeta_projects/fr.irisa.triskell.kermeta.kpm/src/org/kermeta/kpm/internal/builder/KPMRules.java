

/*$Id: KPMRules.java,v 1.3 2008-06-03 07:43:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	KPMRules.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import fr.irisa.triskell.kermeta.kpm.Rule;

/**
 * Kind of cache that keeps track of KPM rules.
 * It avoids to perform search action when retrieving a rule.
 * 
 * @author paco
 *
 */
public class KPMRules {

	/**
	 * ID of KMT Update rule.
	 */
	static final public String UPDATE_KMT_RULE_ID = "Update KMT Files";
	
	/**
	 * KMT Update rule.
	 */
	static public Rule UPDATE_KMT_RULE;
}


