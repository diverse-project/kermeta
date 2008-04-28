

package org.kermeta.interpreter.internal.constraint;

import org.kermeta.interpreter.internal.CallFeatureInterpreter;

import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ConstraintInterpreter;

public class CallFeatureConstraintInterpreter {

	static public RuntimeObject doIt(CallFeature node, ConstraintInterpreter interpreter) {
		RuntimeObject result = CallFeatureInterpreter.doIt(node, interpreter);
		if ( node.getStaticProperty() != null ) {
			if(node.isIsAtpre() && interpreter.atpreV.getListCallFeatureAtPre().lastIndexOf(node) != -1){
				int index = interpreter.atpreV.getListCallFeatureAtPre().indexOf(node);
				result = (RuntimeObject) interpreter.atpreV.getListCallFeatureAtPre().get(index + 1);
			}
		}
		return result;
	}

}


