/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractLogoInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_BinaryExp((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Primitive) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Primitive((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Primitive) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction) {
			result = interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Instruction((org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Instruction(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Instruction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Primitive(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Primitive object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Back(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Forward(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Left(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Right(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenDown(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_PenUp(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Clear(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Expression(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_BinaryExp(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.BinaryExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Constant(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcCall(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ProcDeclaration(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Block(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_If(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ControlStructure(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Repeat(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_While(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Parameter(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_ParameterCall(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Plus(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Minus(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Mult(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Div(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Equals(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Greater(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_Lower(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kermeta_kmlogo_logoasm_model_kmLogo_ASM_LogoProgram(org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
