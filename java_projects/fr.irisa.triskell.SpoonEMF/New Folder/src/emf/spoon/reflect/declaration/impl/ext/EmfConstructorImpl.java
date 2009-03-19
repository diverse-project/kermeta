package emf.spoon.reflect.declaration.impl.ext;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtConstructorImpl;

public class EmfConstructorImpl extends CtConstructorImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtConstructor(this);
		
	}


	public void setFormalTypeParameters(List formalTypeParameters) {
		this.getFormalTypeParameters().clear();
		this.getFormalTypeParameters().addAll(formalTypeParameters);
		
	}

	public void setModifiers(Set<ModifierKind> modifiers) {
		this.getModifiers().clear();
		this.modifiers.addAll(modifiers);
		
	}

	public void setBody(spoon.reflect.code.CtBlock body) {
		this.body = (emf.spoon.reflect.code.CtBlock) body;
	}

	public void setParameters(List parameters) {
		this.getParameters().clear();
		for (Object o : parameters){
			//System.out.println(o);
			this.getParameters().add(o);
		}
		
	}

	public void setThrownTypes(Set thrownTypes1) {
		this.getThrownTypes().clear();
		this.thrownTypes.addAll(thrownTypes1);
	}
	


	public boolean hasModifier(ModifierKind modifier) {
		// TODO Auto-generated method stub
		return !this.getModifiers().isEmpty();
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





	public CtTypeReference getType() {
		
		return null;
	}


	public void setType(CtTypeReference type) {
		// TODO Auto-generated method stub
		
	}


	public boolean isImplicitDefault() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtConstructor();
		
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

	public void compileAndReplaceSnippets() {
		// TODO Auto-generated method stub
		
	}


}
