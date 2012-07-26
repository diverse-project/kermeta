package org.kermeta.language.structure.impl;

import org.kermeta.language.structure.TypeVariableBinding;

public class Helper {

	/**
	 * 
	 * @return true if the two classes have the same type variable bindings
	 */
	static boolean equalsTypeParamBinding(org.kermeta.language.structure.Class c0, org.kermeta.language.structure.Class c1) {
		TypeVariableBinding current = null;
		TypeVariableBinding other = null;
		for(java.util.Iterator<TypeVariableBinding> it = c0.getTypeParamBinding().iterator();it.hasNext();){
			current = it.next();
			other = selectSameVariable(current, c1.getTypeParamBinding());
			if(other==null)
				return false;
			if(current.getContainedType().size()==0||other.getContainedType().size()==0)
				return false;
			if(current.getContainedType().get(0)!=other.getContainedType().get(0))
				return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return A type variable binding from <code>l</code> such that it has the same <code>variable</code> attribute than <code>bind</code>, null if such a binding does not exists.
	 */
	static TypeVariableBinding selectSameVariable(TypeVariableBinding bind,java.util.List<TypeVariableBinding> l){
		TypeVariableBinding current = null;
		for(java.util.Iterator<TypeVariableBinding> it = l.iterator();it.hasNext();){
			current = it.next();
			if(current.getVariable().equals(bind.getVariable()))
				return current;
		}
		return null;
	}
}
