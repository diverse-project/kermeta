

/*$Id: ReportUsingError.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	RequireResolver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 19 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.core;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Using;

public class ReportUsingError {

	public static void propagateErrors(KermetaUnit kermetaUnit) {
		
		for ( Using using : kermetaUnit.getModelingUnit().getUsings() ) {
			
			if ( kermetaUnit.getPackages(using.getQualifiedName()).isEmpty() ) {
				Object node = kermetaUnit.getNodeByModelElement(using);
				String message = "Bad using statement. The package " + using.getQualifiedName() + " does not exist.";
				kermetaUnit.error(message, node);
			}
			
		}
				
	}
	
}


