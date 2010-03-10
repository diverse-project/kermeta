package org.kermeta.java.jamoppc.ecore;

import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.PrimitiveType;

/**
 * Visitor Pattern on a Tree structure
 * @author mclavreu
 *
 */
public abstract class TreeVisitor {
	
	/**
	 * Visitor implementation - first pass
	 * Only the CompilationUnit and Classes are processed to create
	 * a hierarchical tree of objects
	 * @param o object to visit
	 */
	public void accept(EObject o){
		if (o instanceof CompilationUnit)
			visitCompilationUnit((CompilationUnit)o);
		else if (o instanceof Class)
			visitClass((Class)o);
		else if (o instanceof Interface)
			visitInterface((Interface)o);
		else if (o instanceof Enumeration)
			visitEnum((Enumeration)o);
		else if (o instanceof EnumConstant)
			visitEnuConstant((EnumConstant)o);
	}
	
	/**
	 * Visitor implementation - second pass
	 * Process the tree created in the first pass and generate the
	 * ECore model elements
	 * @param o object to visit
	 */
	public void accept2(EObject o){
		if (o instanceof Tree<?>)
			visitTree2((Tree<Class>)o);
		else if (o instanceof Node<?>)
			visitNode2((Node<Class>)o);
		else if (o instanceof Class)
			visitClass2((Class)o);
		else if (o instanceof Field)
			visitField2((Field) o);
		else if (o instanceof NamespaceClassifierReference)
			visitNameClassifierReference2((NamespaceClassifierReference)o);
		else if (o instanceof ClassifierReference)
			visitClassifierReference2((ClassifierReference)o);
		else if (o instanceof PrimitiveType)
			visitPrimitiveType2((PrimitiveType) o);
	}
	
	// first pass
	
	public abstract void visitCompilationUnit(CompilationUnit e);
	
	public abstract void visitClass(org.emftext.language.java.classifiers.Class e);
	
	public abstract void visitInterface(Interface e);
	
	public abstract void visitEnum(Enumeration e);
	
	public abstract void visitEnuConstant(EnumConstant e);
	
	// second pass
	
	public abstract void visitTree2(Tree<Class> e);
	
	public abstract void visitNode2(Node<Class> e);
	
	public abstract void visitClass2(org.emftext.language.java.classifiers.Class e);
	
	public abstract void visitField2(Field e);
	
	public abstract void visitNameClassifierReference2(NamespaceClassifierReference e);
	
	public abstract void visitClassifierReference2(ClassifierReference e);
	
	public abstract void visitPrimitiveType2(PrimitiveType e);
}
