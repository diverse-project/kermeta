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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.edit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.topcased.draw2d.figures.ComposedLabel;
import org.topcased.draw2d.figures.EditableLabel;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.edit.DiagramEditPart;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureImageRegistry;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.ClassDefinitionFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.figures.StructureDiagramFigure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.policies.StructureDiagramLayoutEditPolicy;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDiagramEditPart extends DiagramEditPart {

	/**
	 * The Constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param model the root model element
	 * @generated
	 */
	public StructureDiagramEditPart(Diagram model) {
		super(model);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.DiagramEditPart#getLayoutEditPolicy()
	 * @generated
	 */
	protected EditPolicy getLayoutEditPolicy() {
		return new StructureDiagramLayoutEditPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.edit.DiagramEditPart#createBodyFigure()
	 * @generated
	 */
	protected IFigure createBodyFigure() {
		return new StructureDiagramFigure();
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
	protected void refreshTextAndFont()
    {
        super.refreshTextAndFont();

        // Refresh the font of the graphical element
        // This code move to StructureDiagramFigure
        /*if (getEditableLabel() != null)
        {
            
            ((EditableLabel) getEditableLabel()).setIcon(StructureImageRegistry
        			.getImage("PACKAGE"));
        }*/
    }
}