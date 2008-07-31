/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import fr.irisa.osgi.manifest.parser.analysis.Analysis;

@SuppressWarnings("nls")
public final class AImportServiceEntryValue extends PImportServiceEntryValue {
	private PUniqueName _uniqueName_;
	private final LinkedList<PParameter> _parameter_ = new LinkedList<PParameter>();
	private final LinkedList<PServiceValue> _serviceValue_ = new LinkedList<PServiceValue>();

	public AImportServiceEntryValue() {
		// Constructor
	}

	public AImportServiceEntryValue(@SuppressWarnings("hiding")
	PUniqueName _uniqueName_, @SuppressWarnings("hiding")
	List<PParameter> _parameter_, @SuppressWarnings("hiding")
	List<PServiceValue> _serviceValue_) {
		// Constructor
		setUniqueName(_uniqueName_);

		setParameter(_parameter_);

		setServiceValue(_serviceValue_);

	}

	@Override
	public Object clone() {
		return new AImportServiceEntryValue(cloneNode(this._uniqueName_),
				cloneList(this._parameter_), cloneList(this._serviceValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAImportServiceEntryValue(this);
	}

	public PUniqueName getUniqueName() {
		return this._uniqueName_;
	}

	public void setUniqueName(PUniqueName node) {
		if (this._uniqueName_ != null) {
			this._uniqueName_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._uniqueName_ = node;
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

	public LinkedList<PServiceValue> getServiceValue() {
		return this._serviceValue_;
	}

	public void setServiceValue(List<PServiceValue> list) {
		this._serviceValue_.clear();
		this._serviceValue_.addAll(list);
		for (PServiceValue e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._uniqueName_) + toString(this._parameter_)
				+ toString(this._serviceValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._uniqueName_ == child) {
			this._uniqueName_ = null;
			return;
		}

		if (this._parameter_.remove(child)) {
			return;
		}

		if (this._serviceValue_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._uniqueName_ == oldChild) {
			setUniqueName((PUniqueName) newChild);
			return;
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

		for (ListIterator<PServiceValue> i = this._serviceValue_.listIterator(); i
				.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PServiceValue) newChild);
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
