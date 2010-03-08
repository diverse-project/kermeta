/* $Id: AtPreVisitor.java,v 1.12 2008-04-28 11:50:55 ftanguy Exp $
 * Project   : kermeta interpreter
 * File      : Extern2CmdCompiler.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 2006
 * Authors       : 
 *     Jean-Marie Mottu
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.Vector;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

public class AtPreVisitor extends KermetaOptimizedVisitor {

	/** The global context */
	protected InterpreterContext interpreterContext;
	/** The memory */
	protected RuntimeMemory memory;

	private Vector listCallFeatureAtPre;
	private Vector listCallVariableAtPre;

	private ExpressionInterpreter expInterp;

	public AtPreVisitor(RuntimeMemory pMemory, ExpressionInterpreter expInt) {
		expInterp = expInt;
		listCallFeatureAtPre = new Vector();
		listCallVariableAtPre = new Vector();
		interpreterContext = expInt.getInterpreterContext();
		memory = pMemory;
	}

	@Override
	public Object visitCallFeature(CallFeature node) {
		RuntimeObject result = null; // The result to be returned by this visit
		if(node.isIsAtpre()){
			listCallFeatureAtPre.add(node);

			//			Handle call to enumeration literals :
			if (node.getStaticEnumLiteral() != null) {
				return memory.getRuntimeObjectForFObject(node.getStaticEnumLiteral());
			}

			// It is a real operation / property call

			fr.irisa.triskell.kermeta.language.structure.Class t_target = null; // Type of the "callee"

			RuntimeObject ro_target = null; // Runtime repr. of target

			// Get the target of the call
			if (node.getTarget() == null) {
				// Self if nothing is specified
				ro_target = interpreterContext.peekCallFrame().getSelf();
			}
			else {
				//ro_target = (RuntimeObject)this.accept(node.getTarget());
				boolean nodetargetatpre = false;
				if (node.getTarget() instanceof CallFeature){
					nodetargetatpre = ((CallFeature)node.getTarget()).isIsAtpre();
				}else if (node.getTarget() instanceof CallVariable){
					nodetargetatpre = ((CallVariable)node.getTarget()).isIsAtpre();
				}
				if(!nodetargetatpre){
					memory.getROFactory().getMemory().getInterpreter().print("WARNING : before running the method '" +getContainerOperation(node).getName()+ "' it is not possible to know the future value of '"+((CallExpression)node.getTarget()).getName()+ "' in the post condition '"+getContainerPostCondition(node).getName()+"'\n");
				}
				ro_target = (RuntimeObject)expInterp.accept(node.getTarget());

			}


			if (ro_target == null) {
				internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
				throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target");
			}

			// Get The type of the Object
			t_target =(fr.irisa.triskell.kermeta.language.structure.Class)((RuntimeObject)ro_target.getMetaclass()).getKCoreObject();

			// This is just a test for debbuging the interpreter. It should never occur
			if (t_target == null) {
				internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
				throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
			}

			// Get the feature
			SimpleType target_type = new SimpleType(t_target,  memory.getTypeCheckerContext());

			if (node.getStaticOperation() == null && node.getStaticProperty() == null) {
				node.getStaticOperation();
				node.getStaticProperty();
				internalLog.error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
				throw new Error("INTERPRETER INTERNAL ERROR : the program does not seem to be correctly type checked : " + node.getName());
			}


			if (node.getStaticOperation() != null) {

			}
			else {
				// It is a property call
				CallableProperty property =  target_type.getPropertyByName(node.getName());
				//CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type, node.getFName());

				//				Check that target is not void
				if (property == null && ro_target == memory.voidINSTANCE) {
					internalLog.debug(" >> INTERPRETER REPORTS Call of '"+ node.getName() +"' property on a void target. Exception raised.");
					expInterp.raiseCallOnVoidTargetException(node,"");
				}

				//				This should never happen is the type checker has checked the program
				if (property == null) {
					internalLog.error("INTERPRETER INTERNAL ERROR : unable to find a feature : " + node.getName() + "in type : " + target_type);
					internalLog.error("May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers");		        
					throw new Error("INTERPRETER INTERNAL ERROR : unable to find a feature : " + node.getName());
				}

				//				Get the runtime object corresponding to the property
				RuntimeObject ro_property = expInterp.getRuntimeObjectForProperty(t_target, property.getProperty().getName());

				// This is just a debbuging check. It should never occur
				if (ro_property == null) {
					internalLog.error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + property.getName());
					internalLog.error("May be the code was not successfully typechecked ? If the typechecker has no error, please contact kermeta developers");
					throw new Error("INTERPRETER INTERNAL ERROR : Unable to find runtime object corresponding to property " + property.getName());
				}

				if (!property.getProperty().isIsDerived())
				{
					// Get the value of the property
					result = fr.irisa.triskell.kermeta.runtime.language.Object.get(ro_target, ro_property);
				}
				else
				{
					result = expInterp.getterDerivedProperty(property, ro_target, node);
				}

			}

			listCallFeatureAtPre.add(result);
		}
		super.visitCallFeature(node);
		return result;
	}

	private Operation getContainerOperation(EObject node) {
		if (node instanceof fr.irisa.triskell.kermeta.language.structure.Package){
			return null;
		}
		
		if(node instanceof fr.irisa.triskell.kermeta.language.structure.Operation){
			return (Operation) node;
		}
		
		return getContainerOperation(node.eContainer());
	}
	
	private Constraint getContainerPostCondition(EObject node) {
		if (node instanceof fr.irisa.triskell.kermeta.language.structure.Package){
			return null;
		}
		
		if(node instanceof Constraint){
			return (Constraint) node;
		}
		
		return getContainerPostCondition(node.eContainer());
	}
	
	public Vector getListCallFeatureAtPre() {
		return listCallFeatureAtPre;
	}

	/**
	 * 
	 */
	public Object visitCallVariable(CallVariable node) {
		RuntimeObject result = null;
		if (node.isIsAtpre()){

			listCallVariableAtPre.add(node);

			Variable var = interpreterContext.peekCallFrame().getVariableByName(node.getName());

			// This is for debugg purposes it should never happend
			if (var == null) {
				internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
				throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
			}

			// It is a simple variable call
			if (node.getParameters().size() == 0)
			{
				result = var.getRuntimeObject();

//				if(node.getStaticType() instanceof fr.irisa.triskell.kermeta.language.structure.Class){
//				//try to use deepClone to use atpre with Objects
//				result = memory.getROFactory().deepCloneRuntimeObjectFromObject(null, result);
//				}


				expInterp.current_variable = var;
				// We add additional information in order to have a better handle of
				// errors --> FIXME : it perhaps pollute the memory not very smartly...
				//result.getData().put(" ");

			}

			listCallVariableAtPre.add(result);
		}
		return result;
	}

	public Vector getListCallVariableAtPre() {
		return listCallVariableAtPre;
	}

}
