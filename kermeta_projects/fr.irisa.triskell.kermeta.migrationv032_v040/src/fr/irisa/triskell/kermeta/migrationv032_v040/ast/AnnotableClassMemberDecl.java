package fr.irisa.triskell.kermeta.migrationv032_v040.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class AnnotableClassMemberDecl extends KermetaASTNode  {


	private Annotations _annotations;
	private ClassMemberDecl _classMemberDecl;

	public Annotations getAnnotations() {
		return _annotations;
	}
	public ClassMemberDecl getClassMemberDecl() {
		return _classMemberDecl;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_annotations != null) count++;
		if (_classMemberDecl != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_annotations != null) && (++count == index)) return _annotations;
		if ((_classMemberDecl != null) && (++count == index)) return _classMemberDecl;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new AnnotableClassMemberDecl.
	 */
	public AnnotableClassMemberDecl(
		Annotations annotations,
		ClassMemberDecl classMemberDecl
	) {
		super();

		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
		}
		if (classMemberDecl != null) {
			_classMemberDecl = classMemberDecl;
			if (_classMemberDecl._parent != null) throw new RuntimeException();
			_classMemberDecl._parent = this;
		}

	}

	/**
	 * This method overrides the superclass <code>acceptImpl</code> providing
	 * the same implementation.  Here <code>this</code> refers to this specific node
	 * class, so the <code>beginVisit</code> and <code>endVisit</code> methods
	 * specific to this type in the visitor will be invoked.
	 */
	public void acceptImpl(KermetaASTNodeVisitor visitor) {
		boolean visitChildren = visitor.beginVisit(this);
		if (visitChildren) visitChildren(visitor);
		visitor.endVisit(this);
	}

}
