/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AExportPackageUseExcludeIncludeIdentifier extends
		PExportPackageUseExcludeIncludeIdentifier {
	private TComma _comma_;
	private PUniqueNameWildcard _uniqueNameWildcard_;

	public AExportPackageUseExcludeIncludeIdentifier() {
		// Constructor
	}

	public AExportPackageUseExcludeIncludeIdentifier(
			@SuppressWarnings("hiding")
			TComma _comma_, @SuppressWarnings("hiding")
			PUniqueNameWildcard _uniqueNameWildcard_) {
		// Constructor
		setComma(_comma_);

		setUniqueNameWildcard(_uniqueNameWildcard_);

	}

	@Override
	public Object clone() {
		return new AExportPackageUseExcludeIncludeIdentifier(
				cloneNode(this._comma_), cloneNode(this._uniqueNameWildcard_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAExportPackageUseExcludeIncludeIdentifier(this);
	}

	public TComma getComma() {
		return this._comma_;
	}

	public void setComma(TComma node) {
		if (this._comma_ != null) {
			this._comma_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._comma_ = node;
	}

	public PUniqueNameWildcard getUniqueNameWildcard() {
		return this._uniqueNameWildcard_;
	}

	public void setUniqueNameWildcard(PUniqueNameWildcard node) {
		if (this._uniqueNameWildcard_ != null) {
			this._uniqueNameWildcard_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._uniqueNameWildcard_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._comma_)
				+ toString(this._uniqueNameWildcard_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._comma_ == child) {
			this._comma_ = null;
			return;
		}

		if (this._uniqueNameWildcard_ == child) {
			this._uniqueNameWildcard_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._comma_ == oldChild) {
			setComma((TComma) newChild);
			return;
		}

		if (this._uniqueNameWildcard_ == oldChild) {
			setUniqueNameWildcard((PUniqueNameWildcard) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
