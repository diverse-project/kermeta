package org.kermeta.kompren.gwelet.ui;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import org.kermeta.kompren.diagram.instrument.Hand;
import org.kermeta.kompren.gwelet.instruments.ViewReiniter;
import org.kermeta.kompren.gwelet.instruments.Visualiser;
import org.kermeta.kompren.gwelet.instruments.VisualiserManager;
import org.kermeta.kompren.gwelet.mapping.Selection2VisualiserMapping;
import org.kermeta.kompren.gwelet.model.Model;
import org.kermeta.kompren.gwelet.view.ClassModelBasicStrategy;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.kermeta.kompren.gwelet.view.ViewBuilder;
import org.malai.instrument.Instrument;
import org.malai.instrument.library.BasicZoomer;
import org.malai.instrument.library.Scroller;
import org.malai.instrument.library.UndoRedoManager;
import org.malai.mapping.MappingRegistry;
import org.malai.presentation.Presentation;
import org.malai.ui.UI;
import org.malai.ui.UIManager;
import org.malai.widget.MLayeredPane;

public class GweletFrame extends UI {
	private static final long serialVersionUID = 1L;

	protected JFrame proxiedFrame;

	protected Scroller scroller;

	protected Hand hand;

	protected BasicZoomer zoomer;

	protected VisualiserManager visualiserManager;

	protected Visualiser visualiser;

	protected ViewBuilder viewBuilder;

	protected ViewReiniter reiniter;

	protected UndoRedoManager undoredoer;


	/** The layered panel used to display widgets upon shapes (e.g. text setters). */
	protected MLayeredPane layeredPanel;


	public GweletFrame() {
		super();

		MetamodelView canvas = getCanvas();
		layeredPanel = new MLayeredPane(false, false);
		layeredPanel.add(canvas.getScrollpane(), JLayeredPane.DEFAULT_LAYER);
		layeredPanel.addComponentsToResize(canvas.getScrollpane());

		composer = new GweletUIBuilder(this);
		canvas.setLayoutStrategy(new ClassModelBasicStrategy(canvas));
		viewBuilder = new ViewBuilder(getPresentation(Model.class, MetamodelView.class));
		undoredoer = new UndoRedoManager(composer);
		scroller = new Scroller(canvas);
		zoomer = new BasicZoomer(canvas);
		hand = new Hand(canvas);
		visualiserManager = new VisualiserManager(composer, layeredPanel, canvas);
		visualiser = new Visualiser(composer);
		reiniter = new ViewReiniter(canvas, composer);

		MappingRegistry.REGISTRY.addMapping(new Selection2VisualiserMapping(canvas.getSelection(), visualiser));

		UIManager.INSTANCE.registerUI(this);
	}


	@Override
	public Instrument[] getInstruments() {
		return new Instrument[]{scroller, hand, zoomer, visualiserManager, visualiser, undoredoer, reiniter};
	}


	public MetamodelView getCanvas() {
		return getPresentation(Model.class, MetamodelView.class).getConcretePresentation();
	}


	public Model getModel() {
		return getPresentation(Model.class, MetamodelView.class).getAbstractPresentation();
	}


	@Override
	public void initialisePresentations() {
		Model model  = new Model();
		MetamodelView canvas = new MetamodelView(true);

		presentations.add(new Presentation<Model, MetamodelView>(model, canvas));

//		canvas = createEcoreClassDiagram();
	}


//	public static MetamodelView createEcoreClassDiagram() {
//		MetamodelView diag 	= new MetamodelView(true);
//		ClassView eclass 		= (ClassView) diag.addEntity("EClass", -1, false);
//		ClassView eObject 		= (ClassView) diag.addEntity("EObject", -1, false);
//		ClassView eModelElement = (ClassView) diag.addEntity("EModelElement", -1, false);
//		ClassView eAnnotation 	= (ClassView) diag.addEntity("EAnnotation", -1, false);
////		ClassView eFactory 		= (ClassView) diag.addEntity("EFactory", -1, false);
//		ClassView eNamedElement = (ClassView) diag.addEntity("ENamedElement", -1, false);
//		ClassView eClassifier 	= (ClassView) diag.addEntity("EClassifier", -1, false);
////		ClassView eEnumLiteral 	= (ClassView) diag.addEntity("EEnumLiteral", -1, false);
////		ClassView ePackage 		= (ClassView) diag.addEntity("EPackage", -1, false);
//		ClassView eTypedElement = (ClassView) diag.addEntity("ETypedElement", -1, false);
////		ClassView eTypedParameter 	= (ClassView) diag.addEntity("ETypedParameter", -1, false);
//		ClassView eDataType 		= (ClassView) diag.addEntity("EDataType", -1, false);
////		ClassView eOperation 		= (ClassView) diag.addEntity("EOperation", -1, false);
////		ClassView eParameter 		= (ClassView) diag.addEntity("EParameter", -1, false);
//		ClassView eStructuralFeature = (ClassView) diag.addEntity("EStructuralFeature", -1, false);
////		ClassView eEnum 		= (ClassView) diag.addEntity("EEnum", -1, false);
//		ClassView eAttribute 	= (ClassView) diag.addEntity("EAttribute", -1, false);
////		ClassView eReference 	= (ClassView) diag.addEntity("EReference", -1, false);
////		ClassView eStringToStringMapEntry 	= (ClassView) diag.addEntity("EStringToStringMapEntry", -1, false);
//		ClassView eGenericType 	= (ClassView) diag.addEntity("EGenericType", -1, false);
//
//		diag.addRelation(eclass, eclass, true, true, null, "supertypes", null, "0..*");
//		diag.addRelation(eAnnotation, eObject, false, true, "references", null, "0..*", null);
//		diag.addRelation(eAnnotation, eObject, true, true, "contents", null, "0..*", null);
//		diag.addRelation(eAttribute, eDataType, false, true, "eAttributeType", null, "1", null);
//		diag.addInheritanceView(eModelElement, eObject);
//		diag.addInheritanceView(eGenericType, eObject);
//
//		eObject.addOperation("eClass", "", true);
//		eObject.addOperation("eIsProxy", "EBoolean", true);
//		eObject.addOperation("eResource", "EResource", true);
//
//		eAttribute.addAttribute("iD", "EBoolean");
//
//		eModelElement.setIsAbstract(true);
//		eNamedElement.setIsAbstract(true);
//		eTypedElement.setIsAbstract(true);
//		eClassifier.setIsAbstract(true);
//		eStructuralFeature.setIsAbstract(true);
//
//		eclass.update();
//		eObject.update();
//		eAnnotation.update();
//		eAttribute.update();
//		eDataType.update();
//
//		diag.setLayoutStrategy(new ClassModelBasicStrategy(diag));
//		diag.updateLayout();
//		diag.updatePreferredSize();
//
//		return diag;
//	}


	public ViewBuilder getViewBuilder() {
		return viewBuilder;
	}


	public MLayeredPane getLayeredPanel() {
		return layeredPanel;
	}
}
