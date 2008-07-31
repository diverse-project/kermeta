/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABundleRequiredexecutionenvironmentEntryValue extends
		PBundleRequiredexecutionenvironmentEntryValue {
	private PRequiredexecutionenvironment _requiredexecutionenvironment_;
	private final LinkedList<PRequiredexecutionenvironmentValue> _requiredexecutionenvironmentValue_ = new LinkedList<PRequiredexecutionenvironmentValue>();

	public ABundleRequiredexecutionenvironmentEntryValue() {
		// Constructor
	}

	public ABundleRequiredexecutionenvironmentEntryValue(
			@SuppressWarnings("hiding")
			PRequiredexecutionenvironment _requiredexecutionenvironment_,
			@SuppressWarnings("hiding")
			List<PRequiredexecutionenvironmentValue> _requiredexecutionenvironmentValue_) {
		// Constructor
		setRequiredexecutionenvironment(_requiredexecutionenvironment_);

		setRequiredexecutionenvironmentValue(_requiredexecutionenvironmentValue_);

	}

	@Override
	public Object clone() {
		return new ABundleRequiredexecutionenvironmentEntryValue(
				cloneNode(this._requiredexecutionenvironment_),
				cloneList(this._requiredexecutionenvironmentValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleRequiredexecutionenvironmentEntryValue(this);
	}

	public PRequiredexecutionenvironment getRequiredexecutionenvironment() {
		return this._requiredexecutionenvironment_;
	}

	public void setRequiredexecutionenvironment(
			PRequiredexecutionenvironment node) {
		if (this._requiredexecutionenvironment_ != null) {
			this._requiredexecutionenvironment_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._requiredexecutionenvironment_ = node;
	}

	public LinkedList<PRequiredexecutionenvironmentValue> getRequiredexecutionenvironmentValue() {
		return this._requiredexecutionenvironmentValue_;
	}

	public void setRequiredexecutionenvironmentValue(
			List<PRequiredexecutionenvironmentValue> list) {
		this._requiredexecutionenvironmentValue_.clear();
		this._requiredexecutionenvironmentValue_.addAll(list);
		for (PRequiredexecutionenvironmentValue e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._requiredexecutionenvironment_)
				+ toString(this._requiredexecutionenvironmentValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._requiredexecutionenvironment_ == child) {
			this._requiredexecutionenvironment_ = null;
			return;
		}

		if (this._requiredexecutionenvironmentValue_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._requiredexecutionenvironment_ == oldChild) {
			setRequiredexecutionenvironment((PRequiredexecutionenvironment) newChild);
			return;
		}

		for (ListIterator<PRequiredexecutionenvironmentValue> i = this._requiredexecutionenvironmentValue_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PRequiredexecutionenvironmentValue) newChild);
					newChild.parent(this);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		throw new RuntimeException("Not a child.");
	}
}
