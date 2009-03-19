package emf.spoon.reflect.code.impl.ext;

import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtBlockImpl;

public class EmfBlockImpl extends CtBlockImpl {

	public EmfBlockImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtBlock(this);
		
	}
	

	public void setStatements(List statements) {
		this.getStatements().clear();
		this.getStatements().addAll(statements);
		
	}
	//////////////////////////////////////:
	
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

	public void insertAfter(Filter insertionPoints, CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertAfter(Filter insertionPoints, CtStatementList statements) {
		// TODO Auto-generated method stub
		
	}

	public void insertBefore(Filter insertionPoints, CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertBefore(Filter insertionPoints, CtStatementList statements) {
		// TODO Auto-generated method stub
		
	}

	public void insertBegin(CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertBegin(CtStatementList statements) {
		// TODO Auto-generated method stub
		
	}

	public void insertEnd(CtStatement statement) {
		// TODO Auto-generated method stub
		
	}

	public void insertEnd(CtStatementList statements) {
		// TODO Auto-generated method stub
		
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
	}	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}
	
}
