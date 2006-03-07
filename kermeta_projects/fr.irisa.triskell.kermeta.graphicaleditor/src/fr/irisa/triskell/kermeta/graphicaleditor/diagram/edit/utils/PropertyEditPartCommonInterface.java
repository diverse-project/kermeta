/* $Id: PropertyEditPartCommonInterface.java,v 1.1 2006-03-07 17:30:33 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : PropertyEditPartCommonInterface.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 24, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.edit.utils;

import org.eclipse.draw2d.IFigure;

public interface PropertyEditPartCommonInterface {

	public IFigure adaptedCreateFigure();

	public void adaptedCreateEditPolicies();

}
