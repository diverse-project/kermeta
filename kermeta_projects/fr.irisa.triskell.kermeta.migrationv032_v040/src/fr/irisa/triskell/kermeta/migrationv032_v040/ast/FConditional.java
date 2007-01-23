package fr.irisa.triskell.kermeta.migrationv032_v040.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class FConditional extends PrimitiveExpression  {

	public static final String KW_IF = "if";
	public static final String KW_THEN = "then";
	public static final String KW_ELSE = "else";
	public static final String KW_END = "end";

	private KermetaTokenNode _if_KW;
	private FExpression _condition;
	private KermetaTokenNode _then_KW;
	private FExpressionLst _ifblock;
	private KermetaTokenNode _else_KW;
	private FExpressionLst _elseblock;
	private KermetaTokenNode _end_KW;

	public KermetaTokenNode getIf_KW() {
		return _if_KW;
	}
	public FExpression getCondition() {
		return _condition;
	}
	public KermetaTokenNode getThen_KW() {
		return _then_KW;
	}
	public FExpressionLst getIfblock() {
		return _ifblock;
	}
	public KermetaTokenNode getElse_KW() {
		return _else_KW;
	}
	public FExpressionLst getElseblock() {
		return _elseblock;
	}
	public KermetaTokenNode getEnd_KW() {
		return _end_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_if_KW != null) count++;
		if (_condition != null) count++;
		if (_then_KW != null) count++;
		if (_ifblock != null) count++;
		if (_else_KW != null) count++;
		if (_elseblock != null) count++;
		if (_end_KW != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_if_KW != null) && (++count == index)) return _if_KW;
		if ((_condition != null) && (++count == index)) return _condition;
		if ((_then_KW != null) && (++count == index)) return _then_KW;
		if ((_ifblock != null) && (++count == index)) return _ifblock;
		if ((_else_KW != null) && (++count == index)) return _else_KW;
		if ((_elseblock != null) && (++count == index)) return _elseblock;
		if ((_end_KW != null) && (++count == index)) return _end_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FConditional.
	 */
	public FConditional(
		Token if_KW,
		FExpression condition,
		Token then_KW,
		FExpressionLst ifblock,
		Token else_KW,
		FExpressionLst elseblock,
		Token end_KW
	) {
		super();

		if (if_KW != null) {
			_if_KW = new KermetaTokenNode(if_KW);
			if (_if_KW._parent != null) throw new RuntimeException();
			_if_KW._parent = this;
		}
		if (condition != null) {
			_condition = condition;
			if (_condition._parent != null) throw new RuntimeException();
			_condition._parent = this;
		}
		if (then_KW != null) {
			_then_KW = new KermetaTokenNode(then_KW);
			if (_then_KW._parent != null) throw new RuntimeException();
			_then_KW._parent = this;
		}
		if (ifblock != null) {
			_ifblock = ifblock;
			if (_ifblock._parent != null) throw new RuntimeException();
			_ifblock._parent = this;
		}
		if (else_KW != null) {
			_else_KW = new KermetaTokenNode(else_KW);
			if (_else_KW._parent != null) throw new RuntimeException();
			_else_KW._parent = this;
		}
		if (elseblock != null) {
			_elseblock = elseblock;
			if (_elseblock._parent != null) throw new RuntimeException();
			_elseblock._parent = this;
		}
		if (end_KW != null) {
			_end_KW = new KermetaTokenNode(end_KW);
			if (_end_KW._parent != null) throw new RuntimeException();
			_end_KW._parent = this;
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
