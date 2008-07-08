package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 juil. 2008 12:04:11
 */
public class ScompUnit extends CompUnit  {


	private Annotations _postAnnotations;
	private PackageDecl _packageDecl;
	private ImportStmts _importStmts;
	private UsingStmts _usingStmts;
	private TopLevelDecls _topLevelDecls;

	public Annotations getPostAnnotations() {
		return _postAnnotations;
	}
	public PackageDecl getPackageDecl() {
		return _packageDecl;
	}
	public ImportStmts getImportStmts() {
		return _importStmts;
	}
	public UsingStmts getUsingStmts() {
		return _usingStmts;
	}
	public TopLevelDecls getTopLevelDecls() {
		return _topLevelDecls;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_postAnnotations != null) count++;
		if (_packageDecl != null) count++;
		if (_importStmts != null) count++;
		if (_usingStmts != null) count++;
		if (_topLevelDecls != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_postAnnotations != null) && (++count == index)) return _postAnnotations;
		if ((_packageDecl != null) && (++count == index)) return _packageDecl;
		if ((_importStmts != null) && (++count == index)) return _importStmts;
		if ((_usingStmts != null) && (++count == index)) return _usingStmts;
		if ((_topLevelDecls != null) && (++count == index)) return _topLevelDecls;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ScompUnit.
	 */
	public ScompUnit(
		Annotations postAnnotations,
		PackageDecl packageDecl,
		ImportStmts importStmts,
		UsingStmts usingStmts,
		TopLevelDecls topLevelDecls
	) {
		super();

		if (postAnnotations != null) {
			_postAnnotations = postAnnotations;
			if (_postAnnotations._parent != null) throw new RuntimeException();
			_postAnnotations._parent = this;
		}
		if (packageDecl != null) {
			_packageDecl = packageDecl;
			if (_packageDecl._parent != null) throw new RuntimeException();
			_packageDecl._parent = this;
		}
		if (importStmts != null) {
			_importStmts = importStmts;
			if (_importStmts._parent != null) throw new RuntimeException();
			_importStmts._parent = this;
		}
		if (usingStmts != null) {
			_usingStmts = usingStmts;
			if (_usingStmts._parent != null) throw new RuntimeException();
			_usingStmts._parent = this;
		}
		if (topLevelDecls != null) {
			_topLevelDecls = topLevelDecls;
			if (_topLevelDecls._parent != null) throw new RuntimeException();
			_topLevelDecls._parent = this;
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
