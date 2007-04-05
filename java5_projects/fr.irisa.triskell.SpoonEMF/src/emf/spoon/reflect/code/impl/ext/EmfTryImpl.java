package emf.spoon.reflect.code.impl.ext;

import java.util.List;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtTryImpl;

public class EmfTryImpl extends CtTryImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtTry(this);
	}

	public void setBody(CtBlock body) {
		this.setBody((emf.spoon.reflect.code.CtBlock)  body);
		
	}

	public void setCatchers(List<CtCatch> catchers) {
		this.getCatchers().clear();
		this.getCatchers().addAll(catchers);
	}

	public void setFinalizer(CtBlock finalizer) {
		this.setFinalizer((emf.spoon.reflect.code.CtBlock)  finalizer);
		
	}
	
	////////////////////////////////////////
	
	
	
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
