package emf.spoon.reflect.code.impl.ext;

import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtNewArrayImpl;

public class EmfNewArrayImpl extends CtNewArrayImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtNewArray(this);
	}


	public void setDimensionExpressions(List dimensions) {
		this.getDimensionExpressions().clear();
		
	}

	public void setElements(List expression) {
		this.getElements().clear();
		this.getElements().addAll(expression);
		
	}
	
	
	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference) type);
		
	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);
		
	}

	
	//////////
	
	
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



	public String getTargetLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTargetLabel(String targetLabel) {
		// TODO Auto-generated method stub
		
	}
}
