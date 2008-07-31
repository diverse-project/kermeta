/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AProcessorMipsProcessorValue extends PProcessorValue {
	private TProcessorMips _processorMips_;

	public AProcessorMipsProcessorValue() {
		// Constructor
	}

	public AProcessorMipsProcessorValue(@SuppressWarnings("hiding")
	TProcessorMips _processorMips_) {
		// Constructor
		setProcessorMips(_processorMips_);

	}

	@Override
	public Object clone() {
		return new AProcessorMipsProcessorValue(cloneNode(this._processorMips_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAProcessorMipsProcessorValue(this);
	}

	public TProcessorMips getProcessorMips() {
		return this._processorMips_;
	}

	public void setProcessorMips(TProcessorMips node) {
		if (this._processorMips_ != null) {
			this._processorMips_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._processorMips_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._processorMips_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._processorMips_ == child) {
			this._processorMips_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._processorMips_ == oldChild) {
			setProcessorMips((TProcessorMips) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
