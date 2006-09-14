package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class PackageDecl extends KermetaASTNode  {

	public static final String KW_PACKAGE = "package";

	private Annotations _annotations;
	private KermetaTokenNode _package_KW;
	private QualifiedID _name;
	private KermetaTokenNode _semi;

	public Annotations getAnnotations() {
		return _annotations;
	}
	public KermetaTokenNode getPackage_KW() {
		return _package_KW;
	}
	public QualifiedID getName() {
		return _name;
	}
	public KermetaTokenNode getSemi() {
		return _semi;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_annotations != null) count++;
		if (_package_KW != null) count++;
		if (_name != null) count++;
		if (_semi != null) count++;

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
		if ((_package_KW != null) && (++count == index)) return _package_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_semi != null) && (++count == index)) return _semi;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new PackageDecl.
	 */
	public PackageDecl(
		Annotations annotations,
		Token package_KW,
		QualifiedID name,
		Token semi
	) {
		super();

		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
		}
		if (package_KW != null) {
			_package_KW = new KermetaTokenNode(package_KW);
			if (_package_KW._parent != null) throw new RuntimeException();
			_package_KW._parent = this;
		}
		if (name != null) {
			_name = name;
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (semi != null) {
			_semi = new KermetaTokenNode(semi);
			if (_semi._parent != null) throw new RuntimeException();
			_semi._parent = this;
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
