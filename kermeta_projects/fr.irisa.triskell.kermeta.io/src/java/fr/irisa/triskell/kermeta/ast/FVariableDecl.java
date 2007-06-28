package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 28 juin 2007 17:24:33
 */
public class FVariableDecl extends PrimitiveExpression  {

	public static final String KW_VAR = "var";
	public static final String KW_INIT = "init";

	private KermetaTokenNode _var_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;
	private KermetaTokenNode _init_KW;
	private FExpression _init;

	public KermetaTokenNode getVar_KW() {
		return _var_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public TypeRef getTypeRef() {
		return _typeRef;
	}
	public KermetaTokenNode getInit_KW() {
		return _init_KW;
	}
	public FExpression getInit() {
		return _init;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_var_KW != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;
		if (_init_KW != null) count++;
		if (_init != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_var_KW != null) && (++count == index)) return _var_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;
		if ((_init_KW != null) && (++count == index)) return _init_KW;
		if ((_init != null) && (++count == index)) return _init;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FVariableDecl.
	 */
	public FVariableDecl(
		Token var_KW,
		Token name,
		Token colon,
		TypeRef typeRef,
		Token init_KW,
		FExpression init
	) {
		super();

		if (var_KW != null) {
			_var_KW = new KermetaTokenNode(var_KW);
			if (_var_KW._parent != null) throw new RuntimeException();
			_var_KW._parent = this;
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
		if (typeRef != null) {
			_typeRef = typeRef;
			if (_typeRef._parent != null) throw new RuntimeException();
			_typeRef._parent = this;
		}
		if (init_KW != null) {
			_init_KW = new KermetaTokenNode(init_KW);
			if (_init_KW._parent != null) throw new RuntimeException();
			_init_KW._parent = this;
		}
		if (init != null) {
			_init = init;
			if (_init._parent != null) throw new RuntimeException();
			_init._parent = this;
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
