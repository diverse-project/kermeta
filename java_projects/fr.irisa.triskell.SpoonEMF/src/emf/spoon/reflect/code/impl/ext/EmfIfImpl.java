package emf.spoon.reflect.code.impl.ext;

import java.lang.annotation.Annotation;
import java.util.Set;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtIfImpl;

public class EmfIfImpl extends CtIfImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtIf(this);
		
	}

	public void setCondition(spoon.reflect.code.CtExpression expression) {
		super.setCondition((spoon.reflect.code.CtExpression) expression);
	}

	public void setElseStatement(CtStatement elseStatement) {
		this.setElseStatement((emf.spoon.reflect.code.CtStatement)elseStatement);
	}

	public void setThenStatement(CtStatement thenStatement) {
		this.setThenStatement((emf.spoon.reflect.code.CtStatement)thenStatement);
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

	public void insertAfter(CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertAfter(CtStatementList statements) {
		// TODO Auto-generated method stub
		
	}



	public Void S() {
		// TODO Auto-generated method stub
		return null;
	}

	public CtCodeElement getSubstitution(CtSimpleType<?> targetType) {
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



	public String getTargetLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTargetLabel(String targetLabel) {
		// TODO Auto-generated method stub
		
	}





	public void insertBefore(CtStatementList<?> statements) {
		// TODO Auto-generated method stub
		
	}




	public void insertBefore(CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void setCondition(emf.spoon.reflect.code.CtExpression value) {
		// TODO Auto-generated method stub
		
	}







}
