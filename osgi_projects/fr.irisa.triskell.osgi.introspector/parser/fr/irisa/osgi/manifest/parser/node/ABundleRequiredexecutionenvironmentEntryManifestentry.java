/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABundleRequiredexecutionenvironmentEntryManifestentry extends
		PManifestentry {
	private PBundleRequiredexecutionenvironmentEntry _bundleRequiredexecutionenvironmentEntry_;

	public ABundleRequiredexecutionenvironmentEntryManifestentry() {
		// Constructor
	}

	public ABundleRequiredexecutionenvironmentEntryManifestentry(
			@SuppressWarnings("hiding")
			PBundleRequiredexecutionenvironmentEntry _bundleRequiredexecutionenvironmentEntry_) {
		// Constructor
		setBundleRequiredexecutionenvironmentEntry(_bundleRequiredexecutionenvironmentEntry_);

	}

	@Override
	public Object clone() {
		return new ABundleRequiredexecutionenvironmentEntryManifestentry(
				cloneNode(this._bundleRequiredexecutionenvironmentEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw)
				.caseABundleRequiredexecutionenvironmentEntryManifestentry(this);
	}

	public PBundleRequiredexecutionenvironmentEntry getBundleRequiredexecutionenvironmentEntry() {
		return this._bundleRequiredexecutionenvironmentEntry_;
	}

	public void setBundleRequiredexecutionenvironmentEntry(
			PBundleRequiredexecutionenvironmentEntry node) {
		if (this._bundleRequiredexecutionenvironmentEntry_ != null) {
			this._bundleRequiredexecutionenvironmentEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleRequiredexecutionenvironmentEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleRequiredexecutionenvironmentEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleRequiredexecutionenvironmentEntry_ == child) {
			this._bundleRequiredexecutionenvironmentEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleRequiredexecutionenvironmentEntry_ == oldChild) {
			setBundleRequiredexecutionenvironmentEntry((PBundleRequiredexecutionenvironmentEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
