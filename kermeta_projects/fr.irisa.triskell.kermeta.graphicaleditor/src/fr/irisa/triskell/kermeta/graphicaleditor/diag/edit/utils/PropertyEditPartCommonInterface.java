/* $Id: PropertyEditPartCommonInterface.java,v 1.1 2006-10-04 08:37:17 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : PropertyEditPartCommonInterface.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 24, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diag.edit.utils;

import org.eclipse.draw2d.IFigure;

public interface PropertyEditPartCommonInterface {

	public IFigure adaptedCreateFigure();

	public void adaptedCreateEditPolicies();

}
