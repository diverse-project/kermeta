package emf.spoon.reflect.declaration.impl.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.ReferenceTypeFilter;
import emf.spoon.reflect.declaration.CtParameter;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.CtEnumImpl;

public class EmfEnumImpl extends CtEnumImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtEnum(this);
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

	public CtField getField(String name) {
		for (Object o : this.getFields()) {
    		CtField f = (CtField) o;
        if (f.getSimpleName().equals(name)) {
            return f;
        }
    }
		return null;
	}

	public CtSimpleType getNestedType(String name) {
		for (Object o : this.getNestedTypes()) {
			CtSimpleType f = (CtSimpleType) o;
        if (f.getSimpleName().equals(name)) {
            return f;
        }
    }
    return null;
	}

	public boolean isTopLevel() {
		return getDeclaringType() == null && getPackage() != null;
	}

	public void setFields(List fields) {
		this.getFields().clear();
		this.getFields().addAll(fields);
		
	}

	public void setNestedTypes(Set nestedTypes) {
		this.getNestedTypes().clear();
		this.getNestedTypes().addAll(nestedTypes);
	}

public CtMethod getMethod(CtTypeReference returnType, String name, CtTypeReference... parameterTypes) {

		
		
		for (Object mm : methods) { 
			CtMethod m = (CtMethod) mm;
	         if (m.getSimpleName().equals(name)) {
	             if (!m.getType().equals(returnType))
	                 continue;
	             boolean cont = m.getParameters().size() == parameterTypes.length;
	             for (int i = 0; cont && i < m.getParameters().size()
	                     && i < parameterTypes.length; i++) {
	                 if (!((CtParameter)m.getParameters().get(i)).getType().getQualifiedName()
	                         .equals(parameterTypes[i].getQualifiedName())) {
	                     cont = false;
	                 }
	             }
	             if (cont) {
	                 return m;
	             }
	         }
	     }
	     return null;

	}

	public CtMethod getMethod(String name, CtTypeReference... parameterTypes) {
		for (Object m1 : methods) {
    		CtMethod m = (CtMethod) m1;
        if (m.getSimpleName().equals(name)) {
            boolean cont = m.getParameters().size() == parameterTypes.length;
            for (int i = 0; cont && i < m.getParameters().size()
                    && i < parameterTypes.length; i++) {
                if (!((CtParameter)m.getParameters().get(i)).getType().getQualifiedName()
                        .equals(parameterTypes[i].getQualifiedName())) {
                    cont = false;
                }
            }
            if (cont) {
                return m;
            }
        }
    }
    return null;	
    }


	public void setMethods(Set methods) {
		this.getMethods().clear();
		this.getMethods().addAll(methods);
	}

	public void setSuperInterfaces(Set interfaces) {
		this.getSuperinterfaces().clear();
		this.getSuperinterfaces().addAll(interfaces);
		
	}

	public String getQualifiedName() {
		if (getPackage() != null
				&& !getPackage().getSimpleName().equals(
						CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
			return getPackage().getQualifiedName() + "." + getSimpleName();
		}
		return getSimpleName();
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



	public Set getSuperInterfaces() {
		
		return super.getSuperinterfaces();
	}



	public boolean isSubtypeOf(CtTypeReference type) {
		for (Object ref : getSuperInterfaces()) {
			if (((CtTypeReference)ref).isSubtypeOf(type))
				return true;
		}
		return false;
	}

	@Override
	public EClass eClass() {
		return DeclarationPackage.eINSTANCE.getCtEnum();
		
	}
	public String getSignature() {
		// TODO Auto-generated method stub
		return null;
	}






	public Set<CtTypeReference<?>> getUsedTypes(boolean includeSamePackage) {
		Set<CtTypeReference<?>> typeRefs = new HashSet<CtTypeReference<?>>();
		for (CtTypeReference<?> typeRef : Query
				.getReferences(this, new ReferenceTypeFilter<CtTypeReference>(
						CtTypeReference.class))) {
			if (!(typeRef.isPrimitive()
					|| (typeRef instanceof CtArrayTypeReference)
					|| typeRef.toString()
							.equals(CtTypeReference.NULL_TYPE_NAME) || (typeRef
					.getPackage() != null && "java.lang".equals(typeRef
					.getPackage().toString())))
					&& !(!includeSamePackage && typeRef.getPackage().equals(
							this.getPackage().getReference()))) {
				typeRefs.add(typeRef);
			}
		}
		return typeRefs;
	}

	List anonymous = new ArrayList();
	public List getAnonymousExecutables() {
		return anonymous;
}



	public CtConstructor getConstructor(CtTypeReference... parameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}
	//TODO  add this to the metamodel
	Set consts = new HashSet();

	public Set getConstructors() {
		// TODO Auto-generated method stub
		return consts;
	}



	public CtTypeReference getSuperclass() {
		// TODO Auto-generated method stub
		return superclass;
	}



	public void setAnonymousExecutables(List e) {
		anonymous = e;
	}



	public void setConstructors(Set constructors) {
		consts = constructors;
		
	}

	CtTypeReference superclass;

	public void setSuperclass(CtTypeReference classType) {
		superclass = classType;
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
