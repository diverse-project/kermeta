/*$Id: PrintableFinder.java,v 1.3 2008-04-30 14:16:44 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.ui
* File : 	PrintableFinder.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 24 avr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.ui.textPresentation;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation;
import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Filter;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.Model;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * This class helps to find a kermeta object that may be pretty printed with KMTDocHTMLPrettyPrinter
 *
 */
public class PrintableFinder extends KermetaOptimizedVisitor {

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitAssignment(fr.irisa.triskell.kermeta.language.behavior.Assignment)
	 */
	@Override
	public Object visitAssignment(Assignment node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitBlock(fr.irisa.triskell.kermeta.language.behavior.Block)
	 */
	@Override
	public Object visitBlock(Block node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitBooleanLiteral(fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral)
	 */
	@Override
	public Object visitBooleanLiteral(BooleanLiteral node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallFeature(fr.irisa.triskell.kermeta.language.behavior.CallFeature)
	 */
	@Override
	public Object visitCallFeature(CallFeature node) {
		if(node.getStaticOperation() != null) return accept(node.getStaticOperation());
		if(node.getStaticEnumLiteral() != null) return accept(node.getStaticEnumLiteral());
		if(node.getStaticProperty() != null) return accept(node.getStaticProperty());
		if(node.getStaticType() != null) return accept(node.getStaticType());
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallResult(fr.irisa.triskell.kermeta.language.behavior.CallResult)
	 */
	@Override
	public Object visitCallResult(CallResult node) {
		return accept(node.getStaticType());
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallSuperOperation(fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation)
	 */
	@Override
	public Object visitCallSuperOperation(CallSuperOperation node) {
		// TODO Auto-generated method stub would be cool to return the doc of the super operation that will be called but seems complex to compute ... need to look into the interpreter
		Operation container_op = null;
		EObject nextContainer = node.eContainer();
		while(container_op == null && nextContainer != null){
			if(nextContainer instanceof Operation){
				container_op = (Operation) nextContainer;
			}
			nextContainer = nextContainer.eContainer();
		}
		if(container_op != null)
			return accept(container_op.getSuperOperation());
		else return null; // no Operation contains this expression !?? should never occur
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallValue(fr.irisa.triskell.kermeta.language.behavior.CallValue)
	 */
	@Override
	public Object visitCallValue(CallValue node) {
		// TODO Auto-generated method stub
		return super.visitCallValue(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallVariable(fr.irisa.triskell.kermeta.language.behavior.CallVariable)
	 */
	@Override
	public Object visitCallVariable(CallVariable node) {
		if (node.getStaticType() != null) return accept(node.getStaticType());
		else return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitClass(fr.irisa.triskell.kermeta.language.structure.Class)
	 */
	@Override
	public Object visitClass(Class node) {
		
		return accept(node.getTypeDefinition());
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	@Override
	public Object visitClassDefinition(ClassDefinition node) {
		//ClassDefinition are handled by KMTDocHTMLPrettyPrinter
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConditional(fr.irisa.triskell.kermeta.language.behavior.Conditional)
	 */
	@Override
	public Object visitConditional(Conditional node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint)
	 */
	@Override
	public Object visitConstraint(Constraint node) {
		
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEmptyExpression(fr.irisa.triskell.kermeta.language.behavior.EmptyExpression)
	 */
	@Override
	public Object visitEmptyExpression(EmptyExpression node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration)
	 */
	@Override
	public Object visitEnumeration(Enumeration node) {		
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumerationLiteral(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral)
	 */
	@Override
	public Object visitEnumerationLiteral(EnumerationLiteral node) {
		// print the enumeration (will display the other possible values
		return node.getEnumeration();
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFilter(fr.irisa.triskell.kermeta.language.structure.Filter)
	 */
	@Override
	public Object visitFilter(Filter node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFunctionType(fr.irisa.triskell.kermeta.language.structure.FunctionType)
	 */
	@Override
	public Object visitFunctionType(FunctionType node) {
		// TODO Auto-generated method stub
		return super.visitFunctionType(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitIntegerLiteral(fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral)
	 */
	@Override
	public Object visitIntegerLiteral(IntegerLiteral node) {

		return accept(node.getStaticType());
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitJavaStaticCall(fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall)
	 */
	@Override
	public Object visitJavaStaticCall(JavaStaticCall node) {
		// TODO Auto-generated method stub
		return super.visitJavaStaticCall(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitLambdaExpression(fr.irisa.triskell.kermeta.language.behavior.LambdaExpression)
	 */
	@Override
	public Object visitLambdaExpression(LambdaExpression node) {
		// TODO Auto-generated method stub
		return super.visitLambdaExpression(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitLambdaParameter(fr.irisa.triskell.kermeta.language.behavior.LambdaParameter)
	 */
	@Override
	public Object visitLambdaParameter(LambdaParameter node) {
		// TODO Auto-generated method stub
		return super.visitLambdaParameter(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitLoop(fr.irisa.triskell.kermeta.language.behavior.Loop)
	 */
	@Override
	public Object visitLoop(Loop node) {
		// not printable with KMTDocHTMLPrettyPrinter
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModel(fr.irisa.triskell.kermeta.language.structure.Model)
	 */
	@Override
	public Object visitModel(Model node) {
		// TODO Auto-generated method stub
		return super.visitModel(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModelingUnit(fr.irisa.triskell.kermeta.language.structure.ModelingUnit)
	 */
	@Override
	public Object visitModelingUnit(ModelingUnit node) {
		// TODO Auto-generated method stub
		return super.visitModelingUnit(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModelType(fr.irisa.triskell.kermeta.language.structure.ModelType)
	 */
	@Override
	public Object visitModelType(ModelType node) {
		// TODO Auto-generated method stub
		return super.visitModelType(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitModelTypeVariable(fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable)
	 */
	@Override
	public Object visitModelTypeVariable(ModelTypeVariable node) {
		// TODO Auto-generated method stub
		return super.visitModelTypeVariable(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitMultiplicityElement(fr.irisa.triskell.kermeta.language.structure.MultiplicityElement)
	 */
	@Override
	public Object visitMultiplicityElement(MultiplicityElement node) {
		// TODO Auto-generated method stub
		return super.visitMultiplicityElement(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitObject(fr.irisa.triskell.kermeta.language.structure.Object)
	 */
	@Override
	public Object visitObject(
			fr.irisa.triskell.kermeta.language.structure.Object node) {
		// TODO Auto-generated method stub
		return super.visitObject(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable)
	 */
	@Override
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		// TODO Auto-generated method stub
		return super.visitObjectTypeVariable(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
	 */
	@Override
	public Object visitOperation(Operation node) {
		//Operation are handled by KMTDocHTMLPrettyPrinter
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPackage(fr.irisa.triskell.kermeta.language.structure.Package)
	 */
	@Override
	public Object visitPackage(Package node) {
		//Package are handled by KMTDocHTMLPrettyPrinter
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitParameter(fr.irisa.triskell.kermeta.language.structure.Parameter)
	 */
	@Override
	public Object visitParameter(Parameter node) {
		// TODO Auto-generated method stub
		return super.visitParameter(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitPrimitiveType(fr.irisa.triskell.kermeta.language.structure.PrimitiveType)
	 */
	@Override
	public Object visitPrimitiveType(PrimitiveType node) {
		//PrimitiveType are handled by KMTDocHTMLPrettyPrinter
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProductType(fr.irisa.triskell.kermeta.language.structure.ProductType)
	 */
	@Override
	public Object visitProductType(ProductType node) {
		// TODO Auto-generated method stub
		return super.visitProductType(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitProperty(fr.irisa.triskell.kermeta.language.structure.Property)
	 */
	@Override
	public Object visitProperty(Property node) {
		//Property are handled by KMTDocHTMLPrettyPrinter
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitRaise(fr.irisa.triskell.kermeta.language.behavior.Raise)
	 */
	@Override
	public Object visitRaise(Raise node) {
		// TODO Auto-generated method stub
		return super.visitRaise(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitRequire(fr.irisa.triskell.kermeta.language.structure.Require)
	 */
	@Override
	public Object visitRequire(Require node) {
		// TODO Auto-generated method stub
		return super.visitRequire(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitRescue(fr.irisa.triskell.kermeta.language.behavior.Rescue)
	 */
	@Override
	public Object visitRescue(Rescue node) {
		// TODO Auto-generated method stub
		return super.visitRescue(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitSelfExpression(fr.irisa.triskell.kermeta.language.behavior.SelfExpression)
	 */
	@Override
	public Object visitSelfExpression(SelfExpression node) {
		// TODO Auto-generated method stub
		return super.visitSelfExpression(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitStringLiteral(fr.irisa.triskell.kermeta.language.behavior.StringLiteral)
	 */
	@Override
	public Object visitStringLiteral(StringLiteral node) {
		// TODO Auto-generated method stub
		return super.visitStringLiteral(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTag(fr.irisa.triskell.kermeta.language.structure.Tag)
	 */
	@Override
	public Object visitTag(Tag node) {
		// TODO Auto-generated method stub
		return super.visitTag(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitType(fr.irisa.triskell.kermeta.language.structure.Type)
	 */
	@Override
	public Object visitType(Type node) {
		// TODO Auto-generated method stub
		return super.visitType(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTypeDefinition(fr.irisa.triskell.kermeta.language.structure.TypeDefinition)
	 */
	@Override
	public Object visitTypeDefinition(TypeDefinition node) {
		return node;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTypeLiteral(fr.irisa.triskell.kermeta.language.behavior.TypeLiteral)
	 */
	@Override
	public Object visitTypeLiteral(TypeLiteral node) {
		// TODO Auto-generated method stub
		return super.visitTypeLiteral(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTypeReference(fr.irisa.triskell.kermeta.language.behavior.TypeReference)
	 */
	@Override
	public Object visitTypeReference(TypeReference node) {			
		return accept(node.getType());
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding)
	 */
	@Override
	public Object visitTypeVariableBinding(TypeVariableBinding node) {
		// TODO Auto-generated method stub
		return super.visitTypeVariableBinding(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitUsing(fr.irisa.triskell.kermeta.language.structure.Using)
	 */
	@Override
	public Object visitUsing(Using node) {
		// TODO Auto-generated method stub
		return super.visitUsing(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVariableDecl(fr.irisa.triskell.kermeta.language.behavior.VariableDecl)
	 */
	@Override
	public Object visitVariableDecl(VariableDecl node) {
		// TODO Auto-generated method stub
		return super.visitVariableDecl(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVirtualType(fr.irisa.triskell.kermeta.language.structure.VirtualType)
	 */
	@Override
	public Object visitVirtualType(VirtualType node) {
		// TODO Auto-generated method stub
		return super.visitVirtualType(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVoidLiteral(fr.irisa.triskell.kermeta.language.behavior.VoidLiteral)
	 */
	@Override
	public Object visitVoidLiteral(VoidLiteral node) {
		// TODO Auto-generated method stub
		return super.visitVoidLiteral(node);
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitVoidType(fr.irisa.triskell.kermeta.language.structure.VoidType)
	 */
	@Override
	public Object visitVoidType(VoidType node) {
		// TODO Auto-generated method stub
		return super.visitVoidType(node);
	}

}
