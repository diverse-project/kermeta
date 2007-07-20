/* $Id: ClassVisitor.java,v 1.7 2007-07-20 15:08:39 ftanguy Exp $
 * Project   : Kermeta framework
 * File      : ClassVisitor.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 17, 2005
 * Authors : 
 * 	Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.dev.framework;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
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
		visitor = StructureFactory.eINSTANCE.createClassDefinition();
		visitor.setName(visitor_name + "Visitor");
		visitor.setIsAbstract(true);
		ObjectTypeVariable typevar = StructureFactory.eINSTANCE.createObjectTypeVariable();
		typevar.setName("ContextType");
		visitor.getTypeParameter().add(typevar);
		
		// Create visitable
		visitable = StructureFactory.eINSTANCE.createClassDefinition();
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
		result = StructureFactory.eINSTANCE.createOperation();
		result.setSuperOperation(acceptOp);
		result.setName("accept" + visitor.getName());
		ObjectTypeVariable typevar = StructureFactory.eINSTANCE.createObjectTypeVariable();
		typevar.setName("ContextType");
		result.getTypeParameter().add(typevar);
		// visitor : Visitor<ContextType>
		Parameter p1 = StructureFactory.eINSTANCE.createParameter();
		p1.setName("visitor");
		fr.irisa.triskell.kermeta.language.structure.Class p1Type = StructureFactory.eINSTANCE.createClass();
		p1Type.setTypeDefinition(visitor);
		TypeVariableBinding bind = StructureFactory.eINSTANCE.createTypeVariableBinding();
		bind.setVariable((ObjectTypeVariable)visitor.getTypeParameter().get(0));
		bind.setType(typevar);
		p1Type.getTypeParamBinding().add(bind);
		p1.setType(p1Type);
		p1.setUpper(1);
		result.getOwnedParameter().add(p1);
		// context : ContextType
		Parameter p2 = StructureFactory.eINSTANCE.createParameter();
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
		fr.irisa.triskell.kermeta.language.structure.Class visitable_class = StructureFactory.eINSTANCE.createClass();
		visitable_class.setTypeDefinition(visitable);
		
		arg0.getSuperType().add(visitable_class);
		
		Operation result = buildAcceptOp();
		// Body :
		Assignment ass = BehaviorFactory.eINSTANCE.createAssignment();
		CallResult res = BehaviorFactory.eINSTANCE.createCallResult();
		ass.setTarget(res);
		CallFeature fc = BehaviorFactory.eINSTANCE.createCallFeature();
		CallVariable cvisit = BehaviorFactory.eINSTANCE.createCallVariable();
		cvisit.setName("visitor");
		fc.setTarget(cvisit);
		fc.setName("visit" + arg0.getName());
		SelfExpression self = BehaviorFactory.eINSTANCE.createSelfExpression();
		CallVariable varcontext = BehaviorFactory.eINSTANCE.createCallVariable();
		varcontext.setName("context");
		fc.getParameters().add(self);
		fc.getParameters().add(varcontext);
		ass.setIsCast(false);
		ass.setValue(fc);
		Block block = BehaviorFactory.eINSTANCE.createBlock();
		block.getStatement().add(ass);
		result.setBody(block);
		result.setUpper(1);
		
		// And then add visit<> to visitor
		// operation visitObject(node : Object, context : ContextType) : ContextType is abstract
		Operation visitOp;
		visitOp = StructureFactory.eINSTANCE.createOperation();
		visitOp.setName("visit"+arg0.getName());
		visitOp.setIsAbstract(true);
		// create params
		fr.irisa.triskell.kermeta.language.structure.Class nodeClass = StructureFactory.eINSTANCE.createClass();
		nodeClass.setTypeDefinition(arg0);
		Parameter pv1 = StructureFactory.eINSTANCE.createParameter();
		pv1.setName("node");
		pv1.setType(nodeClass);
		pv1.setUpper(1);
		visitOp.getOwnedParameter().add(pv1);
		Parameter pv2 = StructureFactory.eINSTANCE.createParameter();
		pv2.setName("context");
		pv2.setType((Type)visitor.getTypeParameter().get(0));
		pv2.setUpper(1);
		visitOp.setType((Type)visitor.getTypeParameter().get(0));
		visitOp.setUpper(1);
		visitor.getOwnedOperation().add(visitOp);
		
		return result;
	}
}
