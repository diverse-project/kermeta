/***********************************************************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 **********************************************************************************************************************/
package org.openembedd.logo.csm.diagram.block.commands;

import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.openembedd.logo.csm.diagram.block.LogoCSMRequestConstants;
import org.openembedd.logo.csm.logoCSM.Back;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.Forward;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.openembedd.logo.csm.logoCSM.Left;
import org.openembedd.logo.csm.logoCSM.Repeat;
import org.openembedd.logo.csm.logoCSM.Right;

/**
 * 
 */
public class EditExpressionCommand extends Command
{
	private Instruction	instruction;

	private Expression	oldExpression;

	private Expression	newExpression;

	/**
	 * Constructor
	 * 
	 * @param item
	 *        the model Object Instruction
	 * @param params
	 *        a Map that contains the new Expression
	 */
	public EditExpressionCommand(Instruction instruction, Map<String, Expression> params)
	{
		super("Edit Expression");
		this.instruction = instruction;
		newExpression = params.get(LogoCSMRequestConstants.REQ_EDIT_EXPRESSION);
	}

	/**
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute()
	{
		return instruction != null && newExpression != null;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute()
	{
		if (instruction instanceof Forward)
			oldExpression = ((Forward) instruction).getSteps();
		else if (instruction instanceof Back)
			oldExpression = ((Back) instruction).getSteps();
		else if (instruction instanceof Left)
			oldExpression = ((Left) instruction).getAngle();
		else if (instruction instanceof Right)
			oldExpression = ((Right) instruction).getAngle();
		else if (instruction instanceof Repeat)
			oldExpression = ((Repeat) instruction).getCondition();
		redo();
	}

	/**
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo()
	{
		if (instruction instanceof Forward)
			((Forward) instruction).setSteps(newExpression);
		else if (instruction instanceof Back)
			((Back) instruction).setSteps(newExpression);
		else if (instruction instanceof Left)
			((Left) instruction).setAngle(newExpression);
		else if (instruction instanceof Right)
			((Right) instruction).setAngle(newExpression);
		else if (instruction instanceof Repeat)
			((Repeat) instruction).setCondition(newExpression);
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo()
	{
		if (instruction instanceof Forward)
			((Forward) instruction).setSteps(oldExpression);
		else if (instruction instanceof Back)
			((Back) instruction).setSteps(oldExpression);
		else if (instruction instanceof Left)
			((Left) instruction).setAngle(oldExpression);
		else if (instruction instanceof Right)
			((Right) instruction).setAngle(oldExpression);
		else if (instruction instanceof Repeat)
			((Repeat) instruction).setCondition(oldExpression);
	}

}
