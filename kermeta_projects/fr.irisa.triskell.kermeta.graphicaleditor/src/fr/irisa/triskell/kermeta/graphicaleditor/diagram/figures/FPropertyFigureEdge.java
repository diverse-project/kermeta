package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Locator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.topcased.modeler.figures.EdgeObjectEditableLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class FPropertyFigureEdge extends PolylineConnectionEx implements
		IGraphEdgeFigure {

	private IEdgeObjectFigure fUpperEdgeObject;

	private Locator fUpperLocator;

	private IEdgeObjectFigure fLowerTargetEdgeObject;

	private Locator fLowerTargetLocator;

	private IEdgeObjectFigure fLowerEdgeObject;

	private Locator fLowerLocator;

	private IEdgeObjectFigure fNameEdgeObject;

	private Locator fNameLocator;

	/**
	 * The constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FPropertyFigureEdge() {
		super();

		fLowerEdgeObject = new EdgeObjectEditableLabel(this);
		fLowerLocator = new ConnectionEndpointLocator(this, false);
		add(fLowerEdgeObject, fLowerLocator);
		fUpperEdgeObject = new EdgeObjectEditableLabel(this);
		fUpperLocator = new ConnectionEndpointLocator(this, false);
		add(fUpperEdgeObject, fUpperLocator);
		fNameEdgeObject = new EdgeObjectEditableLabel(this);
		fNameLocator = new ConnectionEndpointLocator(this, true);
		add(fNameEdgeObject, fNameLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IEdgeObjectFigure getfLowerEdgeObjectFigure() {
		return fLowerEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IEdgeObjectFigure getfUpperEdgeObjectFigure() {
		return fUpperEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IEdgeObjectFigure getfNameEdgeObjectFigure() {
		return fNameEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated NOT
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {

		if (edgeObjectfigure == fLowerEdgeObject) {
			return fLowerLocator;
		}
		if (edgeObjectfigure == fUpperEdgeObject) {
			return fUpperLocator;
		}
		if (edgeObjectfigure == fNameEdgeObject) {
			return fNameLocator;
		}

		return null;
	}

}