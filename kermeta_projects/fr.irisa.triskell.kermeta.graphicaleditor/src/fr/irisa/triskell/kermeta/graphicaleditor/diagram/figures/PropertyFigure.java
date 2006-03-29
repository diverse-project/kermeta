package fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Locator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.topcased.modeler.figures.EdgeObjectEditableLabel;
import org.topcased.modeler.figures.EdgeObjectLabel;
import org.topcased.modeler.figures.IEdgeObjectFigure;
import org.topcased.modeler.figures.IGraphEdgeFigure;

import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyFigure extends PolylineConnectionEx implements
		IGraphEdgeFigure {

	private IEdgeObjectFigure nameEdgeObject;

	private EdgeObjectEditableLabel nameLabel;

	private EdgeObjectLabel multiplicityLabel;

	private ConnectionEndpointLocator nameLocator;

	private ConnectionEndpointLocator multiplicityLocator;

	protected Property opposite;

	/**
	 * The constructor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public PropertyFigure() {
		super();
		// the .
		multiplicityLabel = new EdgeObjectLabel(this);
		multiplicityLocator = new ConnectionEndpointLocator(this, true);
		add(multiplicityLabel, multiplicityLocator);
		// the name of the property // role
		nameLabel = new EdgeObjectEditableLabel(this);
		nameLocator = new ConnectionEndpointLocator(this, true);
		add(nameLabel, nameLocator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the object figure
	 * @generated
	 */
	public IEdgeObjectFigure getNameEdgeObjectFigure() {
		return nameEdgeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the object figure
	 * @generated NOT
	 */
	public EdgeObjectEditableLabel getNameLabel() {
		return nameLabel;
	}

	public EdgeObjectLabel getMultiplicityLabel() {
		return multiplicityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.figures.IGraphEdgeFigure#getLocator(org.topcased.modeler.figures.IEdgeObjectFigure)
	 * @generated NOT
	 */
	public Locator getLocator(IEdgeObjectFigure edgeObjectfigure) {
		if (edgeObjectfigure == nameLabel)
			return nameLocator;
		else if (edgeObjectfigure == multiplicityLabel)
			return multiplicityLocator;
		return null;
	}

}