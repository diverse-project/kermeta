package org.kermeta.language.util;

import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ObjectTypeVariable;
import org.kermeta.language.structure.ProductType;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeVariableBinding;
import org.kermeta.language.structure.UnresolvedType;

public class Helper {

	/**
	 * 
	 * @return true if the two classes have the same type variable bindings
	 */
	static public boolean equalsTypeParamBinding(org.kermeta.language.structure.Class c0, org.kermeta.language.structure.Class c1) {
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
	static public TypeVariableBinding selectSameVariable(TypeVariableBinding bind,java.util.List<TypeVariableBinding> l){
		TypeVariableBinding current = null;
		for(java.util.Iterator<TypeVariableBinding> it = l.iterator();it.hasNext();){
			current = it.next();
			if(current.getVariable().equals(bind.getVariable()))
				return current;
		}
		return null;
	}
	
	/**
	 * 
	 * @param t
	 * @return the most precise name for this type
	 */
	static public String getTypeName(Type t){
		StringBuffer result = new StringBuffer();
		if(t instanceof org.kermeta.language.structure.Class){
			result.append(((org.kermeta.language.structure.Class) t).getName());
		}
		else if(t instanceof org.kermeta.language.structure.DataType){
			result.append(((org.kermeta.language.structure.DataType) t).getName());
		}
		else if(t instanceof org.kermeta.language.structure.FunctionType){
			result.append("<");
			result.append(getTypeName(((org.kermeta.language.structure.FunctionType) t).getLeft()));
			result.append("->");
			result.append(getTypeName(((org.kermeta.language.structure.FunctionType) t).getRight()));
			result.append(">");
		}
		else if(t instanceof ProductType){
			for (int i = 0; i < ((ProductType)t).getContainedType().size(); i++) {
				result.append(getTypeName(((ProductType)t).getContainedType().get(i)));
				if(i > 0) result.append(", ");
			}
		}
		else if(t instanceof ObjectTypeVariable){
			result.append(((ObjectTypeVariable)t).getName());
		}
		else if(t instanceof UnresolvedType){
			result.append(((UnresolvedType)t).getTypeIdentifier());
		}
		else if(t instanceof ModelType){
			result.append(((ModelType) t).getTypeDefinition().getName());
		}
		else {
			result.append( t);
		}
		return result.toString();
	}
	
}
