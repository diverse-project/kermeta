package emf.spoon.reflect.reference.impl.ext;

import java.awt.geom.Arc2D.Float;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtVisitor;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.reference.impl.CtTypeParameterReferenceImpl;

public class EmfTypeParameterReferenceImpl extends CtTypeParameterReferenceImpl {

	public void accept(CtVisitor visitor) {
		visitor.visitCtTypeParameterReference(this);
	}

	public void setActualTypeArguments(
			List<CtTypeReference<?>> actualTypeArguments) {
		this.getActualTypeArguments().clear();
		this.getActualTypeArguments().clear();

	}



	public Annotation getAnnotation(Class annotationType) {
		CtElement e = getDeclaration();
		if (e != null) {
			return (Annotation) e.getAnnotation(annotationType);
		}
		return null;
	}


	public String getQualifiedName() {
		if (getDeclaringType() != null) {
            return getDeclaringType().getQualifiedName()
                    + CtType.INNERTTYPE_SEPARATOR + getSimpleName();
        } else if (getPackage() != null) {
            return getPackage().getSimpleName() + CtPackage.PACKAGE_SEPARATOR
                    + getSimpleName();
        } else {
            return getSimpleName();
        }
	}

	

	public boolean isAssignableFrom(CtTypeReference type) {
		 return type.isSubtypeOf(this);
	}

	public boolean isPrimitif() {
		return (getSimpleName().equals("boolean")
                || getSimpleName().equals("byte")
                || getSimpleName().equals("double")
                || getSimpleName().equals("int")
                || getSimpleName().equals("short")
                || getSimpleName().equals("char")
                || getSimpleName().equals("long")
                || getSimpleName().equals("float") || getSimpleName().equals(
                "void"));
	}

