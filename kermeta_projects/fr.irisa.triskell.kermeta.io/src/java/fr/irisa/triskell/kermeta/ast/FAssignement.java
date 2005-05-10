package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 10 mai 2005 22:42:52
 */
public class FAssignement extends FExpression  {


	private Annotations _preAnnotations;
	private LogicalExpression _expression;
	private AssignementOp _assignementOp;
	private KermetaTokenNode _equals;
	private LogicalExpression _newvalue;
	private Annotations _postAnnotations;

	public Annotations getPreAnnotations() {
		return _preAnnotations;
	}
	public LogicalExpression getExpression() {
		return _expression;
	}
	public AssignementOp getAssignementOp() {
		return _assignementOp;
	}
	public KermetaTokenNode getEquals() {
		return _equals;
	}
	public LogicalExpression getNewvalue() {
		return _newvalue;
	}
	public Annotations getPostAnnotations() {
		return _postAnnotations;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_preAnnotations != null) count++;
		if (_expression != null) count++;
		if (_assignementOp != null) count++;
		if (_equals != null) count++;
		if (_newvalue != null) count++;
		if (_postAnnotations != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_preAnnotations != null) && (++count == index)) return _preAnnotations;
		if ((_expression != null) && (++count == index)) return _expression;
		if ((_assignementOp != null) && (++count == index)) return _assignementOp;
		if ((_equals != null) && (++count == index)) return _equals;
		if ((_newvalue != null) && (++count == index)) return _newvalue;
		if ((_postAnnotations != null) && (++count == index)) return _postAnnotations;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FAssignement.
	 */
	public FAssignement(
		Annotations preAnnotations,
		LogicalExpression expression,
		AssignementOp assignementOp,
		Token equals,
		LogicalExpression newvalue,
		Annotations postAnnotations
	) {
		super();

		if (preAnnotations != null) {
			_preAnnotations = preAnnotations;
			if (_preAnnotations._parent != null) throw new RuntimeException();
			_preAnnotations._parent = this;
		}
		if (expression != null) {
			_expression = expression;
			if (_expression._parent != null) throw new RuntimeException();
			_expression._parent = this;
		}
		if (assignementOp != null) {
			_assignementOp = assignementOp;
			if (_assignementOp._parent != null) throw new RuntimeException();
			_assignementOp._parent = this;
		}
		if (equals != null) {
			_equals = new KermetaTokenNode(equals);
			if (_equals._parent != null) throw new RuntimeException();
			_equals._parent = this;
		}
		if (newvalue != null) {
			_newvalue = newvalue;
			if (_newvalue._parent != null) throw new RuntimeException();
			_newvalue._parent = this;
		}
		if (postAnnotations != null) {
			_postAnnotations = postAnnotations;
			if (_postAnnotations._parent != null) throw new RuntimeException();
			_postAnnotations._parent = this;
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
