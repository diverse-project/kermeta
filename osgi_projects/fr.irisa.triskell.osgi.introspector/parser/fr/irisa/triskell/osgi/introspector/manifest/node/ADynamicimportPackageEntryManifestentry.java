/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ADynamicimportPackageEntryManifestentry extends
		PManifestentry {
	private PDynamicimportPackageEntry _dynamicimportPackageEntry_;

	public ADynamicimportPackageEntryManifestentry() {
		// Constructor
	}

	public ADynamicimportPackageEntryManifestentry(@SuppressWarnings("hiding")
	PDynamicimportPackageEntry _dynamicimportPackageEntry_) {
		// Constructor
		setDynamicimportPackageEntry(_dynamicimportPackageEntry_);

	}

	@Override
	public Object clone() {
		return new ADynamicimportPackageEntryManifestentry(
				cloneNode(this._dynamicimportPackageEntry_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseADynamicimportPackageEntryManifestentry(this);
	}

	public PDynamicimportPackageEntry getDynamicimportPackageEntry() {
		return this._dynamicimportPackageEntry_;
	}

	public void setDynamicimportPackageEntry(PDynamicimportPackageEntry node) {
		if (this._dynamicimportPackageEntry_ != null) {
			this._dynamicimportPackageEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._dynamicimportPackageEntry_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._dynamicimportPackageEntry_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._dynamicimportPackageEntry_ == child) {
			this._dynamicimportPackageEntry_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._dynamicimportPackageEntry_ == oldChild) {
			setDynamicimportPackageEntry((PDynamicimportPackageEntry) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