	public boolean isSubtypeOf(CtTypeReference type) {
		CtSimpleType t2 = (CtSimpleType) type.getDeclaration();
        CtSimpleType t1 = getDeclaration();
        if (t1 == null && t2 == null) {
            try {
                if (((this instanceof CtArrayTypeReference) || (type instanceof CtArrayTypeReference))) {
                    if ((this instanceof CtArrayTypeReference)
                            && (type instanceof CtArrayTypeReference)) {
                        return ((CtArrayTypeReference) this)
                                .getComponentType().isSubtypeOf(
                                        ((CtArrayTypeReference<?>) type)
                                                .getComponentType());
                    } else {
                        return false;
                    }
                }
                Class<?> c1 = Class.forName(this.getQualifiedName());
                Class<?> c2 = Class.forName(type.getQualifiedName());
                return c2.isAssignableFrom(c1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (getQualifiedName().equals(type.getQualifiedName()))
            return true;
        if (t1 != null) {
            if (t1 instanceof CtType) {
                for (Object o : ((CtType<?>) t1)
                        .getSuperInterfaces()) {
                	CtTypeReference ref = (CtTypeReference) o;
                	if (ref.isSubtypeOf(type))
                        return true;
                }
                if (t1 instanceof CtClass) {
                    if (((CtClass<?>) t1).getSuperclass() == null)
                        return false;
                    return ((CtClass<?>) t1).getSuperclass().isSubtypeOf(type);
                }
            }
            return false;
        } else {
            try {
                Class<?> c = Class.forName(getQualifiedName());
                Class<?> candidate = Class.forName(type.getQualifiedName());
                return candidate.isAssignableFrom(c);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return false;
        }
	}
	
	public void setDeclaringType(CtTypeReference type) {
		this.declaringType = (emf.spoon.reflect.reference.CtTypeReference) type;
	}

	public void setPackage(CtPackageReference pack) {
		this.package_ = (emf.spoon.reflect.reference.CtPackageReference) pack;

	}

	public CtTypeReference box() {
		 if (!isPrimitif())
	            return this;
	        if (getSimpleName().equals("int"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Integer.class);
	        if (getSimpleName().equals("float"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Float.class);
	        if (getSimpleName().equals("long"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Long.class);
	        if (getSimpleName().equals("char"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Character.class);
	        if (getSimpleName().equals("double"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Double.class);
	        if (getSimpleName().equals("boolean"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Boolean.class);
	        if (getSimpleName().equals("short"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Short.class);
	        if (getSimpleName().equals("byte"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Byte.class);
	        if (getSimpleName().equals("void"))
	            return (CtTypeReference) this.getFactory().Type().createReference(Void.class);
	        return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference unbox() {
		 if (!isPrimitif())
	            return this;
	        if (getActualClass() == Integer.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(int.class);
	        if (getActualClass() == Float.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(float.class);
	        if (getActualClass() == Long.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(long.class);
	        if (getActualClass() == Character.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(char.class);
	        if (getActualClass() == Double.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(double.class);
	        if (getActualClass() == Boolean.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(boolean.class);
	        if (getActualClass() == Short.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(short.class);
	        if (getActualClass() == Byte.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(byte.class);
	        if (getActualClass() == Void.class)
	            return (CtTypeReference) this.getFactory().Type().createReference(void.class);
	        return this;
	}

	public boolean isUpper() {
		
		return this.getUpper();
	}



	public void setUpper(boolean upper) {
		this.upper = upper;

	}

	public int compareTo(CtReference o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<CtFieldReference<?>> getDeclaredFields() {
		Collection<CtFieldReference<?>> l = new ArrayList<CtFieldReference<?>>();
		CtSimpleType t = getDeclaration();
		if (t == null) {
			for (Field f : getActualClass().getDeclaredFields()) {
				l.add(getFactory().Field().createReference(f));
			}
			if(getActualClass().isAnnotation()){
				for(Method m: getActualClass().getDeclaredMethods()){
					CtTypeReference<?> retRef = getFactory().Type().createReference(m.getReturnType());
					CtFieldReference<?> fr = getFactory().Field().createReference(this, retRef, m.getName());
//					fr.
					l.add(fr);
				}
			}

		} else {
			for (Object f : t.getFields()) {
				l.add(((CtField)f).getReference());
			}
		}
		return l;
	}

	public Collection<CtExecutableReference<?>> getDeclaredExecutables() {
		Collection<CtExecutableReference<?>> l = new ArrayList<CtExecutableReference<?>>();
		CtSimpleType t = getDeclaration();
		if (t == null) {
			for (Method m : getActualClass().getDeclaredMethods()) {
				l.add(getFactory().Method().createReference(m));
			}
			for (Constructor c : getActualClass().getDeclaredConstructors()) {
				l.add(getFactory().Constructor().createReference(c));
			}
		} else {
			if (t instanceof CtType) {
				for (CtMethod m : ((CtType<?>) t).getMethods()) {
					l.add(m.getReference());
				}
			}
			if (t instanceof CtClass) {
				for (CtConstructor c : ((CtClass<?>) t).getConstructors()) {
					l.add(c.getReference());
				}
			}
		}
		return l;
	}

	public Collection<CtFieldReference<?>> getAllFields() {
		Collection<CtFieldReference<?>> l = new ArrayList<CtFieldReference<?>>();
		CtSimpleType t = getDeclaration();
		if (t == null) {
			Class c = getActualClass();
			for (Field f : c.getDeclaredFields()) {
				l.add(getFactory().Field().createReference(f));
			}
			Class<?> sc = c.getSuperclass();
			if (sc != null) {
				l
						.addAll(getFactory().Type().createReference(sc)
								.getAllFields());
			}
		} else {
			for (Object f : t.getFields()) {
				l.add(((CtField)f).getReference());
			}
			if (t instanceof CtClass) {
				CtTypeReference<?> st = ((CtClass<?>) t).getSuperclass();
				if (st != null) {
					l.addAll(st.getAllFields());
				}
			}
		}
		return l;
	}

	public Collection<CtExecutableReference<?>> getAllExecutables() {
		Collection<CtExecutableReference<?>> l = new ArrayList<CtExecutableReference<?>>();
		CtSimpleType t = getDeclaration();
		if (t == null) {
			Class c = getActualClass();
			for (Method m : c.getDeclaredMethods()) {
				l.add(getFactory().Method().createReference(m));
			}
			Class<?> sc = c.getSuperclass();
			if (sc != null) {
				l.addAll(getFactory().Type().createReference(sc)
						.getAllExecutables());
			}
		} else {
			if (t instanceof CtType) {
				for (CtMethod m : ((CtType<?>) t).getMethods()) {
					l.add(m.getReference());
				}
			}
			if (t instanceof CtClass) {
				for (CtConstructor c : ((CtClass<?>) t).getConstructors()) {
					l.add(c.getReference());
				}
				CtTypeReference<?> st = ((CtClass<?>) t).getSuperclass();
				if (st != null) {
					l.addAll(st.getAllExecutables());
				}
			}
		}
		return l;
	}



	public void setBounds(List<CtTypeReference<?>> Bounds) {
			this.getBounds().clear();
		this.getBounds().addAll(Bounds);
		
	}

	public void setDeclaration(spoon.reflect.declaration.CtSimpleType declaration) {
		this.declaration = (CtElement) declaration;
	}



	public CtTypeReference<?> getSuperclass() {
		CtSimpleType t = getDeclaration();
		if (t != null) {
			if (t instanceof CtClass) {
				return ((CtClass<?>) t).getSuperclass();
			}
		} else {
			Class<?> c = getActualClass();
			if (c != null) {
				Class<?> sc = c.getSuperclass();
				if (sc != null) {
					return getFactory().Type().createReference(sc);
				}
			}
		}
		return null;
	}

	public Set<CtTypeReference<?>> getSuperInterfaces() {
		CtSimpleType t = getDeclaration();
		if (t != null) {
			if (t instanceof CtType) {
				return ((CtType<?>) t).getSuperInterfaces();
			}
		} else {
			Class<?> c = getActualClass();
			if (c != null) {
				Class[] sis = c.getInterfaces();
				if (sis != null && sis.length > 0) {
					Set<CtTypeReference<?>> set = new TreeSet<CtTypeReference<?>>();
					for (Class<?> si : sis) {
						set.add(getFactory().Type().createReference(si));
					}
					return set;
				}
			}
		}
		return new TreeSet<CtTypeReference<?>>();
	}


	public Set<ModifierKind> getModifiers() {
		CtVariable v = (CtVariable) getDeclaration();
		if (v != null) {
			return v.getModifiers();
		} else {
			return new TreeSet<ModifierKind>();
		}
	}


	public boolean isPrimitive() {
		return (getSimpleName().equals("boolean")
				|| getSimpleName().equals("byte")
				|| getSimpleName().equals("double")
				|| getSimpleName().equals("int")
				|| getSimpleName().equals("short")
				|| getSimpleName().equals("char")
				|| getSimpleName().equals("long")
				|| getSimpleName().equals("float") || getSimpleName().equals(
				"void"));
	}



	


	
}
