/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.node;

import java.util.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

@SuppressWarnings("nls")
public final class ABundleClasspathEntryValue extends
		PBundleClasspathEntryValue {
	private PClasspathEntry _classpathEntry_;
	private final LinkedList<PClasspathValue> _classpathValue_ = new LinkedList<PClasspathValue>();

	public ABundleClasspathEntryValue() {
		// Constructor
	}

	public ABundleClasspathEntryValue(@SuppressWarnings("hiding")
	PClasspathEntry _classpathEntry_, @SuppressWarnings("hiding")
	List<PClasspathValue> _classpathValue_) {
		// Constructor
		setClasspathEntry(_classpathEntry_);

		setClasspathValue(_classpathValue_);

	}

	@Override
	public Object clone() {
		return new ABundleClasspathEntryValue(cloneNode(this._classpathEntry_),
				cloneList(this._classpathValue_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABundleClasspathEntryValue(this);
	}

	public PClasspathEntry getClasspathEntry() {
		return this._classpathEntry_;
	}

	public void setClasspathEntry(PClasspathEntry node) {
		if (this._classpathEntry_ != null) {
			this._classpathEntry_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._classpathEntry_ = node;
	}

	public LinkedList<PClasspathValue> getClasspathValue() {
		return this._classpathValue_;
	}

	public void setClasspathValue(List<PClasspathValue> list) {
		this._classpathValue_.clear();
		this._classpathValue_.addAll(list);
		for (PClasspathValue e : list) {
			if (e.parent() != null) {
				e.parent().removeChild(e);
			}

			e.parent(this);
		}
	}

	@Override
	public String toString() {
		return "" + toString(this._classpathEntry_)
				+ toString(this._classpathValue_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._classpathEntry_ == child) {
			this._classpathEntry_ = null;
			return;
		}

		if (this._classpathValue_.remove(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._classpathEntry_ == oldChild) {
			setClasspathEntry((PClasspathEntry) newChild);
			return;
		}

		for (ListIterator<PClasspathValue> i = this._classpathValue_
				.listIterator(); i.hasNext();) {
			if (i.next() == oldChild) {
				if (newChild != null) {
					i.set((PClasspathValue) newChild);
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
