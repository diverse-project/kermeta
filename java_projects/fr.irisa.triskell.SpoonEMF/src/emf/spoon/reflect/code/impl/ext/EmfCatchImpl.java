package emf.spoon.reflect.code.impl.ext;

import java.util.Set;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtCatchImpl;

public class EmfCatchImpl extends CtCatchImpl {

	public EmfCatchImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtCatch(this);

	}

	public void setBody(CtBlock body) {
		setBody((emf.spoon.reflect.code.CtBlock) body);

	}

	public void setParameter(CtLocalVariable parameter) {
		setParameter((emf.spoon.reflect.code.CtLocalVariable) parameter);
	} 

	public void replace(CtElement element) {
		// TODO Auto-generated method stub

	}

	public void replace(Filter<? extends CtElement> replacementPoints,
			CtElement element) {
		// TODO Auto-generated method stub

	}

	public int compareTo(CtElement o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}

	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub

	}

}
