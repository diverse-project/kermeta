package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Mar 9, 2005 4:39:28 PM
 */
public class FRescue extends KermetaASTNode  {

	public static final String KW_RESCUE = "rescue";

	private KermetaTokenNode _rescue_KW;
	private KermetaTokenNode _lparen;
	private KermetaTokenNode _varName;
	private KermetaTokenNode _colon;
	private TypeRef _exTypeRef;
	private KermetaTokenNode _rparen;
	private FExpressionLst _rescstmts;

	public KermetaTokenNode getRescue_KW() {
		return _rescue_KW;
	}
	public KermetaTokenNode getLparen() {
		return _lparen;
	}
	public KermetaTokenNode getVarName() {
		return _varName;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public TypeRef getExTypeRef() {
		return _exTypeRef;
	}
	public KermetaTokenNode getRparen() {
		return _rparen;
	}
	public FExpressionLst getRescstmts() {
		return _rescstmts;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_rescue_KW != null) count++;
		if (_lparen != null) count++;
		if (_varName != null) count++;
		if (_colon != null) count++;
		if (_exTypeRef != null) count++;
		if (_rparen != null) count++;
		if (_rescstmts != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_rescue_KW != null) && (++count == index)) return _rescue_KW;
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_varName != null) && (++count == index)) return _varName;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_exTypeRef != null) && (++count == index)) return _exTypeRef;
		if ((_rparen != null) && (++count == index)) return _rparen;
		if ((_rescstmts != null) && (++count == index)) return _rescstmts;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FRescue.
	 */
	public FRescue(
		Token rescue_KW,
		Token lparen,
		Token varName,
		Token colon,
		TypeRef exTypeRef,
		Token rparen,
		FExpressionLst rescstmts
	) {
		super();

		if (rescue_KW != null) {
			_rescue_KW = new KermetaTokenNode(rescue_KW);
			if (_rescue_KW._parent != null) throw new RuntimeException();
			_rescue_KW._parent = this;
		}
		if (lparen != null) {
			_lparen = new KermetaTokenNode(lparen);
			if (_lparen._parent != null) throw new RuntimeException();
			_lparen._parent = this;
		}
		if (varName != null) {
			_varName = new KermetaTokenNode(varName);
			if (_varName._parent != null) throw new RuntimeException();
			_varName._parent = this;
		}
		if (colon != null) {
			_colon = new KermetaTokenNode(colon);
			if (_colon._parent != null) throw new RuntimeException();
			_colon._parent = this;
		}
		if (exTypeRef != null) {
			_exTypeRef = exTypeRef;
			if (_exTypeRef._parent != null) throw new RuntimeException();
			_exTypeRef._parent = this;
		}
		if (rparen != null) {
			_rparen = new KermetaTokenNode(rparen);
			if (_rparen._parent != null) throw new RuntimeException();
			_rparen._parent = this;
		}
		if (rescstmts != null) {
			_rescstmts = rescstmts;
			if (_rescstmts._parent != null) throw new RuntimeException();
			_rescstmts._parent = this;
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
