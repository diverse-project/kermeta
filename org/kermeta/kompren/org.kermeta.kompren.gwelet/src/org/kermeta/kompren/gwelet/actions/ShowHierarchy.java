package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.ViewBuilder;
import org.kermeta.kompren.gwelet.visualisation.GweletSlicer;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

public class ShowHierarchy extends VisualisationAction {
	protected GweletSlicer slicer;

	protected ViewBuilder builder;

	protected boolean superTypes;

	protected List<ClassView> classes;


	public ShowHierarchy() {
		super();
		superTypes = true;
	}


	@Override
	protected void doVisualisation() {
		if(classes==null) {
			classes = new ArrayList<ClassView>();
			for(Selectable sel : canvas.getSelection())
				if(sel instanceof ClassView)
					classes.add((ClassView) sel);
		}

		BasicEList<ClassDefinition> cds = new BasicEList<ClassDefinition>();

		for(ClassView cl : classes)
			cds.add(builder.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), superTypes);
		slicer.launch();
		canvas.update();
	}


	@Override
	public boolean canDo() {
		return super.canDo() && !canvas.getSelection().isEmpty() && slicer!=null && builder!=null;
	}


	public void setSlicer(final GweletSlicer slicer) {
		this.slicer = slicer;
	}


	public void setBuilder(final ViewBuilder builder) {
		this.builder = builder;
	}


	public void setSuperTypes(final boolean superTypes) {
		this.superTypes = superTypes;
	}


	@Override
	public String getUndoName() {
		return superTypes ? "Show super-classes" : "Show lower-classes";
	}
}
