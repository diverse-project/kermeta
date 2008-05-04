package fr.irisa.triskell.kermeta.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

public class TraceInterpreter extends ExpressionInterpreter/* DebugInterpreter*/ {

	
	public TraceInterpreter(RuntimeMemory memory) {
		super(memory);
	}

	private int deepth=0;
	
	
	private int methodDeepth=0;
	
	/*public TraceInterpreter(RuntimeMemory memory,int step, int tstep) throws IOException {
		super(memory, step, tstep);
		
	}*/


	private void traceExecution(Expression expression) {
		if(this.isKermetaNative(expression)){
			return;
		}
		
		KermetaUnit unit = memory.getUnit();
		Tracer trace = unit.getTracer();
		if ( trace != null ) {
			TextReference reference = trace.getFirstTextReference(expression);
			if ( reference != null ) {
				
			}
		}
		
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<this.deepth*2;i++){
			buffer.append(" ");
		}
		buffer.append("exp: "+expression.toString() );
		System.err.println(buffer);
	}
	
	private void traceExecution(fr.irisa.triskell.kermeta.language.structure.Operation object) {
		if(this.isKermetaNative(object)){
			if(this.methodDeepth>=2){
				return;
			}
		}

		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<this.deepth*2;i++){
			buffer.append(" ");
		}
		buffer.append("ope: "+object.toString() );
		System.err.println(buffer);
	}
	
	private void traceExecution(fr.irisa.triskell.kermeta.language.structure.Object object) {
		
		if(this.isKermetaNative(object)){
			return;
		}
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<this.deepth*2;i++){
			buffer.append(" ");
		}
		buffer.append("obj: "+object.toString() );
		System.err.println(buffer);
	}
	
	private boolean isKermetaNative(fr.irisa.triskell.kermeta.language.structure.Object object){
		EObject p = object.eContainer();
		EObject ps = null;
		while(p!=null){
			if(p instanceof Package){
				ps=p;
			}
			p=p.eContainer();
		}
		if(((Package)ps).getName().equals("kermeta")){
			return true;
		}
		return false;
	}
	

	private boolean isKermetaNative(Expression expression){
		EObject p = expression.eContainer();
		EObject ps = null;
		while(p!=null){
			if(p instanceof Package){
				ps=p;
			}
			p=p.eContainer();
		}
		if(((Package)ps).getName().equals("kermeta")){
			return true;
		}
		return false;
	}
	
	@Override
	public Object visitAssignment(fr.irisa.triskell.kermeta.language.behavior.Assignment node) {
		traceExecution(node);
		this.deepth++;
		traceExecution(node.getTarget());
		Object object=super.visitAssignment(node);
		this.deepth--;
		return object;
	}

	public Object visitBlock(fr.irisa.triskell.kermeta.language.behavior.Block node) {
		traceExecution(node);
		this.deepth++;
		Object object=super.visitBlock(node);
		this.deepth--;
		return object;
	}
   // it represents a variable or a parameter 
	public Object visitCallVariable(fr.irisa.triskell.kermeta.language.behavior.CallVariable node) {
		traceExecution(node);
		return super.visitCallVariable(node);
	}

	//function call // property // enumeration literal
	public Object visitCallFeature(fr.irisa.triskell.kermeta.language.behavior.CallFeature node) {
		traceExecution(node);	
		return super.visitCallFeature(node);
	}

	public Object visitCallSuperOperation(fr.irisa.triskell.kermeta.language.behavior.CallSuperOperation node) {
		traceExecution(node);
		return super.visitCallSuperOperation(node);
	}

	public Object visitCallResult(fr.irisa.triskell.kermeta.language.behavior.CallResult node) {
		traceExecution(node);
		return super.visitCallResult(node);
	}

	public Object visitCallValue(fr.irisa.triskell.kermeta.language.behavior.CallValue node) {
		traceExecution(node);
		return super.visitCallValue(node);
	}

	public Object visitConditional(fr.irisa.triskell.kermeta.language.behavior.Conditional node) {
		traceExecution(node);
		this.deepth++;
		Object object=super.visitConditional(node);
		this.deepth--;
		return object;
	}

	public Object visitRaise(fr.irisa.triskell.kermeta.language.behavior.Raise node) {
		traceExecution(node);
		return super.visitRaise(node);
	}

	public Object visitRescue(fr.irisa.triskell.kermeta.language.behavior.Rescue node) {
		traceExecution(node);
		return super.visitRescue(node);
	}

	public Object visitTypeReference(fr.irisa.triskell.kermeta.language.behavior.TypeReference node) {
		traceExecution(node);
		return super.visitTypeReference(node);
	}

	public Object visitEmptyExpression(fr.irisa.triskell.kermeta.language.behavior.EmptyExpression node) {
		traceExecution(node);
		return super.visitEmptyExpression(node);
	}

	/*public Object visitJavaStaticCall(fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall node) {
		traceExecution(node);
		return super.visitJavaStaticCall(node);
	}*/

	public Object visitLambdaExpression(fr.irisa.triskell.kermeta.language.behavior.LambdaExpression node) {
		traceExecution(node);
		Object object=super.visitLambdaExpression(node);
		return object;
	}

	public Object visitLambdaParameter(fr.irisa.triskell.kermeta.language.behavior.LambdaParameter node) {
		traceExecution(node);
		return super.visitLambdaParameter(node);
	}

	public Object visitIntegerLiteral(fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral node) {
		traceExecution(node);
		return super.visitIntegerLiteral(node);
	}

	public Object visitStringLiteral(fr.irisa.triskell.kermeta.language.behavior.StringLiteral node) {
		traceExecution(node);
		return super.visitStringLiteral(node);
	}

	public Object visitBooleanLiteral(fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral node) {
		traceExecution(node);
		return super.visitBooleanLiteral(node);
	}

	public Object visitTypeLiteral(fr.irisa.triskell.kermeta.language.behavior.TypeLiteral node) {
		traceExecution(node);
		return super.visitTypeLiteral(node);
	}

	public Object visitVoidLiteral(fr.irisa.triskell.kermeta.language.behavior.VoidLiteral node) {
		traceExecution(node);
		return super.visitVoidLiteral(node);
	}

	public Object visitLoop(fr.irisa.triskell.kermeta.language.behavior.Loop node) {
		traceExecution(node);
		return super.visitLoop(node);
	}

	public Object visitSelfExpression(fr.irisa.triskell.kermeta.language.behavior.SelfExpression node) {
		traceExecution(node);
		return super.visitSelfExpression(node);
	}

	public Object visitVariableDecl(fr.irisa.triskell.kermeta.language.behavior.VariableDecl node) {
		traceExecution(node);
		return super.visitVariableDecl(node);
	}

	/*public Object visitClass(fr.irisa.triskell.kermeta.language.structure.Class node) {
		traceExecution(node);
		return super.visitClass(node);
	}

	public Object visitObject(fr.irisa.triskell.kermeta.language.structure.Object node) {
		traceExecution(node);
		return super.visitObject(node);
	}

	public Object visitModel(fr.irisa.triskell.kermeta.language.structure.Model node) {
		traceExecution(node);
		return super.visitModel(node);
	}

	public Object visitModelType(fr.irisa.triskell.kermeta.language.structure.ModelType node) {
		traceExecution(node);
		return super.visitModelType(node);
	}*/

	public Object visitOperation(fr.irisa.triskell.kermeta.language.structure.Operation node) {
		this.methodDeepth++;
		traceExecution(node);
		this.deepth++;
		Object res=super.visitOperation(node);
		this.methodDeepth--;
		this.deepth--;
		return res;
	}

	/*public Object visitProperty(fr.irisa.triskell.kermeta.language.structure.Property node) {
		traceExecution(node);
		return super.visitProperty(node);
	}

	public Object visitType(fr.irisa.triskell.kermeta.language.structure.Type node) {
		traceExecution(node);
		return super.visitType(node);
	}

	public Object visitEnumerationLiteral(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral node) {
		traceExecution(node);
		return super.visitEnumerationLiteral(node);
	}

	public Object visitTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding node) {
		traceExecution(node);
		return super.visitTypeVariableBinding(node);
	}

	public Object visitMultiplicityElement(fr.irisa.triskell.kermeta.language.structure.MultiplicityElement node) {
		traceExecution(node);
		return super.visitMultiplicityElement(node);
	}

	public Object visitTypeDefinition(fr.irisa.triskell.kermeta.language.structure.TypeDefinition node) {
		traceExecution(node);
		return super.visitTypeDefinition(node);
	}

	public Object visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration node) {
		traceExecution(node);
		return super.visitEnumeration(node);
	}

	public Object visitPackage(fr.irisa.triskell.kermeta.language.structure.Package node) {
		traceExecution(node);
		return super.visitPackage(node);
	}

	public Object visitParameter(fr.irisa.triskell.kermeta.language.structure.Parameter node) {
		traceExecution(node);
		return super.visitParameter(node);
	}

	public Object visitPrimitiveType(fr.irisa.triskell.kermeta.language.structure.PrimitiveType node) {
		traceExecution(node);
		return super.visitPrimitiveType(node);
	}

	public Object visitTag(fr.irisa.triskell.kermeta.language.structure.Tag node) {
		traceExecution(node);
		return super.visitTag(node);
	}

	public Object visitConstraint(fr.irisa.triskell.kermeta.language.structure.Constraint node) {
		traceExecution(node);
		return super.visitConstraint(node);
	}

	public Object visitClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition node) {
		traceExecution(node);
		return super.visitClassDefinition(node);
	}

	public Object visitModelingUnit(fr.irisa.triskell.kermeta.language.structure.ModelingUnit node) {
		traceExecution(node);
		return super.visitModelingUnit(node);
	}

	public Object visitRequire(fr.irisa.triskell.kermeta.language.structure.Require node) {
		traceExecution(node);
		return super.visitRequire(node);
	}

	public Object visitUsing(fr.irisa.triskell.kermeta.language.structure.Using node) {
		traceExecution(node);
		return super.visitUsing(node);
	}

	public Object visitFilter(fr.irisa.triskell.kermeta.language.structure.Filter node) {
		traceExecution(node);
		return super.visitFilter(node);
	}

	public Object visitObjectTypeVariable(fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable node) {
		traceExecution(node);
		return super.visitObjectTypeVariable(node);
	}

	public Object visitModelTypeVariable(fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable node) {
		traceExecution(node);
		return super.visitModelTypeVariable(node);
	}

	public Object visitVirtualType(fr.irisa.triskell.kermeta.language.structure.VirtualType node) {
		traceExecution(node);
		return super.visitVirtualType(node);
	}

	public Object visitProductType(fr.irisa.triskell.kermeta.language.structure.ProductType node) {
		traceExecution(node);
		return super.visitProductType(node);
	}

	public Object visitFunctionType(fr.irisa.triskell.kermeta.language.structure.FunctionType node) {
		traceExecution(node);
		return super.visitFunctionType(node);
	}

	public Object visitVoidType(fr.irisa.triskell.kermeta.language.structure.VoidType node) {
		traceExecution(node);
		return super.visitVoidType(node);
	}	*/
}
