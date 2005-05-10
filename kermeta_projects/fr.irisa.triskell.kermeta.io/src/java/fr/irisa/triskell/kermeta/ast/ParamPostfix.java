package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 10 mai 2005 22:42:52
 */
public class ParamPostfix extends Postfix  {


	private KermetaTokenNode _lparen;
	private ActualParameterList _parameters;
	private KermetaTokenNode _rparen;

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
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_parameters != null) && (++count == index)) return _parameters;
		if ((_rparen != null) && (++count == index)) return _rparen;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ParamPostfix.
	 */
	public ParamPostfix(
		Token lparen,
		ActualParameterList parameters,
		Token rparen
	) {
		super();

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
