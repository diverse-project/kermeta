package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Aug 2, 2005 3:32:10 PM
 */
public class FJavaStaticCall extends PrimitiveExpression  {

	public static final String KW_EXTERN = "extern";

	private KermetaTokenNode _extern_KW;
	private QualifiedID _cname;
	private KermetaTokenNode _dot;
	private KermetaTokenNode _mname;
	private KermetaTokenNode _lparen;
	private ActualParameterList _parameters;
	private KermetaTokenNode _rparen;

	public KermetaTokenNode getExtern_KW() {
		return _extern_KW;
	}
	public QualifiedID getCname() {
		return _cname;
	}
	public KermetaTokenNode getDot() {
		return _dot;
	}
	public KermetaTokenNode getMname() {
		return _mname;
	}
	public KermetaTokenNode getLparen() {
		return _lparen;
	}
	public ActualParameterList getParameters() {
		return _parameters;
	}
	public KermetaTokenNode getRparen() {
		return _rparen;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_extern_KW != null) count++;
		if (_cname != null) count++;
		if (_dot != null) count++;
		if (_mname != null) count++;
		if (_lparen != null) count++;
		if (_parameters != null) count++;
		if (_rparen != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_extern_KW != null) && (++count == index)) return _extern_KW;
		if ((_cname != null) && (++count == index)) return _cname;
		if ((_dot != null) && (++count == index)) return _dot;
		if ((_mname != null) && (++count == index)) return _mname;
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_parameters != null) && (++count == index)) return _parameters;
		if ((_rparen != null) && (++count == index)) return _rparen;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FJavaStaticCall.
	 */
	public FJavaStaticCall(
		Token extern_KW,
		QualifiedID cname,
		Token dot,
		Token mname,
		Token lparen,
		ActualParameterList parameters,
		Token rparen
	) {
		super();

		if (extern_KW != null) {
			_extern_KW = new KermetaTokenNode(extern_KW);
			if (_extern_KW._parent != null) throw new RuntimeException();
			_extern_KW._parent = this;
		}
		if (cname != null) {
			_cname = cname;
			if (_cname._parent != null) throw new RuntimeException();
			_cname._parent = this;
		}
		if (dot != null) {
			_dot = new KermetaTokenNode(dot);
			if (_dot._parent != null) throw new RuntimeException();
			_dot._parent = this;
		}
		if (mname != null) {
			_mname = new KermetaTokenNode(mname);
			if (_mname._parent != null) throw new RuntimeException();
			_mname._parent = this;
		}
		if (lparen != null) {
			_lparen = new KermetaTokenNode(lparen);
			if (_lparen._parent != null) throw new RuntimeException();
			_lparen._parent = this;
		}
		if (parameters != null) {
			_parameters = parameters;
			if (_parameters._parent != null) throw new RuntimeException();
			_parameters._parent = this;
		}
		if (rparen != null) {
			_rparen = new KermetaTokenNode(rparen);
			if (_rparen._parent != null) throw new RuntimeException();
			_rparen._parent = this;
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
