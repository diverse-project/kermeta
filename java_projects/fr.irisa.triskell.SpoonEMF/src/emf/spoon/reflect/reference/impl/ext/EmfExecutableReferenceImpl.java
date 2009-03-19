package emf.spoon.reflect.reference.impl.ext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import spoon.support.util.RtHelper;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.reference.impl.CtExecutableReferenceImpl;

public class EmfExecutableReferenceImpl extends CtExecutableReferenceImpl {

	
	public void accept(CtVisitor visitor) {
		visitor.visitCtExecutableReference(this);
	}

	public void setActualTypeArguments(List<CtTypeReference<?>> actualTypeArguments) {
		this.getActualTypeArguments().clear();
		this.getActualTypeArguments().addAll(actualTypeArguments);
	}

	
	public Annotation getAnnotation(Class annotationType) {
		CtElement e = getDeclaration();
		if (e != null) {
			return (Annotation) e.getAnnotation(annotationType);
		}
		return null;
	}





	public CtExecutableReference getOverloadingExecutable(CtTypeReference subType) {
		if(subType.equals(getDeclaringType())) return null;
		CtClass<?> c=(CtClass<?>)subType.getDeclaration();
		if(c==null) return null;
		for(CtMethod<?> m:c.getMethods()) {
			if(m.getReference().isOverriding(this)) {
				return (CtExecutableReference)m.getReference();
			}
		}
		return getOverloadingExecutable(c.getSuperclass());
	}

	public boolean isOverloading(CtExecutableReference executable) {
		if (!this.getDeclaringType().isSubtypeOf(executable.getDeclaringType()))
			return false;
		if (!this.getSimpleName().equals(executable.getSimpleName()))
			return false;
		List<CtTypeReference<?>> l1 = this.getParameterTypes();
		List<CtTypeReference<?>> l2 = executable.getParameterTypes();
		if (l1.size() != l2.size())
			return false;
		for (int i = 0; i < l1.size(); i++) {
			if (!l1.get(i).isAssignableFrom(l2.get(i))) {
				return false;
			}
		}
		return true;
	}

	public boolean isStatic() {
		return this.getStatic();
	}

	public void setDeclaringType(CtTypeReference declaringType) {
		this.declaringType = (emf.spoon.reflect.reference.CtTypeReference) declaringType;
	}

	public void setParameterTypes(List parameterTypes) {
		this.getParameterTypes().clear();
		this.getParameterTypes().addAll(parameterTypes);
	}

	public void setStatic(boolean stat) {
		this.static_ = stat;
	}

	public void setType(CtTypeReference type) {
		this.type = (emf.spoon.reflect.reference.CtTypeReference) type;
		
	}

	public int compareTo(CtReference o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean isFinal() {
		CtExecutable e = getDeclaration();
		if (e != null) {
			return e.hasModifier(ModifierKind.FINAL);
		} else {
			Method m = getActualMethod();
			if (m != null) {
				return Modifier.isFinal(m.getModifiers());
			}
		}
		return false;
	}

	public Set<ModifierKind> getModifiers() {
		CtExecutable e = getDeclaration();
		if (e != null) {
			return e.getModifiers();
		} else {
			Method m = getActualMethod();
			if (m != null) {
				return RtHelper.getModifiers(m.getModifiers());
			}
			Constructor c = getActualConstructor();
			if (c != null) {
				return RtHelper.getModifiers(c.getModifiers());
			}
		}
		return new TreeSet<ModifierKind>();
	}

	public CtExecutableReference<?> getOverloadedExecutable() {
		CtTypeReference<?> st = getDeclaringType().getSuperclass();
		CtTypeReference<Object> objectType = getFactory().Type()
				.createReference(Object.class);
		if (st == null)
			return getOverloadedExecutable(objectType, objectType);
		else
			return getOverloadedExecutable(st, objectType);
	}

	private CtExecutableReference<?> getOverloadedExecutable(
			CtTypeReference<?> t, CtTypeReference<Object> objectType) {
		if (t == null)
			return null;
		for (CtExecutableReference<?> e : t.getDeclaredExecutables()) {
			if (this.isOverloading(e)) {
				return e;
			}
		}
		if (t.equals(objectType)) {
			return null;
		}
		CtTypeReference<?> st = t.getSuperclass();
		if (st == null)
			return getOverloadedExecutable(objectType, objectType);
		return getOverloadedExecutable(t.getSuperclass(), objectType);
	}


	public CtExecutableReference getOverridingExecutable() {
		CtTypeReference<?> st = getDeclaringType().getSuperclass();
		CtTypeReference<Object> objectType = getFactory().Type()
				.createReference(Object.class);
		if (st == null)
			return getOverloadedExecutable(objectType, objectType);
		else
			return getOverloadedExecutable(st, objectType);
	}

	public CtExecutableReference getOverridingExecutable(CtTypeReference subType) {
		if (subType == null || subType.equals(getDeclaringType()))
			return null;
		CtSimpleType<?> t = subType.getDeclaration();
		if (t == null)
			return null;
		if (!(t instanceof CtClass))
			return null;
		CtClass<?> c = (CtClass<?>) t;
		for (CtMethod<?> m : c.getMethods()) {
			if (m.getReference().isOverriding(this)) {
				return (CtExecutableReference) m.getReference();
			}
		}
		return getOverridingExecutable(c.getSuperclass());

	}

	public boolean isOverriding(CtExecutableReference executable) {
		if (!this.getDeclaringType().isSubtypeOf(executable.getDeclaringType()))
			return false;
		if (!this.getSimpleName().equals(executable.getSimpleName()))
			return false;
		List<CtTypeReference<?>> l1 = this.getParameterTypes();
		List<CtTypeReference<?>> l2 = executable.getParameterTypes();
		if (l1.size() != l2.size())
			return false;
		for (int i = 0; i < l1.size(); i++) {
			if (!l1.get(i).isAssignableFrom(l2.get(i))) {
				return false;
			}
		}
		return true;
	}


	public boolean isConstructor() {
		return getSimpleName().equals("<init>");
	}

	
}
