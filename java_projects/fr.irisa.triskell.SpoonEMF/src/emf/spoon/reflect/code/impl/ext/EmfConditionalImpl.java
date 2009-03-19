package emf.spoon.reflect.code.impl.ext;

import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtConditionalImpl;

public class EmfConditionalImpl extends CtConditionalImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtConditional(this);
		
	}

	
	public void setElseExpression(CtExpression elseExpression) {
		this.setElseExpression(( emf.spoon.reflect.code.CtExpression) elseExpression);
		
	}

	public void setThenExpression(CtExpression thenExpression) {
		this.setThenExpression(( emf.spoon.reflect.code.CtExpression) thenExpression);
		
	}
	public void setType(CtTypeReference type) {
		this.setType(( emf.spoon.reflect.reference.CtTypeReference) type);
		
	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);
		
	}

	public void setCondition(CtExpression condition) {
		this.setCondition(( emf.spoon.reflect.code.CtExpression) condition);
		
	}

///////////////////////////////////////////////	
	
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


	public Object S() {
		// TODO Auto-generated method stub
		return null;
	}

	public CtCodeElement getSubstitution(CtSimpleType targetType) {
		// TODO Auto-generated method stub
		return null;
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
