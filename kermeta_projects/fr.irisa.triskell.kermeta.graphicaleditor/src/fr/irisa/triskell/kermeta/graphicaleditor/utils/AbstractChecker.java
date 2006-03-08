/* $Id: AbstractChecker.java,v 1.1 2006-03-08 17:17:25 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : AbstractChecker.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 21 juil. 2005
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 * Description : 
 * 		Pretty print of kmt files from a KermetaUnit.
 * 		It may be subclassed in order to add new pages or customize the messages.
 */
package fr.irisa.triskell.kermeta.graphicaleditor.utils;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 * Pattern command for constraint checking on the model elements of a model
 *
 */
public abstract class AbstractChecker {
	
	protected KermetaUnit builder; 
	protected KM2KMTPrettyPrinter pprinter;
	protected fr.irisa.triskell.kermeta.language.structure.Object element;
	protected fr.irisa.triskell.kermeta.language.structure.Object context;
	
	public AbstractChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object elt,
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		builder = unit;
		element = elt;
		this.context = context;
		pprinter = new KM2KMTPrettyPrinter();
	}
	
	public abstract boolean check();
}
