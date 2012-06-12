package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ViewBuilder;
import org.kermeta.kompren.gwelet.visualisation.GweletSlicer;

public abstract class SelectionBasedVisuAction extends VisualisationAction {
	protected List<ClassView> classes;

	protected GweletSlicer slicer;

	protected ViewBuilder builder;


	public SelectionBasedVisuAction() {
		super();
	}


	@Override
	protected void doVisualisation() {
		if(classes==null) {
			classes = new ArrayList<ClassView>();
			for(Selectable sel : canvas.getSelection())
				if(sel instanceof ClassView)
					classes.add((ClassView) sel);
		}
	}


	public void setSlicer(final GweletSlicer slicer) {
		this.slicer = slicer;
	}


	public void setBuilder(final ViewBuilder builder) {
		this.builder = builder;
	}
}
