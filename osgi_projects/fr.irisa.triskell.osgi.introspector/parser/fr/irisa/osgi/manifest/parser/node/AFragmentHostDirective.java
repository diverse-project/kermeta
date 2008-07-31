/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AFragmentHostDirective extends PFragmentHostDirective {
	private TExtension _extension_;
	private PExtensionValue _extensionValue_;

	public AFragmentHostDirective() {
		// Constructor
	}

	public AFragmentHostDirective(@SuppressWarnings("hiding")
	TExtension _extension_, @SuppressWarnings("hiding")
	PExtensionValue _extensionValue_) {
		// Constructor
		setExtension(_extension_);

		setExtensionValue(_extensionValue_);

	}

	@Override
	public Object clone() {
		return new AFragmentHostDirective(cloneNode(this._extension_),
				cloneNode(this._extensionValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAFragmentHostDirective(this);
	}

	public TExtension getExtension() {
		return this._extension_;
	}

	public void setExtension(TExtension node) {
		if (this._extension_ != null) {
			this._extension_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._extension_ = node;
	}

	public PExtensionValue getExtensionValue() {
		return this._extensionValue_;
	}

	public void setExtensionValue(PExtensionValue node) {
		if (this._extensionValue_ != null) {
			this._extensionValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._extensionValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._extension_)
				+ toString(this._extensionValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._extension_ == child) {
			this._extension_ = null;
			return;
		}

		if (this._extensionValue_ == child) {
			this._extensionValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._extension_ == oldChild) {
			setExtension((TExtension) newChild);
			return;
		}

		if (this._extensionValue_ == oldChild) {
			setExtensionValue((PExtensionValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
