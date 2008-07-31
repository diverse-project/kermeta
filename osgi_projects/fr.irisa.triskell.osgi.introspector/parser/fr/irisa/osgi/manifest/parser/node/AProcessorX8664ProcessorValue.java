/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AProcessorX8664ProcessorValue extends PProcessorValue {
	private TProcessorX8664 _processorX8664_;

	public AProcessorX8664ProcessorValue() {
		// Constructor
	}

	public AProcessorX8664ProcessorValue(@SuppressWarnings("hiding")
	TProcessorX8664 _processorX8664_) {
		// Constructor
		setProcessorX8664(_processorX8664_);

	}

	@Override
	public Object clone() {
		return new AProcessorX8664ProcessorValue(
				cloneNode(this._processorX8664_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAProcessorX8664ProcessorValue(this);
	}

	public TProcessorX8664 getProcessorX8664() {
		return this._processorX8664_;
	}

	public void setProcessorX8664(TProcessorX8664 node) {
		if (this._processorX8664_ != null) {
			this._processorX8664_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._processorX8664_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._processorX8664_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._processorX8664_ == child) {
			this._processorX8664_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._processorX8664_ == oldChild) {
			setProcessorX8664((TProcessorX8664) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
