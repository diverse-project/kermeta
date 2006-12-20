package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 20 d�c. 2006 11:43:08
 */
public class ModelTypeDecl extends AnnotableElement  {

	public static final String KW_MODELTYPE = "modeltype";

	private KermetaTokenNode _modeltype_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _lt;
	private TypeVarDecllst _typeVarDecllst;
	private KermetaTokenNode _gt;
	private KermetaTokenNode _lcurly;
	private TopLevelDecls _topLevelDecls;
	private KermetaTokenNode _rcurly;

	public KermetaTokenNode getModeltype_KW() {
		return _modeltype_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getLt() {
		return _lt;
	}
	public TypeVarDecllst getTypeVarDecllst() {
		return _typeVarDecllst;
	}
	public KermetaTokenNode getGt() {
		return _gt;
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
		if (_modeltype_KW != null) count++;
		if (_name != null) count++;
		if (_lt != null) count++;
		if (_typeVarDecllst != null) count++;
		if (_gt != null) count++;
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
		if ((_modeltype_KW != null) && (++count == index)) return _modeltype_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_lt != null) && (++count == index)) return _lt;
		if ((_typeVarDecllst != null) && (++count == index)) return _typeVarDecllst;
		if ((_gt != null) && (++count == index)) return _gt;
		if ((_lcurly != null) && (++count == index)) return _lcurly;
		if ((_topLevelDecls != null) && (++count == index)) return _topLevelDecls;
		if ((_rcurly != null) && (++count == index)) return _rcurly;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ModelTypeDecl.
	 */
	public ModelTypeDecl(
		Token modeltype_KW,
		Token name,
		Token lt,
		TypeVarDecllst typeVarDecllst,
		Token gt,
		Token lcurly,
		TopLevelDecls topLevelDecls,
		Token rcurly
	) {
		super();

		if (modeltype_KW != null) {
			_modeltype_KW = new KermetaTokenNode(modeltype_KW);
			if (_modeltype_KW._parent != null) throw new RuntimeException();
			_modeltype_KW._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (lt != null) {
			_lt = new KermetaTokenNode(lt);
			if (_lt._parent != null) throw new RuntimeException();
			_lt._parent = this;
		}
		if (typeVarDecllst != null) {
			_typeVarDecllst = typeVarDecllst;
			if (_typeVarDecllst._parent != null) throw new RuntimeException();
			_typeVarDecllst._parent = this;
		}
		if (gt != null) {
			_gt = new KermetaTokenNode(gt);
			if (_gt._parent != null) throw new RuntimeException();
			_gt._parent = this;
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
