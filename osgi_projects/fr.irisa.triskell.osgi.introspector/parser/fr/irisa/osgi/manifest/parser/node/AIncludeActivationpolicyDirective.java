/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AIncludeActivationpolicyDirective extends
		PActivationpolicyDirective {
	private TInclude _include_;
	private PActivationPolicyExcludeIncludeValue _activationPolicyExcludeIncludeValue_;

	public AIncludeActivationpolicyDirective() {
		// Constructor
	}

	public AIncludeActivationpolicyDirective(@SuppressWarnings("hiding")
	TInclude _include_, @SuppressWarnings("hiding")
	PActivationPolicyExcludeIncludeValue _activationPolicyExcludeIncludeValue_) {
		// Constructor
		setInclude(_include_);

		setActivationPolicyExcludeIncludeValue(_activationPolicyExcludeIncludeValue_);

	}

	@Override
	public Object clone() {
		return new AIncludeActivationpolicyDirective(cloneNode(this._include_),
				cloneNode(this._activationPolicyExcludeIncludeValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAIncludeActivationpolicyDirective(this);
	}

	public TInclude getInclude() {
		return this._include_;
	}

	public void setInclude(TInclude node) {
		if (this._include_ != null) {
			this._include_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._include_ = node;
	}

	public PActivationPolicyExcludeIncludeValue getActivationPolicyExcludeIncludeValue() {
		return this._activationPolicyExcludeIncludeValue_;
	}

	public void setActivationPolicyExcludeIncludeValue(
			PActivationPolicyExcludeIncludeValue node) {
		if (this._activationPolicyExcludeIncludeValue_ != null) {
			this._activationPolicyExcludeIncludeValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._activationPolicyExcludeIncludeValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._include_)
				+ toString(this._activationPolicyExcludeIncludeValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._include_ == child) {
			this._include_ = null;
			return;
		}

		if (this._activationPolicyExcludeIncludeValue_ == child) {
			this._activationPolicyExcludeIncludeValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._include_ == oldChild) {
			setInclude((TInclude) newChild);
			return;
		}

		if (this._activationPolicyExcludeIncludeValue_ == oldChild) {
			setActivationPolicyExcludeIncludeValue((PActivationPolicyExcludeIncludeValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
