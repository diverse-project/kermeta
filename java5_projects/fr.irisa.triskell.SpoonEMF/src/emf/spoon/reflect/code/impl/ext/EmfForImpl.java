package emf.spoon.reflect.code.impl.ext;

import java.util.List;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtForImpl;

public class EmfForImpl extends CtForImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtFor(this);
		
	}

	public void setBody(CtStatement body) {
		this.setBody((emf.spoon.reflect.code.CtStatement)body);
		
	}
	

	public void setExpression(CtExpression<Boolean> expression) {
		this.setExpression((emf.spoon.reflect.code.CtExpression) expression);
		
	}

	public void setForInit(List<CtStatement> forInit) {
		this.getForInit().clear();
		this.getForInit().addAll(forInit);
		
	}

	public void setForUpdate(List<CtStatement> forUpdate) {
		this.getForUpdate().clear();
		this.getForUpdate().addAll(forUpdate);
		
	}

	////////////////////////////////////

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

	public void insertBefore(CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertBefore(CtStatementList statements) {
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
	
}
