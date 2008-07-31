/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AUsesExportPackageDirective extends PExportPackageDirective {
	private TUses _uses_;
	private PExportPackageUseExcludeIncludeValue _exportPackageUseExcludeIncludeValue_;

	public AUsesExportPackageDirective() {
		// Constructor
	}

	public AUsesExportPackageDirective(@SuppressWarnings("hiding")
	TUses _uses_, @SuppressWarnings("hiding")
	PExportPackageUseExcludeIncludeValue _exportPackageUseExcludeIncludeValue_) {
		// Constructor
		setUses(_uses_);

		setExportPackageUseExcludeIncludeValue(_exportPackageUseExcludeIncludeValue_);

	}

	@Override
	public Object clone() {
		return new AUsesExportPackageDirective(cloneNode(this._uses_),
				cloneNode(this._exportPackageUseExcludeIncludeValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAUsesExportPackageDirective(this);
	}

	public TUses getUses() {
		return this._uses_;
	}

	public void setUses(TUses node) {
		if (this._uses_ != null) {
			this._uses_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._uses_ = node;
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
		return "" + toString(this._uses_)
				+ toString(this._exportPackageUseExcludeIncludeValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._uses_ == child) {
			this._uses_ = null;
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
		if (this._uses_ == oldChild) {
			setUses((TUses) newChild);
			return;
		}

		if (this._exportPackageUseExcludeIncludeValue_ == oldChild) {
			setExportPackageUseExcludeIncludeValue((PExportPackageUseExcludeIncludeValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
