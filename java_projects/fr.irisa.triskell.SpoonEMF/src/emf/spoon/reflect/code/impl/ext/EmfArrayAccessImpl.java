package emf.spoon.reflect.code.impl.ext;

import java.lang.annotation.Annotation;
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
import emf.spoon.reflect.code.impl.CtArrayAccessImpl;

public class EmfArrayAccessImpl extends CtArrayAccessImpl {

	public EmfArrayAccessImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void accept(CtVisitor visitor) {
		visitor.visitCtArrayAccess(this);

	}

	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference)type );

	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);

	}

	public void setTarget(CtExpression target) {
		this.setTarget((emf.spoon.reflect.code.CtExpression)target);
	}
////////////////////////////////////////
	
	
	public Object S() {
		return null;
	}

	public CtCodeElement getSubstitution(CtSimpleType targetType) {
		return null;
	}

	
	public void setIndexExpression(CtExpression expression) {
		this.indexExpression = (emf.spoon.reflect.code.CtExpression) expression;
	
	}
	
	public int compareTo(CtElement o) {
		return 0;
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
	}



	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}





}
