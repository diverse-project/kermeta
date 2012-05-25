package org.kermeta.kompren.diagram.action;

import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.Selectable;


public class MoveElement extends ModelViewAction {
	/** The x vector translation. */
	protected double tx;

	/** The y vector translation. */
	protected double ty;

	/** The x vector translation that has been already performed. This attribute is needed since
	 * this action can be executed several times. */
	private double performedTx;

	/** The y vector translation that has been already performed. This attribute is needed since
	 * this action can be executed several times. */
	private double performedTy;


	public MoveElement() {
		super();
		tx = 0.;
		ty = 0.;
		performedTx = 0.;
		performedTy = 0.;
	}


	@Override
	public boolean isRegisterable() {
		return hadEffect();
	}


	@Override
	protected void doActionBody() {
		List<Selectable> selection = canvas.getSelection();

		for(Selectable sel : selection)
			sel.translate(tx-performedTx, ty-performedTy);

		performedTx = tx;
		performedTy = ty;
		canvas.refresh();
	}


	@Override
	public boolean canDo() {
		return canvas!=null && !canvas.getSelection().isEmpty();
	}


	public void setTx(final double tx) {
		this.tx = tx;
	}


	public void setTy(final double ty) {
		this.ty = ty;
	}
}
