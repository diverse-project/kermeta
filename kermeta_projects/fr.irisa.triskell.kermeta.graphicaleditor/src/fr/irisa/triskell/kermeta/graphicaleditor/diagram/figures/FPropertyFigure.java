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
 * @generated
 */
public class FPropertyFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure {

	private IEdgeObjectFigure fNameEdgeObject;

	private Locator fNameLocator;

	/**
	 * The constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPropertyFigure() {
		super();

		fNameEdgeObject = new EdgeObjectEditableLabel(this);
		fNameLocator = new ConnectionEndpointLocator(this, true);
		add(fNameEdgeObject, fNameLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEdgeObjectFigure getfNameEdgeObjectFigure() {
		return fNameEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {

		if (edgeObjectfigure == fNameEdgeObject) {
			return fNameLocator;
		}

		return null;
	}

}