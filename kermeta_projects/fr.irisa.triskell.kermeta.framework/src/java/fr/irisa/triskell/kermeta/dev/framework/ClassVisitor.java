/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FCallResult;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FSelfExpression;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ClassVisitor extends KermetaVisitor {
	
	protected KermetaUnit unit;
	protected FClassDefinition visitor;
	protected FOperation acceptOp;

	
	/**
	 * 
	 */
	public ClassVisitor(KermetaUnit unit, FClassDefinition visitor) {
		super();
		this.unit = unit;
		this.visitor = visitor;
		acceptOp = unit.struct_factory.createFOperation();
		
	}

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition arg0) {
		if (!arg0.isFIsAbstract()) {
			arg0.getFOwnedOperation().add(createAcceptMethod(arg0));
		}
		return super.visit(arg0);
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
	
	public FOperation createAcceptMethod(FClassDefinition arg0) {
		
		FOperation result;
		if (arg0.getFName().equals("Object"))
		{
			result = acceptOp;
		}
		else
		{
			result = unit.struct_factory.createFOperation();
			result.setFSuperOperation(acceptOp);
		}
		
		result.setFName("accept");
		FTypeVariable typevar = unit.struct_factory.createFTypeVariable();
		typevar.setFName("ContextType");
		result.getFTypeParameter().add(typevar);
		// visitor : Visitor<ContextType>
		FParameter p1 = unit.struct_factory.createFParameter();
		p1.setFName("visitor");
		FClass p1Type = unit.struct_factory.createFClass();
		p1Type.setFClassDefinition(visitor);
		FTypeVariableBinding bind = unit.struct_factory.createFTypeVariableBinding();
		bind.setFVariable((FTypeVariable)visitor.getFTypeParameter().get(0));
		bind.setFType(typevar);
		p1Type.getFTypeParamBinding().add(bind);
		p1.setFType(p1Type);
		p1.setFUpper(1);
		result.getFOwnedParameter().add(p1);
		// context : ContextType
		FParameter p2 = unit.struct_factory.createFParameter();
		p2.setFName("context");
		p2.setFType(typevar);
		p2.setFUpper(1);
		result.getFOwnedParameter().add(p2);
		// : ContextType
		result.setFType(typevar);
		// Body :
		FAssignement ass = unit.behav_factory.createFAssignement();
		FCallResult res = unit.behav_factory.createFCallResult();
		ass.setFTarget(res);
		FCallFeature fc = unit.behav_factory.createFCallFeature();
		FCallVariable cvisit = unit.behav_factory.createFCallVariable();
		cvisit.setFName("visitor");
		fc.setFTarget(cvisit);
		fc.setFName("visit" + arg0.getFName());
		FSelfExpression self = unit.behav_factory.createFSelfExpression();
		FCallVariable varcontext = unit.behav_factory.createFCallVariable();
		varcontext.setFName("context");
		fc.getFParameters().add(self);
		fc.getFParameters().add(varcontext);
		ass.setFIsCast(false);
		ass.setFValue(fc);
		FBlock block = unit.behav_factory.createFBlock();
		block.getFStatement().add(ass);
		result.setFBody(block);
		result.setFUpper(1);
		
		// And then add visit<> to visitor
		// operation visitObject(node : Object, context : ContextType) : ContextType is abstract
		FOperation visitOp;
		visitOp = unit.struct_factory.createFOperation();
		visitOp.setFName("visit"+arg0.getFName());
		visitOp.setFIsAbstract(true);
		// create params
		FClass nodeClass = unit.struct_factory.createFClass();
		nodeClass.setFClassDefinition(arg0);
		FParameter pv1 = unit.struct_factory.createFParameter();
		pv1.setFName("node");
		pv1.setFType(nodeClass);
		pv1.setFUpper(1);
		visitOp.getFOwnedParameter().add(pv1);
		FParameter pv2 = unit.struct_factory.createFParameter();
		pv2.setFName("context");
		pv2.setFType((FType)visitor.getFTypeParameter().get(0));
		pv2.setFUpper(1);
		visitOp.setFType(typevar);
		visitOp.setFUpper(1);
		visitor.getFOwnedOperation().add(visitOp);
		
		return result;
	}
}
