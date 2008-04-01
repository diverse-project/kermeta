

/*$Id: KVariableFactory.java,v 1.1 2008-04-01 15:10:13 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KVariableFactory.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mars 08
* Authors : paco
*/

package org.kermeta.runner.util;

import org.kermeta.runner.model.KStackFrame;
import org.kermeta.runner.model.variable.KAbstractVariable;
import org.kermeta.runner.model.variable.KAttribute;
import org.kermeta.runner.model.variable.KParameter;
import org.kermeta.runner.model.variable.KProperty;
import org.kermeta.runner.model.variable.KReference;
import org.kermeta.runner.model.variable.KVariable;

public class KVariableFactory {

	static public KAbstractVariable createVariable(KStackFrame frame, String s) {
		String[] strings = s.split("\\*");
		if ( strings[0].equals("parameter") ) {
			return new KParameter(frame, strings[1]);
		} else if ( strings[0].equals("variable") ) {
			return new KVariable(frame, strings[1]);
		} else if ( strings[0].equals("reference") ) {
			return new KReference(frame, strings[1]);
		} else if ( strings[0].equals("property") ) {
			return new KProperty(frame, strings[1]);
		} else if ( strings[0].equals("attribute") ) {
			return new KAttribute(frame, strings[1]);	
		}
		return null;
	}
	
	static public KAbstractVariable createVariable(KAbstractVariable parent, String s) {
		String[] strings = s.split("\\*");
		if ( strings[0].equals("parameter") ) {
			return new KParameter(parent, strings[1]);
		} else if ( strings[0].equals("variable") ) {
			return new KVariable(parent, strings[1]);
		} else if ( strings[0].equals("reference") ) {
			return new KReference(parent, strings[1]);
		} else if ( strings[0].equals("property") ) {
			return new KProperty(parent, strings[1]);
		} else if ( strings[0].equals("attribute") ) {
			return new KAttribute(parent, strings[1]);	
		}
		return null;
	}
	
}


