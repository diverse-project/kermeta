/* $Id: AtPreVisitor.java,v 1.2 2006-12-07 09:55:46 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
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
	
	private ExpressionInterpreter expInterp;
	
	public AtPreVisitor(RuntimeMemory pMemory, ExpressionInterpreter expInt , InterpreterContext itC) {
		expInterp = expInt;
		listCallFeatureAtPre = new Vector();
		interpreterContext = itC;
		pMemory.setCurrentInterpreter(expInt);
		memory = pMemory;
	}
	
	@Override
	public Object visitCallFeature(CallFeature node) {
		if(node.isIsAtpre()){
			listCallFeatureAtPre.add(node);
			
			//			Handle call to enumeration literals :
			if (node.getStaticEnumLiteral() != null) {
				return memory.getRuntimeObjectForFObject(node.getStaticEnumLiteral());
			}
			
			// It is a real operation / property call
			
			fr.irisa.triskell.kermeta.language.structure.Class t_target = null; // Type of the "callee"
			RuntimeObject result = null; // The result to be returned by this visit
			RuntimeObject ro_target = null; // Runtime repr. of target
			
			// Get the target of the call
			if (node.getTarget() == null) {
				// Self if nothing is specified
				ro_target = interpreterContext.peekCallFrame().getSelf();
			}
			else {
				ro_target = (RuntimeObject)this.accept(node.getTarget());
			}
			
			
			if (ro_target == null) {
				internalLog.error("INTERPRETER INTERNAL ERROR : Call on a null target");
				throw new Error("INTERPRETER INTERNAL ERROR : Call on a null target");
			}
			
			// Get The type of the Object
			t_target =(fr.irisa.triskell.kermeta.language.structure.Class)((RuntimeObject)ro_target.getMetaclass()).getData().get("kcoreObject");
			
			// This is just a test for debbuging the interpreter. It should never occur
			if (t_target == null) {
				internalLog.error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
				throw new Error("INTERPRETER INTERNAL ERROR : unable to get the type of the target");
			}
			
			// Get the feature
			SimpleType target_type = new SimpleType(t_target);
			
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
		return super.visitCallFeature(node);
	}
	
	public Vector getListCallFeatureAtPre() {
		return listCallFeatureAtPre;
	}
}
