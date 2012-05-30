package org.kermeta.kompren.gwelet.ui;

import java.awt.Frame;

import javax.swing.JFrame;

import org.kermeta.kompren.diagram.instrument.Hand;
import org.kermeta.kompren.gwelet.model.Model;
import org.kermeta.kompren.gwelet.view.ClassModelBasicStrategy;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.malai.instrument.Instrument;
import org.malai.instrument.library.BasicZoomer;
import org.malai.instrument.library.Scroller;
import org.malai.ui.UI;
import org.malai.ui.UIManager;

public class GweletFrame extends UI {
	private static final long serialVersionUID = 1L;

	protected Model model;

	protected MetamodelView canvas;

	protected JFrame proxiedFrame;

	protected Scroller scroller;

	protected Hand hand;

	protected BasicZoomer zoomer;


	public GweletFrame() {
		super();

		getContentPane().add(canvas.getScrollpane());
		scroller = new Scroller(canvas);
		scroller.addEventable(canvas);
		scroller.setActivated(true);
		zoomer = new BasicZoomer(canvas);
		zoomer.addEventable(canvas);
		zoomer.setActivated(true);
		hand = new Hand(canvas);
		hand.addEventable(canvas);
		hand.setActivated(true);
		pack();
		setExtendedState(Frame.MAXIMIZED_BOTH);
		canvas.requestFocusInWindow();
		UIManager.INSTANCE.registerUI(this);
	}


	@Override
	public Instrument[] getInstruments() {
		return new Instrument[]{scroller, hand, zoomer};
	}


	@Override
	public void initialisePresentations() {
		model = new Model();
//		canvas = new ClassDiagramView(false);
		canvas = createEcoreClassDiagram();
	}



	public static MetamodelView createEcoreClassDiagram() {
		MetamodelView diag 	= new MetamodelView(true);
		ClassView eclass 		= (ClassView) diag.addEntity("EClass", -1, false);
		ClassView eObject 		= (ClassView) diag.addEntity("EObject", -1, false);
		ClassView eModelElement = (ClassView) diag.addEntity("EModelElement", -1, false);
		ClassView eAnnotation 	= (ClassView) diag.addEntity("EAnnotation", -1, false);
//		ClassView eFactory 		= (ClassView) diag.addEntity("EFactory", -1, false);
		ClassView eNamedElement = (ClassView) diag.addEntity("ENamedElement", -1, false);
		ClassView eClassifier 	= (ClassView) diag.addEntity("EClassifier", -1, false);
//		ClassView eEnumLiteral 	= (ClassView) diag.addEntity("EEnumLiteral", -1, false);
//		ClassView ePackage 		= (ClassView) diag.addEntity("EPackage", -1, false);
		ClassView eTypedElement = (ClassView) diag.addEntity("ETypedElement", -1, false);
//		ClassView eTypedParameter 	= (ClassView) diag.addEntity("ETypedParameter", -1, false);
		ClassView eDataType 		= (ClassView) diag.addEntity("EDataType", -1, false);
//		ClassView eOperation 		= (ClassView) diag.addEntity("EOperation", -1, false);
//		ClassView eParameter 		= (ClassView) diag.addEntity("EParameter", -1, false);
		ClassView eStructuralFeature = (ClassView) diag.addEntity("EStructuralFeature", -1, false);
//		ClassView eEnum 		= (ClassView) diag.addEntity("EEnum", -1, false);
		ClassView eAttribute 	= (ClassView) diag.addEntity("EAttribute", -1, false);
//		ClassView eReference 	= (ClassView) diag.addEntity("EReference", -1, false);
//		ClassView eStringToStringMapEntry 	= (ClassView) diag.addEntity("EStringToStringMapEntry", -1, false);
		ClassView eGenericType 	= (ClassView) diag.addEntity("EGenericType", -1, false);

		diag.addRelation(eclass, eclass, true, true, null, "supertypes", null, "0..*", -1);
		diag.addRelation(eAnnotation, eObject, false, true, "references", null, "0..*", null, -1);
		diag.addRelation(eAnnotation, eObject, true, true, "contents", null, "0..*", null, -1);
		diag.addRelation(eAttribute, eDataType, false, true, "eAttributeType", null, "1", null, -1);
		diag.addInheritanceView(eModelElement, eObject, -1);
		diag.addInheritanceView(eGenericType, eObject, -1);

		eObject.addOperation("eClass", "", true);
		eObject.addOperation("eIsProxy", "EBoolean", true);
		eObject.addOperation("eResource", "EResource", true);

		eAttribute.addAttribute("iD", "EBoolean");

		eModelElement.setIsAbstract(true);
		eNamedElement.setIsAbstract(true);
		eTypedElement.setIsAbstract(true);
		eClassifier.setIsAbstract(true);
		eStructuralFeature.setIsAbstract(true);

		eclass.update();
		eObject.update();
		eAnnotation.update();
		eAttribute.update();
		eDataType.update();

		diag.setLayoutStrategy(new ClassModelBasicStrategy(diag));
		diag.updateLayout();
		diag.updatePreferredSize();

		return diag;
	}

}
