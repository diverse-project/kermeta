package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 21 avr. 2005 22:15:56
 */
public class EnumDecl extends AnnotableElement  {

	public static final String KW_ENUMERATION = "enumeration";

	private KermetaTokenNode _enumeration_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _lcurly;
	private EnumLiterals _enumLiterals;
	private KermetaTokenNode _rcurly;

	public KermetaTokenNode getEnumeration_KW() {
		return _enumeration_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getLcurly() {
		return _lcurly;
	}
	public EnumLiterals getEnumLiterals() {
		return _enumLiterals;
	}
	public KermetaTokenNode getRcurly() {
		return _rcurly;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_enumeration_KW != null) count++;
		if (_name != null) count++;
		if (_lcurly != null) count++;
		if (_enumLiterals != null) count++;
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
		if ((_enumeration_KW != null) && (++count == index)) return _enumeration_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_lcurly != null) && (++count == index)) return _lcurly;
		if ((_enumLiterals != null) && (++count == index)) return _enumLiterals;
		if ((_rcurly != null) && (++count == index)) return _rcurly;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new EnumDecl.
	 */
	public EnumDecl(
		Token enumeration_KW,
		Token name,
		Token lcurly,
		EnumLiterals enumLiterals,
		Token rcurly
	) {
		super();

		if (enumeration_KW != null) {
			_enumeration_KW = new KermetaTokenNode(enumeration_KW);
			if (_enumeration_KW._parent != null) throw new RuntimeException();
			_enumeration_KW._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (lcurly != null) {
			_lcurly = new KermetaTokenNode(lcurly);
			if (_lcurly._parent != null) throw new RuntimeException();
			_lcurly._parent = this;
		}
		if (enumLiterals != null) {
			_enumLiterals = enumLiterals;
			if (_enumLiterals._parent != null) throw new RuntimeException();
			_enumLiterals._parent = this;
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
