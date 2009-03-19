package emf.spoon.reflect.code.impl.ext;

import java.util.List;
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
import emf.spoon.reflect.code.impl.CtAssignmentImpl;

public class EmfAssignmentImpl extends CtAssignmentImpl {

	public EmfAssignmentImpl() {
		super();
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtAssignment(this);

	}

	
	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference)type);

	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);

	}


	public void setAssigned(CtExpression assigned) {
		this.setAssigned((emf.spoon.reflect.code.CtExpression)assigned);

	}

	public void setAssignment(CtExpression assignment) {
		this.setAssignment((emf.spoon.reflect.code.CtExpression)assignment);

	}
	
	/////////////////////////////////////////////////////////:
	
	
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

	public void replace(CtElement element) {
		// TODO Auto-generated method stub

	}

	public void replace(Filter<? extends CtElement> replacementPoints,
			CtElement element) {
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
	}	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}

}
