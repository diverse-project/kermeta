/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleActivationpolicyEntryManifestentry extends
		PManifestentry {
	private PBundleActivationpolicyEntry _bundleActivationpolicyEntry_;

	public ABundleActivationpolicyEntryManifestentry() {
		// Constructor
	}

	public ABundleActivationpolicyEntryManifestentry(
			@SuppressWarnings("hiding")
			PBundleActivationpolicyEntry _bundleActivationpolicyEntry_) {
		// Constructor
		setBundleActivationpolicyEntry(_bundleActivationpolicyEntry_);

	}

	@Override
	public Object clone() {
		return new ABundleActivationpolicyEntryManifestentry(
				cloneNode(this._bundleActivationpolicyEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleActivationpolicyEntryManifestentry(this);
	}

	public PBundleActivationpolicyEntry getBundleActivationpolicyEntry() {
		return this._bundleActivationpolicyEntry_;
	}

	public void setBundleActivationpolicyEntry(PBundleActivationpolicyEntry node) {
		if (this._bundleActivationpolicyEntry_ != null) {
			this._bundleActivationpolicyEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleActivationpolicyEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleActivationpolicyEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleActivationpolicyEntry_ == child) {
			this._bundleActivationpolicyEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleActivationpolicyEntry_ == oldChild) {
			setBundleActivationpolicyEntry((PBundleActivationpolicyEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
