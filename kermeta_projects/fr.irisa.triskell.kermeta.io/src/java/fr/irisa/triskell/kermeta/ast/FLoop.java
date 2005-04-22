package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 21 avr. 2005 22:15:56
 */
public class FLoop extends PrimitiveExpression  {

	public static final String KW_FROM = "from";
	public static final String KW_UNTIL = "until";
	public static final String KW_LOOP = "loop";
	public static final String KW_END = "end";

	private KermetaTokenNode _from_KW;
	private FExpression _init;
	private KermetaTokenNode _until_KW;
	private FExpression _condition;
	private KermetaTokenNode _loop_KW;
	private FExpressionLst _body;
	private KermetaTokenNode _end_KW;

	public KermetaTokenNode getFrom_KW() {
		return _from_KW;
	}
	public FExpression getInit() {
		return _init;
	}
	public KermetaTokenNode getUntil_KW() {
		return _until_KW;
	}
	public FExpression getCondition() {
		return _condition;
	}
	public KermetaTokenNode getLoop_KW() {
		return _loop_KW;
	}
	public FExpressionLst getBody() {
		return _body;
	}
	public KermetaTokenNode getEnd_KW() {
		return _end_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_from_KW != null) count++;
		if (_init != null) count++;
		if (_until_KW != null) count++;
		if (_condition != null) count++;
		if (_loop_KW != null) count++;
		if (_body != null) count++;
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
		if ((_from_KW != null) && (++count == index)) return _from_KW;
		if ((_init != null) && (++count == index)) return _init;
		if ((_until_KW != null) && (++count == index)) return _until_KW;
		if ((_condition != null) && (++count == index)) return _condition;
		if ((_loop_KW != null) && (++count == index)) return _loop_KW;
		if ((_body != null) && (++count == index)) return _body;
		if ((_end_KW != null) && (++count == index)) return _end_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FLoop.
	 */
	public FLoop(
		Token from_KW,
		FExpression init,
		Token until_KW,
		FExpression condition,
		Token loop_KW,
		FExpressionLst body,
		Token end_KW
	) {
		super();

		if (from_KW != null) {
			_from_KW = new KermetaTokenNode(from_KW);
			if (_from_KW._parent != null) throw new RuntimeException();
			_from_KW._parent = this;
		}
		if (init != null) {
			_init = init;
			if (_init._parent != null) throw new RuntimeException();
			_init._parent = this;
		}
		if (until_KW != null) {
			_until_KW = new KermetaTokenNode(until_KW);
			if (_until_KW._parent != null) throw new RuntimeException();
			_until_KW._parent = this;
		}
		if (condition != null) {
			_condition = condition;
			if (_condition._parent != null) throw new RuntimeException();
			_condition._parent = this;
		}
		if (loop_KW != null) {
			_loop_KW = new KermetaTokenNode(loop_KW);
			if (_loop_KW._parent != null) throw new RuntimeException();
			_loop_KW._parent = this;
		}
		if (body != null) {
			_body = body;
			if (_body._parent != null) throw new RuntimeException();
			_body._parent = this;
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
