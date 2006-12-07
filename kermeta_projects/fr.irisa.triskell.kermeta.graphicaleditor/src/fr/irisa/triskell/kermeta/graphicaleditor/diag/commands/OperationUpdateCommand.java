/* $Id: OperationUpdateCommand.java,v 1.3 2006-12-07 10:11:30 dvojtise Exp $
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

package fr.irisa.triskell.kermeta.graphicaleditor.diag.commands;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import fr.irisa.triskell.kermeta.graphicaleditor.diag.dialogs.OperationEditDialog;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.utils.OperationDataStructure;
import fr.irisa.triskell.kermeta.graphicaleditor.diag.utils.ParameterObject;
import fr.irisa.triskell.kermeta.graphicaleditor.editor.EditorReconcilingStrategy;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;

/**
 * Class that create a command in order to update the "Operation" elements. This
 * command is created and executed by the Controller (OperationEditPart) <br>
 * 
 * @generated NOT
 */
public class OperationUpdateCommand extends Command {
	/** Current operation */
	private Operation _operation;

	/** Old values */
	private String _oldName;

	private Type _oldReturnType;

	private Class _oldSuperOperation;

	private OperationDataStructure _oldDataStructure;

	/** New values */
	private String _name;

	private Type _returnType;

	private Class _superOperation;

	private OperationDataStructure _dataStructure;

	private Type _voidType;

	/**
	 * Create a command for updating parameters on a given operation
	 * 
	 * @param operation
	 * @param data
	 */
	public OperationUpdateCommand(Operation operation, Map data) {
		// Store old data
		_oldName = operation.getName();
		_oldReturnType = _returnType;
		_oldSuperOperation = _superOperation;
		_oldDataStructure = new OperationDataStructure(operation);

		_operation = operation;

		// Store new data
		_name = (String) data.get(OperationEditDialog.Operation_NAME);
		_returnType = (Type) data
				.get(OperationEditDialog.Operation_RETURN_TYPE);
		_superOperation = (Class) data
				.get(OperationEditDialog.Operation_SUPER_OPERATION);
		_dataStructure = (OperationDataStructure) data
				.get(OperationEditDialog.Operation_INPUTS);
		_voidType = StructureFactory.eINSTANCE.createVoidType();
	}

	/**
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return true;
	}

	/**
	 * Perform update for operation. - sets the name, parameters, type
	 * parameters, return type, and body stored in the intermediate
	 * OperationDataStructure into the operation The injection of the body
	 * requires a checking : inside this method, a kermeta unit is reset so that
	 * we can check if the operation is well-formed or not.
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		_operation.getContainedType().clear();

		// The operation name
		_operation.setName(_name);

		// The return type
		_operation.setType(_returnType == null ? _voidType : _returnType);

		if (_superOperation != null)
			_operation.setSuperOperation(KermetaUtils.getDefault()
					.getOperationByName(_operation.getName(), _superOperation));

		// Perform update for type parameters
		_operation.getTypeParameter().clear();
		// Perform update for type parameters
		for (Iterator<ParameterObject> iterator = _dataStructure
				.getDataTypeParameters().iterator(); iterator.hasNext();) {
			ParameterObject param_object = iterator.next();
			// TypeDefinition type = _inputTypes.getTypeDefinition(object);
			TypeVariable tvar = StructureFactory.eINSTANCE.createObjectTypeVariable();
			tvar.setName(_dataStructure.getDisplayName(param_object));
			if (param_object.getType() != null)
				tvar.setSupertype(param_object.getType());
			_operation.getTypeParameter().add(tvar);
		}

		// Perform update for parameters
		_operation.getOwnedParameter().clear();
		for (Iterator<ParameterObject> iterator = _dataStructure
				.getDataOwnedParameters().iterator(); iterator.hasNext();) {
			ParameterObject param_object = iterator.next();
			// TypeDefinition type = _inputTypes.getTypeDefinition(object);
			Parameter parameter = StructureFactory.eINSTANCE.createParameter();
			parameter.setName(_dataStructure.getDisplayName(param_object));
			if (param_object.getType() != null) {
				parameter.setType(param_object.getType());
				// We have to update the container (typeFixer is not
				// appropriated for that:
				// since we remove all the parameters -> fixme! -- to update
				// them more easily)
				parameter.getContainedType().add(param_object.getType());
			} else // temp patch if user did not set a type. TODO : by default,
					// impose the VoidType in the graphical editor
			{
				parameter.setType(_voidType);
			}
			_operation.getOwnedParameter().add(parameter);

		}

		if (_dataStructure.getOperationBody() != null) {
			_operation.setBody(ExpressionParser.parse_operation2body(
					EditorReconcilingStrategy.parse(_operation.eResource()),
					_dataStructure.getOperationBody()));
		}

		// FIXME Fix to 1 (default in Kermeta) the upper bound of the operation multiplicity if it was at 0
		if (_operation.getUpper() == 0) {
			_operation.setUpper(1);
		}

		// Ugly
		KermetaUtils.getDefault().getTypeFixer().accept(_operation);
		// Fix the type containments once the Operation element is complete ->
		// not optimal
		//
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		// Reverse old and new value for name
		String tempString = _name;
		_name = _oldName;
		_oldName = tempString;

		// Reverse old and new value for
		Class tempOp = _superOperation;
		_superOperation = _oldSuperOperation;
		_oldSuperOperation = tempOp;

		// Reverse old and new values for type
		Type tempType = _returnType;
		_returnType = _oldReturnType;
		_oldReturnType = tempType;

		// Reverse old and new values for inputType
		OperationDataStructure tempCollection = _dataStructure;
		_dataStructure = _oldDataStructure;
		_oldDataStructure = tempCollection;

		execute();
	}

	/**
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		undo();
	}
}