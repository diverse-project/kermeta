/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleDocurlEntryManifestentry extends PManifestentry {
	private PBundleDocurlEntry _bundleDocurlEntry_;

	public ABundleDocurlEntryManifestentry() {
		// Constructor
	}

	public ABundleDocurlEntryManifestentry(@SuppressWarnings("hiding")
	PBundleDocurlEntry _bundleDocurlEntry_) {
		// Constructor
		setBundleDocurlEntry(_bundleDocurlEntry_);

	}

	@Override
	public Object clone() {
		return new ABundleDocurlEntryManifestentry(
				cloneNode(this._bundleDocurlEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleDocurlEntryManifestentry(this);
	}

	public PBundleDocurlEntry getBundleDocurlEntry() {
		return this._bundleDocurlEntry_;
	}

	public void setBundleDocurlEntry(PBundleDocurlEntry node) {
		if (this._bundleDocurlEntry_ != null) {
			this._bundleDocurlEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleDocurlEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleDocurlEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleDocurlEntry_ == child) {
			this._bundleDocurlEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleDocurlEntry_ == oldChild) {
			setBundleDocurlEntry((PBundleDocurlEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
