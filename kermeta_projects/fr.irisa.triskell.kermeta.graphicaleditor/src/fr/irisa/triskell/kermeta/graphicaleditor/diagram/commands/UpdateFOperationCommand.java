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

import java.util.Iterator;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import fr.irisa.triskell.kermeta.graphicaleditor.diagram.dialogs.FOperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.FOperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.ParameterObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.StructureFactory;

/**
 * Class that create a command in order to update the "FOperation" elements.
 * This command is created and executed by the Controller (FOperationEditPart)
 *  <br>
 * @generated NOT
 */
public class UpdateFOperationCommand extends Command
{
    /** Current operation */
    private FOperation _operation;

    /** Old values */
    private String _oldName;

    private FType _oldReturnType;

    private FOperationDataStructure _oldInputTypes;

    /** New values */
    private String _name;

    /** Returned type TypeDefinition */
    private FType _returnType;
    private FType _voidType;

    private FOperationDataStructure _dataStructure;

    /**
     * Create a command for updating parameters on a given operation
     * 
     * @param operation
     * @param data
     */
    public UpdateFOperationCommand(FOperation operation, Map data)
    {
    	// Store old data
        _oldName = operation.getFName();
        _oldReturnType = _returnType;
        _oldInputTypes = new FOperationDataStructure(operation);
        
        _operation = operation;
        // Store new data
        _name = (String) data.get(FOperationEditDialog.FOperation_NAME);
        _returnType = (FType) data.get(FOperationEditDialog.FOperation_RETURN_TYPE);
        _dataStructure = (FOperationDataStructure) data.get(FOperationEditDialog.FOperation_INPUTS);
        
        _voidType = StructureFactory.eINSTANCE.createFVoidType();
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
        _operation.setFName(_name);
        //FType ftype = KermetaUtils.getDefault().createFTypeForFTypeDefinition(_returnType);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _operation.setFType(_returnType);
        
        _operation.setFIsAbstract(true);
        
        // Perform update for input parameters

        _operation.getFContainedType().clear();
        _operation.getFOwnedParameter().clear();

        for (Iterator<ParameterObject> iterator = _dataStructure.getDataOwnedParameters().iterator(); iterator.hasNext();)
        {
            ParameterObject object = iterator.next();
            String name = _dataStructure.getDisplayName(object);
            //FTypeDefinition type = _inputTypes.getTypeDefinition(object);
            FParameter parameter = StructureFactory.eINSTANCE.createFParameter();
            parameter.setFName(name); 
            if (object.getType() != null)
            	parameter.setFType(object.getType());
            else // temp patch if user did not set a type. TODO : by default, impose the FVoidType in the graphical editor
            	parameter.setFType(_voidType);
            KermetaUtils.getDefault().getTypeFixer().accept(parameter);
            _operation.getFOwnedParameter().add(parameter);
        }
        _operation.getFTypeParameter().clear();
        // Perform update for type parameters
        for (Iterator<ParameterObject> iterator = _dataStructure.getDataTypeParameters().iterator(); iterator.hasNext();)
        {
            ParameterObject object = iterator.next();
            String name = _dataStructure.getDisplayName(object);
            //FTypeDefinition type = _inputTypes.getTypeDefinition(object);
            FTypeVariable tvar = StructureFactory.eINSTANCE.createFTypeVariable();
            tvar.setFName(name);
            if (object.getType() != null)
            	tvar.setFSupertype(object.getType());
            _operation.getFTypeParameter().add(tvar);
        }
         
        // Fix the type containments once the FOperation element is complete -> not optimal
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
        FType tempType = _returnType;
        _returnType = _oldReturnType;
        _oldReturnType = tempType;

        // Reverse old and new values for inputType
        FOperationDataStructure tempCollection = _dataStructure;
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