package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 17-Feb-2006 19:15:11
 */
public class FBlock extends PrimitiveExpression  {

	public static final String KW_DO = "do";
	public static final String KW_END = "end";

	private KermetaTokenNode _do_KW;
	private Annotations _annotations;
	private FExpressionLst _fExpressionLst;
	private FRescueLst _fRescueLst;
	private KermetaTokenNode _end_KW;

	public KermetaTokenNode getDo_KW() {
		return _do_KW;
	}
	public Annotations getAnnotations() {
		return _annotations;
	}
	public FExpressionLst getFExpressionLst() {
		return _fExpressionLst;
	}
	public FRescueLst getFRescueLst() {
		return _fRescueLst;
	}
	public KermetaTokenNode getEnd_KW() {
		return _end_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_do_KW != null) count++;
		if (_annotations != null) count++;
		if (_fExpressionLst != null) count++;
		if (_fRescueLst != null) count++;
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
		if ((_do_KW != null) && (++count == index)) return _do_KW;
		if ((_annotations != null) && (++count == index)) return _annotations;
		if ((_fExpressionLst != null) && (++count == index)) return _fExpressionLst;
		if ((_fRescueLst != null) && (++count == index)) return _fRescueLst;
		if ((_end_KW != null) && (++count == index)) return _end_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FBlock.
	 */
	public FBlock(
		Token do_KW,
		Annotations annotations,
		FExpressionLst fExpressionLst,
		FRescueLst fRescueLst,
		Token end_KW
	) {
		super();

		if (do_KW != null) {
			_do_KW = new KermetaTokenNode(do_KW);
			if (_do_KW._parent != null) throw new RuntimeException();
			_do_KW._parent = this;
		}
		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
		}
		if (fExpressionLst != null) {
			_fExpressionLst = fExpressionLst;
			if (_fExpressionLst._parent != null) throw new RuntimeException();
			_fExpressionLst._parent = this;
		}
		if (fRescueLst != null) {
			_fRescueLst = fRescueLst;
			if (_fRescueLst._parent != null) throw new RuntimeException();
			_fRescueLst._parent = this;
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
