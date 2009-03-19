package emf.spoon.reflect.reference.impl.ext;

import java.lang.reflect.Member;
import java.util.Set;
import java.util.TreeSet;

import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.support.util.RtHelper;
import emf.spoon.reflect.reference.impl.CtFieldReferenceImpl;

public class EmfFieldReferenceImpl extends CtFieldReferenceImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtFieldReference(this);
	}



	public void setType(CtTypeReference type) {
		this.type = (emf.spoon.reflect.reference.CtTypeReference) type;
		
	}

	public boolean isFinal() {
		return this.getFinal();
	}

	public boolean isStatic() {
		return this.getStatic();
	}

	public void setDeclaringType(CtTypeReference declaringType) {
		this.declaringType = (emf.spoon.reflect.reference.CtTypeReference) declaringType;
		
	}

	public void setFinal(boolean b) {
		this.final_ = b;
	}

	public void setStatic(boolean b) {
		this.static_ = b;
	}
	public int compareTo(CtReference o) {
		// TODO Auto-generated method stub
		return 0;
	}




	public Set<ModifierKind> getModifiers() {
		CtVariable v = getDeclaration();
		if (v != null) {
			return v.getModifiers();
		} else {
			Member m = getActualField();
			if (m != null) {
				return RtHelper.getModifiers(m.getModifiers());
			} else {
				return new TreeSet<ModifierKind>();
			}
		}
	}


}
