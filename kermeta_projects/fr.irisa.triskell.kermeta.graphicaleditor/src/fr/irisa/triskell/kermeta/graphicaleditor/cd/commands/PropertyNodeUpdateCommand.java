/* $Id: PropertyNodeUpdateCommand.java,v 1.1 2007-02-06 17:45:45 cfaucher Exp $
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

package fr.irisa.triskell.kermeta.graphicaleditor.cd.commands;

import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.gef.commands.Command;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.dialogs.PropertyEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.VoidType;

/**
 * Class that create a command in order to update the "Operation" elements.
 * This command is created and executed by the Controller (OperationEditPart)
 *  <br>
 * @generated NOT
 */
public class PropertyNodeUpdateCommand extends Command
{
    /** Current property */
    private Property _property;

    /** Old values */
    private String _oldName;
    private Type _oldType;
    private String _oldMultiplicity;

    /** New values */
    private String _name;

    /** Type of the property */
    private Type _type;
    
    /** Multiplicity, (textual, i.e "[x..y]") of the property */
    private String _multiplicity;

	private VoidType _voidType;

    /**
     * Create a command for updating parameters on a given property
     * 
     * @param property
     * @param data
     */
    public PropertyNodeUpdateCommand(Property property, Map data)
    {	
    	// Store old data
        _oldName = property.getName();
        _oldType = _type;
        _oldMultiplicity = getMultiplicityText(property); // ?
        _voidType = StructureFactory.eINSTANCE.createVoidType();
        
        _property = property;
        
        // Store new data
        _name = (String) data.get(PropertyEditDialog.Property_NAME);
        _type = (Type) data.get(PropertyEditDialog.Property_TYPE);
        
        
       
        // We handle the case user didnot provide a correct format
        _multiplicity = (String) data.get(PropertyEditDialog.Property_MULTIPLICITY);
        if (_multiplicity == null || !Pattern.matches("\\[(\\d)+..((\\d)+|(-1){1}|\\*)\\]", _multiplicity))
        {
        	_multiplicity = "[0..1]";
        }
    }
    
    /**
     * A method helper to get the textual representation of the multiplicity
     */
    public String getMultiplicityText(Property property)
    {
    	return "[" + String.valueOf(property.getUpper()) + ".." + String.valueOf(property.getLower()) + "]";
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
    	_property.getContainedType().clear();
    	// The property name
        _property.setName(_name);
        //Type ftype = KermetaUtils.getDefault().createTypeForTypeDefinition(_type);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _property.setType(_type==null?_voidType:_type);
        
        // Update the property multiplicity
        String lower_str = _multiplicity.substring(1, _multiplicity.indexOf("."));
        String upper_str = _multiplicity.substring(_multiplicity.lastIndexOf(".")+1, _multiplicity.indexOf("]"));

        int lower = Integer.valueOf(lower_str);
        int upper = upper_str.equals("*")?-1:Integer.valueOf(upper_str);
        _property.setUpper(upper);
        _property.setLower(lower);
        
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