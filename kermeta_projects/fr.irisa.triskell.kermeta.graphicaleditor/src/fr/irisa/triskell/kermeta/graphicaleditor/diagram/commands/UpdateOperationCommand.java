/* $Id: UpdateOperationCommand.java,v 1.6 2006-04-20 15:06:37 zdrey Exp $
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
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.ParameterObject;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorReconcilingStrategy;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;

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
    
    private fr.irisa.triskell.kermeta.language.structure.Class _oldSuperOperation;

    private OperationDataStructure _oldInputTypes;

    /** New values */
    private String _name;

    /** Returned type TypeDefinition */
    private Type _returnType;
    private fr.irisa.triskell.kermeta.language.structure.Class _superTypeOperation;
    private Type _voidType;
    private boolean _isAbstract;
    
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
        _oldSuperOperation = _superTypeOperation;
        _oldInputTypes = new OperationDataStructure(operation);
        
        _operation = operation;
        // Store new data
        _name = (String) data.get(OperationEditDialog.Operation_NAME);
        _returnType = (Type) data.get(OperationEditDialog.Operation_RETURN_TYPE);
        _superTypeOperation = (fr.irisa.triskell.kermeta.language.structure.Class) data.get(OperationEditDialog.Operation_SUPER_OPERATION);
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
     * Perform update for operation.
     * - sets the name, parameters, type parameters, return type, and body stored in the intermediate OperationDataStructure
     * into the operation 
     * The injection of the body requires a checking : inside this method, a kermeta unit is reset so that we can check if the
     * operation is well-formed or not.
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute()
    {        
    	_operation.getContainedType().clear();
    	
    	// The operation name
        _operation.setName(_name);
        //Type ftype = KermetaUtils.getDefault().createTypeForTypeDefinition(_returnType);
        // TypeDefinition is ClassDefinition or DataType
        // The return type
        _operation.setType(_returnType==null?_voidType:_returnType);
        
        if (_superTypeOperation!=null)
        	_operation.setSuperOperation(KermetaUtils.getDefault().getOperationByName(
        			_operation.getName(), 
        			_superTypeOperation));
        
        //_operation.setIsAbstract(true);
        
        // Perform update for input parameters
       
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
        
        _operation.getOwnedParameter().clear();

        for (Iterator<ParameterObject> iterator = _dataStructure.getDataOwnedParameters().iterator(); iterator.hasNext();)
        {
            ParameterObject object = iterator.next();
            String name = _dataStructure.getDisplayName(object);
            //TypeDefinition type = _inputTypes.getTypeDefinition(object);
            Parameter parameter = StructureFactory.eINSTANCE.createParameter();
            parameter.setName(name); 
            if (object.getType() != null)
            {
            	parameter.setType(object.getType());
            	// We have to update the container (typeFixer is not appropriated for that:
            	// since we remove all the parameters -> fixme! -- to update them more easily)
            	parameter.getContainedType().add(object.getType());
            }
            else // temp patch if user did not set a type. TODO : by default, impose the VoidType in the graphical editor
            {
            	parameter.setType(_voidType);
            }
            _operation.getOwnedParameter().add(parameter);
            
        }
        _operation.setBody(ExpressionParser.parse_operation2body(
        		EditorReconcilingStrategy.parse(_operation.eResource()), 
        		_dataStructure.getOperationBody()));
        
        // Ugly
        KermetaUnit.fixTypeContainement((Package)_operation.getOwningClass().eContainer());
        // Fix the type containments once the Operation element is complete -> not optimal
        //KermetaUtils.getDefault().getTypeFixer().accept(_operation);
        
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