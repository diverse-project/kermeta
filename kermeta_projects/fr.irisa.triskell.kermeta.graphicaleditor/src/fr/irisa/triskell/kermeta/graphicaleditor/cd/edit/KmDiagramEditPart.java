/*******************************************************************************
 * $Id: KmDiagramEditPart.java,v 1.3 2007-07-23 09:21:25 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.figures.KmDiagramFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.policies.KmDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class KmDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public KmDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new KmDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new KmDiagramFigure();
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleModelChanged(Notification msg) {
		super.handleModelChanged(msg);

		for (java.util.Iterator aIt = this.getChildren().iterator(); aIt
				.hasNext();) {
			Object tmp = aIt.next();

			if (tmp instanceof ClassDefinitionEditPart) {
				((ClassDefinitionEditPart) tmp).refreshHeaderLabel();
			}
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void refreshTextAndFont() {
		super.refreshTextAndFont();
	}
}