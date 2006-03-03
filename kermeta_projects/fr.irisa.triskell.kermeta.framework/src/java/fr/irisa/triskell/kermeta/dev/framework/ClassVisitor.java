/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ClassVisitor extends KermetaVisitor {
	
	protected KermetaUnit unit;
	protected ClassDefinition visitor;
	protected ClassDefinition visitable;
	protected Operation acceptOp;

	
	/**
	 * 
	 */
	public ClassVisitor(KermetaUnit unit) {
		super();
		this.unit = unit;
		//acceptOp = unit.struct_factory.createFOperation();
		
	}
	
	
	public void createVisitorForPackage(Package pkg, String visitor_name) {
		// Create visitor
		visitor = unit.struct_factory.createClassDefinition();
		visitor.setName(visitor_name + "Visitor");
		visitor.setIsAbstract(true);
		TypeVariable typevar = unit.struct_factory.createTypeVariable();
		typevar.setName("ContextType");
		visitor.getTypeParameter().add(typevar);
		
		// Create visitable
		visitable = unit.struct_factory.createClassDefinition();
		visitable.setName(visitor_name + "Visitable");
		visitable.setIsAbstract(true);
		
		acceptOp = buildAcceptOp();
		acceptOp.setIsAbstract(true);
		
		visitable.getOwnedOperation().add(acceptOp);
		
		// ClassVisitor
		this.accept(pkg);
		pkg.getOwnedTypeDefinition().add(visitor);
		pkg.getOwnedTypeDefinition().add(visitable);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
	 */
	public Object visit(ClassDefinition arg0) {
		if (!arg0.isIsAbstract()) {
			arg0.getOwnedOperation().add(createAcceptMethod(arg0));
		}
		return super.visit(arg0);
	}
	
	
	
	
	protected Operation buildAcceptOp() {
		Operation result;
		result = unit.struct_factory.createOperation();
		result.setSuperOperation(acceptOp);
		result.setName("accept" + visitor.getName());
		TypeVariable typevar = unit.struct_factory.createTypeVariable();
		typevar.setName("ContextType");
		result.getTypeParameter().add(typevar);
		// visitor : Visitor<ContextType>
		Parameter p1 = unit.struct_factory.createParameter();
		p1.setName("visitor");
		fr.irisa.triskell.kermeta.language.structure.Class p1Type = unit.struct_factory.createClass();
		p1Type.setTypeDefinition(visitor);
		TypeVariableBinding bind = unit.struct_factory.createTypeVariableBinding();
		bind.setVariable((TypeVariable)visitor.getTypeParameter().get(0));
		bind.setType(typevar);
		p1Type.getTypeParamBinding().add(bind);
		p1.setType(p1Type);
		p1.setUpper(1);
		result.getOwnedParameter().add(p1);
		// context : ContextType
		Parameter p2 = unit.struct_factory.createParameter();
		p2.setName("context");
		p2.setType(typevar);
		p2.setUpper(1);
		result.getOwnedParameter().add(p2);
		// : ContextType
		result.setType(typevar);
		return result;
	}
	
	
	/**
	 * Build a method accept
	 * 
	 *  operation accept<ContextType>(visitor : Visitor<ContextType>, context : ContextType) : ContextType is do
			result := visitor.visitObject(self, context)
		end
	 * @param arg0
	 * @return
	 */
	
	public Operation createAcceptMethod(ClassDefinition arg0) {
		
		
		// Make the class inherit from visitable :
		fr.irisa.triskell.kermeta.language.structure.Class visitable_class = unit.struct_factory.createClass();
		visitable_class.setTypeDefinition(visitable);
		
		arg0.getSuperType().add(visitable_class);
		
		Operation result = buildAcceptOp();
		// Body :
		Assignment ass = unit.behav_factory.createAssignment();
		CallResult res = unit.behav_factory.createCallResult();
		ass.setTarget(res);
		CallFeature fc = unit.behav_factory.createCallFeature();
		CallVariable cvisit = unit.behav_factory.createCallVariable();
		cvisit.setName("visitor");
		fc.setTarget(cvisit);
		fc.setName("visit" + arg0.getName());
		SelfExpression self = unit.behav_factory.createSelfExpression();
		CallVariable varcontext = unit.behav_factory.createCallVariable();
		varcontext.setName("context");
		fc.getParameters().add(self);
		fc.getParameters().add(varcontext);
		ass.setIsCast(false);
		ass.setValue(fc);
		Block block = unit.behav_factory.createBlock();
		block.getStatement().add(ass);
		result.setBody(block);
		result.setUpper(1);
		
		// And then add visit<> to visitor
		// operation visitObject(node : Object, context : ContextType) : ContextType is abstract
		Operation visitOp;
		visitOp = unit.struct_factory.createOperation();
		visitOp.setName("visit"+arg0.getName());
		visitOp.setIsAbstract(true);
		// create params
		fr.irisa.triskell.kermeta.language.structure.Class nodeClass = unit.struct_factory.createClass();
		nodeClass.setTypeDefinition(arg0);
		Parameter pv1 = unit.struct_factory.createParameter();
		pv1.setName("node");
		pv1.setType(nodeClass);
		pv1.setUpper(1);
		visitOp.getOwnedParameter().add(pv1);
		Parameter pv2 = unit.struct_factory.createParameter();
		pv2.setName("context");
		pv2.setType((Type)visitor.getTypeParameter().get(0));
		pv2.setUpper(1);
		visitOp.setType((Type)visitor.getTypeParameter().get(0));
		visitOp.setUpper(1);
		visitor.getOwnedOperation().add(visitOp);
		
		return result;
	}
}
