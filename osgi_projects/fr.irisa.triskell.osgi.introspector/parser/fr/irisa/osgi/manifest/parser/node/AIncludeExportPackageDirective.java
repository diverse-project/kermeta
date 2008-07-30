/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AIncludeExportPackageDirective extends
		PExportPackageDirective {
	private TInclude _include_;
	private PExportPackageUseExcludeIncludeValue _exportPackageUseExcludeIncludeValue_;

	public AIncludeExportPackageDirective() {
		// Constructor
	}

	public AIncludeExportPackageDirective(@SuppressWarnings("hiding")
	TInclude _include_, @SuppressWarnings("hiding")
	PExportPackageUseExcludeIncludeValue _exportPackageUseExcludeIncludeValue_) {
		// Constructor
		setInclude(_include_);

		setExportPackageUseExcludeIncludeValue(_exportPackageUseExcludeIncludeValue_);

	}

	@Override
	public Object clone() {
		return new AIncludeExportPackageDirective(cloneNode(this._include_),
				cloneNode(this._exportPackageUseExcludeIncludeValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAIncludeExportPackageDirective(this);
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

	public PExportPackageUseExcludeIncludeValue getExportPackageUseExcludeIncludeValue() {
		return this._exportPackageUseExcludeIncludeValue_;
	}

	public void setExportPackageUseExcludeIncludeValue(
			PExportPackageUseExcludeIncludeValue node) {
		if (this._exportPackageUseExcludeIncludeValue_ != null) {
			this._exportPackageUseExcludeIncludeValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._exportPackageUseExcludeIncludeValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._include_)
				+ toString(this._exportPackageUseExcludeIncludeValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._include_ == child) {
			this._include_ = null;
			return;
		}

		if (this._exportPackageUseExcludeIncludeValue_ == child) {
			this._exportPackageUseExcludeIncludeValue_ = null;
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

		if (this._exportPackageUseExcludeIncludeValue_ == oldChild) {
			setExportPackageUseExcludeIncludeValue((PExportPackageUseExcludeIncludeValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
