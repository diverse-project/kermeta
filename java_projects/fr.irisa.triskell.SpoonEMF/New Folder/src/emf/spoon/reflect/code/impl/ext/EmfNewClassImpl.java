package emf.spoon.reflect.code.impl.ext;

import java.util.List;
import java.util.Set;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtNewClassImpl;

public class EmfNewClassImpl extends CtNewClassImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtNewClass(this);
	}
	public void setArguments(List arguments) {
		this.getArguments().clear();
		this.getArguments().addAll(arguments);
		
	}

	public void setExecutable(CtExecutableReference executable) {
		this.setExecutable((emf.spoon.reflect.reference.CtExecutableReference) executable);
		
	}

	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference) type);
		
	}

	public void setTypeCasts(List types) {
		this.getTypeCasts().clear();
		this.getTypeCasts().addAll(types);
		
	}
	

	public void setAnonymousClass(CtClass anonymousClass) {
		this.setAnonymousClass((emf.spoon.reflect.declaration.CtClass ) anonymousClass);
		
	}

	
	/////////////////////////////////////////////:
	
	
	
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

	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}

	CtExpression expression;
	
	public CtExpression getTarget() {
		
		return expression;
	}
	public void setTarget(CtExpression target) {
		this.expression = target;
		
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
