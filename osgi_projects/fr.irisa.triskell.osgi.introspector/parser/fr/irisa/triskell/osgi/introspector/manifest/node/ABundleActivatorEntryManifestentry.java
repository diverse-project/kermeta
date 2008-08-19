/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleActivatorEntryManifestentry extends PManifestentry {
	private PBundleActivatorEntry _bundleActivatorEntry_;

	public ABundleActivatorEntryManifestentry() {
		// Constructor
	}

	public ABundleActivatorEntryManifestentry(@SuppressWarnings("hiding")
	PBundleActivatorEntry _bundleActivatorEntry_) {
		// Constructor
		setBundleActivatorEntry(_bundleActivatorEntry_);

	}

	@Override
	public Object clone() {
		return new ABundleActivatorEntryManifestentry(
				cloneNode(this._bundleActivatorEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleActivatorEntryManifestentry(this);
	}

	public PBundleActivatorEntry getBundleActivatorEntry() {
		return this._bundleActivatorEntry_;
	}

	public void setBundleActivatorEntry(PBundleActivatorEntry node) {
		if (this._bundleActivatorEntry_ != null) {
			this._bundleActivatorEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bundleActivatorEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._bundleActivatorEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._bundleActivatorEntry_ == child) {
			this._bundleActivatorEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._bundleActivatorEntry_ == oldChild) {
			setBundleActivatorEntry((PBundleActivatorEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
