package emf.spoon.reflect.declaration.impl.ext;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtTypeParameterImpl;

public class EmfTypeParameterImpl extends CtTypeParameterImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtTypeParameter(this);
		
	}

	
	public void setBounds(List<CtTypeReference<?>> bounds) {
			this.getBounds().clear();
		this.getBounds().addAll(bounds);
		
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





	public boolean hasParent(CtElement candidate) {
		if (getParent() == null)
			return false;
		if (getParent() == candidate)
			return true;
		return getParent().hasParent(candidate);
	}
	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtTypeParameter();
		
	}
	
	public Set<CtTypeReference<?>> getReferencedTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPositions(SourcePosition position) {
		// TODO Auto-generated method stub
		
	}

	public void compileAndReplaceSnippets() {
		// TODO Auto-generated method stub
		
	}


}
