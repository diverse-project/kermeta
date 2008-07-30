/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ADirectiveActivationpolicyOptions extends
		PActivationpolicyOptions {
	private TSemicolon _semicolon_;
	private PActivationpolicyDirective _activationpolicyDirective_;

	public ADirectiveActivationpolicyOptions() {
		// Constructor
	}

	public ADirectiveActivationpolicyOptions(@SuppressWarnings("hiding")
	TSemicolon _semicolon_, @SuppressWarnings("hiding")
	PActivationpolicyDirective _activationpolicyDirective_) {
		// Constructor
		setSemicolon(_semicolon_);

		setActivationpolicyDirective(_activationpolicyDirective_);

	}

	@Override
	public Object clone() {
		return new ADirectiveActivationpolicyOptions(
				cloneNode(this._semicolon_),
				cloneNode(this._activationpolicyDirective_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseADirectiveActivationpolicyOptions(this);
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

	public PActivationpolicyDirective getActivationpolicyDirective() {
		return this._activationpolicyDirective_;
	}

	public void setActivationpolicyDirective(PActivationpolicyDirective node) {
		if (this._activationpolicyDirective_ != null) {
			this._activationpolicyDirective_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._activationpolicyDirective_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._semicolon_)
				+ toString(this._activationpolicyDirective_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._semicolon_ == child) {
			this._semicolon_ = null;
			return;
		}

		if (this._activationpolicyDirective_ == child) {
			this._activationpolicyDirective_ = null;
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

		if (this._activationpolicyDirective_ == oldChild) {
			setActivationpolicyDirective((PActivationpolicyDirective) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
