

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.TypeLiteral;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.typechecker.TypeVariableEnforcer;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class TypeLiteralInterpreter {

	static public RuntimeObject doIt(TypeLiteral node, ExpressionInterpreter interpreter) {
        RuntimeObject result = null;
        if (node!=null) 
        	interpreter.setParent(node);
        Type t = ((SimpleType)TypeCheckerContext.getTypeFromMultiplicityElement(node.getTyperef())).getType();
       
        if (t instanceof Class) {
        	Class c = (Class)t;
	        // FIXME : Type variables should be handled here (substitutions of variables) done ?
	        if (c.getTypeParamBinding().size() != 0) {
	        	@SuppressWarnings("unused")
				Class self_class = (Class)interpreter.getInterpreterContext().peekCallFrame().getSelf().getMetaclass().getKCoreObject();
	            c = (Class)TypeVariableEnforcer.getBoundType(c, interpreter.getInterpreterContext().peekCallFrame().getTypeParameters());
	            
	        }    
	        result = interpreter.memory.getROFactory().createMetaClass(c);
        } else if (t instanceof ModelType) {
        	result = interpreter.memory.getRuntimeObjectForFObject(t);
    	} else if (t instanceof TypeVariable) {
        	// Find the bound type for this variable
        	Type boundType = (Type) interpreter.getInterpreterContext().peekCallFrame().getTypeParameters().get(t);
        	result = interpreter.memory.getRuntimeObjectForFObject(boundType);
        }
        else {
            // It is an enumeration
            result = interpreter.memory.getRuntimeObjectForFObject(t);
        }
        
        return result;
	}

}


