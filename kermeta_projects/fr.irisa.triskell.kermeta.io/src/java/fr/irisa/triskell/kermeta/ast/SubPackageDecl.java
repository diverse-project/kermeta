package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 2 oct. 2007 13:10:02
 */
public class SubPackageDecl extends AnnotableElement  {

	public static final String KW_PACKAGE = "package";

	private KermetaTokenNode _package_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _lcurly;
	private TopLevelDecls _topLevelDecls;
	private KermetaTokenNode _rcurly;

	public KermetaTokenNode getPackage_KW() {
		return _package_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getLcurly() {
		return _lcurly;
	}
	public TopLevelDecls getTopLevelDecls() {
		return _topLevelDecls;
	}
	public KermetaTokenNode getRcurly() {
		return _rcurly;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_package_KW != null) count++;
		if (_name != null) count++;
		if (_lcurly != null) count++;
		if (_topLevelDecls != null) count++;
		if (_rcurly != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_package_KW != null) && (++count == index)) return _package_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_lcurly != null) && (++count == index)) return _lcurly;
		if ((_topLevelDecls != null) && (++count == index)) return _topLevelDecls;
		if ((_rcurly != null) && (++count == index)) return _rcurly;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new SubPackageDecl.
	 */
	public SubPackageDecl(
		Token package_KW,
		Token name,
		Token lcurly,
		TopLevelDecls topLevelDecls,
		Token rcurly
	) {
		super();

		if (package_KW != null) {
			_package_KW = new KermetaTokenNode(package_KW);
			if (_package_KW._parent != null) throw new RuntimeException();
			_package_KW._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (lcurly != null) {
			_lcurly = new KermetaTokenNode(lcurly);
			if (_lcurly._parent != null) throw new RuntimeException();
			_lcurly._parent = this;
		}
		if (topLevelDecls != null) {
			_topLevelDecls = topLevelDecls;
			if (_topLevelDecls._parent != null) throw new RuntimeException();
			_topLevelDecls._parent = this;
		}
		if (rcurly != null) {
			_rcurly = new KermetaTokenNode(rcurly);
			if (_rcurly._parent != null) throw new RuntimeException();
			_rcurly._parent = this;
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
