/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : KermetaConstants.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 20, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils;

import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;

public interface KermetaConstants {
	
	/** default name of a package */
	public static final String FPACKAGE_DEFAULT_NAME = "default";
	/** Model element for the void type */
	public static final Type VoidType = StructureFactory.eINSTANCE.createVoidType();

}
