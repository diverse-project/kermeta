/*******************************************************************************
 * $Id: FsmDiagramEditPart.java,v 1.4 2007-07-11 16:13:16 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;

import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.figures.FsmDiagramFigure;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram.policies.FsmDiagramLayoutEditPolicy;

/**
 * @generated
 */
public class FsmDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 *
	 * @param model the root model element
	 * @generated
	 */
	public FsmDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new FsmDiagramLayoutEditPolicy();
	}

	/**
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new FsmDiagramFigure();
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleModelChanged(Notification msg) {
		super.handleModelChanged(msg);
		for (java.util.Iterator aIt = this.children.iterator(); aIt.hasNext();) {
			Object tmp = aIt.next();
			if (tmp instanceof StateEditPart) {
				((StateEditPart) tmp).refreshVisuals();
			}
		}
	}
}