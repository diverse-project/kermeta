/***********************************************************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 **********************************************************************************************************************/
package org.openembedd.logo.csm.diagram.block.policies;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.openembedd.logo.csm.diagram.block.LogoCSMRequestConstants;
import org.openembedd.logo.csm.diagram.block.commands.EditExpressionCommand;
import org.openembedd.logo.csm.logoCSM.Constant;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.Instruction;
import org.openembedd.logo.csm.logoCSM.LogoCSMPackage;
import org.openembedd.logo.csm.logoCSM.Primitive;
import org.openembedd.logo.csm.logoCSM.Repeat;
import org.openembedd.logo.csm.logoCSM.impl.LogoCSMFactoryImpl;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.utils.Utils;

/**
 * 
 */
public class InstructionEditPolicy extends AbstractEditPolicy
{
	// added by vmahe to be able to modify values on the diagram
	String	DIRECT_EDIT	= "direct edit";

	/**
	 * Default contructor
	 * 
	 */
	public InstructionEditPolicy()
	{
		super();
	}

	/**
	 * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#getCommand(org.eclipse.gef.Request)
	 */
	public Command getCommand(Request request)
	{

		// DEBUG
		System.err.println("DEBUG InstructionEditPolicy.getCommand() - request type = " + request.getType());

		if (LogoCSMRequestConstants.REQ_EDIT_EXPRESSION.equals(request.getType()))
		{
			EObject obj = Utils.getElement((GraphElement) getHost().getModel());
			if (obj instanceof Instruction)
			{
				Map<String, Expression> params = request.getExtendedData();
				EditExpressionCommand command = new EditExpressionCommand((Instruction) obj, params);
				return command;
			}
			return null;
		}

		// ugly hack added by vmahe to be able to modify values on the diagram
		if (DIRECT_EDIT.equals(request.getType()))
		{
			EObject obj = Utils.getElement((GraphElement) getHost().getModel());
			if (obj instanceof Instruction)
			{
				Constant constant = (Constant) LogoCSMFactoryImpl.init().create(LogoCSMPackage.Literals.CONSTANT);
				String text = (String) ((DirectEditRequest) request).getCellEditor().getValue();
				constant.setIntegerValue(Integer.parseInt(text));

				Map<String, Expression> params = new HashMap<String, Expression>();
				params.put(LogoCSMRequestConstants.REQ_EDIT_EXPRESSION, constant);

				EditExpressionCommand command = new EditExpressionCommand((Instruction) obj, params);
				return command;
			}
			return null;
		}

		return super.getCommand(request);
	}

	/**
	 * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#understandsRequest(org.eclipse.gef.Request)
	 */
	public boolean understandsRequest(Request req)
	{
		if (LogoCSMRequestConstants.REQ_EDIT_EXPRESSION.equals(req.getType()))
		{
			EObject obj = Utils.getElement((GraphElement) getHost().getModel());
			return (obj instanceof Primitive || obj instanceof Repeat);
		}
		return super.understandsRequest(req);
	}
}
