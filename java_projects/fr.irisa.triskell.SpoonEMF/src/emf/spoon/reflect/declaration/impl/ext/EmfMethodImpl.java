package emf.spoon.reflect.declaration.impl.ext;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.code.CtBlock;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtMethodImpl;

public class EmfMethodImpl extends CtMethodImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtMethod(this);
		
	}


	public void setFormalTypeParameters(List<CtTypeReference<?>> formalTypeParameters) {
		this.getFormalTypeParameters().clear();
		this.getFormalTypeParameters().addAll(formalTypeParameters);
	}

	public boolean hasModifier(ModifierKind modifier) {
		return !this.getModifiers().isEmpty();
	}

	public void setModifiers(Set<ModifierKind> modifiers) {
		this.getModifiers().clear();
		this.getModifiers().addAll(modifiers);
	}

	public void setBody(CtBlock body) {
		this.body = (emf.spoon.reflect.code.CtBlock) body;
	}

	public void setParameters(List parameters) {
		this.getParameters().clear();
		this.getParameters().addAll(parameters);
		
	}

	public void setThrownTypes(Set thrownTypes) {
		this.getThrownTypes().clear();
		this.getThrownTypes().addAll(thrownTypes);
		
	}

	public void setType(CtTypeReference type) {
		this.type = (emf.spoon.reflect.reference.CtTypeReference) type;
		
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

	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtMethod();
		
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
