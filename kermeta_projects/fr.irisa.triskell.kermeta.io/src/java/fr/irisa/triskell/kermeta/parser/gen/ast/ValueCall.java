package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 juil. 2008 12:04:11
 */
public class ValueCall extends PrimitiveExpression  {

	public static final String KW_VALUE = "value";

	private KermetaTokenNode _value_KW;

	public KermetaTokenNode getValue_KW() {
		return _value_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_value_KW != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_value_KW != null) && (++count == index)) return _value_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ValueCall.
	 */
	public ValueCall(
		TokenInfo value_KW
	) {
		super();

		if (value_KW != null) {
			_value_KW = new KermetaTokenNode(value_KW);
			if (_value_KW._parent != null) throw new RuntimeException();
			_value_KW._parent = this;
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
