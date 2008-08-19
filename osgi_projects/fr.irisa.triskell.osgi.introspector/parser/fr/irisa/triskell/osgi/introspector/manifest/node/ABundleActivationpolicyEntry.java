/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleActivationpolicyEntry extends
		PBundleActivationpolicyEntry {
	private TBundleActivationpolicy _bundleActivationpolicy_;
	private PBundleActivationpolicyEntryValue _bundleActivationpolicyEntryValue_;

	public ABundleActivationpolicyEntry() {
		// Constructor
	}

	public ABundleActivationpolicyEntry(@SuppressWarnings("hiding")
	TBundleActivationpolicy _bundleActivationpolicy_,
			@SuppressWarnings("hiding")
			PBundleActivationpolicyEntryValue _bundleActivationpolicyEntryValue_) {
		// Constructor
		setBundleActivationpolicy(_bundleActivationpolicy_);

		setBundleActivationpolicyEntryValue(_bundleActivationpolicyEntryValue_);

	}

	@Override
	public Object clone() {
		return new ABundleActivationpolicyEntry(
				cloneNode(this._bundleActivationpolicy_),
				cloneNode(this._bundleActivationpolicyEntryValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleActivationpolicyEntry(this);
	}

	public TBundleActivationpolicy getBundleActivationpolicy() {
		return this._bundleActivationpolicy_;
	}

	public void setBundleActivationpolicy(TBundleActivationpolicy node) {
		if (this._bundleActivationpolicy_ != null) {
			this._bundleActivationpolicy_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleActivationpolicy_ = node;
	}

	public PBundleActivationpolicyEntryValue getBundleActivationpolicyEntryValue() {
		return this._bundleActivationpolicyEntryValue_;
	}

	public void setBundleActivationpolicyEntryValue(
			PBundleActivationpolicyEntryValue node) {
		if (this._bundleActivationpolicyEntryValue_ != null) {
			this._bundleActivationpolicyEntryValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleActivationpolicyEntryValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleActivationpolicy_)
				+ toString(this._bundleActivationpolicyEntryValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleActivationpolicy_ == child) {
			this._bundleActivationpolicy_ = null;
			return;
		}

		if (this._bundleActivationpolicyEntryValue_ == child) {
			this._bundleActivationpolicyEntryValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleActivationpolicy_ == oldChild) {
			setBundleActivationpolicy((TBundleActivationpolicy) newChild);
			return;
		}

		if (this._bundleActivationpolicyEntryValue_ == oldChild) {
			setBundleActivationpolicyEntryValue((PBundleActivationpolicyEntryValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
