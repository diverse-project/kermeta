/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue
		extends PActivationPolicyExcludeIncludeValue {
	private PPackageName _packageName_;

	public AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue() {
		// Constructor
	}

	public AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue(
			@SuppressWarnings("hiding")
			PPackageName _packageName_) {
		// Constructor
		setPackageName(_packageName_);

	}

	@Override
	public Object clone() {
		return new AExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue(
				cloneNode(this._packageName_));
	}

	public void apply(Switch sw) {
		((Analysis) sw)
				.caseAExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue(this);
	}

	public PPackageName getPackageName() {
		return this._packageName_;
	}

	public void setPackageName(PPackageName node) {
		if (this._packageName_ != null) {
			this._packageName_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._packageName_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._packageName_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._packageName_ == child) {
			this._packageName_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._packageName_ == oldChild) {
			setPackageName((PPackageName) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
