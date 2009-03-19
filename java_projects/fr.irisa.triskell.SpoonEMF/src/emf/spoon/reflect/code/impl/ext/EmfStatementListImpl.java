package emf.spoon.reflect.code.impl.ext;

import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtStatementListImpl;

public class EmfStatementListImpl extends CtStatementListImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtStatementList(this);
	}

	public void setStatements(List statements) {
		this.getStatements().clear();
		this.getStatements().addAll(statements);
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

	public CtStatementList getSubstitution(CtSimpleType targetType) {
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
}
