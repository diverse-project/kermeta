/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleUpdatelocationEntryManifestentry extends
		PManifestentry {
	private PBundleUpdatelocationEntry _bundleUpdatelocationEntry_;

	public ABundleUpdatelocationEntryManifestentry() {
		// Constructor
	}

	public ABundleUpdatelocationEntryManifestentry(@SuppressWarnings("hiding")
	PBundleUpdatelocationEntry _bundleUpdatelocationEntry_) {
		// Constructor
		setBundleUpdatelocationEntry(_bundleUpdatelocationEntry_);

	}

	@Override
	public Object clone() {
		return new ABundleUpdatelocationEntryManifestentry(
				cloneNode(this._bundleUpdatelocationEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleUpdatelocationEntryManifestentry(this);
	}

	public PBundleUpdatelocationEntry getBundleUpdatelocationEntry() {
		return this._bundleUpdatelocationEntry_;
	}

	public void setBundleUpdatelocationEntry(PBundleUpdatelocationEntry node) {
		if (this._bundleUpdatelocationEntry_ != null) {
			this._bundleUpdatelocationEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleUpdatelocationEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleUpdatelocationEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleUpdatelocationEntry_ == child) {
			this._bundleUpdatelocationEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleUpdatelocationEntry_ == oldChild) {
			setBundleUpdatelocationEntry((PBundleUpdatelocationEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
