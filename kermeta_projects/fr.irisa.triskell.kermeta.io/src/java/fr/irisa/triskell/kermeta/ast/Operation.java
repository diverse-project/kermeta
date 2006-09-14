package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class Operation extends ClassMemberDecl  {

	public static final String KW_FROM = "from";
	public static final String KW_RAISES = "raises";
	public static final String KW_IS = "is";

	private OperationKind _operationKind;
	private KermetaTokenNode _name;
	private KermetaTokenNode _lt;
	private TypeVarDecllst _typeVarDecllst;
	private KermetaTokenNode _gt;
	private KermetaTokenNode _lparen;
	private Params _params;
	private KermetaTokenNode _rparen;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;
	private KermetaTokenNode _from_KW;
	private QualifiedID _superSelection;
	private KermetaTokenNode _raises_KW;
	private Typelst _exceptions;
	private KermetaTokenNode _is_KW;
	private Preconditions _preconditions;
	private OperationBody _operationBody;
	private Postconditions _postconditions;

	public OperationKind getOperationKind() {
		return _operationKind;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getLt() {
		return _lt;
	}
	public TypeVarDecllst getTypeVarDecllst() {
		return _typeVarDecllst;
	}
	public KermetaTokenNode getGt() {
		return _gt;
	}
	public KermetaTokenNode getLparen() {
		return _lparen;
	}
	public Params getParams() {
		return _params;
	}
	public KermetaTokenNode getRparen() {
		return _rparen;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public TypeRef getTypeRef() {
		return _typeRef;
	}
	public KermetaTokenNode getFrom_KW() {
		return _from_KW;
	}
	public QualifiedID getSuperSelection() {
		return _superSelection;
	}
	public KermetaTokenNode getRaises_KW() {
		return _raises_KW;
	}
	public Typelst getExceptions() {
		return _exceptions;
	}
	public KermetaTokenNode getIs_KW() {
		return _is_KW;
	}
	public Preconditions getPreconditions() {
		return _preconditions;
	}
	public OperationBody getOperationBody() {
		return _operationBody;
	}
	public Postconditions getPostconditions() {
		return _postconditions;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_operationKind != null) count++;
		if (_name != null) count++;
		if (_lt != null) count++;
		if (_typeVarDecllst != null) count++;
		if (_gt != null) count++;
		if (_lparen != null) count++;
		if (_params != null) count++;
		if (_rparen != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;
		if (_from_KW != null) count++;
		if (_superSelection != null) count++;
		if (_raises_KW != null) count++;
		if (_exceptions != null) count++;
		if (_is_KW != null) count++;
		if (_preconditions != null) count++;
		if (_operationBody != null) count++;
		if (_postconditions != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_operationKind != null) && (++count == index)) return _operationKind;
		if ((_name != null) && (++count == index)) return _name;
		if ((_lt != null) && (++count == index)) return _lt;
		if ((_typeVarDecllst != null) && (++count == index)) return _typeVarDecllst;
		if ((_gt != null) && (++count == index)) return _gt;
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_params != null) && (++count == index)) return _params;
		if ((_rparen != null) && (++count == index)) return _rparen;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;
		if ((_from_KW != null) && (++count == index)) return _from_KW;
		if ((_superSelection != null) && (++count == index)) return _superSelection;
		if ((_raises_KW != null) && (++count == index)) return _raises_KW;
		if ((_exceptions != null) && (++count == index)) return _exceptions;
		if ((_is_KW != null) && (++count == index)) return _is_KW;
		if ((_preconditions != null) && (++count == index)) return _preconditions;
		if ((_operationBody != null) && (++count == index)) return _operationBody;
		if ((_postconditions != null) && (++count == index)) return _postconditions;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Operation.
	 */
	public Operation(
		OperationKind operationKind,
		Token name,
		Token lt,
		TypeVarDecllst typeVarDecllst,
		Token gt,
		Token lparen,
		Params params,
		Token rparen,
		Token colon,
		TypeRef typeRef,
		Token from_KW,
		QualifiedID superSelection,
		Token raises_KW,
		Typelst exceptions,
		Token is_KW,
		Preconditions preconditions,
		OperationBody operationBody,
		Postconditions postconditions
	) {
		super();

		if (operationKind != null) {
			_operationKind = operationKind;
			if (_operationKind._parent != null) throw new RuntimeException();
			_operationKind._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (lt != null) {
			_lt = new KermetaTokenNode(lt);
			if (_lt._parent != null) throw new RuntimeException();
			_lt._parent = this;
		}
		if (typeVarDecllst != null) {
			_typeVarDecllst = typeVarDecllst;
			if (_typeVarDecllst._parent != null) throw new RuntimeException();
			_typeVarDecllst._parent = this;
		}
		if (gt != null) {
			_gt = new KermetaTokenNode(gt);
			if (_gt._parent != null) throw new RuntimeException();
			_gt._parent = this;
		}
		if (lparen != null) {
			_lparen = new KermetaTokenNode(lparen);
			if (_lparen._parent != null) throw new RuntimeException();
			_lparen._parent = this;
		}
		if (params != null) {
			_params = params;
			if (_params._parent != null) throw new RuntimeException();
			_params._parent = this;
		}
		if (rparen != null) {
			_rparen = new KermetaTokenNode(rparen);
			if (_rparen._parent != null) throw new RuntimeException();
			_rparen._parent = this;
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
		if (from_KW != null) {
			_from_KW = new KermetaTokenNode(from_KW);
			if (_from_KW._parent != null) throw new RuntimeException();
			_from_KW._parent = this;
		}
		if (superSelection != null) {
			_superSelection = superSelection;
			if (_superSelection._parent != null) throw new RuntimeException();
			_superSelection._parent = this;
		}
		if (raises_KW != null) {
			_raises_KW = new KermetaTokenNode(raises_KW);
			if (_raises_KW._parent != null) throw new RuntimeException();
			_raises_KW._parent = this;
		}
		if (exceptions != null) {
			_exceptions = exceptions;
			if (_exceptions._parent != null) throw new RuntimeException();
			_exceptions._parent = this;
		}
		if (is_KW != null) {
			_is_KW = new KermetaTokenNode(is_KW);
			if (_is_KW._parent != null) throw new RuntimeException();
			_is_KW._parent = this;
		}
		if (preconditions != null) {
			_preconditions = preconditions;
			if (_preconditions._parent != null) throw new RuntimeException();
			_preconditions._parent = this;
		}
		if (operationBody != null) {
			_operationBody = operationBody;
			if (_operationBody._parent != null) throw new RuntimeException();
			_operationBody._parent = this;
		}
		if (postconditions != null) {
			_postconditions = postconditions;
			if (_postconditions._parent != null) throw new RuntimeException();
			_postconditions._parent = this;
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
