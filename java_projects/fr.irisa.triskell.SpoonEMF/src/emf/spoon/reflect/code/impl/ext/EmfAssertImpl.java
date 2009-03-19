package emf.spoon.reflect.code.impl.ext;

import java.util.Set;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtAssertImpl;

public class EmfAssertImpl extends CtAssertImpl {

	public EmfAssertImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtAssert(this);
	}

	

	public void setAssertExpression(CtExpression asserted) {
		this.setAssertExpression((emf.spoon.reflect.code.CtExpression)asserted);

	}

	public void setExpression(CtExpression expression) {
		this.setExpression((emf.spoon.reflect.code.CtExpression)expression);

	}

	////////////////////////////////////////
	
	
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

	public void insertAfter(CtStatement statement) {
		// TODO Auto-generated method stub

	}

	public void insertAfter(CtStatementList statements) {
		// TODO Auto-generated method stub

	}

	public void insertBefore(CtStatement statement) {
		// TODO Auto-generated method stub

	}

	public void insertBefore(CtStatementList statements) {
		// TODO Auto-generated method stub

	}



	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}
	
	public String getSignature() {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}


}
