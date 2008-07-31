/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AImportPackageDirective extends PImportPackageDirective {
	private TResolution _resolution_;
	private PResolutionValue _resolutionValue_;

	public AImportPackageDirective() {
		// Constructor
	}

	public AImportPackageDirective(@SuppressWarnings("hiding")
	TResolution _resolution_, @SuppressWarnings("hiding")
	PResolutionValue _resolutionValue_) {
		// Constructor
		setResolution(_resolution_);

		setResolutionValue(_resolutionValue_);

	}

	@Override
	public Object clone() {
		return new AImportPackageDirective(cloneNode(this._resolution_),
				cloneNode(this._resolutionValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAImportPackageDirective(this);
	}

	public TResolution getResolution() {
		return this._resolution_;
	}

	public void setResolution(TResolution node) {
		if (this._resolution_ != null) {
			this._resolution_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._resolution_ = node;
	}

	public PResolutionValue getResolutionValue() {
		return this._resolutionValue_;
	}

	public void setResolutionValue(PResolutionValue node) {
		if (this._resolutionValue_ != null) {
			this._resolutionValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._resolutionValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._resolution_)
				+ toString(this._resolutionValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._resolution_ == child) {
			this._resolution_ = null;
			return;
		}

		if (this._resolutionValue_ == child) {
			this._resolutionValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._resolution_ == oldChild) {
			setResolution((TResolution) newChild);
			return;
		}

		if (this._resolutionValue_ == oldChild) {
			setResolutionValue((PResolutionValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
