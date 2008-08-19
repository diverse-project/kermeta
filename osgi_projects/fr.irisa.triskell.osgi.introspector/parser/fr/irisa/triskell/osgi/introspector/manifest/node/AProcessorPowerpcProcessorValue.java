/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AProcessorPowerpcProcessorValue extends PProcessorValue {
	private TProcessorPowerpc _processorPowerpc_;

	public AProcessorPowerpcProcessorValue() {
		// Constructor
	}

	public AProcessorPowerpcProcessorValue(@SuppressWarnings("hiding")
	TProcessorPowerpc _processorPowerpc_) {
		// Constructor
		setProcessorPowerpc(_processorPowerpc_);

	}

	@Override
	public Object clone() {
		return new AProcessorPowerpcProcessorValue(
				cloneNode(this._processorPowerpc_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAProcessorPowerpcProcessorValue(this);
	}

	public TProcessorPowerpc getProcessorPowerpc() {
		return this._processorPowerpc_;
	}

	public void setProcessorPowerpc(TProcessorPowerpc node) {
		if (this._processorPowerpc_ != null) {
			this._processorPowerpc_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._processorPowerpc_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._processorPowerpc_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._processorPowerpc_ == child) {
			this._processorPowerpc_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._processorPowerpc_ == oldChild) {
			setProcessorPowerpc((TProcessorPowerpc) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
