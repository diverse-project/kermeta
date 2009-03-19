package emf.spoon.reflect.declaration.impl.ext;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtAnnotationTypeImpl;

public class EmfAnnotationTypeImpl extends CtAnnotationTypeImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtAnnotationType(this);		
	}

	public void setModifiers(Set<ModifierKind> modifiers) {
		this.getModifiers().clear();
		this.getModifiers().addAll(modifiers);
	}

	public boolean hasModifier(ModifierKind modifier) {
		return !this.getModifiers().isEmpty();
	}

	public void setFields(List fields) {
		this.getFields().clear();
		this.getFields().addAll(fields);
	}


	public CtSimpleType getNestedType(String name) {
		for (Object  o : this.getNestedTypes()){
			if (((CtSimpleType)o).getSimpleName().equals(name)){
				return (CtSimpleType) o;
			}
		}
		return null;
	}

	public boolean isTopLevel() {
		return getDeclaringType() == null && getPackage() != null;
	}

	
	public void setNestedTypes(Set nestedTypes) {
		this.getNestedTypes().clear();
		this.getNestedTypes().addAll(nestedTypes);
	}

	public CtField getField(String name) {
		for (Object  o : this.getFields()){
			if (((CtField)o).getSimpleName().equals(name)){
				return (CtField) o;
			}
		}
		return null;
	}
	


	
	
	////////////////:
	public void replace(CtElement element) {
		
	}

	public void replace(Filter<? extends CtElement> replacementPoints, CtElement element) {
		
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
		return DeclarationPackage.eINSTANCE.getCtAnnotationType();
		
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
