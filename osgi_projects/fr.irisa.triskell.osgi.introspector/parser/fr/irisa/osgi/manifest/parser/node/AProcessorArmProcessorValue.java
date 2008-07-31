/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AProcessorArmProcessorValue extends PProcessorValue {
	private TProcessorArm _processorArm_;

	public AProcessorArmProcessorValue() {
		// Constructor
	}

	public AProcessorArmProcessorValue(@SuppressWarnings("hiding")
	TProcessorArm _processorArm_) {
		// Constructor
		setProcessorArm(_processorArm_);

	}

	@Override
	public Object clone() {
		return new AProcessorArmProcessorValue(cloneNode(this._processorArm_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAProcessorArmProcessorValue(this);
	}

	public TProcessorArm getProcessorArm() {
		return this._processorArm_;
	}

	public void setProcessorArm(TProcessorArm node) {
		if (this._processorArm_ != null) {
			this._processorArm_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._processorArm_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._processorArm_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._processorArm_ == child) {
			this._processorArm_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._processorArm_ == oldChild) {
			setProcessorArm((TProcessorArm) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
