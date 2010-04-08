package fr.irisa.triskell.kermeta.interpreter;

import java.util.Stack;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.traceability.TextReference;

public class StackFactory {

	static public String getFrom(Stack<CallFrame> frames) {
		String stackInfo = "";
		OperationCallFrame lastCallFrame = null;
		for ( CallFrame f : frames ) {
			if ( ! stackInfo.equals("") )
				stackInfo += "#";
			if ( f instanceof OperationCallFrame ) {
				stackInfo += getFrom( (OperationCallFrame) f);
				lastCallFrame = (OperationCallFrame) f;
			} else if ( f instanceof ExpressionCallFrame )
				stackInfo += getFrom( (ExpressionCallFrame) f );
			else if ( f instanceof LambdaCallFrame )
				stackInfo += getFrom( (LambdaCallFrame) f, lastCallFrame );
		}
		return stackInfo;
	}
	
	static private String getFrom(OperationCallFrame frame) {
    	String stackInfo = "";
    	TextReference reference = null;
    	try {
			// The getOperation call raise an error. That means that the call is about a derived property.
			frame.getOperation();
			// Getting a text reference on the last behavior expression.
			if ( frame.peekExpressionContext() != null ) {
				Expression statement = (Expression) frame.peekExpressionContext().getStatement();
				if ( statement == null )
					statement = (Expression) frame.getExpression();
				KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( statement );
				reference = kermetaUnit.getTracer().getFirstTextReference( statement );
				if ( reference == null ) {
					stackInfo += kermetaUnit.getUri().replace("platform:/resource", "");
					stackInfo += "|" + 0;
				} else {
					stackInfo += reference.getFileURI().replace("platform:/resource", "");
					stackInfo += "|" + reference.getLineBeginAt();
				}
				stackInfo += "|" + frame.getOperation().getOwningClass().getName();
				stackInfo += "|operation*" + frame.getOperation().getName();
				// Adding info on variables.
				for ( Variable var : frame.getVariables() ) {
					VariableKind kind = getVariableKind(var, frame);
					switch ( kind ) {
					case PARAMETER :
						stackInfo += "|parameter*" + var.getName();
						break;
					case VARIABLE :
						stackInfo += "|variable*" + var.getName();
						break;
					default :
						break;
					}
				}
				// Adding info on properties.
				for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(kermetaUnit, frame.getOperation().getOwningClass()) ) {
					// We voluntarily don't take the derived property because getter and setter are some piece of code you may want to debug.
					if ( ! p.isIsDerived() ) {
						if ( p.isIsComposite() )	
							stackInfo += "|attribute*" + p.getName();
						else
							stackInfo += "|reference*" + p.getName();
					}
				}
			}
		} catch ( Error e ) {
			// Do nothing, the getOperation call raised an error because the call frame is about a derived property.
			Expression statement = (Expression) frame.peekExpressionContext().getStatement();
			KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject( statement );
			reference = kermetaUnit.getTracer().getFirstTextReference( statement );				if ( reference == null ) {
				stackInfo += kermetaUnit.getUri().replace("platform:/resource", "");
				stackInfo += "|" + 0;
			} else {
				stackInfo += reference.getFileURI().replace("platform:/resource", "");
				stackInfo += "|" + reference.getLineBeginAt();
			}
			stackInfo += "|" + frame.getProperty().getOwningClass().getName();
			stackInfo += "|property*" + frame.getProperty().getName();
			// Adding info on properties.
			for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(kermetaUnit, frame.getProperty().getOwningClass()) ) {
				if ( p.isIsDerived() )
					stackInfo += "|property*" + p.getName();
				else if ( p.isIsComposite() )	
					stackInfo += "|attribute*" + p.getName();
				else
					stackInfo += "|reference*" + p.getName();
			}
		}
		return stackInfo;
	}
	
	static private String getFrom(ExpressionCallFrame frame) {
		return "";
	}
	
	static private String getFrom(LambdaCallFrame frame, OperationCallFrame opFrame) {
		String stackInfo = "";
		Stack<ExpressionContext> expressionContext = (Stack<ExpressionContext>) frame.getExpressionContext().clone();
		while ( ! expressionContext.isEmpty() ) {
			ExpressionContext context = expressionContext.pop();
			Expression statement = (Expression) context.getStatement();
			if ( statement != null ) {
				KermetaUnit kermetaunit = KermetaUnitHelper.getKermetaUnitFromObject( statement );
				TextReference reference = kermetaunit.getTracer().getFirstTextReference( statement );
				stackInfo += reference.getFileURI().replace("platform:/resource", "");
				stackInfo += "|" + reference.getLineBeginAt();

				stackInfo += "|" + opFrame.getOperation().getOwningClass().getName();
				stackInfo += "|operation*" + opFrame.getOperation().getName();
				stackInfo += "$";
				for ( Parameter p : opFrame.getOperation().getOwnedParameter() ) {
					if ( p.getType() instanceof FunctionType ) {
						//FunctionType ft = (FunctionType) p.getType();
						stackInfo += p.getName();
						/*Type leftType = ft.getLeft();
						if ( leftType instanceof ObjectTypeVariable ) {
							stackInfo += ((ObjectTypeVariable) leftType).getName();
						} else
							System.out.println();*/
					}
				}

				ClassDefinition cd = frame.getOperation().getOwningClass();
				// Adding info on properties.
				for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(kermetaunit, cd) ) {
					if ( p.isIsDerived() )
						stackInfo += "|property*" + p.getName();
					else if ( p.isIsComposite() )	
						stackInfo += "|attribute*" + p.getName();
					else
						stackInfo += "|reference*" + p.getName();
				}
			}
			for ( Variable v : context.getVariables().values() )
				stackInfo += "|variable*" + v.getName();
		}
		return stackInfo;
	}
	
    static private VariableKind getVariableKind(Variable var, OperationCallFrame frame) {
    	for (Parameter param : frame.getOperation().getOwnedParameter() )
    		if ( param.getName().equals(var.getName()) )
    			return VariableKind.PARAMETER;
    	return VariableKind.VARIABLE;
    }
}
