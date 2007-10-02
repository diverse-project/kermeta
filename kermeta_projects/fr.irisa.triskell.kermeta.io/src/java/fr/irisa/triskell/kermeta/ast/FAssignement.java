package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 2 oct. 2007 13:10:02
 */
public class FAssignement extends FExpression  {


	private Annotations _annotations;
	private LogicalExpression _expression;
	private AssignementOp _assignementOp;
	private KermetaTokenNode _equals;
	private LogicalExpression _newvalue;

	public Annotations getAnnotations() {
		return _annotations;
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


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_annotations != null) count++;
		if (_expression != null) count++;
		if (_assignementOp != null) count++;
		if (_equals != null) count++;
		if (_newvalue != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_annotations != null) && (++count == index)) return _annotations;
		if ((_expression != null) && (++count == index)) return _expression;
		if ((_assignementOp != null) && (++count == index)) return _assignementOp;
		if ((_equals != null) && (++count == index)) return _equals;
		if ((_newvalue != null) && (++count == index)) return _newvalue;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FAssignement.
	 */
	public FAssignement(
		Annotations annotations,
		LogicalExpression expression,
		AssignementOp assignementOp,
		Token equals,
		LogicalExpression newvalue
	) {
		super();

		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
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
