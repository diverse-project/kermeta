package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 28 juin 2007 17:24:33
 */
public class LambdaPostfix extends Postfix  {


	private KermetaTokenNode _lcurly;
	private LambdaPostfixParamLst _params;
	private KermetaTokenNode _pipe;
	private FExpressionLst _expression;
	private KermetaTokenNode _rcurly;

	public KermetaTokenNode getLcurly() {
		return _lcurly;
	}
	public LambdaPostfixParamLst getParams() {
		return _params;
	}
	public KermetaTokenNode getPipe() {
		return _pipe;
	}
	public FExpressionLst getExpression() {
		return _expression;
	}
	public KermetaTokenNode getRcurly() {
		return _rcurly;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_lcurly != null) count++;
		if (_params != null) count++;
		if (_pipe != null) count++;
		if (_expression != null) count++;
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
		if ((_lcurly != null) && (++count == index)) return _lcurly;
		if ((_params != null) && (++count == index)) return _params;
		if ((_pipe != null) && (++count == index)) return _pipe;
		if ((_expression != null) && (++count == index)) return _expression;
		if ((_rcurly != null) && (++count == index)) return _rcurly;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new LambdaPostfix.
	 */
	public LambdaPostfix(
		Token lcurly,
		LambdaPostfixParamLst params,
		Token pipe,
		FExpressionLst expression,
		Token rcurly
	) {
		super();

		if (lcurly != null) {
			_lcurly = new KermetaTokenNode(lcurly);
			if (_lcurly._parent != null) throw new RuntimeException();
			_lcurly._parent = this;
		}
		if (params != null) {
			_params = params;
			if (_params._parent != null) throw new RuntimeException();
			_params._parent = this;
		}
		if (pipe != null) {
			_pipe = new KermetaTokenNode(pipe);
			if (_pipe._parent != null) throw new RuntimeException();
			_pipe._parent = this;
		}
		if (expression != null) {
			_expression = expression;
			if (_expression._parent != null) throw new RuntimeException();
			_expression._parent = this;
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
