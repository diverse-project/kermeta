/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AProcessorX86ProcessorValue extends PProcessorValue {
	private TProcessorX86 _processorX86_;

	public AProcessorX86ProcessorValue() {
		// Constructor
	}

	public AProcessorX86ProcessorValue(@SuppressWarnings("hiding")
	TProcessorX86 _processorX86_) {
		// Constructor
		setProcessorX86(_processorX86_);

	}

	@Override
	public Object clone() {
		return new AProcessorX86ProcessorValue(cloneNode(this._processorX86_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAProcessorX86ProcessorValue(this);
	}

	public TProcessorX86 getProcessorX86() {
		return this._processorX86_;
	}

	public void setProcessorX86(TProcessorX86 node) {
		if (this._processorX86_ != null) {
			this._processorX86_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._processorX86_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._processorX86_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._processorX86_ == child) {
			this._processorX86_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._processorX86_ == oldChild) {
			setProcessorX86((TProcessorX86) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
