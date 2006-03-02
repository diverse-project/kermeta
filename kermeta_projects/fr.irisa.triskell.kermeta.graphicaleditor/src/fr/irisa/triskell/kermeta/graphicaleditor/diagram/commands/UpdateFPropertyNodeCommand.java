/* $Id$
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : UpdateFOperationCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 17, 2006
 * Authors       : zdrey
 * Contributors:
 *    David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *     Jacques Lescot (Anyware Technologies) - initial API and implementation
 * ----------------------------------------------------------------------------
 */

package fr.irisa.triskell.kermeta.graphicaleditor.diagram.commands;

import java.util.Map;

import org.eclipse.gef.commands.Command;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.FOperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.FPropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * Class that create a command in order to update the "FOperation" elements.
 * This command is created and executed by the Controller (FOperationEditPart)
 *  <br>
 * @generated NOT
 */
public class UpdateFPropertyNodeCommand extends Command
{
    /** Current property */
    private FProperty _property;

    /** Old values */
    private String _oldName;
    private FType _oldType;

    /** New values */
    private String _name;

    /** Type of the property */
    private FType _type;

    /**
     * Create a command for updating parameters on a given property
     * 
     * @param property
     * @param data
     */
    public UpdateFPropertyNodeCommand(FProperty property, Map data)
    {
    	// Store old data
        _oldName = property.getFName();
        _oldType = _type;
        _property = property;
        // Store new data
        _name = (String) data.get(FPropertyEditDialog.FProperty_NAME);
        _type = (FType) data.get(FPropertyEditDialog.FProperty_TYPE);
    }

    /**
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute()
    {
        return true;
    }

    /**
     * Perform update for property
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute()
    {
    	// The property name
        _property.setFName(_name);
        //FType ftype = KermetaUtils.getDefault().createFTypeForFTypeDefinition(_type);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _property.setFType(_type);
        // Perform update for property type
        _property.getFContainedType().clear();
         
        // Fix the type containments once the FOperation element is complete -> not optimal
        KermetaUtils.getDefault().getTypeFixer().accept(_property);
        
    }

    /**
     * @see org.eclipse.gef.commands.Command#undo()
     */
    public void undo()
    {
        // Reverse old and new value for name
        String tempString = _name;
        _name = _oldName;
        _oldName = tempString;

        // Reverse old and new values for type
        FType tempType = _type;
        _type = _oldType;
        _oldType = tempType;
        execute();
    }

    /**
     * @see org.eclipse.gef.commands.Command#redo()
     */
    public void redo()
    {
        undo();
    }
}