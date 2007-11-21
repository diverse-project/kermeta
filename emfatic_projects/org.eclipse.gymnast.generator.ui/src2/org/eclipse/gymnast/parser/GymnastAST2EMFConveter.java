package org.eclipse.gymnast.parser;

public class GymnastAST2EMFConveter {
	public java.util.Map<gymnast.GymnastEASTNode, org.eclipse.gymnast.generator.core.ast.GymnastASTNode> _ast2cst = new java.util.HashMap<gymnast.GymnastEASTNode, org.eclipse.gymnast.generator.core.ast.GymnastASTNode>();

	// SeqRule
	public gymnast.ListRule convert(org.eclipse.gymnast.generator.core.ast.ListRule node) {
		if (node == null) {
			return null;
		}
		gymnast.ListRule res = gymnast.gymnastFactory.eINSTANCE
				.createListRule();
		res.setDecl(convert(node.getDecl()));
		res.setBody(convert(node.getBody()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.ListRuleDecl convert(
			org.eclipse.gymnast.generator.core.ast.ListRuleDecl node) {
		if (node == null) {
			return null;
		}
		gymnast.ListRuleDecl res = gymnast.gymnastFactory.eINSTANCE
				.createListRuleDecl();

		res.setName(node.getName().getText());
		res.setAttrs(convert(node.getAttrs()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.ListRuleBody convert(
			org.eclipse.gymnast.generator.core.ast.ListRuleBody node) {
		if (node == null) {
			return null;
		}
		gymnast.ListRuleBody res = gymnast.gymnastFactory.eINSTANCE
				.createListRuleBody();
		res.setListExpr(convert(node.getListExpr()));

		res.setSeparator(convert(node.getSeparator()));
		res.setListExpr2(convert(node.getListExpr2()));

		res.setListMark(node.getListMark().getText());
		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.SimpleExpr convert(org.eclipse.gymnast.generator.core.ast.SimpleExpr node) {
		if (node == null) {
			return null;
		}
		gymnast.SimpleExpr res = gymnast.gymnastFactory.eINSTANCE
				.createSimpleExpr();
		if (node.getName() != null) {
			res.setName(node.getName().getText());
		}

		res.setValue(node.getValue().getText());
		res.setAttrs(convert(node.getAttrs()));
		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.Option convert(org.eclipse.gymnast.generator.core.ast.Option node) {
		if (node == null) {
			return null;
		}
		gymnast.Option res = gymnast.gymnastFactory.eINSTANCE.createOption();
		res.setName(node.getName().getText());

		res.setValue(node.getValue().getText());

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.AltRule convert(org.eclipse.gymnast.generator.core.ast.AltRule node) {
		if (node == null) {
			return null;
		}
		gymnast.AltRule res = gymnast.gymnastFactory.eINSTANCE.createAltRule();
		res.setDecl(convert(node.getDecl()));
		res.setBody(convert(node.getBody()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.Attrs convert(org.eclipse.gymnast.generator.core.ast.Attrs node) {
		if (node == null) {
			return null;
		}
		gymnast.Attrs res = gymnast.gymnastFactory.eINSTANCE.createAttrs();

		res.getAttrList().addAll(convert(node.getAttrList()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.TokenRuleDecl convert(
			org.eclipse.gymnast.generator.core.ast.TokenRuleDecl node) {
		if (node == null) {
			return null;
		}
		gymnast.TokenRuleDecl res = gymnast.gymnastFactory.eINSTANCE
				.createTokenRuleDecl();

		res.setName(node.getName().getText());
		res.setAttrs(convert(node.getAttrs()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.AltSeq convert(org.eclipse.gymnast.generator.core.ast.AltSeq node) {
		if (node == null) {
			return null;
		}
		gymnast.AltSeq res = gymnast.gymnastFactory.eINSTANCE.createAltSeq();

		res.getSeq().addAll(convert(node.getSeq()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.SeqRuleDecl convert(org.eclipse.gymnast.generator.core.ast.SeqRuleDecl node) {
		if (node == null) {
			return null;
		}
		gymnast.SeqRuleDecl res = gymnast.gymnastFactory.eINSTANCE
				.createSeqRuleDecl();

		res.setName(node.getName().getText());
		res.setAttrs(convert(node.getAttrs()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.TokenRule convert(org.eclipse.gymnast.generator.core.ast.TokenRule node) {
		if (node == null) {
			return null;
		}
		gymnast.TokenRule res = gymnast.gymnastFactory.eINSTANCE
				.createTokenRule();
		res.setDecl(convert(node.getDecl()));
		res.getBody().addAll(convert(node.getBody()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.OptionsSection convert(
			org.eclipse.gymnast.generator.core.ast.OptionsSection node) {
		if (node == null) {
			return null;
		}
		gymnast.OptionsSection res = gymnast.gymnastFactory.eINSTANCE
				.createOptionsSection();

		res.getOptionList().addAll(convert(node.getOptionList()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.CompUnit convert(org.eclipse.gymnast.generator.core.ast.CompUnit node) {
		if (node == null) {
			return null;
		}
		gymnast.CompUnit res = gymnast.gymnastFactory.eINSTANCE
				.createCompUnit();
		res.setHeaderSection(convert(node.getHeaderSection()));
		res.getGrammar().addAll(convert(node.getGrammar()));
		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.OptSubSeq convert(org.eclipse.gymnast.generator.core.ast.OptSubSeq node) {
		if (node == null) {
			return null;
		}
		gymnast.OptSubSeq res = gymnast.gymnastFactory.eINSTANCE
				.createOptSubSeq();

		res.getSeq().addAll(convert(node.getSeq()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.AltRuleDecl convert(org.eclipse.gymnast.generator.core.ast.AltRuleDecl node) {
		if (node == null) {
			return null;
		}
		gymnast.AltRuleDecl res = gymnast.gymnastFactory.eINSTANCE
				.createAltRuleDecl();
		res.setKind(convert2AltRuleKind(node.getKind()));
		res.setName(node.getName().getText());
		res.setAttrs(convert(node.getAttrs()));

		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.HeaderSection convert(
			org.eclipse.gymnast.generator.core.ast.HeaderSection node) {
		if (node == null) {
			return null;
		}
		gymnast.HeaderSection res = gymnast.gymnastFactory.eINSTANCE
				.createHeaderSection();

		res.setName(node.getName().getText());

		res.setOptionsSection(convert(node.getOptionsSection()));
		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.AltRuleBody convert(org.eclipse.gymnast.generator.core.ast.AltRuleBody node) {
		if (node == null) {
			return null;
		}
		gymnast.AltRuleBody res = gymnast.gymnastFactory.eINSTANCE
				.createAltRuleBody();
		res.setPreSeq(convert(node.getPreSeq()));
		res.getAlts().addAll(convert(node.getAlts()));
		res.setPostSeq(convert(node.getPostSeq()));
		_ast2cst.put(res, node);
		return res;
	}

	// SeqRule
	public gymnast.SeqRule convert(org.eclipse.gymnast.generator.core.ast.SeqRule node) {
		if (node == null) {
			return null;
		}
		gymnast.SeqRule res = gymnast.gymnastFactory.eINSTANCE.createSeqRule();
		res.setDecl(convert(node.getDecl()));
		res.getBody().addAll(convert(node.getBody()));

		_ast2cst.put(res, node);
		return res;
	}

	// AltRule
	public gymnast.Expr convert(org.eclipse.gymnast.generator.core.ast.Expr node) {
		if (node == null) {
			return null;
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.OptSubSeq) {
			return convert((org.eclipse.gymnast.generator.core.ast.OptSubSeq) node);
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.SimpleExpr) {
			return convert((org.eclipse.gymnast.generator.core.ast.SimpleExpr) node);
		}
		return null;
	}

	// AltRule
	public gymnast.Rule convert(org.eclipse.gymnast.generator.core.ast.Rule node) {
		if (node == null) {
			return null;
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.AltRule) {
			return convert((org.eclipse.gymnast.generator.core.ast.AltRule) node);
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.ListRule) {
			return convert((org.eclipse.gymnast.generator.core.ast.ListRule) node);
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.SeqRule) {
			return convert((org.eclipse.gymnast.generator.core.ast.SeqRule) node);
		}
		if (node instanceof org.eclipse.gymnast.generator.core.ast.TokenRule) {
			return convert((org.eclipse.gymnast.generator.core.ast.TokenRule) node);
		}
		return null;
	}

	public static gymnast.AltRuleKind convert2AltRuleKind(
			org.eclipse.gymnast.generator.core.ast.AltRuleKind arg) {
		// conversion of TokenRule to Enum
		if (arg.getText().equals("abstract")) {
			return gymnast.AltRuleKind.ABSTRACT;
		}
		if (arg.getText().equals("container")) {
			return gymnast.AltRuleKind.CONTAINER;
		}
		if (arg.getText().equals("interface")) {
			return gymnast.AltRuleKind.INTERFACE;
		}
		return null;
	}

	// ListRule (no dedicated container)
	public java.util.List<gymnast.SimpleExpr> convert(
			org.eclipse.gymnast.generator.core.ast.Alts arg) {
		if (arg == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		java.util.List<gymnast.SimpleExpr> res = new java.util.ArrayList<gymnast.SimpleExpr>();
		boolean isSeparator = false;
		for (org.eclipse.gymnast.runtime.core.ast.ASTNode tmpChild : arg
				.getChildren()) {
			if (!isSeparator) {
				org.eclipse.gymnast.generator.core.ast.SimpleExpr node = (org.eclipse.gymnast.generator.core.ast.SimpleExpr) tmpChild;
				res.add(convert(node));
			}
			isSeparator = !isSeparator;
		}
		return res;
	}

	// ListRule (no dedicated container)
	public java.util.List<gymnast.Expr> convert(org.eclipse.gymnast.generator.core.ast.Seq arg) {
		if (arg == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		java.util.List<gymnast.Expr> res = new java.util.ArrayList<gymnast.Expr>();
		boolean isSeparator = false;
		for (org.eclipse.gymnast.runtime.core.ast.ASTNode tmpChild : arg
				.getChildren()) {
			if (!isSeparator) {
				org.eclipse.gymnast.generator.core.ast.Expr node = (org.eclipse.gymnast.generator.core.ast.Expr) tmpChild;
				res.add(convert(node));
			}
			isSeparator = !isSeparator;
		}
		return res;
	}

	// ListRule (no dedicated container)
	public java.util.List<String> convert(org.eclipse.gymnast.generator.core.ast.AttrList arg) {
		if (arg == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		java.util.List<String> res = new java.util.ArrayList<String>();
		boolean isSeparator = false;
		for (org.eclipse.gymnast.runtime.core.ast.ASTNode tmpChild : arg
				.getChildren()) {
			if (!isSeparator) {
				res.add(tmpChild.getText());
			}
			isSeparator = !isSeparator;
		}
		return res;
	}

	// ListRule (no dedicated container)
	public java.util.List<gymnast.Rule> convert(
			org.eclipse.gymnast.generator.core.ast.Grammar arg) {
		if (arg == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		java.util.List<gymnast.Rule> res = new java.util.ArrayList<gymnast.Rule>();
		boolean isSeparator = false;
		for (org.eclipse.gymnast.runtime.core.ast.ASTNode tmpChild : arg
				.getChildren()) {
			if (!isSeparator) {
				org.eclipse.gymnast.generator.core.ast.Rule node = (org.eclipse.gymnast.generator.core.ast.Rule) tmpChild;
				res.add(convert(node));
			}
			isSeparator = !isSeparator;
		}
		return res;
	}

	// ListRule (no dedicated container)
	public java.util.List<gymnast.Option> convert(
			org.eclipse.gymnast.generator.core.ast.OptionList arg) {
		if (arg == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		java.util.List<gymnast.Option> res = new java.util.ArrayList<gymnast.Option>();
		boolean isSeparator = false;
		for (org.eclipse.gymnast.runtime.core.ast.ASTNode tmpChild : arg
				.getChildren()) {
			if (!isSeparator) {
				org.eclipse.gymnast.generator.core.ast.Option node = (org.eclipse.gymnast.generator.core.ast.Option) tmpChild;
				res.add(convert(node));
			}
			isSeparator = !isSeparator;
		}
		return res;
	}
}