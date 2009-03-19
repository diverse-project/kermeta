package emf.spoon.reflect.code.impl.ext;

import java.util.Set;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.code.impl.CtLocalVariableImpl;

public class EmfLocalVariableImpl extends CtLocalVariableImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtLocalVariable(this);
	}

	public boolean hasModifier(ModifierKind modifier) {
		return !this.getModifiers().isEmpty();
	}

	public void setModifiers(Set<ModifierKind> modifiers) {
		this.getModifiers().clear();
		this.getModifiers().addAll(modifiers);
		
	}

	public void setType(CtTypeReference type) {
		this.setType((emf.spoon.reflect.reference.CtTypeReference) type);
		
	}
	

	public void setDefaultExpression(CtExpression assignedExpression) {
		this.setDefaultExpression((emf.spoon.reflect.code.CtExpression)  assignedExpression);
	}

	//TODO Depending of the context
   /* public emf.spoon.reflect.reference.CtLocalVariableReference getReference() {
        return (emf.spoon.reflect.reference.CtLocalVariableReference) getFactory().Code().createLocalVariableReference(this);
    }*/
	
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

	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}


	public void setVisibility(ModifierKind visibility) {
		getModifiers().remove(ModifierKind.PUBLIC);
		getModifiers().remove(ModifierKind.PROTECTED);
		getModifiers().remove(ModifierKind.PRIVATE);
		getModifiers().add(visibility);
	}

	public ModifierKind getVisibility() {
		if (getModifiers().contains(ModifierKind.PUBLIC))
			return ModifierKind.PUBLIC;
		if (getModifiers().contains(ModifierKind.PROTECTED))
			return ModifierKind.PROTECTED;
		if (getModifiers().contains(ModifierKind.PRIVATE))
			return ModifierKind.PRIVATE;
		return null;
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
