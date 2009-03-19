package emf.spoon.reflect.reference.impl.ext;

import java.util.Set;
import java.util.TreeSet;

import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import emf.spoon.reflect.reference.impl.CtParameterReferenceImpl;

public class EmfParameterReferenceImpl extends CtParameterReferenceImpl {


	public void accept(CtVisitor visitor) {
		visitor.visitCtParameterReference(this);
	}

	public void setType(CtTypeReference type) {
		this.type = (emf.spoon.reflect.reference.CtTypeReference) type;

	}

	public void setDeclaringExecutable(CtExecutableReference executable) {
		this.declaringExecutable = (emf.spoon.reflect.reference.CtExecutableReference) executable;
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
			return new TreeSet<ModifierKind>();
		}
	}


}
