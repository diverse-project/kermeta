/* $Id: UpdatePropertyNodeCommand.java,v 1.1 2006-03-07 17:30:33 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.graphicaleditor (First iteration)
 * File      : UpdateOperationCommand.java
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

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.OperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.PropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;

/**
 * Class that create a command in order to update the "Operation" elements.
 * This command is created and executed by the Controller (OperationEditPart)
 *  <br>
 * @generated NOT
 */
public class UpdatePropertyNodeCommand extends Command
{
    /** Current property */
    private Property _property;

    /** Old values */
    private String _oldName;
    private Type _oldType;

    /** New values */
    private String _name;

    /** Type of the property */
    private Type _type;

    /**
     * Create a command for updating parameters on a given property
     * 
     * @param property
     * @param data
     */
    public UpdatePropertyNodeCommand(Property property, Map data)
    {
    	// Store old data
        _oldName = property.getName();
        _oldType = _type;
        _property = property;
        // Store new data
        _name = (String) data.get(PropertyEditDialog.Property_NAME);
        _type = (Type) data.get(PropertyEditDialog.Property_TYPE);
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
        _property.setName(_name);
        //Type ftype = KermetaUtils.getDefault().createTypeForTypeDefinition(_type);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _property.setType(_type);
        // Perform update for property type
        _property.getContainedType().clear();
         
        // Fix the type containments once the Operation element is complete -> not optimal
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
        Type tempType = _type;
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