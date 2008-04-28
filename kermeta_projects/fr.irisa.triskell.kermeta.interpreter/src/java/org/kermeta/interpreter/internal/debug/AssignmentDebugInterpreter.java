

package org.kermeta.interpreter.internal.debug;

import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.interpreter.exceptions.KExceptionFactory;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.DebuggerHelper;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;

public class AssignmentDebugInterpreter {
	
	static public RuntimeObject doIt(Assignment node, DebugInterpreter interpreter) {
		
		
		boolean hasStopped = interpreter.stopIfNecessary(node);
		if ( hasStopped ) {
			switch ( interpreter.getSteppingStatus() ) {
			
			case STEPPING :
				interpreter.step(node);
				break;
			
			case STEPPING_INTO :
				if ( node.getValue() instanceof CallFeature ) {
					CallFeature leftCall = DebuggerHelper.getLeftCallableExpression( (CallFeature) node.getValue());
					interpreter.stepInto(leftCall);
				} else if ( node.getTarget() instanceof CallFeature ) {
					CallFeature leftCall = DebuggerHelper.getLeftCallableExpression( (CallFeature) node.getTarget());
					interpreter.stepInto(leftCall);					
				}
				break;
				
			case RESUMING :
				break;
				
			}
		}
		
		
		if (node!=null) 
			interpreter.setParent(node);

		// The name of the call
		String lhs_name = node.getTarget().getName();
		
		 // The new value 
		RuntimeObject rhs_value = (RuntimeObject) interpreter.accept(node.getValue());
		
		if (node.isIsCast()) {
			
			// Just to be sure !!
			if (node.getTarget().getStaticType() == null) {
				throw new Error("THE PROGRAM CANNOT BE EXECUTED BECAUSE IT HAS NOT BEEN TYPE CHECKED");
			}
			
			Type r = (Type)TypeVariableEnforcer.getBoundType(node.getTarget().getStaticType(), interpreter.getInterpreterContext().peekCallFrame().getTypeParameters());
			
			SimpleType expectedType = new SimpleType(r);
			Class p = (Class) rhs_value.getMetaclass().getKCoreObject();
			SimpleType providedtype = new SimpleType(p);
			
			
			/******************************/
			/* BEGINNING OF HORRIBLE THING */
			/******************************/
			// Type collection of object
			Class coll_class = StructureFactory.eINSTANCE.createClass();    
		    coll_class.setTypeDefinition((ClassDefinition)interpreter.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Collection"));
		    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
		    binding.setVariable((TypeVariable)coll_class.getTypeDefinition().getTypeParameter().get(0));
		    
		    Class object_class = StructureFactory.eINSTANCE.createClass();   
		    object_class.setTypeDefinition((ClassDefinition)interpreter.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::language::structure::Object"));

		    
		    // Set the param binding type
		    binding.setType(object_class);
		    // Add to type param bindings the binding
		    coll_class.getTypeParamBinding().add(binding);

			if (expectedType.equals(new SimpleType(coll_class))) {
				// THIS IS A TERRIBLE HACK TO ALLOW CASTING COLLECTIONS
				// OF ANYTHING TO COLLECTION OF OBJECTS
				// **** THIS IS NOT TYPE SAFE ****
				// IT SHOULD BE USED WITH CAUTION
				// AND IT SHOULD BE REMOVED AS SOON AS 
				// BUG #112 IS FIXED
			}
			
			/******************************/
			/*    END OF HORRIBLE THING   */
			/******************************/
			else if (r instanceof Enumeration) {
			    Enumeration enumeration = (Enumeration)r;
			    if (enumeration.getOwnedLiteral().contains(rhs_value.getKCoreObject())) {
			        // It is OK, let's continue with normal assignment
			    }
			    else {
			        rhs_value = interpreter.getMemory().voidINSTANCE;
			    }
			}
			else if (!providedtype.isSubTypeOf(expectedType)) {
				rhs_value = interpreter.getMemory().voidINSTANCE;
				
			}
			
		}
		
		if (node.getTarget() instanceof CallResult)
		{
		    // Assign the result of the current operation
		    interpreter.getInterpreterContext().peekCallFrame().setOperationResult(rhs_value);
		}
		else if (node.getTarget() instanceof CallVariable)
		{
		    Variable var = interpreter.getInterpreterContext().peekCallFrame().getVariableByName(node.getTarget().getName());
		    
		    // This is for debugg purposes it should never happend
		    if (var == null) {
		    	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getTarget().getName());
		        throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable " + node.getTarget().getName());
		    }
		    
		    var.setRuntimeObject(rhs_value);
		}
		else if (node.getTarget() instanceof CallFeature)
		{
		    // Visiting the callFeature should return the RuntimeObject
		    // From the runtimeObject, get its target
		    CallFeature callfeature = (CallFeature)node.getTarget();
		    
		    // Get the object on which this feature is applied
		    Expression target = callfeature.getTarget();
	    	String propertyName = callfeature.getName();
	    	
	    	RuntimeObject ro_target;
	    	
		    if (target==null)
		    {  	//self reference
		    	ro_target=interpreter.getInterpreterContext().peekCallFrame().getSelf();
		    }
		    // If target is not null, we need to get the corresponding runtime object
		    else
		    // can be a parameter of the current called operation
		    // can be an object already stored as a variable in the blockstacks
		    {
		        // the runtime object corresponding to this target
		       
		        ro_target = (RuntimeObject)interpreter.accept(target);
		    }
		    
		    // This is for debugg purposes it should never happend
		    if (ro_target == null) {
		    	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : null runtime object for target in feature assignement ");
		        throw new Error("INTERPRETER INTERNAL ERROR : null runtime object for target in feature assignement ");
		    }
		    
		    // Check for void target
		    if (ro_target == interpreter.getMemory().voidINSTANCE) {
		    	InterpreterPlugin.internalLog.debug(" >> INTERPRETER REPORTS Call on a void target (property assignement). TODO: raise an exception");
		        KExceptionFactory.raiseCallOnVoidTarget(node,"", interpreter);
		    }
		    
		   Class t_target=(Class)ro_target.getMetaclass().getKCoreObject();

            // FIXME : Property is assumed to be the type of the feature
		    
            RuntimeObject ro_property = interpreter.getRuntimeObjectForProperty(t_target, propertyName);
            // If the target is a Property and is derived, it is updated from the getterbody
            // FIXME : ro_property must not be null
			// Set the value of the property
            if (ro_property == null)
            {
                System.err.println("could not set property '"+propertyName+"' for object '"+lhs_name+"'");
            }
            else
            {
                // Unset the property if it is void
                if (rhs_value == interpreter.getMemory().voidINSTANCE) {
                    fr.irisa.triskell.kermeta.runtime.language.Object.unSet(ro_target,ro_property);
                }
                else {
                    // Get the Property -- is it the right way? 
                    SimpleType target_type = new SimpleType(t_target);                    
                    CallableProperty property =  target_type.getPropertyByName(propertyName);
                    //CallableProperty property =  this.interpreterContext.typeCache.getPropertyByName(target_type,propertyName);
                    Property fproperty = property.getProperty();
                    //Property fproperty = (Property)ro_property.getData().get("kcoreObject");
                    if (!fproperty.isIsDerived())
                    // If it is not derived, assign it
                        fr.irisa.triskell.kermeta.runtime.language.Object.set(ro_target,ro_property,rhs_value);
                    // Else, compute it
                    else
                    {   // no parameter in a property -> "null" below
                    	interpreter.setDerivedProperty(ro_target, property, rhs_value, callfeature);
                    }
                }
            }
		}
		
		return rhs_value;
	}

}


