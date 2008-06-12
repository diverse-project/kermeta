/* $Id: kunit.java,v 1.4 2008-06-12 07:17:54 ftanguy Exp $
 * Project    : fr.irisa.triskell.kermeta.framework
 * File       : kunit.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 19 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr> 
 */
package fr.irisa.triskell.kermeta.runtime.testing;

import junit.framework.Assert;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;

/**
 * Implementation of some low level functions needed for unitaty testing using kunit.kmt.
 * kunit.kmt is a clone of Junit in the context of kermeta
 * @author dvojtise
 */
public class kunit extends Assert{
    
    /**  Implementation of method assertTrue called as : <br>
	 * extern fr::irisa::triskell::kermeta::runtime::testing::kunit.assertTrue(message,condition)<br>
	 * It raises an assertion if the condition is not true
	 */
	public static void assertTrue(RuntimeObject messageRO, RuntimeObject condition) {
		assertTrue(String.getValue(messageRO), Boolean.getValue(condition) );
	}
	
    /**  Implementation of method fail called as : <br>
	 * extern fr::irisa::triskell::kermeta::runtime::testing::kunit.fail(message)<br>
	 * It raises an assertion with the given message
	 */
	public static void fail(RuntimeObject messageRO) {	    
		fail(String.getValue(messageRO) );
	}
}
