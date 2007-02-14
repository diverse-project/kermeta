package emf.spoon.reflect.code.impl.ext;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

import spoon.reflect.Factory;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.SourcePosition;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtFieldAccessImpl;

public class EmfFieldAccessImpl extends CtFieldAccessImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtFieldAccess(this);
		
	}

	

	public void setTarget(CtExpression target) {
		this.setTarget((emf.spoon.reflect.code.CtExpression)target);
		
	}

	public void setVariable(CtVariableReference variable) {
		this.setVariable((emf.spoon.reflect.reference.CtVariableReference)variable);
		
	}

	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference)type);
		
	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);
		
		
	}
	
	///////////////////////////////////////
	
	
	
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
