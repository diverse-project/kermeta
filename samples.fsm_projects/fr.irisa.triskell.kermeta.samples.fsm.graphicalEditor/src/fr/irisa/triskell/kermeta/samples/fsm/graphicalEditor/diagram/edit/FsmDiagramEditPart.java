/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
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
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the root model element
	 * @generated
	 */
	public FsmDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new FsmDiagramLayoutEditPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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