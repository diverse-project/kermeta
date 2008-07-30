/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.osgi.manifest.parser.node;

import fr.irisa.osgi.manifest.parser.analysis.*;

@SuppressWarnings("nls")
public final class AOsnameSunosOsnameValue extends POsnameValue {
	private TOsnameSunos _osnameSunos_;

	public AOsnameSunosOsnameValue() {
		// Constructor
	}

	public AOsnameSunosOsnameValue(@SuppressWarnings("hiding")
	TOsnameSunos _osnameSunos_) {
		// Constructor
		setOsnameSunos(_osnameSunos_);

	}

	@Override
	public Object clone() {
		return new AOsnameSunosOsnameValue(cloneNode(this._osnameSunos_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAOsnameSunosOsnameValue(this);
	}

	public TOsnameSunos getOsnameSunos() {
		return this._osnameSunos_;
	}

	public void setOsnameSunos(TOsnameSunos node) {
		if (this._osnameSunos_ != null) {
			this._osnameSunos_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._osnameSunos_ = node;
	}

	@Override
	public String toString() {
		return "" + toString(this._osnameSunos_);
	}

	@Override
	void removeChild(@SuppressWarnings("unused")
	Node child) {
		// Remove child
		if (this._osnameSunos_ == child) {
			this._osnameSunos_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	@Override
	void replaceChild(@SuppressWarnings("unused")
	Node oldChild, @SuppressWarnings("unused")
	Node newChild) {
		// Replace child
		if (this._osnameSunos_ == oldChild) {
			setOsnameSunos((TOsnameSunos) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
