/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASymbolicnameDirectiveSymbolicnameOption extends
		PSymbolicnameOption {
	private TSemicolon _semicolon_;
	private PSymbolicnameDirective _symbolicnameDirective_;

	public ASymbolicnameDirectiveSymbolicnameOption() {
		// Constructor
	}

	public ASymbolicnameDirectiveSymbolicnameOption(@SuppressWarnings("hiding")
	TSemicolon _semicolon_, @SuppressWarnings("hiding")
	PSymbolicnameDirective _symbolicnameDirective_) {
		// Constructor
		setSemicolon(_semicolon_);

		setSymbolicnameDirective(_symbolicnameDirective_);

	}

	@Override
	public Object clone() {
		return new ASymbolicnameDirectiveSymbolicnameOption(
				cloneNode(this._semicolon_),
				cloneNode(this._symbolicnameDirective_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseASymbolicnameDirectiveSymbolicnameOption(this);
	}

	public TSemicolon getSemicolon() {
		return this._semicolon_;
	}

	public void setSemicolon(TSemicolon node) {
		if (this._semicolon_ != null) {
			this._semicolon_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._semicolon_ = node;
	}

	public PSymbolicnameDirective getSymbolicnameDirective() {
		return this._symbolicnameDirective_;
	}

	public void setSymbolicnameDirective(PSymbolicnameDirective node) {
		if (this._symbolicnameDirective_ != null) {
			this._symbolicnameDirective_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._symbolicnameDirective_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._semicolon_)
				+ toString(this._symbolicnameDirective_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._semicolon_ == child) {
			this._semicolon_ = null;
			return;
		}

		if (this._symbolicnameDirective_ == child) {
			this._symbolicnameDirective_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._semicolon_ == oldChild) {
			setSemicolon((TSemicolon) newChild);
			return;
		}

		if (this._symbolicnameDirective_ == oldChild) {
			setSymbolicnameDirective((PSymbolicnameDirective) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
