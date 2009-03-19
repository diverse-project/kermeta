package emf.spoon.reflect.declaration.impl.ext;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtPackageImpl;

public class EmfPackageImpl extends CtPackageImpl {

	private boolean registered = false;

	public void accept(CtVisitor visitor) {
		visitor.visitCtPackage(this);
	}

	public boolean hasModifier(ModifierKind modifier) {
		return !this.getModifiers().isEmpty();
	}

	public void setModifiers(Set<ModifierKind> modifiers) {
		this.getModifiers().clear();
		this.getModifiers().addAll(modifiers);
	}

	public CtPackage getPackage(String name) {
		for (Object o : this.getPackages()) {
			CtPackage f = (CtPackage) o;
			if (f.getSimpleName().equals(name)) {
				return f;
			}
		}
		return null;
	}

	public EmfSet getTypes() {
		return super.getTypes();
	}

	public CtSimpleType<?> getType(String simpleName) {
		for (Object o : this.getTypes()) {
			CtSimpleType f = (CtSimpleType) o;
			if (f.getSimpleName().equals(simpleName)) {
				return f;
			}
		}
		return null;
	}

	public String getQualifiedName() {
		if (this.getDeclaringPackage() == null) {
			// System.out.println(this);
			return getSimpleName();
			
		}
		return getDeclaringPackage().getQualifiedName() + "." + getSimpleName();
	}

	public void setPackages(Set<CtPackage> pack) {
		this.getPackages().clear();
		this.getPackages().addAll(pack);
	}

	public void setTypes(Set<CtSimpleType<?>> types) {
		this.getTypes().clear();
		this.getTypes().addAll(types);
	}

	public void replace(CtElement element) {
		// TODO Auto-generated method stub

	}

	public void replace(Filter<? extends CtElement> replacementPoints,
			CtElement element) {
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

	public void setSimpleName(String newSimpleName) {
		super.setSimpleName(newSimpleName);
		/*DeclarationFactoryImpl.SpoonFactory.Package()
		.register( this);
		*/
		
	}
	
	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtPackage();
		
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
