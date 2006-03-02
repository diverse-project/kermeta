/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : FPropertyEditPartCommonInterface.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 24, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils;

import org.eclipse.draw2d.IFigure;

public interface FPropertyEditPartCommonInterface {

	public IFigure adaptedCreateFigure();

	public void adaptedCreateEditPolicies();

}
