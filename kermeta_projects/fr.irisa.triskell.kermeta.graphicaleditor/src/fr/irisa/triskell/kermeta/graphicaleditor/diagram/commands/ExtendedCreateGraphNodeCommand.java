/* $Id: ExtendedCreateGraphNodeCommand.java,v 1.1 2006-04-18 13:36:32 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.graphicaleditor
 * File       : ExtendedCreateGraphNodeCommand.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Apr 18, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.topcased.modeler.ModelerPlugin;
import org.topcased.modeler.commands.CreateGraphNodeCommand;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaLabelHelper;

public class ExtendedCreateGraphNodeCommand extends CreateGraphNodeCommand {

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 * @param arg6
	 */
	public ExtendedCreateGraphNodeCommand(EditDomain arg0, GraphNode arg1, GraphNode arg2, Point arg3, Dimension arg4, List arg5, boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}



	/**
     * Update the model after at the end of the redo() method. Overrides CreateGraphNode redoModel.
     * @see org.topcased.modeler.commands.CreateGraphNodeCommand#redoModel()
     */
    protected void redoModel()
    {
        if (getSelectedFeature() != null)
        {
            if (getParentEObject() != null && getChildEObject() != null)
            {
                EList ownerList = Utils.getOwnerList(getParentEObject(), getSelectedFeature());
                if (ownerList == null)
                {
                    if (getParentEObject().eClass().getEAllStructuralFeatures().contains(getSelectedFeature()))
                    {
                        getParentEObject().eSet(getSelectedFeature(), getChildEObject());
                    }
                    else
                    {
                        ModelerPlugin.log("The childNode object is not supported by this parentNode", IStatus.ERROR);
                    }
                }
                else
                {
                	// We just use our great KermetaLabelHelper instead of the topcased provided LabelHelper.
                    KermetaLabelHelper labelHelper = new KermetaLabelHelper();
                    String curName = labelHelper.getName(getEditDomain(), getChildEObject());
                    if (curName == null || "".equals(curName))
                    {
                        labelHelper.initName(getEditDomain(), getParentEObject(), getChildEObject());
                    }
                    if (!ownerList.contains(getChildEObject()))
                        ownerList.add(getChildEObject());
                }
            }
        }
    }


}
