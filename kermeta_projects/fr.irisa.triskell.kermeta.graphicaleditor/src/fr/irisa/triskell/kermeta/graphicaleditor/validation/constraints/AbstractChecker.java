/* $Id: AbstractChecker.java,v 1.1 2006-03-22 16:24:30 zdrey Exp $
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
package fr.irisa.triskell.kermeta.graphicaleditor.validation.constraints;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * Pattern command for constraint checking on the model elements of a model
 * (Not useful yet?)
 */
public abstract class AbstractChecker {
	
	protected KermetaUnit builder; 
	protected KM2KMTPrettyPrinter pprinter;
	protected fr.irisa.triskell.kermeta.language.structure.Object element;
	protected fr.irisa.triskell.kermeta.language.structure.Object context;
	

	public static final String ERROR_TYPE = "CONSTRAINT-CHECKER";
	public static final String ERROR = "error";
	public static final String WARNING = "warning";
	
	/** KermetaUnit is in fact not very useful yet either ...*/
	public AbstractChecker(KermetaUnit unit, 
			fr.irisa.triskell.kermeta.language.structure.Object elt,
			fr.irisa.triskell.kermeta.language.structure.Object context)
	{
		builder = unit;
		element = elt;
		this.context = context;
		pprinter = new KM2KMTPrettyPrinter();
	}
	
	public abstract Boolean check();
	
	/** A shortcut to add messages on the builder kermeta unit */
	public void addProblem(String msg_kind, String msg, fr.irisa.triskell.kermeta.language.structure.Object node)
	{
		if (msg_kind.equals(ERROR))
			builder.messages.addError(ERROR_TYPE + ": " + msg, node);
		else
			builder.messages.addWarning(ERROR_TYPE + ": " + msg, node);
	}
}
