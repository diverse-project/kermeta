/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AFragmentAttachmentSymbolicnameDirective extends
		PSymbolicnameDirective {
	private TFragmentAttachment _fragmentAttachment_;
	private PFragmentAttachmentValue _fragmentAttachmentValue_;

	public AFragmentAttachmentSymbolicnameDirective() {
		// Constructor
	}

	public AFragmentAttachmentSymbolicnameDirective(@SuppressWarnings("hiding")
	TFragmentAttachment _fragmentAttachment_, @SuppressWarnings("hiding")
	PFragmentAttachmentValue _fragmentAttachmentValue_) {
		// Constructor
		setFragmentAttachment(_fragmentAttachment_);

		setFragmentAttachmentValue(_fragmentAttachmentValue_);

	}

	@Override
	public Object clone() {
		return new AFragmentAttachmentSymbolicnameDirective(
				cloneNode(this._fragmentAttachment_),
				cloneNode(this._fragmentAttachmentValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAFragmentAttachmentSymbolicnameDirective(this);
	}

	public TFragmentAttachment getFragmentAttachment() {
		return this._fragmentAttachment_;
	}

	public void setFragmentAttachment(TFragmentAttachment node) {
		if (this._fragmentAttachment_ != null) {
			this._fragmentAttachment_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._fragmentAttachment_ = node;
	}

	public PFragmentAttachmentValue getFragmentAttachmentValue() {
		return this._fragmentAttachmentValue_;
	}

	public void setFragmentAttachmentValue(PFragmentAttachmentValue node) {
		if (this._fragmentAttachmentValue_ != null) {
			this._fragmentAttachmentValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._fragmentAttachmentValue_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._fragmentAttachment_)
				+ toString(this._fragmentAttachmentValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._fragmentAttachment_ == child) {
			this._fragmentAttachment_ = null;
			return;
		}

		if (this._fragmentAttachmentValue_ == child) {
			this._fragmentAttachmentValue_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._fragmentAttachment_ == oldChild) {
			setFragmentAttachment((TFragmentAttachment) newChild);
			return;
		}

		if (this._fragmentAttachmentValue_ == oldChild) {
			setFragmentAttachmentValue((PFragmentAttachmentValue) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
