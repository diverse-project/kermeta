/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class AOtherEntryValue extends POtherEntryValue {
	private TSimpleStringValue _simpleStringValue_;
	private final LinkedList<POtherValue> _otherValue_ = new LinkedList<POtherValue>();
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();

	public AOtherEntryValue() {
		// Constructor
	}

	public AOtherEntryValue(@SuppressWarnings("hiding")
	TSimpleStringValue _simpleStringValue_, @SuppressWarnings("hiding")
	List<POtherValue> _otherValue_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_) {
		// Constructor
		setSimpleStringValue(_simpleStringValue_);

		setOtherValue(_otherValue_);

		setParameter(_parameter_);

	}

	@Override
	public Object clone() {
		return new AOtherEntryValue(cloneNode(this._simpleStringValue_),
				cloneList(this._otherValue_), cloneList(this._parameter_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAOtherEntryValue(this);
	}

	public TSimpleStringValue getSimpleStringValue() {
		return this._simpleStringValue_;
	}

	public void setSimpleStringValue(TSimpleStringValue node) {
		if (this._simpleStringValue_ != null) {
			this._simpleStringValue_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._simpleStringValue_ = node;
	}

	public LinkedList<POtherValue> getOtherValue() {
		return this._otherValue_;
	}

	public void setOtherValue(List<POtherValue> list) {
		this._otherValue_.clear();
		this._otherValue_.addAll(list);
		for (POtherValue e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	public LinkedList<PParameter> getParameter() {
		return this._parameter_;
	}

	public void setParameter(List<PParameter> list) {
		this._parameter_.clear();
		this._parameter_.addAll(list);
		for (PParameter e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._simpleStringValue_)
				+ toString(this._otherValue_) + toString(this._parameter_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._simpleStringValue_ == child) {
			this._simpleStringValue_ = null;
			return;
		}

		if (this._otherValue_.remove(child)) {
			return;
		}

		if (this._parameter_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._simpleStringValue_ == oldChild) {
			setSimpleStringValue((TSimpleStringValue) newChild);
			return;
		}

		for (ListIterator<POtherValue> i = this._otherValue_.listIterator(); i
				.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((POtherValue) newChild);
					newChild.parent(this);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		for (ListIterator<PParameter> i = this._parameter_.listIterator(); i
				.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PParameter) newChild);
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
