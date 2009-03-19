package emf.spoon.reflect.reference.impl.ext;

import java.util.Set;
import java.util.TreeSet;

import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.reference.impl.CtLocalVariableReferenceImpl;

public class EmfLocalVariableReferenceImpl extends CtLocalVariableReferenceImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtLocalVariableReference(this);
	}


	public void setType(CtTypeReference type) {
		this.type = (emf.spoon.reflect.reference.CtTypeReference) type;
		
	}

	public void setDeclaration(CtLocalVariable declaration) {
		this.declaration = (CtElement) declaration;
		
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
