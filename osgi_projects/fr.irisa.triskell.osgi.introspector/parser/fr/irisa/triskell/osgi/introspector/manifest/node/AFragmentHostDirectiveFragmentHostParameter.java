/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AFragmentHostDirectiveFragmentHostParameter extends
		PFragmentHostParameter {
	private TSemicolon _semicolon_;
	private PFragmentHostDirective _fragmentHostDirective_;

	public AFragmentHostDirectiveFragmentHostParameter() {
		// Constructor
	}

	public AFragmentHostDirectiveFragmentHostParameter(
			@SuppressWarnings("hiding")
			TSemicolon _semicolon_, @SuppressWarnings("hiding")
			PFragmentHostDirective _fragmentHostDirective_) {
		// Constructor
		setSemicolon(_semicolon_);

		setFragmentHostDirective(_fragmentHostDirective_);

	}

	@Override
	public Object clone() {
		return new AFragmentHostDirectiveFragmentHostParameter(
				cloneNode(this._semicolon_),
				cloneNode(this._fragmentHostDirective_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAFragmentHostDirectiveFragmentHostParameter(this);
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

	public PFragmentHostDirective getFragmentHostDirective() {
		return this._fragmentHostDirective_;
	}

	public void setFragmentHostDirective(PFragmentHostDirective node) {
		if (this._fragmentHostDirective_ != null) {
			this._fragmentHostDirective_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._fragmentHostDirective_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._semicolon_)
				+ toString(this._fragmentHostDirective_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._semicolon_ == child) {
			this._semicolon_ = null;
			return;
		}

		if (this._fragmentHostDirective_ == child) {
			this._fragmentHostDirective_ = null;
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

		if (this._fragmentHostDirective_ == oldChild) {
			setFragmentHostDirective((PFragmentHostDirective) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
