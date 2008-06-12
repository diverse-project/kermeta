//$Id: KermetaOptimizedVisitor.java,v 1.19 2008-06-12 07:16:10 ftanguy Exp $
/*
 * This code has been generated to visit a kermeta model
 * Creation date: Thu Jun 12 07:02:18 GMT 2008
 * Template Created on feb. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * IRISA / INRIA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
package fr.irisa.triskell.kermeta.visitor;
import java.util.Hashtable;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.apache.commons.logging.Log;
import org.kermeta.log4j.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
public class KermetaOptimizedVisitor {
  final static public Log internalLog = LogConfigurationHelper
			.getLogger("KMT.model");
  /** The parent of the node currently visited. */
  protected fr.irisa.triskell.kermeta.language.structure.Object parent;
	private static Hashtable<String,AcceptCommand> acceptCmds = null;
 
  public void setParent(fr.irisa.triskell.kermeta.language.structure.Object parent) {
    this.parent = parent; }
 
  public fr.irisa.triskell.kermeta.language.structure.Object getParent() {
    return parent; }
	private static AcceptCommand getAcceptCmd(EObject node) {
		if (acceptCmds == null) {
			acceptCmds = new Hashtable<String,AcceptCommand>();
			acceptCmds.put("CallVariable",
					new CallVariableAcceptCommand());
			acceptCmds.put("CallFeature",
					new CallFeatureAcceptCommand());
			acceptCmds.put("CallSuperOperation",
					new CallSuperOperationAcceptCommand());
			acceptCmds.put("CallResult",
					new CallResultAcceptCommand());
			acceptCmds.put("CallValue",
					new CallValueAcceptCommand());
			acceptCmds.put("Assignment",
					new AssignmentAcceptCommand());
			acceptCmds.put("Block",
					new BlockAcceptCommand());
			acceptCmds.put("Conditional",
					new ConditionalAcceptCommand());
			acceptCmds.put("Raise",
					new RaiseAcceptCommand());
			acceptCmds.put("Rescue",
					new RescueAcceptCommand());
			acceptCmds.put("TypeReference",
					new TypeReferenceAcceptCommand());
			acceptCmds.put("EmptyExpression",
					new EmptyExpressionAcceptCommand());
			acceptCmds.put("JavaStaticCall",
					new JavaStaticCallAcceptCommand());
			acceptCmds.put("LambdaExpression",
					new LambdaExpressionAcceptCommand());
			acceptCmds.put("LambdaParameter",
					new LambdaParameterAcceptCommand());
			acceptCmds.put("IntegerLiteral",
					new IntegerLiteralAcceptCommand());
			acceptCmds.put("StringLiteral",
					new StringLiteralAcceptCommand());
			acceptCmds.put("BooleanLiteral",
					new BooleanLiteralAcceptCommand());
			acceptCmds.put("TypeLiteral",
					new TypeLiteralAcceptCommand());
			acceptCmds.put("VoidLiteral",
					new VoidLiteralAcceptCommand());
			acceptCmds.put("Loop",
					new LoopAcceptCommand());
			acceptCmds.put("SelfExpression",
					new SelfExpressionAcceptCommand());
			acceptCmds.put("VariableDecl",
					new VariableDeclAcceptCommand());
			acceptCmds.put("Operation",
					new OperationAcceptCommand());
			acceptCmds.put("Property",
					new PropertyAcceptCommand());
			acceptCmds.put("Type",
					new TypeAcceptCommand());
			acceptCmds.put("EnumerationLiteral",
					new EnumerationLiteralAcceptCommand());
			acceptCmds.put("TypeVariableBinding",
					new TypeVariableBindingAcceptCommand());
			acceptCmds.put("Object",
					new ObjectAcceptCommand());
			acceptCmds.put("MultiplicityElement",
					new MultiplicityElementAcceptCommand());
			acceptCmds.put("TypeDefinition",
					new TypeDefinitionAcceptCommand());
			acceptCmds.put("Class",
					new ClassAcceptCommand());
			acceptCmds.put("Enumeration",
					new EnumerationAcceptCommand());
			acceptCmds.put("Package",
					new PackageAcceptCommand());
			acceptCmds.put("Parameter",
					new ParameterAcceptCommand());
			acceptCmds.put("PrimitiveType",
					new PrimitiveTypeAcceptCommand());
			acceptCmds.put("Tag",
					new TagAcceptCommand());
			acceptCmds.put("Constraint",
					new ConstraintAcceptCommand());
			acceptCmds.put("ClassDefinition",
					new ClassDefinitionAcceptCommand());
			acceptCmds.put("ObjectTypeVariable",
					new ObjectTypeVariableAcceptCommand());
			acceptCmds.put("ModelType",
					new ModelTypeAcceptCommand());
			acceptCmds.put("ModelTypeVariable",
					new ModelTypeVariableAcceptCommand());
			acceptCmds.put("VirtualType",
					new VirtualTypeAcceptCommand());
			acceptCmds.put("Model",
					new ModelAcceptCommand());
			acceptCmds.put("ModelingUnit",
					new ModelingUnitAcceptCommand());
			acceptCmds.put("Require",
					new RequireAcceptCommand());
			acceptCmds.put("Using",
					new UsingAcceptCommand());
			acceptCmds.put("Filter",
					new FilterAcceptCommand());
			acceptCmds.put("ProductType",
					new ProductTypeAcceptCommand());
			acceptCmds.put("FunctionType",
					new FunctionTypeAcceptCommand());
			acceptCmds.put("VoidType",
					new VoidTypeAcceptCommand());

		}
		return acceptCmds.get(node.eClass().getName());
	}
	// This is a generic visit method.
	public Object genericVisitChildren(EObject node) {
		Object result = null;
		Iterator<EObject> children = node.eContents().iterator();
		while (children.hasNext()) {
			EObject child = children.next();
			accept(child);
		}
		return result;
	}
	public Object accept(EObject node) {
		// Throw an error if the node is null
      if (node == null) {
          String msg = "Error in visitor: visited node is null";
          if (parent!=null) {
             msg += "   (when visiting parent\n    '" + parent.getClass().getName() + "'";
             if (parent instanceof NamedElement) 
                msg += "\n    parent's name: '" + ((NamedElement)parent).getName() + "')\n";
             else if (parent instanceof VariableDecl) 
                msg += "\n    parent's name (it's a variable): '" + ((VariableDecl)parent).getIdentifier() + "')\n";
          }
          throw new Error(msg);
		}
		// Get the accept command
		AcceptCommand cmd = getAcceptCmd(node);
		// Throw an error is the command is null
		if (cmd == null) {
         String msg = "Error in visitor : no strategy to handle node of type "
                 + node.getClass().getName();
         if (parent!=null) {
             msg += "   (when visiting parent '" + parent.getClass().getName() + "'";
             if (parent instanceof NamedElement) msg += " named: '" + ((NamedElement)parent).getName() + "')";
             else if (parent instanceof VariableDecl) msg += " named: '" + ((VariableDecl)parent).getIdentifier() + "')";
          }
         throw new Error(msg);
		}
		// accept the node
		return cmd.accept(node, this);
	}
		public Object visitCallVariable(fr.irisa.triskell.kermeta.language.behavior.CallVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitCallFeature(fr.irisa.triskell.kermeta.language.behavior.CallFeature node) {
	return genericVisitChildren(node);
	}

	public Object visitCallSuperOperation(fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation node) {
	return genericVisitChildren(node);
	}

	public Object visitCallResult(fr.irisa.triskell.kermeta.language.behavior.CallResult node) {
	return genericVisitChildren(node);
	}

	public Object visitCallValue(fr.irisa.triskell.kermeta.language.behavior.CallValue node) {
	return genericVisitChildren(node);
	}

	public Object visitAssignment(fr.irisa.triskell.kermeta.language.behavior.Assignment node) {
	return genericVisitChildren(node);
	}

	public Object visitBlock(fr.irisa.triskell.kermeta.language.behavior.Block node) {
	return genericVisitChildren(node);
	}

	public Object visitConditional(fr.irisa.triskell.kermeta.language.behavior.Conditional node) {
	return genericVisitChildren(node);
	}

	public Object visitRaise(fr.irisa.triskell.kermeta.language.behavior.Raise node) {
	return genericVisitChildren(node);
	}

	public Object visitRescue(fr.irisa.triskell.kermeta.language.behavior.Rescue node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeReference(fr.irisa.triskell.kermeta.language.behavior.TypeReference node) {
	return genericVisitChildren(node);
	}

	public Object visitEmptyExpression(fr.irisa.triskell.kermeta.language.behavior.EmptyExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitJavaStaticCall(fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall node) {
	return genericVisitChildren(node);
	}

	public Object visitLambdaExpression(fr.irisa.triskell.kermeta.language.behavior.LambdaExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitLambdaParameter(fr.irisa.triskell.kermeta.language.behavior.LambdaParameter node) {
	return genericVisitChildren(node);
	}

	public Object visitIntegerLiteral(fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitStringLiteral(fr.irisa.triskell.kermeta.language.behavior.StringLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitBooleanLiteral(fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeLiteral(fr.irisa.triskell.kermeta.language.behavior.TypeLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitVoidLiteral(fr.irisa.triskell.kermeta.language.behavior.VoidLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitLoop(fr.irisa.triskell.kermeta.language.behavior.Loop node) {
	return genericVisitChildren(node);
	}

	public Object visitSelfExpression(fr.irisa.triskell.kermeta.language.behavior.SelfExpression node) {
	return genericVisitChildren(node);
	}

	public Object visitVariableDecl(fr.irisa.triskell.kermeta.language.behavior.VariableDecl node) {
	return genericVisitChildren(node);
	}

	public Object visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation node) {
	return genericVisitChildren(node);
	}

	public Object visitProperty(fr.irisa.triskell.kermeta.language.structure.Property node) {
	return genericVisitChildren(node);
	}

	public Object visitType(fr.irisa.triskell.kermeta.language.structure.Type node) {
	return genericVisitChildren(node);
	}

	public Object visitEnumerationLiteral(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding node) {
	return genericVisitChildren(node);
	}

	public Object visitObject(fr.irisa.triskell.kermeta.language.structure.Object node) {
	return genericVisitChildren(node);
	}

	public Object visitMultiplicityElement(fr.irisa.triskell.kermeta.language.structure.MultiplicityElement node) {
	return genericVisitChildren(node);
	}

	public Object visitTypeDefinition(fr.irisa.triskell.kermeta.language.structure.TypeDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
	return genericVisitChildren(node);
	}

	public Object visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration node) {
	return genericVisitChildren(node);
	}

	public Object visitPackage(fr.irisa.triskell.kermeta.language.structure.Package node) {
	return genericVisitChildren(node);
	}

	public Object visitParameter(fr.irisa.triskell.kermeta.language.structure.Parameter node) {
	return genericVisitChildren(node);
	}

	public Object visitPrimitiveType(fr.irisa.triskell.kermeta.language.structure.PrimitiveType node) {
	return genericVisitChildren(node);
	}

	public Object visitTag(fr.irisa.triskell.kermeta.language.structure.Tag node) {
	return genericVisitChildren(node);
	}

	public Object visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint node) {
	return genericVisitChildren(node);
	}

	public Object visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition node) {
	return genericVisitChildren(node);
	}

	public Object visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitModelType(fr.irisa.triskell.kermeta.language.structure.ModelType node) {
	return genericVisitChildren(node);
	}

	public Object visitModelTypeVariable(fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable node) {
	return genericVisitChildren(node);
	}

	public Object visitVirtualType(fr.irisa.triskell.kermeta.language.structure.VirtualType node) {
	return genericVisitChildren(node);
	}

	public Object visitModel(fr.irisa.triskell.kermeta.language.structure.Model node) {
	return genericVisitChildren(node);
	}

	public Object visitModelingUnit(fr.irisa.triskell.kermeta.language.structure.ModelingUnit node) {
	return genericVisitChildren(node);
	}

	public Object visitRequire(fr.irisa.triskell.kermeta.language.structure.Require node) {
	return genericVisitChildren(node);
	}

	public Object visitUsing(fr.irisa.triskell.kermeta.language.structure.Using node) {
	return genericVisitChildren(node);
	}

	public Object visitFilter(fr.irisa.triskell.kermeta.language.structure.Filter node) {
	return genericVisitChildren(node);
	}

	public Object visitProductType(fr.irisa.triskell.kermeta.language.structure.ProductType node) {
	return genericVisitChildren(node);
	}

	public Object visitFunctionType(fr.irisa.triskell.kermeta.language.structure.FunctionType node) {
	return genericVisitChildren(node);
	}

	public Object visitVoidType(fr.irisa.triskell.kermeta.language.structure.VoidType node) {
	return genericVisitChildren(node);
	}


}
abstract class AcceptCommand {
	public abstract Object accept(EObject node, KermetaOptimizedVisitor visitor);
}
class CallVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallVariable((fr.irisa.triskell.kermeta.language.behavior.CallVariable) node);
	}
}
class CallFeatureAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallFeature((fr.irisa.triskell.kermeta.language.behavior.CallFeature) node);
	}
}
class CallSuperOperationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallSuperOperation((fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation) node);
	}
}
class CallResultAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallResult((fr.irisa.triskell.kermeta.language.behavior.CallResult) node);
	}
}
class CallValueAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitCallValue((fr.irisa.triskell.kermeta.language.behavior.CallValue) node);
	}
}
class AssignmentAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitAssignment((fr.irisa.triskell.kermeta.language.behavior.Assignment) node);
	}
}
class BlockAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitBlock((fr.irisa.triskell.kermeta.language.behavior.Block) node);
	}
}
class ConditionalAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitConditional((fr.irisa.triskell.kermeta.language.behavior.Conditional) node);
	}
}
class RaiseAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRaise((fr.irisa.triskell.kermeta.language.behavior.Raise) node);
	}
}
class RescueAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRescue((fr.irisa.triskell.kermeta.language.behavior.Rescue) node);
	}
}
class TypeReferenceAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeReference((fr.irisa.triskell.kermeta.language.behavior.TypeReference) node);
	}
}
class EmptyExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEmptyExpression((fr.irisa.triskell.kermeta.language.behavior.EmptyExpression) node);
	}
}
class JavaStaticCallAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitJavaStaticCall((fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall) node);
	}
}
class LambdaExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLambdaExpression((fr.irisa.triskell.kermeta.language.behavior.LambdaExpression) node);
	}
}
class LambdaParameterAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLambdaParameter((fr.irisa.triskell.kermeta.language.behavior.LambdaParameter) node);
	}
}
class IntegerLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitIntegerLiteral((fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral) node);
	}
}
class StringLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitStringLiteral((fr.irisa.triskell.kermeta.language.behavior.StringLiteral) node);
	}
}
class BooleanLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitBooleanLiteral((fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral) node);
	}
}
class TypeLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeLiteral((fr.irisa.triskell.kermeta.language.behavior.TypeLiteral) node);
	}
}
class VoidLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVoidLiteral((fr.irisa.triskell.kermeta.language.behavior.VoidLiteral) node);
	}
}
class LoopAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitLoop((fr.irisa.triskell.kermeta.language.behavior.Loop) node);
	}
}
class SelfExpressionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitSelfExpression((fr.irisa.triskell.kermeta.language.behavior.SelfExpression) node);
	}
}
class VariableDeclAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVariableDecl((fr.irisa.triskell.kermeta.language.behavior.VariableDecl) node);
	}
}
class OperationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitOperation((fr.irisa.triskell.kermeta.language.structure.Operation) node);
	}
}
class PropertyAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitProperty((fr.irisa.triskell.kermeta.language.structure.Property) node);
	}
}
class TypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitType((fr.irisa.triskell.kermeta.language.structure.Type) node);
	}
}
class EnumerationLiteralAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEnumerationLiteral((fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral) node);
	}
}
class TypeVariableBindingAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeVariableBinding((fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding) node);
	}
}
class ObjectAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitObject((fr.irisa.triskell.kermeta.language.structure.Object) node);
	}
}
class MultiplicityElementAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitMultiplicityElement((fr.irisa.triskell.kermeta.language.structure.MultiplicityElement) node);
	}
}
class TypeDefinitionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTypeDefinition((fr.irisa.triskell.kermeta.language.structure.TypeDefinition) node);
	}
}
class ClassAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitClass((fr.irisa.triskell.kermeta.language.structure.Class) node);
	}
}
class EnumerationAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitEnumeration((fr.irisa.triskell.kermeta.language.structure.Enumeration) node);
	}
}
class PackageAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitPackage((fr.irisa.triskell.kermeta.language.structure.Package) node);
	}
}
class ParameterAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitParameter((fr.irisa.triskell.kermeta.language.structure.Parameter) node);
	}
}
class PrimitiveTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitPrimitiveType((fr.irisa.triskell.kermeta.language.structure.PrimitiveType) node);
	}
}
class TagAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitTag((fr.irisa.triskell.kermeta.language.structure.Tag) node);
	}
}
class ConstraintAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitConstraint((fr.irisa.triskell.kermeta.language.structure.Constraint) node);
	}
}
class ClassDefinitionAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitClassDefinition((fr.irisa.triskell.kermeta.language.structure.ClassDefinition) node);
	}
}
class ObjectTypeVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitObjectTypeVariable((fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable) node);
	}
}
class ModelTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelType((fr.irisa.triskell.kermeta.language.structure.ModelType) node);
	}
}
class ModelTypeVariableAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelTypeVariable((fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable) node);
	}
}
class VirtualTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVirtualType((fr.irisa.triskell.kermeta.language.structure.VirtualType) node);
	}
}
class ModelAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModel((fr.irisa.triskell.kermeta.language.structure.Model) node);
	}
}
class ModelingUnitAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitModelingUnit((fr.irisa.triskell.kermeta.language.structure.ModelingUnit) node);
	}
}
class RequireAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitRequire((fr.irisa.triskell.kermeta.language.structure.Require) node);
	}
}
class UsingAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitUsing((fr.irisa.triskell.kermeta.language.structure.Using) node);
	}
}
class FilterAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitFilter((fr.irisa.triskell.kermeta.language.structure.Filter) node);
	}
}
class ProductTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitProductType((fr.irisa.triskell.kermeta.language.structure.ProductType) node);
	}
}
class FunctionTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitFunctionType((fr.irisa.triskell.kermeta.language.structure.FunctionType) node);
	}
}
class VoidTypeAcceptCommand extends AcceptCommand {
	public Object accept(EObject node, KermetaOptimizedVisitor visitor) {
		return visitor
				.visitVoidType((fr.irisa.triskell.kermeta.language.structure.VoidType) node);
	}
}

