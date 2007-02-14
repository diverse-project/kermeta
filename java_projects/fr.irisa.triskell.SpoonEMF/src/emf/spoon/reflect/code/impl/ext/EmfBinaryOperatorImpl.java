package emf.spoon.reflect.code.impl.ext;

import java.util.List;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtBinaryOperatorImpl;

public class EmfBinaryOperatorImpl extends CtBinaryOperatorImpl {

	public EmfBinaryOperatorImpl() {
		super();
		
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtBinaryOperator(this);
		
	}


	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference)type);
		
	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);
		
	}


	public void setLeftHandOperand(CtExpression expression) {
		this.setLeftHandOperand((emf.spoon.reflect.code.CtExpression)expression);
		
	}

	public void setRightHandOperand(CtExpression expression) {
		this.setRightHandOperand((emf.spoon.reflect.code.CtExpression)expression);
		
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
}
