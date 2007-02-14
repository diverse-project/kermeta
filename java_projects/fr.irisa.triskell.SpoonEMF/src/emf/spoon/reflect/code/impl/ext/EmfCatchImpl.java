package emf.spoon.reflect.code.impl.ext;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

import spoon.reflect.Factory;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.SourcePosition;
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
		this.setBody((emf.spoon.reflect.code.CtBlock)body);
		
	}

	public void setParameter(CtLocalVariable<? extends Throwable> parameter) {
		this.setParameter((emf.spoon.reflect.code.CtLocalVariable)parameter );
	}
	
	public void replace(CtElement element) {
		// TODO Auto-generated method stub
		
	}

	public void replace(Filter<? extends CtElement> replacementPoints, CtElement element) {
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
	
}
