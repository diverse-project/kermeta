package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 20 d�c. 2006 11:43:08
 */
public class ClassDecl extends AnnotableElement  {

	public static final String KW_INHERITS = "inherits";

	private AbstractModifier _abstractModifier;
	private ClassKind _classKind;
	private KermetaTokenNode _name;
	private KermetaTokenNode _lt;
	private TypeVarDecllst _typeVarDecllst;
	private KermetaTokenNode _gt;
	private KermetaTokenNode _inherits_KW;
	private Typelst _superTypes;
	private KermetaTokenNode _lcurly;
	private ClassMemberDecls _classMemberDecls;
	private KermetaTokenNode _rcurly;

	public AbstractModifier getAbstractModifier() {
		return _abstractModifier;
	}
	public ClassKind getClassKind() {
		return _classKind;
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
	public KermetaTokenNode getInherits_KW() {
		return _inherits_KW;
	}
	public Typelst getSuperTypes() {
		return _superTypes;
	}
	public KermetaTokenNode getLcurly() {
		return _lcurly;
	}
	public ClassMemberDecls getClassMemberDecls() {
		return _classMemberDecls;
	}
	public KermetaTokenNode getRcurly() {
		return _rcurly;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_abstractModifier != null) count++;
		if (_classKind != null) count++;
		if (_name != null) count++;
		if (_lt != null) count++;
		if (_typeVarDecllst != null) count++;
		if (_gt != null) count++;
		if (_inherits_KW != null) count++;
		if (_superTypes != null) count++;
		if (_lcurly != null) count++;
		if (_classMemberDecls != null) count++;
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
		if ((_abstractModifier != null) && (++count == index)) return _abstractModifier;
		if ((_classKind != null) && (++count == index)) return _classKind;
		if ((_name != null) && (++count == index)) return _name;
		if ((_lt != null) && (++count == index)) return _lt;
		if ((_typeVarDecllst != null) && (++count == index)) return _typeVarDecllst;
		if ((_gt != null) && (++count == index)) return _gt;
		if ((_inherits_KW != null) && (++count == index)) return _inherits_KW;
		if ((_superTypes != null) && (++count == index)) return _superTypes;
		if ((_lcurly != null) && (++count == index)) return _lcurly;
		if ((_classMemberDecls != null) && (++count == index)) return _classMemberDecls;
		if ((_rcurly != null) && (++count == index)) return _rcurly;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ClassDecl.
	 */
	public ClassDecl(
		AbstractModifier abstractModifier,
		ClassKind classKind,
		Token name,
		Token lt,
		TypeVarDecllst typeVarDecllst,
		Token gt,
		Token inherits_KW,
		Typelst superTypes,
		Token lcurly,
		ClassMemberDecls classMemberDecls,
		Token rcurly
	) {
		super();

		if (abstractModifier != null) {
			_abstractModifier = abstractModifier;
			if (_abstractModifier._parent != null) throw new RuntimeException();
			_abstractModifier._parent = this;
		}
		if (classKind != null) {
			_classKind = classKind;
			if (_classKind._parent != null) throw new RuntimeException();
			_classKind._parent = this;
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
		if (inherits_KW != null) {
			_inherits_KW = new KermetaTokenNode(inherits_KW);
			if (_inherits_KW._parent != null) throw new RuntimeException();
			_inherits_KW._parent = this;
		}
		if (superTypes != null) {
			_superTypes = superTypes;
			if (_superTypes._parent != null) throw new RuntimeException();
			_superTypes._parent = this;
		}
		if (lcurly != null) {
			_lcurly = new KermetaTokenNode(lcurly);
			if (_lcurly._parent != null) throw new RuntimeException();
			_lcurly._parent = this;
		}
		if (classMemberDecls != null) {
			_classMemberDecls = classMemberDecls;
			if (_classMemberDecls._parent != null) throw new RuntimeException();
			_classMemberDecls._parent = this;
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
