/* $Id: UpdateOperationCommand.java,v 1.1 2006-03-07 17:30:33 zdrey Exp $
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

import java.util.Iterator;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.OperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.ParameterObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

/**
 * Class that create a command in order to update the "Operation" elements.
 * This command is created and executed by the Controller (OperationEditPart)
 *  <br>
 * @generated NOT
 */
public class UpdateOperationCommand extends Command
{
    /** Current operation */
    private Operation _operation;

    /** Old values */
    private String _oldName;

    private Type _oldReturnType;

    private OperationDataStructure _oldInputTypes;

    /** New values */
    private String _name;

    /** Returned type TypeDefinition */
    private Type _returnType;
    private Type _voidType;

    private OperationDataStructure _dataStructure;

    /**
     * Create a command for updating parameters on a given operation
     * 
     * @param operation
     * @param data
     */
    public UpdateOperationCommand(Operation operation, Map data)
    {
    	// Store old data
        _oldName = operation.getName();
        _oldReturnType = _returnType;
        _oldInputTypes = new OperationDataStructure(operation);
        
        _operation = operation;
        // Store new data
        _name = (String) data.get(OperationEditDialog.Operation_NAME);
        _returnType = (Type) data.get(OperationEditDialog.Operation_RETURN_TYPE);
        _dataStructure = (OperationDataStructure) data.get(OperationEditDialog.Operation_INPUTS);
        
        _voidType = StructureFactory.eINSTANCE.createVoidType();
    }

    /**
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute()
    {
        return true;
    }

    /**
     * Perform update for operation
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute()
    {
    	// The operation name
        _operation.setName(_name);
        //Type ftype = KermetaUtils.getDefault().createTypeForTypeDefinition(_returnType);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _operation.setType(_returnType);
        
        _operation.setIsAbstract(true);
        
        // Perform update for input parameters

        _operation.getContainedType().clear();
        _operation.getOwnedParameter().clear();

        for (Iterator<ParameterObject> iterator = _dataStructure.getDataOwnedParameters().iterator(); iterator.hasNext();)
        {
            ParameterObject object = iterator.next();
            String name = _dataStructure.getDisplayName(object);
            //TypeDefinition type = _inputTypes.getTypeDefinition(object);
            Parameter parameter = StructureFactory.eINSTANCE.createParameter();
            parameter.setName(name); 
            if (object.getType() != null)
            	parameter.setType(object.getType());
            else // temp patch if user did not set a type. TODO : by default, impose the VoidType in the graphical editor
            	parameter.setType(_voidType);
            KermetaUtils.getDefault().getTypeFixer().accept(parameter);
            _operation.getOwnedParameter().add(parameter);
        }
        _operation.getTypeParameter().clear();
        // Perform update for type parameters
        for (Iterator<ParameterObject> iterator = _dataStructure.getDataTypeParameters().iterator(); iterator.hasNext();)
        {
            ParameterObject object = iterator.next();
            String name = _dataStructure.getDisplayName(object);
            //TypeDefinition type = _inputTypes.getTypeDefinition(object);
            TypeVariable tvar = StructureFactory.eINSTANCE.createTypeVariable();
            tvar.setName(name);
            if (object.getType() != null)
            	tvar.setSupertype(object.getType());
            _operation.getTypeParameter().add(tvar);
        }
         
        // Fix the type containments once the Operation element is complete -> not optimal
        KermetaUtils.getDefault().getTypeFixer().accept(_operation);
        
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
        Type tempType = _returnType;
        _returnType = _oldReturnType;
        _oldReturnType = tempType;

        // Reverse old and new values for inputType
        OperationDataStructure tempCollection = _dataStructure;
        _dataStructure = _oldInputTypes;
        _oldInputTypes = tempCollection;

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