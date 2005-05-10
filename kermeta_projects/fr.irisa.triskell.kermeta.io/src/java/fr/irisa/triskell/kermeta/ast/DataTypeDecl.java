package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 10 mai 2005 22:42:52
 */
public class DataTypeDecl extends AnnotableElement  {

	public static final String KW_ALIAS = "alias";

	private KermetaTokenNode _alias_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private Type _instanceClass;
	private KermetaTokenNode _semi;

	public KermetaTokenNode getAlias_KW() {
		return _alias_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public Type getInstanceClass() {
		return _instanceClass;
	}
	public KermetaTokenNode getSemi() {
		return _semi;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_alias_KW != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_instanceClass != null) count++;
		if (_semi != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_alias_KW != null) && (++count == index)) return _alias_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_instanceClass != null) && (++count == index)) return _instanceClass;
		if ((_semi != null) && (++count == index)) return _semi;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new DataTypeDecl.
	 */
	public DataTypeDecl(
		Token alias_KW,
		Token name,
		Token colon,
		Type instanceClass,
		Token semi
	) {
		super();

		if (alias_KW != null) {
			_alias_KW = new KermetaTokenNode(alias_KW);
			if (_alias_KW._parent != null) throw new RuntimeException();
			_alias_KW._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (colon != null) {
			_colon = new KermetaTokenNode(colon);
			if (_colon._parent != null) throw new RuntimeException();
			_colon._parent = this;
		}
		if (instanceClass != null) {
			_instanceClass = instanceClass;
			if (_instanceClass._parent != null) throw new RuntimeException();
			_instanceClass._parent = this;
		}
		if (semi != null) {
			_semi = new KermetaTokenNode(semi);
			if (_semi._parent != null) throw new RuntimeException();
			_semi._parent = this;
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
