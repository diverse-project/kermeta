package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class PropertyBody extends KermetaASTNode  {


	private GetterBody _getterBody;
	private SetterBody _setterBody;

	public GetterBody getGetterBody() {
		return _getterBody;
	}
	public SetterBody getSetterBody() {
		return _setterBody;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_getterBody != null) count++;
		if (_setterBody != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_getterBody != null) && (++count == index)) return _getterBody;
		if ((_setterBody != null) && (++count == index)) return _setterBody;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new PropertyBody.
	 */
	public PropertyBody(
		GetterBody getterBody,
		SetterBody setterBody
	) {
		super();

		if (getterBody != null) {
			_getterBody = getterBody;
			if (_getterBody._parent != null) throw new RuntimeException();
			_getterBody._parent = this;
		}
		if (setterBody != null) {
			_setterBody = setterBody;
			if (_setterBody._parent != null) throw new RuntimeException();
			_setterBody._parent = this;
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
